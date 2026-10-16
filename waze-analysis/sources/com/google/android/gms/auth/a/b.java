package com.google.android.gms.auth.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.l.i;
import com.google.android.gms.l.j;
import com.google.firebase.messaging.z;
import com.waze.AlerterController$Alerter$Type;
import com.waze.asks.as;
import com.waze.asks.aw;
import com.waze.k;
import com.waze.reports_v2.b.at;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4408a;

    public b(int i2) {
        this.f4408a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        com.waze.ads.a.e eVar;
        ArrayList arrayListO = null;
        Bundle bundleH = null;
        ArrayList arrayListO2 = null;
        ArrayList arrayListP = null;
        byte[] bArrU = null;
        byte[] bArrU2 = null;
        Bundle bundleH2 = null;
        ArrayList arrayListO3 = null;
        byte[] bArrU3 = null;
        switch (this.f4408a) {
            case 0:
                int iF = bb.F(parcel);
                boolean zT = false;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    int iC = bb.C(i2);
                    if (iC == 1) {
                        arrayListO = bb.O(parcel, i2);
                    } else if (iC != 2) {
                        bb.S(parcel, i2);
                    } else {
                        zT = bb.T(parcel, i2);
                    }
                }
                bb.R(parcel, iF);
                return new a(arrayListO, zT);
            case 1:
                String strN = null;
                int iF2 = bb.F(parcel);
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    int iC2 = bb.C(i3);
                    if (iC2 == 1) {
                        bArrU3 = bb.U(parcel, i3);
                    } else if (iC2 != 2) {
                        bb.S(parcel, i3);
                    } else {
                        strN = bb.N(parcel, i3);
                    }
                }
                bb.R(parcel, iF2);
                return new e(bArrU3, strN);
            case 2:
                int iF3 = bb.F(parcel);
                boolean zT2 = false;
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    int iC3 = bb.C(i4);
                    if (iC3 == 1) {
                        arrayListO3 = bb.O(parcel, i4);
                    } else if (iC3 != 2) {
                        bb.S(parcel, i4);
                    } else {
                        zT2 = bb.T(parcel, i4);
                    }
                }
                bb.R(parcel, iF3);
                return new d(arrayListO3, zT2);
            case 3:
                ArrayList arrayListP2 = null;
                int iF4 = bb.F(parcel);
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    int iC4 = bb.C(i5);
                    if (iC4 == 1) {
                        bundleH2 = bb.H(parcel, i5);
                    } else if (iC4 != 2) {
                        bb.S(parcel, i5);
                    } else {
                        arrayListP2 = bb.P(parcel, i5, e.CREATOR);
                    }
                }
                bb.R(parcel, iF4);
                return new f(bundleH2, arrayListP2);
            case 4:
                int iF5 = bb.F(parcel);
                String strN2 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                boolean zT3 = false;
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    int iC5 = bb.C(i6);
                    if (iC5 == 1) {
                        bArrU2 = bb.U(parcel, i6);
                    } else if (iC5 == 2) {
                        zT3 = bb.T(parcel, i6);
                    } else if (iC5 != 3) {
                        bb.S(parcel, i6);
                    } else {
                        strN2 = bb.N(parcel, i6);
                    }
                }
                bb.R(parcel, iF5);
                return new h(bArrU2, zT3, strN2);
            case 5:
                int iF6 = bb.F(parcel);
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    if (bb.C(i7) != 2) {
                        bb.S(parcel, i7);
                    } else {
                        bArrU = bb.U(parcel, i7);
                    }
                }
                bb.R(parcel, iF6);
                return new com.google.android.gms.l.c(bArrU);
            case 6:
                int iF7 = bb.F(parcel);
                String strN3 = null;
                byte[] bArrU4 = null;
                byte[][] bArrY = null;
                byte[][] bArrY2 = null;
                byte[][] bArrY3 = null;
                byte[][] bArrY4 = null;
                int[] iArrV = null;
                byte[][] bArrY5 = null;
                int[] iArrV2 = null;
                byte[][] bArrY6 = null;
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    switch (bb.C(i8)) {
                        case 2:
                            strN3 = bb.N(parcel, i8);
                            break;
                        case 3:
                            bArrU4 = bb.U(parcel, i8);
                            break;
                        case 4:
                            bArrY = bb.Y(parcel, i8);
                            break;
                        case 5:
                            bArrY2 = bb.Y(parcel, i8);
                            break;
                        case 6:
                            bArrY3 = bb.Y(parcel, i8);
                            break;
                        case 7:
                            bArrY4 = bb.Y(parcel, i8);
                            break;
                        case 8:
                            iArrV = bb.V(parcel, i8);
                            break;
                        case 9:
                            bArrY5 = bb.Y(parcel, i8);
                            break;
                        case 10:
                            iArrV2 = bb.V(parcel, i8);
                            break;
                        case 11:
                            bArrY6 = bb.Y(parcel, i8);
                            break;
                        default:
                            bb.S(parcel, i8);
                            break;
                    }
                }
                bb.R(parcel, iF7);
                return new com.google.android.gms.l.d(strN3, bArrU4, bArrY, bArrY2, bArrY3, bArrY4, iArrV, bArrY5, iArrV2, bArrY6);
            case 7:
                String strN4 = null;
                int iF8 = bb.F(parcel);
                com.google.android.gms.l.f fVar = null;
                String strN5 = null;
                boolean zT4 = false;
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    int iC6 = bb.C(i9);
                    if (iC6 == 2) {
                        strN5 = bb.N(parcel, i9);
                    } else if (iC6 == 3) {
                        strN4 = bb.N(parcel, i9);
                    } else if (iC6 == 4) {
                        fVar = (com.google.android.gms.l.f) bb.J(parcel, i9, com.google.android.gms.l.f.CREATOR);
                    } else if (iC6 != 5) {
                        bb.S(parcel, i9);
                    } else {
                        zT4 = bb.T(parcel, i9);
                    }
                }
                bb.R(parcel, iF8);
                return new com.google.android.gms.l.h(strN5, strN4, fVar, zT4);
            case 8:
                int iF9 = bb.F(parcel);
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    if (bb.C(i10) != 2) {
                        bb.S(parcel, i10);
                    } else {
                        arrayListP = bb.P(parcel, i10, com.google.android.gms.l.h.CREATOR);
                    }
                }
                bb.R(parcel, iF9);
                return new i(arrayListP);
            case 9:
                int iF10 = bb.F(parcel);
                int iD = 0;
                int iD2 = 0;
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    int iC7 = bb.C(i11);
                    if (iC7 == 1) {
                        iD2 = bb.D(parcel, i11);
                    } else if (iC7 != 2) {
                        bb.S(parcel, i11);
                    } else {
                        iD = bb.D(parcel, i11);
                    }
                }
                bb.R(parcel, iF10);
                return new j(iD2, iD);
            case 10:
                String strN6 = null;
                int iF11 = bb.F(parcel);
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    int iC8 = bb.C(i12);
                    if (iC8 == 1) {
                        arrayListO2 = bb.O(parcel, i12);
                    } else if (iC8 != 2) {
                        bb.S(parcel, i12);
                    } else {
                        strN6 = bb.N(parcel, i12);
                    }
                }
                bb.R(parcel, iF11);
                return new com.google.android.gms.m.a.d(arrayListO2, strN6);
            case 11:
                int iF12 = bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    int i13 = parcel.readInt();
                    if (bb.C(i13) != 2) {
                        bb.S(parcel, i13);
                    } else {
                        bundleH = bb.H(parcel, i13);
                    }
                }
                bb.R(parcel, iF12);
                return new z(bundleH);
            case 12:
                x.f(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                x.f(parcel, "parcel");
                String string = parcel.readString();
                com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) parcel.readSerializable();
                String string2 = parcel.readString();
                int i14 = parcel.readInt();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                if (parcel.readInt() == 0) {
                    eVar = null;
                } else {
                    String string12 = parcel.readString();
                    com.waze.ads.a.e eVar2 = com.waze.ads.a.e.f13915a;
                    eVar = (com.waze.ads.a.e) Enum.valueOf(com.waze.ads.a.e.class, string12);
                }
                return new com.waze.ads.a.f(string, cVar, string2, i14 != 0, string3, string4, string5, string6, string7, string8, string9, string10, string11, fValueOf, eVar, parcel.readString());
            case 14:
                x.f(parcel, "parcel");
                return new com.waze.asks.a(parcel.readString(), (at) parcel.readParcelable(com.waze.asks.a.class.getClassLoader()), parcel.readInt());
            case 15:
                x.f(parcel, "parcel");
                return new com.waze.asks.b(parcel.readString(), (at) parcel.readParcelable(com.waze.asks.b.class.getClassLoader()), parcel.readInt());
            case 16:
                x.f(parcel, "parcel");
                return new com.waze.asks.c(parcel.readString(), parcel.readInt());
            case 17:
                x.f(parcel, "parcel");
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                aw awVar = aw.f15546a;
                aw awVar2 = (aw) Enum.valueOf(aw.class, string15);
                int i15 = parcel.readInt();
                String string16 = parcel.readString();
                com.waze.asks.e eVar3 = com.waze.asks.e.f15585a;
                com.waze.asks.e eVar4 = (com.waze.asks.e) Enum.valueOf(com.waze.asks.e.class, string16);
                int i16 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList.add(parcel.readParcelable(as.class.getClassLoader()));
                }
                return new as(string13, string14, awVar2, i15 != 0, eVar4, arrayList, parcel.readInt(), AlerterController$Alerter$Type.valueOf(parcel.readString()), parcel.readString());
            case 18:
                x.f(parcel, "parcel");
                return new com.waze.copilot.a.h(parcel.readString());
            case 19:
                x.f(parcel, "parcel");
                return new com.waze.copilot.a.i(parcel.readString());
            default:
                x.f(parcel, "parcel");
                parcel.readInt();
                return com.waze.copilot.a.j.f22838a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4408a) {
            case 0:
                return new a[i2];
            case 1:
                return new e[i2];
            case 2:
                return new d[i2];
            case 3:
                return new f[i2];
            case 4:
                return new h[i2];
            case 5:
                return new com.google.android.gms.l.c[i2];
            case 6:
                return new com.google.android.gms.l.d[i2];
            case 7:
                return new com.google.android.gms.l.h[i2];
            case 8:
                return new i[i2];
            case 9:
                return new j[i2];
            case 10:
                return new com.google.android.gms.m.a.d[i2];
            case 11:
                return new z[i2];
            case 12:
                return new k[i2];
            case 13:
                return new com.waze.ads.a.f[i2];
            case 14:
                return new com.waze.asks.a[i2];
            case 15:
                return new com.waze.asks.b[i2];
            case 16:
                return new com.waze.asks.c[i2];
            case 17:
                return new as[i2];
            case 18:
                return new com.waze.copilot.a.h[i2];
            case 19:
                return new com.waze.copilot.a.i[i2];
            default:
                return new com.waze.copilot.a.j[i2];
        }
    }
}
