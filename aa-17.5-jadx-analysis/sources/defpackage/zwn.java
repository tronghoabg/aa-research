package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class zwn implements trc, zxz, zxy {
    public static final /* synthetic */ int f = 0;
    public final zre d;
    private final zyb i;
    private volatile ScheduledFuture g = null;
    private final Map h = new ConcurrentHashMap();
    public final Map a = new ConcurrentHashMap();
    public boolean b = false;
    private acbu j = acbu.a;
    public final zwm c = new zwm(this);
    public final boolean e = addv.a.gu().b();

    static {
        zrz.e("scpm");
    }

    public zwn(zyb zybVar, zre zreVar) {
        this.i = zybVar;
        this.d = zreVar;
        zybVar.s = this;
        zybVar.e(this);
        ExecutorService executorService = zrz.a;
        zrz.a.execute(new zte(zreVar, 11));
    }

    @Override // defpackage.trc
    public final void a(int i) {
        this.h.remove(Integer.valueOf(i));
    }

    @Override // defpackage.trc
    public final void b(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    @Override // defpackage.trc
    public final void c(String str) {
        this.i.g(str);
    }

    @Override // defpackage.trc
    public final void d(int i, Runnable runnable) {
        this.h.put(Integer.valueOf(i), runnable);
    }

    @Override // defpackage.trc
    public final void e(int i, Runnable runnable) {
        if (this.e && this.b) {
            runnable.run();
        }
        this.a.put(Integer.valueOf(i), runnable);
    }

    @Override // defpackage.trc
    public final boolean f(String str) {
        return this.c.d.p(str);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.trc
    public final boolean g(String str) {
        ?? r1 = this.c.d.d;
        if (r1.containsKey(str)) {
            return ((rjs) r1.get(str)).d();
        }
        return false;
    }

    @Override // defpackage.trc
    public final zwm h() {
        return this.c;
    }

    @Override // defpackage.zxz
    public final void i() {
        aavd aavdVar;
        int i;
        int i2;
        int i3;
        acbu acbuVarC = this.i.c();
        if (acbuVarC == null || !acbuVarC.equals(this.j)) {
            if (acbuVarC != null) {
                this.j = acbuVarC;
            }
            acbu acbuVar = this.j;
            if (acbuVar != null) {
                zwm zwmVar = this.c;
                achj achjVar = achj.a;
                abgi abgiVar = abgi.a;
                aavd aavdVar2 = aavd.a;
                achj achjVar2 = achjVar;
                abgi abgiVar2 = abgiVar;
                loop1: while (true) {
                    aavdVar = aavdVar2;
                    for (aceg acegVar : acbuVar.c) {
                        int i4 = acegVar.e;
                        acef acefVarB = acef.b(i4);
                        if (acefVarB == null) {
                            acefVarB = acef.UNKNOWN_TYPE;
                        }
                        if (acefVarB == acef.VECTOR_MAPS && (i3 = acegVar.c) == 10) {
                            achjVar2 = i3 == 10 ? (achj) acegVar.d : achjVar;
                        }
                        acef acefVarB2 = acef.b(i4);
                        if (acefVarB2 == null) {
                            acefVarB2 = acef.UNKNOWN_TYPE;
                        }
                        if (acefVarB2 == acef.PAINT_PARAMETERS && (i2 = acegVar.c) == 39) {
                            abgiVar2 = i2 == 39 ? (abgi) acegVar.d : abgiVar;
                        }
                        acef acefVarB3 = acef.b(i4);
                        if (acefVarB3 == null) {
                            acefVarB3 = acef.UNKNOWN_TYPE;
                        }
                        if (acefVarB3 == acef.MAPS_API_PARAMETERS && (i = acegVar.c) == 151) {
                            if (i == 151) {
                                aavdVar = (aavd) acegVar.d;
                            }
                        }
                    }
                }
                synchronized (zwmVar) {
                    zwmVar.a = achjVar2;
                    zwmVar.b = abgiVar2;
                }
                zwmVar.e(aavdVar);
            }
        }
        for (Runnable runnable : this.h.values()) {
            if (runnable != null) {
                runnable.run();
            }
        }
        synchronized (this) {
        }
    }
}
