package androidx.media3.extractor.ts;

import com.google.d.b.an;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i2, int i3) {
        this.targetType = i2;
        byte[] bArr = new byte[i3 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i2, int i3) {
        if (this.isFilling) {
            int i4 = i3 - i2;
            byte[] bArrCopyOf = this.nalData;
            int length = bArrCopyOf.length;
            int i5 = this.nalLength + i4;
            if (length < i5) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5 + i5);
                this.nalData = bArrCopyOf;
            }
            System.arraycopy(bArr, i2, bArrCopyOf, this.nalLength, i4);
            this.nalLength += i4;
        }
    }

    public boolean endNalUnit(int i2) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i2;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i2) {
        an.u(!this.isFilling);
        boolean z = i2 == this.targetType;
        this.isFilling = z;
        if (z) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
