package f4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2556c implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<C2556c> CREATOR = new C2555b(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f34809a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f34810b;

    public C2556c(String str, Map map) {
        this.f34809a = str;
        this.f34810b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2556c)) {
            return false;
        }
        C2556c c2556c = (C2556c) obj;
        return AbstractC3340k.a(this.f34809a, c2556c.f34809a) && AbstractC3340k.a(this.f34810b, c2556c.f34810b);
    }

    public final int hashCode() {
        return this.f34810b.hashCode() + (this.f34809a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f34809a + ", extras=" + this.f34810b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f34809a);
        Map map = this.f34810b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
