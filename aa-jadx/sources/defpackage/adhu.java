package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adhu implements defpackage.adht {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.t("7", "SURVEYS");
        b = rkqVar.u("9", false);
        c = rkqVar.u("6", true);
    }

    @Override // defpackage.adht
    public final java.lang.String a(android.content.Context context) {
        return (java.lang.String) a.fG(context);
    }

    @Override // defpackage.adht
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }

    @Override // defpackage.adht
    public final boolean c(android.content.Context context) {
        return ((java.lang.Boolean) c.fG(context)).booleanValue();
    }
}
