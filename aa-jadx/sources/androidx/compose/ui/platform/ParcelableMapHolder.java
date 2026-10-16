package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ParcelableMapHolder;", "Landroid/os/Parcelable;", "map", "", "", "", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParcelableMapHolder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.ui.platform.ParcelableMapHolder> CREATOR = new defpackage.mk(3);
    public final java.util.Map a;

    public ParcelableMapHolder(java.util.Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.Map map = this.a;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            parcel.writeString(str);
            parcel.writeValue(list);
        }
    }
}
