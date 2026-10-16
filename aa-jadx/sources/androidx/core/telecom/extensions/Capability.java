package androidx.core.telecom.extensions;

/* JADX INFO: loaded from: classes2.dex */
public class Capability implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.core.telecom.extensions.Capability> CREATOR = new defpackage.eep(1);
    public int a = 0;
    public int b = 0;
    public int[] c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.core.telecom.extensions.Capability)) {
            return false;
        }
        androidx.core.telecom.extensions.Capability capability = (androidx.core.telecom.extensions.Capability) obj;
        return j$.util.Objects.deepEquals(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(capability.a)) && j$.util.Objects.deepEquals(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(capability.b)) && j$.util.Objects.deepEquals(this.c, capability.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return java.util.Arrays.deepHashCode(java.util.Arrays.asList(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), this.c).toArray());
    }

    public final java.lang.String toString() {
        j$.util.StringJoiner stringJoiner = new j$.util.StringJoiner(", ", "{", "}");
        stringJoiner.add("featureId: " + this.a);
        stringJoiner.add("featureVersion: " + this.b);
        stringJoiner.add("supportedActions: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(this.c))));
        return "Capability".concat(java.lang.String.valueOf(stringJoiner.toString()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
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
