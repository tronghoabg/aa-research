package com.google.android.gms.auth.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<f> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    private final Bundle f4427a;

    /* renamed from: b, reason: collision with root package name */
    private final List f4428b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4429c;

    f(Bundle bundle, List list) {
        this.f4427a = bundle;
        this.f4428b = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            map.put(eVar.a(), eVar);
        }
        this.f4429c = map;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.f4429c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = this.f4427a;
        int iD = bb.d(parcel);
        bb.k(parcel, 1, bundle);
        bb.y(parcel, 2, this.f4428b);
        bb.e(parcel, iD);
    }
}
