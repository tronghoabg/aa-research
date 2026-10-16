package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0563b extends zbuf implements zbvn {
    private static final C0563b zbb;
    private int zbd;
    private int zbf;
    private zbun zbe = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        C0563b c0563b = new C0563b();
        zbb = c0563b;
        zbuf.zbD(C0563b.class, c0563b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001a", new Object[]{"zbd", "zbe", zbix.class, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new C0563b();
        }
        if (i10 == 4) {
            return new Q(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
