package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class fro implements frl {
    private final aezr a;
    private final aezr b;

    public fro(aezr aezrVar, aezr aezrVar2) {
        this.a = aezrVar;
        this.b = aezrVar2;
    }

    @Override // defpackage.frl
    public final /* bridge */ /* synthetic */ frm a(Object obj, ftc ftcVar) {
        Uri uri = (Uri) obj;
        if (!affa.f(uri.getScheme(), "http") && !affa.f(uri.getScheme(), "https")) {
            return null;
        }
        String string = uri.toString();
        string.getClass();
        return new frr(string, ftcVar, this.a, this.b);
    }
}
