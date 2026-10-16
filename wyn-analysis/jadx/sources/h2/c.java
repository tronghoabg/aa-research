package H2;

import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import Q1.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements A {
    public static final Parcelable.Creator<c> CREATOR = new B1(25);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4880a;

    public c(ArrayList arrayList) {
        this.f4880a = arrayList;
        boolean z2 = false;
        if (!arrayList.isEmpty()) {
            long j8 = ((b) arrayList.get(0)).f4878b;
            int i5 = 1;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i5)).f4877a < j8) {
                    z2 = true;
                    break;
                } else {
                    j8 = ((b) arrayList.get(i5)).f4878b;
                    i5++;
                }
            }
        }
        k.c(!z2);
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
    }

    @Override // N1.A
    public final /* synthetic */ C0765n a() {
        return null;
    }

    @Override // N1.A
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f4880a.equals(((c) obj).f4880a);
    }

    public final int hashCode() {
        return this.f4880a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f4880a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeList(this.f4880a);
    }
}
