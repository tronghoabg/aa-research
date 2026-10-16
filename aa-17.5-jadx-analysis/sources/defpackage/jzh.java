package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class jzh implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jzh(hli hliVar, int i) {
        this.b = i;
        this.a = hliVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bym, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        int i = this.b;
        if (i == 0) {
            ((afec) this.a.a()).invoke(Boolean.valueOf(z));
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            nwf nwfVar = (nwf) obj;
            if (nwfVar.d != null && z) {
                if (nwfVar.e) {
                    nwfVar.isInTouchMode();
                }
                nwfVar.e = false;
                return;
            }
            return;
        }
        hli hliVar = (hli) obj;
        if (z != hliVar.e) {
            geu geuVar = hliVar.c;
            if (geuVar != null) {
                geuVar.B().a(5);
            }
            hliVar.e = z;
        }
    }

    public /* synthetic */ jzh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
