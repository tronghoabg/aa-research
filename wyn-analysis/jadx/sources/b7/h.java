package b7;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes3.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, int i5) {
        super(oVar);
        this.f19391a = i5;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        int i5 = this.f19391a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final void doExecute(com.google.android.gms.common.api.b bVar) throws RemoteException {
        switch (this.f19391a) {
            case 0:
                e eVar = (e) bVar;
                m mVar = (m) eVar.getService();
                f fVar = new f(this, 1);
                Parcel parcelZba = mVar.zba();
                zbc.zbd(parcelZba, fVar);
                zbc.zbc(parcelZba, eVar.f19386a);
                mVar.zbb(102, parcelZba);
                break;
            default:
                e eVar2 = (e) bVar;
                m mVar2 = (m) eVar2.getService();
                f fVar2 = new f(this, 2);
                Parcel parcelZba2 = mVar2.zba();
                zbc.zbd(parcelZba2, fVar2);
                zbc.zbc(parcelZba2, eVar2.f19386a);
                mVar2.zbb(103, parcelZba2);
                break;
        }
    }
}
