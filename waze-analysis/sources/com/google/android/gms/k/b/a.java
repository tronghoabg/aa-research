package com.google.android.gms.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.internal.bb;
import com.google.d.d.bn;
import h.g.b.x;
import h.n.o;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new j(16);

    /* renamed from: a, reason: collision with root package name */
    private final int f5563a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5564b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5565c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5566d;

    /* renamed from: e, reason: collision with root package name */
    private final List f5567e;

    /* renamed from: f, reason: collision with root package name */
    private final a f5568f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public a(int i2, String str, String str2, String str3, List list, a aVar) {
        x.f(str, "packageName");
        if (aVar != null && aVar.f5568f != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f5563a = i2;
        this.f5564b = str;
        this.f5565c = str2;
        this.f5566d = str3 == null ? aVar != null ? aVar.f5566d : null : str3;
        if (list == null) {
            list = aVar != null ? aVar.f5567e : null;
            if (list == null) {
                bn bnVarP = bn.p();
                x.e(bnVarP, "of(...)");
                list = bnVarP;
            }
        }
        List list2 = list;
        x.f(list2, "<this>");
        bn bnVarN = bn.n(list2);
        x.e(bnVarN, "copyOf(...)");
        this.f5567e = bnVarN;
        this.f5568f = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5563a == aVar.f5563a && x.n(this.f5564b, aVar.f5564b) && x.n(this.f5565c, aVar.f5565c) && x.n(this.f5566d, aVar.f5566d) && x.n(this.f5568f, aVar.f5568f) && x.n(this.f5567e, aVar.f5567e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5563a), this.f5564b, this.f5565c, this.f5566d, this.f5568f);
    }

    public final String toString() {
        String str = this.f5564b;
        int length = str.length() + 18;
        String str2 = this.f5565c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.f5563a);
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (o.ah(str2, str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f5566d;
        if (str3 != null) {
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        int i3 = this.f5563a;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.u(parcel, 3, this.f5564b);
        bb.u(parcel, 4, this.f5565c);
        bb.u(parcel, 6, this.f5566d);
        bb.t(parcel, 7, this.f5568f, i2);
        bb.y(parcel, 8, this.f5567e);
        bb.e(parcel, iD);
    }
}
