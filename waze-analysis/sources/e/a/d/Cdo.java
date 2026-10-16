package e.a.d;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* renamed from: e.a.d.do, reason: invalid class name */
/* loaded from: classes7.dex */
final class Cdo implements jy {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f46821b;

    Cdo(int i2) {
        this.f46821b = i2;
    }

    @Override // e.a.d.jy
    public final long a() {
        if (this.f46821b != 0) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        return com.google.d.j.e.e(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r4.getNano());
    }
}
