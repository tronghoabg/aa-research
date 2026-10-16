package h.a.a;

import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h<K, V> extends g<K, V> implements Iterator<V>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i2, byte[] bArr) {
        super(iVar);
        this.f47945a = i2;
        x.f(iVar, "map");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f47945a != 0) {
            d();
            if (a() >= c().f47952g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            f(iA + 1);
            g(iA);
            Object obj = c().f47947b[b()];
            e();
            return obj;
        }
        d();
        if (a() >= c().f47952g) {
            throw new NoSuchElementException();
        }
        int iA2 = a();
        f(iA2 + 1);
        g(iA2);
        Object[] objArr = c().f47948c;
        x.c(objArr);
        Object obj2 = objArr[b()];
        e();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i2) {
        super(iVar);
        this.f47945a = i2;
        x.f(iVar, "map");
    }
}
