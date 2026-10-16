package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;
import v3.AbstractC4298a;
import v3.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC4298a abstractC4298a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f18067a = abstractC4298a.f(iconCompat.f18067a, 1);
        byte[] bArr = iconCompat.f18069c;
        if (abstractC4298a.e(2)) {
            Parcel parcel = ((b) abstractC4298a).f46803e;
            int i5 = parcel.readInt();
            if (i5 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i5];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f18069c = bArr;
        iconCompat.f18070d = abstractC4298a.g(iconCompat.f18070d, 3);
        iconCompat.f18071e = abstractC4298a.f(iconCompat.f18071e, 4);
        iconCompat.f18072f = abstractC4298a.f(iconCompat.f18072f, 5);
        iconCompat.f18073g = (ColorStateList) abstractC4298a.g(iconCompat.f18073g, 6);
        String string = iconCompat.f18075i;
        if (abstractC4298a.e(7)) {
            string = ((b) abstractC4298a).f46803e.readString();
        }
        iconCompat.f18075i = string;
        String string2 = iconCompat.f18076j;
        if (abstractC4298a.e(8)) {
            string2 = ((b) abstractC4298a).f46803e.readString();
        }
        iconCompat.f18076j = string2;
        iconCompat.f18074h = PorterDuff.Mode.valueOf(iconCompat.f18075i);
        switch (iconCompat.f18067a) {
            case -1:
                Parcelable parcelable = iconCompat.f18070d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f18068b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f18070d;
                if (parcelable2 != null) {
                    iconCompat.f18068b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f18069c;
                iconCompat.f18068b = bArr3;
                iconCompat.f18067a = 3;
                iconCompat.f18071e = 0;
                iconCompat.f18072f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f18069c, Charset.forName("UTF-16"));
                iconCompat.f18068b = str;
                if (iconCompat.f18067a == 2 && iconCompat.f18076j == null) {
                    iconCompat.f18076j = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f18068b = iconCompat.f18069c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC4298a abstractC4298a) {
        abstractC4298a.getClass();
        iconCompat.f18075i = iconCompat.f18074h.name();
        switch (iconCompat.f18067a) {
            case -1:
                iconCompat.f18070d = (Parcelable) iconCompat.f18068b;
                break;
            case 1:
            case 5:
                iconCompat.f18070d = (Parcelable) iconCompat.f18068b;
                break;
            case 2:
                iconCompat.f18069c = ((String) iconCompat.f18068b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f18069c = (byte[]) iconCompat.f18068b;
                break;
            case 4:
            case 6:
                iconCompat.f18069c = iconCompat.f18068b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i5 = iconCompat.f18067a;
        if (-1 != i5) {
            abstractC4298a.j(i5, 1);
        }
        byte[] bArr = iconCompat.f18069c;
        if (bArr != null) {
            abstractC4298a.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC4298a).f46803e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f18070d;
        if (parcelable != null) {
            abstractC4298a.k(parcelable, 3);
        }
        int i10 = iconCompat.f18071e;
        if (i10 != 0) {
            abstractC4298a.j(i10, 4);
        }
        int i11 = iconCompat.f18072f;
        if (i11 != 0) {
            abstractC4298a.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f18073g;
        if (colorStateList != null) {
            abstractC4298a.k(colorStateList, 6);
        }
        String str = iconCompat.f18075i;
        if (str != null) {
            abstractC4298a.i(7);
            ((b) abstractC4298a).f46803e.writeString(str);
        }
        String str2 = iconCompat.f18076j;
        if (str2 != null) {
            abstractC4298a.i(8);
            ((b) abstractC4298a).f46803e.writeString(str2);
        }
    }
}
