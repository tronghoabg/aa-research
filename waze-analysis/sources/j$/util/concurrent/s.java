package j$.util.concurrent;

import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class s implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f50207b;

    public /* synthetic */ s(Collection collection, int i2) {
        this.f50206a = i2;
        this.f50207b = collection;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f50206a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f50206a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f50206a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i2 = this.f50206a;
        Collection collection = this.f50207b;
        switch (i2) {
            case 0:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.f50157a;
                return !collection.contains(obj);
            default:
                j$.com.android.tools.r8.b bVar2 = ConcurrentLinkedQueue.f50157a;
                return collection.contains(obj);
        }
    }
}
