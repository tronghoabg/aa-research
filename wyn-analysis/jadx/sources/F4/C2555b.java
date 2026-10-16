package f4;

import A7.AbstractC0279p0;
import U8.v0;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.fido.common.Transport;
import f9.C2618a;
import f9.m;
import f9.n;
import g.C2653a;
import g.j;
import i7.C2853a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k7.C3190a;
import k7.C3191b;
import kotlin.jvm.internal.AbstractC3340k;
import l7.C3397a;
import n1.C3573g;
import q.K;
import t7.C4146a;
import v7.C;
import v7.C4306A;
import v7.C4308b;
import v7.C4312f;
import v7.C4313g;
import v7.C4315i;
import v7.C4316j;
import v7.C4317k;
import v7.C4319m;
import v7.C4328w;
import v7.C4329x;
import v7.C4330y;
import v7.C4331z;
import v7.EnumC4309c;
import v7.F;
import v7.L;
import v7.P;
import v7.Q;
import v7.S;
import v7.T;
import v7.c0;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2555b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34808a;

    public /* synthetic */ C2555b(int i5) {
        this.f34808a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) throws C4146a {
        switch (this.f34808a) {
            case 0:
                String string = inParcel.readString();
                AbstractC3340k.b(string);
                int i5 = inParcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                for (int i10 = 0; i10 < i5; i10++) {
                    String string2 = inParcel.readString();
                    AbstractC3340k.b(string2);
                    String string3 = inParcel.readString();
                    AbstractC3340k.b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new C2556c(string, linkedHashMap);
            case 1:
                int iO0 = v0.o0(inParcel);
                String strY = null;
                int iF0 = 0;
                long jH0 = 0;
                String strY2 = null;
                Bundle bundleQ = null;
                Uri uri = null;
                while (inParcel.dataPosition() < iO0) {
                    int i11 = inParcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strY = v0.y(i11, inParcel);
                            break;
                        case 2:
                            strY2 = v0.y(i11, inParcel);
                            break;
                        case 3:
                            iF0 = v0.f0(i11, inParcel);
                            break;
                        case 4:
                            jH0 = v0.h0(i11, inParcel);
                            break;
                        case 5:
                            bundleQ = v0.q(i11, inParcel);
                            break;
                        case 6:
                            uri = (Uri) v0.x(inParcel, i11, Uri.CREATOR);
                            break;
                        default:
                            v0.m0(i11, inParcel);
                            break;
                    }
                }
                v0.D(iO0, inParcel);
                C2618a c2618a = new C2618a();
                c2618a.f35242a = strY;
                c2618a.f35243b = strY2;
                c2618a.f35244c = iF0;
                c2618a.f35245d = jH0;
                c2618a.f35246e = bundleQ;
                c2618a.f35247f = uri;
                return c2618a;
            case 2:
                int iO02 = v0.o0(inParcel);
                Uri uri2 = null;
                Uri uri3 = null;
                ArrayList arrayListC = null;
                while (inParcel.dataPosition() < iO02) {
                    int i12 = inParcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        uri2 = (Uri) v0.x(inParcel, i12, Uri.CREATOR);
                    } else if (c10 == 2) {
                        uri3 = (Uri) v0.x(inParcel, i12, Uri.CREATOR);
                    } else if (c10 != 3) {
                        v0.m0(i12, inParcel);
                    } else {
                        arrayListC = v0.C(inParcel, i12, m.CREATOR);
                    }
                }
                v0.D(iO02, inParcel);
                return new n(uri2, uri3, arrayListC);
            case 3:
                int iO03 = v0.o0(inParcel);
                String strY3 = null;
                while (inParcel.dataPosition() < iO03) {
                    int i13 = inParcel.readInt();
                    if (((char) i13) != 2) {
                        v0.m0(i13, inParcel);
                    } else {
                        strY3 = v0.y(i13, inParcel);
                    }
                }
                v0.D(iO03, inParcel);
                return new m(strY3);
            case 4:
                return new C2653a(inParcel);
            case 5:
                AbstractC3340k.e(inParcel, "inParcel");
                Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC3340k.b(parcelable);
                return new j((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 6:
                int iO04 = v0.o0(inParcel);
                boolean Z10 = false;
                int iF02 = 0;
                while (inParcel.dataPosition() < iO04) {
                    int i14 = inParcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        Z10 = v0.Z(i14, inParcel);
                    } else if (c11 != 2) {
                        v0.m0(i14, inParcel);
                    } else {
                        iF02 = v0.f0(i14, inParcel);
                    }
                }
                v0.D(iO04, inParcel);
                return new C2853a(Z10, iF02);
            case 7:
                int iO05 = v0.o0(inParcel);
                PendingIntent pendingIntent = null;
                while (inParcel.dataPosition() < iO05) {
                    int i15 = inParcel.readInt();
                    if (((char) i15) != 1) {
                        v0.m0(i15, inParcel);
                    } else {
                        pendingIntent = (PendingIntent) v0.x(inParcel, i15, PendingIntent.CREATOR);
                    }
                }
                v0.D(iO05, inParcel);
                return new i7.b(pendingIntent);
            case 8:
                int iO06 = v0.o0(inParcel);
                int iF03 = 0;
                boolean Z11 = false;
                while (inParcel.dataPosition() < iO06) {
                    int i16 = inParcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iF03 = v0.f0(i16, inParcel);
                    } else if (c12 != 2) {
                        v0.m0(i16, inParcel);
                    } else {
                        Z11 = v0.Z(i16, inParcel);
                    }
                }
                v0.D(iO06, inParcel);
                return new i7.c(iF03, Z11);
            case 9:
                int iO07 = v0.o0(inParcel);
                C3190a c3190a = null;
                int iF04 = 0;
                while (inParcel.dataPosition() < iO07) {
                    int i17 = inParcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iF04 = v0.f0(i17, inParcel);
                    } else if (c13 != 2) {
                        v0.m0(i17, inParcel);
                    } else {
                        c3190a = (C3190a) v0.x(inParcel, i17, C3190a.CREATOR);
                    }
                }
                v0.D(iO07, inParcel);
                return new C3191b(iF04, c3190a);
            case 10:
                int iO08 = v0.o0(inParcel);
                ArrayList arrayListC2 = null;
                int iF05 = 0;
                while (inParcel.dataPosition() < iO08) {
                    int i18 = inParcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iF05 = v0.f0(i18, inParcel);
                    } else if (c14 != 2) {
                        v0.m0(i18, inParcel);
                    } else {
                        arrayListC2 = v0.C(inParcel, i18, k7.c.CREATOR);
                    }
                }
                v0.D(iO08, inParcel);
                return new C3190a(arrayListC2, iF05);
            case 11:
                int iO09 = v0.o0(inParcel);
                int iF06 = 0;
                String strY4 = null;
                int iF07 = 0;
                while (inParcel.dataPosition() < iO09) {
                    int i19 = inParcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        iF06 = v0.f0(i19, inParcel);
                    } else if (c15 == 2) {
                        strY4 = v0.y(i19, inParcel);
                    } else if (c15 != 3) {
                        v0.m0(i19, inParcel);
                    } else {
                        iF07 = v0.f0(i19, inParcel);
                    }
                }
                v0.D(iO09, inParcel);
                return new k7.c(iF06, strY4, iF07);
            case 12:
                int iO010 = v0.o0(inParcel);
                String strY5 = null;
                int iF08 = 0;
                C3397a c3397a = null;
                while (inParcel.dataPosition() < iO010) {
                    int i20 = inParcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        iF08 = v0.f0(i20, inParcel);
                    } else if (c16 == 2) {
                        strY5 = v0.y(i20, inParcel);
                    } else if (c16 != 3) {
                        v0.m0(i20, inParcel);
                    } else {
                        c3397a = (C3397a) v0.x(inParcel, i20, C3397a.CREATOR);
                    }
                }
                v0.D(iO010, inParcel);
                return new l7.g(c3397a, strY5, iF08);
            case 13:
                int iO011 = v0.o0(inParcel);
                ArrayList arrayListC3 = null;
                int iF09 = 0;
                String strY6 = null;
                while (inParcel.dataPosition() < iO011) {
                    int i21 = inParcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iF09 = v0.f0(i21, inParcel);
                    } else if (c17 == 2) {
                        arrayListC3 = v0.C(inParcel, i21, l7.f.CREATOR);
                    } else if (c17 != 3) {
                        v0.m0(i21, inParcel);
                    } else {
                        strY6 = v0.y(i21, inParcel);
                    }
                }
                v0.D(iO011, inParcel);
                return new l7.h(iF09, strY6, arrayListC3);
            case 14:
                int iO012 = v0.o0(inParcel);
                String strY7 = null;
                int iF010 = 0;
                ArrayList arrayListC4 = null;
                while (inParcel.dataPosition() < iO012) {
                    int i22 = inParcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        iF010 = v0.f0(i22, inParcel);
                    } else if (c18 == 2) {
                        strY7 = v0.y(i22, inParcel);
                    } else if (c18 != 3) {
                        v0.m0(i22, inParcel);
                    } else {
                        arrayListC4 = v0.C(inParcel, i22, l7.g.CREATOR);
                    }
                }
                v0.D(iO012, inParcel);
                return new l7.f(iF010, strY7, arrayListC4);
            case 15:
                int iO013 = v0.o0(inParcel);
                int iF011 = 0;
                Parcel parcel = null;
                l7.h hVar = null;
                while (inParcel.dataPosition() < iO013) {
                    int i23 = inParcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        iF011 = v0.f0(i23, inParcel);
                    } else if (c19 == 2) {
                        int iK0 = v0.k0(i23, inParcel);
                        int iDataPosition = inParcel.dataPosition();
                        if (iK0 == 0) {
                            parcel = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(inParcel, iDataPosition, iK0);
                            inParcel.setDataPosition(iDataPosition + iK0);
                            parcel = parcelObtain;
                        }
                    } else if (c19 != 3) {
                        v0.m0(i23, inParcel);
                    } else {
                        hVar = (l7.h) v0.x(inParcel, i23, l7.h.CREATOR);
                    }
                }
                v0.D(iO013, inParcel);
                return new l7.d(iF011, parcel, hVar);
            case 16:
                C3573g c3573g = new C3573g(inParcel);
                c3573g.f40784a = inParcel.readInt();
                return c3573g;
            case 17:
                K k = new K(inParcel);
                k.f43665a = inParcel.readByte() != 0;
                return k;
            case 18:
                String string4 = inParcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (string4.equals(transport.f26706a)) {
                            return transport;
                        }
                    }
                    if (string4.equals("hybrid")) {
                        return Transport.HYBRID;
                    }
                    throw new C4146a(AbstractC0279p0.l("Transport ", string4, " not supported"));
                } catch (C4146a e7) {
                    throw new RuntimeException(e7);
                }
            case 19:
                return new ParcelImpl(inParcel);
            case 20:
                try {
                    return EnumC4309c.c(inParcel.readString());
                } catch (C4308b e10) {
                    throw new RuntimeException(e10);
                }
            case 21:
                int iO014 = v0.o0(inParcel);
                boolean Z12 = false;
                while (inParcel.dataPosition() < iO014) {
                    int i24 = inParcel.readInt();
                    if (((char) i24) != 1) {
                        v0.m0(i24, inParcel);
                    } else {
                        Z12 = v0.Z(i24, inParcel);
                    }
                }
                v0.D(iO014, inParcel);
                return new c0(Z12);
            case 22:
                int iO015 = v0.o0(inParcel);
                long jH02 = 0;
                while (inParcel.dataPosition() < iO015) {
                    int i25 = inParcel.readInt();
                    if (((char) i25) != 1) {
                        v0.m0(i25, inParcel);
                    } else {
                        jH02 = v0.h0(i25, inParcel);
                    }
                }
                v0.D(iO015, inParcel);
                return new P(jH02);
            case 23:
                int iO016 = v0.o0(inParcel);
                boolean Z13 = false;
                while (inParcel.dataPosition() < iO016) {
                    int i26 = inParcel.readInt();
                    if (((char) i26) != 1) {
                        v0.m0(i26, inParcel);
                    } else {
                        Z13 = v0.Z(i26, inParcel);
                    }
                }
                v0.D(iO016, inParcel);
                return new Q(Z13);
            case 24:
                int iO017 = v0.o0(inParcel);
                boolean Z14 = false;
                while (inParcel.dataPosition() < iO017) {
                    int i27 = inParcel.readInt();
                    if (((char) i27) != 1) {
                        v0.m0(i27, inParcel);
                    } else {
                        Z14 = v0.Z(i27, inParcel);
                    }
                }
                v0.D(iO017, inParcel);
                return new C4328w(Z14);
            case 25:
                int iO018 = v0.o0(inParcel);
                String strY8 = null;
                while (inParcel.dataPosition() < iO018) {
                    int i28 = inParcel.readInt();
                    if (((char) i28) != 1) {
                        v0.m0(i28, inParcel);
                    } else {
                        strY8 = v0.y(i28, inParcel);
                    }
                }
                v0.D(iO018, inParcel);
                return new S(strY8);
            case 26:
                int iO019 = v0.o0(inParcel);
                while (true) {
                    byte[][] bArr = null;
                    while (inParcel.dataPosition() < iO019) {
                        int i29 = inParcel.readInt();
                        if (((char) i29) != 1) {
                            v0.m0(i29, inParcel);
                        } else {
                            int iK02 = v0.k0(i29, inParcel);
                            int iDataPosition2 = inParcel.dataPosition();
                            if (iK02 == 0) {
                                break;
                            }
                            int i30 = inParcel.readInt();
                            byte[][] bArr2 = new byte[i30][];
                            for (int i31 = 0; i31 < i30; i31++) {
                                bArr2[i31] = inParcel.createByteArray();
                            }
                            inParcel.setDataPosition(iDataPosition2 + iK02);
                            bArr = bArr2;
                        }
                    }
                    v0.D(iO019, inParcel);
                    return new T(bArr);
                    break;
                }
            case 27:
                int iO020 = v0.o0(inParcel);
                C c20 = null;
                F f10 = null;
                byte[] bArrR = null;
                ArrayList arrayListC5 = null;
                Double dB0 = null;
                ArrayList arrayListC6 = null;
                C4319m c4319m = null;
                Integer numG0 = null;
                L l10 = null;
                String strY9 = null;
                C4312f c4312f = null;
                while (inParcel.dataPosition() < iO020) {
                    int i32 = inParcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            c20 = (C) v0.x(inParcel, i32, C.CREATOR);
                            break;
                        case 3:
                            f10 = (F) v0.x(inParcel, i32, F.CREATOR);
                            break;
                        case 4:
                            bArrR = v0.r(i32, inParcel);
                            break;
                        case 5:
                            arrayListC5 = v0.C(inParcel, i32, C4306A.CREATOR);
                            break;
                        case 6:
                            dB0 = v0.b0(i32, inParcel);
                            break;
                        case 7:
                            arrayListC6 = v0.C(inParcel, i32, C4331z.CREATOR);
                            break;
                        case '\b':
                            c4319m = (C4319m) v0.x(inParcel, i32, C4319m.CREATOR);
                            break;
                        case '\t':
                            numG0 = v0.g0(i32, inParcel);
                            break;
                        case '\n':
                            l10 = (L) v0.x(inParcel, i32, L.CREATOR);
                            break;
                        case 11:
                            strY9 = v0.y(i32, inParcel);
                            break;
                        case '\f':
                            c4312f = (C4312f) v0.x(inParcel, i32, C4312f.CREATOR);
                            break;
                        default:
                            v0.m0(i32, inParcel);
                            break;
                    }
                }
                v0.D(iO020, inParcel);
                return new C4330y(c20, f10, bArrR, arrayListC5, dB0, arrayListC6, c4319m, numG0, l10, strY9, c4312f);
            case 28:
                int iO021 = v0.o0(inParcel);
                String strY10 = null;
                String strY11 = null;
                byte[] bArrR2 = null;
                C4316j c4316j = null;
                C4315i c4315i = null;
                C4317k c4317k = null;
                C4313g c4313g = null;
                String strY12 = null;
                while (inParcel.dataPosition() < iO021) {
                    int i33 = inParcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            strY10 = v0.y(i33, inParcel);
                            break;
                        case 2:
                            strY11 = v0.y(i33, inParcel);
                            break;
                        case 3:
                            bArrR2 = v0.r(i33, inParcel);
                            break;
                        case 4:
                            c4316j = (C4316j) v0.x(inParcel, i33, C4316j.CREATOR);
                            break;
                        case 5:
                            c4315i = (C4315i) v0.x(inParcel, i33, C4315i.CREATOR);
                            break;
                        case 6:
                            c4317k = (C4317k) v0.x(inParcel, i33, C4317k.CREATOR);
                            break;
                        case 7:
                            c4313g = (C4313g) v0.x(inParcel, i33, C4313g.CREATOR);
                            break;
                        case '\b':
                            strY12 = v0.y(i33, inParcel);
                            break;
                        default:
                            v0.m0(i33, inParcel);
                            break;
                    }
                }
                v0.D(iO021, inParcel);
                return new C4329x(strY10, strY11, bArrR2, c4316j, c4315i, c4317k, c4313g, strY12);
            default:
                int iO022 = v0.o0(inParcel);
                String strY13 = null;
                byte[] bArrR3 = null;
                ArrayList arrayListC7 = null;
                while (inParcel.dataPosition() < iO022) {
                    int i34 = inParcel.readInt();
                    char c21 = (char) i34;
                    if (c21 == 2) {
                        strY13 = v0.y(i34, inParcel);
                    } else if (c21 == 3) {
                        bArrR3 = v0.r(i34, inParcel);
                    } else if (c21 != 4) {
                        v0.m0(i34, inParcel);
                    } else {
                        arrayListC7 = v0.C(inParcel, i34, Transport.CREATOR);
                    }
                }
                v0.D(iO022, inParcel);
                return new C4331z(strY13, bArrR3, arrayListC7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f34808a) {
            case 0:
                return new C2556c[i5];
            case 1:
                return new C2618a[i5];
            case 2:
                return new n[i5];
            case 3:
                return new m[i5];
            case 4:
                return new C2653a[i5];
            case 5:
                return new j[i5];
            case 6:
                return new C2853a[i5];
            case 7:
                return new i7.b[i5];
            case 8:
                return new i7.c[i5];
            case 9:
                return new C3191b[i5];
            case 10:
                return new C3190a[i5];
            case 11:
                return new k7.c[i5];
            case 12:
                return new l7.g[i5];
            case 13:
                return new l7.h[i5];
            case 14:
                return new l7.f[i5];
            case 15:
                return new l7.d[i5];
            case 16:
                return new C3573g[i5];
            case 17:
                return new K[i5];
            case 18:
                return new Transport[i5];
            case 19:
                return new ParcelImpl[i5];
            case 20:
                return new EnumC4309c[i5];
            case 21:
                return new c0[i5];
            case 22:
                return new P[i5];
            case 23:
                return new Q[i5];
            case 24:
                return new C4328w[i5];
            case 25:
                return new S[i5];
            case 26:
                return new T[i5];
            case 27:
                return new C4330y[i5];
            case 28:
                return new C4329x[i5];
            default:
                return new C4331z[i5];
        }
    }
}
