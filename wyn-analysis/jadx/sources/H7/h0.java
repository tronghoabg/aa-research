package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class h0 extends zbuf implements zbvn {
    private static final h0 zbb;
    private int zbd;
    private zbaiv zbe;
    private String zbf = "";
    private boolean zbg;
    private T zbh;

    static {
        h0 h0Var = new h0();
        zbb = h0Var;
        zbuf.zbD(h0.class, h0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new h0();
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
