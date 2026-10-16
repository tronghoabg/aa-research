package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageProcessor {

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputFormats {
    }

    /* compiled from: WazeSource */
    public interface Request {
        ImageProxy getInputImage();

        int getOutputFormat();
    }

    /* compiled from: WazeSource */
    public interface Response {
        ImageProxy getOutputImage();
    }

    Response process(Request request);
}
