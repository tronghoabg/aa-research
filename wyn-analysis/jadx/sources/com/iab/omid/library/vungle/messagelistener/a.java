package com.iab.omid.library.vungle.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.iab.omid.library.vungle.utils.i;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import x3.AbstractC4458a;
import x3.C4462e;
import x3.InterfaceC4466i;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final i f28174c = new i();

    /* renamed from: a, reason: collision with root package name */
    private final WebView f28175a;

    /* renamed from: b, reason: collision with root package name */
    private final b f28176b;

    /* renamed from: com.iab.omid.library.vungle.messagelistener.a$a, reason: collision with other inner class name */
    public class C0162a implements InterfaceC4466i {
        public C0162a() {
        }

        @Override // x3.InterfaceC4466i
        public void onPostMessage(WebView webView, C4462e c4462e, Uri uri, boolean z2, AbstractC4458a abstractC4458a) throws JSONException {
            a.this.a(c4462e.a());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.f28175a = webView;
        this.f28176b = bVar;
    }

    public void a() {
        try {
            if (!H.b0("WEB_MESSAGE_LISTENER")) {
                this.f28176b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                f28174c.a(this.f28175a, this.f28176b.getListenerName(), new HashSet(Arrays.asList("*")), new C0162a());
            } catch (Exception e7) {
                d.a("Error adding WebView listener", e7);
                this.f28176b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
            this.f28176b.onWebMessageListenerUnsupported();
        }
    }

    public void b() {
        f28174c.a(this.f28175a, this.f28176b.getListenerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f28176b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject(JsonStorageKeyNames.DATA_KEY));
        } catch (JSONException e7) {
            d.a("Error parsing JS message", e7);
        }
    }
}
