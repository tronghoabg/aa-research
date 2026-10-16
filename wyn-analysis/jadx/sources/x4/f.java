package x4;

import A.AbstractC0213f;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import e1.AbstractC2466a;
import e1.AbstractC2467b;
import j1.AbstractC3076d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import w4.InterfaceC4359a;

/* loaded from: classes.dex */
public final class f implements e, LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f47694a;

    /* renamed from: b, reason: collision with root package name */
    public final k f47695b;

    /* renamed from: c, reason: collision with root package name */
    public final h f47696c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f47697d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47698e = false;

    /* renamed from: f, reason: collision with root package name */
    public Location f47699f;

    /* renamed from: g, reason: collision with root package name */
    public String f47700g;

    /* renamed from: h, reason: collision with root package name */
    public l f47701h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC4359a f47702i;

    public f(Context context, h hVar) {
        this.f47694a = (LocationManager) context.getSystemService("location");
        this.f47696c = hVar;
        this.f47697d = context;
        this.f47695b = new k(context, hVar);
    }

    public static boolean f(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z10 = time < -120000;
        boolean z11 = time > 0;
        if (z2) {
            return true;
        }
        if (z10) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z12 = accuracy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z13 = accuracy < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z14 = accuracy > 200.0f;
        boolean zEquals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z13) {
            return true;
        }
        if (!z11 || z12) {
            return z11 && !z14 && zEquals;
        }
        return true;
    }

    @Override // x4.e
    public final void a(Activity activity, l lVar, InterfaceC4359a interfaceC4359a) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long j8;
        char c10;
        long j10;
        float f10;
        int i5;
        String str;
        if (!wg.b.a(this.f47697d)) {
            interfaceC4359a.onError(3);
            return;
        }
        this.f47701h = lVar;
        this.f47702i = interfaceC4359a;
        int i10 = 5;
        h hVar = this.f47696c;
        if (hVar != null) {
            float f11 = hVar.f47704b;
            int i11 = hVar.f47703a;
            if (i11 == 1) {
                j8 = Long.MAX_VALUE;
                j10 = Long.MAX_VALUE;
            } else {
                j8 = Long.MAX_VALUE;
                j10 = hVar.f47705c;
            }
            int iF = AbstractC0213f.f(i11);
            if (iF == 0 || iF == 1) {
                c10 = 2;
                i5 = 104;
            } else {
                c10 = 2;
                i5 = (iF == 3 || iF == 4 || iF == 5) ? 100 : 102;
            }
            f10 = f11;
            i10 = i11;
        } else {
            j8 = Long.MAX_VALUE;
            c10 = 2;
            j10 = 0;
            f10 = 0.0f;
            i5 = 102;
        }
        List<String> providers = this.f47694a.getProviders(true);
        if (i10 == 1) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f47700g = str;
        if (str == null) {
            interfaceC4359a.onError(3);
            return;
        }
        AbstractC3076d.b(j10, "intervalMillis");
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Locale locale = Locale.US;
            Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Float fValueOf2 = Float.valueOf(Float.MAX_VALUE);
            Object[] objArr = new Object[3];
            objArr[0] = "minUpdateDistanceMeters";
            objArr[1] = fValueOf;
            objArr[c10] = fValueOf2;
            throw new IllegalArgumentException(String.format(locale, "%s is out of range of [%f, %f] (too low)", objArr));
        }
        if (f10 > Float.MAX_VALUE) {
            Locale locale2 = Locale.US;
            Float fValueOf3 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Float fValueOf4 = Float.valueOf(Float.MAX_VALUE);
            Object[] objArr2 = new Object[3];
            objArr2[0] = "minUpdateDistanceMeters";
            objArr2[1] = fValueOf3;
            objArr2[c10] = fValueOf4;
            throw new IllegalArgumentException(String.format(locale2, "%s is out of range of [%f, %f] (too high)", objArr2));
        }
        AbstractC3076d.b(j10, "minUpdateIntervalMillis");
        boolean z2 = i5 == 104 || i5 == 102 || i5 == 100;
        Object[] objArr3 = {Integer.valueOf(i5)};
        if (!z2) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr3));
        }
        if (!((j10 == j8 && j10 == -1) ? false : true)) {
            throw new IllegalStateException("passive location requests must have an explicit minimum update interval");
        }
        e1.d dVar = new e1.d(f10, i5, j10, Math.min(j10, j10));
        this.f47698e = true;
        this.f47695b.b();
        String str2 = this.f47700g;
        Looper mainLooper = Looper.getMainLooper();
        int i12 = AbstractC2467b.f34398a;
        int i13 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f47694a;
        if (i13 >= 31) {
            AbstractC2466a.b(locationManager, str2, AbstractC2466a.c(dVar), new Y4.g(new Handler(mainLooper), 1), this);
            return;
        }
        try {
            if (xg.g.f47912c == null) {
                xg.g.f47912c = Class.forName("android.location.LocationRequest");
            }
            if (xg.g.f47913d == null) {
                Class[] clsArr = new Class[3];
                clsArr[0] = xg.g.f47912c;
                clsArr[1] = LocationListener.class;
                clsArr[c10] = Looper.class;
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", clsArr);
                xg.g.f47913d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest locationRequestA = dVar.a(str2);
            if (locationRequestA != null) {
                Method method = xg.g.f47913d;
                Object[] objArr4 = new Object[3];
                objArr4[0] = locationRequestA;
                objArr4[1] = this;
                objArr4[c10] = mainLooper;
                method.invoke(locationManager, objArr4);
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str2, dVar.f34400b, dVar.f34402d, this, mainLooper);
    }

    @Override // x4.e
    public final void b(Ka.b bVar, Ka.b bVar2) {
        LocationManager locationManager = this.f47694a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && f(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        bVar.a(location);
    }

    @Override // x4.e
    public final void c(com.google.android.gms.ads.nativead.l lVar) {
        if (this.f47694a == null) {
            ((tc.g) lVar.f26356b).a(Boolean.FALSE);
        } else {
            ((tc.g) lVar.f26356b).a(Boolean.valueOf(wg.b.a(this.f47697d)));
        }
    }

    @Override // x4.e
    public final boolean d(int i5, int i10) {
        return false;
    }

    @Override // x4.e
    public final void e() {
        this.f47698e = false;
        this.f47695b.c();
        this.f47694a.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i5) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            onLocationChanged((Location) list.get(i5));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f47700g)) {
            if (this.f47698e) {
                this.f47694a.removeUpdates(this);
            }
            InterfaceC4359a interfaceC4359a = this.f47702i;
            if (interfaceC4359a != null) {
                interfaceC4359a.onError(3);
            }
            this.f47700g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i5, Bundle bundle) {
        if (i5 != 2 && i5 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (f(location, this.f47699f)) {
            this.f47699f = location;
            if (this.f47701h != null) {
                this.f47695b.a(location);
                this.f47701h.a(this.f47699f);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }
}
