package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class advm implements defpackage.aeba {
    private final /* synthetic */ int b;

    public advm(int i) {
        this.b = i;
    }

    @Override // defpackage.aeba
    public final long a() {
        if (this.b != 0) {
            return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
        }
        j$.time.Instant instantNow = j$.time.Instant.now();
        return defpackage.ytn.m(java.util.concurrent.TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond()), instantNow.getNano());
    }
}
