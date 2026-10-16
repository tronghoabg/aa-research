package androidx.camera.core.imagecapture;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Operation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class DngImage2Disk implements Operation<In, ImageCapture.OutputFileResults> {
    private DngCreator mDngCreator;

    /* compiled from: WazeSource */
    abstract class In {
        In() {
        }

        static In of(ImageProxy imageProxy, int i2, ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_DngImage2Disk_In(imageProxy, i2, outputFileOptions);
        }

        abstract ImageProxy getImageProxy();

        abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        abstract int getRotationDegrees();
    }

    public DngImage2Disk(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    static int computeExifOrientation(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 90) {
            return 6;
        }
        if (i2 != 180) {
            return i2 != 270 ? 0 : 8;
        }
        return 3;
    }

    private void writeImageToFile(File file, ImageProxy imageProxy, int i2) {
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        this.mDngCreator.setOrientation(computeExifOrientation(i2));
                        this.mDngCreator.writeImage(fileOutputStream, imageProxy.getImage());
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new ImageCaptureException(1, "Failed to write to temp file", e2);
                }
            } catch (IllegalArgumentException e3) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e3);
            } catch (IllegalStateException e4) {
                throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e4);
            }
        } finally {
            imageProxy.close();
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public ImageCapture.OutputFileResults apply(In in) {
        ImageCapture.OutputFileOptions outputFileOptions = in.getOutputFileOptions();
        File fileCreateTempFile = FileUtil.createTempFile(outputFileOptions);
        writeImageToFile(fileCreateTempFile, in.getImageProxy(), in.getRotationDegrees());
        return new ImageCapture.OutputFileResults(FileUtil.moveFileToTarget(fileCreateTempFile, outputFileOptions), 32);
    }

    DngImage2Disk(DngCreator dngCreator) {
        this.mDngCreator = dngCreator;
    }
}
