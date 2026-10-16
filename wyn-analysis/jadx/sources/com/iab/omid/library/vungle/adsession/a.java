package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f28086a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f28087b;

    /* renamed from: c, reason: collision with root package name */
    private final f f28088c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f28089d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f28090e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28091f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28092g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28093h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28094i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28095j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f28094i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f28095j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f28092g) {
            return;
        }
        this.f28088c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f28093h;
    }

    public AdSessionStatePublisher d() {
        return this.f28090e;
    }

    public View e() {
        return this.f28089d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f28092g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f28088c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f28092g) {
            return;
        }
        this.f28089d.clear();
        removeAllFriendlyObstructions();
        this.f28092g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f28090e = null;
        this.k = null;
    }

    public boolean g() {
        return this.k != null;
    }

    public boolean h() {
        return this.f28091f && !this.f28092g;
    }

    public boolean i() {
        return this.f28092g;
    }

    public boolean j() {
        return this.f28087b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f28087b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f28091f;
    }

    public void m() {
        a();
        d().g();
        this.f28094i = true;
    }

    public void n() {
        b();
        d().h();
        this.f28095j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f28092g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f28092g) {
            return;
        }
        this.f28088c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f28092g) {
            return;
        }
        this.f28088c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f28091f || this.f28090e == null) {
            return;
        }
        this.f28091f = true;
        c.c().c(this);
        this.f28090e.a(i.c().b());
        this.f28090e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f28090e.b(com.iab.omid.library.vungle.attestation.c.a(com.iab.omid.library.vungle.internal.g.b().a()).a());
        this.f28090e.a(this, this.f28086a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f28088c = new f();
        this.f28091f = false;
        this.f28092g = false;
        this.f28087b = adSessionConfiguration;
        this.f28086a = adSessionContext;
        this.f28093h = str;
        b(null);
        this.f28090e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f28090e.i();
        c.c().a(this);
        this.f28090e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f28089d.clear();
            }
        }
    }

    private void b(View view) {
        this.f28089d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f28093h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().b(jSONObject);
        this.f28095j = true;
    }
}
