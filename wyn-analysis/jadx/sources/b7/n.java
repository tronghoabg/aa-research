package b7;

import A7.AbstractC0279p0;
import a7.C1335a;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p000authapi.zbb;
import n7.AbstractC3598c;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class n extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f19399a;

    public n(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f19399a = revocationBoundService;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i5, Parcel parcel, Parcel parcel2, int i10) {
        GoogleSignInOptions googleSignInOptionsW;
        String strD;
        RevocationBoundService revocationBoundService = this.f19399a;
        if (i5 != 1) {
            if (i5 != 2) {
                return false;
            }
            zbd();
            k.I(revocationBoundService).J();
            return true;
        }
        zbd();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsW = null;
                googleSignInOptions = googleSignInOptionsW;
            } else {
                try {
                    googleSignInOptionsW = GoogleSignInOptions.W(strD);
                } catch (JSONException unused) {
                }
                googleSignInOptions = googleSignInOptionsW;
            }
        }
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        AbstractC1732v.i(googleSignInOptions2);
        C1335a c1335a = new C1335a(revocationBoundService, null, V6.a.f13153a, googleSignInOptions2, new com.google.android.gms.common.api.k(new C1687a(), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            c1335a.d();
        } else {
            c1335a.signOut();
        }
        return true;
    }

    public final void zbd() {
        if (!AbstractC3598c.j(this.f19399a, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC0279p0.i(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
