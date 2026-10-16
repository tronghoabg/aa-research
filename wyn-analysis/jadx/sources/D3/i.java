package D3;

import Gf.s;
import Gf.t;
import com.applovin.impl.i5;
import j1.InterfaceC3073a;
import kc.r;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC3073a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2311b;

    public /* synthetic */ i(Object obj, int i5) {
        this.f2310a = i5;
        this.f2311b = obj;
    }

    @Override // j1.InterfaceC3073a
    public final void accept(Object obj) {
        switch (this.f2310a) {
            case 0:
                ((s) ((t) this.f2311b)).c((k) obj);
                break;
            case 1:
                ((com.applovin.impl.sdk.ad.a) this.f2311b).s((i5) obj);
                break;
            case 2:
                com.applovin.impl.sdk.ad.b.a((String) this.f2311b, (i5) obj);
                break;
            default:
                ((r) this.f2311b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
