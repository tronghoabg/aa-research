package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes3.dex */
public class zzimu {
    final LinkedHashMap zza;

    public zzimu(int i5) {
        this.zza = zzimw.zzc(i5);
    }

    public final zzimu zza(Object obj, zzini zziniVar) {
        zzinh.zza(obj, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        zzinh.zza(zziniVar, "provider");
        this.zza.put(obj, zziniVar);
        return this;
    }
}
