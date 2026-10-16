package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2653a implements Parcelable {
    public static final Parcelable.Creator<C2653a> CREATOR = new C2555b(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f35454a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f35455b;

    public C2653a(Intent intent, int i5) {
        this.f35454a = i5;
        this.f35455b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i5 = this.f35454a;
        sb2.append(i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f35455b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f35454a);
        Intent intent = this.f35455b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i5);
        }
    }

    public C2653a(Parcel parcel) {
        this.f35454a = parcel.readInt();
        this.f35455b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
