package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final /* synthetic */ class zzbul implements zzbuh {
    static final /* synthetic */ zzbul zza = new zzbul();

    private /* synthetic */ zzbul() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuh
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
