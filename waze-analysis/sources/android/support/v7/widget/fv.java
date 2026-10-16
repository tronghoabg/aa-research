package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class fv implements Parcelable {
    public static final Parcelable.Creator<fv> CREATOR = new df(3);

    /* renamed from: a, reason: collision with root package name */
    int f1516a;

    /* renamed from: b, reason: collision with root package name */
    int f1517b;

    /* renamed from: c, reason: collision with root package name */
    int f1518c;

    /* renamed from: d, reason: collision with root package name */
    int[] f1519d;

    /* renamed from: e, reason: collision with root package name */
    int f1520e;

    /* renamed from: f, reason: collision with root package name */
    int[] f1521f;

    /* renamed from: g, reason: collision with root package name */
    List f1522g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1523h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1524i;

    /* renamed from: j, reason: collision with root package name */
    boolean f1525j;

    fv(Parcel parcel) {
        this.f1516a = parcel.readInt();
        this.f1517b = parcel.readInt();
        int i2 = parcel.readInt();
        this.f1518c = i2;
        if (i2 > 0) {
            int[] iArr = new int[i2];
            this.f1519d = iArr;
            parcel.readIntArray(iArr);
        }
        int i3 = parcel.readInt();
        this.f1520e = i3;
        if (i3 > 0) {
            int[] iArr2 = new int[i3];
            this.f1521f = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f1523h = parcel.readInt() == 1;
        this.f1524i = parcel.readInt() == 1;
        this.f1525j = parcel.readInt() == 1;
        this.f1522g = parcel.readArrayList(ft.class.getClassLoader());
    }

    final void a() {
        this.f1519d = null;
        this.f1518c = 0;
        this.f1516a = -1;
        this.f1517b = -1;
    }

    final void b() {
        this.f1519d = null;
        this.f1518c = 0;
        this.f1520e = 0;
        this.f1521f = null;
        this.f1522g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1516a);
        parcel.writeInt(this.f1517b);
        parcel.writeInt(this.f1518c);
        if (this.f1518c > 0) {
            parcel.writeIntArray(this.f1519d);
        }
        parcel.writeInt(this.f1520e);
        if (this.f1520e > 0) {
            parcel.writeIntArray(this.f1521f);
        }
        parcel.writeInt(this.f1523h ? 1 : 0);
        parcel.writeInt(this.f1524i ? 1 : 0);
        parcel.writeInt(this.f1525j ? 1 : 0);
        parcel.writeList(this.f1522g);
    }

    public fv(fv fvVar) {
        this.f1518c = fvVar.f1518c;
        this.f1516a = fvVar.f1516a;
        this.f1517b = fvVar.f1517b;
        this.f1519d = fvVar.f1519d;
        this.f1520e = fvVar.f1520e;
        this.f1521f = fvVar.f1521f;
        this.f1523h = fvVar.f1523h;
        this.f1524i = fvVar.f1524i;
        this.f1525j = fvVar.f1525j;
        this.f1522g = fvVar.f1522g;
    }

    public fv() {
    }
}
