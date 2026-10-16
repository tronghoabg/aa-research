package com.google.android.projection.gearhead.companion.devsettings;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.ep;
import defpackage.exe;
import defpackage.jqw;
import defpackage.kex;
import defpackage.mki;
import defpackage.uzr;
import defpackage.wwt;
import defpackage.wzl;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.yls;
import defpackage.yph;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public class AppQualityTesterActivity extends ep {
    public static final yph m = yph.c("GH.AppQualityTester");
    public final Handler n = new Handler(Looper.getMainLooper());
    public final kex o = (kex) mki.a.b(kex.class, new jqw(8));
    public yfq p;
    public String q;
    public yfq r;
    public wzl s;
    public Spinner t;
    public Button u;
    private TextView v;
    private TextView w;

    public final void A() {
        String str = this.q;
        TextView textView = this.w;
        if (str == null) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            this.v.setText(this.q);
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_quality_dev_tester);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reports_recycler_view);
        int i = yfq.d;
        this.r = yls.a;
        wzl wzlVar = new wzl(this.r);
        this.s = wzlVar;
        recyclerView.Z(wzlVar);
        recyclerView.ab(new LinearLayoutManager(1));
        this.t = (Spinner) findViewById(R.id.component_name_spinner);
        this.u = (Button) findViewById(R.id.start_test_button);
        this.v = (TextView) findViewById(R.id.component_name_text_view);
        this.w = (TextView) findViewById(R.id.package_indicator_text_view);
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onResume() {
        super.onResume();
        Stream map = Collection.EL.stream(getPackageManager().queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 0)).map(new uzr(14));
        int i = yfq.d;
        Collector collector = ycm.a;
        yfq yfqVar = (yfq) map.collect(collector);
        this.p = yfqVar;
        yfq yfqVar2 = (yfq) Collection.EL.stream(yfqVar).map(new uzr(15)).collect(collector);
        this.t.setOnItemSelectedListener(new exe(this, 3));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, yfqVar2);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.t.setAdapter((SpinnerAdapter) arrayAdapter);
        boolean zIsEmpty = this.p.isEmpty();
        Button button = this.u;
        if (zIsEmpty) {
            button.setOnClickListener(null);
        } else {
            button.setOnClickListener(new wwt(this, 10));
        }
        A();
        this.s.b(this.r);
    }
}
