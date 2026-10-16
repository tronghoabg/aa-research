package D6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzblg;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import r7.C3934d;

/* renamed from: D6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0390p {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0367d0 f2474a;

    static {
        InterfaceC0367d0 c0365c0 = null;
        try {
            Object objNewInstance = C0388o.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c0365c0 = iInterfaceQueryLocalInterface instanceof InterfaceC0367d0 ? (InterfaceC0367d0) iInterfaceQueryLocalInterface : new C0365c0(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
                }
            } else {
                H6.l.f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            H6.l.f("Failed to instantiate ClientApi class.");
        }
        f2474a = c0365c0;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(InterfaceC0367d0 interfaceC0367d0);

    public final Object d(Context context, boolean z2) {
        boolean z10;
        Object objB;
        Object objC;
        if (!z2) {
            H6.f fVar = C0392q.f2477g.f2478a;
            if (d7.f.f34129b.d(context, 12451000) != 0) {
                H6.l.a("Google Play Services is not available.");
                z2 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(C3934d.a(context, ModuleDescriptor.MODULE_ID) <= C3934d.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbix.zza(context);
        if (((Boolean) zzbks.zza.zze()).booleanValue()) {
            z10 = false;
        } else {
            boolean z13 = z2 | z12;
            if (((Boolean) zzbks.zzb.zze()).booleanValue()) {
                z10 = true;
                z11 = true;
            } else {
                z11 = z13;
                z10 = false;
            }
        }
        InterfaceC0367d0 interfaceC0367d0 = f2474a;
        Object objC2 = null;
        if (z11) {
            if (interfaceC0367d0 != null) {
                try {
                    objC = c(interfaceC0367d0);
                } catch (RemoteException e7) {
                    H6.l.g("Cannot invoke local loader using ClientApi class.", e7);
                }
                if (objC == null && !z10) {
                    try {
                        objC2 = b();
                    } catch (RemoteException e10) {
                        H6.l.g("Cannot invoke remote loader.", e10);
                    }
                    objC = objC2;
                }
            } else {
                H6.l.f("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objC2 = b();
                objC = objC2;
            }
        } else {
            try {
                objB = b();
            } catch (RemoteException e11) {
                H6.l.g("Cannot invoke remote loader.", e11);
                objB = null;
            }
            if (objB == null) {
                int iIntValue = ((Long) zzblg.zza.zze()).intValue();
                C0392q c0392q = C0392q.f2477g;
                if (c0392q.f2482e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(HandleInvocationsFromAdViewer.KEY_ACTION, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c0392q.f2481d.f4927a;
                    H6.f fVar2 = c0392q.f2478a;
                    fVar2.getClass();
                    H6.f.a(context, str, bundle, new S3.e(fVar2, false, context, 6));
                }
            }
            if (objB == null) {
                if (interfaceC0367d0 != null) {
                    try {
                        objC2 = c(interfaceC0367d0);
                    } catch (RemoteException e12) {
                        H6.l.g("Cannot invoke local loader using ClientApi class.", e12);
                    }
                } else {
                    H6.l.f("ClientApi class cannot be loaded.");
                }
                objC = objC2;
            } else {
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}
