package androidx.tracing;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class AttributeEntry {
    public Long longValue;
    public String name;
    public String stringValue;

    public /* synthetic */ AttributeEntry(String str, Long l2, String str2, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : str, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.tracing.AttributeEntry");
        AttributeEntry attributeEntry = (AttributeEntry) obj;
        return x.n(this.longValue, attributeEntry.longValue) && x.n(this.name, attributeEntry.name) && x.n(this.stringValue, attributeEntry.stringValue);
    }

    public int hashCode() {
        Long l2 = this.longValue;
        int iM = l2 != null ? AttributeEntry$$ExternalSyntheticBackport0.m(l2.longValue()) : 0;
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i2 = iM * 31;
        String str2 = this.stringValue;
        return ((i2 + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final void reset() {
        this.name = null;
        this.longValue = null;
        this.stringValue = null;
    }

    public String toString() {
        return "AttributeEntry(name=" + this.name + ", longValue=" + this.longValue + ", stringValue=" + this.stringValue + ")";
    }

    public AttributeEntry(String str, Long l2, String str2) {
        this.name = str;
        this.longValue = l2;
        this.stringValue = str2;
    }

    public AttributeEntry() {
        this(null, null, null, 7, null);
    }
}
