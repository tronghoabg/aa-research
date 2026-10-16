package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbqm extends zbuf implements zbvn {
    private static final zbqm zbb;
    private int zbd;
    private zbtc zbe;
    private zbtc zbf;
    private zbtc zbg;
    private zbpw zbh;
    private String zbi;
    private byte zbj = 2;

    static {
        zbqm zbqmVar = new zbqm();
        zbb = zbqmVar;
        zbuf.zbD(zbqm.class, zbqmVar);
    }

    private zbqm() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbe = zbtcVar;
        this.zbf = zbtcVar;
        this.zbg = zbtcVar;
        this.zbi = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i10 == 3) {
            return new zbqm();
        }
        zbpu zbpuVar = null;
        if (i10 == 4) {
            return new zbql(zbpuVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
