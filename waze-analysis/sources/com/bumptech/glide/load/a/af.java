package com.bumptech.glide.load.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af implements al, com.bumptech.glide.load.a.b.h, an {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2993a = Log.isLoggable("Engine", 2);

    /* renamed from: b, reason: collision with root package name */
    private final as f2994b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.a.b.i f2995c;

    /* renamed from: d, reason: collision with root package name */
    private final ac f2996d;

    /* renamed from: e, reason: collision with root package name */
    private final ba f2997e;

    /* renamed from: f, reason: collision with root package name */
    private final ad f2998f;

    /* renamed from: g, reason: collision with root package name */
    private final aa f2999g;

    /* renamed from: h, reason: collision with root package name */
    private final f f3000h;

    public af(com.bumptech.glide.load.a.b.i iVar, com.bumptech.glide.load.a.b.k kVar, com.bumptech.glide.load.a.c.f fVar, com.bumptech.glide.load.a.c.f fVar2, com.bumptech.glide.load.a.c.f fVar3) throws Throwable {
        this.f2995c = iVar;
        ad adVar = new ad(kVar);
        this.f2998f = adVar;
        f fVar4 = new f();
        this.f3000h = fVar4;
        synchronized (this) {
            try {
                try {
                    synchronized (fVar4) {
                        try {
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
                    this.f2994b = new as();
                    this.f2996d = new ac(fVar, fVar2, fVar3, this, this);
                    this.f2999g = new aa(adVar);
                    this.f2997e = new ba();
                    iVar.d(this);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private static void g(String str, long j2, com.bumptech.glide.load.o oVar) {
        Log.v("Engine", str + " in " + com.bumptech.glide.g.k.a(j2) + "ms, key: " + oVar.toString());
    }

    private static void h(String str, ao aoVar) {
        if (Log.isLoggable("GlideMemoryTracking", 3)) {
            Object objC = aoVar.c();
            Bitmap bitmap = objC instanceof Bitmap ? (Bitmap) objC : objC instanceof BitmapDrawable ? ((BitmapDrawable) objC).getBitmap() : null;
            if (bitmap != null) {
                int iIdentityHashCode = System.identityHashCode(bitmap);
                Log.d("GlideMemoryTracking", "Engine [Device: " + Build.DEVICE + "]: Loaded bitmap [ID: " + iIdentityHashCode + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + com.bumptech.glide.g.r.a(bitmap) + " bytes)");
            }
        }
    }

    @Override // com.bumptech.glide.load.a.al
    public final synchronized void a(ak akVar, com.bumptech.glide.load.o oVar) {
        this.f2994b.b(oVar, akVar);
    }

    @Override // com.bumptech.glide.load.a.al
    public final synchronized void b(ak akVar, com.bumptech.glide.load.o oVar, ao aoVar) {
        if (aoVar != null) {
            if (aoVar.g()) {
                this.f3000h.b(oVar, aoVar);
            }
            this.f2994b.b(oVar, akVar);
        } else {
            this.f2994b.b(oVar, akVar);
        }
    }

    @Override // com.bumptech.glide.load.a.an
    public final void c(com.bumptech.glide.load.o oVar, ao aoVar) {
        this.f3000h.e(oVar);
        if (aoVar.g()) {
            this.f2995c.f(oVar, aoVar);
        } else {
            this.f2997e.a(aoVar, false);
        }
    }

    @Override // com.bumptech.glide.load.a.b.h
    public final void d(aw awVar) {
        this.f2997e.a(awVar, true);
    }

    public final void e(aw awVar) {
        ((ao) awVar).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bumptech.glide.load.a.ae f(com.bumptech.glide.m r24, java.lang.Object r25, com.bumptech.glide.load.o r26, int r27, int r28, java.lang.Class r29, java.lang.Class r30, com.bumptech.glide.p r31, com.bumptech.glide.load.a.y r32, java.util.Map r33, boolean r34, boolean r35, com.bumptech.glide.load.s r36, boolean r37, boolean r38, com.bumptech.glide.e.j r39, java.util.concurrent.Executor r40) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.af.f(com.bumptech.glide.m, java.lang.Object, com.bumptech.glide.load.o, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.p, com.bumptech.glide.load.a.y, java.util.Map, boolean, boolean, com.bumptech.glide.load.s, boolean, boolean, com.bumptech.glide.e.j, java.util.concurrent.Executor):com.bumptech.glide.load.a.ae");
    }
}
