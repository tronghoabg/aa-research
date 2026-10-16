package v7;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class E implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    E EF5;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ E[] f46917a = {new E("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<E> CREATOR = new U(3);

    public static E c(String str) throws D {
        for (E e7 : values()) {
            e7.getClass();
            if (str.equals("public-key")) {
                return e7;
            }
        }
        throw new D(AbstractC0279p0.l("PublicKeyCredentialType ", str, " not supported"));
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f46917a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString("public-key");
    }
}
