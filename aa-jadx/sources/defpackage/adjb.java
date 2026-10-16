package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adjb implements defpackage.adja {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.u("12", true);
        b = rkqVar.u("11", true);
    }

    @Override // defpackage.adja
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }

    @Override // defpackage.adja
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }
}
