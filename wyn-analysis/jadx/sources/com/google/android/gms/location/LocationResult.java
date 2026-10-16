package com.google.android.gms.location;

import Y0.b;
import a.AbstractC1304a;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.identity.zzeo;
import com.unity3d.services.UnityAdsConstants;
import e1.AbstractC2466a;
import f7.AbstractC2614a;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import w7.C4381i;
import x7.v;

/* loaded from: classes4.dex */
public final class LocationResult extends AbstractC2614a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f26740a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f26739b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new C4381i(12);

    public LocationResult(List list) {
        this.f26740a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i5 = Build.VERSION.SDK_INT;
        List<Location> list = this.f26740a;
        if (i5 >= 31) {
            return list.equals(locationResult.f26740a);
        }
        if (list.size() != locationResult.f26740a.size()) {
            return false;
        }
        Iterator it = locationResult.f26740a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !AbstractC1732v.m(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26740a});
    }

    public final String toString() {
        boolean zG;
        boolean zH;
        float fE;
        boolean zI;
        float f10;
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = v.f47821a;
        List<Location> list = this.f26740a;
        int i5 = 100;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        boolean z2 = false;
        for (Location location : list) {
            sb2.ensureCapacity(i5);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append("{");
                sb2.append(location.getProvider());
                sb2.append(", ");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31 ? AbstractC2466a.a(location) : location.isFromMockProvider()) {
                    sb2.append("mock, ");
                }
                DecimalFormat decimalFormat2 = v.f47821a;
                sb2.append(decimalFormat2.format(location.getLatitude()));
                sb2.append(",");
                sb2.append(decimalFormat2.format(location.getLongitude()));
                boolean zHasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = v.f47822b;
                if (zHasAccuracy) {
                    sb2.append("±");
                    sb2.append(decimalFormat3.format(location.getAccuracy()));
                    sb2.append("m");
                }
                boolean zHasAltitude = location.hasAltitude();
                float fB = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (zHasAltitude) {
                    sb2.append(", alt=");
                    sb2.append(decimalFormat3.format(location.getAltitude()));
                    if (i10 >= 26) {
                        zI = b.i(location);
                    } else {
                        Bundle extras = location.getExtras();
                        zI = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (zI) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            f10 = b.f(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            f10 = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        sb2.append(decimalFormat3.format(f10));
                    }
                    sb2.append("m");
                }
                if (location.hasSpeed()) {
                    sb2.append(", spd=");
                    sb2.append(decimalFormat3.format(location.getSpeed()));
                    if (i10 >= 26) {
                        zH = b.h(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        zH = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (zH) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            fE = b.e(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            fE = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        sb2.append(decimalFormat3.format(fE));
                    }
                    sb2.append("m/s");
                }
                if (location.hasBearing()) {
                    sb2.append(", brg=");
                    sb2.append(decimalFormat3.format(location.getBearing()));
                    if (i10 >= 26) {
                        zG = b.g(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        zG = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (zG) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            fB = b.b(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                fB = extras6.getFloat("bearingAccuracy", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                        }
                        sb2.append(decimalFormat3.format(fB));
                    }
                    sb2.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string != null) {
                    sb2.append(", fl=");
                    sb2.append(string);
                }
                Bundle extras8 = location.getExtras();
                String string2 = extras8 != null ? extras8.getString("levelId") : null;
                if (string2 != null) {
                    sb2.append(", lv=");
                    sb2.append(string2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(", ert=");
                sb2.append(zzeo.zza(TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis));
                sb2.append('}');
            }
            sb2.append(", ");
            z2 = true;
            i5 = 100;
        }
        if (z2) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f26740a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
