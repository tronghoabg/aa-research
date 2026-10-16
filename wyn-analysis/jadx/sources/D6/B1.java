package D6;

import G6.C0553q;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import l8.AbstractC3409K;

/* loaded from: classes3.dex */
public final class B1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2337a;

    public /* synthetic */ B1(int i5) {
        this.f2337a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2337a) {
            case 0:
                int iO0 = U8.v0.o0(parcel);
                int iF0 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        U8.v0.m0(i5, parcel);
                    } else {
                        iF0 = U8.v0.f0(i5, parcel);
                    }
                }
                U8.v0.D(iO0, parcel);
                return new A1(iF0);
            case 1:
                return new E2.a(parcel);
            case 2:
                return new E2.b(parcel);
            case 3:
                int iO02 = U8.v0.o0(parcel);
                String strY = null;
                String strY2 = null;
                String strY3 = null;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        strY = U8.v0.y(i10, parcel);
                    } else if (c10 == 2) {
                        strY2 = U8.v0.y(i10, parcel);
                    } else if (c10 != 3) {
                        U8.v0.m0(i10, parcel);
                    } else {
                        strY3 = U8.v0.y(i10, parcel);
                    }
                }
                U8.v0.D(iO02, parcel);
                return new E6.a(strY, strY2, strY3);
            case 4:
                return new F2.b(parcel);
            case 5:
                return new F2.c(parcel);
            case 6:
                int iO03 = U8.v0.o0(parcel);
                String strY4 = null;
                String strY5 = null;
                String strY6 = null;
                String strY7 = null;
                String strY8 = null;
                String strY9 = null;
                String strY10 = null;
                Intent intent = null;
                IBinder iBinderE0 = null;
                Bundle bundleQ = null;
                boolean Z10 = false;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strY4 = U8.v0.y(i11, parcel);
                            break;
                        case 3:
                            strY5 = U8.v0.y(i11, parcel);
                            break;
                        case 4:
                            strY6 = U8.v0.y(i11, parcel);
                            break;
                        case 5:
                            strY7 = U8.v0.y(i11, parcel);
                            break;
                        case 6:
                            strY8 = U8.v0.y(i11, parcel);
                            break;
                        case 7:
                            strY9 = U8.v0.y(i11, parcel);
                            break;
                        case '\b':
                            strY10 = U8.v0.y(i11, parcel);
                            break;
                        case '\t':
                            intent = (Intent) U8.v0.x(parcel, i11, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderE0 = U8.v0.e0(i11, parcel);
                            break;
                        case 11:
                            Z10 = U8.v0.Z(i11, parcel);
                            break;
                        case '\f':
                            bundleQ = U8.v0.q(i11, parcel);
                            break;
                        default:
                            U8.v0.m0(i11, parcel);
                            break;
                    }
                }
                U8.v0.D(iO03, parcel);
                return new F6.e(strY4, strY5, strY6, strY7, strY8, strY9, strY10, intent, iBinderE0, Z10, bundleQ);
            case 7:
                int iO04 = U8.v0.o0(parcel);
                long jH0 = 0;
                boolean Z11 = false;
                int iF02 = 0;
                int iF03 = 0;
                boolean Z12 = false;
                F6.e eVar = null;
                IBinder iBinderE02 = null;
                IBinder iBinderE03 = null;
                IBinder iBinderE04 = null;
                IBinder iBinderE05 = null;
                String strY11 = null;
                String strY12 = null;
                IBinder iBinderE06 = null;
                String strY13 = null;
                H6.a aVar = null;
                String strY14 = null;
                C6.g gVar = null;
                IBinder iBinderE07 = null;
                String strY15 = null;
                String strY16 = null;
                String strY17 = null;
                IBinder iBinderE08 = null;
                IBinder iBinderE09 = null;
                IBinder iBinderE010 = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            eVar = (F6.e) U8.v0.x(parcel, i12, F6.e.CREATOR);
                            break;
                        case 3:
                            iBinderE02 = U8.v0.e0(i12, parcel);
                            break;
                        case 4:
                            iBinderE03 = U8.v0.e0(i12, parcel);
                            break;
                        case 5:
                            iBinderE04 = U8.v0.e0(i12, parcel);
                            break;
                        case 6:
                            iBinderE05 = U8.v0.e0(i12, parcel);
                            break;
                        case 7:
                            strY11 = U8.v0.y(i12, parcel);
                            break;
                        case '\b':
                            Z11 = U8.v0.Z(i12, parcel);
                            break;
                        case '\t':
                            strY12 = U8.v0.y(i12, parcel);
                            break;
                        case '\n':
                            iBinderE06 = U8.v0.e0(i12, parcel);
                            break;
                        case 11:
                            iF02 = U8.v0.f0(i12, parcel);
                            break;
                        case '\f':
                            iF03 = U8.v0.f0(i12, parcel);
                            break;
                        case '\r':
                            strY13 = U8.v0.y(i12, parcel);
                            break;
                        case 14:
                            aVar = (H6.a) U8.v0.x(parcel, i12, H6.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            U8.v0.m0(i12, parcel);
                            break;
                        case 16:
                            strY14 = U8.v0.y(i12, parcel);
                            break;
                        case 17:
                            gVar = (C6.g) U8.v0.x(parcel, i12, C6.g.CREATOR);
                            break;
                        case 18:
                            iBinderE07 = U8.v0.e0(i12, parcel);
                            break;
                        case 19:
                            strY15 = U8.v0.y(i12, parcel);
                            break;
                        case 24:
                            strY16 = U8.v0.y(i12, parcel);
                            break;
                        case 25:
                            strY17 = U8.v0.y(i12, parcel);
                            break;
                        case 26:
                            iBinderE08 = U8.v0.e0(i12, parcel);
                            break;
                        case 27:
                            iBinderE09 = U8.v0.e0(i12, parcel);
                            break;
                        case 28:
                            iBinderE010 = U8.v0.e0(i12, parcel);
                            break;
                        case 29:
                            Z12 = U8.v0.Z(i12, parcel);
                            break;
                        case 30:
                            jH0 = U8.v0.h0(i12, parcel);
                            break;
                    }
                }
                U8.v0.D(iO04, parcel);
                return new AdOverlayInfoParcel(eVar, iBinderE02, iBinderE03, iBinderE04, iBinderE05, strY11, Z11, strY12, iBinderE06, iF02, iF03, strY13, aVar, strY14, gVar, iBinderE07, strY15, strY16, strY17, iBinderE08, iBinderE09, iBinderE010, Z12, jH0);
            case 8:
                int iO05 = U8.v0.o0(parcel);
                Intent intent2 = null;
                int iF04 = 0;
                int iF05 = 0;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iF04 = U8.v0.f0(i13, parcel);
                    } else if (c11 == 2) {
                        iF05 = U8.v0.f0(i13, parcel);
                    } else if (c11 != 3) {
                        U8.v0.m0(i13, parcel);
                    } else {
                        intent2 = (Intent) U8.v0.x(parcel, i13, Intent.CREATOR);
                    }
                }
                U8.v0.D(iO05, parcel);
                return new F7.b(iF04, iF05, intent2);
            case 9:
                int iO06 = U8.v0.o0(parcel);
                ArrayList arrayListA = null;
                String strY18 = null;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        arrayListA = U8.v0.A(i14, parcel);
                    } else if (c12 != 2) {
                        U8.v0.m0(i14, parcel);
                    } else {
                        strY18 = U8.v0.y(i14, parcel);
                    }
                }
                U8.v0.D(iO06, parcel);
                return new F7.e(strY18, arrayListA);
            case 10:
                int iO07 = U8.v0.o0(parcel);
                com.google.android.gms.common.internal.E e7 = null;
                int iF06 = 0;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        iF06 = U8.v0.f0(i15, parcel);
                    } else if (c13 != 2) {
                        U8.v0.m0(i15, parcel);
                    } else {
                        e7 = (com.google.android.gms.common.internal.E) U8.v0.x(parcel, i15, com.google.android.gms.common.internal.E.CREATOR);
                    }
                }
                U8.v0.D(iO07, parcel);
                return new F7.f(iF06, e7);
            case 11:
                int iO08 = U8.v0.o0(parcel);
                d7.b bVar = null;
                int iF07 = 0;
                com.google.android.gms.common.internal.F f10 = null;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iF07 = U8.v0.f0(i16, parcel);
                    } else if (c14 == 2) {
                        bVar = (d7.b) U8.v0.x(parcel, i16, d7.b.CREATOR);
                    } else if (c14 != 3) {
                        U8.v0.m0(i16, parcel);
                    } else {
                        f10 = (com.google.android.gms.common.internal.F) U8.v0.x(parcel, i16, com.google.android.gms.common.internal.F.CREATOR);
                    }
                }
                U8.v0.D(iO08, parcel);
                return new F7.g(iF07, bVar, f10);
            case 12:
                return new G2.a(parcel);
            case 13:
                return new G2.b(parcel);
            case 14:
                return new G2.c(parcel);
            case 15:
                return new G2.d(parcel);
            case 16:
                return new G2.e(parcel);
            case 17:
                return new G2.f(parcel);
            case 18:
                return new G2.l(parcel);
            case 19:
                return new G2.m(parcel);
            case 20:
                return new G2.n(parcel);
            case 21:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new G2.o(string, string2, AbstractC3409K.k(strArrCreateStringArray));
            case 22:
                return new G2.p(parcel);
            case 23:
                int iO09 = U8.v0.o0(parcel);
                int iF08 = 0;
                String strY19 = null;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        strY19 = U8.v0.y(i17, parcel);
                    } else if (c15 != 2) {
                        U8.v0.m0(i17, parcel);
                    } else {
                        iF08 = U8.v0.f0(i17, parcel);
                    }
                }
                U8.v0.D(iO09, parcel);
                return new C0553q(strY19, iF08);
            case 24:
                return new H2.a(parcel);
            case 25:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, H2.b.class.getClassLoader());
                return new H2.c(arrayList);
            case 26:
                return new H2.b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 27:
                return new H2.d(parcel);
            case 28:
                int iO010 = U8.v0.o0(parcel);
                int iF09 = 0;
                int iF010 = 0;
                boolean Z13 = false;
                boolean Z14 = false;
                String strY20 = null;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        strY20 = U8.v0.y(i18, parcel);
                    } else if (c16 == 3) {
                        iF09 = U8.v0.f0(i18, parcel);
                    } else if (c16 == 4) {
                        iF010 = U8.v0.f0(i18, parcel);
                    } else if (c16 == 5) {
                        Z13 = U8.v0.Z(i18, parcel);
                    } else if (c16 != 6) {
                        U8.v0.m0(i18, parcel);
                    } else {
                        Z14 = U8.v0.Z(i18, parcel);
                    }
                }
                U8.v0.D(iO010, parcel);
                return new H6.a(strY20, iF09, iF010, Z13, Z14);
            default:
                return new I2.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f2337a) {
            case 0:
                return new A1[i5];
            case 1:
                return new E2.a[i5];
            case 2:
                return new E2.b[i5];
            case 3:
                return new E6.a[i5];
            case 4:
                return new F2.b[i5];
            case 5:
                return new F2.c[i5];
            case 6:
                return new F6.e[i5];
            case 7:
                return new AdOverlayInfoParcel[i5];
            case 8:
                return new F7.b[i5];
            case 9:
                return new F7.e[i5];
            case 10:
                return new F7.f[i5];
            case 11:
                return new F7.g[i5];
            case 12:
                return new G2.a[i5];
            case 13:
                return new G2.b[i5];
            case 14:
                return new G2.c[i5];
            case 15:
                return new G2.d[i5];
            case 16:
                return new G2.e[i5];
            case 17:
                return new G2.f[i5];
            case 18:
                return new G2.l[i5];
            case 19:
                return new G2.m[i5];
            case 20:
                return new G2.n[i5];
            case 21:
                return new G2.o[i5];
            case 22:
                return new G2.p[i5];
            case 23:
                return new C0553q[i5];
            case 24:
                return new H2.a[i5];
            case 25:
                return new H2.c[i5];
            case 26:
                return new H2.b[i5];
            case 27:
                return new H2.d[i5];
            case 28:
                return new H6.a[i5];
            default:
                return new I2.a[i5];
        }
    }
}
