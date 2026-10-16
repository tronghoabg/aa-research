package android.support.v4.app;

/* JADX INFO: loaded from: classes2.dex */
public final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.app.BackStackRecordState> CREATOR = new defpackage.x(1);
    final int[] a;
    public final java.util.ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    public final java.lang.String f;
    public final int g;
    final int h;
    final java.lang.CharSequence i;
    final int j;
    final java.lang.CharSequence k;
    final java.util.ArrayList l;
    final java.util.ArrayList m;
    final boolean n;

    public BackStackRecordState(defpackage.w wVar) {
        int size = wVar.e.size();
        this.a = new int[size * 6];
        if (!wVar.k) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.b = new java.util.ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cb cbVar = (defpackage.cb) wVar.e.get(i2);
            int i3 = i + 1;
            this.a[i] = cbVar.a;
            java.util.ArrayList arrayList = this.b;
            android.support.v4.app.Fragment fragment = cbVar.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = cbVar.c ? 1 : 0;
            iArr[i + 2] = cbVar.d;
            iArr[i + 3] = cbVar.e;
            int i4 = i + 5;
            iArr[i + 4] = cbVar.f;
            i += 6;
            iArr[i4] = cbVar.g;
            this.c[i2] = cbVar.h.ordinal();
            this.d[i2] = cbVar.i.ordinal();
        }
        this.e = wVar.j;
        this.f = wVar.m;
        this.g = wVar.c;
        this.h = wVar.n;
        this.i = wVar.o;
        this.j = wVar.p;
        this.k = wVar.q;
        this.l = wVar.r;
        this.m = wVar.s;
        this.n = wVar.t;
    }

    public final void a(defpackage.w wVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                wVar.j = this.e;
                wVar.m = this.f;
                wVar.k = true;
                wVar.n = this.h;
                wVar.o = this.i;
                wVar.p = this.j;
                wVar.q = this.k;
                wVar.r = this.l;
                wVar.s = this.m;
                wVar.t = this.n;
                return;
            }
            defpackage.cb cbVar = new defpackage.cb();
            int i3 = i + 1;
            cbVar.a = iArr[i];
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Instantiate " + wVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            cbVar.h = defpackage.epx.values()[this.c[i2]];
            cbVar.i = defpackage.epx.values()[this.d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            cbVar.c = z;
            int i5 = iArr[i4];
            cbVar.d = i5;
            int i6 = iArr[i + 3];
            cbVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            cbVar.f = i8;
            i += 6;
            int i9 = iArr[i7];
            cbVar.g = i9;
            wVar.f = i5;
            wVar.g = i6;
            wVar.h = i8;
            wVar.i = i9;
            wVar.m(cbVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        android.text.TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        android.text.TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(android.os.Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
