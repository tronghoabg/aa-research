package Qa;

import Ma.d;
import Ma.j;
import N.O0;
import Oa.g;
import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9929a;

    /* renamed from: c, reason: collision with root package name */
    public Ma.a f9931c;

    /* renamed from: e, reason: collision with root package name */
    public long f9933e = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f9932d = 1;

    /* renamed from: b, reason: collision with root package name */
    public O0 f9930b = new O0(null);

    public a(String str) {
        this.f9929a = str;
    }

    public void a(j jVar, d dVar) {
        b(jVar, dVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Ma.j r10, Ma.d r11, org.json.JSONObject r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa.a.b(Ma.j, Ma.d, org.json.JSONObject):void");
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Ra.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        g.f8938a.a(e(), "setLastActivity", jSONObject);
    }

    public void d() {
        this.f9930b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.f9930b.get();
    }

    public void f() {
    }
}
