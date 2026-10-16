package P4;

import E4.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final A4.d f9125a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9126b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9127c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.h f9128d;

    /* renamed from: e, reason: collision with root package name */
    public final F4.a f9129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9130f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9131g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.g f9132h;

    /* renamed from: i, reason: collision with root package name */
    public e f9133i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9134j;
    public e k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f9135l;

    /* renamed from: m, reason: collision with root package name */
    public e f9136m;

    /* renamed from: n, reason: collision with root package name */
    public int f9137n;

    /* renamed from: o, reason: collision with root package name */
    public int f9138o;

    /* renamed from: p, reason: collision with root package name */
    public int f9139p;

    public h(com.bumptech.glide.b bVar, A4.d dVar, int i5, int i10, Bitmap bitmap) {
        K4.a aVar = K4.a.f6538b;
        F4.a aVar2 = bVar.f24210a;
        com.bumptech.glide.c cVar = bVar.f24212c;
        Context baseContext = cVar.getBaseContext();
        gc.b.k(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.h hVarB = com.bumptech.glide.b.b(baseContext).f24215f.b(baseContext);
        Context baseContext2 = cVar.getBaseContext();
        gc.b.k(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.h hVarB2 = com.bumptech.glide.b.b(baseContext2).f24215f.b(baseContext2);
        hVarB2.getClass();
        com.bumptech.glide.g gVarQ = new com.bumptech.glide.g(hVarB2.f24249a, hVarB2, Bitmap.class, hVarB2.f24250b).a(com.bumptech.glide.h.f24248l).a(((U4.c) ((U4.c) ((U4.c) new U4.c().d(m.f2933b)).p()).m()).f(i5, i10));
        this.f9127c = new ArrayList();
        this.f9128d = hVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f9129e = aVar2;
        this.f9126b = handler;
        this.f9132h = gVarQ;
        this.f9125a = dVar;
        c(aVar, bitmap);
    }

    public final void a() {
        int i5;
        if (!this.f9130f || this.f9131g) {
            return;
        }
        e eVar = this.f9136m;
        if (eVar != null) {
            this.f9136m = null;
            b(eVar);
            return;
        }
        this.f9131g = true;
        A4.d dVar = this.f9125a;
        int i10 = dVar.f335l.f313c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i10 <= 0 || (i5 = dVar.k) < 0) ? 0 : (i5 < 0 || i5 >= i10) ? -1 : ((A4.a) r2.f315e.get(i5)).f309i);
        int i11 = (dVar.k + 1) % dVar.f335l.f313c;
        dVar.k = i11;
        this.k = new e(this.f9126b, i11, jUptimeMillis);
        com.bumptech.glide.g gVarQ = this.f9132h.a((U4.c) new U4.c().l(new X4.b(Double.valueOf(Math.random()))));
        gVarQ.f24245v = dVar;
        gVarQ.f24247x = true;
        gVarQ.r(this.k);
    }

    public final void b(e eVar) {
        this.f9131g = false;
        boolean z2 = this.f9134j;
        Handler handler = this.f9126b;
        if (z2) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f9130f) {
            this.f9136m = eVar;
            return;
        }
        if (eVar.f9122g != null) {
            Bitmap bitmap = this.f9135l;
            if (bitmap != null) {
                this.f9129e.f(bitmap);
                this.f9135l = null;
            }
            e eVar2 = this.f9133i;
            this.f9133i = eVar;
            ArrayList arrayList = this.f9127c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = ((h) cVar.f9108a.f9107b).f9133i;
                    if ((eVar3 != null ? eVar3.f9120e : -1) == r5.f9125a.f335l.f313c - 1) {
                        cVar.f9113f++;
                    }
                    int i5 = cVar.f9114g;
                    if (i5 != -1 && cVar.f9113f >= i5) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(K4.a aVar, Bitmap bitmap) {
        gc.b.k(aVar, "Argument must not be null");
        gc.b.k(bitmap, "Argument must not be null");
        this.f9135l = bitmap;
        this.f9132h = this.f9132h.a(new U4.c().n(aVar));
        this.f9137n = Y4.m.c(bitmap);
        this.f9138o = bitmap.getWidth();
        this.f9139p = bitmap.getHeight();
    }
}
