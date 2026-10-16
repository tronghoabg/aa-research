package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class adul implements aeaa {
    private final /* synthetic */ int b;

    public adul(int i) {
        this.b = i;
    }

    @Override // defpackage.aeaa
    public final long a() {
        if (this.b != 0) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        return zeb.s(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r4.getNano());
    }
}
