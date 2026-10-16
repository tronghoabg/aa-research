package androidx.media3.exoplayer;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j2, long j3) {
        an.l(j2 >= 0);
        an.l(j3 >= 0);
        this.toleranceBeforeUs = j2;
        this.toleranceAfterUs = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long resolveSeekPositionUs(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.toleranceBeforeUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            long r0 = r10.toleranceAfterUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            r6 = r2
            goto L12
        L10:
            return r11
        L11:
            r6 = r0
        L12:
            r8 = -9223372036854775808
            r4 = r11
            long r0 = androidx.media3.common.util.Util.subtractWithOverflowDefault(r4, r6, r8)
            long r4 = r10.toleranceAfterUs
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = r11
            long r4 = androidx.media3.common.util.Util.addWithOverflowDefault(r2, r4, r6)
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r10 > 0) goto L31
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 > 0) goto L31
            r10 = r2
            goto L32
        L31:
            r10 = r3
        L32:
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 > 0) goto L3b
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 > 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            if (r10 == 0) goto L51
            if (r2 == 0) goto L51
            long r0 = r13 - r11
            long r11 = r15 - r11
            long r0 = java.lang.Math.abs(r0)
            long r10 = java.lang.Math.abs(r11)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 > 0) goto L56
            goto L53
        L51:
            if (r10 == 0) goto L54
        L53:
            return r13
        L54:
            if (r2 == 0) goto L57
        L56:
            return r15
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.SeekParameters.resolveSeekPositionUs(long, long, long):long");
    }
}
