package com.waze;

import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.webkit.internal.AssetHelper;
import com.waze.gw.Gateway;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.bn f24932a;

    /* renamed from: b, reason: collision with root package name */
    private final jg f24933b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.stats.s f24934c;

    /* renamed from: d, reason: collision with root package name */
    private final ao f24935d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24936e;

    public jf(com.waze.search.bn bnVar, jg jgVar, com.waze.search.stats.s sVar, ao aoVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bnVar, "searchQueryBroadcaster");
        h.g.b.x.f(jgVar, "plainTextIntentManagerConfig");
        h.g.b.x.f(sVar, "searchStatsSender");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(eVar, "logger");
        this.f24932a = bnVar;
        this.f24933b = jgVar;
        this.f24934c = sVar;
        this.f24935d = aoVar;
        this.f24936e = eVar;
    }

    public final boolean a(Intent intent) {
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        if (!h.g.b.x.n(intent.getType(), AssetHelper.DEFAULT_MIME_TYPE)) {
            return false;
        }
        jg jgVar = this.f24933b;
        if (!jgVar.b()) {
            this.f24936e.a("share text FF is off");
            return true;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        intent.removeExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            this.f24936e.a("shared text is null");
            return true;
        }
        if (stringExtra.length() > jgVar.a()) {
            this.f24936e.a("shared text is too long, only last " + jgVar.a() + " characters are taken");
            int iA = jgVar.a();
            h.g.b.x.f(stringExtra, "<this>");
            if (iA < 0) {
                throw new IllegalArgumentException("Requested character count " + iA + " is less than zero.");
            }
            int length = stringExtra.length();
            stringExtra = stringExtra.substring(length - h.k.n.i(iA, length));
            h.g.b.x.e(stringExtra, "substring(...)");
        }
        String strU = com.waze.ad.c.b.u();
        String stringExtra2 = intent.getStringExtra("referrer");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f24934c.m(stringExtra.length(), strU, stringExtra2);
        if (this.f24935d.e() && !jgVar.c()) {
            this.f24936e.a("car is connected and in-car FF is off");
            return true;
        }
        Gateway.onSharedSearchText(stringExtra);
        this.f24932a.b(stringExtra, false, false, strU);
        this.f24936e.a("search query was sent with location: ".concat(String.valueOf(stringExtra)));
        return true;
    }
}
