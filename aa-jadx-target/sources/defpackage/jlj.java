package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jlj {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public jlj(boolean z) {
        this.a = z;
        this.c = new java.util.concurrent.atomic.AtomicReference(null);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final boolean a(android.content.Context context) {
        int callingUid = android.os.Binder.getCallingUid();
        boolean z = true;
        if (this.a && android.os.Process.myUid() == callingUid) {
            defpackage.yqm yqmVar = defpackage.jll.a;
            return true;
        }
        ?? r2 = this.c;
        if (r2.contains(java.lang.Integer.valueOf(callingUid))) {
            defpackage.yqm yqmVar2 = defpackage.jll.a;
            return true;
        }
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        defpackage.slj sljVarA = defpackage.slj.a(context);
        if (packagesForUid != null) {
            int i = 0;
            while (i < packagesForUid.length) {
                java.lang.String str = packagesForUid[i];
                boolean zB = sljVarA.b(str);
                boolean zContains = ((defpackage.yhx) this.b).contains(str);
                defpackage.yqm yqmVar3 = defpackage.jll.a;
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(2294);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(callingUid);
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zB);
                defpackage.zke zkeVar = defpackage.zke.a;
                boolean z2 = z;
                yqjVar.S("Package %s for uid %d: isGoogleSigned = %b, isPackageAllowed = %b", str, numValueOf, new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(zContains)));
                if (zB && zContains) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(2295)).D("Allowing call from UID %d, package %s", callingUid, new defpackage.zkf(zkeVar, str));
                    r2.add(numValueOf);
                    return z2;
                }
                i++;
                z = z2;
            }
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jll.a.g()).ai((char) 2292)).u("isAllowedCaller - list of packages to verify is null");
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.jll.a.g()).ai((char) 2293)).w("Call from UID %d is not allowed.", callingUid);
        return false;
    }

    public final void b(float f) {
        ((defpackage.byh) this.b).h(f);
    }

    public jlj(java.util.List list, boolean z) {
        this.c = new java.util.concurrent.ConcurrentSkipListSet();
        this.b = defpackage.yhx.n(list);
        this.a = z;
    }
}
