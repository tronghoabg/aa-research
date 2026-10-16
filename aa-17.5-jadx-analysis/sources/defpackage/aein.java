package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class aein implements Map.Entry {
    int a;
    final /* synthetic */ aeit b;

    public aein(aeit aeitVar, int i) {
        this.b = aeitVar;
        this.a = i;
    }

    public final int a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aeit aeitVar = this.b;
        return aeitVar.a[this.a] == ((Integer) entry.getKey()).intValue() && aeitVar.b[this.a] == entry.getValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aeit aeitVar = this.b;
        int[] iArr = aeitVar.a;
        int i = this.a;
        int i2 = iArr[i];
        Object obj = aeitVar.b[i];
        return (obj == null ? 0 : System.identityHashCode(obj)) ^ i2;
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
        aeit aeitVar = this.b;
        int[] iArr = aeitVar.a;
        int i = this.a;
        return iArr[i] + "=>" + String.valueOf(aeitVar.b[i]);
    }

    public aein(aeit aeitVar) {
        this.b = aeitVar;
    }
}
