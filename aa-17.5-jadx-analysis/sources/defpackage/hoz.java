package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class hoz extends hng {
    public static final hno b = new hno(7);
    private final String c;
    private final String d;
    private final hoy e;
    private final Bundle f;
    private final Bundle g;

    public hoz(String str, String str2, hoy hoyVar, Bundle bundle, Bundle bundle2) {
        super(hnh.r);
        this.c = str;
        this.d = str2;
        this.e = hoyVar;
        this.f = bundle;
        this.g = bundle2;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("user_input", this.c);
        bundle.putString("user_query", this.d);
        hoy hoyVar = this.e;
        bundle.putString("query_category", hoyVar != null ? hoyVar.e : null);
        bundle.putBundle("input_field_metadata", this.f);
        bundle.putBundle("extra_info", this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoz)) {
            return false;
        }
        hoz hozVar = (hoz) obj;
        return affa.f(this.c, hozVar.c) && affa.f(this.d, hozVar.d) && this.e == hozVar.e && affa.f(this.f, hozVar.f) && affa.f(this.g, hozVar.g);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        hoy hoyVar = this.e;
        int iHashCode3 = (((i + iHashCode2) * 31) + (hoyVar == null ? 0 : hoyVar.hashCode())) * 31;
        Bundle bundle = this.f;
        int iHashCode4 = (iHashCode3 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Bundle bundle2 = this.g;
        return iHashCode4 + (bundle2 != null ? bundle2.hashCode() : 0);
    }

    public hoz() {
        this(null, null, null, null, null);
    }
}
