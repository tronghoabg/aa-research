package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aesd implements Map.Entry, aers {
    public int a;
    final /* synthetic */ aesj b;

    public aesd(aesj aesjVar, int i) {
        this.b = aesjVar;
        this.a = i;
    }

    @Override // defpackage.aers
    public final int a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        aesj aesjVar = this.b;
        return Objects.equals(aesjVar.a[this.a], entry.getKey()) && aesjVar.b[this.a] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getValue() {
        return Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        aesj aesjVar = this.b;
        Object obj = aesjVar.a[this.a];
        return aesjVar.b[this.a] ^ (obj == null ? 0 : obj.hashCode());
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
        aesj aesjVar = this.b;
        return String.valueOf(aesjVar.a[this.a]) + "=>" + aesjVar.b[this.a];
    }

    public aesd(aesj aesjVar) {
        this.b = aesjVar;
    }
}
