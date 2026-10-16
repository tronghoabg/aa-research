package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes3.dex */
public final class aafi implements Runnable {
    public static final String a = "aafi";
    public final Handler b;
    public final zrt c;
    final Runnable d;
    final Runnable e;
    final aezk f;
    public boolean g;
    public via h;
    public zyi i;
    public vhx j;
    public aafh k;
    public aagn l;
    public aagi m;
    public aagl n;
    public Double o;
    public aagi p;
    public aagi q;
    public aagh r;
    public aagl s;
    public StreetViewPanoramaCamera t;
    public aafe u;
    public StreetViewPanoramaCamera v;
    private final zsb w;
    private final aahn x;
    private final aafg y;

    public aafi(zsb zsbVar, aahn aahnVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        zrt zrtVar = zrt.a;
        aafg aafgVar = new aafg();
        this.w = zsbVar;
        zkt.n(aahnVar, "frameRequestor");
        this.x = aahnVar;
        this.b = handler;
        zkt.n(zrtVar, "uiThreadChecker");
        this.c = zrtVar;
        this.y = aafgVar;
        this.d = new aabr(this, 10);
        this.e = new aabr(this, 11);
        this.f = new uxu(this, 6);
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        aagi aagiVar = aagi.a;
        this.m = aagiVar;
        this.n = null;
        this.t = zyj.a;
        this.u = null;
        this.l = null;
        synchronized (this) {
            this.o = null;
            this.p = aagiVar;
            this.q = aagiVar;
            this.r = null;
            this.s = null;
            this.v = null;
        }
    }

    public final aagi a() {
        this.c.a();
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aagl b(java.lang.String r11, com.google.android.libraries.maps.model.StreetViewPanoramaCamera r12, boolean r13) {
        /*
            r10 = this;
            zrt r0 = r10.c
            r0.a()
            java.lang.String r1 = defpackage.aafi.a
            r2 = 4
            boolean r3 = defpackage.zrn.e(r1, r2)
            r4 = 2
            r6 = 3
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L27
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r11
            r9[r7] = r12
            r9[r4] = r3
            java.lang.String r3 = "goToPano(%s,%s,%s)"
            java.lang.String r3 = java.lang.String.format(r3, r9)
            android.util.Log.i(r1, r3)
        L27:
            java.lang.String r3 = "destinationPanoId"
            defpackage.zkt.n(r11, r3)
            boolean r9 = r10.g
            if (r9 != 0) goto La7
            r0.a()
            boolean r0 = defpackage.zrn.e(r1, r2)
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r8] = r11
            r2[r7] = r12
            r2[r4] = r0
            java.lang.String r0 = "makeTransition(%s, %s, %s)"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            android.util.Log.i(r1, r0)
        L4e:
            defpackage.zkt.n(r11, r3)
            aagi r0 = r10.m
            boolean r0 = r0.i()
            if (r0 == 0) goto L61
            aagl r0 = new aagl
            aagi r1 = r10.m
            r0.<init>(r1, r11, r12, r13)
            goto La3
        L61:
            aagi r0 = r10.m
            aagt r0 = r0.g()
            r1 = 0
            if (r11 == 0) goto L86
            boolean r2 = r0.b()
            if (r2 != 0) goto L71
            goto L86
        L71:
            aagu[] r0 = r0.f
            int r2 = r0.length
        L74:
            if (r8 >= r2) goto L86
            r3 = r0[r8]
            if (r3 == 0) goto L83
            java.lang.String r4 = r3.e
            boolean r4 = defpackage.a.C(r4, r11)
            if (r4 == 0) goto L83
            goto L87
        L83:
            int r8 = r8 + 1
            goto L74
        L86:
            r3 = r1
        L87:
            if (r3 != 0) goto L91
            aagl r0 = new aagl
            aagi r1 = r10.m
            r0.<init>(r1, r11, r12, r13)
            goto La3
        L91:
            aagl r0 = new aagl
            aagi r1 = r10.m
            java.lang.String r11 = "srcPanoTarget"
            defpackage.zkt.n(r1, r11)
            java.lang.String r2 = r3.e
            android.view.animation.Interpolator r6 = defpackage.aagl.a
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
        La3:
            r10.e(r0)
            return r0
        La7:
            aagl r10 = new aagl
            aagi r11 = defpackage.aagi.a
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.b(java.lang.String, com.google.android.libraries.maps.model.StreetViewPanoramaCamera, boolean):aagl");
    }

    public final aagn c() {
        this.c.a();
        zsb zsbVar = this.w;
        int width = zsbVar.getWidth();
        int height = zsbVar.getHeight();
        if (width == 0 || height == 0) {
            String str = a;
            if (zrn.e(str, 3)) {
                Log.d(str, "refreshRaycaster() called before the View has completed layout.");
            }
            this.l = null;
            return null;
        }
        aagn aagnVar = this.l;
        if (aagnVar == null) {
            String str2 = a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, String.format("refreshRaycaster() creating initial raycaster: [%s x %s] => %s", Integer.valueOf(width), Integer.valueOf(height), this.t));
            }
            aagn aagnVar2 = new aagn(this.t, width, height);
            this.l = aagnVar2;
            return aagnVar2;
        }
        if (width != aagnVar.h || height != aagnVar.i) {
            String str3 = a;
            if (zrn.e(str3, 4)) {
                Log.i(str3, String.format("refreshRaycaster() RESIZING: [%s x %s] => %s", Integer.valueOf(width), Integer.valueOf(height), this.l));
            }
            aagn aagnVar3 = new aagn(this.t, width, height);
            this.l = aagnVar3;
            return aagnVar3;
        }
        if (a.C(new StreetViewPanoramaCamera(aagnVar.g, aagnVar.e, aagnVar.f), this.t)) {
            return this.l;
        }
        String str4 = a;
        if (zrn.e(str4, 2)) {
            Log.v(str4, String.format("refreshRaycaster() [%s] => %s", this.t, this.l));
        }
        aagn aagnVarB = this.l.b(this.t);
        this.l = aagnVarB;
        return aagnVarB;
    }

    public final void d(aafe aafeVar) {
        this.c.a();
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("setCameraAnimation(%s)", aafeVar));
        }
        if (this.g) {
            return;
        }
        this.u = aafeVar;
        run();
    }

    public final void e(aagl aaglVar) {
        this.c.a();
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("setTransition(%s)", aaglVar));
        }
        if (this.k != null && !aaglVar.f()) {
            this.k.o(aagi.a);
        }
        this.n = aaglVar;
        StreetViewPanoramaCamera streetViewPanoramaCamera = aaglVar.e;
        if (streetViewPanoramaCamera != null) {
            this.u = new aafk(streetViewPanoramaCamera, 1.0d, aaglVar.c);
        }
        run();
    }

    public final void f() {
        this.c.a();
        if (this.g) {
            return;
        }
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("triggerOnCameraChangeListener(%s)", this.t));
        }
        vhx vhxVar = this.j;
        if (vhxVar != null) {
            try {
                vhxVar.e(this.t);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (Error e2) {
                throw new zsg(e2);
            } catch (RuntimeException e3) {
                throw new zsh(e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.g():void");
    }

    public final void h(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        this.c.a();
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("animateCamera(%s,%s,%s)", streetViewPanoramaCamera, Long.valueOf(j), false));
        }
        zkt.n(streetViewPanoramaCamera, "camera");
        if (this.g) {
            return;
        }
        d(j == 0 ? new aafl(streetViewPanoramaCamera) : new aafk(streetViewPanoramaCamera, j / 1000.0d, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafi.run():void");
    }
}
