package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;
import p7.AbstractC3771a;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1717f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AbstractC3771a zzB;
    private d7.b zzC;
    private boolean zzD;
    private volatile T zzE;
    Y zza;
    final Handler zzb;
    protected InterfaceC1715d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC1724m zzn;
    private final d7.f zzo;
    private final Object zzp;
    private final Object zzq;
    private r zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private P zzu;
    private int zzv;
    private final InterfaceC1713b zzw;
    private final InterfaceC1714c zzx;
    private final int zzy;
    private final String zzz;
    private static final d7.d[] zze = new d7.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1717f(Context context, Looper looper, InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c, int i5) {
        X xA = AbstractC1724m.a(context);
        d7.f fVar = d7.f.f34129b;
        AbstractC1732v.i(interfaceC1713b);
        AbstractC1732v.i(interfaceC1714c);
        this(context, looper, xA, fVar, i5, interfaceC1713b, interfaceC1714c, null);
    }

    public final void a(int i5, IInterface iInterface) {
        Y y10;
        AbstractC1732v.b((i5 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i5;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i5 == 1) {
                    P p10 = this.zzu;
                    if (p10 != null) {
                        AbstractC1724m abstractC1724m = this.zzn;
                        String str = this.zza.f26636a;
                        AbstractC1732v.i(str);
                        String str2 = this.zza.f26637b;
                        zza();
                        boolean z2 = this.zza.f26638c;
                        abstractC1724m.getClass();
                        abstractC1724m.d(new U(str, str2, z2), p10);
                        this.zzu = null;
                    }
                } else if (i5 == 2 || i5 == 3) {
                    P p11 = this.zzu;
                    if (p11 != null && (y10 = this.zza) != null) {
                        String str3 = y10.f26636a;
                        String str4 = y10.f26637b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str3);
                        sb2.append(" on ");
                        sb2.append(str4);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC1724m abstractC1724m2 = this.zzn;
                        String str5 = this.zza.f26636a;
                        AbstractC1732v.i(str5);
                        String str6 = this.zza.f26637b;
                        zza();
                        boolean z10 = this.zza.f26638c;
                        abstractC1724m2.getClass();
                        abstractC1724m2.d(new U(str5, str6, z10), p11);
                        this.zzd.incrementAndGet();
                    }
                    P p12 = new P(this, this.zzd.get());
                    this.zzu = p12;
                    Y y11 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new Y(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new Y(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = y11;
                    if (y11.f26638c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f26636a)));
                    }
                    AbstractC1724m abstractC1724m3 = this.zzn;
                    String str7 = this.zza.f26636a;
                    AbstractC1732v.i(str7);
                    d7.b bVarC = abstractC1724m3.c(new U(str7, this.zza.f26637b, this.zza.f26638c), p12, zza(), getBindServiceExecutor());
                    if (!bVarC.V()) {
                        Y y12 = this.zza;
                        String str8 = y12.f26636a;
                        String str9 = y12.f26637b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str8);
                        sb3.append(" on ");
                        sb3.append(str9);
                        Log.w("GmsClient", sb3.toString());
                        int i10 = bVarC.f34115b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (bVarC.f34116c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, bVarC.f34116c);
                        }
                        zzb(i10, bundle, this.zzd.get());
                    }
                } else if (i5 == 4) {
                    AbstractC1732v.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iD = this.zzo.d(this.zzl, getMinApkVersion());
        if (iD == 0) {
            connect(new C1733w(this));
        } else {
            a(1, null);
            triggerNotAvailable(new C1733w(this), iD, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC1715d interfaceC1715d) {
        AbstractC1732v.j(interfaceC1715d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1715d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((G) arrayList.get(i5)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i5;
        IInterface iInterface;
        r rVar;
        long j8;
        synchronized (this.zzp) {
            i5 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            rVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i5 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i5 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i5 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i5 == 4) {
            printWriter.print("CONNECTED");
        } else if (i5 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (rVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(rVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j10));
            j8 = 0;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(str2).length());
            sb2.append(j10);
            sb2.append(StringUtils.SPACE);
            sb2.append(str2);
            printWriterAppend.println(sb2.toString());
        } else {
            j8 = 0;
        }
        if (this.zzg > j8) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.zzf;
            if (i10 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i10 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i10 != 3) {
                printWriter.append((CharSequence) String.valueOf(i10));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(str3).length());
            sb3.append(j11);
            sb3.append(StringUtils.SPACE);
            sb3.append(str3);
            printWriterAppend2.println(sb3.toString());
        }
        if (this.zzj > j8) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x7.z.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(str4).length());
            sb4.append(j12);
            sb4.append(StringUtils.SPACE);
            sb4.append(str4);
            printWriterAppend3.println(sb4.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public d7.d[] getApiFeatures() {
        return zze;
    }

    public AbstractC3771a getAttributionSourceWrapper() {
        return null;
    }

    public final d7.d[] getAvailableFeatures() {
        T t10 = this.zzE;
        if (t10 == null) {
            return null;
        }
        return t10.f26615b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        Y y10;
        if (!isConnected() || (y10 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return y10.f26637b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return d7.f.f34128a;
    }

    public void getRemoteService(InterfaceC1726o interfaceC1726o, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i5 = this.zzy;
        int i10 = d7.f.f34128a;
        Scope[] scopeArr = C1722k.f26658o;
        Bundle bundle = new Bundle();
        d7.d[] dVarArr = C1722k.f26659p;
        C1722k c1722k = new C1722k(6, i5, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1722k.f26663d = this.zzl.getPackageName();
        c1722k.f26666g = getServiceRequestExtraArgs;
        if (set != null) {
            c1722k.f26665f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c1722k.f26667h = account;
            if (interfaceC1726o != null) {
                c1722k.f26664e = interfaceC1726o.asBinder();
            }
        } else if (requiresAccount()) {
            c1722k.f26667h = getAccount();
        }
        c1722k.f26668i = zze;
        c1722k.f26669j = getApiFeatures();
        if (usesClientTelemetry()) {
            c1722k.f26671m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    r rVar = this.zzr;
                    if (rVar != null) {
                        ((H) rVar).R(new O(this, this.zzd.get()), c1722k);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            triggerConnectionSuspended(3);
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface2 = this.zzs;
                AbstractC1732v.j(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                r rVar = this.zzr;
                if (rVar == null) {
                    return null;
                }
                return rVar.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C1721j getTelemetryConfiguration() {
        T t10 = this.zzE;
        if (t10 == null) {
            return null;
        }
        return t10.f26617d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.zzp) {
            z2 = this.zzv == 4;
        }
        return z2;
    }

    public boolean isConnecting() {
        boolean z2;
        synchronized (this.zzp) {
            int i5 = this.zzv;
            z2 = true;
            if (i5 != 2 && i5 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(d7.b bVar) {
        this.zzi = bVar.f34115b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i5) {
        this.zzf = i5;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i5, IBinder iBinder, Bundle bundle, int i10) {
        Q q4 = new Q(this, i5, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i10, -1, q4));
    }

    public void onUserSignOut(InterfaceC1716e interfaceC1716e) {
        ad.L l10 = (ad.L) interfaceC1716e;
        ((com.google.android.gms.common.api.internal.H) l10.f17515b).f26465m.f26543n.post(new A7.V(l10, 27));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i5) {
        int i10 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, i5));
    }

    public void triggerNotAvailable(InterfaceC1715d interfaceC1715d, int i5, PendingIntent pendingIntent) {
        AbstractC1732v.j(interfaceC1715d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1715d;
        int i10 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i10, i5, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i5, Bundle bundle, int i10) {
        S s10 = new S(this, i5, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i10, -1, s10));
    }

    public final void zzc(T t10) {
        this.zzE = t10;
        if (usesClientTelemetry()) {
            C1721j c1721j = t10.f26617d;
            C1733w c1733wC = C1733w.c();
            C1734x c1734x = c1721j == null ? null : c1721j.f26652a;
            synchronized (c1733wC) {
                if (c1734x == null) {
                    c1733wC.f26696a = C1733w.f26695c;
                    return;
                }
                C1734x c1734x2 = (C1734x) c1733wC.f26696a;
                if (c1734x2 == null || c1734x2.f26697a < c1734x.f26697a) {
                    c1733wC.f26696a = c1734x;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i5, IInterface iInterface) {
        a(i5, null);
    }

    public final /* synthetic */ boolean zze(int i5, int i10, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i5) {
                    return false;
                }
                a(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i5) {
        int i10;
        int i11;
        synchronized (this.zzp) {
            i10 = this.zzv;
        }
        if (i10 == 3) {
            this.zzD = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i11, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() throws ClassNotFoundException {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(r rVar) {
        this.zzr = rVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ InterfaceC1713b zzk() {
        return this.zzw;
    }

    public final /* synthetic */ InterfaceC1714c zzl() {
        return this.zzx;
    }

    public final /* synthetic */ d7.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(d7.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public AbstractC1717f(Context context, Looper looper, X x5, d7.f fVar, int i5, InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        AbstractC1732v.j(context, "Context must not be null");
        this.zzl = context;
        AbstractC1732v.j(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC1732v.j(x5, "Supervisor must not be null");
        this.zzn = x5;
        AbstractC1732v.j(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new N(this, looper);
        this.zzy = i5;
        this.zzw = interfaceC1713b;
        this.zzx = interfaceC1714c;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(AbstractC3771a abstractC3771a) {
    }
}
