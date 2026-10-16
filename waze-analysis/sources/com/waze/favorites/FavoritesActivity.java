package com.waze.favorites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.an.c.w;
import com.waze.dg;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.favorites.Favorites;
import com.waze.modules.navigation.ah;
import com.waze.modules.navigation.ai;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.bp;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.ui.z.as;
import com.waze.view.title.TitleBar;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class FavoritesActivity extends com.waze.favorites.a.a implements com.waze.jni.a<Favorites> {

    /* renamed from: g, reason: collision with root package name */
    private TitleBar f23783g;

    /* renamed from: k, reason: collision with root package name */
    private RecyclerView f23785k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23786l;
    private View m;
    private a n;

    /* renamed from: h, reason: collision with root package name */
    private final h.a.u f23784h = new h.a.u();
    private final com.waze.shared_infra.o.a o = com.waze.shared_infra.o.b.a();
    private com.waze.bt.e p = com.waze.bt.e.f17462a;
    private ah q = ah.f30286b;

    public static /* synthetic */ void A(FavoritesActivity favoritesActivity) {
        boolean z = favoritesActivity.f23786l;
        favoritesActivity.f23786l = !z;
        if (z) {
            com.waze.shared_infra.i.h.a("FavoritesActivity: Edit done, syncing order");
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).editFavoritesDone();
        } else {
            com.waze.search.stats.s.f36105a.a().g(com.waze.search.stats.h.f36037b, com.waze.search.stats.i.f36041a);
        }
        if (favoritesActivity.f23786l) {
            favoritesActivity.f23784h.removeFirst();
            favoritesActivity.f23785k.j().notifyItemRemoved(0);
        } else {
            favoritesActivity.f23784h.addFirst(c.f23798a);
            favoritesActivity.f23785k.j().notifyItemInserted(0);
        }
        favoritesActivity.f23783g.i(favoritesActivity.o.c(true != favoritesActivity.f23786l ? R.string.EDIT : R.string.DONE, new Object[0]));
        for (int i2 = 0; i2 < favoritesActivity.f23785k.getChildCount(); i2++) {
            if (favoritesActivity.f23785k.getChildAt(i2) instanceof com.waze.menus.h) {
                throw null;
            }
        }
        favoritesActivity.aG(new com.google.android.material.internal.o(favoritesActivity, 18), 500L);
    }

    public final void B(boolean z, w wVar) {
        setResult(-1, com.waze.realtime_report_feedback.e.d(z, wVar.f()));
        finish();
    }

    @Override // com.waze.jni.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Favorites favorites = (Favorites) obj;
        setResult(-6);
        h.a.u uVar = this.f23784h;
        uVar.clear();
        if (!this.f23786l) {
            uVar.add(c.f23798a);
        }
        Iterator<Favorite> it = favorites.getFavoritesList().iterator();
        while (it.hasNext()) {
            uVar.add(new a(new w(it.next())));
        }
        if (this.f23785k.j() != null) {
            this.f23785k.j().notifyDataSetChanged();
        }
        this.f23783g.l(favorites.getFavoritesCount() >= 2);
    }

    @Override // com.waze.navigate.h, com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 5000 || i3 != -1) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.waze.search.stats.s.f36105a.a().g(com.waze.search.stats.h.f36036a, com.waze.search.stats.i.f36041a);
        super.onBackPressed();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.favorites_activity_layout);
        if (bundle != null) {
            this.f23786l = bundle.getBoolean("edit_mode", false);
        }
        if (getIntent().hasExtra("mode")) {
            this.p = (com.waze.bt.e) getIntent().getSerializableExtra("mode");
        }
        String stringExtra = getIntent().getStringExtra("caller");
        if (stringExtra != null) {
            this.q = ah.a(stringExtra);
        }
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        this.f23783g = titleBar;
        com.waze.shared_infra.o.a aVar = this.o;
        titleBar.c(aVar.c(R.string.FAVORITES_ACTIVITY_TITLE, new Object[0]));
        this.f23783g.i(aVar.c(true != this.f23786l ? R.string.FAVORITES_SCREEN_EDIT : R.string.DONE, new Object[0]));
        this.f23783g.n(new com.waze.design_components.c.e(this, 4));
        this.f23783g.m(new com.waze.design_components.c.e(this, 5));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.favoritesRecycler);
        this.f23785k = recyclerView;
        if (recyclerView.isInEditMode()) {
            as.j(getResources());
        }
        this.f23785k.al(new LinearLayoutManager());
        this.f23785k.ak(new h(this));
        new android.support.v7.widget.a.j(new e(this)).b(this.f23785k);
        y();
        com.waze.shared_infra.g.e.d((ViewGroup) findViewById(R.id.favoriteRelativeLayout), this.f23785k);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onResume() {
        super.onResume();
        y();
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("edit_mode", this.f23786l);
    }

    @Override // com.waze.navigate.h
    protected final ah q() {
        return this.q;
    }

    public final void x(AddressItem addressItem) {
        com.waze.ae.e.a(((bp) com.waze.web.r.h(bp.class)).b(new ao(this.q, new ai(addressItem))).a(), getLifecycle(), new dg(this, 1));
    }

    @Override // com.waze.navigate.h
    protected final void y() {
        ((k) com.waze.web.r.h(k.class)).a(this);
    }
}
