package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new w(18);

    /* renamed from: a, reason: collision with root package name */
    private final String f16115a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f16116b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f16117c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16118d;

    public s(String str, Float f2, Long l2, String str2) {
        x.f(str, TtmlNode.ATTR_ID);
        this.f16115a = str;
        this.f16116b = f2;
        this.f16117c = l2;
        this.f16118d = str2;
    }

    public final Float a() {
        return this.f16116b;
    }

    public final Long b() {
        return this.f16117c;
    }

    public final String c() {
        return this.f16115a;
    }

    public final String d() {
        return this.f16118d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return x.n(this.f16115a, sVar.f16115a) && x.n(this.f16116b, sVar.f16116b) && x.n(this.f16117c, sVar.f16117c) && x.n(this.f16118d, sVar.f16118d);
    }

    public final int hashCode() {
        int iHashCode = this.f16115a.hashCode() * 31;
        Float f2 = this.f16116b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Long l2 = this.f16117c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f16118d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VenueProduct(id=" + this.f16115a + ", price=" + this.f16116b + ", lastUpdated=" + this.f16117c + ", updatedBy=" + this.f16118d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f16115a);
        Float f2 = this.f16116b;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Long l2 = this.f16117c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f16118d);
    }
}
