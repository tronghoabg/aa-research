package defpackage;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class tlg implements defpackage.tfn, defpackage.affv {
    public static final defpackage.tlg a = new defpackage.tlg();

    @Override // defpackage.tfn
    public final /* synthetic */ java.lang.Object b(android.content.Context context) {
        return new defpackage.tlj(context);
    }

    @Override // defpackage.affv
    public final defpackage.afan ed() {
        return new defpackage.affy(1, defpackage.tlj.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.tfn) && (obj instanceof defpackage.affv)) {
            return defpackage.afga.f(new defpackage.affy(1, defpackage.tlj.class, "<init>", "<init>(Landroid/content/Context;)V", 0), ((defpackage.affv) obj).ed());
        }
        return false;
    }

    public final int hashCode() {
        return new defpackage.affy(1, defpackage.tlj.class, "<init>", "<init>(Landroid/content/Context;)V", 0).hashCode();
    }
}
