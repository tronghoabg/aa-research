package od;

import java.net.ProxySelector;
import k8.InterfaceC3207p;

/* loaded from: classes5.dex */
public final class Y implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41847a;

    @Override // k8.InterfaceC3207p
    public final Object get() {
        switch (this.f41847a) {
            case 0:
                return new j.E(1);
            default:
                return ProxySelector.getDefault();
        }
    }
}
