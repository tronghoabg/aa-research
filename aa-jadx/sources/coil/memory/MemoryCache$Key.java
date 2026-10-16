package coil.memory;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001Ê\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "key", "", "extras", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "copy", "equals", "", "other", "", "hashCode", "", "toString", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "third_party.java.coil.coil_base.src.main_base", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MemoryCache$Key implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<coil.memory.MemoryCache$Key> CREATOR = new defpackage.eep(11);
    public final java.lang.String a;
    public final java.util.Map b;

    public MemoryCache$Key(java.lang.String str, java.util.Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coil.memory.MemoryCache$Key)) {
            return false;
        }
        coil.memory.MemoryCache$Key memoryCache$Key = (coil.memory.MemoryCache$Key) obj;
        return defpackage.afga.f(this.a, memoryCache$Key.a) && defpackage.afga.f(this.b, memoryCache$Key.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        java.util.Map map = this.b;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeString((java.lang.String) entry.getValue());
        }
    }
}
