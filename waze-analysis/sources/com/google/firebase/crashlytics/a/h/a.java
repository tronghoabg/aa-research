package com.google.firebase.crashlytics.a.h;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.internal.u;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9734a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.i f9735b;

    public a(String str) {
        com.google.firebase.crashlytics.a.i iVarA = com.google.firebase.crashlytics.a.i.a();
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f9735b = iVarA;
        this.f9734a = str;
    }

    private static final void b(com.google.android.libraries.phenotype.client.stable.j jVar, String str, String str2) {
        if (str2 != null) {
            jVar.e(str, str2);
        }
    }

    public final JSONObject a(i iVar) throws Throwable {
        try {
            HashMap map = new HashMap();
            map.put("build_version", iVar.f9762h);
            map.put("display_version", iVar.f9761g);
            map.put("source", Integer.toString(iVar.f9763i));
            String str = iVar.f9760f;
            if (!TextUtils.isEmpty(str)) {
                map.put("instance", str);
            }
            String str2 = this.f9734a;
            com.google.android.libraries.phenotype.client.stable.j jVar = new com.google.android.libraries.phenotype.client.stable.j(str2, map);
            jVar.e("User-Agent", "Crashlytics Android SDK/19.0.4_1p");
            jVar.e("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            b(jVar, "X-CRASHLYTICS-GOOGLE-APP-ID", iVar.f9755a);
            b(jVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            b(jVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.4_1p");
            b(jVar, "Accept", "application/json");
            b(jVar, "X-CRASHLYTICS-DEVICE-MODEL", iVar.f9756b);
            b(jVar, "X-CRASHLYTICS-OS-BUILD-VERSION", iVar.f9757c);
            b(jVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", iVar.f9758d);
            b(jVar, "X-CRASHLYTICS-INSTALLATION-ID", iVar.f9759e.b().b());
            com.google.firebase.crashlytics.a.i iVar2 = this.f9735b;
            iVar2.b("Requesting settings from " + str2);
            iVar2.g("Settings query params were: " + map.toString());
            u uVarI = jVar.i();
            int iC = uVarI.c();
            iVar2.g("Settings response code was: " + iC);
            if (iC != 200 && iC != 201 && iC != 202 && iC != 203) {
                iVar2.d("Settings request failed; (status: " + iC + ") from " + str2);
                return null;
            }
            String strD = uVarI.d();
            try {
                return new JSONObject(strD);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.a.i iVar3 = this.f9735b;
                iVar3.i("Failed to parse settings JSON from ".concat(this.f9734a), e2);
                iVar3.h("Settings response ".concat(String.valueOf(strD)));
                return null;
            }
        } catch (IOException e3) {
            this.f9735b.e("Settings request failed.", e3);
        }
    }
}
