package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class abpn implements Map.Entry, Comparable {
    public Object a;
    final /* synthetic */ abpq b;
    public final abnu c;

    public abpn(abpq abpqVar, abnu abnuVar, Object obj) {
        this.b = abpqVar;
        this.c = abnuVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo(((abpn) obj).c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a.ao(this.c, entry.getKey()) && a.ao(this.a, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = this.c.hashCode();
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b.b();
        Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public final String toString() {
        return this.c.toString() + "=" + String.valueOf(this.a);
    }
}
