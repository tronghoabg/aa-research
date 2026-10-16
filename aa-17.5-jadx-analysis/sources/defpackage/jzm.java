package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class jzm implements bvn {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jzm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [epz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bvn
    public final void a() {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            if (obj != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(this.b);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            this.a.getLifecycle().d(this.b);
            return;
        }
        if (i == 2) {
            this.a.remove(this.b);
            return;
        }
        Object obj2 = this.b;
        obj2.getClass();
        woy.cw(((kwp) this.a).a, new kaa(obj2, 19));
    }
}
