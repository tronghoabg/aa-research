package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kze implements kxe {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kze(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void a(java.lang.Object obj) {
        int i = this.b;
        char c = 1;
        if (i == 0) {
            boolean zEquals = java.lang.Boolean.TRUE.equals((java.lang.Boolean) obj);
            java.lang.Object obj2 = this.a;
            if (zEquals) {
                ((defpackage.kzh) obj2).f(5, new defpackage.kze(obj2, c == true ? 1 : 0), java.lang.String.class);
                return;
            }
            defpackage.kzh kzhVar = (defpackage.kzh) obj2;
            kzhVar.a.edit().remove("AssistantPrimaryLanguage").apply();
            defpackage.kzh.h(kzhVar.e, null);
            return;
        }
        if (i == 1) {
            java.lang.String str = (java.lang.String) obj;
            defpackage.kzh kzhVar2 = (defpackage.kzh) this.a;
            kzhVar2.a.edit().putString("AssistantPrimaryLanguage", str).apply();
            defpackage.kzh.h(kzhVar2.e, str);
            return;
        }
        if (i == 2) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            ((defpackage.kzh) this.a).c = bool != null && bool.booleanValue();
            return;
        }
        boolean zEquals2 = java.lang.Boolean.TRUE.equals((java.lang.Boolean) obj);
        defpackage.lwp lwpVar = (defpackage.lwp) this.a;
        lwpVar.a = zEquals2;
        java.util.Iterator it = lwpVar.b.iterator();
        while (it.hasNext()) {
            ((lwo) it.next()).a(lwpVar.a);
        }
    }
}
