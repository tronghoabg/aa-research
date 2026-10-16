package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class g0 extends zbuf implements zbvn {
    private static final g0 zbb;
    private int zbd;
    private zbaiv zbe;
    private int zbg;
    private String zbf = "";
    private int zbh = 93;

    static {
        g0 g0Var = new g0();
        zbb = g0Var;
        zbuf.zbD(g0.class, g0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new g0();
        }
        if (i10 == 4) {
            return new Q(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
