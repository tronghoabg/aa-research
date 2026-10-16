package I2;

import J8.A;
import J8.C;
import J8.C0627b;
import J8.C0630e;
import J8.C0631f;
import J8.D;
import J8.F;
import J8.H;
import J8.I;
import J8.q;
import J8.r;
import J8.u;
import J8.w;
import J8.z;
import N1.B;
import N1.C0760i;
import N1.C0761j;
import N1.J;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5288a;

    public /* synthetic */ d(int i5) {
        this.f5288a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5288a) {
            case 0:
                return new f(parcel);
            case 1:
                return new g();
            case 2:
                return new j(parcel);
            case 3:
                return new k(parcel.readLong(), parcel.readLong());
            case 4:
                return new I5.c(parcel);
            case 5:
                return new I5.b(parcel);
            case 6:
                return new J2.a(parcel);
            case 7:
                int iO0 = v0.o0(parcel);
                String strY = null;
                String strY2 = null;
                String strY3 = null;
                String strY4 = null;
                String strY5 = null;
                String strY6 = null;
                String strY7 = null;
                String strY8 = null;
                boolean Z10 = false;
                boolean Z11 = false;
                int iF0 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            strY = v0.y(i5, parcel);
                            break;
                        case 2:
                            strY2 = v0.y(i5, parcel);
                            break;
                        case 3:
                            strY3 = v0.y(i5, parcel);
                            break;
                        case 4:
                            strY4 = v0.y(i5, parcel);
                            break;
                        case 5:
                            Z10 = v0.Z(i5, parcel);
                            break;
                        case 6:
                            strY5 = v0.y(i5, parcel);
                            break;
                        case 7:
                            Z11 = v0.Z(i5, parcel);
                            break;
                        case '\b':
                            strY6 = v0.y(i5, parcel);
                            break;
                        case '\t':
                            iF0 = v0.f0(i5, parcel);
                            break;
                        case '\n':
                            strY7 = v0.y(i5, parcel);
                            break;
                        case 11:
                            strY8 = v0.y(i5, parcel);
                            break;
                        default:
                            v0.m0(i5, parcel);
                            break;
                    }
                }
                v0.D(iO0, parcel);
                return new C0627b(strY, strY2, strY3, strY4, Z10, strY5, Z11, strY6, iF0, strY7, strY8);
            case 8:
                int iO02 = v0.o0(parcel);
                String strY9 = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        v0.m0(i10, parcel);
                    } else {
                        strY9 = v0.y(i10, parcel);
                    }
                }
                v0.D(iO02, parcel);
                return new q(strY9);
            case 9:
                int iO03 = v0.o0(parcel);
                String strY10 = null;
                String strY11 = null;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strY10 = v0.y(i11, parcel);
                    } else if (c10 != 2) {
                        v0.m0(i11, parcel);
                    } else {
                        strY11 = v0.y(i11, parcel);
                    }
                }
                v0.D(iO03, parcel);
                return new r(strY10, strY11);
            case 10:
                int iO04 = v0.o0(parcel);
                String strY12 = null;
                String strY13 = null;
                String strY14 = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        strY12 = v0.y(i12, parcel);
                    } else if (c11 == 2) {
                        strY13 = v0.y(i12, parcel);
                    } else if (c11 != 3) {
                        v0.m0(i12, parcel);
                    } else {
                        strY14 = v0.y(i12, parcel);
                    }
                }
                v0.D(iO04, parcel);
                return new H(strY12, strY13, strY14);
            case 11:
                int iO05 = v0.o0(parcel);
                String strY15 = null;
                String strY16 = null;
                String strY17 = null;
                String strY18 = null;
                boolean Z12 = false;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        strY15 = v0.y(i13, parcel);
                    } else if (c12 == 2) {
                        strY16 = v0.y(i13, parcel);
                    } else if (c12 == 4) {
                        strY17 = v0.y(i13, parcel);
                    } else if (c12 == 5) {
                        Z12 = v0.Z(i13, parcel);
                    } else if (c12 != 6) {
                        v0.m0(i13, parcel);
                    } else {
                        strY18 = v0.y(i13, parcel);
                    }
                }
                v0.D(iO05, parcel);
                return new u(Z12, strY15, strY16, strY17, strY18);
            case 12:
                int iO06 = v0.o0(parcel);
                String strY19 = null;
                String strY20 = null;
                String strY21 = null;
                long jH0 = 0;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        strY19 = v0.y(i14, parcel);
                    } else if (c13 == 2) {
                        strY20 = v0.y(i14, parcel);
                    } else if (c13 == 3) {
                        jH0 = v0.h0(i14, parcel);
                    } else if (c13 != 4) {
                        v0.m0(i14, parcel);
                    } else {
                        strY21 = v0.y(i14, parcel);
                    }
                }
                v0.D(iO06, parcel);
                return new z(jH0, strY19, strY20, strY21);
            case 13:
                int iO07 = v0.o0(parcel);
                String strY22 = null;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        v0.m0(i15, parcel);
                    } else {
                        strY22 = v0.y(i15, parcel);
                    }
                }
                v0.D(iO07, parcel);
                return new A(strY22);
            case 14:
                int iO08 = v0.o0(parcel);
                String strY23 = null;
                String strY24 = null;
                zzahp zzahpVar = null;
                long jH02 = 0;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        strY23 = v0.y(i16, parcel);
                    } else if (c14 == 2) {
                        strY24 = v0.y(i16, parcel);
                    } else if (c14 == 3) {
                        jH02 = v0.h0(i16, parcel);
                    } else if (c14 != 4) {
                        v0.m0(i16, parcel);
                    } else {
                        zzahpVar = (zzahp) v0.x(parcel, i16, zzahp.CREATOR);
                    }
                }
                v0.D(iO08, parcel);
                return new C(strY23, strY24, jH02, zzahpVar);
            case 15:
                int iO09 = v0.o0(parcel);
                String strY25 = null;
                String strY26 = null;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        strY25 = v0.y(i17, parcel);
                    } else if (c15 != 2) {
                        v0.m0(i17, parcel);
                    } else {
                        strY26 = v0.y(i17, parcel);
                    }
                }
                v0.D(iO09, parcel);
                return new D(strY25, strY26);
            case 16:
                int iO010 = v0.o0(parcel);
                String strY27 = null;
                boolean Z13 = false;
                boolean Z14 = false;
                String strY28 = null;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        strY27 = v0.y(i18, parcel);
                    } else if (c16 == 3) {
                        strY28 = v0.y(i18, parcel);
                    } else if (c16 == 4) {
                        Z13 = v0.Z(i18, parcel);
                    } else if (c16 != 5) {
                        v0.m0(i18, parcel);
                    } else {
                        Z14 = v0.Z(i18, parcel);
                    }
                }
                v0.D(iO010, parcel);
                return new F(strY27, strY28, Z13, Z14);
            case 17:
                int iO011 = v0.o0(parcel);
                while (parcel.dataPosition() < iO011) {
                    v0.m0(parcel.readInt(), parcel);
                }
                v0.D(iO011, parcel);
                return new w();
            case 18:
                int iO012 = v0.o0(parcel);
                String strY29 = null;
                String strY30 = null;
                String strY31 = null;
                zzahr zzahrVar = null;
                String strY32 = null;
                String strY33 = null;
                String strY34 = null;
                while (parcel.dataPosition() < iO012) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strY29 = v0.y(i19, parcel);
                            break;
                        case 2:
                            strY30 = v0.y(i19, parcel);
                            break;
                        case 3:
                            strY31 = v0.y(i19, parcel);
                            break;
                        case 4:
                            zzahrVar = (zzahr) v0.x(parcel, i19, zzahr.CREATOR);
                            break;
                        case 5:
                            strY32 = v0.y(i19, parcel);
                            break;
                        case 6:
                            strY33 = v0.y(i19, parcel);
                            break;
                        case 7:
                            strY34 = v0.y(i19, parcel);
                            break;
                        default:
                            v0.m0(i19, parcel);
                            break;
                    }
                }
                v0.D(iO012, parcel);
                return new I(strY29, strY30, strY31, zzahrVar, strY32, strY33, strY34);
            case 19:
                int iO013 = v0.o0(parcel);
                String strY35 = null;
                String strY36 = null;
                String strY37 = null;
                String strY38 = null;
                boolean Z15 = false;
                while (parcel.dataPosition() < iO013) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        strY35 = v0.y(i20, parcel);
                    } else if (c17 == 2) {
                        strY36 = v0.y(i20, parcel);
                    } else if (c17 == 3) {
                        strY37 = v0.y(i20, parcel);
                    } else if (c17 == 4) {
                        strY38 = v0.y(i20, parcel);
                    } else if (c17 != 5) {
                        v0.m0(i20, parcel);
                    } else {
                        Z15 = v0.Z(i20, parcel);
                    }
                }
                v0.D(iO013, parcel);
                return new C0630e(Z15, strY35, strY36, strY37, strY38);
            case 20:
                int iO014 = v0.o0(parcel);
                String strY39 = null;
                while (parcel.dataPosition() < iO014) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        v0.m0(i21, parcel);
                    } else {
                        strY39 = v0.y(i21, parcel);
                    }
                }
                v0.D(iO014, parcel);
                return new C0631f(strY39);
            case 21:
                return new C0761j(parcel);
            case 22:
                return new C0760i(parcel);
            case 23:
                return new B(parcel);
            case 24:
                return new J(parcel);
            case 25:
                Q7.b bVar = new Q7.b(parcel);
                bVar.f9887a = ((Integer) parcel.readValue(Q7.b.class.getClassLoader())).intValue();
                return bVar;
            case 26:
                return new R1.a(parcel);
            case 27:
                return new R1.d(parcel);
            case 28:
                return new R1.e(parcel);
            default:
                int iO015 = v0.o0(parcel);
                String strY40 = null;
                String strY41 = null;
                int iF02 = 0;
                int iF03 = 0;
                int iF04 = 0;
                long jH03 = 0;
                while (parcel.dataPosition() < iO015) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iF02 = v0.f0(i22, parcel);
                            break;
                        case 2:
                            jH03 = v0.h0(i22, parcel);
                            break;
                        case 3:
                            strY40 = v0.y(i22, parcel);
                            break;
                        case 4:
                            iF03 = v0.f0(i22, parcel);
                            break;
                        case 5:
                            iF04 = v0.f0(i22, parcel);
                            break;
                        case 6:
                            strY41 = v0.y(i22, parcel);
                            break;
                        default:
                            v0.m0(i22, parcel);
                            break;
                    }
                }
                v0.D(iO015, parcel);
                return new T6.a(iF02, jH03, strY40, iF03, iF04, strY41);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f5288a) {
            case 0:
                return new f[i5];
            case 1:
                return new g[i5];
            case 2:
                return new j[i5];
            case 3:
                return new k[i5];
            case 4:
                return new I5.c[i5];
            case 5:
                return new I5.b[i5];
            case 6:
                return new J2.a[i5];
            case 7:
                return new C0627b[i5];
            case 8:
                return new q[i5];
            case 9:
                return new r[i5];
            case 10:
                return new H[i5];
            case 11:
                return new u[i5];
            case 12:
                return new z[i5];
            case 13:
                return new A[i5];
            case 14:
                return new C[i5];
            case 15:
                return new D[i5];
            case 16:
                return new F[i5];
            case 17:
                return new w[i5];
            case 18:
                return new I[i5];
            case 19:
                return new C0630e[i5];
            case 20:
                return new C0631f[i5];
            case 21:
                return new C0761j[i5];
            case 22:
                return new C0760i[i5];
            case 23:
                return new B[i5];
            case 24:
                return new J[i5];
            case 25:
                return new Q7.b[i5];
            case 26:
                return new R1.a[i5];
            case 27:
                return new R1.d[i5];
            case 28:
                return new R1.e[i5];
            default:
                return new T6.a[i5];
        }
    }
}
