package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ysf implements defpackage.yry {
    public final java.lang.String a;
    public final boolean b;
    public final java.util.logging.Level c;
    public final java.util.Set d;
    public final defpackage.yrf e;
    public final int f = 2;

    public ysf(java.lang.String str, boolean z, int i, java.util.logging.Level level, java.util.Set set, defpackage.yrf yrfVar) {
        this.a = str;
        this.b = z;
        this.c = level;
        this.d = set;
        this.e = yrfVar;
    }

    @Override // defpackage.yry
    public final defpackage.yqu a(java.lang.String str) {
        return new defpackage.ysh(this.a, str, this.b, 2, this.c, this.d, this.e);
    }
}
