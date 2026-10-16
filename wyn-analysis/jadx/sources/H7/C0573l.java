package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0573l extends zbuf implements zbvn {
    private static final C0573l zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbg = 2;
    private zbun zbf = zbuf.zby();

    static {
        C0573l c0573l = new C0573l();
        zbb = c0573l;
        zbuf.zbD(C0573l.class, c0573l);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zbe", "zbd", "zbf", zbadm.class});
        }
        if (i10 == 3) {
            return new C0573l();
        }
        if (i10 == 4) {
            return new C0564c(zbb);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
