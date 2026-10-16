package qf;

import Cd.G;
import Cd.H;
import ef.C2515C;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;
import wd.C4402c;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44279b;

    public /* synthetic */ j(Object obj, int i5) {
        this.f44278a = i5;
        this.f44279b = obj;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f44278a) {
            case 0:
                String it = (String) obj;
                AbstractC3340k.e(it, "it");
                ((ArrayList) this.f44279b).add(it);
                break;
            case 1:
                C4402c scope = (C4402c) obj;
                AbstractC3340k.e(scope, "scope");
                Nd.d dVar = (Nd.d) scope.f47473i.a(H.f2003a, new com.moloco.sdk.service_locator.h(29));
                LinkedHashMap linkedHashMap = scope.k.f47476b;
                G g9 = (G) this.f44279b;
                Object obj2 = linkedHashMap.get(g9.getKey());
                AbstractC3340k.b(obj2);
                Object objB = g9.b((l) obj2);
                g9.g(objB, scope);
                dVar.e(g9.getKey(), objB);
                break;
            default:
                ((Ad.e) this.f44279b).close();
                break;
        }
        return C2515C.f34653a;
    }
}
