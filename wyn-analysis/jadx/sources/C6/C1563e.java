package c6;

import E5.C0448e0;
import E5.T;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u6.AbstractC4256a;

/* renamed from: c6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563e implements W5.b {
    public static final Parcelable.Creator<C1563e> CREATOR = new C1559a(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19667a;

    public C1563e(ArrayList arrayList) {
        this.f19667a = arrayList;
        boolean z2 = false;
        if (!arrayList.isEmpty()) {
            long j8 = ((C1562d) arrayList.get(0)).f19665b;
            int i5 = 1;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                if (((C1562d) arrayList.get(i5)).f19664a < j8) {
                    z2 = true;
                    break;
                } else {
                    j8 = ((C1562d) arrayList.get(i5)).f19665b;
                    i5++;
                }
            }
        }
        AbstractC4256a.e(!z2);
    }

    @Override // W5.b
    public final /* synthetic */ T a() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ void d(C0448e0 c0448e0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1563e.class != obj.getClass()) {
            return false;
        }
        return this.f19667a.equals(((C1563e) obj).f19667a);
    }

    public final int hashCode() {
        return this.f19667a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f19667a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeList(this.f19667a);
    }
}
