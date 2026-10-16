package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adib implements defpackage.xzi {
    private static final defpackage.adib a = new defpackage.adib();
    private final defpackage.xzi b = new defpackage.xzl(new defpackage.adid());

    public static boolean c(android.content.Context context) {
        return a.fF().a(context);
    }

    public static boolean d(android.content.Context context) {
        return a.fF().b(context);
    }

    @Override // defpackage.xzi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.adic fF() {
        return (defpackage.adic) ((defpackage.xzl) this.b).a;
    }
}
