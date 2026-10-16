package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f27826a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f27827b;

    /* renamed from: c, reason: collision with root package name */
    private final f f27828c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f27829d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f27830e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27831f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27832g;

    /* renamed from: h, reason: collision with root package name */
    private final String f27833h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27834i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27835j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f27834i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f27835j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f27832g) {
            return;
        }
        this.f27828c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f27833h;
    }

    public AdSessionStatePublisher d() {
        return this.f27830e;
    }

    public View e() {
        return this.f27829d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f27832g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f27828c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f27832g) {
            return;
        }
        this.f27829d.clear();
        removeAllFriendlyObstructions();
        this.f27832g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f27830e = null;
        this.k = null;
    }

    public boolean g() {
        return this.k != null;
    }

    public boolean h() {
        return this.f27831f && !this.f27832g;
    }

    public boolean i() {
        return this.f27832g;
    }

    public boolean j() {
        return this.f27827b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f27827b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f27831f;
    }

    public void m() {
        a();
        d().g();
        this.f27834i = true;
    }

    public void n() {
        b();
        d().h();
        this.f27835j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f27832g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f27832g) {
            return;
        }
        this.f27828c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f27832g) {
            return;
        }
        this.f27828c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f27831f || this.f27830e == null) {
            return;
        }
        this.f27831f = true;
        c.c().c(this);
        this.f27830e.a(i.c().b());
        this.f27830e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f27830e.a(this, this.f27826a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f27828c = new f();
        this.f27831f = false;
        this.f27832g = false;
        this.f27827b = adSessionConfiguration;
        this.f27826a = adSessionContext;
        this.f27833h = str;
        b(null);
        this.f27830e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f27830e.i();
        c.c().a(this);
        this.f27830e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f27829d.clear();
            }
        }
    }

    private void b(View view) {
        this.f27829d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f27833h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f27835j = true;
    }
}
