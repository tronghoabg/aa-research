package defpackage;

import android.os.Bundle;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hol extends hng {
    public static final hno b = new hno(3);
    private final String c;
    private final List d;
    private final String e;
    private final List f;
    private final List g;
    private final LocalDate h;

    public hol(String str, List list, String str2, List list2, List list3, LocalDate localDate) {
        super(hnh.h);
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = list2;
        this.g = list3;
        this.h = localDate;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("name", this.c);
        bundle.putStringArrayList("phone_numbers", new ArrayList<>(this.d));
        bundle.putString("lookup_key", this.e);
        bundle.putStringArrayList("emails", new ArrayList<>(this.f));
        LocalDate localDate = this.h;
        bundle.putString("birthday", localDate != null ? localDate.toString() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hol)) {
            return false;
        }
        hol holVar = (hol) obj;
        return affa.f(this.c, holVar.c) && affa.f(this.d, holVar.d) && affa.f(this.e, holVar.e) && affa.f(this.f, holVar.f) && affa.f(this.g, holVar.g) && affa.f(this.h, holVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        LocalDate localDate = this.h;
        return (iHashCode * 31) + (localDate == null ? 0 : localDate.hashCode());
    }
}
