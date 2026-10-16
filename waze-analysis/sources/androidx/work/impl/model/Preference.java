package androidx.work.impl.model;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Preference {
    private final String key;
    private final Long value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String str, boolean z) {
        this(str, Long.valueOf(true != z ? 0L : 1L));
        x.f(str, "key");
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = preference.key;
        }
        if ((i2 & 2) != 0) {
            l2 = preference.value;
        }
        return preference.copy(str, l2);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String str, Long l2) {
        x.f(str, "key");
        return new Preference(str, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return x.n(this.key, preference.key) && x.n(this.value, preference.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l2 = this.value;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ")";
    }

    public Preference(String str, Long l2) {
        x.f(str, "key");
        this.key = str;
        this.value = l2;
    }
}
