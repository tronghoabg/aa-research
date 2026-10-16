package b7;

import a7.C1336b;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes3.dex */
public final class f extends zbb implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, int i5) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f19387a = i5;
        this.f19388b = iVar;
    }

    @Override // b7.l
    public void D(Status status) {
        switch (this.f19387a) {
            case 2:
                ((h) this.f19388b).setResult((h) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // b7.l
    public void G(Status status) {
        switch (this.f19387a) {
            case 1:
                ((h) this.f19388b).setResult((h) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // b7.l
    public void k(GoogleSignInAccount googleSignInAccount, Status status) {
        switch (this.f19387a) {
            case 0:
                g gVar = (g) this.f19388b;
                if (googleSignInAccount != null) {
                    k kVarI = k.I(gVar.f19389a);
                    GoogleSignInOptions googleSignInOptions = gVar.f19390b;
                    synchronized (kVarI) {
                        ((b) kVarI.f19396b).c(googleSignInAccount, googleSignInOptions);
                        kVarI.f19397c = googleSignInAccount;
                        kVarI.f19398d = googleSignInOptions;
                    }
                }
                gVar.setResult((g) new C1336b(googleSignInAccount, status));
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i5, Parcel parcel, Parcel parcel2, int i10) {
        switch (i5) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                k(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                G(status2);
                break;
            case 103:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                D(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
