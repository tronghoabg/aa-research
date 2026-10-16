package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbail;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class e0 extends zbuf implements zbvn {
    private static final e0 zbb;
    private int zbd;
    private int zbe = 0;
    private Object zbf;
    private zbix zbg;

    static {
        e0 e0Var = new e0();
        zbb = e0Var;
        zbuf.zbD(e0.class, e0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", zbbq.class, zbail.class});
        }
        if (i10 == 3) {
            return new e0();
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
