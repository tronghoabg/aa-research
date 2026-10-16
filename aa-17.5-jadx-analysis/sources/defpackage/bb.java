package defpackage;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* loaded from: classes.dex */
final class bb extends bg implements dur, dus, duh, dui, eru, or, pd, fbg, bw, ead {
    final /* synthetic */ bc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(bc bcVar) {
        super(bcVar, bcVar, new Handler());
        this.a = bcVar;
    }

    @Override // defpackage.bg, defpackage.be
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.bg, defpackage.be
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bg
    public final LayoutInflater c() {
        bc bcVar = this.a;
        return bcVar.getLayoutInflater().cloneInContext(bcVar);
    }

    @Override // defpackage.bg
    public final /* synthetic */ Object e() {
        return this.a;
    }

    @Override // defpackage.pd
    public final pc gA() {
        return this.a.j;
    }

    @Override // defpackage.dur
    public final void gB(dzg dzgVar) {
        this.a.gB(dzgVar);
    }

    @Override // defpackage.duh
    public final void gC(dzg dzgVar) {
        this.a.gC(dzgVar);
    }

    @Override // defpackage.dui
    public final void gD(dzg dzgVar) {
        this.a.gD(dzgVar);
    }

    @Override // defpackage.dus
    public final void gE(dzg dzgVar) {
        this.a.gE(dzgVar);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.a.a;
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
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.dur
    public final void k(dzg dzgVar) {
        this.a.k(dzgVar);
    }

    @Override // defpackage.duh
    public final void l(dzg dzgVar) {
        this.a.l(dzgVar);
    }

    @Override // defpackage.dui
    public final void m(dzg dzgVar) {
        this.a.m(dzgVar);
    }

    @Override // defpackage.dus
    public final void n(dzg dzgVar) {
        this.a.n(dzgVar);
    }

    @Override // defpackage.bg
    public final boolean o(String str) {
        return dsm.b(this.a, str);
    }

    @Override // defpackage.bg
    public final void q(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.or
    public final bii r() {
        return this.a.r();
    }

    @Override // defpackage.ead
    public final void s(izj izjVar) {
        this.a.s(izjVar);
    }

    @Override // defpackage.ead
    public final void t(izj izjVar) {
        this.a.t(izjVar);
    }

    @Override // defpackage.bw
    public final void p(Fragment fragment) {
    }
}
