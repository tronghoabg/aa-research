package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes3.dex */
public final class zzbvf extends zzbvi {
    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvm zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvf.class.getClassLoader());
                if (J6.e.class.isAssignableFrom(cls)) {
                    return new zzbwk((J6.e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (J6.a.class.isAssignableFrom(cls)) {
                    return new zzbwk((J6.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                H6.l.f(sb2.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Could not instantiate mediation adapter: ");
                sb3.append(str);
                sb3.append(". ");
                H6.l.g(sb3.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            H6.l.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzbwk(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzbwk(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzc(String str) throws RemoteException {
        try {
            return K6.a.class.isAssignableFrom(Class.forName(str, false, zzbvf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            H6.l.f(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzd(String str) throws RemoteException {
        try {
            return J6.a.class.isAssignableFrom(Class.forName(str, false, zzbvf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            H6.l.f(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbxi zze(String str) throws RemoteException {
        return new zzbxv((RtbAdapter) Class.forName(str, false, zzbxm.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }
}
