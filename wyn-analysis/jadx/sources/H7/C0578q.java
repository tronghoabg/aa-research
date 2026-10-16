package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0578q extends zbuf implements zbvn {
    private static final C0578q zbb;
    private int zbd;
    private int zbe;
    private zbdg zbf;
    private g0 zbg;

    static {
        C0578q c0578q = new C0578q();
        zbb = c0578q;
        zbuf.zbD(C0578q.class, c0578q);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", C0562a.f4971c, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new C0578q();
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
