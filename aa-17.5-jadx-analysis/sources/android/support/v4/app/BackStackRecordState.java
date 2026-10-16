package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bt;
import defpackage.cb;
import defpackage.eps;
import defpackage.w;
import defpackage.x;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new x(1);
    final int[] a;
    public final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    public final String f;
    public final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public BackStackRecordState(w wVar) {
        int size = wVar.e.size();
        this.a = new int[size * 6];
        if (!wVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cb cbVar = (cb) wVar.e.get(i2);
            int i3 = i + 1;
            this.a[i] = cbVar.a;
            ArrayList arrayList = this.b;
            Fragment fragment = cbVar.b;
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

    public final void a(w wVar) {
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
            cb cbVar = new cb();
            int i3 = i + 1;
            cbVar.a = iArr[i];
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Instantiate " + wVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            cbVar.h = eps.values()[this.c[i2]];
            cbVar.i = eps.values()[this.d[i2]];
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
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
