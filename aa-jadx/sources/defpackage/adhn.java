package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adhn implements defpackage.adhm {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.adfw.b;
        int i = 2;
        a = rkqVar.v("45800021", new defpackage.adhj(i), "EOgHGAQ");
        b = rkqVar.u("45800022", false);
        c = rkqVar.u("45776518", true);
        d = rkqVar.v("10", new defpackage.adhj(i), "EOgHGAQ");
    }

    @Override // defpackage.adhm
    public final defpackage.ajgy a(android.content.Context context) {
        return (defpackage.ajgy) a.fG(context);
    }

    @Override // defpackage.adhm
    public final defpackage.ajgy b(android.content.Context context) {
        return (defpackage.ajgy) d.fG(context);
    }

    @Override // defpackage.adhm
    public final boolean c(android.content.Context context) {
        return ((java.lang.Boolean) c.fG(context)).booleanValue();
    }
}
