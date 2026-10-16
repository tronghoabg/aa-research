package com.waze.push;

import android.location.Location;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.z;
import com.waze.OfflineNativeManager;
import com.waze.gas.GasNativeManager;
import com.waze.location.bg;
import com.waze.messages.PushQuestionData;
import com.waze.mg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33428a;

    /* renamed from: b, reason: collision with root package name */
    private final k f33429b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33430c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.x.h f33431d;

    /* renamed from: e, reason: collision with root package name */
    private final z f33432e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33433f;

    g(z zVar, boolean z) {
        Location locationD;
        Map map = zVar.a() == null ? new HashMap() : zVar.a();
        this.f33428a = map;
        String str = (String) map.get(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        k kVar = null;
        if (str != null) {
            this.f33430c = str.replaceAll("\\|", "\\^");
        } else {
            this.f33430c = null;
        }
        String str2 = (String) map.get("WazeUrl");
        if (str2 != null) {
            this.f33431d = com.waze.x.h.c(str2);
        } else {
            this.f33431d = null;
        }
        if (B() && OfflineNativeManager.getInstance().getBackgroundLocationEnabled() && (locationD = bg.d(mg.a())) != null) {
            PushQuestionData pushQuestionDataHandleCommandForPush = OfflineNativeManager.getInstance().HandleCommandForPush(e(), bg.b(locationD.getLongitude()), bg.b(locationD.getLatitude()), 0);
            if (pushQuestionDataHandleCommandForPush != null) {
                kVar = new k(pushQuestionDataHandleCommandForPush);
            }
        }
        this.f33429b = kVar;
        this.f33432e = zVar;
        this.f33433f = z;
    }

    final boolean A() {
        com.waze.x.h hVar = this.f33431d;
        if (hVar != null) {
            return com.waze.x.b.a(hVar.a().getQueryParameter(com.waze.x.c.ACTION.a())) == com.waze.x.b.SEND_LOCATION;
        }
        return false;
    }

    final boolean B() {
        return !TextUtils.isEmpty(e());
    }

    final boolean C() {
        String str = (String) this.f33428a.get("show");
        return (CredentialEntry.FALSE_STRING.equals(str) || "0".equals(str)) ? false : true;
    }

    final z a() {
        return this.f33432e;
    }

    final com.waze.x.h b() {
        return this.f33431d;
    }

    final com.waze.x.h c() {
        if (!B()) {
            return this.f33431d;
        }
        if (z()) {
            return this.f33429b.a();
        }
        return null;
    }

    final String d() {
        return (String) this.f33428a.get("actions");
    }

    final String e() {
        return (String) this.f33428a.get("constructionInstructions");
    }

    final String f() {
        return (String) this.f33428a.get("icon");
    }

    final String g() {
        return (String) this.f33428a.get("alert");
    }

    final String h() {
        return (String) this.f33428a.get("WazeOnlineUrl");
    }

    final String i() {
        return (String) this.f33428a.get("sound");
    }

    final String j() {
        return (String) this.f33428a.get(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
    }

    final String k() {
        return this.f33430c;
    }

    final String l() {
        return (String) this.f33428a.get("feedback_buttons");
    }

    final String m() {
        if (z()) {
            return this.f33429b.b();
        }
        return null;
    }

    final String n() {
        if (z()) {
            return this.f33429b.c();
        }
        return null;
    }

    final String o() {
        if (z()) {
            return this.f33429b.e();
        }
        return null;
    }

    final String p() {
        return !TextUtils.isEmpty(g()) ? g() : t();
    }

    final String q() {
        if (z()) {
            return this.f33429b.d();
        }
        return null;
    }

    final String r() {
        if (z()) {
            return this.f33429b.g();
        }
        return null;
    }

    final String s() {
        if (z()) {
            return this.f33429b.h();
        }
        return null;
    }

    final String t() {
        if (z()) {
            return this.f33429b.i();
        }
        return null;
    }

    public final String toString() {
        com.waze.x.h hVar = this.f33431d;
        k kVar = this.f33429b;
        return "PushMessage{, alertType='" + this.f33430c + "'data=" + String.valueOf(this.f33428a) + ", questionData=" + String.valueOf(kVar) + ", alertDeepLink=" + String.valueOf(hVar) + "}";
    }

    final String u() {
        return !TextUtils.isEmpty(j()) ? j() : "Waze";
    }

    final String v() {
        return (String) this.f33428a.get("inboxDataToken");
    }

    final String w() {
        if (z()) {
            return this.f33429b.f();
        }
        return null;
    }

    final boolean x() {
        return this.f33433f;
    }

    final boolean y() {
        return this.f33428a.size() > 0;
    }

    final boolean z() {
        return this.f33429b != null;
    }

    g(z zVar) {
        this(zVar, true);
    }
}
