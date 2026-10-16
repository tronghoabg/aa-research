package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class itp implements itk {
    private final xyc a;

    public itp(xyc xycVar) {
        this.a = xycVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qup] */
    private final ito d(CreateAudioRecordRequest createAudioRecordRequest) throws RemoteException {
        qum qumVarX = this.a.gu().x(createAudioRecordRequest, new quc());
        if (qumVarX != null) {
            return new ito(qumVarX);
        }
        return null;
    }

    @Override // defpackage.itk
    public final itd a() {
        return new itm(this.a);
    }

    @Override // defpackage.itk
    @ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ itf b(int i, int i2) throws RemoteException {
        return d(new CreateAudioRecordRequest(true, i, i2, 0, 0, 0));
    }

    @Override // defpackage.itk
    @ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ itf c(int i, int i2) throws RemoteException {
        ito itoVarD = d(new CreateAudioRecordRequest(false, i2, i, 8, 12, 2));
        itoVarD.getClass();
        return itoVarD;
    }
}
