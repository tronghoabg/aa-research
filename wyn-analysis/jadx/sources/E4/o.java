package E4;

import A7.AbstractC0279p0;
import D6.C0388o;
import Va.Y7;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import wa.C4398a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2941h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final y f2942a;

    /* renamed from: b, reason: collision with root package name */
    public final C4398a f2943b;

    /* renamed from: c, reason: collision with root package name */
    public final G4.d f2944c;

    /* renamed from: d, reason: collision with root package name */
    public final C0388o f2945d;

    /* renamed from: e, reason: collision with root package name */
    public final F f2946e;

    /* renamed from: f, reason: collision with root package name */
    public final n f2947f;

    /* renamed from: g, reason: collision with root package name */
    public final Y7 f2948g;

    public o(G4.d dVar, S3.l lVar, H4.c cVar, H4.c cVar2, H4.c cVar3, H4.c cVar4) throws Throwable {
        this.f2944c = dVar;
        d7.j jVar = new d7.j(lVar);
        Y7 y72 = new Y7(1);
        this.f2948g = y72;
        synchronized (this) {
            try {
                try {
                    synchronized (y72) {
                        try {
                            y72.f13870d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.f2943b = new C4398a(16);
                    this.f2942a = new y(0);
                    this.f2945d = new C0388o(cVar, cVar2, cVar3, cVar4, this, this);
                    this.f2947f = new n(jVar);
                    this.f2946e = new F();
                    dVar.f4227d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void d(String str, long j8, t tVar) {
        StringBuilder sbQ = AbstractC0279p0.q(str, " in ");
        sbQ.append(Y4.i.a(j8));
        sbQ.append("ms, key: ");
        sbQ.append(tVar);
        Log.v("Engine", sbQ.toString());
    }

    public static void g(B b5) {
        if (!(b5 instanceof u)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((u) b5).d();
    }

    public final Dd.c a(com.bumptech.glide.c cVar, Object obj, B4.d dVar, int i5, int i10, Class cls, Class cls2, com.bumptech.glide.d dVar2, m mVar, Y4.d dVar3, boolean z2, boolean z10, B4.g gVar, boolean z11, boolean z12, U4.d dVar4, Y4.g gVar2) {
        long jElapsedRealtimeNanos;
        if (f2941h) {
            int i11 = Y4.i.f16694b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f2943b.getClass();
        t tVar = new t(obj, dVar, i5, i10, dVar3, cls, cls2, gVar);
        synchronized (this) {
            try {
                u uVarC = c(tVar, z11, jElapsedRealtimeNanos);
                if (uVarC == null) {
                    return h(cVar, obj, dVar, i5, i10, cls, cls2, dVar2, mVar, dVar3, z2, z10, gVar, z11, z12, dVar4, gVar2, tVar, jElapsedRealtimeNanos);
                }
                dVar4.j(uVarC, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E4.u b(E4.t r9) throws java.lang.Throwable {
        /*
            r8 = this;
            G4.d r1 = r8.f2944c
            monitor-enter(r1)
            java.io.Serializable r0 = r1.f15033c     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.remove(r9)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1c
            long r2 = r1.f15032b     // Catch: java.lang.Throwable -> L18
            int r4 = r1.c(r0)     // Catch: java.lang.Throwable -> L18
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L18
            long r2 = r2 - r4
            r1.f15032b = r2     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r0 = move-exception
            r9 = r0
            r7 = r8
            goto L46
        L1c:
            monitor-exit(r1)
            r3 = r0
            E4.B r3 = (E4.B) r3
            if (r3 != 0) goto L26
            r0 = 0
        L23:
            r7 = r8
            r6 = r9
            goto L38
        L26:
            boolean r0 = r3 instanceof E4.u
            if (r0 == 0) goto L2e
            r0 = r3
            E4.u r0 = (E4.u) r0
            goto L23
        L2e:
            E4.u r2 = new E4.u
            r4 = 1
            r5 = 1
            r7 = r8
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L38:
            if (r0 == 0) goto L42
            r0.c()
            Va.Y7 r9 = r7.f2948g
            r9.a(r6, r0)
        L42:
            return r0
        L43:
            r0 = move-exception
            r7 = r8
        L45:
            r9 = r0
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r9
        L48:
            r0 = move-exception
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.o.b(E4.t):E4.u");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u c(t tVar, boolean z2, long j8) throws Throwable {
        u uVar;
        if (z2) {
            Y7 y72 = this.f2948g;
            synchronized (y72) {
                C0434c c0434c = (C0434c) ((HashMap) y72.f13868b).get(tVar);
                if (c0434c == null) {
                    uVar = null;
                } else {
                    uVar = (u) c0434c.get();
                    if (uVar == null) {
                        y72.d(c0434c);
                    }
                }
            }
            if (uVar != null) {
                uVar.c();
            }
            if (uVar != null) {
                if (f2941h) {
                    d("Loaded resource from active resources", j8, tVar);
                }
                return uVar;
            }
            u uVarB = b(tVar);
            if (uVarB != null) {
                if (f2941h) {
                    d("Loaded resource from cache", j8, tVar);
                }
                return uVarB;
            }
        }
        return null;
    }

    public final synchronized void e(s sVar, t tVar, u uVar) {
        if (uVar != null) {
            try {
                if (uVar.f2985a) {
                    this.f2948g.a(tVar, uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y yVar = this.f2942a;
        yVar.getClass();
        sVar.getClass();
        HashMap map = yVar.f3001a;
        if (sVar.equals(map.get(tVar))) {
            map.remove(tVar);
        }
    }

    public final void f(t tVar, u uVar) {
        Y7 y72 = this.f2948g;
        synchronized (y72) {
            C0434c c0434c = (C0434c) ((HashMap) y72.f13868b).remove(tVar);
            if (c0434c != null) {
                c0434c.f2867c = null;
                c0434c.clear();
            }
        }
        if (uVar.f2985a) {
        } else {
            this.f2946e.s(uVar, false);
        }
    }

    public final Dd.c h(com.bumptech.glide.c cVar, Object obj, B4.d dVar, int i5, int i10, Class cls, Class cls2, com.bumptech.glide.d dVar2, m mVar, Y4.d dVar3, boolean z2, boolean z10, B4.g gVar, boolean z11, boolean z12, U4.d dVar4, Y4.g gVar2, t tVar, long j8) {
        s sVar = (s) this.f2942a.f3001a.get(tVar);
        if (sVar != null) {
            sVar.a(dVar4, gVar2);
            if (f2941h) {
                d("Added to existing load", j8, tVar);
            }
            return new Dd.c(this, dVar4, sVar);
        }
        s sVar2 = (s) ((Dd.c) this.f2945d.f2468g).z();
        synchronized (sVar2) {
            sVar2.k = tVar;
            sVar2.f2966l = z11;
            sVar2.f2967m = z12;
        }
        n nVar = this.f2947f;
        k kVar = (k) ((Dd.c) nVar.f2940d).z();
        int i11 = nVar.f2938b;
        nVar.f2938b = i11 + 1;
        i iVar = kVar.f2903a;
        iVar.f2881c = cVar;
        iVar.f2882d = obj;
        iVar.f2891n = dVar;
        iVar.f2883e = i5;
        iVar.f2884f = i10;
        iVar.f2893p = mVar;
        iVar.f2885g = cls;
        iVar.f2886h = kVar.f2906d;
        iVar.k = cls2;
        iVar.f2892o = dVar2;
        iVar.f2887i = gVar;
        iVar.f2888j = dVar3;
        iVar.f2894q = z2;
        iVar.f2895r = z10;
        kVar.f2910h = cVar;
        kVar.f2911i = dVar;
        kVar.f2912j = dVar2;
        kVar.k = tVar;
        kVar.f2913l = i5;
        kVar.f2914m = i10;
        kVar.f2915n = mVar;
        kVar.f2916o = gVar;
        kVar.f2917p = sVar2;
        kVar.f2918q = i11;
        kVar.f2901C = 1;
        kVar.f2920s = obj;
        y yVar = this.f2942a;
        yVar.getClass();
        yVar.f3001a.put(tVar, sVar2);
        sVar2.a(dVar4, gVar2);
        sVar2.k(kVar);
        if (f2941h) {
            d("Started new load", j8, tVar);
        }
        return new Dd.c(this, dVar4, sVar2);
    }
}
