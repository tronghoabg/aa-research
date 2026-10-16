package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cb implements Parcelable {
    public static final Parcelable.Creator<cb> CREATOR = new c(4);

    /* renamed from: a, reason: collision with root package name */
    final String f223a;

    /* renamed from: b, reason: collision with root package name */
    final String f224b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f225c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f226d;

    /* renamed from: e, reason: collision with root package name */
    final int f227e;

    /* renamed from: f, reason: collision with root package name */
    final int f228f;

    /* renamed from: g, reason: collision with root package name */
    final String f229g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f230h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f231i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f232j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f233k;

    /* renamed from: l, reason: collision with root package name */
    final int f234l;
    final String m;
    final int n;
    final boolean o;

    cb(Parcel parcel) {
        this.f223a = parcel.readString();
        this.f224b = parcel.readString();
        this.f225c = parcel.readInt() != 0;
        this.f226d = parcel.readInt() != 0;
        this.f227e = parcel.readInt();
        this.f228f = parcel.readInt();
        this.f229g = parcel.readString();
        this.f230h = parcel.readInt() != 0;
        this.f231i = parcel.readInt() != 0;
        this.f232j = parcel.readInt() != 0;
        this.f233k = parcel.readInt() != 0;
        this.f234l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    final ar a(az azVar, ClassLoader classLoader) {
        ar arVarA = azVar.a(classLoader, this.f223a);
        arVarA.mWho = this.f224b;
        arVarA.mFromLayout = this.f225c;
        arVarA.mInDynamicContainer = this.f226d;
        arVarA.mRestored = true;
        arVarA.mFragmentId = this.f227e;
        arVarA.mContainerId = this.f228f;
        arVarA.mTag = this.f229g;
        arVarA.mRetainInstance = this.f230h;
        arVarA.mRemoving = this.f231i;
        arVarA.mDetached = this.f232j;
        arVarA.mHidden = this.f233k;
        arVarA.mMaxState = Lifecycle.State.values()[this.f234l];
        arVarA.mTargetWho = this.m;
        arVarA.mTargetRequestCode = this.n;
        arVarA.mUserVisibleHint = this.o;
        return arVarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f223a);
        sb.append(" (");
        sb.append(this.f224b);
        sb.append(")}:");
        if (this.f225c) {
            sb.append(" fromLayout");
        }
        if (this.f226d) {
            sb.append(" dynamicContainer");
        }
        int i2 = this.f228f;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f229g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f230h) {
            sb.append(" retainInstance");
        }
        if (this.f231i) {
            sb.append(" removing");
        }
        if (this.f232j) {
            sb.append(" detached");
        }
        if (this.f233k) {
            sb.append(" hidden");
        }
        String str2 = this.m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.n);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f223a);
        parcel.writeString(this.f224b);
        parcel.writeInt(this.f225c ? 1 : 0);
        parcel.writeInt(this.f226d ? 1 : 0);
        parcel.writeInt(this.f227e);
        parcel.writeInt(this.f228f);
        parcel.writeString(this.f229g);
        parcel.writeInt(this.f230h ? 1 : 0);
        parcel.writeInt(this.f231i ? 1 : 0);
        parcel.writeInt(this.f232j ? 1 : 0);
        parcel.writeInt(this.f233k ? 1 : 0);
        parcel.writeInt(this.f234l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    cb(ar arVar) {
        this.f223a = arVar.getClass().getName();
        this.f224b = arVar.mWho;
        this.f225c = arVar.mFromLayout;
        this.f226d = arVar.mInDynamicContainer;
        this.f227e = arVar.mFragmentId;
        this.f228f = arVar.mContainerId;
        this.f229g = arVar.mTag;
        this.f230h = arVar.mRetainInstance;
        this.f231i = arVar.mRemoving;
        this.f232j = arVar.mDetached;
        this.f233k = arVar.mHidden;
        this.f234l = arVar.mMaxState.ordinal();
        this.m = arVar.mTargetWho;
        this.n = arVar.mTargetRequestCode;
        this.o = arVar.mUserVisibleHint;
    }
}
