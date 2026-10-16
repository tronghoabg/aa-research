package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0391p0;
import D6.InterfaceC0396s0;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import n7.AbstractC3598c;
import n7.C3597b;
import n7.InterfaceC3596a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdov implements zzdqj {
    private InterfaceC0391p0 zzC;
    private final zzdfo zzD;
    private final zzdrc zzE;
    private final C6.b zzF;
    private final zzdbv zzG;
    private final Context zza;
    private final zzdql zzb;
    private final JSONObject zzc;
    private final zzdvf zzd;
    private final zzdqb zze;
    private final zzbaw zzf;
    private final zzddr zzg;
    private final zzdcx zzh;
    private final zzdle zzi;
    private final zzfkn zzj;
    private final H6.a zzk;
    private final zzflg zzl;
    private final zzcun zzm;
    private final zzdrg zzn;
    private final InterfaceC3596a zzo;
    private final zzdla zzp;
    private final zzfsm zzq;
    private final zzdwv zzr;
    private final zzfqq zzs;
    private final zzekz zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdov(Context context, zzdql zzdqlVar, JSONObject jSONObject, zzdvf zzdvfVar, zzdqb zzdqbVar, zzbaw zzbawVar, zzddr zzddrVar, zzdcx zzdcxVar, zzdle zzdleVar, zzfkn zzfknVar, H6.a aVar, zzflg zzflgVar, zzcun zzcunVar, zzdrg zzdrgVar, InterfaceC3596a interfaceC3596a, zzdla zzdlaVar, zzfsm zzfsmVar, zzfqq zzfqqVar, zzekz zzekzVar, zzdwv zzdwvVar, zzdrc zzdrcVar, zzdfo zzdfoVar, C6.b bVar, zzcdu zzcduVar, zzdbv zzdbvVar) {
        this.zza = context;
        this.zzb = zzdqlVar;
        this.zzc = jSONObject;
        this.zzd = zzdvfVar;
        this.zze = zzdqbVar;
        this.zzf = zzbawVar;
        this.zzg = zzddrVar;
        this.zzh = zzdcxVar;
        this.zzi = zzdleVar;
        this.zzj = zzfknVar;
        this.zzk = aVar;
        this.zzl = zzflgVar;
        this.zzm = zzcunVar;
        this.zzn = zzdrgVar;
        this.zzo = interfaceC3596a;
        this.zzp = zzdlaVar;
        this.zzq = zzfsmVar;
        this.zzs = zzfqqVar;
        this.zzt = zzekzVar;
        this.zzr = zzdwvVar;
        this.zzE = zzdrcVar;
        this.zzD = zzdfoVar;
        this.zzF = bVar;
        this.zzG = zzdbvVar;
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzx = this.zze.zzx();
        if (iZzx == 1) {
            return "1099";
        }
        if (iZzx == 2) {
            return "2099";
        }
        if (iZzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        C6.b bVar;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpr)).booleanValue() || (bVar = this.zzF) == null) {
            return;
        }
        bVar.f1809b = true;
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z2, View view) throws JSONException {
        JSONException jSONException;
        zzdbv zzdbvVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            zzbio zzbioVar = zzbix.zzeB;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e7) {
                    jSONException = e7;
                    int i5 = G6.L.f4523b;
                    H6.l.d("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z2);
            jSONObject6.put("screen", Fe.g.V(this.zza));
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpt)).booleanValue() && (zzdbvVar = this.zzG) != null && zzdbvVar.zza() > 0) {
                jSONObject6.put("placement_id", zzdbvVar.zza());
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjY)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdos(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdor(this, null));
            }
            zzdvf zzdvfVar = this.zzd;
            zzdvfVar.zzd("/nativeImpression", new zzdot(this, view, null));
            try {
                zzdvfVar.zzd("/nativeImpressionFlowControl", new zzdou(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzcgb.zza(zzdvfVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", zzcfy.zzh);
                if (this.zzu) {
                    return true;
                }
                this.zzu = C6.n.f1857D.f1874o.d(this.zza, this.zzk.f4927a, this.zzj.zzC.toString(), this.zzl.zzg);
                return true;
            } catch (JSONException e10) {
                e = e10;
                jSONException = e;
                int i52 = G6.L.f4523b;
                H6.l.d("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeB)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i5 = G6.L.f4523b;
            H6.l.c("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzA() {
        this.zzd.zzb();
    }

    public final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    public final /* synthetic */ zzddr zzC() {
        return this.zzg;
    }

    public final /* synthetic */ zzdcx zzD() {
        return this.zzh;
    }

    public final /* synthetic */ zzdle zzE() {
        return this.zzi;
    }

    public final /* synthetic */ zzdfo zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zO = Fe.g.O(this.zzk.f4929c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zO) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zO) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzc(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectS = Fe.g.S(context, map, map2, view2, scaleType);
        JSONObject jSONObjectP = Fe.g.P(context, view2);
        JSONObject jSONObjectQ = Fe.g.Q(view2);
        JSONObject jSONObjectR = Fe.g.R(context, view2);
        String strZzH = zzH(view, map);
        zzi(true == ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeI)).booleanValue() ? view2 : view, jSONObjectP, jSONObjectS, jSONObjectQ, jSONObjectR, strZzH, Fe.g.T(strZzH, context, this.zzz, this.zzy), null, z2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzd(String str) throws JSONException {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zze(Bundle bundle) throws JSONException {
        if (bundle == null) {
            int i5 = G6.L.f4523b;
            H6.l.a("Click data is null. No click is reported.");
            return;
        }
        if (!zzG("click_reporting")) {
            int i10 = G6.L.f4523b;
            H6.l.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectM = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        H6.f fVar = C0392q.f2477g.f2478a;
        fVar.getClass();
        try {
            jSONObjectM = fVar.m(bundle);
        } catch (JSONException e7) {
            H6.l.d("Error converting Bundle to JSON", e7);
        }
        zzi(null, null, null, null, null, string, null, jSONObjectM, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzf(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i5) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z10 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue()) {
                z10 = true;
            }
        }
        if (!z10) {
            if (!this.zzx) {
                int i10 = G6.L.f4523b;
                H6.l.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i11 = G6.L.f4523b;
                H6.l.a("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectS = Fe.g.S(context, map, map2, view2, scaleType);
        JSONObject jSONObjectP = Fe.g.P(context, view2);
        boolean z11 = z10;
        JSONObject jSONObjectQ = Fe.g.Q(view2);
        JSONObject jSONObjectR = Fe.g.R(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectT = Fe.g.T(strZzH, context, this.zzz, this.zzy);
        if (z11) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i5);
                    } catch (Exception e7) {
                        e = e7;
                        int i12 = G6.L.f4523b;
                        H6.l.d("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzi(view2, jSONObjectP, jSONObjectS, jSONObjectQ, jSONObjectR, strZzH, jSONObjectT, null, z2, true);
                    }
                } catch (Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e11) {
                int i13 = G6.L.f4523b;
                H6.l.d("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                C6.n.f1857D.f1868h.zzh(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, jSONObjectP, jSONObjectS, jSONObjectQ, jSONObjectR, strZzH, jSONObjectT, null, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzh() {
        return zzI();
    }

    public final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z2, boolean z10) throws JSONException {
        String strZzg;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdql zzdqlVar = this.zzb;
            zzdqb zzdqbVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdqlVar.zzg(zzdqbVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdqbVar.zzx());
            jSONObject9.put("view_aware_api_used", z2);
            zzbma zzbmaVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbmaVar != null && zzbmaVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdqbVar.zzE().isEmpty() || zzdqbVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            ((C3597b) this.zzo).getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdqlVar.zzg(zzdqbVar.zzS()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.zzf.zzb().zzg(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Exception obtaining click signals", e7);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            zzbio zzbioVar = zzbix.zzkc;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && AbstractC3598c.i()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkd)).booleanValue() && AbstractC3598c.i()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            ((C3597b) this.zzo).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzcgb.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick", zzcfy.zzh);
        } catch (JSONException e10) {
            int i10 = G6.L.f4523b;
            H6.l.d("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        int[] iArr = new int[2];
        if (view2 != null) {
            view2.getLocationOnScreen(iArr);
        }
        this.zzy = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        ((C3597b) this.zzo).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzc(motionEventObtain);
        motionEventObtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i5 = G6.L.f4523b;
            H6.l.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i10 = G6.L.f4523b;
                H6.l.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectS = Fe.g.S(context, map, map2, view, scaleType);
        JSONObject jSONObjectP = Fe.g.P(context, view);
        JSONObject jSONObjectQ = Fe.g.Q(view);
        JSONObject jSONObjectR = Fe.g.R(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectS);
            jSONObject.put("ad_view_signal", jSONObjectP);
            jSONObject.put("scroll_view_signal", jSONObjectQ);
            jSONObject.put("lock_screen_signal", jSONObjectR);
            return jSONObject;
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Unable to create native ad view signals JSON.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzl != null) {
                jSONObject.put("nas", jSONObjectZzl);
                return jSONObject;
            }
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Unable to create native click meta data JSON.", e7);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzn() throws JSONException {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i5 = G6.L.f4523b;
            H6.l.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdrg zzdrgVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdrgVar);
        view.setClickable(true);
        zzdrgVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzp(zzbnz zzbnzVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbnzVar);
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzr(InterfaceC0396s0 interfaceC0396s0) {
        try {
            if (this.zzw) {
                return;
            }
            if (interfaceC0396s0 == null) {
                zzdqb zzdqbVar = this.zze;
                if (zzdqbVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdqbVar.zzF().f2409b, this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(interfaceC0396s0.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzs(InterfaceC0391p0 interfaceC0391p0) {
        this.zzC = interfaceC0391p0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzt() {
        try {
            InterfaceC0391p0 interfaceC0391p0 = this.zzC;
            if (interfaceC0391p0 != null) {
                interfaceC0391p0.zze();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final int zzu() {
        zzbma zzbmaVar = this.zzl.zzj;
        if (zzbmaVar == null) {
            return 0;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue()) {
            return zzbmaVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        zzK(Fe.g.P(context, view), Fe.g.S(context, map, map2, view, scaleType), Fe.g.Q(view), Fe.g.R(context, view), zzL(view), null, Fe.g.U(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectS = Fe.g.S(context, map, map2, view, scaleType);
        JSONObject jSONObjectP = Fe.g.P(context, view);
        JSONObject jSONObjectQ = Fe.g.Q(view);
        JSONObject jSONObjectR = Fe.g.R(context, view);
        boolean zU = Fe.g.U(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectS);
            jSONObject.put("ad_view_signal", jSONObjectP);
            jSONObject.put("scroll_view_signal", jSONObjectQ);
            jSONObject.put("lock_screen_signal", jSONObjectR);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeB)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zU);
            jSONObject.put("screen", Fe.g.V(context));
            zzcgb.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", zzcfy.zzh);
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Unable to create native ad signals logging JSON.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzy() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcgb.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", zzcfy.zzh);
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzz(Bundle bundle) throws JSONException {
        JSONObject jSONObjectM;
        if (!zzG("impression_reporting")) {
            int i5 = G6.L.f4523b;
            H6.l.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        fVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectM = fVar.m(bundle);
            } catch (JSONException e7) {
                H6.l.d("Error converting Bundle to JSON", e7);
            }
        } else {
            jSONObjectM = null;
        }
        return zzK(null, null, null, null, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznc)).booleanValue() ? zzL(null) : null, jSONObjectM, false, null);
    }
}
