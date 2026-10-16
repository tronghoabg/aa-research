package androidx.core.telecom.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeh;
import j$.util.Objects;
import j$.util.StringJoiner;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class Capability implements Parcelable {
    public static final Parcelable.Creator<Capability> CREATOR = new eeh(1);
    public int a = 0;
    public int b = 0;
    public int[] c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Capability)) {
            return false;
        }
        Capability capability = (Capability) obj;
        return Objects.deepEquals(Integer.valueOf(this.a), Integer.valueOf(capability.a)) && Objects.deepEquals(Integer.valueOf(this.b), Integer.valueOf(capability.b)) && Objects.deepEquals(this.c, capability.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return Arrays.deepHashCode(Arrays.asList(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c).toArray());
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        stringJoiner.add("featureId: " + this.a);
        stringJoiner.add("featureVersion: " + this.b);
        stringJoiner.add("supportedActions: ".concat(String.valueOf(Arrays.toString(this.c))));
        return "Capability".concat(String.valueOf(stringJoiner.toString()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeIntArray(this.c);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
