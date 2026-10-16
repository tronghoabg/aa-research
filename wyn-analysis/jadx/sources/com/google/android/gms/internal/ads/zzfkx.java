package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.AbstractC3598c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfkx {
    public final List zza;
    public final zzfkq zzb;
    public final List zzc;
    public final Bundle zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfkx(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && bundle != null) {
            String strZza = zzdzc.SERVER_RESPONSE_PARSE_START.zza();
            C6.n.f1857D.k.getClass();
            bundle.putLong(strZza, System.currentTimeMillis());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfkq zzfkqVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfkn(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfkqVar = new zzfkq(jsonReader);
                        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcT)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdzc.NORMALIZATION_AD_RESPONSE_START.zza(), zzfkqVar.zzs);
                            bundle.putLong(zzdzc.NORMALIZATION_AD_RESPONSE_END.zza(), zzfkqVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectY = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (MediationMetaData.KEY_NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectY = Fe.e.Y(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfkw(strNextString, jSONObjectY));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfkqVar == null ? new zzfkq(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfkqVar;
    }

    public static zzfkx zza(Reader reader, Bundle bundle) throws zzfkr {
        try {
            try {
                return new zzfkx(new JsonReader(reader), bundle);
            } finally {
                AbstractC3598c.d(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e7) {
            throw new zzfkr("unable to parse ServerResponse", e7);
        }
    }
}
