package defpackage;

import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.CarAssistantEvent;
import com.google.android.gearhead.sdk.assistant.VoiceSessionResult;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qwr extends ijo implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwr(qrx qrxVar, int i) {
        super("com.google.android.gms.car.ICarMediaBrowserEventListener");
        this.a = i;
        this.b = new WeakReference(qrxVar);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        int i2 = this.a;
        if (i2 == 0) {
            if (i == 1) {
                String string = parcel.readString();
                int i3 = parcel.readInt();
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                qrx qrxVar = (qrx) ((WeakReference) this.b).get();
                if (qrxVar == null) {
                    return true;
                }
                Handler handler = (Handler) qrxVar.b;
                handler.sendMessage(handler.obtainMessage(2, i3, zJ ? 1 : 0, string));
                return true;
            }
            if (i != 2) {
                return false;
            }
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            ijp.d(parcel);
            qrx qrxVar2 = (qrx) ((WeakReference) this.b).get();
            if (qrxVar2 == null) {
                return true;
            }
            Handler handler2 = (Handler) qrxVar2.b;
            handler2.sendMessage(handler2.obtainMessage(1, i4, 0, string2));
            return true;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i != 2) {
                    return false;
                }
                ((smr) this.b).b(new swz(0));
                return true;
            }
            if (i != 2) {
                return false;
            }
            Status status = (Status) ijp.a(parcel, Status.CREATOR);
            SamplerDecisionParcelable samplerDecisionParcelable = (SamplerDecisionParcelable) ijp.a(parcel, SamplerDecisionParcelable.CREATOR);
            ijp.d(parcel);
            oni.l(status, samplerDecisionParcelable, (nok) this.b);
            return true;
        }
        switch (i) {
            case 1:
                CarAssistantEvent carAssistantEvent = (CarAssistantEvent) ijp.a(parcel, CarAssistantEvent.CREATOR);
                ijp.d(parcel);
                carAssistantEvent.getClass();
                ((wyd) this.b).q(carAssistantEvent);
                return true;
            case 2:
                ((wyd) this.b).r();
                return true;
            case 3:
                VoiceSessionResult voiceSessionResult = (VoiceSessionResult) ijp.a(parcel, VoiceSessionResult.CREATOR);
                ijp.d(parcel);
                voiceSessionResult.getClass();
                boolean zT = ((wyd) this.b).t(voiceSessionResult);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 4:
                ((ype) syy.a.g()).u("Unexpected call to onFocusLost");
                throw new UnsupportedOperationException();
            case 5:
                byte[] bArrH = ((wyd) this.b).p().h();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrH);
                return true;
            case 6:
                parcel2.writeNoException();
                ijp.i(parcel2, null);
                return true;
            case 7:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                abnp abnpVarN = otc.a.n();
                abnpVarN.t();
                otc otcVar = (otc) abnpVarN.b;
                otcVar.b |= 1;
                otcVar.c = zJ2;
                abnv abnvVarQ = abnpVarN.q();
                abnvVarQ.getClass();
                wyd.u((otc) abnvVarQ);
                return true;
            case 8:
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                abnp abnpVarN2 = otc.a.n();
                abnpVarN2.t();
                otc otcVar2 = (otc) abnpVarN2.b;
                otcVar2.b |= 2;
                otcVar2.d = zJ3;
                abnv abnvVarQ2 = abnpVarN2.q();
                abnvVarQ2.getClass();
                wyd.u((otc) abnvVarQ2);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwr(nok nokVar, int i) {
        super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        this.a = i;
        this.b = nokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwr(smr smrVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = smrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwr(wyd wydVar, int i) {
        super("com.google.android.gearhead.sdk.assistant.ICarAssistantClientCallbacks");
        this.a = i;
        this.b = wydVar;
    }
}
