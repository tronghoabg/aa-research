package b7;

import a7.C1336b;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes3.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f19389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleSignInOptions f19390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(oVar);
        this.f19389a = context;
        this.f19390b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new C1336b(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final void doExecute(com.google.android.gms.common.api.b bVar) throws RemoteException {
        m mVar = (m) ((e) bVar).getService();
        f fVar = new f(this, 0);
        Parcel parcelZba = mVar.zba();
        zbc.zbd(parcelZba, fVar);
        zbc.zbc(parcelZba, this.f19390b);
        mVar.zbb(101, parcelZba);
    }
}
