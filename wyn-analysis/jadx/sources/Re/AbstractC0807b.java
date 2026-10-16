package Re;

import J9.C0663w;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Re.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0807b extends AtomicInteger implements He.f, InterfaceC0811f, ug.b {

    /* renamed from: b, reason: collision with root package name */
    public final C0663w f10704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10706d;

    /* renamed from: e, reason: collision with root package name */
    public ug.b f10707e;

    /* renamed from: f, reason: collision with root package name */
    public int f10708f;

    /* renamed from: g, reason: collision with root package name */
    public Oe.h f10709g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10710h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10711i;
    public volatile boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f10713l;

    /* renamed from: a, reason: collision with root package name */
    public final C0810e f10703a = new C0810e(this);

    /* renamed from: j, reason: collision with root package name */
    public final Ze.b f10712j = new Ze.b();

    public AbstractC0807b(C0663w c0663w, int i5) {
        this.f10704b = c0663w;
        this.f10705c = i5;
        this.f10706d = i5;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10713l == 2 || this.f10709g.offer(obj)) {
            f();
        } else {
            this.f10707e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10707e, bVar)) {
            this.f10707e = bVar;
            if (bVar instanceof Oe.e) {
                Oe.e eVar = (Oe.e) bVar;
                int iC = eVar.c(3);
                if (iC == 1) {
                    this.f10713l = iC;
                    this.f10709g = eVar;
                    this.f10710h = true;
                    g();
                    f();
                    return;
                }
                if (iC == 2) {
                    this.f10713l = iC;
                    this.f10709g = eVar;
                    g();
                    bVar.request(this.f10705c);
                    return;
                }
            }
            this.f10709g = new Ve.a(this.f10705c);
            g();
            bVar.request(this.f10705c);
        }
    }

    public abstract void f();

    public abstract void g();

    @Override // He.f
    public final void onComplete() {
        this.f10710h = true;
        f();
    }
}
