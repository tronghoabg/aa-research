package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class C extends zbuf implements zbvn {
    private static final C zbb;
    private int zbd;
    private int zbe;
    private int zbf = 2;
    private String zbg = "";

    static {
        C c10 = new C();
        zbb = c10;
        zbuf.zbD(C.class, c10);
    }

    public static B a() {
        return (B) zbb.zbq();
    }

    public static /* synthetic */ void b(C c10, int i5) {
        c10.zbe = i5 - 1;
        c10.zbd |= 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", C0562a.f4973e, "zbf", "zbg"});
        }
        if (i10 == 3) {
            return new C();
        }
        if (i10 == 4) {
            return new B(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
