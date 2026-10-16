package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.SupportedVersionInfo;

/* loaded from: classes3.dex */
final class syw implements ServiceConnection {
    final /* synthetic */ syy a;
    private final syp b;

    public syw(syy syyVar, syp sypVar) {
        this.a = syyVar;
        this.b = sypVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        componentName.getClass();
        syy syyVar = this.a;
        synchronized (syyVar) {
            syyVar.c = null;
            syyVar.o();
            ((ype) syy.a.h()).y("onBindingDied: %s", componentName);
            lau.b(ywj.SERVICE_BINDING_DIED);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        ((ype) syy.a.f()).M("onServiceConnected: %s service=%s", componentName, iBinder);
        syy syyVar = this.a;
        synchronized (syyVar) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ICarAssistantProvider");
            qjd qjdVar = iInterfaceQueryLocalInterface instanceof qjd ? (qjd) iInterfaceQueryLocalInterface : new qjd(iBinder);
            syyVar.c = qjdVar;
            try {
                syp sypVar = this.b;
                Parcel parcelGi = qjdVar.gi(2, qjdVar.gh());
                SupportedVersionInfo supportedVersionInfo = (SupportedVersionInfo) ijp.a(parcelGi, SupportedVersionInfo.CREATOR);
                parcelGi.recycle();
                sypVar.a(supportedVersionInfo);
            } catch (RemoteException e) {
                ((ype) ((ype) syy.a.h()).p(e)).u("failed to handle assistant service connection");
                lau.b(ywj.SERVICE_UNAVAILABLE);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        ((ype) syy.a.f()).y("onServiceDisconnected: %s", componentName);
        syy syyVar = this.a;
        synchronized (syyVar) {
            syyVar.c = null;
            syyVar.o();
            this.b.b();
        }
    }
}
