package x4;

import A.AbstractC0213f;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.internal.identity.zzda;
import com.google.android.gms.location.LocationRequest;
import com.unity3d.services.UnityAdsConstants;
import java.security.SecureRandom;
import java.util.ArrayList;
import o1.C3641c;
import w4.InterfaceC4359a;
import x7.o;
import x7.p;
import x7.z;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4469b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47682a;

    /* renamed from: b, reason: collision with root package name */
    public final C4468a f47683b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbi f47684c;

    /* renamed from: d, reason: collision with root package name */
    public final k f47685d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47686e;

    /* renamed from: f, reason: collision with root package name */
    public final h f47687f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4359a f47688g;

    /* renamed from: h, reason: collision with root package name */
    public l f47689h;

    public C4469b(Context context, h hVar) {
        int iNextInt;
        this.f47682a = context;
        int i5 = o.f47805a;
        this.f47684c = new zzbi(context);
        this.f47687f = hVar;
        this.f47685d = new k(context, hVar);
        synchronized (this) {
            iNextInt = new SecureRandom().nextInt(65536);
        }
        this.f47686e = iNextInt;
        this.f47683b = new C4468a(this, hVar, context);
    }

    public static LocationRequest f(h hVar) {
        float f10;
        long j8;
        long jMin;
        long j10;
        long j11;
        int i5 = 104;
        int i10 = 102;
        if (Build.VERSION.SDK_INT < 33) {
            LocationRequest locationRequestV = LocationRequest.V();
            if (hVar == null) {
                return locationRequestV;
            }
            int iF = AbstractC0213f.f(hVar.f47703a);
            if (iF == 0) {
                i5 = 105;
            } else if (iF != 1) {
                i5 = iF != 2 ? 100 : 102;
            }
            z.b(i5);
            locationRequestV.f26726a = i5;
            long j12 = hVar.f47705c;
            locationRequestV.X(j12);
            long j13 = j12 / 2;
            AbstractC1732v.c(j13 >= 0, "illegal fastest interval: %d", Long.valueOf(j13));
            locationRequestV.f26728c = j13;
            float f11 = hVar.f47704b;
            if (f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                locationRequestV.f26732g = f11;
                return locationRequestV;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 22);
            sb2.append("invalid displacement: ");
            sb2.append(f11);
            throw new IllegalArgumentException(sb2.toString());
        }
        AbstractC1732v.a("intervalMillis must be greater than or equal to 0", 0 >= 0);
        if (hVar != null) {
            int iF2 = AbstractC0213f.f(hVar.f47703a);
            if (iF2 == 0) {
                i5 = 105;
            } else if (iF2 != 1) {
                i5 = iF2 != 2 ? 100 : 102;
            }
            z.b(i5);
            j8 = hVar.f47705c;
            AbstractC1732v.a("intervalMillis must be greater than or equal to 0", j8 >= 0);
            AbstractC1732v.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j8 == -1 || j8 >= 0);
            float f12 = hVar.f47704b;
            AbstractC1732v.a("minUpdateDistanceMeters must be greater than or equal to 0", f12 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f10 = f12;
            i10 = i5;
            jMin = j8;
            j10 = -1;
        } else {
            f10 = 0.0f;
            j8 = 0;
            jMin = -1;
            j10 = -1;
        }
        if (jMin == j10) {
            j11 = j8;
        } else {
            if (i10 != 105) {
                jMin = Math.min(jMin, j8);
            }
            j11 = jMin;
        }
        return new LocationRequest(i10, j8, j11, Math.max(0L, j8), Long.MAX_VALUE, Long.MAX_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, f10, true, j10 == j10 ? j8 : j10, 0, 0, false, new WorkSource(null), null);
    }

    @Override // x4.e
    public final void a(Activity activity, l lVar, InterfaceC4359a interfaceC4359a) {
        this.f47689h = lVar;
        this.f47688g = interfaceC4359a;
        LocationRequest locationRequestF = f(this.f47687f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequestF);
        p pVar = new p(arrayList, false, false);
        int i5 = o.f47805a;
        new zzda(this.f47682a).checkLocationSettings(pVar).addOnSuccessListener(new C3641c(this, 11)).addOnFailureListener(new A5.g(this, activity, interfaceC4359a, 24));
    }

    @Override // x4.e
    public final void b(Ka.b bVar, Ka.b bVar2) {
        this.f47684c.getLastLocation().addOnSuccessListener(new C3641c(bVar, 12)).addOnFailureListener(new C3641c(bVar2, 13));
    }

    @Override // x4.e
    public final void c(com.google.android.gms.ads.nativead.l lVar) {
        int i5 = o.f47805a;
        new zzda(this.f47682a).checkLocationSettings(new p(new ArrayList(), false, false)).addOnCompleteListener(new C3641c(lVar, 10));
    }

    @Override // x4.e
    public final boolean d(int i5, int i10) {
        if (i5 == this.f47686e) {
            if (i10 == -1) {
                h hVar = this.f47687f;
                if (hVar != null && this.f47689h != null && this.f47688g != null) {
                    g(hVar);
                    return true;
                }
            } else {
                InterfaceC4359a interfaceC4359a = this.f47688g;
                if (interfaceC4359a != null) {
                    interfaceC4359a.onError(3);
                }
            }
        }
        return false;
    }

    @Override // x4.e
    public final void e() {
        this.f47685d.c();
        this.f47684c.removeLocationUpdates(this.f47683b);
    }

    public final void g(h hVar) {
        LocationRequest locationRequestF = f(hVar);
        this.f47685d.b();
        this.f47684c.requestLocationUpdates(locationRequestF, this.f47683b, Looper.getMainLooper());
    }
}
