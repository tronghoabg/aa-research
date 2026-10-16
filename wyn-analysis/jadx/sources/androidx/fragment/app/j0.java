package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new Z6.c(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f18460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18461b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18464e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18465f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18466g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18467h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18468i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18469j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18470l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18471m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18472n;

    public j0(F f10) {
        this.f18460a = f10.getClass().getName();
        this.f18461b = f10.mWho;
        this.f18462c = f10.mFromLayout;
        this.f18463d = f10.mFragmentId;
        this.f18464e = f10.mContainerId;
        this.f18465f = f10.mTag;
        this.f18466g = f10.mRetainInstance;
        this.f18467h = f10.mRemoving;
        this.f18468i = f10.mDetached;
        this.f18469j = f10.mHidden;
        this.k = f10.mMaxState.ordinal();
        this.f18470l = f10.mTargetWho;
        this.f18471m = f10.mTargetRequestCode;
        this.f18472n = f10.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f18460a);
        sb2.append(" (");
        sb2.append(this.f18461b);
        sb2.append(")}:");
        if (this.f18462c) {
            sb2.append(" fromLayout");
        }
        int i5 = this.f18464e;
        if (i5 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i5));
        }
        String str = this.f18465f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f18466g) {
            sb2.append(" retainInstance");
        }
        if (this.f18467h) {
            sb2.append(" removing");
        }
        if (this.f18468i) {
            sb2.append(" detached");
        }
        if (this.f18469j) {
            sb2.append(" hidden");
        }
        String str2 = this.f18470l;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f18471m);
        }
        if (this.f18472n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f18460a);
        parcel.writeString(this.f18461b);
        parcel.writeInt(this.f18462c ? 1 : 0);
        parcel.writeInt(this.f18463d);
        parcel.writeInt(this.f18464e);
        parcel.writeString(this.f18465f);
        parcel.writeInt(this.f18466g ? 1 : 0);
        parcel.writeInt(this.f18467h ? 1 : 0);
        parcel.writeInt(this.f18468i ? 1 : 0);
        parcel.writeInt(this.f18469j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeString(this.f18470l);
        parcel.writeInt(this.f18471m);
        parcel.writeInt(this.f18472n ? 1 : 0);
    }

    public j0(Parcel parcel) {
        this.f18460a = parcel.readString();
        this.f18461b = parcel.readString();
        this.f18462c = parcel.readInt() != 0;
        this.f18463d = parcel.readInt();
        this.f18464e = parcel.readInt();
        this.f18465f = parcel.readString();
        this.f18466g = parcel.readInt() != 0;
        this.f18467h = parcel.readInt() != 0;
        this.f18468i = parcel.readInt() != 0;
        this.f18469j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.f18470l = parcel.readString();
        this.f18471m = parcel.readInt();
        this.f18472n = parcel.readInt() != 0;
    }
}
