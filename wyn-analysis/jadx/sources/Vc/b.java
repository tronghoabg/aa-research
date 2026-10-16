package Vc;

import java.util.concurrent.Executor;
import m9.C3513l;
import m9.C3514m;
import m9.EnumC3515n;
import m9.L;
import m9.W;
import p9.C3786g;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import w9.AbstractC4392k;

/* loaded from: classes5.dex */
public final class b implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    /* renamed from: b, reason: collision with root package name */
    public int f14858b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC3515n f14859c;

    /* renamed from: d, reason: collision with root package name */
    public int f14860d;

    /* renamed from: e, reason: collision with root package name */
    public L f14861e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14862f;

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        switch (this.f14857a) {
            case 0:
                C3513l c3513l = (C3513l) this.f14861e;
                if (c3513l != null) {
                    c3513l.remove();
                    this.f14861e = null;
                    break;
                }
                break;
            default:
                C3513l c3513l2 = (C3513l) this.f14861e;
                if (c3513l2 != null) {
                    c3513l2.remove();
                    this.f14861e = null;
                    break;
                }
                break;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        switch (this.f14857a) {
            case 0:
                Executor executor = AbstractC4392k.f47444a;
                int i5 = this.f14858b;
                pd.f.o(i5, "metadataChanges must not be null.");
                int i10 = this.f14860d;
                pd.f.o(i10, "listen source must not be null.");
                a aVar = new a(0, this, (C4271h) interfaceC4270g);
                C3514m c3514m = (C3514m) this.f14862f;
                C3786g c3786g = new C3786g();
                c3786g.f43354a = i5 == 2;
                c3786g.f43355b = i5 == 2;
                c3786g.f43356c = false;
                c3786g.f43357d = i10;
                this.f14861e = c3514m.a(executor, c3786g, aVar);
                break;
            default:
                Executor executor2 = AbstractC4392k.f47444a;
                int i11 = this.f14858b;
                pd.f.o(i11, "metadataChanges must not be null.");
                int i12 = this.f14860d;
                pd.f.o(i12, "listen source must not be null.");
                a aVar2 = new a(1, this, (C4271h) interfaceC4270g);
                W w2 = (W) this.f14862f;
                C3786g c3786g2 = new C3786g();
                c3786g2.f43354a = i11 == 2;
                c3786g2.f43355b = i11 == 2;
                c3786g2.f43356c = false;
                c3786g2.f43357d = i12;
                this.f14861e = w2.a(executor2, c3786g2, aVar2);
                break;
        }
    }
}
