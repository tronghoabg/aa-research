package com.waze.navigate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.waze.R;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class HistoryActivity extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30924g = 0;

    /* renamed from: k, reason: collision with root package name */
    private RecyclerView f30926k;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.bt.e f30925h = com.waze.bt.e.f17462a;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.modules.navigation.ah f30927l = com.waze.modules.navigation.ah.f30287c;
    private final com.waze.shared_infra.o.a m = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ h.ab m(HistoryActivity historyActivity, AddressItem[] addressItemArr) {
        ArrayList arrayList = new ArrayList();
        for (AddressItem addressItem : addressItemArr) {
            if (addressItem.getType() == 8) {
                arrayList.add(addressItem);
            }
        }
        historyActivity.f30926k.ak(new cm(historyActivity, arrayList));
        return h.ab.f48028a;
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    public final void n(AddressItem addressItem) {
        ((com.waze.modules.navigation.bp) com.waze.web.r.h(com.waze.modules.navigation.bp.class)).b(new com.waze.modules.navigation.ao(this.f30927l, new com.waze.modules.navigation.ai(addressItem)).c(addressItem.getCategory().intValue() != 1));
    }

    public final void o(boolean z, AddressItem addressItem) {
        setResult(-1, com.waze.realtime_report_feedback.e.d(z, addressItem));
        finish();
    }

    @Override // com.waze.navigate.h, com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        cn cnVar;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 5000 && i3 == -1) {
            if (intent == null) {
                setResult(-1);
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("trip_overview_result_key");
            if ((stringExtra == null ? null : com.waze.trip_overview.j.a(stringExtra)) == com.waze.trip_overview.j.f41481b) {
                cnVar = cn.f31173b;
                finish();
            } else {
                cnVar = cn.f31172a;
            }
            setResult(-1, new Intent().putExtra("history_result_key", cnVar.name()));
            finish();
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.history);
        if (getIntent().hasExtra("mode")) {
            this.f30925h = (com.waze.bt.e) getIntent().getSerializableExtra("mode");
        }
        String stringExtra = getIntent().getStringExtra("caller");
        if (stringExtra != null) {
            this.f30927l = com.waze.modules.navigation.ah.a(stringExtra);
        }
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.c(this.m.c(R.string.HISTORY, new Object[0]));
        titleBar.m(new com.waze.main_screen.bottom_bars.a.a(this, 14));
        titleBar.n(new com.waze.main_screen.bottom_bars.a.a(this, 15));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.historyRecycler);
        this.f30926k = recyclerView;
        recyclerView.al(new LinearLayoutManager());
        y();
    }

    @Override // com.waze.navigate.h
    protected final com.waze.modules.navigation.ah q() {
        return this.f30927l;
    }

    @Override // com.waze.navigate.h
    protected final void y() {
        ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).getTopTenFavorites(new com.waze.car_lib.f.u(this, 14));
    }
}
