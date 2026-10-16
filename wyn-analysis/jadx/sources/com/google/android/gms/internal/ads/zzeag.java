package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzeag {
    private final InterfaceC3596a zza;

    public zzeag(InterfaceC3596a interfaceC3596a) {
        this.zza = interfaceC3596a;
    }

    public final void zza(List list, String str, String str2, Object... objArr) throws IOException {
        if (((Boolean) zzbkz.zza.zze()).booleanValue()) {
            ((C3597b) this.zza).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    Object obj = objArr[i5];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e7) {
                int i10 = G6.L.f4523b;
                H6.l.d("unable to log", e7);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i11 = G6.L.f4523b;
            H6.l.e("AD-DBG ".concat(strValueOf));
        }
    }
}
