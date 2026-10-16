package y1;

import A7.AbstractC0279p0;
import Q1.w;
import ad.C1355I;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import h1.AbstractC2768c;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j1.AbstractC3076d;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kd.RunnableC3307c;

/* renamed from: y1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4529j implements InterfaceC4525f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47937a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.d f47938b;

    /* renamed from: c, reason: collision with root package name */
    public final C1355I f47939c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f47940d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f47941e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f47942f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f47943g;

    /* renamed from: h, reason: collision with root package name */
    public tg.b f47944h;

    public C4529j(Context context, h1.d dVar) {
        C1355I c1355i = C4530k.f47945d;
        this.f47940d = new Object();
        AbstractC3076d.d(context, "Context cannot be null");
        this.f47937a = context.getApplicationContext();
        this.f47938b = dVar;
        this.f47939c = c1355i;
    }

    @Override // y1.InterfaceC4525f
    public final void a(tg.b bVar) {
        synchronized (this.f47940d) {
            this.f47944h = bVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f47940d) {
            try {
                this.f47944h = null;
                Handler handler = this.f47941e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f47941e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f47943g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f47942f = null;
                this.f47943g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f47940d) {
            try {
                if (this.f47944h == null) {
                    return;
                }
                if (this.f47942f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new w("emojiCompat", 2));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f47943g = threadPoolExecutor;
                    this.f47942f = threadPoolExecutor;
                }
                this.f47942f.execute(new RunnableC3307c(this, 21));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h1.i d() {
        try {
            C1355I c1355i = this.f47939c;
            Context context = this.f47937a;
            h1.d dVar = this.f47938b;
            c1355i.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            Y2.f fVarA = AbstractC2768c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i5 = fVarA.f16437a;
            if (i5 != 0) {
                throw new RuntimeException(AbstractC0279p0.i(i5, "fetchFonts failed (", ")"));
            }
            h1.i[] iVarArr = (h1.i[]) fVarA.f16438b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
