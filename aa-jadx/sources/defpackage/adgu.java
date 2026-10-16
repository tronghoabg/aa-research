package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adgu implements defpackage.adgt {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adfw.b;
        a = rkqVar.u("45359255", false);
        b = rkqVar.u("36", true);
    }

    @Override // defpackage.adgt
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }

    @Override // defpackage.adgt
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }
}
