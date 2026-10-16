package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class adpv {
    private static final adlw a = new adpu(null, true);

    private adpv() {
    }

    public static admc a(Parcel parcel, adis adisVar) throws adnr {
        int i = parcel.readInt();
        if (i == 0) {
            return new admc();
        }
        Object[] objArr = new Object[i + i];
        int i2 = 0;
        int iDataPosition = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = parcel.readInt();
            int i5 = i2 + 4;
            byte[] bArrC = c(parcel, i4, i5);
            int i6 = i5 + i4;
            int i7 = i3 + i3;
            objArr[i7] = bArrC;
            int i8 = parcel.readInt();
            i2 = i6 + 4;
            if (i8 == -1) {
                adoj adojVar = (adoj) adisVar.a(adoz.i);
                if (!adojVar.b) {
                    throw new adnr(adnq.g.e("Parcelable metadata values not allowed"));
                }
                int iDataPosition2 = parcel.dataPosition();
                try {
                    Parcelable parcelable = parcel.readParcelable(adpv.class.getClassLoader());
                    if (parcelable == null) {
                        throw new adnr(adnq.l.e("Read null parcelable in metadata"));
                    }
                    adlw adlwVar = a;
                    Charset charset = adkp.a;
                    objArr[i7 + 1] = new adlz(adlwVar, parcelable);
                    iDataPosition += parcel.dataPosition() - iDataPosition2;
                    int i9 = adojVar.c;
                    if (iDataPosition > 32768) {
                        throw new adnr(adnq.i.e("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)"));
                    }
                } catch (AndroidRuntimeException e) {
                    throw new adnr(adnq.l.d(e).e("Failure reading parcelable in metadata"));
                }
            } else {
                if (i8 < 0) {
                    throw new adnr(adnq.l.e("Unrecognized metadata sentinel"));
                }
                byte[] bArrC2 = c(parcel, i8, i2);
                i2 += i8;
                objArr[i7 + 1] = bArrC2;
            }
        }
        Charset charset2 = adkp.a;
        return new admc(i, objArr);
    }

    public static void b(Parcel parcel, admc admcVar) throws adnr, IOException {
        int i;
        int length;
        int i2;
        if (admcVar != null) {
            Charset charset = adkp.a;
            i = admcVar.e;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = adkp.a;
        Object[] objArr = new Object[admcVar.a()];
        for (int i3 = 0; i3 < admcVar.e; i3++) {
            int i4 = i3 + i3;
            objArr[i4] = admcVar.h(i3);
            int i5 = i4 + 1;
            Object objC = admcVar.c(i3);
            if (!(objC instanceof byte[])) {
                objC = ((adlz) objC).b();
            }
            objArr[i5] = objC;
        }
        parcel.writeInt(i);
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i6 + i6;
            byte[] bArr = (byte[]) objArr[i7];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i7 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof adqg) {
                parcel.writeInt(-1);
                ((adqg) obj).a(parcel);
            } else {
                byte[] bArrB = adpe.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i8 = 0;
                    while (true) {
                        length = bArrB.length;
                        if (i8 >= length || (i2 = inputStream.read(bArrB, i8, length - i8)) == -1) {
                            break;
                        } else {
                            i8 += i2;
                        }
                    }
                    if (i8 == length) {
                        throw new adnr(adnq.i.e("Metadata value too large"));
                    }
                    parcel.writeInt(i8);
                    if (i8 > 0) {
                        parcel.writeByteArray(bArrB, 0, i8);
                    }
                } finally {
                    adpe.a(bArrB);
                }
            }
        }
    }

    private static byte[] c(Parcel parcel, int i, int i2) throws adnr {
        if (i2 + i > 8192) {
            throw new adnr(adnq.i.e("Metadata too large"));
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
