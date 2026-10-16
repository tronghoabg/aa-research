package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class aeoj implements Map.Entry {
    int a;
    final /* synthetic */ aeop b;

    public aeoj(aeop aeopVar, int i) {
        this.b = aeopVar;
        this.a = i;
    }

    public final long a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aeop aeopVar = this.b;
        return aeopVar.a[this.a] == ((Long) entry.getKey()).longValue() && aeopVar.b[this.a] == entry.getValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aeop aeopVar = this.b;
        long[] jArr = aeopVar.a;
        int i = this.a;
        int iG = a.g(jArr[i]);
        Object obj = aeopVar.b[i];
        return (obj == null ? 0 : System.identityHashCode(obj)) ^ iG;
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
        aeop aeopVar = this.b;
        long[] jArr = aeopVar.a;
        int i = this.a;
        return jArr[i] + "=>" + String.valueOf(aeopVar.b[i]);
    }

    public aeoj(aeop aeopVar) {
        this.b = aeopVar;
    }
}
