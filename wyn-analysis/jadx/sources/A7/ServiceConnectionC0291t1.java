package A7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;
import com.vungle.ads.internal.protos.Sdk;
import m7.C3493a;

/* renamed from: A7.t1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC0291t1 implements ServiceConnection, InterfaceC1713b, InterfaceC1714c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f1065a;

    /* renamed from: b, reason: collision with root package name */
    public volatile K f1066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0271m1 f1067c;

    public ServiceConnectionC0291t1(C0271m1 c0271m1) {
        this.f1067c = c0271m1;
    }

    public final void a(Intent intent) {
        this.f1067c.c0();
        Context context = ((C0273n0) this.f1067c.f421a).f973a;
        C3493a c3493aB = C3493a.b();
        synchronized (this) {
            try {
                if (this.f1065a) {
                    this.f1067c.zzj().f612n.c("Connection attempt already in progress");
                    return;
                }
                this.f1067c.zzj().f612n.c("Using local app measurement service");
                this.f1065a = true;
                c3493aB.a(context, intent, this.f1067c.f953c, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        AbstractC1732v.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC1732v.i(this.f1066b);
                this.f1067c.zzl().m0(new RunnableC0288s1(this, (F) this.f1066b.getService(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f1066b = null;
                this.f1065a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        AbstractC1732v.e("MeasurementServiceConnection.onConnectionFailed");
        N n10 = ((C0273n0) this.f1067c.f421a).f981i;
        if (n10 == null || !n10.f435b) {
            n10 = null;
        }
        if (n10 != null) {
            n10.f608i.d("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f1065a = false;
            this.f1066b = null;
        }
        this.f1067c.zzl().m0(new RunnableC0294u1(this, 0));
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
        AbstractC1732v.e("MeasurementServiceConnection.onConnectionSuspended");
        C0271m1 c0271m1 = this.f1067c;
        c0271m1.zzj().f611m.c("Service connection suspended");
        c0271m1.zzl().m0(new RunnableC0294u1(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1732v.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f1065a = false;
                this.f1067c.zzj().f605f.c("Service connected with null binder");
                return;
            }
            F g9 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g9 = iInterfaceQueryLocalInterface instanceof F ? (F) iInterfaceQueryLocalInterface : new G(iBinder);
                    this.f1067c.zzj().f612n.c("Bound to IMeasurementService interface");
                } else {
                    this.f1067c.zzj().f605f.d("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f1067c.zzj().f605f.c("Service connect failed to get IMeasurementService");
            }
            if (g9 == null) {
                this.f1065a = false;
                try {
                    C3493a c3493aB = C3493a.b();
                    C0271m1 c0271m1 = this.f1067c;
                    c3493aB.c(((C0273n0) c0271m1.f421a).f973a, c0271m1.f953c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f1067c.zzl().m0(new RunnableC0288s1(this, g9, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1732v.e("MeasurementServiceConnection.onServiceDisconnected");
        C0271m1 c0271m1 = this.f1067c;
        c0271m1.zzj().f611m.c("Service disconnected");
        c0271m1.zzl().m0(new RunnableC0278p(11, this, componentName));
    }
}
