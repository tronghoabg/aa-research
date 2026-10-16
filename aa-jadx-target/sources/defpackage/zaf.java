package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zaf extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zaf a;
    public int b;
    public java.lang.String c = "";
    public int d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;

    static {
        defpackage.zaf zafVar = new defpackage.zaf();
        a = zafVar;
        defpackage.abox.P(defpackage.zaf.class, zafVar);
    }

    private zaf() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new java.lang.Object[]{"b", "c", "d", defpackage.yxq.h, "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.zaf();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.zaf.class);
    }
}
