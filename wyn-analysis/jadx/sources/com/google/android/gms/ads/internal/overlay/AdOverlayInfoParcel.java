package com.google.android.gms.ads.internal.overlay;

import C6.g;
import C6.n;
import D6.B1;
import D6.C0395s;
import D6.InterfaceC0358a;
import F6.c;
import F6.e;
import F6.m;
import F6.o;
import H6.a;
import a.AbstractC1304a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzedk;
import com.google.android.gms.internal.ads.zzekz;
import f7.AbstractC2614a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class AdOverlayInfoParcel extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new B1(7);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLong f26306y = new AtomicLong(0);

    /* renamed from: z, reason: collision with root package name */
    public static final ConcurrentHashMap f26307z = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final e f26308a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0358a f26309b;

    /* renamed from: c, reason: collision with root package name */
    public final o f26310c;

    /* renamed from: d, reason: collision with root package name */
    public final zzclb f26311d;

    /* renamed from: e, reason: collision with root package name */
    public final zzbop f26312e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26313f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26314g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26315h;

    /* renamed from: i, reason: collision with root package name */
    public final c f26316i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26317j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final String f26318l;

    /* renamed from: m, reason: collision with root package name */
    public final a f26319m;

    /* renamed from: n, reason: collision with root package name */
    public final String f26320n;

    /* renamed from: o, reason: collision with root package name */
    public final g f26321o;

    /* renamed from: p, reason: collision with root package name */
    public final zzbon f26322p;

    /* renamed from: q, reason: collision with root package name */
    public final String f26323q;

    /* renamed from: r, reason: collision with root package name */
    public final String f26324r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26325s;

    /* renamed from: t, reason: collision with root package name */
    public final zzddm f26326t;

    /* renamed from: u, reason: collision with root package name */
    public final zzdlg f26327u;

    /* renamed from: v, reason: collision with root package name */
    public final zzbzb f26328v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f26329w;

    /* renamed from: x, reason: collision with root package name */
    public final long f26330x;

    public AdOverlayInfoParcel(InterfaceC0358a interfaceC0358a, o oVar, c cVar, zzclb zzclbVar, boolean z2, int i5, a aVar, zzdlg zzdlgVar, zzekz zzekzVar) {
        this.f26308a = null;
        this.f26309b = interfaceC0358a;
        this.f26310c = oVar;
        this.f26311d = zzclbVar;
        this.f26322p = null;
        this.f26312e = null;
        this.f26313f = null;
        this.f26314g = z2;
        this.f26315h = null;
        this.f26316i = cVar;
        this.f26317j = i5;
        this.k = 2;
        this.f26318l = null;
        this.f26319m = aVar;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = null;
        this.f26324r = null;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = zzdlgVar;
        this.f26328v = zzekzVar;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }

    public static AdOverlayInfoParcel V(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e7) {
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoF)).booleanValue()) {
                return null;
            }
            n.f1857D.f1868h.zzh(e7, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    public static final IBinder W(Object obj) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoF)).booleanValue()) {
            return null;
        }
        return new BinderC3877b(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, this.f26308a, i5, false);
        InterfaceC0358a interfaceC0358a = this.f26309b;
        AbstractC1304a.V(parcel, 3, W(interfaceC0358a));
        o oVar = this.f26310c;
        AbstractC1304a.V(parcel, 4, W(oVar));
        zzclb zzclbVar = this.f26311d;
        AbstractC1304a.V(parcel, 5, W(zzclbVar));
        zzbop zzbopVar = this.f26312e;
        AbstractC1304a.V(parcel, 6, W(zzbopVar));
        AbstractC1304a.a0(parcel, 7, this.f26313f, false);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f26314g ? 1 : 0);
        AbstractC1304a.a0(parcel, 9, this.f26315h, false);
        c cVar = this.f26316i;
        AbstractC1304a.V(parcel, 10, W(cVar));
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(this.f26317j);
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(this.k);
        AbstractC1304a.a0(parcel, 13, this.f26318l, false);
        AbstractC1304a.Z(parcel, 14, this.f26319m, i5, false);
        AbstractC1304a.a0(parcel, 16, this.f26320n, false);
        AbstractC1304a.Z(parcel, 17, this.f26321o, i5, false);
        zzbon zzbonVar = this.f26322p;
        AbstractC1304a.V(parcel, 18, W(zzbonVar));
        AbstractC1304a.a0(parcel, 19, this.f26323q, false);
        AbstractC1304a.a0(parcel, 24, this.f26324r, false);
        AbstractC1304a.a0(parcel, 25, this.f26325s, false);
        zzddm zzddmVar = this.f26326t;
        AbstractC1304a.V(parcel, 26, W(zzddmVar));
        zzdlg zzdlgVar = this.f26327u;
        AbstractC1304a.V(parcel, 27, W(zzdlgVar));
        zzbzb zzbzbVar = this.f26328v;
        AbstractC1304a.V(parcel, 28, W(zzbzbVar));
        AbstractC1304a.k0(parcel, 29, 4);
        parcel.writeInt(this.f26329w ? 1 : 0);
        AbstractC1304a.k0(parcel, 30, 8);
        long j8 = this.f26330x;
        parcel.writeLong(j8);
        AbstractC1304a.m0(iL0, parcel);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoF)).booleanValue()) {
            f26307z.put(Long.valueOf(j8), new m(interfaceC0358a, oVar, zzclbVar, zzbonVar, zzbopVar, cVar, zzddmVar, zzdlgVar, zzbzbVar, zzcfy.zzd.schedule(new F6.n(j8), ((Integer) r3.f2492c.zzd(zzbix.zzoH)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC0358a interfaceC0358a, o oVar, zzbon zzbonVar, zzbop zzbopVar, c cVar, zzclb zzclbVar, boolean z2, int i5, String str, a aVar, zzdlg zzdlgVar, zzekz zzekzVar, boolean z10) {
        this.f26308a = null;
        this.f26309b = interfaceC0358a;
        this.f26310c = oVar;
        this.f26311d = zzclbVar;
        this.f26322p = zzbonVar;
        this.f26312e = zzbopVar;
        this.f26313f = null;
        this.f26314g = z2;
        this.f26315h = null;
        this.f26316i = cVar;
        this.f26317j = i5;
        this.k = 3;
        this.f26318l = str;
        this.f26319m = aVar;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = null;
        this.f26324r = null;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = zzdlgVar;
        this.f26328v = zzekzVar;
        this.f26329w = z10;
        this.f26330x = f26306y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0358a interfaceC0358a, o oVar, zzbon zzbonVar, zzbop zzbopVar, c cVar, zzclb zzclbVar, boolean z2, int i5, String str, String str2, a aVar, zzdlg zzdlgVar, zzekz zzekzVar) {
        this.f26308a = null;
        this.f26309b = interfaceC0358a;
        this.f26310c = oVar;
        this.f26311d = zzclbVar;
        this.f26322p = zzbonVar;
        this.f26312e = zzbopVar;
        this.f26313f = str2;
        this.f26314g = z2;
        this.f26315h = str;
        this.f26316i = cVar;
        this.f26317j = i5;
        this.k = 3;
        this.f26318l = null;
        this.f26319m = aVar;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = null;
        this.f26324r = null;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = zzdlgVar;
        this.f26328v = zzekzVar;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, InterfaceC0358a interfaceC0358a, o oVar, c cVar, a aVar, zzclb zzclbVar, zzdlg zzdlgVar, String str) {
        this.f26308a = eVar;
        this.f26309b = interfaceC0358a;
        this.f26310c = oVar;
        this.f26311d = zzclbVar;
        this.f26322p = null;
        this.f26312e = null;
        this.f26313f = null;
        this.f26314g = false;
        this.f26315h = null;
        this.f26316i = cVar;
        this.f26317j = -1;
        this.k = 4;
        this.f26318l = null;
        this.f26319m = aVar;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = str;
        this.f26324r = null;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = zzdlgVar;
        this.f26328v = null;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z2, String str2, IBinder iBinder5, int i5, int i10, String str3, a aVar, String str4, g gVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j8) {
        this.f26308a = eVar;
        this.f26313f = str;
        this.f26314g = z2;
        this.f26315h = str2;
        this.f26317j = i5;
        this.k = i10;
        this.f26318l = str3;
        this.f26319m = aVar;
        this.f26320n = str4;
        this.f26321o = gVar;
        this.f26323q = str5;
        this.f26324r = str6;
        this.f26325s = str7;
        this.f26329w = z10;
        this.f26330x = j8;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoF)).booleanValue()) {
            m mVar = (m) f26307z.remove(Long.valueOf(j8));
            if (mVar != null) {
                this.f26309b = mVar.f3993a;
                this.f26310c = mVar.f3994b;
                this.f26311d = mVar.f3995c;
                this.f26322p = mVar.f3996d;
                this.f26312e = mVar.f3997e;
                this.f26326t = mVar.f3999g;
                this.f26327u = mVar.f4000h;
                this.f26328v = mVar.f4001i;
                this.f26316i = mVar.f3998f;
                mVar.f4002j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f26309b = (InterfaceC0358a) BinderC3877b.S(BinderC3877b.R(iBinder));
        this.f26310c = (o) BinderC3877b.S(BinderC3877b.R(iBinder2));
        this.f26311d = (zzclb) BinderC3877b.S(BinderC3877b.R(iBinder3));
        this.f26322p = (zzbon) BinderC3877b.S(BinderC3877b.R(iBinder6));
        this.f26312e = (zzbop) BinderC3877b.S(BinderC3877b.R(iBinder4));
        this.f26316i = (c) BinderC3877b.S(BinderC3877b.R(iBinder5));
        this.f26326t = (zzddm) BinderC3877b.S(BinderC3877b.R(iBinder7));
        this.f26327u = (zzdlg) BinderC3877b.S(BinderC3877b.R(iBinder8));
        this.f26328v = (zzbzb) BinderC3877b.S(BinderC3877b.R(iBinder9));
    }

    public AdOverlayInfoParcel(zzclb zzclbVar, a aVar, String str, String str2, zzbzb zzbzbVar) {
        this.f26308a = null;
        this.f26309b = null;
        this.f26310c = null;
        this.f26311d = zzclbVar;
        this.f26322p = null;
        this.f26312e = null;
        this.f26313f = null;
        this.f26314g = false;
        this.f26315h = null;
        this.f26316i = null;
        this.f26317j = 14;
        this.k = 5;
        this.f26318l = null;
        this.f26319m = aVar;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = str;
        this.f26324r = str2;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = null;
        this.f26328v = zzbzbVar;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdnl zzdnlVar, zzclb zzclbVar, int i5, a aVar, String str, g gVar, String str2, String str3, String str4, zzddm zzddmVar, zzekz zzekzVar, String str5) {
        this.f26308a = null;
        this.f26309b = null;
        this.f26310c = zzdnlVar;
        this.f26311d = zzclbVar;
        this.f26322p = null;
        this.f26312e = null;
        this.f26314g = false;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzby)).booleanValue()) {
            this.f26313f = null;
            this.f26315h = null;
        } else {
            this.f26313f = str2;
            this.f26315h = str3;
        }
        this.f26316i = null;
        this.f26317j = i5;
        this.k = 1;
        this.f26318l = null;
        this.f26319m = aVar;
        this.f26320n = str;
        this.f26321o = gVar;
        this.f26323q = str5;
        this.f26324r = null;
        this.f26325s = str4;
        this.f26326t = zzddmVar;
        this.f26327u = null;
        this.f26328v = zzekzVar;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzedk zzedkVar, zzclb zzclbVar, a aVar) {
        this.f26310c = zzedkVar;
        this.f26311d = zzclbVar;
        this.f26317j = 1;
        this.f26319m = aVar;
        this.f26308a = null;
        this.f26309b = null;
        this.f26322p = null;
        this.f26312e = null;
        this.f26313f = null;
        this.f26314g = false;
        this.f26315h = null;
        this.f26316i = null;
        this.k = 1;
        this.f26318l = null;
        this.f26320n = null;
        this.f26321o = null;
        this.f26323q = null;
        this.f26324r = null;
        this.f26325s = null;
        this.f26326t = null;
        this.f26327u = null;
        this.f26328v = null;
        this.f26329w = false;
        this.f26330x = f26306y.getAndIncrement();
    }
}
