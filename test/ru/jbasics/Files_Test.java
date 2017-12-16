package ru.jbasics;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;

import static org.junit.Assert.*;

/**
 * Created by Влад on 16.12.2017.
 */
public class Files_Test {

    private IO.Files_ files;
    private File directoryToDelete;

    @Before
    public void setup() {
        files = (new IO()).new Files_();
    }

    public boolean testCreateDirectory(String directory) throws Exception {
        boolean result = files.createDirectory(directory);
        directoryToDelete = new File(directory);
        directoryToDelete.delete();
        return result;
    }

    @Test
    public void testCreateDirectoryNull() throws Exception {
        assertFalse(files.createDirectory((String)null));
    }

    @Test
    public void testCreateDirectoryNumbered() throws Exception {
        String directory = Integer.toString((int)(Math.random() * 1000000));
        assertTrue(testCreateDirectory(directory));
    }

    @Test
    public void testCreateDirectoryRoot() throws Exception {
        assertFalse(testCreateDirectory("C:"));
    }

    @Test
    public void testCreateDirectoryRootPath() throws Exception {
        assertTrue(testCreateDirectory("C:/1"));
    }

    @Test
    public void testCreateDirectoryRelativePath() throws Exception {
        assertTrue(testCreateDirectory("newFolder"));
    }

    @Test
    public void testCreateDirectoryRelativePathWithSlash() throws Exception {
        assertTrue(testCreateDirectory("/newFolder"));
    }

    @Test
    public void testCreateDirectoryRelativePathWith2Slashes() throws Exception {
        assertFalse(testCreateDirectory("//newFolder"));
    }

    @Test
    public void testCreateDirectoryRelativePathWith2Folders() throws Exception {
        // To create a folder with subfolders, one has to use a mkdirs().
        assertFalse(testCreateDirectory("/newFolder/folder2"));
    }
}