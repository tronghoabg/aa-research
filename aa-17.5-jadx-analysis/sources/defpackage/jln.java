package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class jln implements jlf {
    public static final yph a = yph.c("CAR.STARTUP");
    public final Context b;
    public final long c;
    public final boolean d;
    public final Handler e;
    public final List f;
    public final int g;
    public final jle h;
    public final ServiceConnection i;
    public final jlm j;
    private final Executor k;

    public jln(Context context, long j, jle jleVar, Handler handler, List list, int i) {
        rhx rhxVar = rhx.c;
        this.i = new jli(this);
        this.j = new jlm(this);
        this.b = context;
        this.c = j;
        this.d = true;
        this.h = jleVar;
        this.e = handler;
        this.k = new tde(handler, 1);
        this.f = list;
        this.g = i;
    }

    private final Executor i() {
        return j() ? zfq.a : this.k;
    }

    private final boolean j() {
        return this.e.getLooper() == Looper.myLooper();
    }

    private final boolean k(String str) {
        return skn.a(this.b).b(str);
    }

    @Override // defpackage.jlf
    public final void a() {
        this.e.post(new jgu(this, 8));
    }

    @Override // defpackage.jlf
    public final void b(int i, Bundle bundle) {
        this.e.post(new oa(this, i, bundle, 6));
    }

    @Override // defpackage.jlf
    public final void c() {
        this.e.post(new jgu(this, 11));
    }

    @Override // defpackage.jlf
    public final void d() {
        if (this.d) {
            this.e.post(new jgu(this, 10));
        } else {
            ((ype) ((ype) a.f()).ai((char) 2322)).u("Skipping handoff interest checks - feature is not enabled");
            this.e.post(new jgu(this, 9));
        }
    }

    @Override // defpackage.jlf
    public final void e() {
        ((ype) ((ype) a.f()).ai((char) 2323)).u("Tearing down car connection");
        i().execute(new jgu(this, 7));
    }

    @Override // defpackage.jlf
    public final void f(final long j, final Bundle bundle) {
        wub.ac(new Callable() { // from class: jlg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rwv rwvVar;
                long j2 = j;
                Bundle bundle2 = bundle;
                jlm jlmVar = this.a.j;
                boolean z = false;
                if (!jlmVar.a || (rwvVar = jlmVar.f) == null) {
                    ((ype) ((ype) jln.a.h()).ai((char) 2308)).u("HandoffState is invalid to do a transferForHandoff.");
                } else {
                    try {
                        rwvVar.n(j2, bundle2);
                        z = true;
                    } catch (RemoteException e) {
                        ((ype) ((ype) ((ype) jln.a.h()).p(e)).ai((char) 2309)).u("Cannot transfer for handoff");
                    }
                }
                return Boolean.valueOf(z);
            }
        }, i());
    }

    public final void g() {
        woy.Z(j());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r11 = this;
            r11.g()
        L3:
            jlm r0 = r11.j
            java.util.ArrayDeque r1 = r0.b
            boolean r2 = r1.isEmpty()
            r3 = 0
            r4 = 0
            if (r2 != 0) goto Le0
            java.lang.Object r1 = r1.removeFirst()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            java.lang.String r2 = r1.getPackageName()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L4b
            android.content.Context r5 = r11.b
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            int r6 = android.os.Process.myUid()
            java.lang.String[] r5 = r5.getPackagesForUid(r6)
            if (r5 == 0) goto L44
            j$.util.stream.Stream r5 = j$.util.DesugarArrays.stream(r5)
            r2.getClass()
            ghp r6 = new ghp
            r7 = 11
            r6.<init>(r2, r7)
            boolean r5 = r5.anyMatch(r6)
            if (r5 == 0) goto L44
            goto L75
        L44:
            boolean r5 = r11.k(r2)
            if (r5 != 0) goto L75
            goto L51
        L4b:
            boolean r5 = r11.k(r2)
            if (r5 != 0) goto L75
        L51:
            java.lang.String r0 = "com.google.android.projection.gearhead"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L67
            yph r0 = defpackage.jln.a
            yop r0 = r0.h()
            java.lang.String r1 = "Can't handoff to Gearhead, untrusted signature!"
            r2 = 2314(0x90a, float:3.243E-42)
            defpackage.a.bs(r0, r1, r2)
            goto L3
        L67:
            yph r0 = defpackage.jln.a
            yop r0 = r0.h()
            java.lang.String r1 = "Skipping %s (not Gearhead): untrusted signature."
            r3 = 2313(0x909, float:3.241E-42)
            defpackage.a.bF(r0, r1, r2, r3)
            goto L3
        L75:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.setComponent(r1)
            yph r5 = defpackage.jln.a
            yop r6 = r5.f()
            java.lang.String r7 = r1.flattenToString()
            zjd r8 = new zjd
            zjc r9 = defpackage.zjc.a
            r8.<init>(r9, r7)
            java.lang.String r7 = "Checking handoff interest for component %s"
            r10 = 2310(0x906, float:3.237E-42)
            defpackage.a.bF(r6, r7, r8, r10)
            r6 = 1
            boolean r7 = defpackage.spu.c()
            if (r6 == r7) goto L9f
            r6 = 65
            goto La1
        L9f:
            r6 = 4161(0x1041, float:5.831E-42)
        La1:
            android.content.ServiceConnection r7 = r11.i
            android.content.Context r8 = r11.b
            boolean r2 = r8.bindService(r2, r7, r6)
            r0.a = r2
            if (r2 == 0) goto Lc4
            yop r11 = r5.f()
            java.lang.String r2 = r1.flattenToString()
            zjd r3 = new zjd
            r3.<init>(r9, r2)
            java.lang.String r2 = "Successfully bound to component %s"
            r4 = 2312(0x908, float:3.24E-42)
            defpackage.a.bF(r11, r2, r3, r4)
            r0.e = r1
            return
        Lc4:
            yop r2 = r5.f()
            java.lang.String r5 = r1.flattenToString()
            zjd r6 = new zjd
            r6.<init>(r9, r5)
            java.lang.String r5 = "Failed to bind to component %s"
            r7 = 2311(0x907, float:3.238E-42)
            defpackage.a.bF(r2, r5, r6, r7)
            r0.e = r4
            jle r11 = r11.h
            r11.a(r1, r3)
            return
        Le0:
            yph r1 = defpackage.jln.a
            yop r1 = r1.f()
            java.lang.String r2 = "No components are able or willing to accept the handoff"
            r5 = 2307(0x903, float:3.233E-42)
            defpackage.a.bs(r1, r2, r5)
            r0.a()
            jle r11 = r11.h
            r11.a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jln.h():void");
    }
}
