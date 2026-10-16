package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.waze.navigate.AddressItem;
import com.waze.navigate.location_preview.az;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5167a;

    public w(int i2) {
        this.f5167a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strN = null;
        boolean zT = false;
        switch (this.f5167a) {
            case 0:
                int iF = bb.F(parcel);
                String strN2 = null;
                IBinder iBinderI = null;
                boolean zT2 = false;
                boolean zT3 = false;
                boolean zT4 = false;
                boolean zT5 = false;
                boolean zT6 = false;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    switch (bb.C(i2)) {
                        case 1:
                            strN2 = bb.N(parcel, i2);
                            break;
                        case 2:
                            zT2 = bb.T(parcel, i2);
                            break;
                        case 3:
                            zT3 = bb.T(parcel, i2);
                            break;
                        case 4:
                            iBinderI = bb.I(parcel, i2);
                            break;
                        case 5:
                            zT4 = bb.T(parcel, i2);
                            break;
                        case 6:
                            zT5 = bb.T(parcel, i2);
                            break;
                        case 7:
                        default:
                            bb.S(parcel, i2);
                            break;
                        case 8:
                            zT6 = bb.T(parcel, i2);
                            break;
                    }
                }
                bb.R(parcel, iF);
                return new v(strN2, zT2, zT3, iBinderI, zT4, zT5, zT6);
            case 1:
                int iF2 = bb.F(parcel);
                PendingIntent pendingIntent = null;
                String strN3 = null;
                Integer numM = null;
                int iD = 0;
                int iD2 = 0;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    int iC = bb.C(i3);
                    if (iC == 1) {
                        iD = bb.D(parcel, i3);
                    } else if (iC == 2) {
                        iD2 = bb.D(parcel, i3);
                    } else if (iC == 3) {
                        pendingIntent = (PendingIntent) bb.J(parcel, i3, PendingIntent.CREATOR);
                    } else if (iC == 4) {
                        strN3 = bb.N(parcel, i3);
                    } else if (iC != 5) {
                        bb.S(parcel, i3);
                    } else {
                        numM = bb.M(parcel, i3);
                    }
                }
                bb.R(parcel, iF2);
                return new d(iD, iD2, pendingIntent, strN3, numM);
            case 2:
                int iF3 = bb.F(parcel);
                String strN4 = null;
                boolean zT7 = false;
                int iD3 = 0;
                int iD4 = 0;
                long jG = -1;
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    int iC2 = bb.C(i4);
                    if (iC2 == 1) {
                        zT7 = bb.T(parcel, i4);
                    } else if (iC2 == 2) {
                        strN4 = bb.N(parcel, i4);
                    } else if (iC2 == 3) {
                        iD3 = bb.D(parcel, i4);
                    } else if (iC2 == 4) {
                        iD4 = bb.D(parcel, i4);
                    } else if (iC2 != 5) {
                        bb.S(parcel, i4);
                    } else {
                        jG = bb.G(parcel, i4);
                    }
                }
                bb.R(parcel, iF3);
                return new x(zT7, strN4, iD3, iD4, jG);
            case 3:
                int iF4 = bb.F(parcel);
                IBinder iBinderI2 = null;
                boolean zT8 = false;
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    int iC3 = bb.C(i5);
                    if (iC3 == 1) {
                        strN = bb.N(parcel, i5);
                    } else if (iC3 == 2) {
                        iBinderI2 = bb.I(parcel, i5);
                    } else if (iC3 == 3) {
                        zT = bb.T(parcel, i5);
                    } else if (iC3 != 4) {
                        bb.S(parcel, i5);
                    } else {
                        zT8 = bb.T(parcel, i5);
                    }
                }
                bb.R(parcel, iF4);
                return new y(strN, iBinderI2, zT, zT8);
            case 4:
                h.g.b.x.f(parcel, "parcel");
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new com.waze.inbox.b(linkedHashMap);
            case 5:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.a.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                h.g.b.x.f(parcel, "parcel");
                com.waze.av.d.d dVarCreateFromParcel = com.waze.av.d.d.CREATOR.createFromParcel(parcel);
                int i8 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList.add(com.waze.av.d.c.CREATOR.createFromParcel(parcel));
                }
                return new com.waze.av.d.a(dVarCreateFromParcel, arrayList, parcel.readString());
            case 7:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.b(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 8:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.c(com.waze.av.d.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.waze.av.d.b.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
            case 9:
                h.g.b.x.f(parcel, "parcel");
                String string = parcel.readString();
                Parcelable.Creator<com.waze.av.d.d> creator = com.waze.av.d.d.CREATOR;
                return (com.waze.av.d.d) Enum.valueOf(com.waze.av.d.d.class, string);
            case 10:
                h.g.b.x.f(parcel, "parcel");
                String string2 = parcel.readString();
                Parcelable.Creator<com.waze.av.d.e> creator2 = com.waze.av.d.e.CREATOR;
                return (com.waze.av.d.e) Enum.valueOf(com.waze.av.d.e.class, string2);
            case 11:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.f(parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 12:
                h.g.b.x.f(parcel, "parcel");
                String string3 = parcel.readString();
                Parcelable.Creator<com.waze.av.d.j> creator3 = com.waze.av.d.j.CREATOR;
                return (com.waze.av.d.j) Enum.valueOf(com.waze.av.d.j.class, string3);
            case 13:
                h.g.b.x.f(parcel, "parcel");
                String string4 = parcel.readString();
                com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) parcel.readSerializable();
                com.waze.av.a.a aVar = (com.waze.av.a.a) parcel.readParcelable(com.waze.av.d.k.class.getClassLoader());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                com.waze.av.d.u uVarCreateFromParcel = parcel.readInt() == 0 ? null : com.waze.av.d.u.CREATOR.createFromParcel(parcel);
                com.waze.av.d.u uVarCreateFromParcel2 = parcel.readInt() == 0 ? null : com.waze.av.d.u.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(com.waze.av.d.o.CREATOR.createFromParcel(parcel));
                }
                ArrayList arrayList3 = arrayList2;
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList4.add(com.waze.av.d.s.CREATOR.createFromParcel(parcel));
                }
                ArrayList arrayList5 = arrayList4;
                com.waze.av.d.q qVarCreateFromParcel = com.waze.av.d.q.CREATOR.createFromParcel(parcel);
                String string13 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string14 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList6.add(com.waze.av.d.f.CREATOR.createFromParcel(parcel));
                }
                return new com.waze.av.d.k(string4, cVar, aVar, string5, string6, string7, string8, string9, string10, string11, string12, uVarCreateFromParcel, uVarCreateFromParcel2, arrayList3, arrayList5, qVarCreateFromParcel, string13, arrayListCreateStringArrayList, string14, arrayListCreateStringArrayList2, arrayList6, parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), com.waze.av.d.j.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.waze.av.d.r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0 ? com.waze.av.d.a.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            case 14:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.o(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? com.waze.av.d.u.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            case 15:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.p(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 16:
                h.g.b.x.f(parcel, "parcel");
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    com.waze.av.d.e eVarCreateFromParcel = com.waze.av.d.e.CREATOR.createFromParcel(parcel);
                    int i18 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(i18);
                    for (int i19 = 0; i19 != i18; i19++) {
                        arrayList7.add(com.waze.av.d.p.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap2.put(eVarCreateFromParcel, arrayList7);
                }
                return new com.waze.av.d.q(linkedHashMap2);
            case 17:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.r(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 18:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.s(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            case 19:
                h.g.b.x.f(parcel, "parcel");
                return new com.waze.av.d.u(parcel.readString(), parcel.readString());
            default:
                h.g.b.x.f(parcel, "parcel");
                AddressItem addressItem = (AddressItem) parcel.readParcelable(az.class.getClassLoader());
                int i20 = parcel.readInt();
                int i21 = parcel.readInt();
                int i22 = parcel.readInt();
                int i23 = parcel.readInt();
                int i24 = parcel.readInt();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z = parcel.readInt() != 0;
                AddressItem addressItem2 = (AddressItem) parcel.readParcelable(az.class.getClassLoader());
                String string15 = parcel.readString();
                com.waze.modules.navigation.ah ahVarA = parcel.readInt() != 0 ? com.waze.modules.navigation.ah.a(parcel.readString()) : null;
                boolean z2 = i24 != 0;
                boolean z3 = i23 != 0;
                return new az(addressItem, i20 != 0, i21 != 0, i22 != 0, z3, z2, numValueOf, z, addressItem2, string15, ahVarA, parcel.readString(), (com.waze.ads.a.f) parcel.readParcelable(az.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f5167a) {
            case 0:
                return new v[i2];
            case 1:
                return new d[i2];
            case 2:
                return new x[i2];
            case 3:
                return new y[i2];
            case 4:
                return new com.waze.inbox.b[i2];
            case 5:
                return new com.waze.av.a.a[i2];
            case 6:
                return new com.waze.av.d.a[i2];
            case 7:
                return new com.waze.av.d.b[i2];
            case 8:
                return new com.waze.av.d.c[i2];
            case 9:
                return new com.waze.av.d.d[i2];
            case 10:
                return new com.waze.av.d.e[i2];
            case 11:
                return new com.waze.av.d.f[i2];
            case 12:
                return new com.waze.av.d.j[i2];
            case 13:
                return new com.waze.av.d.k[i2];
            case 14:
                return new com.waze.av.d.o[i2];
            case 15:
                return new com.waze.av.d.p[i2];
            case 16:
                return new com.waze.av.d.q[i2];
            case 17:
                return new com.waze.av.d.r[i2];
            case 18:
                return new com.waze.av.d.s[i2];
            case 19:
                return new com.waze.av.d.u[i2];
            default:
                return new az[i2];
        }
    }
}
