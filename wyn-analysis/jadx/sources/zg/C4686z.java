package zg;

import java.lang.reflect.Array;
import java.util.Iterator;

/* renamed from: zg.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4686z extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f48658c;

    public /* synthetic */ C4686z(a0 a0Var, int i5) {
        this.f48657b = i5;
        this.f48658c = a0Var;
    }

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        switch (this.f48657b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f48658c.a(n10, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i5 = 0; i5 < length; i5++) {
                        this.f48658c.a(n10, Array.get(obj, i5));
                    }
                    break;
                }
                break;
        }
    }
}
