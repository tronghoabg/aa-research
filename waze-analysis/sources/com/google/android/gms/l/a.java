package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a implements Comparable<a> {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f5580a;

    /* renamed from: b, reason: collision with root package name */
    public final f[] f5581b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f5582c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f5583d = new TreeMap();

    public a(int i2, f[] fVarArr, String[] strArr) {
        this.f5580a = i2;
        this.f5581b = fVarArr;
        for (f fVar : fVarArr) {
            this.f5583d.put(fVar.f5613a, fVar);
        }
        this.f5582c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return this.f5580a - aVar.f5580a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5580a == aVar.f5580a && com.waze.c.c.e.b(this.f5583d, aVar.f5583d) && Arrays.equals(this.f5582c, aVar.f5582c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f5580a);
        sb.append(", (");
        Iterator it = this.f5583d.values().iterator();
        while (it.hasNext()) {
            sb.append((f) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f5582c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f5580a;
        int iD = bb.d(parcel);
        bb.g(parcel, 2, i3);
        bb.x(parcel, 3, this.f5581b, i2);
        bb.v(parcel, 4, this.f5582c);
        bb.e(parcel, iD);
    }
}
