package com.waze;

import android.content.Intent;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.navigate.AddressItem;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class gd implements cr {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f24022a;

    /* renamed from: b, reason: collision with root package name */
    private final lm f24023b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.favorites.k f24024c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.google_assistant.ah f24025d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.navigate.eo f24026e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.google_assistant.aa f24027f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.modules.navigation.bp f24028g;

    public gd(kotlinx.coroutines.af afVar, lm lmVar, com.waze.favorites.k kVar, com.waze.google_assistant.ah ahVar, com.waze.navigate.eo eoVar, com.waze.google_assistant.aa aaVar, com.waze.modules.navigation.bp bpVar) {
        h.g.b.x.f(afVar, "lifecycleScope");
        h.g.b.x.f(lmVar, "wazeActivityManager");
        h.g.b.x.f(kVar, "favoritesManager");
        h.g.b.x.f(ahVar, "googleAssistantStatHelper");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(aaVar, "googleAssistantManager");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        this.f24022a = afVar;
        this.f24023b = lmVar;
        this.f24024c = kVar;
        this.f24025d = ahVar;
        this.f24026e = eoVar;
        this.f24027f = aaVar;
        this.f24028g = bpVar;
    }

    static final void j(gd gdVar, AddressItem addressItem) {
        gdVar.l(addressItem, true);
    }

    static final void k(gd gdVar, AddressItem addressItem) {
        gdVar.l(addressItem, false);
    }

    private final void l(AddressItem addressItem, boolean z) {
        if (addressItem != null) {
            kotlinx.coroutines.aj.z(this.f24022a, null, null, new gc(this.f24028g.b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.o, new com.waze.modules.navigation.ai(addressItem), null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5)).a(), z, this, null), 3);
            return;
        }
        this.f24025d.a(z ? com.waze.google_assistant.e.f24171j : com.waze.google_assistant.e.f24172k);
        lm lmVar = this.f24023b;
        if (lmVar.e() == null || this.f24026e.T()) {
            return;
        }
        Intent intent = new Intent(lmVar.e(), (Class<?>) AddHomeWorkActivity.class);
        intent.putExtra("AddressType", true != z ? 4 : 2);
        intent.putExtra("START_NAVIGATION_AFTER_ADDRESS_SET", true);
        com.waze.sharedui.a.e eVarE = lmVar.e();
        if (eVarE != null) {
            eVarE.startActivity(intent);
        }
    }

    @Override // com.waze.cr
    public final void c() {
        this.f24024c.b(new bb(this, 7));
    }

    @Override // com.waze.cr
    public final void d() {
        this.f24024c.c(new bb(this, 8));
    }

    @Override // com.waze.cr
    public final void e(String str, boolean z) {
        h.g.b.x.f(str, "query");
        com.waze.search.t tVar = new com.waze.search.t();
        tVar.g(h.n.o.ad(str, '+', ' '));
        com.waze.sharedui.a.e eVarE = this.f24023b.e();
        if (eVarE != null) {
            Intent flags = tVar.a(eVarE).setFlags(67108864);
            h.g.b.x.e(flags, "setFlags(...)");
            eVarE.startActivityForResult(flags, 1);
        }
        this.f24025d.a(com.waze.google_assistant.e.f24170i);
    }

    @Override // com.waze.cr
    public final boolean f() {
        return this.f24027f.F();
    }

    @Override // com.waze.cr
    public final boolean g() {
        return false;
    }
}
