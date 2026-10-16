package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0582v extends zbuf implements zbvn {
    private static final C0582v zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        C0582v c0582v = new C0582v();
        zbb = c0582v;
        zbuf.zbD(C0582v.class, c0582v);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i10 == 3) {
            return new C0582v();
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
