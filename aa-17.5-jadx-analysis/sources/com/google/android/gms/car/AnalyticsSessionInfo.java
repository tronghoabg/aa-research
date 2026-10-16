package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.abnj;
import defpackage.abon;
import defpackage.abow;
import defpackage.ea;
import defpackage.wox;
import defpackage.yxx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsSessionInfo implements Parcelable {
    public static final Parcelable.Creator<AnalyticsSessionInfo> CREATOR = new ea(8);
    public final int a;
    public final List b;

    public AnalyticsSessionInfo(Parcel parcel) {
        this.a = parcel.readInt();
        yxx yxxVar = yxx.a;
        abnj abnjVarA = abnj.a();
        try {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ProtoParsers$InternalDontUse.CREATOR);
            ArrayList arrayList = new ArrayList(arrayListCreateTypedArrayList.size());
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(wox.al((ProtoParsers$InternalDontUse) it.next(), yxxVar, abnjVarA));
            }
            this.b = arrayList;
        } catch (abon e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        List list = this.b;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProtoParsers$InternalDontUse(null, (abow) it.next()));
        }
        parcel.writeTypedList(arrayList);
    }

    public AnalyticsSessionInfo(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
