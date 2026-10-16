package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adje implements defpackage.adjd {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.u("13", false);
        b = rkqVar.u("10", true);
    }

    @Override // defpackage.adjd
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }

    @Override // defpackage.adjd
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }
}
