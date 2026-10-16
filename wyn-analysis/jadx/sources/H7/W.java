package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
import java.util.List;

/* loaded from: classes4.dex */
public final class W extends zbuf implements zbvn {
    private static final W zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private zbun zbg = zbuf.zby();

    static {
        W w2 = new W();
        zbb = w2;
        zbuf.zbD(W.class, w2);
    }

    public static W b(byte[] bArr, zbtp zbtpVar) {
        return (W) zbuf.zbu(zbb, bArr, zbtpVar);
    }

    public final int a() {
        return this.zbe;
    }

    public final String c() {
        return this.zbf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", C0565d.class});
        }
        if (i10 == 3) {
            return new W();
        }
        if (i10 == 4) {
            return new Q(zbb);
        }
        if (i10 != 5) {
            return null;
        }
        return zbb;
    }

    public final List zbf() {
        return this.zbg;
    }
}
