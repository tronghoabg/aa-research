package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yta extends defpackage.ytb {
    private final defpackage.ysz c;

    public yta(defpackage.yqq yqqVar, int i, defpackage.ysz yszVar) {
        super(yqqVar, i);
        this.c = yszVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        yqqVar.f(sb);
        sb.append(true != yqqVar.d() ? 't' : 'T');
        sb.append(yszVar.G);
    }

    @Override // defpackage.ytb
    public final void a(defpackage.ytf ytfVar, java.lang.Object obj) {
        defpackage.ysz yszVar = this.c;
        if (!(obj instanceof java.util.Date) && !(obj instanceof java.util.Calendar) && !(obj instanceof java.lang.Long)) {
            defpackage.ytf.c(ytfVar.d, obj, "%t" + yszVar.G);
            return;
        }
        defpackage.yqq yqqVar = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        yqqVar.f(sb);
        sb.append(true != yqqVar.d() ? 't' : 'T');
        sb.append(yszVar.G);
        ytfVar.d.append(java.lang.String.format(defpackage.yqw.a, sb.toString(), obj));
    }
}
