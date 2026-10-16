package a7;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Status f17392a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f17393b;

    public C1336b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f17393b = googleSignInAccount;
        this.f17392a = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f17392a;
    }
}
