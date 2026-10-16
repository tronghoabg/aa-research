package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.spu;
import defpackage.spw;
import defpackage.sqy;
import defpackage.stf;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestInternal> CREATOR = new sqy(20);
    LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        stf stfVar = new stf(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    spw.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            stfVar.c = workSource;
        }
        if (z) {
            stfVar.c(1);
        }
        if (z2) {
            stfVar.f(2);
        }
        if (z3) {
            stfVar.b = true;
        }
        if (z4) {
            stfVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            stfVar.d(j);
        }
        this.a = stfVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return Objects.equals(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.m(parcel, iL);
    }
}
