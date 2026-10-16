package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.waze.navigate.AddressItem;
import com.waze.planned_drive.bj;
import com.waze.reports_v2.b.at;
import com.waze.search.v2.di;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    private static final n f4874b = new n(1, null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4875a;

    public n(int i2) {
        this.f4875a = i2;
    }

    public static n a() {
        return f4874b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strN = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        boolean zT = false;
        switch (this.f4875a) {
            case 0:
                int iF = bb.F(parcel);
                boolean zT2 = true;
                int iD4 = 0;
                int iD5 = 0;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    int iC = bb.C(i2);
                    if (iC == 1) {
                        iD = bb.D(parcel, i2);
                    } else if (iC == 2) {
                        iD4 = bb.D(parcel, i2);
                    } else if (iC == 3) {
                        iD5 = bb.D(parcel, i2);
                    } else if (iC != 4) {
                        bb.S(parcel, i2);
                    } else {
                        zT2 = bb.T(parcel, i2);
                    }
                }
                bb.R(parcel, iF);
                return new m(iD, iD4, iD5, zT2);
            case 1:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return k.a();
                }
                int iF2 = bb.F(parcel);
                m mVar = null;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    int iC2 = bb.C(i3);
                    if (iC2 == 1) {
                        mVar = (m) bb.J(parcel, i3, m.CREATOR);
                    } else if (iC2 != 2) {
                        bb.S(parcel, i3);
                    } else {
                        zT = bb.T(parcel, i3);
                    }
                }
                bb.R(parcel, iF2);
                return new k(mVar, zT);
            case 2:
                int iF3 = bb.F(parcel);
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    int iC3 = bb.C(i4);
                    if (iC3 == 1) {
                        iD3 = bb.D(parcel, i4);
                    } else if (iC3 != 2) {
                        bb.S(parcel, i4);
                    } else {
                        strN = bb.N(parcel, i4);
                    }
                }
                bb.R(parcel, iF3);
                return new Scope(iD3, strN);
            case 3:
                String strN2 = null;
                int iF4 = bb.F(parcel);
                PendingIntent pendingIntent = null;
                com.google.android.gms.common.d dVar = null;
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    int iC4 = bb.C(i5);
                    if (iC4 == 1) {
                        iD2 = bb.D(parcel, i5);
                    } else if (iC4 == 2) {
                        strN2 = bb.N(parcel, i5);
                    } else if (iC4 == 3) {
                        pendingIntent = (PendingIntent) bb.J(parcel, i5, PendingIntent.CREATOR);
                    } else if (iC4 != 4) {
                        bb.S(parcel, i5);
                    } else {
                        dVar = (com.google.android.gms.common.d) bb.J(parcel, i5, com.google.android.gms.common.d.CREATOR);
                    }
                }
                bb.R(parcel, iF4);
                return new Status(iD2, strN2, pendingIntent, dVar);
            case 4:
                h.g.b.x.f(parcel, "parcel");
                AddressItem addressItem = (AddressItem) parcel.readParcelable(com.waze.planned_drive.s.class.getClassLoader());
                AddressItem addressItem2 = (AddressItem) parcel.readParcelable(com.waze.planned_drive.s.class.getClassLoader());
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                String string = parcel.readString();
                bj bjVar = bj.f33256a;
                return new com.waze.planned_drive.s(addressItem, addressItem2, i6 != 0, i7 != 0, i8 != 0, (bj) Enum.valueOf(bj.class, string));
            case 5:
                h.g.b.x.f(parcel, "parcel");
                int i9 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
                return new com.waze.planned_drive.histogram.f(arrayList, parcel.readLong(), parcel.readLong());
            case 6:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.reports_v2.a.a.a.a(parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                h.g.b.x.f(parcel, "parcel");
                return com.waze.reports_v2.b.q.a(parcel.readString());
            case 8:
                h.g.b.x.f(parcel, "parcel");
                return at.a(parcel.readString());
            case 9:
                h.g.b.x.f(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                com.waze.av.d.k kVar = (com.waze.av.d.k) parcel.readParcelable(di.class.getClassLoader());
                String string5 = parcel.readString();
                com.waze.search.v2.q qVar = com.waze.search.v2.q.f36607a;
                return new di(string2, string3, string4, kVar, (com.waze.search.v2.q) Enum.valueOf(com.waze.search.v2.q.class, string5), parcel.readString());
            case 10:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.sharedui.utils.h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
            case 11:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.sharedui.utils.i(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
            case 12:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.sharedui.utils.j((Uri) parcel.readParcelable(com.waze.sharedui.utils.j.class.getClassLoader()));
            default:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.sharedui.utils.l((Uri) parcel.readParcelable(com.waze.sharedui.utils.l.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4875a) {
            case 0:
                return new m[i2];
            case 1:
                return new k[i2];
            case 2:
                return new Scope[i2];
            case 3:
                return new Status[i2];
            case 4:
                return new com.waze.planned_drive.s[i2];
            case 5:
                return new com.waze.planned_drive.histogram.f[i2];
            case 6:
                return new com.waze.reports_v2.a.a.a.a[i2];
            case 7:
                return new com.waze.reports_v2.b.q[i2];
            case 8:
                return new at[i2];
            case 9:
                return new di[i2];
            case 10:
                return new com.waze.sharedui.utils.h[i2];
            case 11:
                return new com.waze.sharedui.utils.i[i2];
            case 12:
                return new com.waze.sharedui.utils.j[i2];
            default:
                return new com.waze.sharedui.utils.l[i2];
        }
    }

    private n(int i2, byte[] bArr) {
        this.f4875a = i2;
    }
}
