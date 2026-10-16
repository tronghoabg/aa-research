package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class qpz implements smy {
    private final /* synthetic */ int a;

    public /* synthetic */ qpz(int i) {
        this.a = i;
    }

    @Override // defpackage.smy
    public final void a(Object obj, Object obj2) throws RemoteException {
        switch (this.a) {
            case 0:
                ((nok) obj2).c(Integer.valueOf(((qvx) ((rni) obj).v()).e()));
                break;
            case 1:
                qpd qpdVar = new qpd((nok) obj2);
                qpc qpcVar = (qpc) ((qpa) obj).v();
                Parcel parcelGh = qpcVar.gh();
                ijp.i(parcelGh, qpdVar);
                qpcVar.gj(3, parcelGh);
                break;
            case 2:
                ((nok) obj2).c(Boolean.valueOf(((qvx) ((rni) obj).v()).s()));
                break;
            case 3:
                ((nok) obj2).c(Integer.valueOf(((qvx) ((rni) obj).v()).f()));
                break;
            case 4:
                ((nok) obj2).c(((qvx) ((rni) obj).v()).g());
                break;
            case 5:
                ((qvx) ((rni) obj).v()).k();
                ((nok) obj2).c(null);
                break;
            case 6:
                ((nok) obj2).c((qup) ((rlu) obj).v());
                break;
            case 7:
                ((nok) obj2).c(null);
                break;
            case 8:
                ((nok) obj2).c(true);
                break;
            case 9:
                sua suaVar = (sua) obj;
                LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, null);
                if (!suaVar.H(ssw.j)) {
                    if (!suaVar.H(ssw.f)) {
                        stl stlVar = (stl) suaVar.v();
                        Parcel parcelGi = stlVar.gi(7, stlVar.gh());
                        Location location = (Location) ijp.a(parcelGi, Location.CREATOR);
                        parcelGi.recycle();
                        ((nok) obj2).e(location);
                        break;
                    } else {
                        stl stlVar2 = (stl) suaVar.v();
                        sur surVar = new sur((nok) obj2, 1);
                        Parcel parcelGh2 = stlVar2.gh();
                        ijp.g(parcelGh2, lastLocationRequest);
                        ijp.i(parcelGh2, surVar);
                        stlVar2.gj(82, parcelGh2);
                        break;
                    }
                } else {
                    stl stlVar3 = (stl) suaVar.v();
                    LocationReceiver locationReceiver = new LocationReceiver(4, null, new sur((nok) obj2, 1), null, null);
                    Parcel parcelGh3 = stlVar3.gh();
                    ijp.g(parcelGh3, lastLocationRequest);
                    ijp.g(parcelGh3, locationReceiver);
                    stlVar3.gj(90, parcelGh3);
                    break;
                }
            case 10:
                int i = suq.a;
                sut sutVar = (sut) ((suu) obj).v();
                sur surVar2 = new sur((nok) obj2, 2, null);
                Parcel parcelGh4 = sutVar.gh();
                ijp.i(parcelGh4, surVar2);
                sutVar.gj(27, parcelGh4);
                break;
            case 11:
                int i2 = suq.a;
                break;
            default:
                svc svcVar = (svc) obj;
                svb svbVar = (svb) svcVar.v();
                suy suyVar = new suy((nok) obj2);
                Context context = svcVar.b;
                std stdVar = ssh.b;
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                Parcelable.Creator<ApiMetadata> creator = ApiMetadata.CREATOR;
                ApiMetadata apiMetadataJ = uqw.J(complianceOptions, false);
                Parcel parcelGh5 = svbVar.gh();
                ijp.i(parcelGh5, suyVar);
                ijp.g(parcelGh5, apiMetadataJ);
                svbVar.gk(1, parcelGh5);
                break;
        }
    }
}
