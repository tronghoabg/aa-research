package com.waze.messages;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(0);
    public String A;
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public String f29765a;

    /* renamed from: b, reason: collision with root package name */
    public String f29766b;

    /* renamed from: c, reason: collision with root package name */
    public String f29767c;

    /* renamed from: d, reason: collision with root package name */
    public String f29768d;

    /* renamed from: e, reason: collision with root package name */
    public String f29769e;

    /* renamed from: f, reason: collision with root package name */
    public String f29770f;

    /* renamed from: g, reason: collision with root package name */
    public String f29771g;

    /* renamed from: h, reason: collision with root package name */
    public String f29772h;

    /* renamed from: i, reason: collision with root package name */
    public String f29773i;

    /* renamed from: j, reason: collision with root package name */
    public String f29774j;

    /* renamed from: k, reason: collision with root package name */
    public String f29775k;

    /* renamed from: l, reason: collision with root package name */
    public String f29776l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public String w;
    public String x;
    public String y;
    public String z;

    protected c(Parcel parcel) {
        this.f29765a = null;
        this.f29766b = null;
        this.f29767c = null;
        this.f29768d = null;
        this.f29769e = null;
        this.f29770f = null;
        this.f29771g = null;
        this.f29772h = null;
        this.f29773i = null;
        this.f29774j = null;
        this.f29775k = null;
        this.f29776l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.f29765a = parcel.readString();
        this.f29766b = parcel.readString();
        this.f29767c = parcel.readString();
        this.f29768d = parcel.readString();
        this.f29769e = parcel.readString();
        this.f29770f = parcel.readString();
        this.f29771g = parcel.readString();
        this.f29772h = parcel.readString();
        this.f29773i = parcel.readString();
        this.f29774j = parcel.readString();
        this.f29775k = parcel.readString();
        this.f29776l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readByte() != 0;
        this.H = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f29765a);
        parcel.writeString(this.f29766b);
        parcel.writeString(this.f29767c);
        parcel.writeString(this.f29768d);
        parcel.writeString(this.f29769e);
        parcel.writeString(this.f29770f);
        parcel.writeString(this.f29771g);
        parcel.writeString(this.f29772h);
        parcel.writeString(this.f29773i);
        parcel.writeString(this.f29774j);
        parcel.writeString(this.f29775k);
        parcel.writeString(this.f29776l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
    }

    public c() {
        this.f29765a = null;
        this.f29766b = null;
        this.f29767c = null;
        this.f29768d = null;
        this.f29769e = null;
        this.f29770f = null;
        this.f29771g = null;
        this.f29772h = null;
        this.f29773i = null;
        this.f29774j = null;
        this.f29775k = null;
        this.f29776l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = false;
    }
}
