package defpackage;

import android.view.KeyEvent;
import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class nf implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, wra] */
    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = this.b;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            ((fe) this.a).L();
            return;
        }
        if (i == 2) {
            ?? r5 = this.a;
            if (r5 != 0) {
                r5.invoke();
                return;
            }
            return;
        }
        if (i == 3) {
            this.a.run();
            return;
        }
        if (i != 4) {
            this.a.Q();
            return;
        }
        rrd.a("GH.ProjectionWindowCB", null, "onBackInvoked: dispatching back key event");
        KeyEvent keyEvent = new KeyEvent(0, 4);
        rbf rbfVar = (rbf) this.a;
        rbfVar.dispatchKeyEvent(keyEvent);
        rbfVar.dispatchKeyEvent(new KeyEvent(1, 4));
    }

    public nf(rbf rbfVar, int i) {
        this.b = i;
        this.a = rbfVar;
    }
}
