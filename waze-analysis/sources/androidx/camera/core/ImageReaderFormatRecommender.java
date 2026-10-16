package androidx.camera.core;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ImageReaderFormatRecommender {

    /* compiled from: WazeSource */
    abstract class FormatCombo {
        FormatCombo() {
        }

        static FormatCombo create(int i2, int i3) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i2, i3);
        }

        abstract int imageAnalysisFormat();

        abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
    }

    static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }
}
