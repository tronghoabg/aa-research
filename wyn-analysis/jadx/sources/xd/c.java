package Xd;

import A7.C;
import D6.C0395s;
import D6.InterfaceC0358a;
import E0.l;
import E0.m;
import E0.n;
import F6.e;
import G6.U;
import K6.d;
import N1.C0765n;
import S3.s;
import V1.k;
import V5.v;
import Va.EnumC1000hb;
import Va.InterfaceC1129rb;
import Z1.f;
import Z1.g;
import Z1.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.unity3d.services.core.device.MimeTypes;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;
import z9.C4630I;
import z9.M;
import z9.X;

/* loaded from: classes5.dex */
public final class c implements C, n, zzu, zbkf, J5.c, d, Le.d, P8.a, R6.b, v, InterfaceC1129rb, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16227a;

    public /* synthetic */ c(int i5) {
        this.f16227a = i5;
    }

    public static Typeface m(String str, l lVar, int i5) {
        if (i5 == 0 && AbstractC3340k.a(lVar, l.f2798d) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            AbstractC3340k.d(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f2802a, i5 == 1);
        AbstractC3340k.d(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }

    public static N9.a p(C4630I c4630i, M m10) {
        s sVarS = s(c4630i);
        if (!m10.equals(M.c())) {
            N9.l lVar = null;
            String strB = !TextUtils.isEmpty(m10.b()) ? m10.b() : null;
            if (m10.e()) {
                X xD = m10.d();
                String strD = !TextUtils.isEmpty(xD.d()) ? xD.d() : null;
                String strC = TextUtils.isEmpty(xD.c()) ? null : xD.c();
                if (TextUtils.isEmpty(strC)) {
                    throw new IllegalArgumentException("Text model must have a color");
                }
                lVar = new N9.l(strD, strC);
            }
            if (TextUtils.isEmpty(strB)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("Button model must have text");
            }
            sVarS.f11010c = new N9.d(lVar, strB);
        }
        return new N9.a((String) sVarS.f11009b, (N9.d) sVarS.f11010c);
    }

    public static N9.l r(X x5) {
        String strC = !TextUtils.isEmpty(x5.c()) ? x5.c() : null;
        String strD = TextUtils.isEmpty(x5.d()) ? null : x5.d();
        if (TextUtils.isEmpty(strC)) {
            throw new IllegalArgumentException("Text model must have a color");
        }
        return new N9.l(strD, strC);
    }

    public static s s(C4630I c4630i) {
        s sVar = new s(14, (char) 0);
        if (!TextUtils.isEmpty(c4630i.b())) {
            String strB = c4630i.b();
            if (!TextUtils.isEmpty(strB)) {
                sVar.f11009b = strB;
            }
        }
        return sVar;
    }

    public static final void t(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z2, zzdzt zzdztVar) {
        if (adOverlayInfoParcel.k == 4 && adOverlayInfoParcel.f26310c == null) {
            InterfaceC0358a interfaceC0358a = adOverlayInfoParcel.f26309b;
            if (interfaceC0358a != null) {
                interfaceC0358a.onAdClicked();
            }
            zzdlg zzdlgVar = adOverlayInfoParcel.f26327u;
            if (zzdlgVar != null) {
                zzdlgVar.zzdu();
            }
            Activity activityZzj = adOverlayInfoParcel.f26311d.zzj();
            e eVar = adOverlayInfoParcel.f26308a;
            Context context2 = (eVar == null || !eVar.f3962j || activityZzj == null) ? context : activityZzj;
            ya.b bVar = C6.n.f1857D.f1861a;
            ya.b.b(context2, eVar, adOverlayInfoParcel.f26316i, eVar != null ? eVar.f3961i : null, zzdztVar, adOverlayInfoParcel.f26323q);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f26319m.f4930d);
        intent.putExtra("shouldCallOnOverlayOpened", z2);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoO)).booleanValue()) {
            U u10 = C6.n.f1857D.f1863c;
            U.v(context, intent, zzdztVar, adOverlayInfoParcel.f26323q);
        } else {
            U u11 = C6.n.f1857D.f1863c;
            U.s(context, intent);
        }
    }

    @Override // V5.v, d2.t
    public MediaCodecInfo b(int i5) {
        return MediaCodecList.getCodecInfoAt(i5);
    }

    @Override // V5.v, d2.t
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // V5.v, d2.t
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // V5.v, d2.t
    public int e() {
        return MediaCodecList.getCodecCount();
    }

    @Override // Z1.g
    public /* synthetic */ void f() {
    }

    @Override // V5.v, d2.t
    public boolean g() {
        return false;
    }

    @Override // R6.b
    public int getAmount() {
        return 1;
    }

    @Override // R6.b
    public String getType() {
        return "";
    }

    @Override // E0.n
    public Typeface i(m name, l fontWeight, int i5) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(fontWeight, "fontWeight");
        name.getClass();
        return m(null, fontWeight, i5);
    }

    @Override // Z1.g
    public /* synthetic */ f j(Z1.d dVar, C0765n c0765n) {
        return f.f16929a;
    }

    @Override // Z1.g
    public S3.l k(Z1.d dVar, C0765n c0765n) {
        if (c0765n.f8236r == null) {
            return null;
        }
        return new S3.l(new Z1.b(new i(), 6001));
    }

    @Override // Z1.g
    public int l(C0765n c0765n) {
        return c0765n.f8236r != null ? 1 : 0;
    }

    @Override // Va.InterfaceC1129rb
    public /* synthetic */ Object n(String str, JSONObject jSONObject) {
        return EnumC1000hb.a(jSONObject.optString(str));
    }

    @Override // E0.n
    public Typeface o(l fontWeight, int i5) {
        AbstractC3340k.e(fontWeight, "fontWeight");
        return m(null, fontWeight, i5);
    }

    @Override // P8.a
    public void q(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // Z1.g
    public /* synthetic */ void release() {
    }

    @Override // Le.d
    public boolean test(Object obj) {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf
    public Object zba(Object obj) {
        return ((zboe) obj).zba();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return ((Ca.b) obj).p();
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f16227a) {
            case 2:
                return Boolean.valueOf(zzpn.zzj());
            case 3:
                return Boolean.valueOf(zznx.zzc());
            case 4:
                return Boolean.valueOf(zznr.zzb());
            case 5:
                return Integer.valueOf((int) zzng.zzag());
            case 6:
                return Boolean.valueOf(zznm.zzc());
            case 7:
                return Boolean.valueOf(zznm.zzd());
            case 8:
                return Long.valueOf(zzng.zzw());
            case 9:
                return Integer.valueOf((int) zzng.zzj());
            case 10:
                return zzng.zzba();
            case 11:
                return Integer.valueOf((int) zzng.zzp());
            case 12:
                return Boolean.valueOf(zzoe.zzb());
            case 13:
                return Boolean.valueOf(zzpu.zze());
            default:
                return Boolean.valueOf(zzow.zzb());
        }
    }

    @Override // J5.c
    public long a(long j8) {
        return j8;
    }

    @Override // Z1.g
    public void h(Looper looper, k kVar) {
    }
}
