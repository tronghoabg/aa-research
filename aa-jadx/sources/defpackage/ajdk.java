package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class ajdk {
    public static final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean z = defpackage.aiuy.a;
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
