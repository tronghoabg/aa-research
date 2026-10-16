package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411b implements Parcelable {
    public static final Parcelable.Creator<C1411b> CREATOR = new Z6.c(9);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18370a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18371b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18372c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18373d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18374e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18375f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18376g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18377h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f18378i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18379j;
    public final CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18380l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f18381m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18382n;

    public C1411b(C1409a c1409a) {
        int size = c1409a.f18350a.size();
        this.f18370a = new int[size * 6];
        if (!c1409a.f18356g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f18371b = new ArrayList(size);
        this.f18372c = new int[size];
        this.f18373d = new int[size];
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) c1409a.f18350a.get(i10);
            int i11 = i5 + 1;
            this.f18370a[i5] = n0Var.f18503a;
            ArrayList arrayList = this.f18371b;
            F f10 = n0Var.f18504b;
            arrayList.add(f10 != null ? f10.mWho : null);
            int[] iArr = this.f18370a;
            iArr[i11] = n0Var.f18505c ? 1 : 0;
            iArr[i5 + 2] = n0Var.f18506d;
            iArr[i5 + 3] = n0Var.f18507e;
            int i12 = i5 + 5;
            iArr[i5 + 4] = n0Var.f18508f;
            i5 += 6;
            iArr[i12] = n0Var.f18509g;
            this.f18372c[i10] = n0Var.f18510h.ordinal();
            this.f18373d[i10] = n0Var.f18511i.ordinal();
        }
        this.f18374e = c1409a.f18355f;
        this.f18375f = c1409a.f18358i;
        this.f18376g = c1409a.f18367s;
        this.f18377h = c1409a.f18359j;
        this.f18378i = c1409a.k;
        this.f18379j = c1409a.f18360l;
        this.k = c1409a.f18361m;
        this.f18380l = c1409a.f18362n;
        this.f18381m = c1409a.f18363o;
        this.f18382n = c1409a.f18364p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f18370a);
        parcel.writeStringList(this.f18371b);
        parcel.writeIntArray(this.f18372c);
        parcel.writeIntArray(this.f18373d);
        parcel.writeInt(this.f18374e);
        parcel.writeString(this.f18375f);
        parcel.writeInt(this.f18376g);
        parcel.writeInt(this.f18377h);
        TextUtils.writeToParcel(this.f18378i, parcel, 0);
        parcel.writeInt(this.f18379j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f18380l);
        parcel.writeStringList(this.f18381m);
        parcel.writeInt(this.f18382n ? 1 : 0);
    }

    public C1411b(Parcel parcel) {
        this.f18370a = parcel.createIntArray();
        this.f18371b = parcel.createStringArrayList();
        this.f18372c = parcel.createIntArray();
        this.f18373d = parcel.createIntArray();
        this.f18374e = parcel.readInt();
        this.f18375f = parcel.readString();
        this.f18376g = parcel.readInt();
        this.f18377h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f18378i = (CharSequence) creator.createFromParcel(parcel);
        this.f18379j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.f18380l = parcel.createStringArrayList();
        this.f18381m = parcel.createStringArrayList();
        this.f18382n = parcel.readInt() != 0;
    }
}
