package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pf {
    final /* synthetic */ defpackage.od g;
    public final java.util.Map a = new java.util.LinkedHashMap();
    public final java.util.Map b = new java.util.LinkedHashMap();
    private final java.util.Map h = new java.util.LinkedHashMap();
    public final java.util.List c = new java.util.ArrayList();
    public final transient java.util.Map d = new java.util.LinkedHashMap();
    public final java.util.Map e = new java.util.LinkedHashMap();
    public final android.os.Bundle f = new android.os.Bundle();

    public pf(defpackage.od odVar) {
        this.g = odVar;
    }

    private final void g(java.lang.String str) {
        if (((java.lang.Integer) this.b.get(str)) == null) {
            defpackage.acm acmVar = new defpackage.acm(1);
            java.util.Iterator itA = afsg.c(new aiso(acmVar, new defpackage.tcr(acmVar, 2))).a();
            while (itA.hasNext()) {
                java.lang.Number number = (java.lang.Number) itA.next();
                if (!this.a.containsKey(java.lang.Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final defpackage.pb a(java.lang.String str, defpackage.pi piVar, defpackage.pa paVar) {
        g(str);
        this.d.put(str, new defpackage.bil(paVar, piVar, (byte[]) null));
        java.util.Map map = this.e;
        if (map.containsKey(str)) {
            java.lang.Object obj = map.get(str);
            map.remove(str);
            paVar.a(obj);
        }
        android.os.Bundle bundle = this.f;
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) defpackage.ebl.v(bundle, str, androidx.activity.result.ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            paVar.a(piVar.a(activityResult.a, activityResult.b));
        }
        return new defpackage.pe(this, str, piVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public final defpackage.pb b(java.lang.String str, defpackage.eqg eqgVar, defpackage.pi piVar, defpackage.pa paVar) {
        str.getClass();
        piVar.getClass();
        paVar.getClass();
        defpackage.epy lifecycle = eqgVar.getLifecycle();
        if (lifecycle.a().a(defpackage.epx.d)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + eqgVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        java.util.Map map = this.h;
        defpackage.bil bilVar = (defpackage.bil) map.get(str);
        if (bilVar == null) {
            bilVar = new defpackage.bil(lifecycle);
        }
        defpackage.eqf pcVar = new pc(this, str, paVar, piVar);
        ((defpackage.epy) bilVar.b).c(pcVar);
        bilVar.a.add(pcVar);
        map.put(str, bilVar);
        return new pd(this, str, piVar);
    }

    public final void c(int i, java.lang.String str) {
        java.util.Map map = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void d(java.lang.String str) {
        java.lang.Integer num;
        if (!this.c.contains(str) && (num = (java.lang.Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        java.util.Map map = this.e;
        if (map.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        android.os.Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            android.util.Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((androidx.activity.result.ActivityResult) defpackage.ebl.v(bundle, str, androidx.activity.result.ActivityResult.class)));
            bundle.remove(str);
        }
        java.util.Map map2 = this.h;
        defpackage.bil bilVar = (defpackage.bil) map2.get(str);
        if (bilVar != null) {
            ?? r1 = bilVar.a;
            java.util.Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((defpackage.epy) bilVar.b).d((defpackage.eqe) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, pa] */
    public final boolean e(int i, int i2, android.content.Intent intent) {
        java.lang.String str = (java.lang.String) this.a.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        defpackage.bil bilVar = (defpackage.bil) this.d.get(str);
        if ((bilVar != null ? bilVar.b : null) != null) {
            java.util.List list = this.c;
            if (list.contains(str)) {
                bilVar.b.a(((defpackage.pi) bilVar.a).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.e.remove(str);
        this.f.putParcelable(str, new androidx.activity.result.ActivityResult(i2, intent));
        return true;
    }

    public final void f(int i, defpackage.pi piVar, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        defpackage.od odVar = this.g;
        defpackage.sr srVarC = piVar.c(odVar, obj);
        if (srVarC != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new oc(this, i, srVarC, 0, (byte[]) null));
            return;
        }
        android.content.Intent intentB = piVar.b(obj);
        if (intentB.getExtras() != null) {
            android.os.Bundle extras = intentB.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentB.setExtrasClassLoader(odVar.getClassLoader());
            }
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        android.os.Bundle bundle = bundleExtra;
        if (defpackage.afga.f("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentB.getAction())) {
            java.lang.String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new java.lang.String[0];
            }
            dst.a(odVar, stringArrayExtra, i);
            return;
        }
        if (!defpackage.afga.f("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentB.getAction())) {
            odVar.startActivityForResult(intentB, i, bundle);
            return;
        }
        androidx.activity.result.IntentSenderRequest parcelableExtra = intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            parcelableExtra.getClass();
            odVar.startIntentSenderForResult(parcelableExtra.a, i, parcelableExtra.b, parcelableExtra.c, parcelableExtra.d, 0, bundle);
        } catch (android.content.IntentSender.SendIntentException e) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new oc(this, i, e, 2));
        }
    }

    public pf() {
    }
}
