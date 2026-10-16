package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbgo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class H extends zbuf implements zbvn {
    private static final H zbb;
    private int zbd;
    private zbgo zbe;
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        H h10 = new H();
        zbb = h10;
        zbuf.zbD(H.class, h10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", zbjg.class, "zbg", zbcw.class});
        }
        if (i10 == 3) {
            return new H();
        }
        if (i10 == 4) {
            return new C0564c(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
