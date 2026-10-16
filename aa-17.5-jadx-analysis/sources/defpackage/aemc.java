package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class aemc implements Map.Entry<Long, Integer> {
    int a;
    final /* synthetic */ aemi b;

    public aemc(aemi aemiVar, int i) {
        this.b = aemiVar;
        this.a = i;
    }

    public final int a() {
        return this.b.b[this.a];
    }

    public final long b() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aemi aemiVar = this.b;
        return aemiVar.a[this.a] == ((Long) entry.getKey()).longValue() && aemiVar.b[this.a] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Long getKey() {
        return Long.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getValue() {
        return Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aemi aemiVar = this.b;
        long[] jArr = aemiVar.a;
        int i = this.a;
        return aemiVar.b[i] ^ a.g(jArr[i]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer setValue(Integer num) {
        int iIntValue = num.intValue();
        int[] iArr = this.b.b;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public final String toString() {
        aemi aemiVar = this.b;
        long[] jArr = aemiVar.a;
        int i = this.a;
        return jArr[i] + "=>" + aemiVar.b[i];
    }

    public aemc(aemi aemiVar) {
        this.b = aemiVar;
    }
}
