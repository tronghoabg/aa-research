package com.google.b.d.a;

import androidx.media3.muxer.MuxerUtil;
import com.google.b.d.b.ah;
import com.google.d.m.a.af;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.bv;
import com.google.d.m.a.cf;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final d f7057a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f7058b = new AtomicLong(j(Integer.MIN_VALUE, Integer.MIN_VALUE));

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f7059c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f7060d = new AtomicReference(null);

    /* renamed from: e, reason: collision with root package name */
    private final Executor f7061e = cf.z(cf.y());

    /* renamed from: f, reason: collision with root package name */
    private final bv f7062f;

    public g(af afVar, Executor executor) {
        bv bvVarF = bv.f();
        this.f7062f = bvVarF;
        d dVar = new d(afVar, executor);
        this.f7057a = dVar;
        bvVarF.addListener(dVar, cf.y());
    }

    public static /* synthetic */ void e(g gVar, bv bvVar, e eVar) {
        try {
            Object objO = bd.o(bvVar);
            bv bvVar2 = gVar.f7062f;
            bvVar2.c(objO);
            eVar.e(bvVar2);
        } catch (Throwable unused) {
            eVar.e(bvVar);
        }
    }

    static /* bridge */ /* synthetic */ boolean f(g gVar) {
        AtomicLong atomicLong;
        long j2;
        int i2;
        int i3;
        boolean z;
        do {
            atomicLong = gVar.f7058b;
            j2 = atomicLong.get();
            i2 = (int) j2;
            i3 = i(j2);
            if (i2 == Integer.MIN_VALUE) {
                throw new AssertionError("Refcount is: " + j2);
            }
            z = i2 == -2147483647;
            if (z) {
                i3++;
            }
        } while (!atomicLong.compareAndSet(j2, j(i3, i2 - 1)));
        return z;
    }

    private static int i(long j2) {
        return (int) (j2 >>> 32);
    }

    private static long j(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bm k(int i2) {
        AtomicReference atomicReference;
        f fVar;
        AtomicLong atomicLong = this.f7058b;
        if (i(atomicLong.get()) > i2) {
            return bd.f();
        }
        f fVar2 = new f(i2);
        do {
            atomicReference = this.f7059c;
            fVar = (f) atomicReference.get();
            if (fVar != null && fVar.f7056a > i2) {
                return bd.f();
            }
        } while (!a.a.c(atomicReference, fVar, fVar2));
        if (i(atomicLong.get()) > i2) {
            fVar2.cancel(true);
            a.a.c(atomicReference, fVar2, null);
            return fVar2;
        }
        d dVar = this.f7057a;
        af afVar = dVar.f7052a;
        Executor executor = dVar.f7053b;
        if (afVar == null || executor == null) {
            fVar2.e(this.f7062f);
            return fVar2;
        }
        fVar2.e(bd.l(ah.a(afVar), executor));
        return fVar2;
    }

    public final bm c() {
        AtomicLong atomicLong;
        long j2;
        final int i2;
        bv bvVar = this.f7062f;
        if (bvVar.isDone()) {
            return bvVar;
        }
        do {
            atomicLong = this.f7058b;
            j2 = atomicLong.get();
            i2 = i(j2);
        } while (!atomicLong.compareAndSet(j2, j(i2, ((int) j2) + 1)));
        AtomicReference atomicReference = this.f7060d;
        final bv bvVarF = bv.f();
        bm bmVar = (bm) atomicReference.getAndSet(bvVarF);
        bvVarF.e(bmVar == null ? bd.l(ah.a(new af() { // from class: com.google.b.d.a.a
            @Override // com.google.d.m.a.af
            public final bm a() {
                return this.f7045a.k(i2);
            }
        }), cf.y()) : bd.e(bmVar, Throwable.class, ah.b(new ag() { // from class: com.google.b.d.a.b
            @Override // com.google.d.m.a.ag
            public final bm apply(Object obj) {
                return this.f7047a.k(i2);
            }
        }), this.f7061e));
        final e eVar = new e(this, i2);
        bvVarF.addListener(new Runnable() { // from class: com.google.b.d.a.c
            @Override // java.lang.Runnable
            public final void run() {
                g.e(this.f7049a, bvVarF, eVar);
            }
        }, cf.y());
        return eVar;
    }

    public final boolean g() {
        return this.f7062f.isDone();
    }
}
