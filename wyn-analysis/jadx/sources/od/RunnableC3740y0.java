package od;

import md.EnumC3545m;

/* renamed from: od.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3740y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f42128b;

    public /* synthetic */ RunnableC3740y0(M0 m02, int i5) {
        this.f42127a = i5;
        this.f42128b = m02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42127a) {
            case 0:
                this.f42128b.r(true);
                break;
            case 1:
                M0 m02 = this.f42128b;
                if (!m02.f41659G.get() && m02.f41703x != null) {
                    m02.r(false);
                    M0.o(m02);
                    break;
                }
                break;
            case 2:
                this.f42128b.s();
                if (this.f42128b.f41704y != null) {
                    this.f42128b.f41704y.getClass();
                }
                E0 e02 = this.f42128b.f41703x;
                if (e02 != null) {
                    ((md.O) e02.f41548a.f10971b).e();
                    break;
                }
                break;
            case 3:
                M0 m03 = this.f42128b;
                m03.f41666O.g(2, "Entering SHUTDOWN state");
                m03.f41697r.d(EnumC3545m.f40696e);
                break;
            case 4:
                M0 m04 = this.f42128b;
                if (!m04.f41660H) {
                    m04.f41660H = true;
                    M0.p(m04);
                    break;
                }
                break;
            default:
                M0 m05 = this.f42128b;
                if (m05.f41703x != null) {
                    M0.o(m05);
                    break;
                }
                break;
        }
    }
}
