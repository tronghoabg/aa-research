package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public final class hom extends hng {
    public static final hno e = new hno(4);
    public final String b;
    public final Uri c;
    public final Bundle d;
    private final String f;
    private final String g;

    public hom(String str, String str2, Uri uri, String str3, Bundle bundle) {
        super(hnh.e);
        this.b = str;
        this.f = str2;
        this.c = uri;
        this.g = str3;
        this.d = bundle;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putString("action", this.b);
        bundle.putString("packageName", this.f);
        bundle.putParcelable("data", this.c);
        bundle.putString(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.g);
        bundle.putBundle("extras", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hom)) {
            return false;
        }
        hom homVar = (hom) obj;
        return affa.f(this.b, homVar.b) && affa.f(this.f, homVar.f) && affa.f(this.c, homVar.c) && affa.f(this.g, homVar.g) && affa.f(this.d, homVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        Uri uri = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bundle bundle = this.d;
        return iHashCode4 + (bundle != null ? bundle.hashCode() : 0);
    }
}
