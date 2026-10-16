package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        return new j$.util.concurrent.ThreadLocalRandom(0);
    }
}
