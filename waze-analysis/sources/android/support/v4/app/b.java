package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    final int[] f150a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f151b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f152c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f153d;

    /* renamed from: e, reason: collision with root package name */
    final int f154e;

    /* renamed from: f, reason: collision with root package name */
    final String f155f;

    /* renamed from: g, reason: collision with root package name */
    final int f156g;

    /* renamed from: h, reason: collision with root package name */
    final int f157h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f158i;

    /* renamed from: j, reason: collision with root package name */
    final int f159j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f160k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f161l;
    final ArrayList m;
    final boolean n;

    b(a aVar) {
        int size = aVar.f257e.size();
        this.f150a = new int[size * 6];
        if (!aVar.f263k) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f151b = new ArrayList(size);
        this.f152c = new int[size];
        this.f153d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cg cgVar = (cg) aVar.f257e.get(i3);
            int i4 = i2 + 1;
            this.f150a[i2] = cgVar.f246a;
            ArrayList arrayList = this.f151b;
            ar arVar = cgVar.f247b;
            arrayList.add(arVar != null ? arVar.mWho : null);
            int[] iArr = this.f150a;
            iArr[i4] = cgVar.f248c ? 1 : 0;
            iArr[i2 + 2] = cgVar.f249d;
            iArr[i2 + 3] = cgVar.f250e;
            int i5 = i2 + 5;
            iArr[i2 + 4] = cgVar.f251f;
            i2 += 6;
            iArr[i5] = cgVar.f252g;
            this.f152c[i3] = cgVar.f253h.ordinal();
            this.f153d[i3] = cgVar.f254i.ordinal();
        }
        this.f154e = aVar.f262j;
        this.f155f = aVar.m;
        this.f156g = aVar.f93c;
        this.f157h = aVar.n;
        this.f158i = aVar.o;
        this.f159j = aVar.p;
        this.f160k = aVar.q;
        this.f161l = aVar.r;
        this.m = aVar.s;
        this.n = aVar.t;
    }

    private final void c(a aVar) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f150a;
            boolean z = true;
            if (i2 >= iArr.length) {
                aVar.f262j = this.f154e;
                aVar.m = this.f155f;
                aVar.f263k = true;
                aVar.n = this.f157h;
                aVar.o = this.f158i;
                aVar.p = this.f159j;
                aVar.q = this.f160k;
                aVar.r = this.f161l;
                aVar.s = this.m;
                aVar.t = this.n;
                return;
            }
            cg cgVar = new cg();
            int i4 = i2 + 1;
            cgVar.f246a = iArr[i2];
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            cgVar.f253h = Lifecycle.State.values()[this.f152c[i3]];
            cgVar.f254i = Lifecycle.State.values()[this.f153d[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            cgVar.f248c = z;
            int i6 = iArr[i5];
            cgVar.f249d = i6;
            int i7 = iArr[i2 + 3];
            cgVar.f250e = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            cgVar.f251f = i9;
            i2 += 6;
            int i10 = iArr[i8];
            cgVar.f252g = i10;
            aVar.f258f = i6;
            aVar.f259g = i7;
            aVar.f260h = i9;
            aVar.f261i = i10;
            aVar.p(cgVar);
            i3++;
        }
    }

    public final a a(bv bvVar) {
        a aVar = new a(bvVar);
        c(aVar);
        aVar.f93c = this.f156g;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f151b;
            if (i2 >= arrayList.size()) {
                aVar.d(1);
                return aVar;
            }
            String str = (String) arrayList.get(i2);
            if (str != null) {
                ((cg) aVar.f257e.get(i2)).f247b = bvVar.e(str);
            }
            i2++;
        }
    }

    public final a b(bv bvVar, Map map) {
        a aVar = new a(bvVar);
        c(aVar);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f151b;
            if (i2 >= arrayList.size()) {
                return aVar;
            }
            String str = (String) arrayList.get(i2);
            if (str != null) {
                ar arVar = (ar) map.get(str);
                if (arVar == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f155f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((cg) aVar.f257e.get(i2)).f247b = arVar;
            }
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f150a);
        parcel.writeStringList(this.f151b);
        parcel.writeIntArray(this.f152c);
        parcel.writeIntArray(this.f153d);
        parcel.writeInt(this.f154e);
        parcel.writeString(this.f155f);
        parcel.writeInt(this.f156g);
        parcel.writeInt(this.f157h);
        TextUtils.writeToParcel(this.f158i, parcel, 0);
        parcel.writeInt(this.f159j);
        TextUtils.writeToParcel(this.f160k, parcel, 0);
        parcel.writeStringList(this.f161l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f150a = parcel.createIntArray();
        this.f151b = parcel.createStringArrayList();
        this.f152c = parcel.createIntArray();
        this.f153d = parcel.createIntArray();
        this.f154e = parcel.readInt();
        this.f155f = parcel.readString();
        this.f156g = parcel.readInt();
        this.f157h = parcel.readInt();
        this.f158i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f159j = parcel.readInt();
        this.f160k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f161l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
