package v3;

import android.os.Parcel;
import android.util.SparseIntArray;
import x.C4412e;

/* loaded from: classes.dex */
public final class b extends AbstractC4298a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f46802d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f46803e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46804f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46805g;

    /* renamed from: h, reason: collision with root package name */
    public final String f46806h;

    /* renamed from: i, reason: collision with root package name */
    public int f46807i;

    /* renamed from: j, reason: collision with root package name */
    public int f46808j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4412e(0), new C4412e(0), new C4412e(0));
    }

    @Override // v3.AbstractC4298a
    public final b a() {
        Parcel parcel = this.f46803e;
        int iDataPosition = parcel.dataPosition();
        int i5 = this.f46808j;
        if (i5 == this.f46804f) {
            i5 = this.f46805g;
        }
        return new b(parcel, iDataPosition, i5, wg.b.c(new StringBuilder(), this.f46806h, "  "), this.f46799a, this.f46800b, this.f46801c);
    }

    @Override // v3.AbstractC4298a
    public final boolean e(int i5) {
        while (this.f46808j < this.f46805g) {
            int i10 = this.k;
            if (i10 == i5) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            int i11 = this.f46808j;
            Parcel parcel = this.f46803e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.k = parcel.readInt();
            this.f46808j += i12;
        }
        return this.k == i5;
    }

    @Override // v3.AbstractC4298a
    public final void i(int i5) {
        int i10 = this.f46807i;
        SparseIntArray sparseIntArray = this.f46802d;
        Parcel parcel = this.f46803e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f46807i = i5;
        sparseIntArray.put(i5, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i5);
    }

    public b(Parcel parcel, int i5, int i10, String str, C4412e c4412e, C4412e c4412e2, C4412e c4412e3) {
        super(c4412e, c4412e2, c4412e3);
        this.f46802d = new SparseIntArray();
        this.f46807i = -1;
        this.k = -1;
        this.f46803e = parcel;
        this.f46804f = i5;
        this.f46805g = i10;
        this.f46808j = i5;
        this.f46806h = str;
    }
}
