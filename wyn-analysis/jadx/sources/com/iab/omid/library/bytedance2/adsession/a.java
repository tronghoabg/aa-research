package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f27959a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f27960b;

    /* renamed from: c, reason: collision with root package name */
    private final f f27961c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f27962d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f27963e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27964f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27965g;

    /* renamed from: h, reason: collision with root package name */
    private final String f27966h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27967i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27968j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f27967i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f27968j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f27965g) {
            return;
        }
        this.f27961c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f27962d.get();
    }

    public List<e> d() {
        return this.f27961c.a();
    }

    public boolean e() {
        return this.k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f27965g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f27964f && !this.f27965g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f27965g) {
            return;
        }
        this.f27962d.clear();
        removeAllFriendlyObstructions();
        this.f27965g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f27963e = null;
        this.k = null;
    }

    public boolean g() {
        return this.f27965g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f27966h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f27963e;
    }

    public boolean h() {
        return this.f27960b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f27960b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f27964f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f27967i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f27968j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f27965g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f27965g) {
            return;
        }
        this.f27961c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f27965g) {
            return;
        }
        this.f27961c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f27964f) {
            return;
        }
        this.f27964f = true;
        c.c().c(this);
        this.f27963e.a(i.c().b());
        this.f27963e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f27963e.a(this, this.f27959a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f27961c = new f();
        this.f27964f = false;
        this.f27965g = false;
        this.f27960b = adSessionConfiguration;
        this.f27959a = adSessionContext;
        this.f27966h = str;
        b(null);
        this.f27963e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f27963e.i();
        c.c().a(this);
        this.f27963e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f27962d.clear();
            }
        }
    }

    private void b(View view) {
        this.f27962d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f27966h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f27968j = true;
    }
}
