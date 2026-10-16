package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(defpackage.fic ficVar) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.b = ficVar.a(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (ficVar.s(2)) {
            android.os.Parcel parcel = ficVar.d;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.d = bArr;
        iconCompat.e = ficVar.b(iconCompat.e, 3);
        iconCompat.f = ficVar.a(iconCompat.f, 4);
        iconCompat.g = ficVar.a(iconCompat.g, 5);
        iconCompat.h = (android.content.res.ColorStateList) ficVar.b(iconCompat.h, 6);
        iconCompat.j = ficVar.e(iconCompat.j, 7);
        iconCompat.k = ficVar.e(iconCompat.k, 8);
        iconCompat.i = android.graphics.PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.e;
                if (parcelable2 != null) {
                    iconCompat.c = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.d;
                iconCompat.c = bArr3;
                iconCompat.b = 3;
                iconCompat.f = 0;
                iconCompat.g = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new java.lang.String(iconCompat.d, java.nio.charset.Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((java.lang.String) iconCompat.c).split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            case 3:
                iconCompat.c = iconCompat.d;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, defpackage.fic ficVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (android.os.Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (android.os.Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((java.lang.String) iconCompat.c).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            ficVar.h(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            ficVar.p(2);
            android.os.Parcel parcel = ficVar.d;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            ficVar.i(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            ficVar.h(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            ficVar.h(i3, 5);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            ficVar.i(colorStateList, 6);
        }
        java.lang.String str = iconCompat.j;
        if (str != null) {
            ficVar.j(str, 7);
        }
        java.lang.String str2 = iconCompat.k;
        if (str2 != null) {
            ficVar.j(str2, 8);
        }
    }
}
