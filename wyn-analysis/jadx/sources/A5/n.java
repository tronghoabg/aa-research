package A5;

import Va.C1038ka;
import android.content.Context;
import df.InterfaceC2432a;
import u5.C4253d;
import u5.C4254e;
import v5.InterfaceC4301b;
import za.C4658a;

/* loaded from: classes3.dex */
public final class n implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4301b f377b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f378c;

    public /* synthetic */ n(InterfaceC4301b interfaceC4301b, InterfaceC2432a interfaceC2432a, int i5) {
        this.f376a = i5;
        this.f377b = interfaceC4301b;
        this.f378c = interfaceC2432a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f376a) {
            case 0:
                return new m(new C1038ka(15), new C4658a(14), a.f344f, (p) ((e) this.f377b).get(), this.f378c);
            default:
                return new C4254e((Context) ((e) this.f377b).f354b, (C4253d) ((e) this.f378c).get());
        }
    }
}
