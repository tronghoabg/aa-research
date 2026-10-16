package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hnq extends hng {
    public static final hno b = new hno(0);
    private final hnp c;
    private final Integer d;

    public hnq(hnp hnpVar, Integer num) {
        super(hnh.t);
        this.c = hnpVar;
        this.d = num;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("surface", this.c.e);
        Integer num = this.d;
        if (num != null) {
            bundle.putInt("limit", num.intValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnq)) {
            return false;
        }
        hnq hnqVar = (hnq) obj;
        return this.c == hnqVar.c && affa.f(this.d, hnqVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
