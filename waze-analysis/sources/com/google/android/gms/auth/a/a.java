package com.google.android.gms.auth.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final List f4398a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4399b;

    a(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            av.j(z2, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f4399b = z;
        this.f4398a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                av.l(str, "Element in keys cannot be null or empty");
                this.f4398a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f4398a;
        int iD = bb.d(parcel);
        bb.w(parcel, 1, DesugarCollections.unmodifiableList(list));
        bb.f(parcel, 2, this.f4399b);
        bb.e(parcel, iD);
    }
}
