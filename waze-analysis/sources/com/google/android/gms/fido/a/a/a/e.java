package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5376a;

    e(int i2) {
        this.f5376a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = 0;
        byte[] bArrU = null;
        ArrayList arrayListP = null;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        switch (this.f5376a) {
            case 0:
                String string = parcel.readString();
                try {
                    String str = string;
                    return g.a(string);
                } catch (f e2) {
                    throw new RuntimeException(e2);
                }
            case 1:
                String string2 = parcel.readString();
                try {
                    String str2 = string2;
                    return d.a(string2);
                } catch (c e3) {
                    throw new RuntimeException(e3);
                }
            case 2:
                int iF = com.google.android.gms.common.internal.bb.F(parcel);
                be beVar = null;
                l lVar = null;
                k kVar = null;
                m mVar = null;
                String strN5 = null;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    int iC = com.google.android.gms.common.internal.bb.C(i2);
                    if (iC == 1) {
                        beVar = (be) com.google.android.gms.common.internal.bb.J(parcel, i2, be.CREATOR);
                    } else if (iC == 2) {
                        lVar = (l) com.google.android.gms.common.internal.bb.J(parcel, i2, l.CREATOR);
                    } else if (iC == 3) {
                        kVar = (k) com.google.android.gms.common.internal.bb.J(parcel, i2, k.CREATOR);
                    } else if (iC == 4) {
                        mVar = (m) com.google.android.gms.common.internal.bb.J(parcel, i2, m.CREATOR);
                    } else if (iC != 5) {
                        com.google.android.gms.common.internal.bb.S(parcel, i2);
                    } else {
                        strN5 = com.google.android.gms.common.internal.bb.N(parcel, i2);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF);
                return new j(beVar, lVar, kVar, mVar, strN5);
            case 3:
                int iF2 = com.google.android.gms.common.internal.bb.F(parcel);
                aa aaVar = null;
                v vVar = null;
                bb bbVar = null;
                ab abVar = null;
                ac acVar = null;
                ad adVar = null;
                w wVar = null;
                af afVar = null;
                ae aeVar = null;
                ai aiVar = null;
                ax axVar = null;
                ag agVar = null;
                ah ahVar = null;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    switch (com.google.android.gms.common.internal.bb.C(i3)) {
                        case 2:
                            aaVar = (aa) com.google.android.gms.common.internal.bb.J(parcel, i3, aa.CREATOR);
                            break;
                        case 3:
                            vVar = (v) com.google.android.gms.common.internal.bb.J(parcel, i3, v.CREATOR);
                            break;
                        case 4:
                            bbVar = (bb) com.google.android.gms.common.internal.bb.J(parcel, i3, bb.CREATOR);
                            break;
                        case 5:
                            abVar = (ab) com.google.android.gms.common.internal.bb.J(parcel, i3, ab.CREATOR);
                            break;
                        case 6:
                            acVar = (ac) com.google.android.gms.common.internal.bb.J(parcel, i3, ac.CREATOR);
                            break;
                        case 7:
                            adVar = (ad) com.google.android.gms.common.internal.bb.J(parcel, i3, ad.CREATOR);
                            break;
                        case 8:
                            wVar = (w) com.google.android.gms.common.internal.bb.J(parcel, i3, w.CREATOR);
                            break;
                        case 9:
                            afVar = (af) com.google.android.gms.common.internal.bb.J(parcel, i3, af.CREATOR);
                            break;
                        case 10:
                            aeVar = (ae) com.google.android.gms.common.internal.bb.J(parcel, i3, ae.CREATOR);
                            break;
                        case 11:
                            aiVar = (ai) com.google.android.gms.common.internal.bb.J(parcel, i3, ai.CREATOR);
                            break;
                        case 12:
                            axVar = (ax) com.google.android.gms.common.internal.bb.J(parcel, i3, ax.CREATOR);
                            break;
                        case 13:
                            agVar = (ag) com.google.android.gms.common.internal.bb.J(parcel, i3, ag.CREATOR);
                            break;
                        case 14:
                            ahVar = (ah) com.google.android.gms.common.internal.bb.J(parcel, i3, ah.CREATOR);
                            break;
                        default:
                            com.google.android.gms.common.internal.bb.S(parcel, i3);
                            break;
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF2);
                return new i(aaVar, vVar, bbVar, abVar, acVar, adVar, wVar, afVar, aeVar, aiVar, axVar, agVar, ahVar);
            case 4:
                int iF3 = com.google.android.gms.common.internal.bb.F(parcel);
                byte[] bArrU2 = null;
                byte[] bArrU3 = null;
                byte[] bArrU4 = null;
                byte[] bArrU5 = null;
                byte[] bArrU6 = null;
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    int iC2 = com.google.android.gms.common.internal.bb.C(i4);
                    if (iC2 == 2) {
                        bArrU2 = com.google.android.gms.common.internal.bb.U(parcel, i4);
                    } else if (iC2 == 3) {
                        bArrU3 = com.google.android.gms.common.internal.bb.U(parcel, i4);
                    } else if (iC2 == 4) {
                        bArrU4 = com.google.android.gms.common.internal.bb.U(parcel, i4);
                    } else if (iC2 == 5) {
                        bArrU5 = com.google.android.gms.common.internal.bb.U(parcel, i4);
                    } else if (iC2 != 6) {
                        com.google.android.gms.common.internal.bb.S(parcel, i4);
                    } else {
                        bArrU6 = com.google.android.gms.common.internal.bb.U(parcel, i4);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF3);
                return new n(bArrU2, bArrU3, bArrU4, bArrU5, bArrU6);
            case 5:
                int iF4 = com.google.android.gms.common.internal.bb.F(parcel);
                byte[] bArrU7 = null;
                byte[] bArrU8 = null;
                String[] strArrX = null;
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    int iC3 = com.google.android.gms.common.internal.bb.C(i5);
                    if (iC3 == 2) {
                        bArrU = com.google.android.gms.common.internal.bb.U(parcel, i5);
                    } else if (iC3 == 3) {
                        bArrU7 = com.google.android.gms.common.internal.bb.U(parcel, i5);
                    } else if (iC3 == 4) {
                        bArrU8 = com.google.android.gms.common.internal.bb.U(parcel, i5);
                    } else if (iC3 != 5) {
                        com.google.android.gms.common.internal.bb.S(parcel, i5);
                    } else {
                        strArrX = com.google.android.gms.common.internal.bb.X(parcel, i5);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF4);
                return new o(bArrU, bArrU7, bArrU8, strArrX);
            case 6:
                int iF5 = com.google.android.gms.common.internal.bb.F(parcel);
                int iD2 = 0;
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    int iC4 = com.google.android.gms.common.internal.bb.C(i6);
                    if (iC4 == 2) {
                        iD = com.google.android.gms.common.internal.bb.D(parcel, i6);
                    } else if (iC4 == 3) {
                        strN4 = com.google.android.gms.common.internal.bb.N(parcel, i6);
                    } else if (iC4 != 4) {
                        com.google.android.gms.common.internal.bb.S(parcel, i6);
                    } else {
                        iD2 = com.google.android.gms.common.internal.bb.D(parcel, i6);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF5);
                return new p(iD, strN4, iD2);
            case 7:
                int iF6 = com.google.android.gms.common.internal.bb.F(parcel);
                Boolean boolK = null;
                String strN6 = null;
                String strN7 = null;
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    int iC5 = com.google.android.gms.common.internal.bb.C(i7);
                    if (iC5 == 2) {
                        strN3 = com.google.android.gms.common.internal.bb.N(parcel, i7);
                    } else if (iC5 == 3) {
                        boolK = com.google.android.gms.common.internal.bb.K(parcel, i7);
                    } else if (iC5 == 4) {
                        strN6 = com.google.android.gms.common.internal.bb.N(parcel, i7);
                    } else if (iC5 != 5) {
                        com.google.android.gms.common.internal.bb.S(parcel, i7);
                    } else {
                        strN7 = com.google.android.gms.common.internal.bb.N(parcel, i7);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF6);
                return new r(strN3, boolK, strN6, strN7);
            case 8:
                try {
                    Integer numValueOf = Integer.valueOf(parcel.readInt());
                    Integer num = numValueOf;
                    return t.b(numValueOf.intValue());
                } catch (s e4) {
                    throw new RuntimeException(e4);
                }
            case 9:
                int iF7 = com.google.android.gms.common.internal.bb.F(parcel);
                byte[] bArrU9 = null;
                byte[] bArrU10 = null;
                byte[] bArrU11 = null;
                long jG = 0;
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    int iC6 = com.google.android.gms.common.internal.bb.C(i8);
                    if (iC6 == 1) {
                        jG = com.google.android.gms.common.internal.bb.G(parcel, i8);
                    } else if (iC6 == 2) {
                        bArrU9 = com.google.android.gms.common.internal.bb.U(parcel, i8);
                    } else if (iC6 == 3) {
                        bArrU10 = com.google.android.gms.common.internal.bb.U(parcel, i8);
                    } else if (iC6 != 4) {
                        com.google.android.gms.common.internal.bb.S(parcel, i8);
                    } else {
                        bArrU11 = com.google.android.gms.common.internal.bb.U(parcel, i8);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF7);
                return new u(jG, bArrU9, bArrU10, bArrU11);
            case 10:
                try {
                    return z.b(parcel.readInt());
                } catch (y e5) {
                    throw new IllegalArgumentException(e5);
                }
            case 11:
                int iF8 = com.google.android.gms.common.internal.bb.F(parcel);
                byte[] bArrU12 = null;
                byte[] bArrU13 = null;
                byte[] bArrU14 = null;
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    int iC7 = com.google.android.gms.common.internal.bb.C(i9);
                    if (iC7 == 1) {
                        bArrU12 = com.google.android.gms.common.internal.bb.U(parcel, i9);
                    } else if (iC7 == 2) {
                        bArrU13 = com.google.android.gms.common.internal.bb.U(parcel, i9);
                    } else if (iC7 == 3) {
                        bArrU14 = com.google.android.gms.common.internal.bb.U(parcel, i9);
                    } else if (iC7 != 4) {
                        com.google.android.gms.common.internal.bb.S(parcel, i9);
                    } else {
                        iD = com.google.android.gms.common.internal.bb.D(parcel, i9);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF8);
                return new ag(bArrU12 == null ? null : com.google.v.v.q(bArrU12), bArrU13 == null ? null : com.google.v.v.q(bArrU13), bArrU14 != null ? com.google.v.v.q(bArrU14) : null, iD);
            case 12:
                int iF9 = com.google.android.gms.common.internal.bb.F(parcel);
                String strN8 = null;
                String strN9 = null;
                byte[] bArrU15 = null;
                o oVar = null;
                n nVar = null;
                p pVar = null;
                j jVar = null;
                String strN10 = null;
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    switch (com.google.android.gms.common.internal.bb.C(i10)) {
                        case 1:
                            strN8 = com.google.android.gms.common.internal.bb.N(parcel, i10);
                            break;
                        case 2:
                            strN9 = com.google.android.gms.common.internal.bb.N(parcel, i10);
                            break;
                        case 3:
                            bArrU15 = com.google.android.gms.common.internal.bb.U(parcel, i10);
                            break;
                        case 4:
                            oVar = (o) com.google.android.gms.common.internal.bb.J(parcel, i10, o.CREATOR);
                            break;
                        case 5:
                            nVar = (n) com.google.android.gms.common.internal.bb.J(parcel, i10, n.CREATOR);
                            break;
                        case 6:
                            pVar = (p) com.google.android.gms.common.internal.bb.J(parcel, i10, p.CREATOR);
                            break;
                        case 7:
                            jVar = (j) com.google.android.gms.common.internal.bb.J(parcel, i10, j.CREATOR);
                            break;
                        case 8:
                            strN10 = com.google.android.gms.common.internal.bb.N(parcel, i10);
                            break;
                        case 9:
                            com.google.android.gms.common.internal.bb.N(parcel, i10);
                            break;
                        default:
                            com.google.android.gms.common.internal.bb.S(parcel, i10);
                            break;
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF9);
                return new aj(strN8, strN9, bArrU15, oVar, nVar, pVar, jVar, strN10);
            case 13:
                String string3 = parcel.readString();
                try {
                    String str3 = string3;
                    return as.a(string3);
                } catch (ar e6) {
                    throw new RuntimeException(e6);
                }
            case 14:
                String string4 = parcel.readString();
                if (string4 == null) {
                    string4 = "";
                }
                try {
                    return aw.a(string4);
                } catch (av e7) {
                    throw new RuntimeException(e7);
                }
            case 15:
                int iF10 = com.google.android.gms.common.internal.bb.F(parcel);
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    if (com.google.android.gms.common.internal.bb.C(i11) != 1) {
                        com.google.android.gms.common.internal.bb.S(parcel, i11);
                    } else {
                        strN2 = com.google.android.gms.common.internal.bb.N(parcel, i11);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF10);
                return new ax(strN2);
            case 16:
                String string5 = parcel.readString();
                try {
                    String str4 = string5;
                    return ay.a(string5);
                } catch (az e8) {
                    throw new RuntimeException(e8);
                }
            case 17:
                int iF11 = com.google.android.gms.common.internal.bb.F(parcel);
                String strN11 = null;
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    int iC8 = com.google.android.gms.common.internal.bb.C(i12);
                    if (iC8 == 2) {
                        strN = com.google.android.gms.common.internal.bb.N(parcel, i12);
                    } else if (iC8 != 3) {
                        com.google.android.gms.common.internal.bb.S(parcel, i12);
                    } else {
                        strN11 = com.google.android.gms.common.internal.bb.N(parcel, i12);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF11);
                return new ba(strN, strN11);
            case 18:
                String string6 = parcel.readString();
                try {
                    String str5 = string6;
                    return bd.a(string6);
                } catch (bc e9) {
                    throw new RuntimeException(e9);
                }
            case 19:
                int iF12 = com.google.android.gms.common.internal.bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    int i13 = parcel.readInt();
                    if (com.google.android.gms.common.internal.bb.C(i13) != 1) {
                        com.google.android.gms.common.internal.bb.S(parcel, i13);
                    } else {
                        arrayListP = com.google.android.gms.common.internal.bb.P(parcel, i13, bf.CREATOR);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF12);
                return new be(arrayListP);
            default:
                int iF13 = com.google.android.gms.common.internal.bb.F(parcel);
                short sQ = 0;
                short sQ2 = 0;
                while (parcel.dataPosition() < iF13) {
                    int i14 = parcel.readInt();
                    int iC9 = com.google.android.gms.common.internal.bb.C(i14);
                    if (iC9 == 1) {
                        iD = com.google.android.gms.common.internal.bb.D(parcel, i14);
                    } else if (iC9 == 2) {
                        sQ = com.google.android.gms.common.internal.bb.Q(parcel, i14);
                    } else if (iC9 != 3) {
                        com.google.android.gms.common.internal.bb.S(parcel, i14);
                    } else {
                        sQ2 = com.google.android.gms.common.internal.bb.Q(parcel, i14);
                    }
                }
                com.google.android.gms.common.internal.bb.R(parcel, iF13);
                return new bf(iD, sQ, sQ2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f5376a) {
            case 0:
                return new g[i2];
            case 1:
                return new d[i2];
            case 2:
                return new j[i2];
            case 3:
                return new i[i2];
            case 4:
                return new n[i2];
            case 5:
                return new o[i2];
            case 6:
                return new p[i2];
            case 7:
                return new r[i2];
            case 8:
                return new t[i2];
            case 9:
                return new u[i2];
            case 10:
                return new z[i2];
            case 11:
                return new ag[i2];
            case 12:
                return new aj[i2];
            case 13:
                return new as[i2];
            case 14:
                return new aw[i2];
            case 15:
                return new ax[i2];
            case 16:
                return new ay[i2];
            case 17:
                return new ba[i2];
            case 18:
                return new bd[i2];
            case 19:
                return new be[i2];
            default:
                return new bf[i2];
        }
    }

    public e(int i2, char[] cArr) {
        this.f5376a = i2;
    }
}
