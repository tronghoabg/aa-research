package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vag {
    public volatile boolean a;
    public final Object b;
    public final Object c;

    public vag(ykd ykdVar) {
        this.c = new ConcurrentLinkedQueue();
        this.b = ykdVar;
    }

    private final boolean f() {
        if (e()) {
            return true;
        }
        rrd.c("CAR.INPUT", null, "This InputManager doesn't have a valid backing service connection.");
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    final void a(vad vadVar) {
        this.b.execute(new unj(this, vadVar, 8, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Queue] */
    public final void b(rly rlyVar) {
        if (omc.c("CAR.INPUT", 3)) {
            rrd.a("CAR.INPUT", null, "startInput");
        }
        if (f()) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("expecting main thread");
            }
            ?? r0 = this.c;
            synchronized (r0) {
                if (r0.isEmpty() || r0.peek() != rlyVar) {
                    r0.offer(rlyVar);
                    EditorInfo editorInfo = new EditorInfo();
                    InputConnection inputConnectionOnCreateInputConnection = rlyVar.onCreateInputConnection(editorInfo);
                    if (omc.c("CAR.INPUT", 3)) {
                        rrd.d(3, "CAR.INPUT", null, "startInput/editorInfo.imeOptions=%d", Integer.valueOf(editorInfo.imeOptions));
                    }
                    if (inputConnectionOnCreateInputConnection == null) {
                        rrd.d(6, "CAR.INPUT", null, "Null input connection received for view of type: %s", rlyVar.getClass().getSimpleName());
                        return;
                    }
                    Object obj = this.b;
                    rmk rmkVar = new rmk(inputConnectionOnCreateInputConnection, rlyVar);
                    try {
                        qxy qxyVar = ((rnw) ((ykd) obj).a).i;
                        if (qxyVar != null) {
                            qxyVar.z(rmkVar, editorInfo);
                        }
                    } catch (RemoteException unused) {
                        rbe.h(((rnw) ((ykd) obj).a).d);
                    }
                }
            }
        }
    }

    public final void c() {
        if (omc.c("CAR.INPUT", 3)) {
            rrd.a("CAR.INPUT", null, "stopInput");
        }
        if (f()) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("expecting main thread");
            }
            Object obj = this.b;
            try {
                qxy qxyVar = ((rnw) ((ykd) obj).a).i;
                if (qxyVar != null) {
                    qxyVar.A();
                }
            } catch (RemoteException unused) {
                rbe.h(((rnw) ((ykd) obj).a).d);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    public final boolean d() {
        return e() && !this.c.isEmpty();
    }

    public final boolean e() {
        return !this.a;
    }

    public vag(vaf vafVar, Executor executor) {
        this.a = false;
        this.c = vafVar;
        this.b = executor;
    }

    public vag(Object obj, Executor executor) {
        this.b = obj;
        this.c = executor;
        this.a = false;
    }
}
