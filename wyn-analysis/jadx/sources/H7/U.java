package H7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbja;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes4.dex */
public final class U extends zbuf implements zbvn {
    private static final U zbb;
    private int zbd;
    private int zbe;
    private zbafq zbf;
    private zbja zbg;
    private zbdy zbh;
    private h0 zbi;
    private byte zbj = 2;

    static {
        U u10 = new U();
        zbb = u10;
        zbuf.zbD(U.class, u10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbd", "zbg", "zbh", "zbe", C0562a.f4977i, "zbi", "zbf"});
        }
        if (i10 == 3) {
            return new U();
        }
        if (i10 == 4) {
            return new Q(zbb);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
