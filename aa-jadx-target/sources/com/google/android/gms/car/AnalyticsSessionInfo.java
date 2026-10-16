package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class AnalyticsSessionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.AnalyticsSessionInfo> CREATOR = new defpackage.ea(8);
    public final int a;
    public final java.util.List b;

    public AnalyticsSessionInfo(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        defpackage.yzc yzcVar = defpackage.yzc.a;
        defpackage.abol abolVarA = defpackage.abol.a();
        try {
            java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse.CREATOR);
            java.util.ArrayList arrayList = new java.util.ArrayList(arrayListCreateTypedArrayList.size());
            java.util.Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(defpackage.acmh.C((com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse) it.next(), yzcVar, abolVarA));
            }
            this.b = arrayList;
        } catch (defpackage.abpp e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        java.util.List list = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse(null, (defpackage.abpy) it.next()));
        }
        parcel.writeTypedList(arrayList);
    }

    public AnalyticsSessionInfo(int i, java.util.List list) {
        this.a = i;
        this.b = list;
    }
}
