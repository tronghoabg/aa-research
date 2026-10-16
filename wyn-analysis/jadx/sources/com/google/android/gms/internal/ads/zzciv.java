package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.C0392q;
import D6.C0395s;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzciv implements zzbpx {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i5) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                H6.f fVar = C0392q.f2477g.f2478a;
                i5 = H6.f.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strH = AbstractC3256n.h(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i10 = G6.L.f4523b;
                H6.l.f(strH);
            }
        }
        if (G6.L.m()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            AbstractC3256n.p(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i5);
            sb2.append(".");
            G6.L.k(sb2.toString());
        }
        return i5;
    }

    private static void zzc(zzchi zzchiVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchiVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strG = R8.v.g("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i5 = G6.L.f4523b;
                H6.l.f(strG);
                return;
            }
        }
        if (str2 != null) {
            zzchiVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchiVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchiVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchiVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i5;
        Integer numValueOf;
        int i10;
        zzchu zzchuVar = (zzchu) obj;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (str == null) {
            int i11 = G6.L.f4523b;
            H6.l.f("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzchuVar.zzdm() != null ? zzchuVar.zzdm().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i12 = G6.L.f4523b;
            H6.l.e("Event intended for player " + numValueOf2 + ", but sent to player " + numZza + " - event ignored");
            return;
        }
        if (H6.l.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(StringUtils.SPACE);
            sb2.append(string);
            H6.l.a(sb2.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                H6.l.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchuVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                H6.l.f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                H6.l.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchuVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                H6.l.f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                H6.l.f("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzchuVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, G6.J.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzchuVar.zze("onVideoEvent", map4);
            return;
        }
        zzchj zzchjVarZzdm = zzchuVar.zzdm();
        if (zzchjVarZzdm == null) {
            H6.l.f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzchuVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, -1);
            zzbio zzbioVar = zzbix.zzeT;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzchuVar.zzy() : Math.min(iZzb3, zzchuVar.zzy());
            } else {
                if (G6.L.m()) {
                    int iZzy = zzchuVar.zzy();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb).length() + AbstractC0279p0.g(String.valueOf(iZzb3).length() + 72, 4, String.valueOf(iZzy)) + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iZzb3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iZzy);
                    sb3.append(", x ");
                    sb3.append(iZzb);
                    sb3.append(".");
                    G6.L.k(sb3.toString());
                }
                iMin = Math.min(iZzb3, zzchuVar.zzy() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzchuVar.zzx() : Math.min(iZzb4, zzchuVar.zzx());
            } else {
                if (G6.L.m()) {
                    int iZzx = zzchuVar.zzx();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb2).length() + AbstractC0279p0.g(String.valueOf(iZzb4).length() + 75, 4, String.valueOf(iZzx)) + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iZzb4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iZzx);
                    sb4.append(", y ");
                    sb4.append(iZzb2);
                    sb4.append(".");
                    G6.L.k(sb4.toString());
                }
                iMin2 = Math.min(iZzb4, zzchuVar.zzx() - iZzb2);
            }
            int i13 = iMin2;
            try {
                i5 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i5 = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzchjVarZzdm.zzd() != null) {
                zzchjVarZzdm.zzb(iZzb, iZzb2, iMin, i13);
                return;
            }
            zzchjVarZzdm.zzc(iZzb, iZzb2, iMin, i13, i5, z2, new zzcht((String) map.get("flags")));
            zzchi zzchiVarZzd = zzchjVarZzdm.zzd();
            if (zzchiVarZzd != null) {
                zzc(zzchiVarZzd, map);
                return;
            }
            return;
        }
        zzcmh zzcmhVarZzh = zzchuVar.zzh();
        if (zzcmhVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    H6.l.f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcmhVarZzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    H6.l.f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcmhVarZzh.zzr();
                return;
            }
        }
        zzchi zzchiVarZzd2 = zzchjVarZzdm.zzd();
        if (zzchiVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzchuVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzchuVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzchiVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                H6.l.f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzchiVarZzd2.zzt((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                H6.l.f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzchiVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzchiVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzchiVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzchiVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzchiVarZzd2.zzu();
                return;
            } else {
                zzchiVarZzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzchiVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzchiVarZzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzchiVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzchuVar.getContext();
                zzchiVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzchuVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzchiVarZzd2.zzD();
                    return;
                } else {
                    H6.l.f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                H6.l.f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzchiVarZzd2.zzw(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                H6.l.f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcR)).booleanValue() && TextUtils.isEmpty(str9)) {
            H6.l.f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i10 = 1;
            } catch (NumberFormatException unused7) {
                H6.l.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        } else {
            i10 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i10];
        strArr[0] = str9;
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                    String string2 = jSONArray.getString(i14);
                    if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcR)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcR)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb5 = new StringBuilder(str10.length() + 41);
                    sb5.append("All demuxed URLs are empty for playback: ");
                    sb5.append(str10);
                    H6.l.f(sb5.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                H6.l.f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzchuVar.zzo(numValueOf.intValue());
        }
        zzchiVarZzd2.zzo(str9, strArr);
    }
}
