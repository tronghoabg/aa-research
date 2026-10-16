package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hpf extends hng {
    public static final hno b = new hno(9);
    private final String c;
    private final String d;

    public hpf(String str, String str2) {
        super(hnh.n);
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("lookup_id", this.c);
        bundle.putString("lookup_type", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpf)) {
            return false;
        }
        hpf hpfVar = (hpf) obj;
        return affa.f(this.c, hpfVar.c) && affa.f(this.d, hpfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
