package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
public final class zbaai extends zbuf implements zbvn {
    private static final zbaai zbb;
    private int zbd;
    private zbpb zbf;
    private byte zbg = 2;
    private zbun zbe = zbuf.zby();

    static {
        zbaai zbaaiVar = new zbaai();
        zbb = zbaaiVar;
        zbuf.zbD(zbaai.class, zbaaiVar);
    }

    private zbaai() {
    }

    public static zbaai zbf() {
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i10 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zbd", "zbe", zbaag.class, "zbf"});
        }
        if (i10 == 3) {
            return new zbaai();
        }
        zbaad zbaadVar = null;
        if (i10 == 4) {
            return new zbaah(zbaadVar);
        }
        if (i10 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zbpb zbc() {
        zbpb zbpbVar = this.zbf;
        return zbpbVar == null ? zbpb.zbh() : zbpbVar;
    }
}
