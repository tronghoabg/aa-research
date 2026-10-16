package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afht extends defpackage.afhn {
    @Override // defpackage.afhn
    public final java.util.Random e() {
        j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // defpackage.afhs
    public final long f() {
        return j$.util.concurrent.ThreadLocalRandom.current().nextLong(3000L);
    }

    @Override // defpackage.afhs
    public final long gH() {
        return j$.util.concurrent.ThreadLocalRandom.current().nextLong(0L, 3000L);
    }
}
