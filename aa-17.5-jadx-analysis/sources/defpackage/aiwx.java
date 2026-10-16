package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes2.dex */
public final class aiwx {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objDE;
        try {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            objInvoke.getClass();
            objDE = new aiwv((Handler) objInvoke, null, false);
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
    }

    public static final Object a(afck afckVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            aitg aitgVar = new aitg(affa.s(afckVar), 1);
            aitgVar.z();
            c(choreographer2, aitgVar);
            return aitgVar.k();
        }
        aitg aitgVar2 = new aitg(affa.s(afckVar), 1);
        aitgVar2.z();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(aitgVar2);
        } else {
            aitu aituVar = aium.a;
            ajct.a.a(aitgVar2.b, new adyj(aitgVar2, 6));
        }
        return aitgVar2.k();
    }

    public static final void b(aitf aitfVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        c(choreographer2, aitfVar);
    }

    private static final void c(Choreographer choreographer2, aitf aitfVar) {
        choreographer2.postFrameCallback(new jgj(aitfVar, 3));
    }
}
