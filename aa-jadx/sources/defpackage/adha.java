package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adha implements defpackage.adgz {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adfw.b;
        a = rkqVar.u("45738533", true);
        b = rkqVar.v("12", new defpackage.adag(19), "EAAYAg");
    }

    @Override // defpackage.adgz
    public final defpackage.ajgy a(android.content.Context context) {
        return (defpackage.ajgy) b.fG(context);
    }

    @Override // defpackage.adgz
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }
}
