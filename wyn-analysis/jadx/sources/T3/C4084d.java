package t3;

import android.view.ViewGroup;
import com.moloco.sdk.internal.publisher.H;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4084d extends AbstractC4097q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f45663a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45664b;

    public C4084d(ViewGroup viewGroup) {
        this.f45664b = viewGroup;
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void a() {
        H.t0(this.f45664b, false);
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void b() {
        H.t0(this.f45664b, false);
        this.f45663a = true;
    }

    @Override // t3.AbstractC4097q, t3.InterfaceC4095o
    public final void c() {
        H.t0(this.f45664b, true);
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        if (!this.f45663a) {
            H.t0(this.f45664b, false);
        }
        abstractC4096p.w(this);
    }
}
