package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ess {
    public final defpackage.esw a;
    private final defpackage.eqg b;

    public ess(defpackage.eqg eqgVar, defpackage.erz erzVar) {
        this.b = eqgVar;
        this.a = (defpackage.esw) new defpackage.ery(erzVar, defpackage.esw.a).a(defpackage.esw.class);
    }

    public static defpackage.ess a(defpackage.eqg eqgVar) {
        return new defpackage.ess(eqgVar, ((defpackage.esa) eqgVar).getViewModelStore());
    }

    public static boolean d(int i) {
        return android.util.Log.isLoggable("LoaderManager", i);
    }

    public final void b(int i) {
        defpackage.esw eswVar = this.a;
        if (eswVar.c) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (d(2)) {
            android.util.Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        est estVarA = eswVar.a(i);
        if (estVarA != null) {
            estVarA.a(true);
            defpackage.abb abbVar = eswVar.b;
            int iA = defpackage.abg.a(abbVar.b, abbVar.d, i);
            if (iA >= 0) {
                java.lang.Object[] objArr = abbVar.c;
                java.lang.Object obj = objArr[iA];
                java.lang.Object obj2 = defpackage.abc.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    abbVar.a = true;
                }
            }
        }
    }

    @java.lang.Deprecated
    public final void c(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        defpackage.abb abbVar = this.a.b;
        if (abbVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            for (int i = 0; i < abbVar.c(); i++) {
                java.lang.String strConcat = strValueOf.concat("    ");
                est estVar = (est) abbVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(abbVar.b(i));
                printWriter.print(": ");
                printWriter.println(estVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(estVar.a);
                printWriter.print(" mArgs=");
                printWriter.println(estVar.h);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                etb etbVar = estVar.i;
                printWriter.println(etbVar);
                etbVar.d(strConcat.concat("  "), fileDescriptor, printWriter, strArr);
                if (estVar.j != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(estVar.j);
                    esu esuVar = estVar.j;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(esuVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(etb.q(estVar.e()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(estVar.n());
            }
        }
    }

    public final void e(int i, android.os.Bundle bundle, esr esrVar) {
        defpackage.esw eswVar = this.a;
        if (eswVar.c) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        est estVarA = eswVar.a(i);
        if (d(2)) {
            android.util.Log.v("LoaderManager", defpackage.a.bs(bundle, this, "initLoader in ", ": args="));
        }
        if (estVarA == null) {
            f(i, bundle, esrVar, null);
            return;
        }
        if (d(3)) {
            java.util.Objects.toString(estVarA);
            android.util.Log.d("LoaderManager", "  Re-using existing loader ".concat(estVarA.toString()));
        }
        estVarA.r(this.b, esrVar);
    }

    public final void f(int i, android.os.Bundle bundle, esr esrVar, etb etbVar) {
        try {
            defpackage.esw eswVar = this.a;
            eswVar.c = true;
            etb etbVarB = esrVar.b(i);
            if (etbVarB.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(etbVarB.getClass().getModifiers())) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + etbVarB);
            }
            est estVar = new est(i, bundle, etbVarB, etbVar);
            if (d(3)) {
                android.util.Log.d("LoaderManager", "  Created new loader " + estVar);
            }
            eswVar.b.f(i, estVar);
            eswVar.b();
            estVar.r(this.b, esrVar);
        } catch (java.lang.Throwable th) {
            this.a.b();
            throw th;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        defpackage.eqg eqgVar = this.b;
        sb.append(eqgVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(eqgVar)));
        sb.append("}}");
        return sb.toString();
    }
}
