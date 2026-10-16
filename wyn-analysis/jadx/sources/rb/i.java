package rb;

import nb.InterfaceC3613b;
import x6.C4481l;

/* loaded from: classes4.dex */
public final class i extends R6.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44735b;

    public /* synthetic */ i(Object obj, int i5) {
        this.f44734a = i5;
        this.f44735b = obj;
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        switch (this.f44734a) {
            case 0:
                ((j) this.f44735b).f44737c.onAdFailedToLoad(c4481l.f47720a, c4481l.toString());
                break;
            default:
                ((vb.f) this.f44735b).f47153c.onAdFailedToLoad(c4481l.f47720a, c4481l.toString());
                break;
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        switch (this.f44734a) {
            case 0:
                R6.c cVar = (R6.c) obj;
                j jVar = (j) this.f44735b;
                jVar.f44737c.onAdLoaded();
                cVar.setFullScreenContentCallback(jVar.f44740f);
                jVar.f44736b.f44712b = cVar;
                InterfaceC3613b interfaceC3613b = jVar.f44718a;
                if (interfaceC3613b != null) {
                    interfaceC3613b.onAdLoaded();
                    break;
                }
                break;
            default:
                R6.c cVar2 = (R6.c) obj;
                vb.f fVar = (vb.f) this.f44735b;
                fVar.f47153c.onAdLoaded();
                cVar2.setFullScreenContentCallback(fVar.f47156f);
                fVar.f47152b.f44712b = cVar2;
                InterfaceC3613b interfaceC3613b2 = fVar.f44718a;
                if (interfaceC3613b2 != null) {
                    interfaceC3613b2.onAdLoaded();
                    break;
                }
                break;
        }
    }
}
