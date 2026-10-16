package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0565d extends zbuf implements zbvn {
    private static final C0565d zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        C0565d c0565d = new C0565d();
        zbb = c0565d;
        zbuf.zbD(C0565d.class, c0565d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", C0567f.class, "zbf"});
        }
        if (i10 == 3) {
            return new C0565d();
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
