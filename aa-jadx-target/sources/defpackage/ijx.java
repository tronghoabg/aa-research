package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ijx {
    public static final java.lang.ClassLoader a = defpackage.ijx.class.getClassLoader();

    private ijx() {
    }

    public static android.os.Parcelable a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static java.lang.CharSequence b(android.os.Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public static java.util.ArrayList c(android.os.Parcel parcel) {
        return parcel.readArrayList(a);
    }

    public static void d(android.os.Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new android.os.BadParcelableException(defpackage.a.bo(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void e(android.os.Parcel parcel, java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        }
    }

    public static void f(android.os.Parcel parcel, java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            android.text.TextUtils.writeToParcel(charSequence, parcel, 1);
        }
    }

    public static void g(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void h(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static void i(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean j(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
