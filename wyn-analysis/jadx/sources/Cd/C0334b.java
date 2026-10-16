package Cd;

import java.util.ArrayList;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r7.AbstractC3935e;
import vf.AbstractC4345a;
import wd.C4402c;

/* renamed from: Cd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0334b implements Dd.a, G {

    /* renamed from: b, reason: collision with root package name */
    public static final C0334b f2071b = new C0334b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0334b f2072c = new C0334b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0334b f2073d = new C0334b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0334b f2074e = new C0334b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0334b f2075f = new C0334b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0334b f2076g = new C0334b(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2077a;

    public /* synthetic */ C0334b(int i5) {
        this.f2077a = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Dd.a
    public void a(C4402c client, AbstractC3471j abstractC3471j) throws N0.c {
        AbstractC4345a abstractC4345a;
        D8.a aVar;
        switch (this.f2077a) {
            case 0:
                AbstractC3340k.e(client, "client");
                client.f47472h.f(Gd.b.f4714i, new C0333a((tf.p) abstractC3471j, null, 0));
                return;
            case 1:
                tf.q qVar = (tf.q) abstractC3471j;
                AbstractC3340k.e(client, "client");
                D8.a aVar2 = new D8.a("ObservableContent", 2);
                Fd.f fVar = client.f47469e;
                fVar.getClass();
                D8.a reference = Fd.f.f4062j;
                AbstractC3340k.e(reference, "reference");
                InterfaceC3103c interfaceC3103c = null;
                if (!fVar.e(aVar2)) {
                    int iC = fVar.c(reference);
                    if (iC == -1) {
                        throw new N0.c("Phase " + reference + " was not registered for this pipeline");
                    }
                    int i5 = iC + 1;
                    ArrayList arrayList = fVar.f10597a;
                    int iZ = AbstractC3935e.z(arrayList);
                    if (i5 <= iZ) {
                        while (true) {
                            Object obj = arrayList.get(i5);
                            Rd.c cVar = obj instanceof Rd.c ? (Rd.c) obj : null;
                            if (cVar != null && (abstractC4345a = cVar.f10594b) != null) {
                                Rd.g gVar = abstractC4345a instanceof Rd.g ? (Rd.g) abstractC4345a : null;
                                if (gVar != null && (aVar = gVar.f10603a) != null && aVar.equals(reference)) {
                                    iC = i5;
                                }
                                if (i5 != iZ) {
                                    i5++;
                                }
                            }
                        }
                    }
                    arrayList.add(iC + 1, new Rd.c(aVar2, new Rd.g(reference)));
                }
                fVar.f(aVar2, new C0335c(qVar, interfaceC3103c, 0));
                return;
            case 2:
                tf.q qVar2 = (tf.q) abstractC3471j;
                AbstractC3340k.e(client, "client");
                D8.a aVar3 = new D8.a("BeforeReceive", 2);
                Gd.b bVar = client.f47470f;
                bVar.getClass();
                D8.a reference2 = Gd.b.f4715j;
                AbstractC3340k.e(reference2, "reference");
                if (!bVar.e(aVar3)) {
                    int iC2 = bVar.c(reference2);
                    if (iC2 == -1) {
                        throw new N0.c("Phase " + reference2 + " was not registered for this pipeline");
                    }
                    bVar.f10597a.add(iC2, new Rd.c(aVar3, new Rd.h()));
                }
                bVar.f(aVar3, new r0(qVar2, null, 0));
                return;
            case 3:
                AbstractC3340k.e(client, "client");
                client.f47469e.f(Fd.f.f4062j, new C0335c((tf.q) abstractC3471j, null, 1));
                return;
            case 4:
                AbstractC3340k.e(client, "client");
                client.f47469e.f(Fd.f.f4059g, new r0((tf.q) abstractC3471j, null, 1));
                return;
            default:
                AbstractC3340k.e(client, "client");
                client.f47469e.f(Fd.f.f4059g, new r0((tf.q) abstractC3471j, null, 2));
                return;
        }
    }

    @Override // Cd.G
    public Object b(tf.l lVar) {
        switch (this.f2077a) {
            case 6:
                return new C0342j(lVar);
            default:
                lVar.invoke(new C0334b(7));
                return new l0();
        }
    }

    @Override // Cd.G
    public void g(Object obj, C4402c scope) {
        switch (this.f2077a) {
            case 6:
                C0342j plugin = (C0342j) obj;
                AbstractC3340k.e(plugin, "plugin");
                AbstractC3340k.e(scope, "scope");
                scope.f47469e.f(Fd.f.f4059g, new C0341i(plugin, null));
                break;
            default:
                l0 plugin2 = (l0) obj;
                AbstractC3340k.e(plugin2, "plugin");
                AbstractC3340k.e(scope, "scope");
                scope.f47469e.f(Fd.f.k, new k0(plugin2, scope, null, 0));
                break;
        }
    }

    @Override // Cd.G
    public Nd.a getKey() {
        switch (this.f2077a) {
            case 6:
                return C0342j.f2118c;
            default:
                return l0.f2134c;
        }
    }
}
