package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfkq {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfkp zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfkq(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listX = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        zzfkp zzfkpVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listX = Fe.e.X(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                zzbio zzbioVar = zzbix.zzjH;
                String str = strNextString3;
                C0395s c0395s = C0395s.f2489e;
                JSONObject jSONObject3 = jSONObject2;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfkpVar = new zzfkp(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    zzbio zzbioVar2 = zzbix.zzma;
                    zzbiv zzbivVar = c0395s.f2492c;
                    if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzbivVar.zzd(zzbix.zzhQ)).booleanValue()) {
                            try {
                                Bundle bundleD0 = Fe.e.d0(Fe.e.Y(jsonReader));
                                if (bundleD0 != null) {
                                    bundle = bundleD0;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzbivVar.zzd(zzbix.zzkO)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(strNextName)) {
                        zzbio zzbioVar3 = zzbix.zzkP;
                        if (((Boolean) zzbivVar.zzd(zzbioVar3)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) zzbivVar.zzd(zzbioVar3)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = Fe.e.Y(jsonReader);
                        } else {
                            if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbivVar.zzd(zzbix.zzkX)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = Fe.e.Y(jsonReader);
                                strNextString3 = str;
                            } else if (((Boolean) zzbivVar.zzd(zzbix.zzcT)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                try {
                                    Bundle bundleD02 = Fe.e.d0(Fe.e.Y(jsonReader));
                                    if (bundleD02 != null) {
                                        jZza2 = zza(bundleD02.getDouble("start_time"));
                                        jZza = zza(bundleD02.getDouble("end_time"));
                                    }
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            strNextString3 = str;
                            jSONObject2 = jSONObject3;
                        }
                    } else if (((Boolean) zzbivVar.zzd(zzbix.zzkO)).booleanValue()) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    strNextString3 = str;
                    jSONObject2 = jSONObject3;
                }
                strNextString3 = str;
                jSONObject2 = jSONObject3;
            }
        }
        JSONObject jSONObject4 = jSONObject2;
        String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listX;
        this.zzc = iNextInt;
        if (((Boolean) zzbld.zze.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbkh zzbkhVar = zzbkl.zza;
            if (((Long) zzbkhVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbkhVar.zze()).intValue();
            } else {
                this.zzd = iNextInt3;
            }
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzfkpVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject4;
        this.zzq = str2;
        zzbkh zzbkhVar2 = zzblb.zza;
        this.zzr = ((Long) zzbkhVar2.zze()).longValue() > 0 ? ((Long) zzbkhVar2.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d3) {
        if (d3 > 9.223372036854776E18d || d3 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d3;
    }
}
