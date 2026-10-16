package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements java.util.function.Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.Collection b;

    public /* synthetic */ s(java.util.Collection collection, byte b) {
        this.a = b;
        this.b = collection;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        byte b = this.a;
        java.util.Collection collection = this.b;
        switch (b) {
            case 0:
                j$.com.android.tools.r8.a aVar = j$.util.concurrent.ConcurrentLinkedQueue.a;
                return !collection.contains(obj);
            default:
                j$.com.android.tools.r8.a aVar2 = j$.util.concurrent.ConcurrentLinkedQueue.a;
                return collection.contains(obj);
        }
    }
}
