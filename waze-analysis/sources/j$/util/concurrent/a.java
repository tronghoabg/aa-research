package j$.util.concurrent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class a extends o {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f50168i;

    /* renamed from: j, reason: collision with root package name */
    public k f50169j;

    public a(k[] kVarArr, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i2, 0, i3);
        this.f50168i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f50189b != null;
    }

    public final boolean hasNext() {
        return this.f50189b != null;
    }

    public final void remove() {
        k kVar = this.f50169j;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        this.f50169j = null;
        this.f50168i.g(kVar.f50181b, null, null);
    }
}
