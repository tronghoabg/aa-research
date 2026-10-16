package kotlinx.coroutines.h;

import h.g.a.q;
import h.g.b.u;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class g extends u implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final g f52028a = new g();

    g() {
        super(3, h.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        if (!x.n(obj3, i.f52031b)) {
            return hVar;
        }
        Objects.toString(obj2);
        throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(String.valueOf(obj2)));
    }
}
