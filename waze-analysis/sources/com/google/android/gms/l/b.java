package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.gms.auth.api.signin.internal.j(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f5584a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5586c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f5587d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f5588e = new TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5589f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5590g;

    public b(String str, String str2, a[] aVarArr, boolean z, byte[] bArr, long j2) {
        this.f5584a = str;
        this.f5586c = str2;
        this.f5587d = aVarArr;
        this.f5589f = z;
        this.f5585b = bArr;
        this.f5590g = j2;
        for (a aVar : aVarArr) {
            this.f5588e.put(Integer.valueOf(aVar.f5580a), aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (com.waze.c.c.e.b(this.f5584a, bVar.f5584a) && com.waze.c.c.e.b(this.f5586c, bVar.f5586c) && this.f5588e.equals(bVar.f5588e) && this.f5589f == bVar.f5589f && Arrays.equals(this.f5585b, bVar.f5585b) && this.f5590g == bVar.f5590g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5584a, this.f5586c, this.f5588e, Boolean.valueOf(this.f5589f), this.f5585b, Long.valueOf(this.f5590g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f5584a);
        sb.append("', '");
        sb.append(this.f5586c);
        sb.append("', (");
        Iterator it = this.f5588e.values().iterator();
        while (it.hasNext()) {
            sb.append((a) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f5589f);
        sb.append(", ");
        byte[] bArr = this.f5585b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f5590g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5584a;
        int iD = bb.d(parcel);
        bb.u(parcel, 2, str);
        bb.u(parcel, 3, this.f5586c);
        bb.x(parcel, 4, this.f5587d, i2);
        bb.f(parcel, 5, this.f5589f);
        bb.l(parcel, 6, this.f5585b);
        bb.h(parcel, 7, this.f5590g);
        bb.e(parcel, iD);
    }
}
