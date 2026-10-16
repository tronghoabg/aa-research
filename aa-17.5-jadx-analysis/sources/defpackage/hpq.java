package defpackage;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hpq extends hng {
    public static final hno b = new hno(16);
    private final String c;
    private final Map d;

    public hpq(String str, Map map) {
        super(hnh.g);
        this.c = str;
        this.d = map;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("clientSessionId", this.c);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.d.entrySet()) {
            bundle2.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
        }
        bundle.putBundle("cardIdsToLiveDataResultBundle", bundle2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpq)) {
            return false;
        }
        hpq hpqVar = (hpq) obj;
        return affa.f(this.c, hpqVar.c) && affa.f(this.d, hpqVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }
}
