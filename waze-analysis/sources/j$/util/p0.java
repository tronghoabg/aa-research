package j$.util;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p0 extends o1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.SortedSet f50288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.util.SortedSet sortedSet, java.util.SortedSet sortedSet2) {
        super(sortedSet2, 21);
        this.f50288f = sortedSet;
    }

    @Override // j$.util.o1, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f50288f.comparator();
    }
}
