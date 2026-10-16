package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0586z extends zbuf implements zbvn {
    private static final C0586z zbb;
    private zbun zbd = zbuf.zby();

    static {
        C0586z c0586z = new C0586z();
        zbb = c0586z;
        zbuf.zbD(C0586z.class, c0586z);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C0585y.class});
        }
        if (i10 == 3) {
            return new C0586z();
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
