package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpo extends hng {
    public static final hno b = new hno(14);
    private final String c;
    private final List d;
    private final String e;
    private final String f;

    public hpo(String str, List list, String str2, String str3) {
        super(hnh.s);
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("clientSessionId", this.c);
        bundle.putStringArrayList("cardIds", new ArrayList<>(this.d));
        bundle.putString("message", this.e);
        bundle.putString("exceptionName", this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpo)) {
            return false;
        }
        hpo hpoVar = (hpo) obj;
        return affa.f(this.c, hpoVar.c) && affa.f(this.d, hpoVar.d) && affa.f(this.e, hpoVar.e) && affa.f(this.f, hpoVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        String str = this.f;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }
}
