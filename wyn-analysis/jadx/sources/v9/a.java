package V9;

import C6.l;
import Ef.H;
import L8.e;
import L8.t;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3340k;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import y8.d;

/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13167b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f13168c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f13169d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f13170e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13171a;

    public /* synthetic */ a(int i5) {
        this.f13171a = i5;
    }

    @Override // L8.e
    public final Object o(l lVar) {
        switch (this.f13171a) {
            case 0:
                Object objB = lVar.b(new t(InterfaceC4566a.class, Executor.class));
                AbstractC3340k.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return H.r((Executor) objB);
            case 1:
                Object objB2 = lVar.b(new t(InterfaceC4568c.class, Executor.class));
                AbstractC3340k.d(objB2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return H.r((Executor) objB2);
            case 2:
                Object objB3 = lVar.b(new t(InterfaceC4567b.class, Executor.class));
                AbstractC3340k.d(objB3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return H.r((Executor) objB3);
            default:
                Object objB4 = lVar.b(new t(d.class, Executor.class));
                AbstractC3340k.d(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return H.r((Executor) objB4);
        }
    }
}
