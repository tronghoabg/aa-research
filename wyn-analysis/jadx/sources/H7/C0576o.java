package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbee;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbeh;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbek;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0576o extends zbuf implements zbvn {
    private static final C0576o zbb;
    private int zbd;
    private zbee zbe;
    private zbek zbf;
    private zbeh zbg;

    static {
        C0576o c0576o = new C0576o();
        zbb = c0576o;
        zbuf.zbD(C0576o.class, c0576o);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new C0576o();
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
