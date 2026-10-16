package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class b0 extends zbuf implements zbvn {
    private static final b0 zbb;
    private int zbd;
    private int zbe = 1;
    private boolean zbf;

    static {
        b0 b0Var = new b0();
        zbb = b0Var;
        zbuf.zbD(b0.class, b0Var);
    }

    public static a0 a() {
        return (a0) zbb.zbq();
    }

    public static /* synthetic */ void b(b0 b0Var) {
        b0Var.zbe = 1;
        b0Var.zbd = 1 | b0Var.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", C0562a.f4978j, "zbf"});
        }
        if (i10 == 3) {
            return new b0();
        }
        if (i10 == 4) {
            return new a0(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }
}
