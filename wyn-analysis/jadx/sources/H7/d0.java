package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class d0 extends zbuf implements zbvn {
    private static final d0 zbb;
    private int zbd;
    private V zbe;

    static {
        d0 d0Var = new d0();
        zbb = d0Var;
        zbuf.zbD(d0.class, d0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i10 == 3) {
            return new d0();
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
