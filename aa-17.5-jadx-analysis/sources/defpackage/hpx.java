package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpx extends hng {
    public static final hno b = new hno(18);
    private final String c;
    private final hpw d;
    private final int e;
    private final List f;
    private final String g;
    private final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpx(String str, hpw hpwVar, int i, List list, String str2, String str3) {
        super(hnh.b);
        str3.getClass();
        this.c = str;
        this.d = hpwVar;
        this.e = i;
        this.f = list;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("client_session_id", this.h);
        bundle.putString("account_email", this.c);
        bundle.putInt("suggestion_type", this.d.d);
        bundle.putInt("same_location_threshold_meters", this.e);
        List list = this.f;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((hpv) it.next()).a);
        }
        bundle.putStringArrayList("location_names", new ArrayList<>(arrayList));
        ArrayList arrayList2 = new ArrayList(woy.bp(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hpv) it2.next()).b);
        }
        bundle.putSerializable("location_lats", new ArrayList(arrayList2));
        ArrayList arrayList3 = new ArrayList(woy.bp(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((hpv) it3.next()).c);
        }
        bundle.putSerializable("location_longs", new ArrayList(arrayList3));
        bundle.putString("weather_description", this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpx)) {
            return false;
        }
        hpx hpxVar = (hpx) obj;
        return affa.f(this.c, hpxVar.c) && this.d == hpxVar.d && this.e == hpxVar.e && affa.f(this.f, hpxVar.f) && affa.f(this.g, hpxVar.g) && affa.f(this.h, hpxVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
        String str = this.g;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode();
    }
}
