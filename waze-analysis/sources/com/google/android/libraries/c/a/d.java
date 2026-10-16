package com.google.android.libraries.c.a;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.credentials.CustomCredential;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import h.k;
import h.n.o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends CustomCredential {

    /* renamed from: a, reason: collision with root package name */
    private final String f5802a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5803b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5804c;

    public d(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "idToken");
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f5802a = str;
        this.f5803b = str2;
        this.f5804c = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
        List listAf = o.af(str2, new String[]{"."}, 0, 6);
        if (listAf.size() != 3) {
            throw new IllegalArgumentException("Invalid token format");
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listAf.get(1), 8);
            x.c(bArrDecode);
            Charset charset = StandardCharsets.UTF_8;
            x.e(charset, "UTF_8");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
            String str7 = null;
            String str8 = strOptString.length() == 0 ? null : strOptString;
            String strOptString2 = jSONObject.optString("sub");
            if (strOptString2.length() != 0) {
                str7 = strOptString2;
            }
            String str9 = str7;
            if (str9 == null) {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
            k kVar = new k(str8, str9);
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String a() {
        return this.f5804c;
    }

    public final String b() {
        return this.f5802a;
    }

    public final String c() {
        return this.f5803b;
    }
}
