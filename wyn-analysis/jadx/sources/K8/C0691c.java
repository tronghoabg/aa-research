package K8;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import java.util.ArrayList;

/* renamed from: K8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0691c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6626a;

    public /* synthetic */ C0691c(int i5) {
        this.f6626a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6626a) {
            case 0:
                int iO0 = v0.o0(parcel);
                C0693e c0693e = null;
                Q q4 = null;
                J8.I i5 = null;
                while (parcel.dataPosition() < iO0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        c0693e = (C0693e) v0.x(parcel, i10, C0693e.CREATOR);
                    } else if (c10 == 2) {
                        q4 = (Q) v0.x(parcel, i10, Q.CREATOR);
                    } else if (c10 != 3) {
                        v0.m0(i10, parcel);
                    } else {
                        i5 = (J8.I) v0.x(parcel, i10, J8.I.CREATOR);
                    }
                }
                v0.D(iO0, parcel);
                return new T(c0693e, q4, i5);
            case 1:
                int iO02 = v0.o0(parcel);
                String strY = null;
                String strY2 = null;
                String strY3 = null;
                String strY4 = null;
                String strY5 = null;
                String strY6 = null;
                String strY7 = null;
                boolean Z10 = false;
                while (parcel.dataPosition() < iO02) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strY = v0.y(i11, parcel);
                            break;
                        case 2:
                            strY2 = v0.y(i11, parcel);
                            break;
                        case 3:
                            strY5 = v0.y(i11, parcel);
                            break;
                        case 4:
                            strY4 = v0.y(i11, parcel);
                            break;
                        case 5:
                            strY3 = v0.y(i11, parcel);
                            break;
                        case 6:
                            strY6 = v0.y(i11, parcel);
                            break;
                        case 7:
                            Z10 = v0.Z(i11, parcel);
                            break;
                        case '\b':
                            strY7 = v0.y(i11, parcel);
                            break;
                        default:
                            v0.m0(i11, parcel);
                            break;
                    }
                }
                v0.D(iO02, parcel);
                return new U(strY, strY2, strY3, strY4, strY5, strY6, Z10, strY7);
            case 2:
                int iO03 = v0.o0(parcel);
                zzagl zzaglVar = null;
                String strY8 = null;
                String strY9 = null;
                ArrayList arrayListC = null;
                ArrayList arrayListA = null;
                String strY10 = null;
                Boolean boolA0 = null;
                C0695g c0695g = null;
                J8.I i12 = null;
                w wVar = null;
                ArrayList arrayListC2 = null;
                boolean Z11 = false;
                U u10 = null;
                while (parcel.dataPosition() < iO03) {
                    int i13 = parcel.readInt();
                    ArrayList arrayList = arrayListC2;
                    switch ((char) i13) {
                        case 1:
                            zzaglVar = (zzagl) v0.x(parcel, i13, zzagl.CREATOR);
                            break;
                        case 2:
                            u10 = (U) v0.x(parcel, i13, U.CREATOR);
                            break;
                        case 3:
                            strY8 = v0.y(i13, parcel);
                            break;
                        case 4:
                            strY9 = v0.y(i13, parcel);
                            break;
                        case 5:
                            arrayListC = v0.C(parcel, i13, U.CREATOR);
                            break;
                        case 6:
                            arrayListA = v0.A(i13, parcel);
                            break;
                        case 7:
                            strY10 = v0.y(i13, parcel);
                            break;
                        case '\b':
                            boolA0 = v0.a0(i13, parcel);
                            break;
                        case '\t':
                            c0695g = (C0695g) v0.x(parcel, i13, C0695g.CREATOR);
                            break;
                        case '\n':
                            Z11 = v0.Z(i13, parcel);
                            break;
                        case 11:
                            i12 = (J8.I) v0.x(parcel, i13, J8.I.CREATOR);
                            break;
                        case '\f':
                            wVar = (w) v0.x(parcel, i13, w.CREATOR);
                            break;
                        case '\r':
                            arrayListC2 = v0.C(parcel, i13, J8.H.CREATOR);
                            continue;
                        default:
                            v0.m0(i13, parcel);
                            break;
                    }
                    arrayListC2 = arrayList;
                }
                v0.D(iO03, parcel);
                C0693e c0693e2 = new C0693e();
                c0693e2.f6627a = zzaglVar;
                c0693e2.f6628b = u10;
                c0693e2.f6629c = strY8;
                c0693e2.f6630d = strY9;
                c0693e2.f6631e = arrayListC;
                c0693e2.f6632f = arrayListA;
                c0693e2.f6633g = strY10;
                c0693e2.f6634h = boolA0;
                c0693e2.f6635i = c0695g;
                c0693e2.f6636j = Z11;
                c0693e2.k = i12;
                c0693e2.f6637l = wVar;
                c0693e2.f6638m = arrayListC2;
                return c0693e2;
            case 3:
                int iO04 = v0.o0(parcel);
                long jH0 = 0;
                long jH02 = 0;
                while (parcel.dataPosition() < iO04) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        jH0 = v0.h0(i14, parcel);
                    } else if (c11 != 2) {
                        v0.m0(i14, parcel);
                    } else {
                        jH02 = v0.h0(i14, parcel);
                    }
                }
                v0.D(iO04, parcel);
                return new C0695g(jH0, jH02);
            case 4:
                int iO05 = v0.o0(parcel);
                ArrayList arrayListC3 = null;
                C0698j c0698j = null;
                String strY11 = null;
                J8.I i15 = null;
                C0693e c0693e3 = null;
                ArrayList arrayListC4 = null;
                while (parcel.dataPosition() < iO05) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            arrayListC3 = v0.C(parcel, i16, J8.z.CREATOR);
                            break;
                        case 2:
                            c0698j = (C0698j) v0.x(parcel, i16, C0698j.CREATOR);
                            break;
                        case 3:
                            strY11 = v0.y(i16, parcel);
                            break;
                        case 4:
                            i15 = (J8.I) v0.x(parcel, i16, J8.I.CREATOR);
                            break;
                        case 5:
                            c0693e3 = (C0693e) v0.x(parcel, i16, C0693e.CREATOR);
                            break;
                        case 6:
                            arrayListC4 = v0.C(parcel, i16, J8.C.CREATOR);
                            break;
                        default:
                            v0.m0(i16, parcel);
                            break;
                    }
                }
                v0.D(iO05, parcel);
                return new C0697i(arrayListC3, c0698j, strY11, i15, c0693e3, arrayListC4);
            case 5:
                int iO06 = v0.o0(parcel);
                String strY12 = null;
                String strY13 = null;
                ArrayList arrayListC5 = null;
                ArrayList arrayListC6 = null;
                C0693e c0693e4 = null;
                while (parcel.dataPosition() < iO06) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        strY12 = v0.y(i17, parcel);
                    } else if (c12 == 2) {
                        strY13 = v0.y(i17, parcel);
                    } else if (c12 == 3) {
                        arrayListC5 = v0.C(parcel, i17, J8.z.CREATOR);
                    } else if (c12 == 4) {
                        arrayListC6 = v0.C(parcel, i17, J8.C.CREATOR);
                    } else if (c12 != 5) {
                        v0.m0(i17, parcel);
                    } else {
                        c0693e4 = (C0693e) v0.x(parcel, i17, C0693e.CREATOR);
                    }
                }
                v0.D(iO06, parcel);
                C0698j c0698j2 = new C0698j();
                c0698j2.f6652a = strY12;
                c0698j2.f6653b = strY13;
                c0698j2.f6654c = arrayListC5;
                c0698j2.f6655d = arrayListC6;
                c0698j2.f6656e = c0693e4;
                return c0698j2;
            case 6:
                int iO07 = v0.o0(parcel);
                ArrayList arrayListC7 = null;
                ArrayList arrayListC8 = null;
                while (parcel.dataPosition() < iO07) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        arrayListC7 = v0.C(parcel, i18, J8.z.CREATOR);
                    } else if (c13 != 2) {
                        v0.m0(i18, parcel);
                    } else {
                        arrayListC8 = v0.C(parcel, i18, J8.C.CREATOR);
                    }
                }
                v0.D(iO07, parcel);
                return new w(arrayListC7, arrayListC8);
            default:
                int iO08 = v0.o0(parcel);
                String strY14 = null;
                boolean Z12 = false;
                String strY15 = null;
                while (parcel.dataPosition() < iO08) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        strY14 = v0.y(i19, parcel);
                    } else if (c14 == 2) {
                        strY15 = v0.y(i19, parcel);
                    } else if (c14 != 3) {
                        v0.m0(i19, parcel);
                    } else {
                        Z12 = v0.Z(i19, parcel);
                    }
                }
                v0.D(iO08, parcel);
                return new Q(strY14, strY15, Z12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f6626a) {
            case 0:
                return new T[i5];
            case 1:
                return new U[i5];
            case 2:
                return new C0693e[i5];
            case 3:
                return new C0695g[i5];
            case 4:
                return new C0697i[i5];
            case 5:
                return new C0698j[i5];
            case 6:
                return new w[i5];
            default:
                return new Q[i5];
        }
    }
}
