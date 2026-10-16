package D6;

import a.AbstractC1304a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdSize;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class x1 extends AbstractC2614a {
    public static final Parcelable.Creator<x1> CREATOR = new A6.j(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2532c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2533d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2535f;

    /* renamed from: g, reason: collision with root package name */
    public final x1[] f2536g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2537h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2538i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2539j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2540l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2541m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2542n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2543o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2544p;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x1(android.content.Context r17, com.google.android.gms.ads.AdSize[] r18) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.x1.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public static x1 V() {
        return new x1("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static x1 W() {
        return new x1("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f2530a, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f2531b);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f2532c);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f2533d ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f2534e);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f2535f);
        AbstractC1304a.d0(parcel, 8, this.f2536g, i5);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(this.f2537h ? 1 : 0);
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(this.f2538i ? 1 : 0);
        boolean z2 = this.f2539j;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(this.k ? 1 : 0);
        AbstractC1304a.k0(parcel, 13, 4);
        parcel.writeInt(this.f2540l ? 1 : 0);
        AbstractC1304a.k0(parcel, 14, 4);
        parcel.writeInt(this.f2541m ? 1 : 0);
        AbstractC1304a.k0(parcel, 15, 4);
        parcel.writeInt(this.f2542n ? 1 : 0);
        AbstractC1304a.k0(parcel, 16, 4);
        parcel.writeInt(this.f2543o ? 1 : 0);
        AbstractC1304a.k0(parcel, 17, 4);
        parcel.writeInt(this.f2544p ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public x1(String str, int i5, int i10, boolean z2, int i11, int i12, x1[] x1VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f2530a = str;
        this.f2531b = i5;
        this.f2532c = i10;
        this.f2533d = z2;
        this.f2534e = i11;
        this.f2535f = i12;
        this.f2536g = x1VarArr;
        this.f2537h = z10;
        this.f2538i = z11;
        this.f2539j = z12;
        this.k = z13;
        this.f2540l = z14;
        this.f2541m = z15;
        this.f2542n = z16;
        this.f2543o = z17;
        this.f2544p = z18;
    }

    public x1() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public x1(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }
}
