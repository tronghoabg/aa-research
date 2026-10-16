package s8;

import A7.AbstractC0279p0;
import Ef.H;
import L8.t;
import java.util.concurrent.Executor;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;

/* loaded from: classes4.dex */
public final class i implements L8.e {

    /* renamed from: b, reason: collision with root package name */
    public static final i f45338b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f45339c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public static final i f45340d = new i(2);

    /* renamed from: e, reason: collision with root package name */
    public static final i f45341e = new i(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45342a;

    public /* synthetic */ i(int i5) {
        this.f45342a = i5;
    }

    public static final void a(int i5, long j8) {
        if (i5 < 0 || i5 >= 1000000000) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j8 || j8 >= 253402300800L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Timestamp seconds out of range: ").toString());
        }
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        switch (this.f45342a) {
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
                Object objB4 = lVar.b(new t(y8.d.class, Executor.class));
                AbstractC3340k.d(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return H.r((Executor) objB4);
        }
    }
}
