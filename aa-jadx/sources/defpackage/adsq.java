package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adsq implements defpackage.adwc {
    private final java.util.concurrent.atomic.AtomicLong a = new java.util.concurrent.atomic.AtomicLong();

    @Override // defpackage.adwc
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
