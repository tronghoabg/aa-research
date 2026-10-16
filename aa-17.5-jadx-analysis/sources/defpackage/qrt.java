package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* loaded from: classes.dex */
final class qrt extends bg implements dur, dus, eru, or, fbg, bw {
    final /* synthetic */ qru a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrt(qru qruVar, Context context) {
        super(context, new sss());
        this.a = qruVar;
    }

    @Override // defpackage.bg, defpackage.be
    public final View a(int i) {
        return this.a.B(i);
    }

    @Override // defpackage.bg, defpackage.be
    public final boolean b() {
        Window windowC = this.a.C();
        return (windowC == null || windowC.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bg
    public final LayoutInflater c() {
        return this.a.A().cloneInContext(this.c);
    }

    @Override // defpackage.bg
    public final /* synthetic */ Object e() {
        return this.a;
    }

    @Override // defpackage.dur
    public final void gB(dzg dzgVar) {
        this.a.gB(dzgVar);
    }

    @Override // defpackage.dus
    public final void gE(dzg dzgVar) {
        this.a.gE(dzgVar);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.a.l;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        return this.a.getViewModelStore();
    }

    @Override // defpackage.bg
    public final void j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dur
    public final void k(dzg dzgVar) {
        this.a.k(dzgVar);
    }

    @Override // defpackage.dus
    public final void n(dzg dzgVar) {
        this.a.n(dzgVar);
    }

    @Override // defpackage.bg
    public final void q(PrintWriter printWriter, String[] strArr) {
        printWriter.print("  ");
        printWriter.print("Local CarFragmentActivity ");
        qru qruVar = this.a;
        printWriter.print(Integer.toHexString(System.identityHashCode(qruVar)));
        printWriter.println(" State:");
        printWriter.print("    ");
        printWriter.print("mCreated=");
        printWriter.print(qruVar.m);
        printWriter.print(" mResumed=");
        printWriter.print(qruVar.n);
        printWriter.print(" mStopped=");
        printWriter.print(qruVar.o);
        if (qruVar.getBaseContext() != null) {
            esm.a(qruVar).c("    ", null, printWriter, strArr);
        }
        qruVar.p.A().H("  ", null, printWriter, strArr);
        printWriter.print("  ");
        printWriter.println("View Hierarchy:");
        qruVar.T("    ", printWriter, qruVar.C().getDecorView());
    }

    @Override // defpackage.or
    public final bii r() {
        return this.a.k;
    }

    @Override // defpackage.bw
    public final void p(Fragment fragment) {
    }
}
