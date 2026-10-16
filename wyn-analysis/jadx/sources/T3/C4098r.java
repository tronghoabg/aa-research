package t3;

import java.util.ArrayList;
import x.C4412e;

/* renamed from: t3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4098r extends AbstractC4097q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4412e f45717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC4099s f45718b;

    public C4098r(ViewTreeObserverOnPreDrawListenerC4099s viewTreeObserverOnPreDrawListenerC4099s, C4412e c4412e) {
        this.f45718b = viewTreeObserverOnPreDrawListenerC4099s;
        this.f45717a = c4412e;
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        ((ArrayList) this.f45717a.get(this.f45718b.f45720b)).remove(abstractC4096p);
        abstractC4096p.w(this);
    }
}
