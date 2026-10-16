package a2;

import N1.A;
import N1.C0765n;
import N1.C0775y;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements A {
    public static final Parcelable.Creator<u> CREATOR = new Z6.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f17318a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17319b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17320c;

    public u(String str, String str2, List list) {
        this.f17318a = str;
        this.f17319b = str2;
        this.f17320c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
    }

    @Override // N1.A
    public final /* synthetic */ C0765n a() {
        return null;
    }

    @Override // N1.A
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f17318a, uVar.f17318a) && TextUtils.equals(this.f17319b, uVar.f17319b) && this.f17320c.equals(uVar.f17320c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17318a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f17319b;
        return this.f17320c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f17318a;
        sb2.append(str != null ? wg.b.c(com.google.android.gms.internal.consent_sdk.a.w(" [", str, ", "), this.f17319b, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f17318a);
        parcel.writeString(this.f17319b);
        List list = this.f17320c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public u(Parcel parcel) {
        this.f17318a = parcel.readString();
        this.f17319b = parcel.readString();
        int i5 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f17320c = DesugarCollections.unmodifiableList(arrayList);
    }
}
