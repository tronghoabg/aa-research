package com.waze.config;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.view.title.TitleBar;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class DebugConfigListActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22515f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final List f22516g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private dg f22517h;

    public DebugConfigListActivity() {
        ConfigManager.getInstance();
    }

    static /* bridge */ /* synthetic */ void m(DebugConfigListActivity debugConfigListActivity, String str) {
        cv cvVar = new cv(p(str), 0);
        List list = debugConfigListActivity.f22516g;
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(cvVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) cvVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        dg.a(debugConfigListActivity.f22517h, arrayList);
    }

    static /* bridge */ /* synthetic */ boolean o(f fVar) {
        return fVar.h().equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    private static String p(String str) {
        return str.toLowerCase().replace("_", "$").replace(" ", "$").replace("-", "$").replace(".", "$");
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.debug_config_list_activity);
        List list = this.f22516g;
        list.clear();
        Iterator it = cu.f22590a.iterator();
        while (it.hasNext()) {
            list.add((f) it.next());
        }
        List.EL.sort(list, new com.google.firebase.crashlytics.a.c.h(13));
        TitleBar titleBar = (TitleBar) findViewById(R.id.debugConfigListTitleBar);
        titleBar.p("Waze Configs");
        titleBar.n(new com.google.android.material.datepicker.ac(this, 6));
        titleBar.m(new com.google.android.material.datepicker.ac(this, 7));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.debugConfigListRecyclerView);
        dg dgVar = new dg(this, list);
        this.f22517h = dgVar;
        recyclerView.ak(dgVar);
        recyclerView.al(new LinearLayoutManager());
        recyclerView.aF(new cw(this));
        View viewFindViewById = findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new cx(this, viewFindViewById, recyclerView));
        EditText editText = (EditText) findViewById(R.id.debugConfigListSearchBar);
        editText.addTextChangedListener(new cy(this));
        editText.requestFocus();
        com.waze.ui.x.u.k(this, editText);
    }
}
