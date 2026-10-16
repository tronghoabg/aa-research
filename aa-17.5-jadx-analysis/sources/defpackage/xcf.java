package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final /* synthetic */ class xcf implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xcf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((mhe) obj).F();
        } else {
            ((xcg) obj).f();
        }
    }
}
