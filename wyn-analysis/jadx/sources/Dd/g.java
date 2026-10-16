package Dd;

import Cd.C0333a;
import Cd.C0334b;
import Cd.C0348p;
import Cd.H;
import Cd.k0;
import Cd.l0;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;
import tf.q;
import tf.r;
import tf.s;
import wd.C4402c;

/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final g f2651b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f2652c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f2653d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f2654e = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2655a;

    public /* synthetic */ g(int i5) {
        this.f2655a = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Dd.a
    public final void a(C4402c client, AbstractC3471j abstractC3471j) {
        switch (this.f2655a) {
            case 0:
                AbstractC3340k.e(client, "client");
                client.f47469e.f(Fd.f.f4060h, new C0348p((r) abstractC3471j, (InterfaceC3103c) null, 2));
                return;
            case 1:
                q qVar = (q) abstractC3471j;
                AbstractC3340k.e(client, "client");
                C0334b c0334b = l0.f2133b;
                Nd.d dVar = (Nd.d) client.f47473i.d(H.f2003a);
                InterfaceC3103c interfaceC3103c = null;
                Object objD = dVar != null ? dVar.d(l0.f2134c) : null;
                if (objD != null) {
                    ((l0) objD).f2135a.add(new k0(qVar, client, interfaceC3103c, 1));
                    return;
                }
                throw new IllegalStateException("Plugin " + c0334b + " is not installed. Consider using `install(" + l0.f2134c + ")` in client config first.");
            case 2:
                AbstractC3340k.e(client, "client");
                client.f47469e.f(Fd.f.f4059g, new C0348p((p) abstractC3471j, (InterfaceC3103c) null, 3));
                return;
            default:
                AbstractC3340k.e(client, "client");
                client.f47470f.f(Gd.b.f4716l, new C0333a((s) abstractC3471j, null, 5));
                return;
        }
    }
}
