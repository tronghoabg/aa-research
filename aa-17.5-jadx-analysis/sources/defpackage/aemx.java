package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class aemx implements Map.Entry<Long, Long> {
    public int a;
    final /* synthetic */ aend b;

    public aemx(aend aendVar, int i) {
        this.b = aendVar;
        this.a = i;
    }

    public final long a() {
        return this.b.b[this.a];
    }

    public final long b() {
        return this.b.c[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aend aendVar = this.b;
        return aendVar.b[this.a] == ((Long) entry.getKey()).longValue() && aendVar.c[this.a] == ((Long) entry.getValue()).longValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Long getKey() {
        return Long.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.b.c[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aend aendVar = this.b;
        long[] jArr = aendVar.b;
        int i = this.a;
        return a.g(aendVar.c[i]) ^ a.g(jArr[i]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Long setValue(Long l) {
        long jLongValue = l.longValue();
        long[] jArr = this.b.c;
        int i = this.a;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    public final String toString() {
        aend aendVar = this.b;
        long[] jArr = aendVar.b;
        int i = this.a;
        return jArr[i] + "=>" + aendVar.c[i];
    }

    public aemx(aend aendVar) {
        this.b = aendVar;
    }
}
