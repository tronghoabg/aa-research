package com.bumptech.glide.load.a.b;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.g.p;
import com.bumptech.glide.g.r;
import java.security.MessageDigest;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3091a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3092b;

    public o() {
        this.f3091a = new com.bumptech.glide.g.m(1000L);
        this.f3092b = com.bumptech.glide.g.a.h.a(10, new m(this));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.util.Pools$Pool, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.core.util.Pools$Pool, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.core.util.Pools$Pool, java.lang.Object] */
    public final String a(com.bumptech.glide.load.o oVar) {
        String strF;
        Object obj = this.f3091a;
        synchronized (obj) {
            strF = (String) ((com.bumptech.glide.g.m) obj).i(oVar);
        }
        if (strF == null) {
            n nVar = (n) this.f3092b.acquire();
            p.f(nVar);
            try {
                MessageDigest messageDigest = nVar.f3089a;
                oVar.a(messageDigest);
                strF = r.f(messageDigest.digest());
            } finally {
                this.f3092b.release(nVar);
            }
        }
        Object obj2 = this.f3091a;
        synchronized (obj2) {
            ((com.bumptech.glide.g.m) obj2).j(oVar, strF);
        }
        return strF;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final String b(String str) {
        ?? r1 = this.f3091a;
        if (r1.containsKey(str)) {
            return (String) r1.get(str);
        }
        r1.put(str, str);
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void c(String str) {
        this.f3091a.put("+5", str);
        ((LottieAnimationView) this.f3092b).invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final void d(String str) {
        d dVarD;
        synchronized (this) {
            ?? r0 = this.f3091a;
            dVarD = (d) r0.get(str);
            if (dVarD == null) {
                dVarD = ((k) this.f3092b).d();
                r0.put(str, dVarD);
            }
            dVarD.f3072b++;
        }
        dVarD.f3071a.lock();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    final void e(String str) {
        d dVar;
        synchronized (this) {
            ?? r2 = this.f3091a;
            dVar = (d) r2.get(str);
            p.f(dVar);
            int i2 = dVar.f3072b;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i2);
            }
            int i3 = i2 - 1;
            dVar.f3072b = i3;
            if (i3 == 0) {
                d dVar2 = (d) r2.remove(str);
                if (!dVar2.equals(dVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + dVar.toString() + ", but actually removed: " + String.valueOf(dVar2) + ", safeKey: " + str);
                }
                ((k) this.f3092b).e(dVar2);
            }
        }
        dVar.f3071a.unlock();
    }

    o(byte[] bArr) {
        this.f3091a = new HashMap();
        this.f3092b = new k();
    }

    public o(LottieAnimationView lottieAnimationView) {
        this.f3091a = new HashMap();
        this.f3092b = lottieAnimationView;
    }
}
