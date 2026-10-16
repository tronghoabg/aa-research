package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: H7.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0581u extends zbuf implements zbvn {
    private static final C0581u zbb;
    private int zbd;
    private Object zbf;
    private K zbg;
    private boolean zbh;
    private c0 zbi;
    private b0 zbj;
    private F zbk;
    private int zbl;
    private int zbe = 0;
    private byte zbm = 2;

    static {
        C0581u c0581u = new C0581u();
        zbb = c0581u;
        zbuf.zbD(C0581u.class, c0581u);
    }

    public static C0580t b() {
        return (C0580t) zbb.zbq();
    }

    public static /* synthetic */ void c(C0581u c0581u, b0 b0Var) {
        b0Var.getClass();
        c0581u.zbj = b0Var;
        c0581u.zbd |= 8;
    }

    public static /* synthetic */ void d(C0581u c0581u, K k) {
        k.getClass();
        c0581u.zbg = k;
        c0581u.zbd |= 1;
    }

    public final int a() {
        return this.zbl;
    }

    public final boolean e() {
        if (this.zbe == 6) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    public final boolean f() {
        if (this.zbe == 5) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbm);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
        }
        if (i10 == 3) {
            return new C0581u();
        }
        if (i10 == 4) {
            return new C0580t(zbb);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final boolean zbi() {
        return (this.zbd & 32) != 0;
    }
}
