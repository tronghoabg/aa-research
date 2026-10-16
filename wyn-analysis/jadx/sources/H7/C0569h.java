package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0569h extends zbuf implements zbvn {
    private static final C0569h zbb;
    private int zbd;
    private String zbe = "";
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();
    private long zbh;

    static {
        C0569h c0569h = new C0569h();
        zbb = c0569h;
        zbuf.zbD(C0569h.class, c0569h);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg", C0570i.class, "zbh"});
        }
        if (i10 == 3) {
            return new C0569h();
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
