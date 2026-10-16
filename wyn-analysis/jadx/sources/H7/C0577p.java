package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0577p extends zbuf implements zbvn {
    private static final C0577p zbb;
    private int zbd;
    private zblm zbe;
    private zbnw zbf;
    private boolean zbg;
    private byte zbi = 2;
    private String zbh = "";

    static {
        C0577p c0577p = new C0577p();
        zbb = c0577p;
        zbuf.zbD(C0577p.class, c0577p);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new C0577p();
        }
        if (i10 == 4) {
            return new C0564c(zbb);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
