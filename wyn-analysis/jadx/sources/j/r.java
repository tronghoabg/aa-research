package j;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import ea.T;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class r {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, w wVar) {
        Objects.requireNonNull(wVar);
        Kb.a aVar = new Kb.a(wVar, 2);
        T.l(obj).registerOnBackInvokedCallback(1000000, aVar);
        return aVar;
    }

    public static void c(Object obj, Object obj2) {
        T.l(obj).unregisterOnBackInvokedCallback(T.i(obj2));
    }
}
