package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzeax {
    public final long zza;
    public final int[] zzb;

    private zzeax(long j8, int[] iArr) {
        this.zza = j8;
        this.zzb = iArr;
    }

    public static zzgwt zza(JsonReader jsonReader) throws IOException {
        int i5 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgwt zzgwtVarZzi = zzgwt.zzi();
            jsonReader.beginObject();
            zzeax zzeaxVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgwq zzgwqVar2 = new zzgwq();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgwqVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgwtVarZzi = zzgwqVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgwtVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgwtVarZzi.size()];
                for (int i10 = 0; i10 < zzgwtVarZzi.size(); i10++) {
                    iArr[i10] = ((Integer) zzgwtVarZzi.get(i10)).intValue();
                }
                zzeaxVar = new zzeax(jLongValue, iArr);
            }
            if (zzeaxVar != null) {
                zzgwqVar.zzf(zzeaxVar);
            }
        }
        jsonReader.endArray();
        return zzgwqVar.zzi();
    }
}
