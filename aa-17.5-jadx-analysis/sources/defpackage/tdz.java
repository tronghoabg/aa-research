package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tdz {
    public final Object a;
    private final Long b;

    public tdz(Object obj, Long l) {
        this.a = obj;
        this.b = Long.valueOf(tmd.a() + Math.max(0L, l.longValue()));
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        if (a()) {
            return tmd.a() < this.b.longValue();
        }
        return true;
    }

    public final String toString() {
        String strConcat;
        Object obj = this.a;
        if (a()) {
            Long lValueOf = !a() ? null : !b() ? 0L : Long.valueOf(this.b.longValue() - tmd.a());
            Objects.toString(lValueOf);
            strConcat = String.valueOf(lValueOf).concat("ns");
        } else {
            strConcat = "null";
        }
        return String.format("Expirable{content=%s lifespan=%s}", obj, strConcat);
    }

    public tdz(Object obj) {
        this.a = obj;
        this.b = null;
    }
}
