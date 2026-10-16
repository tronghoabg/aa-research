package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class pkk implements pkj {
    private static final yob c = yob.c("com/google/android/apps/gmm/recovery/crashloop/UnsuccessfulStartupHandler");
    public final pkl a;
    public final oct b;

    public pkk() {
        pkr pkrVar = new pkr("unsuccessful-startup", 2);
        oct octVar = new oct((char[]) null);
        int i = pkg.a;
        this.b = octVar;
        this.a = pkrVar;
    }

    @Override // defpackage.pkj
    public final void a(Context context) {
        byte[] bArr = null;
        try {
            lvl.al(new pfl(this, context, 4, bArr));
        } catch (Exception e) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e)).ai((char) 6751)).u("Unable to unset marker");
        }
        try {
            if (((Boolean) lvl.al(new pfl(this, context, 5, bArr))).booleanValue()) {
                return;
            }
            ((ynz) ((ynz) ((ynz) c.g()).p(new RuntimeException("Unable to reset unsuccessful startup detector"))).ai(6749)).s();
        } catch (Exception e2) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e2)).ai((char) 6750)).u("Error resetting unsuccessful startup crashloop counter");
        }
    }
}
