package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aenm implements Map.Entry {
    int a;
    final /* synthetic */ aenq b;

    public aenm(aenq aenqVar, int i) {
        this.b = aenqVar;
        this.a = i;
    }

    public final long a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getKey() {
        return Long.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aenq aenqVar = this.b;
        return aenqVar.a[this.a] == ((Long) entry.getKey()).longValue() && Objects.equals(aenqVar.b[this.a], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aenq aenqVar = this.b;
        long[] jArr = aenqVar.a;
        int i = this.a;
        int iG = a.g(jArr[i]);
        Object obj = aenqVar.b[i];
        return (obj == null ? 0 : obj.hashCode()) ^ iG;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.b.b;
        int i = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        aenq aenqVar = this.b;
        long[] jArr = aenqVar.a;
        int i = this.a;
        return jArr[i] + "=>" + String.valueOf(aenqVar.b[i]);
    }

    public aenm(aenq aenqVar) {
        this.b = aenqVar;
    }
}
