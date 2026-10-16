package com.waze.settings;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gw implements Comparable<gw>, Parcelable {
    public static final Parcelable.Creator<gw> CREATOR = new gv(0);

    /* renamed from: a, reason: collision with root package name */
    public boolean f37348a;

    /* renamed from: b, reason: collision with root package name */
    public String f37349b;

    /* renamed from: c, reason: collision with root package name */
    public String f37350c;

    /* renamed from: d, reason: collision with root package name */
    public String f37351d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f37352e;

    /* renamed from: f, reason: collision with root package name */
    public float f37353f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37354g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f37355h;

    /* renamed from: i, reason: collision with root package name */
    public int f37356i;

    /* renamed from: j, reason: collision with root package name */
    public final View f37357j;

    /* renamed from: k, reason: collision with root package name */
    public int f37358k;

    /* renamed from: l, reason: collision with root package name */
    public String f37359l;

    public gw(Parcel parcel) {
        this.f37351d = "";
        this.f37352e = null;
        this.f37353f = 0.0f;
        this.f37354g = false;
        this.f37356i = 0;
        this.f37357j = null;
        this.f37350c = parcel.readString();
        this.f37349b = parcel.readString();
        this.f37348a = parcel.readInt() != 0;
        this.f37351d = parcel.readString();
        this.f37353f = parcel.readFloat();
        this.f37354g = parcel.readInt() != 0;
        this.f37356i = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(gw gwVar) {
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f37350c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f37350c);
        parcel.writeString(this.f37349b);
        parcel.writeInt(this.f37348a ? 1 : 0);
        parcel.writeString(this.f37351d);
        parcel.writeFloat(this.f37353f);
        parcel.writeInt(this.f37354g ? 1 : 0);
        parcel.writeInt(this.f37356i);
    }

    public gw(String str, String str2, boolean z) {
        this.f37351d = "";
        this.f37352e = null;
        this.f37353f = 0.0f;
        this.f37354g = false;
        this.f37356i = 0;
        this.f37357j = null;
        this.f37350c = str2;
        this.f37349b = str;
        this.f37348a = z;
    }

    public gw(String str, String str2, boolean z, String str3) {
        this.f37351d = "";
        this.f37352e = null;
        this.f37353f = 0.0f;
        this.f37354g = false;
        this.f37356i = 0;
        this.f37357j = null;
        this.f37350c = str2;
        this.f37349b = str;
        this.f37359l = str3;
        this.f37348a = z;
    }

    public gw(String str, String str2, String str3) {
        this.f37352e = null;
        this.f37353f = 0.0f;
        this.f37354g = false;
        this.f37356i = 0;
        this.f37357j = null;
        this.f37350c = str2;
        this.f37349b = str;
        this.f37348a = false;
        this.f37351d = str3;
    }
}
