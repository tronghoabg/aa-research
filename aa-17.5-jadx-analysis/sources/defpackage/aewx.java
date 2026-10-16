package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aewx implements Map.Entry {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aewx(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.c != 0) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                aewk aewkVar = (aewk) this.b;
                if (aewkVar.a[this.a] == entry.getKey() && Objects.equals(aewkVar.b[this.a], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            aexc aexcVar = (aexc) this.b;
            if (aexcVar.a[this.a] == entry2.getKey() && aexcVar.b[this.a] == entry2.getValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.c;
        Object obj = this.b;
        return i != 0 ? ((aewk) obj).a[this.a] : ((aexc) obj).a[this.a];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.c;
        Object obj = this.b;
        return i != 0 ? ((aewk) obj).b[this.a] : ((aexc) obj).b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.c;
        Object obj = this.b;
        if (i != 0) {
            aewk aewkVar = (aewk) obj;
            int iIdentityHashCode = System.identityHashCode(aewkVar.a[this.a]);
            Object obj2 = aewkVar.b[this.a];
            return iIdentityHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }
        aexc aexcVar = (aexc) obj;
        int iIdentityHashCode2 = System.identityHashCode(aexcVar.a[this.a]);
        Object obj3 = aexcVar.b[this.a];
        return iIdentityHashCode2 ^ (obj3 != null ? System.identityHashCode(obj3) : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.c;
        Object obj2 = this.b;
        if (i != 0) {
            Object[] objArr = ((aewk) obj2).b;
            int i2 = this.a;
            Object obj3 = objArr[i2];
            objArr[i2] = obj;
            return obj3;
        }
        Object[] objArr2 = ((aexc) obj2).b;
        int i3 = this.a;
        Object obj4 = objArr2[i3];
        objArr2[i3] = obj;
        return obj4;
    }

    public final String toString() {
        int i = this.c;
        Object obj = this.b;
        if (i != 0) {
            aewk aewkVar = (aewk) obj;
            return String.valueOf(aewkVar.a[this.a]) + "=>" + String.valueOf(aewkVar.b[this.a]);
        }
        aexc aexcVar = (aexc) obj;
        return String.valueOf(aexcVar.a[this.a]) + "=>" + String.valueOf(aexcVar.b[this.a]);
    }

    public aewx(Object obj, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
    }
}
