package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dtt extends dts {
    public final Instant a;
    public final Long b;
    public final Duration c;
    public final boolean d;
    public final int e;

    public dtt(Instant instant, Long l, Duration duration, boolean z, int i) {
        aclh.o(((instant != null ? 1 : 0) + (l != null ? 1 : 0)) + (duration != null ? 1 : 0) == 1, "Exactly one of zeroTime, zeroElapsedRealtime, or pausedDuration must be present; received %s,%s,%s", new Object[]{instant, l, duration});
        aclh.o(i > 0 && i <= 2, "Invalid format: %s", new Object[]{Integer.valueOf(i)});
        this.a = instant;
        this.b = l;
        this.c = duration;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.dts
    public final void a(Bundle bundle) {
        Instant instant = this.a;
        if (instant != null) {
            bundle.putLong("zeroTime", instant.toEpochMilli());
        } else {
            Long l = this.b;
            if (l != null) {
                bundle.putLong("zeroElapsedRealtime", l.longValue());
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    bundle.putLong("pausedDuration", duration.toMillis());
                }
            }
        }
        bundle.putBoolean("countDown", this.d);
        bundle.putInt("format", this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtt)) {
            return false;
        }
        dtt dttVar = (dtt) obj;
        if (this == dttVar) {
            return true;
        }
        return Objects.equals(this.a, dttVar.a) && Objects.equals(this.b, dttVar.b) && Objects.equals(this.c, dttVar.c) && this.d == dttVar.d && this.e == dttVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeDifference{");
        Instant instant = this.a;
        if (instant != null) {
            sb.append("mZeroTime=");
            sb.append(instant);
        } else {
            Long l = this.b;
            if (l != null) {
                sb.append("mZeroElapsedRealtime=");
                sb.append(l);
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    sb.append("mPausedDuration=");
                    sb.append(duration);
                }
            }
        }
        sb.append(", mCountDown=");
        sb.append(this.d);
        sb.append(", mFormat=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
