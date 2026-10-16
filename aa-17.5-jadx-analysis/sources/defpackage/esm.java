package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* loaded from: classes.dex */
public final class esm {
    public final esq a;
    private final eqa b;

    public esm(eqa eqaVar, ert ertVar) {
        this.b = eqaVar;
        this.a = (esq) new ers(ertVar, esq.a).a(esq.class);
    }

    public static esm a(eqa eqaVar) {
        return new esm(eqaVar, ((eru) eqaVar).getViewModelStore());
    }

    public static boolean d(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final void b(int i) {
        esq esqVar = this.a;
        if (esqVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (d(2)) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        esn esnVarA = esqVar.a(i);
        if (esnVarA != null) {
            esnVarA.a(true);
            aau aauVar = esqVar.b;
            int iA = aaz.a(aauVar.b, aauVar.d, i);
            if (iA >= 0) {
                Object[] objArr = aauVar.c;
                Object obj = objArr[iA];
                Object obj2 = aav.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    aauVar.a = true;
                }
            }
        }
    }

    @Deprecated
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aau aauVar = this.a.b;
        if (aauVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < aauVar.c(); i++) {
                String strConcat = strValueOf.concat("    ");
                esn esnVar = (esn) aauVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aauVar.b(i));
                printWriter.print(": ");
                printWriter.println(esnVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(esnVar.a);
                printWriter.print(" mArgs=");
                printWriter.println(esnVar.h);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                esv esvVar = esnVar.i;
                printWriter.println(esvVar);
                esvVar.d(strConcat.concat("  "), fileDescriptor, printWriter, strArr);
                if (esnVar.j != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(esnVar.j);
                    eso esoVar = esnVar.j;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(esoVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(esv.q(esnVar.e()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(esnVar.n());
            }
        }
    }

    public final void e(int i, Bundle bundle, esl eslVar) {
        esq esqVar = this.a;
        if (esqVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        esn esnVarA = esqVar.a(i);
        if (d(2)) {
            Log.v("LoaderManager", a.bt(bundle, this, "initLoader in ", ": args="));
        }
        if (esnVarA == null) {
            f(i, bundle, eslVar, null);
            return;
        }
        if (d(3)) {
            Objects.toString(esnVarA);
            Log.d("LoaderManager", "  Re-using existing loader ".concat(esnVarA.toString()));
        }
        esnVarA.r(this.b, eslVar);
    }

    public final void f(int i, Bundle bundle, esl eslVar, esv esvVar) {
        try {
            esq esqVar = this.a;
            esqVar.c = true;
            esv esvVarB = eslVar.b(i);
            if (esvVarB.getClass().isMemberClass() && !Modifier.isStatic(esvVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + esvVarB);
            }
            esn esnVar = new esn(i, bundle, esvVarB, esvVar);
            if (d(3)) {
                Log.d("LoaderManager", "  Created new loader " + esnVar);
            }
            esqVar.b.f(i, esnVar);
            esqVar.b();
            esnVar.r(this.b, eslVar);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        eqa eqaVar = this.b;
        sb.append(eqaVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(eqaVar)));
        sb.append("}}");
        return sb.toString();
    }
}
