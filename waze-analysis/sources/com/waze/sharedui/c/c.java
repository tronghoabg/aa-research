package com.waze.sharedui.c;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import com.waze.shared_infra.i.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.shared_infra.f.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f38848a = {"url", GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE, "uuid", "token", "source", NotificationCompat.CATEGORY_STATUS};

    /* renamed from: b, reason: collision with root package name */
    private final Uri f38849b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38850c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f38851d = new HashMap(8);

    public c(Uri uri) {
        this.f38849b = uri;
        String queryParameter = uri.getQueryParameter(CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        this.f38850c = queryParameter;
        h.b("IntentUrlHelper", String.format("received action=%s, full query: %s", queryParameter, uri.getQuery()));
        uri.getQueryParameter(TtmlNode.ATTR_ID);
        uri.getQueryParameter(TtmlNode.ATTR_TTS_ORIGIN);
        uri.getQueryParameter("result");
        if (uri.getQueryParameter("show_activation_screen") != null) {
            h.k("IntentUrlHelper", "ignoring obsolete activation screen parameter");
        }
        String[] strArr = f38848a;
        for (int i2 = 0; i2 < 6; i2++) {
            String str = strArr[i2];
            String queryParameter2 = uri.getQueryParameter(str);
            if (queryParameter2 != null) {
                this.f38851d.put(str, queryParameter2);
            }
        }
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter3 = uri.getQueryParameter(str2);
            if (queryParameter3 != null) {
                this.f38851d.put(str2, queryParameter3);
            }
        }
    }

    public static c e(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new c(uri);
        } catch (Exception e2) {
            h.l("IntentUrlHelper", "failed to create IntentUrlHelper", e2);
            return null;
        }
    }

    @Override // com.waze.shared_infra.f.a
    public final String a() {
        return this.f38850c;
    }

    @Override // com.waze.shared_infra.f.a
    public final String b(String str) {
        return (String) this.f38851d.get(str);
    }

    @Override // com.waze.shared_infra.f.a
    public final /* bridge */ /* synthetic */ Map c() {
        HashMap map = new HashMap(this.f38851d);
        map.remove(CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        return map;
    }

    public final Uri d() {
        return this.f38849b;
    }
}
