package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;

/* loaded from: classes.dex */
public abstract class noc implements teb {
    public static final yph a = yph.c("GH.AbsFragmentHost");
    public final Handler b;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Fragment g;
    public final String h;
    public final ert i;
    protected kwp j;
    private final eqa k;
    private final epf l;
    private final Object m;

    protected noc(Fragment fragment, eqa eqaVar, Object obj) {
        nnz nnzVar = new nnz(this);
        this.l = nnzVar;
        this.b = new Handler(Looper.getMainLooper());
        this.i = new ert();
        this.g = fragment;
        this.h = fragment.getClass().getName();
        this.m = obj;
        this.k = eqaVar;
        eqaVar.getLifecycle().c(nnzVar);
    }

    public final Fragment a() {
        return !this.d ? this.g : this.j.A().e(R.id.content);
    }

    @Override // defpackage.teb
    public final Object b() {
        return this.m;
    }

    protected abstract void c();

    public final void d() {
        yph yphVar = a;
        String str = this.h;
        ((ype) yphVar.l().ai((char) 5303)).y("finish(): %s", str);
        if (this.e) {
            ((ype) yphVar.l().ai((char) 5305)).y("finish() called when already finished: %s", str);
            return;
        }
        this.d = false;
        this.e = true;
        eqa eqaVar = this.k;
        eqaVar.getLifecycle().d(this.l);
        this.i.a();
        kwp kwpVar = this.j;
        if (kwpVar != null) {
            kwpVar.E();
            this.j = null;
        }
        c();
        ((ype) yphVar.l().ai((char) 5304)).y("finish() completed: %s", str);
    }

    public final void e(boolean z) {
        wer.c();
        yph yphVar = a;
        ype ypeVar = (ype) yphVar.l().ai(5306);
        String str = this.h;
        ypeVar.P("hide(%b): %s", z, str);
        woy.ad(!this.e, "hide called when %s already finished", str);
        if (this.f) {
            ((ype) ((ype) yphVar.h()).ai((char) 5308)).y("hide called when %s already hidden", str);
            return;
        }
        this.f = true;
        f(z);
        ((ype) yphVar.l().ai(5307)).P("hide(%b) completed: %s", z, str);
    }

    protected abstract void f(boolean z);

    protected abstract void g(ProjectionWindowAnimationParams projectionWindowAnimationParams);

    public final void h(ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        wer.c();
        yph yphVar = a;
        ype ypeVar = (ype) yphVar.l().ai(5309);
        String str = this.h;
        ypeVar.M("hide(%s): %s", projectionWindowAnimationParams, str);
        woy.ad(!this.e, "hide called when %s already finished", str);
        if (this.f) {
            ((ype) ((ype) yphVar.h()).ai((char) 5311)).y("hide called when %s already hidden", str);
            return;
        }
        this.f = true;
        g(projectionWindowAnimationParams);
        ((ype) yphVar.l().ai(5310)).M("hide(%s) completed: %s", projectionWindowAnimationParams, str);
    }

    public final void i(Context context) {
        this.j.F();
        bt btVar = ((bg) this.j.a).e;
        if (btVar.m instanceof fbg) {
            btVar.W(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle bundleC = btVar.c();
        if (true == bundleC.isEmpty()) {
            bundleC = null;
        }
        this.j.I();
        ((bg) this.j.a).e.F(1);
        this.j.E();
        kwp kwpVar = new kwp(new nob(this, context, this.b));
        this.j = kwpVar;
        kwpVar.K();
        Object obj = this.j.a;
        if (!(obj instanceof eru)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        bt btVar2 = ((bg) obj).e;
        if (btVar2.m instanceof fbg) {
            btVar2.W(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        btVar2.S(bundleC);
        this.j.D();
    }

    public final void j(boolean z) {
        wer.c();
        yph yphVar = a;
        ype ypeVar = (ype) yphVar.l().ai(5319);
        String str = this.h;
        ypeVar.P("show(%b): %s", z, str);
        woy.ad(!this.e, "show called when %s already finished", str);
        if (!this.f) {
            ((ype) ((ype) yphVar.h()).ai((char) 5321)).y("show called when %s not hidden. Nothing to do", str);
            return;
        }
        this.f = false;
        k(z);
        ((ype) yphVar.l().ai(5320)).P("show(%b) completed: %s", z, str);
    }

    protected abstract void k(boolean z);

    public final void l(int i, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        wer.c();
        yph yphVar = a;
        ype ypeVar = (ype) yphVar.l().ai(5316);
        String str = this.h;
        Integer numValueOf = Integer.valueOf(i);
        ypeVar.S("requestDragChange(%s, %s, %s): %s", numValueOf, true, projectionWindowAnimationParams, str);
        woy.ad(!this.e, "show called when %s already finished", str);
        if (this.f) {
            ((ype) yphVar.l().ai((char) 5318)).y("request drag change showing window %s", str);
        }
        this.f = false;
        m(i, projectionWindowAnimationParams);
        ((ype) yphVar.l().ai(5317)).S("requestDragChange(%s, %s, %s) completed: %s", numValueOf, true, projectionWindowAnimationParams, str);
    }

    protected abstract void m(int i, ProjectionWindowAnimationParams projectionWindowAnimationParams);
}
