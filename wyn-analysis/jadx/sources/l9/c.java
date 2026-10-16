package L9;

import J9.L;
import l9.InterfaceC3448d;

/* loaded from: classes4.dex */
public final class c implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7042a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.c f7043b;

    public /* synthetic */ c(S3.c cVar, int i5) {
        this.f7042a = i5;
        this.f7043b = cVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f7042a) {
            case 0:
                L l10 = (L) this.f7043b.f10936b;
                Fe.b.l(l10);
                return l10;
            default:
                InterfaceC3448d interfaceC3448d = (InterfaceC3448d) this.f7043b.f10937c;
                Fe.b.l(interfaceC3448d);
                return interfaceC3448d;
        }
    }
}
