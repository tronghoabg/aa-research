package v7;

import U8.v0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class U implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46941a;

    public /* synthetic */ U(int i5) {
        this.f46941a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f46941a) {
            case 0:
                int iO0 = v0.o0(parcel);
                String strY = null;
                Integer numG0 = null;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 2) {
                        strY = v0.y(i5, parcel);
                    } else if (c10 != 3) {
                        v0.m0(i5, parcel);
                    } else {
                        numG0 = v0.g0(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new C4306A(strY, numG0.intValue());
            case 1:
                int iO02 = v0.o0(parcel);
                byte[] bArrR = null;
                Double dB0 = null;
                String strY2 = null;
                ArrayList arrayListC = null;
                Integer numG02 = null;
                L l10 = null;
                String strY3 = null;
                C4312f c4312f = null;
                Long lI0 = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            bArrR = v0.r(i10, parcel);
                            break;
                        case 3:
                            dB0 = v0.b0(i10, parcel);
                            break;
                        case 4:
                            strY2 = v0.y(i10, parcel);
                            break;
                        case 5:
                            arrayListC = v0.C(parcel, i10, C4331z.CREATOR);
                            break;
                        case 6:
                            numG02 = v0.g0(i10, parcel);
                            break;
                        case 7:
                            l10 = (L) v0.x(parcel, i10, L.CREATOR);
                            break;
                        case '\b':
                            strY3 = v0.y(i10, parcel);
                            break;
                        case '\t':
                            c4312f = (C4312f) v0.x(parcel, i10, C4312f.CREATOR);
                            break;
                        case '\n':
                            lI0 = v0.i0(i10, parcel);
                            break;
                        default:
                            v0.m0(i10, parcel);
                            break;
                    }
                }
                v0.D(iO02, parcel);
                return new B(bArrR, dB0, strY2, arrayListC, numG02, l10, strY3, c4312f, lI0);
            case 2:
                int iO03 = v0.o0(parcel);
                String strY4 = null;
                String strY5 = null;
                String strY6 = null;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        strY4 = v0.y(i11, parcel);
                    } else if (c11 == 3) {
                        strY5 = v0.y(i11, parcel);
                    } else if (c11 != 4) {
                        v0.m0(i11, parcel);
                    } else {
                        strY6 = v0.y(i11, parcel);
                    }
                }
                v0.D(iO03, parcel);
                return new C(strY4, strY5, strY6);
            case 3:
                try {
                    return E.c(parcel.readString());
                } catch (D e7) {
                    throw new RuntimeException(e7);
                }
            case 4:
                int iO04 = v0.o0(parcel);
                byte[] bArrR2 = null;
                String strY7 = null;
                String strY8 = null;
                String strY9 = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 2) {
                        bArrR2 = v0.r(i12, parcel);
                    } else if (c12 == 3) {
                        strY7 = v0.y(i12, parcel);
                    } else if (c12 == 4) {
                        strY8 = v0.y(i12, parcel);
                    } else if (c12 != 5) {
                        v0.m0(i12, parcel);
                    } else {
                        strY9 = v0.y(i12, parcel);
                    }
                }
                v0.D(iO04, parcel);
                return new F(strY7, strY8, strY9, bArrR2);
            case 5:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return I.c(string);
                } catch (H e10) {
                    throw new RuntimeException(e10);
                }
            case 6:
                try {
                    return J.c(parcel.readString());
                } catch (K e11) {
                    throw new RuntimeException(e11);
                }
            case 7:
                int iO05 = v0.o0(parcel);
                String strY10 = null;
                String strY11 = null;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 2) {
                        strY10 = v0.y(i13, parcel);
                    } else if (c13 != 3) {
                        v0.m0(i13, parcel);
                    } else {
                        strY11 = v0.y(i13, parcel);
                    }
                }
                v0.D(iO05, parcel);
                return new L(strY10, strY11);
            case 8:
                int iO06 = v0.o0(parcel);
                boolean Z10 = false;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        v0.m0(i14, parcel);
                    } else {
                        Z10 = v0.Z(i14, parcel);
                    }
                }
                v0.D(iO06, parcel);
                return new M(Z10);
            case 9:
                try {
                    return W.c(parcel.readString());
                } catch (V e12) {
                    throw new RuntimeException(e12);
                }
            case 10:
                int iO07 = v0.o0(parcel);
                ArrayList arrayListC2 = null;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        v0.m0(i15, parcel);
                    } else {
                        arrayListC2 = v0.C(parcel, i15, O.CREATOR);
                    }
                }
                v0.D(iO07, parcel);
                return new N(arrayListC2);
            case 11:
                try {
                    return EnumC4311e.c(parcel.readString());
                } catch (C4310d e13) {
                    throw new RuntimeException(e13);
                }
            case 12:
                int iO08 = v0.o0(parcel);
                int iF0 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iF0 = v0.f0(i16, parcel);
                    } else if (c14 == 2) {
                        v0.r0(parcel, i16, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c14 != 3) {
                        v0.m0(i16, parcel);
                    } else {
                        v0.r0(parcel, i16, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                v0.D(iO08, parcel);
                return new O(iF0, s10, s11);
            case 13:
                int iO09 = v0.o0(parcel);
                N n10 = null;
                X x5 = null;
                C4314h c4314h = null;
                Y y10 = null;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        n10 = (N) v0.x(parcel, i17, N.CREATOR);
                    } else if (c15 == 2) {
                        x5 = (X) v0.x(parcel, i17, X.CREATOR);
                    } else if (c15 == 3) {
                        c4314h = (C4314h) v0.x(parcel, i17, C4314h.CREATOR);
                    } else if (c15 != 4) {
                        v0.m0(i17, parcel);
                    } else {
                        y10 = (Y) v0.x(parcel, i17, Y.CREATOR);
                    }
                }
                v0.D(iO09, parcel);
                return new C4313g(n10, x5, c4314h, y10);
            case 14:
                int iO010 = v0.o0(parcel);
                C4327v c4327v = null;
                a0 a0Var = null;
                M m10 = null;
                c0 c0Var = null;
                P p10 = null;
                Q q4 = null;
                b0 b0Var = null;
                S s12 = null;
                C4328w c4328w = null;
                T t10 = null;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            c4327v = (C4327v) v0.x(parcel, i18, C4327v.CREATOR);
                            break;
                        case 3:
                            a0Var = (a0) v0.x(parcel, i18, a0.CREATOR);
                            break;
                        case 4:
                            m10 = (M) v0.x(parcel, i18, M.CREATOR);
                            break;
                        case 5:
                            c0Var = (c0) v0.x(parcel, i18, c0.CREATOR);
                            break;
                        case 6:
                            p10 = (P) v0.x(parcel, i18, P.CREATOR);
                            break;
                        case 7:
                            q4 = (Q) v0.x(parcel, i18, Q.CREATOR);
                            break;
                        case '\b':
                            b0Var = (b0) v0.x(parcel, i18, b0.CREATOR);
                            break;
                        case '\t':
                            s12 = (S) v0.x(parcel, i18, S.CREATOR);
                            break;
                        case '\n':
                            c4328w = (C4328w) v0.x(parcel, i18, C4328w.CREATOR);
                            break;
                        case 11:
                            t10 = (T) v0.x(parcel, i18, T.CREATOR);
                            break;
                        default:
                            v0.m0(i18, parcel);
                            break;
                    }
                }
                v0.D(iO010, parcel);
                return new C4312f(c4327v, a0Var, m10, c0Var, p10, q4, b0Var, s12, c4328w, t10);
            case 15:
                int iO011 = v0.o0(parcel);
                boolean Z11 = false;
                while (parcel.dataPosition() < iO011) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        v0.m0(i19, parcel);
                    } else {
                        Z11 = v0.Z(i19, parcel);
                    }
                }
                v0.D(iO011, parcel);
                return new C4314h(Z11);
            case 16:
                int iO012 = v0.o0(parcel);
                byte[] bArrR3 = null;
                byte[] bArrR4 = null;
                while (parcel.dataPosition() < iO012) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        bArrR3 = v0.r(i20, parcel);
                    } else if (c16 != 2) {
                        v0.m0(i20, parcel);
                    } else {
                        bArrR4 = v0.r(i20, parcel);
                    }
                }
                v0.D(iO012, parcel);
                return new X(bArrR3, bArrR4);
            case 17:
                int iO013 = v0.o0(parcel);
                byte[] bArrR5 = null;
                boolean Z12 = false;
                while (parcel.dataPosition() < iO013) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        Z12 = v0.Z(i21, parcel);
                    } else if (c17 != 2) {
                        v0.m0(i21, parcel);
                    } else {
                        bArrR5 = v0.r(i21, parcel);
                    }
                }
                v0.D(iO013, parcel);
                return new Y(Z12, bArrR5);
            case 18:
                int iO014 = v0.o0(parcel);
                byte[] bArrR6 = null;
                byte[] bArrR7 = null;
                byte[] bArrR8 = null;
                byte[] bArrR9 = null;
                byte[] bArrR10 = null;
                while (parcel.dataPosition() < iO014) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 2) {
                        bArrR6 = v0.r(i22, parcel);
                    } else if (c18 == 3) {
                        bArrR7 = v0.r(i22, parcel);
                    } else if (c18 == 4) {
                        bArrR8 = v0.r(i22, parcel);
                    } else if (c18 == 5) {
                        bArrR9 = v0.r(i22, parcel);
                    } else if (c18 != 6) {
                        v0.m0(i22, parcel);
                    } else {
                        bArrR10 = v0.r(i22, parcel);
                    }
                }
                v0.D(iO014, parcel);
                return new C4315i(bArrR6, bArrR7, bArrR8, bArrR9, bArrR10);
            case 19:
                int iO015 = v0.o0(parcel);
                byte[] bArrR11 = null;
                byte[] bArrR12 = null;
                byte[] bArrR13 = null;
                String[] strArrZ = null;
                while (parcel.dataPosition() < iO015) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 2) {
                        bArrR11 = v0.r(i23, parcel);
                    } else if (c19 == 3) {
                        bArrR12 = v0.r(i23, parcel);
                    } else if (c19 == 4) {
                        bArrR13 = v0.r(i23, parcel);
                    } else if (c19 != 5) {
                        v0.m0(i23, parcel);
                    } else {
                        strArrZ = v0.z(i23, parcel);
                    }
                }
                v0.D(iO015, parcel);
                return new C4316j(bArrR11, bArrR12, bArrR13, strArrZ);
            case 20:
                int iO016 = v0.o0(parcel);
                int iF02 = 0;
                String strY12 = null;
                int iF03 = 0;
                while (parcel.dataPosition() < iO016) {
                    int i24 = parcel.readInt();
                    char c20 = (char) i24;
                    if (c20 == 2) {
                        iF02 = v0.f0(i24, parcel);
                    } else if (c20 == 3) {
                        strY12 = v0.y(i24, parcel);
                    } else if (c20 != 4) {
                        v0.m0(i24, parcel);
                    } else {
                        iF03 = v0.f0(i24, parcel);
                    }
                }
                v0.D(iO016, parcel);
                return new C4317k(iF02, strY12, iF03);
            case 21:
                int iO017 = v0.o0(parcel);
                String strY13 = null;
                Boolean boolA0 = null;
                String strY14 = null;
                String strY15 = null;
                while (parcel.dataPosition() < iO017) {
                    int i25 = parcel.readInt();
                    char c21 = (char) i25;
                    if (c21 == 2) {
                        strY13 = v0.y(i25, parcel);
                    } else if (c21 == 3) {
                        boolA0 = v0.a0(i25, parcel);
                    } else if (c21 == 4) {
                        strY14 = v0.y(i25, parcel);
                    } else if (c21 != 5) {
                        v0.m0(i25, parcel);
                    } else {
                        strY15 = v0.y(i25, parcel);
                    }
                }
                v0.D(iO017, parcel);
                return new C4319m(strY13, boolA0, strY14, strY15);
            case 22:
                int iO018 = v0.o0(parcel);
                C4330y c4330y = null;
                Uri uri = null;
                byte[] bArrR14 = null;
                while (parcel.dataPosition() < iO018) {
                    int i26 = parcel.readInt();
                    char c22 = (char) i26;
                    if (c22 == 2) {
                        c4330y = (C4330y) v0.x(parcel, i26, C4330y.CREATOR);
                    } else if (c22 == 3) {
                        uri = (Uri) v0.x(parcel, i26, Uri.CREATOR);
                    } else if (c22 != 4) {
                        v0.m0(i26, parcel);
                    } else {
                        bArrR14 = v0.r(i26, parcel);
                    }
                }
                v0.D(iO018, parcel);
                return new C4320n(c4330y, uri, bArrR14);
            case 23:
                int iO019 = v0.o0(parcel);
                B b5 = null;
                Uri uri2 = null;
                byte[] bArrR15 = null;
                while (parcel.dataPosition() < iO019) {
                    int i27 = parcel.readInt();
                    char c23 = (char) i27;
                    if (c23 == 2) {
                        b5 = (B) v0.x(parcel, i27, B.CREATOR);
                    } else if (c23 == 3) {
                        uri2 = (Uri) v0.x(parcel, i27, Uri.CREATOR);
                    } else if (c23 != 4) {
                        v0.m0(i27, parcel);
                    } else {
                        bArrR15 = v0.r(i27, parcel);
                    }
                }
                v0.D(iO019, parcel);
                return new C4321o(b5, uri2, bArrR15);
            case 24:
                try {
                    return r.c(parcel.readInt());
                } catch (C4323q e14) {
                    throw new RuntimeException(e14);
                }
            case 25:
                int iO020 = v0.o0(parcel);
                byte[] bArrR16 = null;
                byte[] bArrR17 = null;
                byte[] bArrR18 = null;
                long jH0 = 0;
                while (parcel.dataPosition() < iO020) {
                    int i28 = parcel.readInt();
                    char c24 = (char) i28;
                    if (c24 == 1) {
                        jH0 = v0.h0(i28, parcel);
                    } else if (c24 == 2) {
                        bArrR16 = v0.r(i28, parcel);
                    } else if (c24 == 3) {
                        bArrR17 = v0.r(i28, parcel);
                    } else if (c24 != 4) {
                        v0.m0(i28, parcel);
                    } else {
                        bArrR18 = v0.r(i28, parcel);
                    }
                }
                v0.D(iO020, parcel);
                return new Z(jH0, bArrR16, bArrR17, bArrR18);
            case 26:
                int iO021 = v0.o0(parcel);
                ArrayList arrayListC3 = null;
                while (parcel.dataPosition() < iO021) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        v0.m0(i29, parcel);
                    } else {
                        arrayListC3 = v0.C(parcel, i29, Z.CREATOR);
                    }
                }
                v0.D(iO021, parcel);
                return new a0(arrayListC3);
            case 27:
                int iO022 = v0.o0(parcel);
                boolean Z13 = false;
                while (parcel.dataPosition() < iO022) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 1) {
                        v0.m0(i30, parcel);
                    } else {
                        Z13 = v0.Z(i30, parcel);
                    }
                }
                v0.D(iO022, parcel);
                return new b0(Z13);
            case 28:
                try {
                    return EnumC4326u.c(parcel.readInt());
                } catch (C4325t e15) {
                    throw new IllegalArgumentException(e15);
                }
            default:
                int iO023 = v0.o0(parcel);
                String strY16 = null;
                while (parcel.dataPosition() < iO023) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 2) {
                        v0.m0(i31, parcel);
                    } else {
                        strY16 = v0.y(i31, parcel);
                    }
                }
                v0.D(iO023, parcel);
                return new C4327v(strY16);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f46941a) {
            case 0:
                return new C4306A[i5];
            case 1:
                return new B[i5];
            case 2:
                return new C[i5];
            case 3:
                return new E[i5];
            case 4:
                return new F[i5];
            case 5:
                return new I[i5];
            case 6:
                return new J[i5];
            case 7:
                return new L[i5];
            case 8:
                return new M[i5];
            case 9:
                return new W[i5];
            case 10:
                return new N[i5];
            case 11:
                return new EnumC4311e[i5];
            case 12:
                return new O[i5];
            case 13:
                return new C4313g[i5];
            case 14:
                return new C4312f[i5];
            case 15:
                return new C4314h[i5];
            case 16:
                return new X[i5];
            case 17:
                return new Y[i5];
            case 18:
                return new C4315i[i5];
            case 19:
                return new C4316j[i5];
            case 20:
                return new C4317k[i5];
            case 21:
                return new C4319m[i5];
            case 22:
                return new C4320n[i5];
            case 23:
                return new C4321o[i5];
            case 24:
                return new r[i5];
            case 25:
                return new Z[i5];
            case 26:
                return new a0[i5];
            case 27:
                return new b0[i5];
            case 28:
                return new EnumC4326u[i5];
            default:
                return new C4327v[i5];
        }
    }
}
