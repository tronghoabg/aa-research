package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqi;
import defpackage.sqj;

/* loaded from: classes.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupQuery> CREATOR = new rcd(19);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        sqj sqhVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(iBinder);
        }
        this.g = (Context) sqi.a(sqhVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        if (str != null) {
            int iL2 = spu.l(parcel, 1);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        boolean z = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        sqi sqiVar = new sqi(this.g);
        int iL3 = spu.l(parcel, 4);
        parcel.writeStrongBinder(sqiVar);
        spu.m(parcel, iL3);
        boolean z3 = this.d;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.e;
        parcel.writeInt(262150);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.f;
        parcel.writeInt(262152);
        parcel.writeInt(z5 ? 1 : 0);
        spu.m(parcel, iL);
    }
}
