package androidx.camera.core.imagecapture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Exif;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FileUtil {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TAG = "FileUtil";
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";

    private FileUtil() {
    }

    private static Uri copyFileToFile(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: ".concat(String.valueOf(file2.getAbsolutePath())), null);
    }

    private static Uri copyFileToMediaStore(File file, ImageCapture.OutputFileOptions outputFileOptions) throws Throwable {
        Uri uriInsert;
        ContentResolver contentResolver = (ContentResolver) Objects.requireNonNull(outputFileOptions.getContentResolver());
        ContentValues contentValues = outputFileOptions.getContentValues() != null ? new ContentValues(outputFileOptions.getContentValues()) : new ContentValues();
        setContentValuePendingFlag(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Logger.d(TAG, "copyFileToMediaStore: inserting values to MediaStore");
                uriInsert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        try {
            Logger.d(TAG, "copyFileToMediaStore: insert success");
            if (uriInsert == null) {
                throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
            }
            copyTempFileToUri(file, uriInsert, contentResolver);
            updateUriPendingStatus(uriInsert, contentResolver, 0);
            return uriInsert;
        } catch (IOException e4) {
            e = e4;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e5) {
            e = e5;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = uriInsert;
            if (uri != null) {
                updateUriPendingStatus(uri, contentResolver, 0);
            }
            throw th;
        }
    }

    private static void copyFileToOutputStream(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void copyTempFileToUri(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                copyFileToOutputStream(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static File createTempFile(ImageCapture.OutputFileOptions outputFileOptions) {
        File file;
        try {
            File file2 = outputFileOptions.getFile();
            if (file2 == null) {
                String property = System.getProperty("java.io.tmpdir");
                if (property != null) {
                    file = new File(property);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                return File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX, file);
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            return new File(parentFile, TEMP_FILE_PREFIX + UUID.randomUUID().toString() + getFileExtensionWithDot(file2));
        } catch (IOException e2) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e2);
        }
    }

    private static String getFileExtensionWithDot(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    private static boolean isSaveToFile(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getFile() != null;
    }

    private static boolean isSaveToMediaStore(ImageCapture.OutputFileOptions outputFileOptions) {
        return (outputFileOptions.getSaveCollection() == null || outputFileOptions.getContentResolver() == null || outputFileOptions.getContentValues() == null) ? false : true;
    }

    private static boolean isSaveToOutputStream(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getOutputStream() != null;
    }

    static Uri moveFileToTarget(File file, ImageCapture.OutputFileOptions outputFileOptions) {
        Uri uriCopyFileToFile = null;
        try {
            try {
                if (isSaveToMediaStore(outputFileOptions)) {
                    uriCopyFileToFile = copyFileToMediaStore(file, outputFileOptions);
                } else if (isSaveToOutputStream(outputFileOptions)) {
                    copyFileToOutputStream(file, (OutputStream) Objects.requireNonNull(outputFileOptions.getOutputStream()));
                } else if (isSaveToFile(outputFileOptions)) {
                    uriCopyFileToFile = copyFileToFile(file, (File) Objects.requireNonNull(outputFileOptions.getFile()));
                }
                return uriCopyFileToFile;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    private static void setContentValuePendingFlag(ContentValues contentValues, int i2) {
        contentValues.put("is_pending", Integer.valueOf(i2));
    }

    static void updateFileExif(File file, Exif exif, ImageCapture.OutputFileOptions outputFileOptions, int i2) {
        try {
            Exif exifCreateFromFile = Exif.createFromFile(file);
            exif.copyToCroppedImage(exifCreateFromFile);
            if (exifCreateFromFile.getRotation() == 0 && i2 != 0) {
                exifCreateFromFile.rotate(i2);
            }
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                exifCreateFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                exifCreateFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                exifCreateFromFile.attachLocation(metadata.getLocation());
            }
            exifCreateFromFile.save();
        } catch (IOException e2) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e2);
        }
    }

    private static void updateUriPendingStatus(Uri uri, ContentResolver contentResolver, int i2) {
        ContentValues contentValues = new ContentValues();
        setContentValuePendingFlag(contentValues, i2);
        contentResolver.update(uri, contentValues, null, null);
    }
}
