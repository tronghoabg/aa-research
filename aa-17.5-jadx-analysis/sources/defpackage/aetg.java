package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class aetg implements Map.Entry, aesw {
    int a;
    final /* synthetic */ aeqo b;
    private final /* synthetic */ int c;

    public aetg(aeqo aeqoVar, int i, int i2) {
        this.c = i2;
        this.b = aeqoVar;
        this.a = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.c != 0) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                aesu aesuVar = (aesu) this.b;
                if (Objects.equals(aesuVar.a[this.a], entry.getKey()) && Objects.equals(aesuVar.b[this.a], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            aetl aetlVar = (aetl) this.b;
            if (Objects.equals(aetlVar.a[this.a], entry2.getKey()) && Objects.equals(aetlVar.b[this.a], entry2.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.c;
        aeqo aeqoVar = this.b;
        return i != 0 ? ((aesu) aeqoVar).a[this.a] : ((aetl) aeqoVar).a[this.a];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.c;
        aeqo aeqoVar = this.b;
        return i != 0 ? ((aesu) aeqoVar).b[this.a] : ((aetl) aeqoVar).b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.c;
        aeqo aeqoVar = this.b;
        if (i != 0) {
            aesu aesuVar = (aesu) aeqoVar;
            Object obj = aesuVar.a[this.a];
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = aesuVar.b[this.a];
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }
        aetl aetlVar = (aetl) aeqoVar;
        Object obj3 = aetlVar.a[this.a];
        int iHashCode2 = obj3 == null ? 0 : obj3.hashCode();
        Object obj4 = aetlVar.b[this.a];
        return iHashCode2 ^ (obj4 != null ? obj4.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.c;
        aeqo aeqoVar = this.b;
        if (i != 0) {
            Object[] objArr = ((aesu) aeqoVar).b;
            int i2 = this.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        Object[] objArr2 = ((aetl) aeqoVar).b;
        int i3 = this.a;
        Object obj3 = objArr2[i3];
        objArr2[i3] = obj;
        return obj3;
    }

    public final String toString() {
        int i = this.c;
        aeqo aeqoVar = this.b;
        if (i != 0) {
            aesu aesuVar = (aesu) aeqoVar;
            return String.valueOf(aesuVar.a[this.a]) + "=>" + String.valueOf(aesuVar.b[this.a]);
        }
        aetl aetlVar = (aetl) aeqoVar;
        return String.valueOf(aetlVar.a[this.a]) + "=>" + String.valueOf(aetlVar.b[this.a]);
    }

    public aetg(aeqo aeqoVar, int i, byte[] bArr) {
        this.c = i;
        this.b = aeqoVar;
    }
}
