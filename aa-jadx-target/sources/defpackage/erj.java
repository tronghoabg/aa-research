package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erj implements defpackage.fbj, defpackage.fbm, defpackage.esa {
    public android.os.Bundle a;
    private final /* synthetic */ defpackage.fbm b;
    private final /* synthetic */ defpackage.esa c;
    private defpackage.eri d;
    private boolean e;

    public erj(defpackage.fbm fbmVar, defpackage.esa esaVar) {
        this.b = fbmVar;
        this.c = esaVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [fbj, java.lang.Object] */
    @Override // defpackage.fbj
    public final android.os.Bundle a() {
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        android.os.Bundle bundle = this.a;
        if (bundle != null) {
            bundleU.putAll(bundle);
        }
        for (java.util.Map.Entry entry : b().a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle bundleA = ((ajer) ((defpackage.erh) entry.getValue()).a).b.a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleU.putBundle(str, bundleA);
            }
        }
        this.e = false;
        return bundleU;
    }

    public final defpackage.eri b() {
        defpackage.eri eriVar = this.d;
        if (eriVar != null && eriVar.b) {
            this.d = null;
        }
        defpackage.eri eriVar2 = this.d;
        if (eriVar2 == null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            defpackage.cyw cywVar = new defpackage.cyw(19);
            defpackage.afgx afgxVar = defpackage.afgw.a;
            defpackage.ere.d(afgxVar.getOrCreateKotlinClass(defpackage.eri.class), cywVar, linkedHashMap);
            eriVar2 = (defpackage.eri) defpackage.ebq.e(this, defpackage.ere.c(linkedHashMap), defpackage.edd.f(this)).b(afgxVar.getOrCreateKotlinClass(defpackage.eri.class));
            this.d = eriVar2;
        }
        eriVar2.getClass();
        return eriVar2;
    }

    public final void c() {
        if (this.e) {
            return;
        }
        android.os.Bundle bundleA = getSavedStateRegistry().a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        android.os.Bundle bundle = this.a;
        if (bundle != null) {
            bundleU.putAll(bundle);
        }
        if (bundleA != null) {
            bundleU.putAll(bundleA);
        }
        this.a = bundleU;
        this.e = true;
        b();
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.b.getLifecycle();
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        return this.c.getViewModelStore();
    }
}
