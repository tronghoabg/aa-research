package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adid implements defpackage.adic {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.u("45367388", true);
        b = rkqVar.u("45373269", true);
    }

    @Override // defpackage.adic
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }

    @Override // defpackage.adic
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }
}
