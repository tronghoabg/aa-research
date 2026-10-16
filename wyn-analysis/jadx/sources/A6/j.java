package A6;

import A7.C0242d;
import A7.C0251g;
import A7.C0298w;
import A7.C0301x;
import A7.E1;
import A7.N1;
import A7.R1;
import D6.K0;
import D6.O0;
import D6.Q;
import D6.d1;
import D6.o1;
import D6.p1;
import D6.q1;
import D6.r1;
import D6.v1;
import D6.x1;
import D6.y1;
import D6.z1;
import U8.v0;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a;

    public /* synthetic */ j(int i5) {
        this.f407a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f407a) {
            case 0:
                int iO0 = v0.o0(parcel);
                boolean Z10 = false;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        v0.m0(i5, parcel);
                    } else {
                        Z10 = v0.Z(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new a(Z10);
            case 1:
                int iO02 = v0.o0(parcel);
                IBinder iBinderE0 = null;
                boolean Z11 = false;
                IBinder iBinderE02 = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        Z11 = v0.Z(i10, parcel);
                    } else if (c10 == 2) {
                        iBinderE0 = v0.e0(i10, parcel);
                    } else if (c10 != 3) {
                        v0.m0(i10, parcel);
                    } else {
                        iBinderE02 = v0.e0(i10, parcel);
                    }
                }
                v0.D(iO02, parcel);
                return new g(Z11, iBinderE0, iBinderE02);
            case 2:
                int iO03 = v0.o0(parcel);
                String strY = null;
                String strY2 = null;
                R1 r12 = null;
                String strY3 = null;
                C0301x c0301x = null;
                C0301x c0301x2 = null;
                C0301x c0301x3 = null;
                long jH0 = 0;
                long jH02 = 0;
                long jH03 = 0;
                boolean Z12 = false;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strY = v0.y(i11, parcel);
                            break;
                        case 3:
                            strY2 = v0.y(i11, parcel);
                            break;
                        case 4:
                            r12 = (R1) v0.x(parcel, i11, R1.CREATOR);
                            break;
                        case 5:
                            jH0 = v0.h0(i11, parcel);
                            break;
                        case 6:
                            Z12 = v0.Z(i11, parcel);
                            break;
                        case 7:
                            strY3 = v0.y(i11, parcel);
                            break;
                        case '\b':
                            c0301x = (C0301x) v0.x(parcel, i11, C0301x.CREATOR);
                            break;
                        case '\t':
                            jH02 = v0.h0(i11, parcel);
                            break;
                        case '\n':
                            c0301x2 = (C0301x) v0.x(parcel, i11, C0301x.CREATOR);
                            break;
                        case 11:
                            jH03 = v0.h0(i11, parcel);
                            break;
                        case '\f':
                            c0301x3 = (C0301x) v0.x(parcel, i11, C0301x.CREATOR);
                            break;
                        default:
                            v0.m0(i11, parcel);
                            break;
                    }
                }
                v0.D(iO03, parcel);
                return new C0242d(strY, strY2, r12, jH0, Z12, strY3, c0301x, jH02, c0301x2, jH03, c0301x3);
            case 3:
                int iO04 = v0.o0(parcel);
                Bundle bundleQ = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        v0.m0(i12, parcel);
                    } else {
                        bundleQ = v0.q(i12, parcel);
                    }
                }
                v0.D(iO04, parcel);
                return new C0251g(bundleQ);
            case 4:
                int iO05 = v0.o0(parcel);
                Bundle bundleQ2 = null;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        v0.m0(i13, parcel);
                    } else {
                        bundleQ2 = v0.q(i13, parcel);
                    }
                }
                v0.D(iO05, parcel);
                return new C0298w(bundleQ2);
            case 5:
                int iO06 = v0.o0(parcel);
                String strY4 = null;
                C0298w c0298w = null;
                String strY5 = null;
                long jH04 = 0;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 2) {
                        strY4 = v0.y(i14, parcel);
                    } else if (c11 == 3) {
                        c0298w = (C0298w) v0.x(parcel, i14, C0298w.CREATOR);
                    } else if (c11 == 4) {
                        strY5 = v0.y(i14, parcel);
                    } else if (c11 != 5) {
                        v0.m0(i14, parcel);
                    } else {
                        jH04 = v0.h0(i14, parcel);
                    }
                }
                v0.D(iO06, parcel);
                return new C0301x(strY4, c0298w, strY5, jH04);
            case 6:
                int iO07 = v0.o0(parcel);
                String strY6 = null;
                long jH05 = 0;
                int iF0 = 0;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strY6 = v0.y(i15, parcel);
                    } else if (c12 == 2) {
                        jH05 = v0.h0(i15, parcel);
                    } else if (c12 != 3) {
                        v0.m0(i15, parcel);
                    } else {
                        iF0 = v0.f0(i15, parcel);
                    }
                }
                v0.D(iO07, parcel);
                return new E1(strY6, jH05, iF0);
            case 7:
                int iO08 = v0.o0(parcel);
                int iF02 = 0;
                String strY7 = null;
                Long lI0 = null;
                Float fValueOf = null;
                String strY8 = null;
                String strY9 = null;
                Double dB0 = null;
                long jH06 = 0;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iF02 = v0.f0(i16, parcel);
                            break;
                        case 2:
                            strY7 = v0.y(i16, parcel);
                            break;
                        case 3:
                            jH06 = v0.h0(i16, parcel);
                            break;
                        case 4:
                            lI0 = v0.i0(i16, parcel);
                            break;
                        case 5:
                            int iK0 = v0.k0(i16, parcel);
                            if (iK0 != 0) {
                                v0.s0(parcel, iK0, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case 6:
                            strY8 = v0.y(i16, parcel);
                            break;
                        case 7:
                            strY9 = v0.y(i16, parcel);
                            break;
                        case '\b':
                            dB0 = v0.b0(i16, parcel);
                            break;
                        default:
                            v0.m0(i16, parcel);
                            break;
                    }
                }
                v0.D(iO08, parcel);
                return new R1(iF02, strY7, jH06, lI0, fValueOf, strY8, strY9, dB0);
            case 8:
                int iO09 = v0.o0(parcel);
                String strY10 = null;
                String strY11 = null;
                String strY12 = null;
                String strY13 = null;
                String strY14 = null;
                String strY15 = null;
                String strY16 = null;
                Boolean boolA0 = null;
                ArrayList arrayListA = null;
                String strY17 = null;
                String strY18 = null;
                String strY19 = null;
                long jH07 = 0;
                long jH08 = 0;
                long jH09 = 0;
                long jH010 = 0;
                long jH011 = 0;
                long jH012 = 0;
                long jH013 = 0;
                boolean Z13 = true;
                boolean Z14 = true;
                boolean Z15 = false;
                int iF03 = 0;
                boolean Z16 = false;
                boolean Z17 = false;
                int iF04 = 0;
                long jH014 = -2147483648L;
                String strY20 = "";
                String strY21 = strY20;
                String strY22 = strY21;
                String strY23 = strY22;
                int iF05 = 100;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strY10 = v0.y(i17, parcel);
                            break;
                        case 3:
                            strY11 = v0.y(i17, parcel);
                            break;
                        case 4:
                            strY12 = v0.y(i17, parcel);
                            break;
                        case 5:
                            strY13 = v0.y(i17, parcel);
                            break;
                        case 6:
                            jH07 = v0.h0(i17, parcel);
                            break;
                        case 7:
                            jH08 = v0.h0(i17, parcel);
                            break;
                        case '\b':
                            strY14 = v0.y(i17, parcel);
                            break;
                        case '\t':
                            Z13 = v0.Z(i17, parcel);
                            break;
                        case '\n':
                            Z15 = v0.Z(i17, parcel);
                            break;
                        case 11:
                            jH014 = v0.h0(i17, parcel);
                            break;
                        case '\f':
                            strY15 = v0.y(i17, parcel);
                            break;
                        case '\r':
                            jH09 = v0.h0(i17, parcel);
                            break;
                        case 14:
                            jH010 = v0.h0(i17, parcel);
                            break;
                        case 15:
                            iF03 = v0.f0(i17, parcel);
                            break;
                        case 16:
                            Z14 = v0.Z(i17, parcel);
                            break;
                        case 17:
                        case 20:
                        case '!':
                        default:
                            v0.m0(i17, parcel);
                            break;
                        case 18:
                            Z16 = v0.Z(i17, parcel);
                            break;
                        case 19:
                            strY16 = v0.y(i17, parcel);
                            break;
                        case 21:
                            boolA0 = v0.a0(i17, parcel);
                            break;
                        case 22:
                            jH011 = v0.h0(i17, parcel);
                            break;
                        case 23:
                            arrayListA = v0.A(i17, parcel);
                            break;
                        case 24:
                            strY17 = v0.y(i17, parcel);
                            break;
                        case 25:
                            strY20 = v0.y(i17, parcel);
                            break;
                        case 26:
                            strY21 = v0.y(i17, parcel);
                            break;
                        case 27:
                            strY18 = v0.y(i17, parcel);
                            break;
                        case 28:
                            Z17 = v0.Z(i17, parcel);
                            break;
                        case 29:
                            jH012 = v0.h0(i17, parcel);
                            break;
                        case 30:
                            iF05 = v0.f0(i17, parcel);
                            break;
                        case 31:
                            strY22 = v0.y(i17, parcel);
                            break;
                        case ' ':
                            iF04 = v0.f0(i17, parcel);
                            break;
                        case '\"':
                            jH013 = v0.h0(i17, parcel);
                            break;
                        case '#':
                            strY19 = v0.y(i17, parcel);
                            break;
                        case '$':
                            strY23 = v0.y(i17, parcel);
                            break;
                    }
                }
                v0.D(iO09, parcel);
                return new N1(strY10, strY11, strY12, strY13, jH07, jH08, strY14, Z13, Z15, jH014, strY15, jH09, jH010, iF03, Z14, Z16, strY16, boolA0, jH011, arrayListA, strY17, strY20, strY21, strY18, Z17, jH012, iF05, strY22, iF04, jH013, strY19, strY23);
            case 9:
                String string = parcel.readString();
                string.getClass();
                return new C2.a(parcel.readInt(), string);
            case 10:
                int iO010 = v0.o0(parcel);
                boolean Z18 = false;
                boolean Z19 = false;
                boolean Z20 = false;
                int iF06 = 0;
                boolean Z21 = false;
                boolean Z22 = false;
                boolean Z23 = false;
                float fC0 = 0.0f;
                String strY24 = null;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            Z18 = v0.Z(i18, parcel);
                            break;
                        case 3:
                            Z19 = v0.Z(i18, parcel);
                            break;
                        case 4:
                            strY24 = v0.y(i18, parcel);
                            break;
                        case 5:
                            Z20 = v0.Z(i18, parcel);
                            break;
                        case 6:
                            fC0 = v0.c0(i18, parcel);
                            break;
                        case 7:
                            iF06 = v0.f0(i18, parcel);
                            break;
                        case '\b':
                            Z21 = v0.Z(i18, parcel);
                            break;
                        case '\t':
                            Z22 = v0.Z(i18, parcel);
                            break;
                        case '\n':
                            Z23 = v0.Z(i18, parcel);
                            break;
                        default:
                            v0.m0(i18, parcel);
                            break;
                    }
                }
                v0.D(iO010, parcel);
                return new C6.g(Z18, Z19, strY24, Z20, fC0, iF06, Z21, Z22, Z23);
            case 11:
                int iO011 = v0.o0(parcel);
                String strY25 = null;
                while (parcel.dataPosition() < iO011) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        v0.m0(i19, parcel);
                    } else {
                        strY25 = v0.y(i19, parcel);
                    }
                }
                v0.D(iO011, parcel);
                return new C7.h(strY25);
            case 12:
                int iO012 = v0.o0(parcel);
                String strY26 = null;
                int iF07 = 0;
                byte[] bArrR = null;
                while (parcel.dataPosition() < iO012) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 2) {
                        strY26 = v0.y(i20, parcel);
                    } else if (c13 == 3) {
                        bArrR = v0.r(i20, parcel);
                    } else if (c13 != 4) {
                        v0.m0(i20, parcel);
                    } else {
                        iF07 = v0.f0(i20, parcel);
                    }
                }
                v0.D(iO012, parcel);
                return new C7.a(iF07, strY26, bArrR);
            case 13:
                int iO013 = v0.o0(parcel);
                long jH015 = 0;
                C7.a[] aVarArr = null;
                int iF08 = 0;
                boolean Z24 = false;
                while (parcel.dataPosition() < iO013) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 2) {
                        jH015 = v0.h0(i21, parcel);
                    } else if (c14 == 3) {
                        aVarArr = (C7.a[]) v0.B(parcel, i21, C7.a.CREATOR);
                    } else if (c14 == 4) {
                        iF08 = v0.f0(i21, parcel);
                    } else if (c14 != 5) {
                        v0.m0(i21, parcel);
                    } else {
                        Z24 = v0.Z(i21, parcel);
                    }
                }
                v0.D(iO013, parcel);
                return new C7.i(jH015, aVarArr, iF08, Z24);
            case 14:
                int iO014 = v0.o0(parcel);
                String strY27 = null;
                while (parcel.dataPosition() < iO014) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        v0.m0(i22, parcel);
                    } else {
                        strY27 = v0.y(i22, parcel);
                    }
                }
                v0.D(iO014, parcel);
                return new C7.j(strY27);
            case 15:
                int iO015 = v0.o0(parcel);
                int iF09 = 0;
                boolean Z25 = false;
                while (parcel.dataPosition() < iO015) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 2) {
                        iF09 = v0.f0(i23, parcel);
                    } else if (c15 != 3) {
                        v0.m0(i23, parcel);
                    } else {
                        Z25 = v0.Z(i23, parcel);
                    }
                }
                v0.D(iO015, parcel);
                return new C7.k(iF09, Z25);
            case 16:
                int iO016 = v0.o0(parcel);
                String strY28 = null;
                byte[] bArrR2 = null;
                long jH016 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iO016) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 2) {
                        strY28 = v0.y(i24, parcel);
                    } else if (c16 == 3) {
                        dataHolder = (DataHolder) v0.x(parcel, i24, DataHolder.CREATOR);
                    } else if (c16 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) v0.x(parcel, i24, ParcelFileDescriptor.CREATOR);
                    } else if (c16 == 5) {
                        jH016 = v0.h0(i24, parcel);
                    } else if (c16 != 6) {
                        v0.m0(i24, parcel);
                    } else {
                        bArrR2 = v0.r(i24, parcel);
                    }
                }
                v0.D(iO016, parcel);
                C7.b bVar = new C7.b();
                bVar.f1889a = strY28;
                bVar.f1890b = dataHolder;
                bVar.f1891c = parcelFileDescriptor;
                bVar.f1892d = jH016;
                bVar.f1893e = bArrR2;
                return bVar;
            case 17:
                return new D2.a(parcel);
            case 18:
                int iO017 = v0.o0(parcel);
                String strY29 = null;
                String strY30 = null;
                while (parcel.dataPosition() < iO017) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        strY29 = v0.y(i25, parcel);
                    } else if (c17 != 2) {
                        v0.m0(i25, parcel);
                    } else {
                        strY30 = v0.y(i25, parcel);
                    }
                }
                v0.D(iO017, parcel);
                return new Q(strY29, strY30);
            case 19:
                int iO018 = v0.o0(parcel);
                int iF010 = 0;
                while (parcel.dataPosition() < iO018) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 2) {
                        v0.m0(i26, parcel);
                    } else {
                        iF010 = v0.f0(i26, parcel);
                    }
                }
                v0.D(iO018, parcel);
                return new O0(iF010);
            case 20:
                int iO019 = v0.o0(parcel);
                String strY31 = null;
                String strY32 = null;
                K0 k02 = null;
                IBinder iBinderE03 = null;
                int iF011 = 0;
                while (parcel.dataPosition() < iO019) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        iF011 = v0.f0(i27, parcel);
                    } else if (c18 == 2) {
                        strY31 = v0.y(i27, parcel);
                    } else if (c18 == 3) {
                        strY32 = v0.y(i27, parcel);
                    } else if (c18 == 4) {
                        k02 = (K0) v0.x(parcel, i27, K0.CREATOR);
                    } else if (c18 != 5) {
                        v0.m0(i27, parcel);
                    } else {
                        iBinderE03 = v0.e0(i27, parcel);
                    }
                }
                v0.D(iO019, parcel);
                return new K0(iF011, strY31, strY32, k02, iBinderE03);
            case 21:
                int iO020 = v0.o0(parcel);
                String strY33 = null;
                int iF012 = 0;
                int iF013 = 0;
                while (parcel.dataPosition() < iO020) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        iF012 = v0.f0(i28, parcel);
                    } else if (c19 == 2) {
                        iF013 = v0.f0(i28, parcel);
                    } else if (c19 != 3) {
                        v0.m0(i28, parcel);
                    } else {
                        strY33 = v0.y(i28, parcel);
                    }
                }
                v0.D(iO020, parcel);
                return new d1(iF012, iF013, strY33);
            case 22:
                int iO021 = v0.o0(parcel);
                int iF014 = 0;
                int iF015 = 0;
                boolean Z26 = false;
                String strY34 = null;
                v1 v1Var = null;
                while (parcel.dataPosition() < iO021) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        strY34 = v0.y(i29, parcel);
                    } else if (c20 == 2) {
                        iF014 = v0.f0(i29, parcel);
                    } else if (c20 == 3) {
                        v1Var = (v1) v0.x(parcel, i29, v1.CREATOR);
                    } else if (c20 == 4) {
                        iF015 = v0.f0(i29, parcel);
                    } else if (c20 != 5) {
                        v0.m0(i29, parcel);
                    } else {
                        Z26 = v0.Z(i29, parcel);
                    }
                }
                v0.D(iO021, parcel);
                return new o1(strY34, iF014, v1Var, iF015, Z26);
            case 23:
                int iO022 = v0.o0(parcel);
                int iF016 = 0;
                int iF017 = 0;
                while (parcel.dataPosition() < iO022) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 1) {
                        iF016 = v0.f0(i30, parcel);
                    } else if (c21 != 2) {
                        v0.m0(i30, parcel);
                    } else {
                        iF017 = v0.f0(i30, parcel);
                    }
                }
                v0.D(iO022, parcel);
                return new p1(iF016, iF017);
            case 24:
                int iO023 = v0.o0(parcel);
                String strY35 = null;
                while (parcel.dataPosition() < iO023) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 15) {
                        v0.m0(i31, parcel);
                    } else {
                        strY35 = v0.y(i31, parcel);
                    }
                }
                v0.D(iO023, parcel);
                return new q1(strY35);
            case 25:
                int iO024 = v0.o0(parcel);
                boolean Z27 = false;
                boolean Z28 = false;
                boolean Z29 = false;
                while (parcel.dataPosition() < iO024) {
                    int i32 = parcel.readInt();
                    char c22 = (char) i32;
                    if (c22 == 2) {
                        Z27 = v0.Z(i32, parcel);
                    } else if (c22 == 3) {
                        Z28 = v0.Z(i32, parcel);
                    } else if (c22 != 4) {
                        v0.m0(i32, parcel);
                    } else {
                        Z29 = v0.Z(i32, parcel);
                    }
                }
                v0.D(iO024, parcel);
                return new r1(Z27, Z28, Z29);
            case 26:
                int iO025 = v0.o0(parcel);
                int iF018 = 0;
                int iF019 = 0;
                boolean Z30 = false;
                int iF020 = 0;
                boolean Z31 = false;
                boolean Z32 = false;
                int iF021 = 0;
                int iF022 = 0;
                int iF023 = 0;
                int iF024 = 0;
                long jH017 = 0;
                long jH018 = 0;
                long jH019 = 0;
                Bundle bundleQ3 = null;
                ArrayList arrayListA2 = null;
                String strY36 = null;
                q1 q1Var = null;
                Location location = null;
                String strY37 = null;
                Bundle bundleQ4 = null;
                Bundle bundleQ5 = null;
                ArrayList arrayListA3 = null;
                String strY38 = null;
                String strY39 = null;
                Q q4 = null;
                String strY40 = null;
                ArrayList arrayListA4 = null;
                String strY41 = null;
                while (parcel.dataPosition() < iO025) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            iF018 = v0.f0(i33, parcel);
                            break;
                        case 2:
                            jH017 = v0.h0(i33, parcel);
                            break;
                        case 3:
                            bundleQ3 = v0.q(i33, parcel);
                            break;
                        case 4:
                            iF019 = v0.f0(i33, parcel);
                            break;
                        case 5:
                            arrayListA2 = v0.A(i33, parcel);
                            break;
                        case 6:
                            Z30 = v0.Z(i33, parcel);
                            break;
                        case 7:
                            iF020 = v0.f0(i33, parcel);
                            break;
                        case '\b':
                            Z31 = v0.Z(i33, parcel);
                            break;
                        case '\t':
                            strY36 = v0.y(i33, parcel);
                            break;
                        case '\n':
                            q1Var = (q1) v0.x(parcel, i33, q1.CREATOR);
                            break;
                        case 11:
                            location = (Location) v0.x(parcel, i33, Location.CREATOR);
                            break;
                        case '\f':
                            strY37 = v0.y(i33, parcel);
                            break;
                        case '\r':
                            bundleQ4 = v0.q(i33, parcel);
                            break;
                        case 14:
                            bundleQ5 = v0.q(i33, parcel);
                            break;
                        case 15:
                            arrayListA3 = v0.A(i33, parcel);
                            break;
                        case 16:
                            strY38 = v0.y(i33, parcel);
                            break;
                        case 17:
                            strY39 = v0.y(i33, parcel);
                            break;
                        case 18:
                            Z32 = v0.Z(i33, parcel);
                            break;
                        case 19:
                            q4 = (Q) v0.x(parcel, i33, Q.CREATOR);
                            break;
                        case 20:
                            iF021 = v0.f0(i33, parcel);
                            break;
                        case 21:
                            strY40 = v0.y(i33, parcel);
                            break;
                        case 22:
                            arrayListA4 = v0.A(i33, parcel);
                            break;
                        case 23:
                            iF022 = v0.f0(i33, parcel);
                            break;
                        case 24:
                            strY41 = v0.y(i33, parcel);
                            break;
                        case 25:
                            iF023 = v0.f0(i33, parcel);
                            break;
                        case 26:
                            jH018 = v0.h0(i33, parcel);
                            break;
                        case 27:
                            jH019 = v0.h0(i33, parcel);
                            break;
                        case 28:
                            iF024 = v0.f0(i33, parcel);
                            break;
                        default:
                            v0.m0(i33, parcel);
                            break;
                    }
                }
                v0.D(iO025, parcel);
                return new v1(iF018, jH017, bundleQ3, iF019, arrayListA2, Z30, iF020, Z31, strY36, q1Var, location, strY37, bundleQ4, bundleQ5, arrayListA3, strY38, strY39, Z32, q4, iF021, strY40, arrayListA4, iF022, strY41, iF023, jH018, jH019, iF024);
            case 27:
                int iO026 = v0.o0(parcel);
                int iF025 = 0;
                int iF026 = 0;
                boolean Z33 = false;
                int iF027 = 0;
                int iF028 = 0;
                boolean Z34 = false;
                boolean Z35 = false;
                boolean Z36 = false;
                boolean Z37 = false;
                boolean Z38 = false;
                boolean Z39 = false;
                boolean Z40 = false;
                boolean Z41 = false;
                boolean Z42 = false;
                String strY42 = null;
                x1[] x1VarArr = null;
                while (parcel.dataPosition() < iO026) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 2:
                            strY42 = v0.y(i34, parcel);
                            break;
                        case 3:
                            iF025 = v0.f0(i34, parcel);
                            break;
                        case 4:
                            iF026 = v0.f0(i34, parcel);
                            break;
                        case 5:
                            Z33 = v0.Z(i34, parcel);
                            break;
                        case 6:
                            iF027 = v0.f0(i34, parcel);
                            break;
                        case 7:
                            iF028 = v0.f0(i34, parcel);
                            break;
                        case '\b':
                            x1VarArr = (x1[]) v0.B(parcel, i34, x1.CREATOR);
                            break;
                        case '\t':
                            Z34 = v0.Z(i34, parcel);
                            break;
                        case '\n':
                            Z35 = v0.Z(i34, parcel);
                            break;
                        case 11:
                            Z36 = v0.Z(i34, parcel);
                            break;
                        case '\f':
                            Z37 = v0.Z(i34, parcel);
                            break;
                        case '\r':
                            Z38 = v0.Z(i34, parcel);
                            break;
                        case 14:
                            Z39 = v0.Z(i34, parcel);
                            break;
                        case 15:
                            Z40 = v0.Z(i34, parcel);
                            break;
                        case 16:
                            Z41 = v0.Z(i34, parcel);
                            break;
                        case 17:
                            Z42 = v0.Z(i34, parcel);
                            break;
                        default:
                            v0.m0(i34, parcel);
                            break;
                    }
                }
                v0.D(iO026, parcel);
                return new x1(strY42, iF025, iF026, Z33, iF027, iF028, x1VarArr, Z34, Z35, Z36, Z37, Z38, Z39, Z40, Z41, Z42);
            case 28:
                int iO027 = v0.o0(parcel);
                long jH020 = 0;
                String strY43 = null;
                int iF029 = 0;
                int iF030 = 0;
                while (parcel.dataPosition() < iO027) {
                    int i35 = parcel.readInt();
                    char c23 = (char) i35;
                    if (c23 == 1) {
                        iF029 = v0.f0(i35, parcel);
                    } else if (c23 == 2) {
                        iF030 = v0.f0(i35, parcel);
                    } else if (c23 == 3) {
                        strY43 = v0.y(i35, parcel);
                    } else if (c23 != 4) {
                        v0.m0(i35, parcel);
                    } else {
                        jH020 = v0.h0(i35, parcel);
                    }
                }
                v0.D(iO027, parcel);
                return new y1(iF029, jH020, iF030, strY43);
            default:
                int iO028 = v0.o0(parcel);
                String strY44 = null;
                K0 k03 = null;
                Bundle bundleQ6 = null;
                String strY45 = null;
                String strY46 = null;
                String strY47 = null;
                String strY48 = null;
                long jH021 = 0;
                while (parcel.dataPosition() < iO028) {
                    int i36 = parcel.readInt();
                    switch ((char) i36) {
                        case 1:
                            strY44 = v0.y(i36, parcel);
                            break;
                        case 2:
                            jH021 = v0.h0(i36, parcel);
                            break;
                        case 3:
                            k03 = (K0) v0.x(parcel, i36, K0.CREATOR);
                            break;
                        case 4:
                            bundleQ6 = v0.q(i36, parcel);
                            break;
                        case 5:
                            strY45 = v0.y(i36, parcel);
                            break;
                        case 6:
                            strY46 = v0.y(i36, parcel);
                            break;
                        case 7:
                            strY47 = v0.y(i36, parcel);
                            break;
                        case '\b':
                            strY48 = v0.y(i36, parcel);
                            break;
                        default:
                            v0.m0(i36, parcel);
                            break;
                    }
                }
                v0.D(iO028, parcel);
                return new z1(strY44, jH021, k03, bundleQ6, strY45, strY46, strY47, strY48);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f407a) {
            case 0:
                return new a[i5];
            case 1:
                return new g[i5];
            case 2:
                return new C0242d[i5];
            case 3:
                return new C0251g[i5];
            case 4:
                return new C0298w[i5];
            case 5:
                return new C0301x[i5];
            case 6:
                return new E1[i5];
            case 7:
                return new R1[i5];
            case 8:
                return new N1[i5];
            case 9:
                return new C2.a[i5];
            case 10:
                return new C6.g[i5];
            case 11:
                return new C7.h[i5];
            case 12:
                return new C7.a[i5];
            case 13:
                return new C7.i[i5];
            case 14:
                return new C7.j[i5];
            case 15:
                return new C7.k[i5];
            case 16:
                return new C7.b[i5];
            case 17:
                return new D2.a[i5];
            case 18:
                return new Q[i5];
            case 19:
                return new O0[i5];
            case 20:
                return new K0[i5];
            case 21:
                return new d1[i5];
            case 22:
                return new o1[i5];
            case 23:
                return new p1[i5];
            case 24:
                return new q1[i5];
            case 25:
                return new r1[i5];
            case 26:
                return new v1[i5];
            case 27:
                return new x1[i5];
            case 28:
                return new y1[i5];
            default:
                return new z1[i5];
        }
    }
}
