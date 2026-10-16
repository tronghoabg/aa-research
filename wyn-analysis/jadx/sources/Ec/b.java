package ec;

import ic.InterfaceC2864a;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements InterfaceC2864a, ic.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f34636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34637c;

    public /* synthetic */ b(c cVar, boolean z2, int i5) {
        this.f34635a = i5;
        this.f34636b = cVar;
        this.f34637c = z2;
    }

    @Override // ic.InterfaceC2864a
    public void a() {
        switch (this.f34635a) {
            case 0:
                c cVar = this.f34636b;
                AbstractC4345a.J(cVar.f34638a, "IS_MAN_AUTO_START_ACCEPTED", Boolean.TRUE);
                if (!this.f34637c) {
                    cVar.d(true);
                    break;
                } else {
                    cVar.c();
                    break;
                }
            default:
                c cVar2 = this.f34636b;
                AbstractC4345a.J(cVar2.f34638a, "IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED", Boolean.TRUE);
                if (this.f34637c) {
                    cVar2.c();
                    break;
                }
                break;
        }
    }

    @Override // ic.b
    public void b() {
        switch (this.f34635a) {
            case 1:
                c cVar = this.f34636b;
                if (!this.f34637c) {
                    cVar.d(true);
                    break;
                } else {
                    cVar.c();
                    break;
                }
            default:
                boolean z2 = this.f34637c;
                c cVar2 = this.f34636b;
                if (!z2) {
                    cVar2.getClass();
                    break;
                } else {
                    cVar2.c();
                    break;
                }
        }
    }
}
