package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qpv implements defpackage.slq {
    public static final defpackage.qpv a = new defpackage.qpv(new android.os.Bundle());
    public final android.os.Bundle b;

    public qpv(android.os.Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.qpv)) {
            return false;
        }
        android.os.Bundle bundle = this.b;
        android.os.Bundle bundle2 = ((defpackage.qpv) obj).b;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (java.lang.String str : setKeySet) {
            if (!j$.util.Objects.equals(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b});
    }
}
