package re;

import G9.e;
import Ge.f;
import android.os.Handler;
import android.os.Looper;
import ce.InterfaceC1606a;
import java.lang.ref.WeakReference;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: re.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3979c implements InterfaceC1606a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f44806a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f44807b;

    public C3979c(f delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f44806a = new WeakReference(delegate);
        this.f44807b = new Handler(Looper.getMainLooper());
    }

    @Override // ce.InterfaceC1606a
    public final void a(String str) {
        this.f44807b.post(new ng.a(14, this, str));
    }

    @Override // ce.InterfaceC1606a
    public final void b(ae.f fVar) {
        this.f44807b.post(new RunnableC3978b(this, fVar, 2));
    }

    @Override // ce.InterfaceC1606a
    public final void c() {
        this.f44807b.post(new RunnableC3307c(this, 11));
    }

    @Override // ce.InterfaceC1606a
    public final void d(e eVar) {
        this.f44807b.post(new ng.a(13, this, eVar));
    }

    @Override // ce.InterfaceC1606a
    public final void e(ae.f fVar) {
        this.f44807b.post(new RunnableC3978b(this, fVar, 1));
    }

    @Override // ce.InterfaceC1606a
    public final void f(ae.f fVar) {
        this.f44807b.post(new RunnableC3978b(this, fVar, 0));
    }
}
