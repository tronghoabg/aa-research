package defpackage;

import android.os.PerformanceHintManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes3.dex */
public final class uty implements uyl {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/GLViewThreadImpl");
    public boolean b;
    public boolean c;
    public int d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final ArrayList f = new ArrayList();
    public final utt g;
    public final utu h;
    public final utw i;
    public final utx j;
    public boolean k;
    public boolean l;
    public boolean m;
    public gms n;
    public gms o;
    public htm p;
    public htm q;
    public htm r;
    private boolean s;
    private Thread t;
    private final vky u;

    public uty(utt uttVar, vky vkyVar) {
        utu utuVar = new utu();
        this.h = utuVar;
        utw utwVar = new utw();
        this.i = utwVar;
        this.j = new utx();
        this.u = vkyVar;
        utuVar.c = 0;
        utuVar.d = 0;
        utwVar.c = true;
        this.g = uttVar;
        this.d = 0;
        utwVar.a = 0;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final void a() {
        gms gmsVar = this.o;
        htm htmVar = this.q;
        htm htmVar2 = this.r;
        if (gmsVar == null || htmVar == null || htmVar2 == null) {
            return;
        }
        ((ynz) ((ynz) a.h()).ai((char) 9654)).u("Destroying egl context");
        htm htmVar3 = uvn.a;
        Object obj = htmVar2.a;
        Object obj2 = htmVar.a;
        ?? r3 = gmsVar.a;
        EGLDisplay eGLDisplay = (EGLDisplay) obj2;
        if (r3.eglDestroyContext(eGLDisplay, (EGLContext) obj)) {
            this.r = null;
            r3.eglTerminate(eGLDisplay);
            this.q = null;
        } else {
            throw new RuntimeException("eglDestroyContext failed: " + gmsVar.k());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final void c() {
        htm htmVar;
        htm htmVar2;
        gms gmsVar = this.o;
        if (gmsVar == null || this.q == null || (htmVar = this.p) == null || htmVar == (htmVar2 = uvn.a)) {
            return;
        }
        ((ynz) ((ynz) a.h()).ai((char) 9655)).u("Destroying egl surface");
        htm htmVar3 = this.q;
        htmVar3.getClass();
        gmsVar.x(htmVar3, htmVar2, htmVar2, uvn.c);
        htm htmVar4 = this.q;
        htmVar4.getClass();
        htm htmVar5 = this.p;
        htmVar5.getClass();
        gmsVar.a.eglDestroySurface((EGLDisplay) htmVar4.a, (EGLSurface) htmVar5.a);
        this.p = null;
    }

    public final synchronized void d() {
        this.i.f = true;
        h();
    }

    public final synchronized void e() {
        if (!n() && this.s) {
            this.i.d = true;
            notifyAll();
            while (this.s && !this.b) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            PerformanceHintManager.Session session = ((umn) this.g).t;
            this.t = null;
        }
    }

    public final synchronized void f() {
        if (!this.s) {
            utv utvVar = new utv(this, this.u);
            this.t = utvVar;
            this.s = true;
            utvVar.start();
        }
        utw utwVar = this.i;
        utwVar.b = false;
        utwVar.c = true;
        utx utxVar = this.j;
        utxVar.c = false;
        notifyAll();
        while (this.s && !this.b && this.c && !utxVar.c) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void g() {
        this.i.b = true;
        notifyAll();
        while (this.s && !this.b && !this.c) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GLViewThreadImpl:"));
        String strValueOf = String.valueOf(this.u);
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("glMapThreadName: ");
        sb.append(strValueOf);
        printWriter.println(sb.toString());
        synchronized (this) {
            Thread thread = this.t;
            if (thread != null) {
                printWriter.println(strConcat + "thread state: " + String.valueOf(thread.getState()));
            }
            printWriter.println(strConcat + "threadStarted: " + this.s);
            utw utwVar = this.i;
            printWriter.println(strConcat + "shouldExit: " + utwVar.d);
            printWriter.println(strConcat + "exited: " + this.b);
            printWriter.println(strConcat + "requestPaused: " + utwVar.b);
            printWriter.println(strConcat + "paused: " + this.c);
            utu utuVar = this.h;
            printWriter.println(strConcat + "hasSurface: " + utuVar.a);
            printWriter.println(strConcat + "surfaceIsBad: " + this.m);
            Object obj = utuVar.b;
            if (obj != null) {
                printWriter.println(strConcat + "surfaceHost: " + obj.toString());
            }
            utx utxVar = this.j;
            printWriter.println(strConcat + "waitingForSurface: " + utxVar.a);
            printWriter.println(strConcat + "haveEglContext: " + this.k);
            printWriter.println(strConcat + "haveEglSurface: " + this.l);
            printWriter.println(strConcat + "finishedCreatingEglSurface: " + utxVar.b);
            printWriter.println(strConcat + "width: " + utuVar.c);
            printWriter.println(strConcat + "height: " + utuVar.d);
            printWriter.println(strConcat + "currentThreadPriority: " + this.d);
            printWriter.println(strConcat + "pendingThreadPriority: " + utwVar.a);
            printWriter.println(strConcat + "renderSignaled: " + utwVar.c);
            printWriter.println(strConcat + "renderComplete: " + utxVar.c);
            printWriter.println(strConcat + "eventQueueSize: " + this.f.size());
            printWriter.println(strConcat + "updateSize: " + utwVar.e);
            printWriter.println(strConcat + "forceContextReset: " + utwVar.f);
        }
        printWriter.println(strConcat + "isRendering: " + this.e.toString());
    }

    public final synchronized void h() {
        this.i.c = true;
        notifyAll();
    }

    public final synchronized void i() {
        notifyAll();
    }

    public final synchronized void j(Object obj) {
        utu utuVar = this.h;
        utuVar.b = obj;
        utuVar.a = true;
        utx utxVar = this.j;
        utxVar.b = false;
        notifyAll();
        while (this.s && utxVar.a && !utxVar.b && !this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void k() {
        utu utuVar = this.h;
        utuVar.b = null;
        utuVar.a = false;
        notifyAll();
        while (this.s && !this.j.a && !this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void l(int i, int i2) {
        utu utuVar = this.h;
        utuVar.c = i;
        utuVar.d = i2;
        utw utwVar = this.i;
        utwVar.e = true;
        utwVar.c = true;
        utx utxVar = this.j;
        utxVar.c = false;
        notifyAll();
        while (this.s && !this.b && !this.c && !utxVar.c && this.k && this.l && p()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized boolean m() {
        utt uttVar = this.g;
        if (((Boolean) ((umn) uttVar).q.gu()).booleanValue() && !((umn) uttVar).x.I.d() && this.h.a && this.k) {
            if (this.l) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean n() {
        return this.b;
    }

    public final boolean o() {
        return !this.e.get();
    }

    public final synchronized boolean p() {
        if (!this.c) {
            utu utuVar = this.h;
            if (utuVar.a && !this.m && utuVar.c > 0 && utuVar.d > 0) {
                if (this.i.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void q() {
        this.i.a = -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final gms r(int i, int i2, int i3) {
        gms gmsVar = this.o;
        gmsVar.getClass();
        int[] iArr = new int[1];
        htm htmVar = this.q;
        htmVar.getClass();
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        htm htmVar2 = uvn.a;
        Object obj = htmVar.a;
        gmsVar.a.eglChooseConfig((EGLDisplay) obj, new int[]{12324, i, 12323, i2, 12322, i3, 12321, 0, 12325, 16, 12326, 8, 12352, 4, 12344}, eGLConfigArr, 1, iArr);
        gms gmsVar2 = new gms(eGLConfigArr[0], (byte[]) null);
        if (iArr[0] > 0) {
            return gmsVar2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, javax.microedition.khronos.egl.EGL10] */
    public final htm s(gms gmsVar, gms gmsVar2) {
        htm htmVar = this.q;
        htmVar.getClass();
        Object obj = uvn.c.a;
        Object obj2 = htmVar.a;
        EGLConfig eGLConfig = (EGLConfig) gmsVar2.a;
        htm htmVarC = htm.C(gmsVar.a.eglCreateContext((EGLDisplay) obj2, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344}));
        this.r = htmVarC;
        return htmVarC;
    }
}
