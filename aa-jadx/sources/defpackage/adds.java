package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adds implements defpackage.addr {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.addj.b;
        a = rkqVar.u("45729759", false);
        b = rkqVar.u("45729445", false);
    }

    @Override // defpackage.addr
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }

    @Override // defpackage.addr
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }
}
