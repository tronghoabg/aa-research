package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pe extends defpackage.pb {
    final /* synthetic */ defpackage.pf a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.pi c;

    public pe(defpackage.pf pfVar, java.lang.String str, defpackage.pi piVar) {
        this.a = pfVar;
        this.b = str;
        this.c = piVar;
    }

    @Override // defpackage.pb
    public final void a() {
        this.a.d(this.b);
    }

    @Override // defpackage.pb
    public final void b(java.lang.Object obj) throws java.lang.Exception {
        defpackage.pf pfVar = this.a;
        java.util.Map map = pfVar.b;
        defpackage.pi piVar = this.c;
        java.lang.String str = this.b;
        java.lang.Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bv(obj, piVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((java.lang.Number) obj2).intValue();
        pfVar.c.add(str);
        try {
            pfVar.f(iIntValue, piVar, obj);
        } catch (java.lang.Exception e) {
            defpackage.pf pfVar2 = this.a;
            pfVar2.c.remove(this.b);
            throw e;
        }
    }
}
