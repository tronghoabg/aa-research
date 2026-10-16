package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class myh implements bvn {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public myh(eqa eqaVar, myg mygVar, bwq bwqVar, int i) {
        this.d = i;
        this.a = eqaVar;
        this.b = mygVar;
        this.c = bwqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [epz, gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        int i = this.d;
        ?? r1 = this.b;
        if (i == 0) {
            this.a.getLifecycle().d(r1);
            ?? r3 = this.c;
            yph yphVar = myi.a;
            r3.b(Boolean.valueOf(false));
            return;
        }
        r1.b();
        Object obj = this.a;
        if (obj != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnWindowFocusChangeListener(this.c);
            }
        }
    }

    public myh(gku gkuVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener, int i) {
        this.d = i;
        this.b = gkuVar;
        this.a = viewTreeObserver;
        this.c = onWindowFocusChangeListener;
    }
}
