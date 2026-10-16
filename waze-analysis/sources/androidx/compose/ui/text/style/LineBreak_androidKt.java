package androidx.compose.ui.text.style;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i2, int i3, int i4) {
        return i2 | (i3 << 8) | (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i2) {
        return i2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i2) {
        return (i2 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i2) {
        return (i2 >> 16) & 255;
    }
}
