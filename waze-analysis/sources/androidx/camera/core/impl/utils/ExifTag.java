package androidx.camera.core.impl.utils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    ExifTag(String str, int i2, int i3) {
        this.name = str;
        this.number = i2;
        this.primaryFormat = i3;
        this.secondaryFormat = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0027 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean isFormatCompatible(int r4) {
        /*
            r3 = this;
            int r0 = r3.primaryFormat
            r1 = 1
            r2 = 7
            if (r0 == r2) goto L30
            if (r4 != r2) goto L9
            goto L30
        L9:
            if (r0 == r4) goto L30
            int r3 = r3.secondaryFormat
            if (r3 != r4) goto L10
            goto L30
        L10:
            r2 = 4
            if (r0 == r2) goto L16
            if (r3 != r2) goto L19
            r3 = r2
        L16:
            r2 = 3
            if (r4 == r2) goto L30
        L19:
            r2 = 9
            if (r0 == r2) goto L1f
            if (r3 != r2) goto L23
        L1f:
            r2 = 8
            if (r4 == r2) goto L30
        L23:
            r2 = 12
            if (r0 == r2) goto L29
            if (r3 != r2) goto L2e
        L29:
            r3 = 11
            if (r4 != r3) goto L2e
            return r1
        L2e:
            r3 = 0
            return r3
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifTag.isFormatCompatible(int):boolean");
    }

    ExifTag(String str, int i2, int i3, int i4) {
        this.name = str;
        this.number = i2;
        this.primaryFormat = i3;
        this.secondaryFormat = i4;
    }
}
