package w7;

import U8.v0;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1718g;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzek;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import x7.C4490b;
import x7.C4491c;
import x7.C4492d;
import x7.C4493e;
import x7.C4495g;
import x7.j;
import x7.k;
import x7.p;
import x7.r;
import x7.s;
import x7.t;
import x7.u;
import x7.w;
import x7.x;
import x7.y;

/* renamed from: w7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4381i implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47391a;

    public /* synthetic */ C4381i(int i5) {
        this.f47391a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f47391a) {
            case 0:
                try {
                    return C4375c.V(parcel.readInt());
                } catch (C4374b e7) {
                    throw new RuntimeException(e7);
                }
            case 1:
                int iO0 = v0.o0(parcel);
                String strY = null;
                int iF0 = 0;
                String strY2 = null;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 2) {
                        iF0 = v0.f0(i5, parcel);
                    } else if (c10 == 3) {
                        strY = v0.y(i5, parcel);
                    } else if (c10 != 4) {
                        v0.m0(i5, parcel);
                    } else {
                        strY2 = v0.y(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new C4375c(iF0, strY, strY2);
            case 2:
                int iO02 = v0.o0(parcel);
                byte[] bArrR = null;
                ArrayList arrayListC = null;
                int iF02 = 0;
                String strY3 = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iF02 = v0.f0(i10, parcel);
                    } else if (c11 == 2) {
                        bArrR = v0.r(i10, parcel);
                    } else if (c11 == 3) {
                        strY3 = v0.y(i10, parcel);
                    } else if (c11 != 4) {
                        v0.m0(i10, parcel);
                    } else {
                        arrayListC = v0.C(parcel, i10, Transport.CREATOR);
                    }
                }
                v0.D(iO02, parcel);
                return new C4376d(iF02, strY3, arrayListC, bArrR);
            case 3:
                try {
                    return EnumC4378f.c(parcel.readString());
                } catch (C4377e e10) {
                    throw new RuntimeException(e10);
                }
            case 4:
                int iO03 = v0.o0(parcel);
                String strY4 = null;
                String strY5 = null;
                int iF03 = 0;
                byte[] bArrR2 = null;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    char c12 = (char) i11;
                    if (c12 == 1) {
                        iF03 = v0.f0(i11, parcel);
                    } else if (c12 == 2) {
                        strY4 = v0.y(i11, parcel);
                    } else if (c12 == 3) {
                        bArrR2 = v0.r(i11, parcel);
                    } else if (c12 != 4) {
                        v0.m0(i11, parcel);
                    } else {
                        strY5 = v0.y(i11, parcel);
                    }
                }
                v0.D(iO03, parcel);
                return new C4379g(strY4, strY5, iF03, bArrR2);
            case 5:
                int iO04 = v0.o0(parcel);
                Integer numG0 = null;
                Double dB0 = null;
                Uri uri = null;
                ArrayList arrayListC2 = null;
                ArrayList arrayListC3 = null;
                C4375c c4375c = null;
                String strY6 = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            numG0 = v0.g0(i12, parcel);
                            break;
                        case 3:
                            dB0 = v0.b0(i12, parcel);
                            break;
                        case 4:
                            uri = (Uri) v0.x(parcel, i12, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListC2 = v0.C(parcel, i12, C4379g.CREATOR);
                            break;
                        case 6:
                            arrayListC3 = v0.C(parcel, i12, C4380h.CREATOR);
                            break;
                        case 7:
                            c4375c = (C4375c) v0.x(parcel, i12, C4375c.CREATOR);
                            break;
                        case '\b':
                            strY6 = v0.y(i12, parcel);
                            break;
                        default:
                            v0.m0(i12, parcel);
                            break;
                    }
                }
                v0.D(iO04, parcel);
                return new RegisterRequestParams(numG0, dB0, uri, arrayListC2, arrayListC3, c4375c, strY6);
            case 6:
                int iO05 = v0.o0(parcel);
                C4376d c4376d = null;
                String strY7 = null;
                String strY8 = null;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 2) {
                        c4376d = (C4376d) v0.x(parcel, i13, C4376d.CREATOR);
                    } else if (c13 == 3) {
                        strY7 = v0.y(i13, parcel);
                    } else if (c13 != 4) {
                        v0.m0(i13, parcel);
                    } else {
                        strY8 = v0.y(i13, parcel);
                    }
                }
                v0.D(iO05, parcel);
                return new C4380h(c4376d, strY7, strY8);
            case 7:
                int iO06 = v0.o0(parcel);
                Integer numG02 = null;
                Double dB02 = null;
                Uri uri2 = null;
                byte[] bArrR3 = null;
                ArrayList arrayListC4 = null;
                C4375c c4375c2 = null;
                String strY9 = null;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            numG02 = v0.g0(i14, parcel);
                            break;
                        case 3:
                            dB02 = v0.b0(i14, parcel);
                            break;
                        case 4:
                            uri2 = (Uri) v0.x(parcel, i14, Uri.CREATOR);
                            break;
                        case 5:
                            bArrR3 = v0.r(i14, parcel);
                            break;
                        case 6:
                            arrayListC4 = v0.C(parcel, i14, C4380h.CREATOR);
                            break;
                        case 7:
                            c4375c2 = (C4375c) v0.x(parcel, i14, C4375c.CREATOR);
                            break;
                        case '\b':
                            strY9 = v0.y(i14, parcel);
                            break;
                        default:
                            v0.m0(i14, parcel);
                            break;
                    }
                }
                v0.D(iO06, parcel);
                return new SignRequestParams(numG02, dB02, uri2, bArrR3, arrayListC4, c4375c2, strY9);
            case 8:
                int iO07 = v0.o0(parcel);
                ClientIdentity clientIdentity = null;
                int iF04 = 0;
                boolean Z10 = false;
                long jH0 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 1) {
                        jH0 = v0.h0(i15, parcel);
                    } else if (c14 == 2) {
                        iF04 = v0.f0(i15, parcel);
                    } else if (c14 == 3) {
                        Z10 = v0.Z(i15, parcel);
                    } else if (c14 != 5) {
                        v0.m0(i15, parcel);
                    } else {
                        clientIdentity = (ClientIdentity) v0.x(parcel, i15, ClientIdentity.CREATOR);
                    }
                }
                v0.D(iO07, parcel);
                return new k(jH0, iF04, Z10, clientIdentity);
            case 9:
                int iO08 = v0.o0(parcel);
                w[] wVarArr = null;
                long jH02 = 0;
                int iF05 = 1;
                int iF06 = 1;
                int iF07 = 1000;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iF05 = v0.f0(i16, parcel);
                            break;
                        case 2:
                            iF06 = v0.f0(i16, parcel);
                            break;
                        case 3:
                            jH02 = v0.h0(i16, parcel);
                            break;
                        case 4:
                            iF07 = v0.f0(i16, parcel);
                            break;
                        case 5:
                            wVarArr = (w[]) v0.B(parcel, i16, w.CREATOR);
                            break;
                        case 6:
                            v0.Z(i16, parcel);
                            break;
                        default:
                            v0.m0(i16, parcel);
                            break;
                    }
                }
                v0.D(iO08, parcel);
                return new LocationAvailability(iF07, iF05, iF06, jH02, wVarArr);
            case 10:
                int iO09 = v0.o0(parcel);
                ClientIdentity clientIdentity2 = null;
                boolean Z11 = false;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        Z11 = v0.Z(i17, parcel);
                    } else if (c15 != 2) {
                        v0.m0(i17, parcel);
                    } else {
                        clientIdentity2 = (ClientIdentity) v0.x(parcel, i17, ClientIdentity.CREATOR);
                    }
                }
                v0.D(iO09, parcel);
                return new u(Z11, clientIdentity2);
            case 11:
                int iO010 = v0.o0(parcel);
                WorkSource workSource = new WorkSource();
                ClientIdentity clientIdentity3 = null;
                boolean Z12 = false;
                int iF08 = 0;
                int iF09 = 0;
                boolean Z13 = false;
                long jH03 = -1;
                float fC0 = 0.0f;
                int iF010 = Integer.MAX_VALUE;
                long jH04 = Long.MAX_VALUE;
                long jH05 = Long.MAX_VALUE;
                long jH06 = 0;
                long jH07 = 600000;
                long jH08 = 3600000;
                int iF011 = 102;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iF011 = v0.f0(i18, parcel);
                            break;
                        case 2:
                            jH08 = v0.h0(i18, parcel);
                            break;
                        case 3:
                            jH07 = v0.h0(i18, parcel);
                            break;
                        case 4:
                        case 14:
                        default:
                            v0.m0(i18, parcel);
                            break;
                        case 5:
                            jH04 = v0.h0(i18, parcel);
                            break;
                        case 6:
                            iF010 = v0.f0(i18, parcel);
                            break;
                        case 7:
                            fC0 = v0.c0(i18, parcel);
                            break;
                        case '\b':
                            jH06 = v0.h0(i18, parcel);
                            break;
                        case '\t':
                            Z12 = v0.Z(i18, parcel);
                            break;
                        case '\n':
                            jH05 = v0.h0(i18, parcel);
                            break;
                        case 11:
                            jH03 = v0.h0(i18, parcel);
                            break;
                        case '\f':
                            iF08 = v0.f0(i18, parcel);
                            break;
                        case '\r':
                            iF09 = v0.f0(i18, parcel);
                            break;
                        case 15:
                            Z13 = v0.Z(i18, parcel);
                            break;
                        case 16:
                            workSource = (WorkSource) v0.x(parcel, i18, WorkSource.CREATOR);
                            break;
                        case 17:
                            clientIdentity3 = (ClientIdentity) v0.x(parcel, i18, ClientIdentity.CREATOR);
                            break;
                    }
                }
                v0.D(iO010, parcel);
                return new LocationRequest(iF011, jH08, jH07, jH06, jH04, jH05, iF010, fC0, Z12, jH03, iF08, iF09, Z13, workSource, clientIdentity3);
            case 12:
                int iO011 = v0.o0(parcel);
                List listC = LocationResult.f26739b;
                while (parcel.dataPosition() < iO011) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        v0.m0(i19, parcel);
                    } else {
                        listC = v0.C(parcel, i19, Location.CREATOR);
                    }
                }
                v0.D(iO011, parcel);
                return new LocationResult(listC);
            case 13:
                int iO012 = v0.o0(parcel);
                boolean Z14 = false;
                ArrayList arrayListC5 = null;
                boolean Z15 = false;
                while (parcel.dataPosition() < iO012) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        arrayListC5 = v0.C(parcel, i20, LocationRequest.CREATOR);
                    } else if (c16 == 2) {
                        Z14 = v0.Z(i20, parcel);
                    } else if (c16 != 3) {
                        v0.m0(i20, parcel);
                    } else {
                        Z15 = v0.Z(i20, parcel);
                    }
                }
                v0.D(iO012, parcel);
                return new p(arrayListC5, Z14, Z15);
            case 14:
                int iO013 = v0.o0(parcel);
                Status status = null;
                s sVar = null;
                while (parcel.dataPosition() < iO013) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        status = (Status) v0.x(parcel, i21, Status.CREATOR);
                    } else if (c17 != 2) {
                        v0.m0(i21, parcel);
                    } else {
                        sVar = (s) v0.x(parcel, i21, s.CREATOR);
                    }
                }
                v0.D(iO013, parcel);
                return new r(status, sVar);
            case 15:
                int iO014 = v0.o0(parcel);
                boolean Z16 = false;
                boolean Z17 = false;
                boolean Z18 = false;
                boolean Z19 = false;
                boolean Z20 = false;
                boolean Z21 = false;
                while (parcel.dataPosition() < iO014) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            Z16 = v0.Z(i22, parcel);
                            break;
                        case 2:
                            Z17 = v0.Z(i22, parcel);
                            break;
                        case 3:
                            Z18 = v0.Z(i22, parcel);
                            break;
                        case 4:
                            Z19 = v0.Z(i22, parcel);
                            break;
                        case 5:
                            Z20 = v0.Z(i22, parcel);
                            break;
                        case 6:
                            Z21 = v0.Z(i22, parcel);
                            break;
                        default:
                            v0.m0(i22, parcel);
                            break;
                    }
                }
                v0.D(iO014, parcel);
                return new s(Z16, Z17, Z18, Z19, Z20, Z21);
            case 16:
                int iO015 = v0.o0(parcel);
                long jH09 = -1;
                long jH010 = -1;
                int iF012 = 1;
                int iF013 = 1;
                while (parcel.dataPosition() < iO015) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iF012 = v0.f0(i23, parcel);
                    } else if (c18 == 2) {
                        iF013 = v0.f0(i23, parcel);
                    } else if (c18 == 3) {
                        jH09 = v0.h0(i23, parcel);
                    } else if (c18 != 4) {
                        v0.m0(i23, parcel);
                    } else {
                        jH010 = v0.h0(i23, parcel);
                    }
                }
                v0.D(iO015, parcel);
                return new w(iF012, iF013, jH09, jH010);
            case 17:
                int iO016 = v0.o0(parcel);
                int iF014 = 0;
                ArrayList arrayListC6 = null;
                while (parcel.dataPosition() < iO016) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        arrayListC6 = v0.C(parcel, i24, x.CREATOR);
                    } else if (c19 != 2) {
                        v0.m0(i24, parcel);
                    } else {
                        iF014 = v0.f0(i24, parcel);
                    }
                }
                v0.D(iO016, parcel);
                return new t(arrayListC6, iF014);
            case 18:
                int iO017 = v0.o0(parcel);
                int iF015 = 0;
                int iF016 = 0;
                int iF017 = 0;
                int iF018 = 0;
                while (parcel.dataPosition() < iO017) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        iF015 = v0.f0(i25, parcel);
                    } else if (c20 == 2) {
                        iF016 = v0.f0(i25, parcel);
                    } else if (c20 == 3) {
                        iF017 = v0.f0(i25, parcel);
                    } else if (c20 != 4) {
                        v0.m0(i25, parcel);
                    } else {
                        iF018 = v0.f0(i25, parcel);
                    }
                }
                v0.D(iO017, parcel);
                return new x(iF015, iF016, iF017, iF018);
            case 19:
                int iO018 = v0.o0(parcel);
                WorkSource workSource2 = null;
                String strY10 = null;
                int[] iArrT = null;
                String strY11 = null;
                String strY12 = null;
                long jH011 = 0;
                long jH012 = 0;
                boolean Z22 = false;
                boolean Z23 = false;
                while (parcel.dataPosition() < iO018) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            jH011 = v0.h0(i26, parcel);
                            break;
                        case 2:
                            Z22 = v0.Z(i26, parcel);
                            break;
                        case 3:
                            workSource2 = (WorkSource) v0.x(parcel, i26, WorkSource.CREATOR);
                            break;
                        case 4:
                            strY10 = v0.y(i26, parcel);
                            break;
                        case 5:
                            iArrT = v0.t(i26, parcel);
                            break;
                        case 6:
                            Z23 = v0.Z(i26, parcel);
                            break;
                        case 7:
                            strY11 = v0.y(i26, parcel);
                            break;
                        case '\b':
                            jH012 = v0.h0(i26, parcel);
                            break;
                        case '\t':
                            strY12 = v0.y(i26, parcel);
                            break;
                        default:
                            v0.m0(i26, parcel);
                            break;
                    }
                }
                v0.D(iO018, parcel);
                return new y(jH011, Z22, workSource2, strY10, iArrT, Z23, strY11, jH012, strY12);
            case 20:
                int iO019 = v0.o0(parcel);
                int iF019 = 0;
                int iF020 = 0;
                while (parcel.dataPosition() < iO019) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        iF019 = v0.f0(i27, parcel);
                    } else if (c21 != 2) {
                        v0.m0(i27, parcel);
                    } else {
                        iF020 = v0.f0(i27, parcel);
                    }
                }
                v0.D(iO019, parcel);
                return new C4490b(iF019, iF020);
            case 21:
                int iO020 = v0.o0(parcel);
                ArrayList arrayListC7 = null;
                String strY13 = null;
                ArrayList arrayListC8 = null;
                String strY14 = null;
                while (parcel.dataPosition() < iO020) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        arrayListC7 = v0.C(parcel, i28, C4490b.CREATOR);
                    } else if (c22 == 2) {
                        strY13 = v0.y(i28, parcel);
                    } else if (c22 == 3) {
                        arrayListC8 = v0.C(parcel, i28, C1718g.CREATOR);
                    } else if (c22 != 4) {
                        v0.m0(i28, parcel);
                    } else {
                        strY14 = v0.y(i28, parcel);
                    }
                }
                v0.D(iO020, parcel);
                return new C4491c(arrayListC7, strY13, arrayListC8, strY14);
            case 22:
                int iO021 = v0.o0(parcel);
                WorkSource workSource3 = new WorkSource();
                ClientIdentity clientIdentity4 = null;
                int iF021 = 0;
                boolean Z24 = false;
                int iF022 = 0;
                long jH013 = Long.MAX_VALUE;
                long jH014 = Long.MAX_VALUE;
                int iF023 = 102;
                while (parcel.dataPosition() < iO021) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            jH013 = v0.h0(i29, parcel);
                            break;
                        case 2:
                            iF021 = v0.f0(i29, parcel);
                            break;
                        case 3:
                            iF023 = v0.f0(i29, parcel);
                            break;
                        case 4:
                            jH014 = v0.h0(i29, parcel);
                            break;
                        case 5:
                            Z24 = v0.Z(i29, parcel);
                            break;
                        case 6:
                            workSource3 = (WorkSource) v0.x(parcel, i29, WorkSource.CREATOR);
                            break;
                        case 7:
                            iF022 = v0.f0(i29, parcel);
                            break;
                        case '\b':
                        default:
                            v0.m0(i29, parcel);
                            break;
                        case '\t':
                            clientIdentity4 = (ClientIdentity) v0.x(parcel, i29, ClientIdentity.CREATOR);
                            break;
                    }
                }
                v0.D(iO021, parcel);
                return new C4492d(jH013, iF021, iF023, jH014, Z24, iF022, workSource3, clientIdentity4);
            case 23:
                int iO022 = v0.o0(parcel);
                float fC02 = 0.0f;
                float fC03 = 0.0f;
                float fC04 = 0.0f;
                float fC05 = 0.0f;
                byte b5 = 0;
                long jH015 = 0;
                while (true) {
                    float[] fArr = null;
                    while (parcel.dataPosition() < iO022) {
                        int i30 = parcel.readInt();
                        char c23 = (char) i30;
                        if (c23 != 1) {
                            switch (c23) {
                                case 4:
                                    fC02 = v0.c0(i30, parcel);
                                    break;
                                case 5:
                                    fC03 = v0.c0(i30, parcel);
                                    break;
                                case 6:
                                    jH015 = v0.h0(i30, parcel);
                                    break;
                                case 7:
                                    v0.r0(parcel, i30, 4);
                                    b5 = (byte) parcel.readInt();
                                    break;
                                case '\b':
                                    fC04 = v0.c0(i30, parcel);
                                    break;
                                case '\t':
                                    fC05 = v0.c0(i30, parcel);
                                    break;
                                default:
                                    v0.m0(i30, parcel);
                                    break;
                            }
                        } else {
                            int iK0 = v0.k0(i30, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iK0 == 0) {
                                break;
                            }
                            float[] fArrCreateFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition + iK0);
                            fArr = fArrCreateFloatArray;
                        }
                    }
                    v0.D(iO022, parcel);
                    return new C4493e(fArr, fC02, fC03, jH015, b5, fC04, fC05);
                    break;
                }
            case 24:
                int iO023 = v0.o0(parcel);
                boolean Z25 = false;
                long jH016 = 0;
                while (parcel.dataPosition() < iO023) {
                    int i31 = parcel.readInt();
                    char c24 = (char) i31;
                    if (c24 == 2) {
                        jH016 = v0.h0(i31, parcel);
                    } else if (c24 != 6) {
                        v0.m0(i31, parcel);
                    } else {
                        Z25 = v0.Z(i31, parcel);
                    }
                }
                v0.D(iO023, parcel);
                return new C4495g(jH016, Z25);
            default:
                int iO024 = v0.o0(parcel);
                ArrayList arrayListC9 = null;
                int iF024 = 0;
                String strY15 = null;
                while (parcel.dataPosition() < iO024) {
                    int i32 = parcel.readInt();
                    char c25 = (char) i32;
                    if (c25 == 1) {
                        arrayListC9 = v0.C(parcel, i32, zzek.CREATOR);
                    } else if (c25 == 2) {
                        iF024 = v0.f0(i32, parcel);
                    } else if (c25 != 4) {
                        v0.m0(i32, parcel);
                    } else {
                        strY15 = v0.y(i32, parcel);
                    }
                }
                v0.D(iO024, parcel);
                return new j(iF024, strY15, arrayListC9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f47391a) {
            case 0:
                return new EnumC4373a[i5];
            case 1:
                return new C4375c[i5];
            case 2:
                return new C4376d[i5];
            case 3:
                return new EnumC4378f[i5];
            case 4:
                return new C4379g[i5];
            case 5:
                return new RegisterRequestParams[i5];
            case 6:
                return new C4380h[i5];
            case 7:
                return new SignRequestParams[i5];
            case 8:
                return new k[i5];
            case 9:
                return new LocationAvailability[i5];
            case 10:
                return new u[i5];
            case 11:
                return new LocationRequest[i5];
            case 12:
                return new LocationResult[i5];
            case 13:
                return new p[i5];
            case 14:
                return new r[i5];
            case 15:
                return new s[i5];
            case 16:
                return new w[i5];
            case 17:
                return new t[i5];
            case 18:
                return new x[i5];
            case 19:
                return new y[i5];
            case 20:
                return new C4490b[i5];
            case 21:
                return new C4491c[i5];
            case 22:
                return new C4492d[i5];
            case 23:
                return new C4493e[i5];
            case 24:
                return new C4495g[i5];
            default:
                return new j[i5];
        }
    }
}
