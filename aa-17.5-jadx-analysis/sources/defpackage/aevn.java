package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class aevn implements Map.Entry {
    int a;
    final /* synthetic */ aevt b;

    public aevn(aevt aevtVar, int i) {
        this.b = aevtVar;
        this.a = i;
    }

    public final int a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aevt aevtVar = this.b;
        return aevtVar.a[this.a] == entry.getKey() && aevtVar.b[this.a] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aevt aevtVar = this.b;
        return aevtVar.b[this.a] ^ System.identityHashCode(aevtVar.a[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.b.b;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public final String toString() {
        aevt aevtVar = this.b;
        return String.valueOf(aevtVar.a[this.a]) + "=>" + aevtVar.b[this.a];
    }

    public aevn(aevt aevtVar) {
        this.b = aevtVar;
    }
}
