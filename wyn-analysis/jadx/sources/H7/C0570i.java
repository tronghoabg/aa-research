package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0570i extends zbuf implements zbvn {
    private static final C0570i zbb;
    private int zbd;
    private float zbe;
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        C0570i c0570i = new C0570i();
        zbb = c0570i;
        zbuf.zbD(C0570i.class, c0570i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i10 == 3) {
            return new C0570i();
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
