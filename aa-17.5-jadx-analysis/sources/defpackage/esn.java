package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class esn extends eqm {
    public final int a;
    public final Bundle h;
    public final esv i;
    public eso j;
    private eqa k;
    private esv l;

    public esn(int i, Bundle bundle, esv esvVar, esv esvVar2) {
        this.a = i;
        this.h = bundle;
        this.i = esvVar;
        this.l = esvVar2;
        if (esvVar.j != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        esvVar.j = this;
        esvVar.c = i;
    }

    public final esv a(boolean z) {
        if (esm.d(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        esv esvVar = this.i;
        esvVar.h();
        esvVar.f = true;
        eso esoVar = this.j;
        if (esoVar != null) {
            k(esoVar);
            if (z && esoVar.c) {
                if (esm.d(2)) {
                    esv esvVar2 = esoVar.a;
                    Objects.toString(esvVar2);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(esvVar2)));
                }
                esoVar.b.a(esoVar.a);
            }
        }
        esn esnVar = esvVar.j;
        if (esnVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (esnVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        esvVar.j = null;
        if ((esoVar == null || esoVar.c) && !z) {
            return esvVar;
        }
        esvVar.p();
        return this.l;
    }

    public final void b() {
        eqa eqaVar = this.k;
        eso esoVar = this.j;
        if (eqaVar == null || esoVar == null) {
            return;
        }
        super.k(esoVar);
        fE(eqaVar, esoVar);
    }

    @Override // defpackage.eqj
    protected final void c() {
        if (esm.d(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        esv esvVar = this.i;
        esvVar.e = true;
        esvVar.g = false;
        esvVar.f = false;
        esvVar.m();
    }

    @Override // defpackage.eqj
    protected final void d() {
        if (esm.d(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        esv esvVar = this.i;
        esvVar.e = false;
        esvVar.n();
    }

    @Override // defpackage.eqj
    public final void k(eqn eqnVar) {
        super.k(eqnVar);
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.eqj
    public final void m(Object obj) {
        super.m(obj);
        esv esvVar = this.l;
        if (esvVar != null) {
            esvVar.p();
            this.l = null;
        }
    }

    final void r(eqa eqaVar, esl eslVar) {
        eso esoVar = new eso(this.i, eslVar);
        fE(eqaVar, esoVar);
        eqn eqnVar = this.j;
        if (eqnVar != null) {
            k(eqnVar);
        }
        this.k = eqaVar;
        this.j = esoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        esv esvVar = this.i;
        sb.append(esvVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(esvVar)));
        sb.append("}}");
        return sb.toString();
    }
}
