package okhttp3;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private ab f55881a;

    /* renamed from: b, reason: collision with root package name */
    private String f55882b;

    /* renamed from: c, reason: collision with root package name */
    private ao f55883c;

    /* renamed from: d, reason: collision with root package name */
    private Map f55884d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.shared_infra.coordinators.c f55885e;

    public ak(al alVar) {
        h.g.b.x.f(alVar, "request");
        this.f55884d = new LinkedHashMap();
        this.f55881a = alVar.g();
        this.f55882b = alVar.c();
        this.f55883c = alVar.h();
        this.f55884d = alVar.d().isEmpty() ? new LinkedHashMap() : h.a.r.t(alVar.d());
        this.f55885e = alVar.f().f();
    }

    public final ak a(String str, String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "value");
        this.f55885e.l(str, str2);
        return this;
    }

    public final ak b() {
        return e(ShareTarget.METHOD_GET, null);
    }

    public final ak c(String str, String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "value");
        this.f55885e.j(str, str2);
        return this;
    }

    public final ak d(z zVar) {
        h.g.b.x.f(zVar, "headers");
        this.f55885e = zVar.f();
        return this;
    }

    public final ak e(String str, ao aoVar) {
        h.g.b.x.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (aoVar == null) {
            h.g.b.x.f(str, "method");
            if (h.g.b.x.n(str, ShareTarget.METHOD_POST) || h.g.b.x.n(str, "PUT") || h.g.b.x.n(str, "PATCH") || h.g.b.x.n(str, "PROPPATCH") || h.g.b.x.n(str, "REPORT")) {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        } else if (!com.waze.view.popups.b.b.h(str)) {
            throw new IllegalArgumentException("method " + str + " must not have a request body.");
        }
        this.f55882b = str;
        this.f55883c = aoVar;
        return this;
    }

    public final ak f(ao aoVar) {
        h.g.b.x.f(aoVar, TtmlNode.TAG_BODY);
        return e(ShareTarget.METHOD_POST, aoVar);
    }

    public final ak g(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f55885e.m(str);
        return this;
    }

    public final ak h(Class cls, Object obj) {
        h.g.b.x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        Map map = this.f55884d;
        if (obj == null) {
            map.remove(cls);
            return this;
        }
        if (map.isEmpty()) {
            this.f55884d = new LinkedHashMap();
        }
        Map map2 = this.f55884d;
        Object objCast = cls.cast(obj);
        h.g.b.x.c(objCast);
        map2.put(cls, objCast);
        return this;
    }

    public final ak i(String str) {
        h.g.b.x.f(str, "url");
        if (h.n.o.o(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            h.g.b.x.e(strSubstring, "substring(...)");
            str = "http:".concat(String.valueOf(strSubstring));
        } else if (h.n.o.o(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            h.g.b.x.e(strSubstring2, "substring(...)");
            str = "https:".concat(String.valueOf(strSubstring2));
        }
        int i2 = ab.f55817a;
        return j(kotlinx.b.a.b.C(str));
    }

    public final ak j(ab abVar) {
        h.g.b.x.f(abVar, "url");
        this.f55881a = abVar;
        return this;
    }

    public final al k() {
        Map mapUnmodifiableMap;
        ab abVar = this.f55881a;
        if (abVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f55882b;
        z zVarH = this.f55885e.h();
        ao aoVar = this.f55883c;
        Map map = this.f55884d;
        byte[] bArr = okhttp3.internal.b.f55955a;
        h.g.b.x.f(map, "<this>");
        if (map.isEmpty()) {
            mapUnmodifiableMap = h.a.r.j();
        } else {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
            h.g.b.x.c(mapUnmodifiableMap);
        }
        return new al(abVar, str, zVarH, aoVar, mapUnmodifiableMap);
    }

    public ak() {
        this.f55884d = new LinkedHashMap();
        this.f55882b = ShareTarget.METHOD_GET;
        this.f55885e = new com.waze.shared_infra.coordinators.c((byte[]) null);
    }
}
