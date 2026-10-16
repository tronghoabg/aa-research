package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class aehs implements Map.Entry, aehh {
    int a;
    final /* synthetic */ aegf b;
    private final /* synthetic */ int c;

    public aehs(aegf aegfVar, int i, int i2) {
        this.c = i2;
        this.b = aegfVar;
        this.a = i;
    }

    @Override // defpackage.aehh
    public final int a() {
        int i = this.c;
        aegf aegfVar = this.b;
        return i != 0 ? ((aehf) aegfVar).a[this.a] : ((aehy) aegfVar).a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.c != 0) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                aehf aehfVar = (aehf) this.b;
                if (aehfVar.a[this.a] == ((Integer) entry.getKey()).intValue() && Objects.equals(aehfVar.b[this.a], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            aehy aehyVar = (aehy) this.b;
            if (aehyVar.a[this.a] == ((Integer) entry2.getKey()).intValue() && Objects.equals(aehyVar.b[this.a], entry2.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* synthetic */ Integer getKey() {
        int i = this.c;
        aegf aegfVar = this.b;
        return i != 0 ? Integer.valueOf(((aehf) aegfVar).a[this.a]) : Integer.valueOf(((aehy) aegfVar).a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.c;
        aegf aegfVar = this.b;
        return i != 0 ? ((aehf) aegfVar).b[this.a] : ((aehy) aegfVar).b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.c;
        aegf aegfVar = this.b;
        if (i != 0) {
            aehf aehfVar = (aehf) aegfVar;
            int[] iArr = aehfVar.a;
            int i2 = this.a;
            int i3 = iArr[i2];
            Object obj = aehfVar.b[i2];
            return i3 ^ (obj != null ? obj.hashCode() : 0);
        }
        aehy aehyVar = (aehy) aegfVar;
        int[] iArr2 = aehyVar.a;
        int i4 = this.a;
        int i5 = iArr2[i4];
        Object obj2 = aehyVar.b[i4];
        return i5 ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.c;
        aegf aegfVar = this.b;
        if (i != 0) {
            Object[] objArr = ((aehf) aegfVar).b;
            int i2 = this.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        Object[] objArr2 = ((aehy) aegfVar).b;
        int i3 = this.a;
        Object obj3 = objArr2[i3];
        objArr2[i3] = obj;
        return obj3;
    }

    public final String toString() {
        int i = this.c;
        aegf aegfVar = this.b;
        if (i != 0) {
            aehf aehfVar = (aehf) aegfVar;
            int[] iArr = aehfVar.a;
            int i2 = this.a;
            return iArr[i2] + "=>" + String.valueOf(aehfVar.b[i2]);
        }
        aehy aehyVar = (aehy) aegfVar;
        int[] iArr2 = aehyVar.a;
        int i3 = this.a;
        return iArr2[i3] + "=>" + String.valueOf(aehyVar.b[i3]);
    }

    public aehs(aegf aegfVar, int i, byte[] bArr) {
        this.c = i;
        this.b = aegfVar;
    }
}
