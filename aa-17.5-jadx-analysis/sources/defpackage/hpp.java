package defpackage;

import android.os.Bundle;
import com.android.personalcontext.ace.client.prototype.richcard.RichCardError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpp extends hng {
    public static final hno b = new hno(15);
    private final String c;
    private final List d;
    private final String e;
    private final RichCardError f;
    private final int g;

    public hpp(String str, List list, String str2, RichCardError richCardError, int i) {
        super(hnh.f);
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = richCardError;
        this.g = i;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("clientSessionId", this.c);
        bundle.putStringArrayList("cardIds", new ArrayList<>(this.d));
        bundle.putString("cardClientSessionId", this.e);
        bundle.putParcelable("error", this.f);
        bundle.putInt("bottomInsetPx", this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpp)) {
            return false;
        }
        hpp hppVar = (hpp) obj;
        return affa.f(this.c, hppVar.c) && affa.f(this.d, hppVar.d) && affa.f(this.e, hppVar.e) && affa.f(this.f, hppVar.f) && this.g == hppVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        String str = this.e;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        RichCardError richCardError = this.f;
        return ((iHashCode2 + (richCardError != null ? richCardError.hashCode() : 0)) * 31) + this.g;
    }
}
