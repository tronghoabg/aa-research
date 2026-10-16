package k2;

import java.io.IOException;

/* renamed from: k2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3150g extends IOException {
    public C3150g(int i5) {
        this(i5, -9223372036854775807L, -9223372036854775807L);
    }

    public C3150g(int i5, long j8, long j10) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i5 != 0) {
            if (i5 == 1) {
                str = "not seekable to start";
            } else if (i5 != 2) {
                str = "unknown";
            } else {
                Q1.k.g((j8 == -9223372036854775807L || j10 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j8 + ", End time: " + j10;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
