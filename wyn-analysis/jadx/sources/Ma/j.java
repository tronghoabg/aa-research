package Ma;

import N.O0;
import android.app.ActivityManager;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class j extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f7606a;

    /* renamed from: b, reason: collision with root package name */
    public final c f7607b;

    /* renamed from: d, reason: collision with root package name */
    public O0 f7609d;

    /* renamed from: e, reason: collision with root package name */
    public Qa.a f7610e;

    /* renamed from: h, reason: collision with root package name */
    public final String f7613h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7614i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7615j;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7608c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7611f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7612g = false;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public j(c cVar, d dVar) throws JSONException {
        Qa.a bVar;
        this.f7607b = cVar;
        this.f7606a = dVar;
        String string = UUID.randomUUID().toString();
        this.f7613h = string;
        this.f7609d = new O0(null);
        e eVar = e.HTML;
        e eVar2 = dVar.f7579g;
        if (eVar2 == eVar || eVar2 == e.JAVASCRIPT) {
            bVar = new Qa.b(string);
            WebView webView = dVar.f7574b;
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            bVar.f9930b = new O0(webView);
        } else {
            bVar = new Qa.c(string, DesugarCollections.unmodifiableMap(dVar.f7576d));
        }
        this.f7610e = bVar;
        this.f7610e.f();
        Oa.c.f8930c.f8931a.add(this);
        Qa.a aVar = this.f7610e;
        Oa.g gVar = Oa.g.f8938a;
        WebView webViewE = aVar.e();
        JSONObject jSONObject = new JSONObject();
        Ra.b.b(jSONObject, "impressionOwner", cVar.f7568a);
        Ra.b.b(jSONObject, "mediaEventsOwner", cVar.f7569b);
        Ra.b.b(jSONObject, "creativeType", cVar.f7571d);
        Ra.b.b(jSONObject, "impressionType", cVar.f7572e);
        Ra.b.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cVar.f7570c));
        gVar.a(webViewE, "init", jSONObject, aVar.f9929a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ma.b
    public final void a(View view) {
        if (this.f7612g) {
            return;
        }
        AbstractC3935e.g(view, "AdView is null");
        if (((View) this.f7609d.get()) == view) {
            return;
        }
        this.f7609d = new O0(view);
        Qa.a aVar = this.f7610e;
        aVar.getClass();
        aVar.f9933e = System.nanoTime();
        aVar.f9932d = 1;
        Collection<j> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(Oa.c.f8930c.f8931a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (j jVar : collectionUnmodifiableCollection) {
            if (jVar != this && ((View) jVar.f7609d.get()) == view) {
                jVar.f7609d.clear();
            }
        }
    }

    @Override // Ma.b
    public final void b() {
        if (this.f7611f) {
            return;
        }
        this.f7611f = true;
        Oa.c cVar = Oa.c.f8930c;
        boolean z2 = cVar.f8932b.size() > 0;
        cVar.f8932b.add(this);
        if (!z2) {
            Oa.h hVarB = Oa.h.b();
            hVarB.getClass();
            Oa.b bVar = Oa.b.f8929d;
            bVar.f8935c = hVarB;
            bVar.f8933a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z10 = runningAppProcessInfo.importance == 100 || bVar.c();
            bVar.f8934b = z10;
            bVar.a(z10);
            Sa.a.f11037g.getClass();
            Sa.a.b();
            Na.a aVar = hVarB.f8942c;
            aVar.f8638e = aVar.a();
            aVar.b();
            aVar.f8634a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        float f10 = Oa.h.b().f8940a;
        Qa.a aVar2 = this.f7610e;
        Oa.g.f8938a.a(aVar2.e(), "setDeviceVolume", Float.valueOf(f10), aVar2.f9929a);
        Qa.a aVar3 = this.f7610e;
        Date date = Oa.a.f8923f.f8925b;
        aVar3.c(date != null ? (Date) date.clone() : null);
        this.f7610e.a(this, this.f7606a);
    }
}
