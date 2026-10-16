package com.waze.ifs.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class at extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f24531a;

    /* renamed from: b, reason: collision with root package name */
    GestureDetector f24532b;

    /* renamed from: c, reason: collision with root package name */
    LinearLayoutManager f24533c;

    /* renamed from: d, reason: collision with root package name */
    View f24534d;

    /* renamed from: e, reason: collision with root package name */
    WazeTextView f24535e;

    /* renamed from: f, reason: collision with root package name */
    final float f24536f;

    /* renamed from: g, reason: collision with root package name */
    int f24537g;

    /* renamed from: h, reason: collision with root package name */
    boolean f24538h;

    /* renamed from: i, reason: collision with root package name */
    final ArrayList f24539i;

    /* renamed from: j, reason: collision with root package name */
    private com.waze.settings.tree.views.h f24540j;

    public at(Context context) {
        super(context);
        this.f24537g = 0;
        this.f24538h = false;
        this.f24539i = new ArrayList();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        setBackgroundColor(0);
        layoutInflaterFrom.inflate(R.layout.waze_horizontal_scroll_card_selector_view, this);
        this.f24536f = context.getResources().getDisplayMetrics().density * 25.0f;
    }

    public static /* synthetic */ void d(at atVar) {
        if (atVar.f24531a.getChildCount() > 0) {
            atVar.f24533c.ab(((atVar.b() * 10) / 2) + atVar.f24537g, Math.round(atVar.k(atVar.c())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float k(View view) {
        return (getMeasuredWidth() / 2) - (view.getWidth() / 2);
    }

    final int b() {
        return this.f24539i.size();
    }

    final View c() {
        return this.f24531a.r(r0.getMeasuredWidth() / 2, this.f24531a.getMeasuredHeight() / 2);
    }

    public final void e(String str, String str2, Drawable drawable, Drawable drawable2) {
        this.f24539i.add(new aq(str, str2, drawable, drawable2));
    }

    public final void f() {
        this.f24531a = (RecyclerView) findViewById(R.id.recycler);
        this.f24534d = findViewById(R.id.mark);
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.description);
        this.f24535e = wazeTextView;
        wazeTextView.setText("");
        if (this.f24538h) {
            float f2 = getContext().getResources().getDisplayMetrics().density;
            ViewGroup.LayoutParams layoutParams = this.f24534d.getLayoutParams();
            float f3 = f2 * 120.0f;
            layoutParams.height = Math.round(f3);
            layoutParams.width = Math.round(f3);
            this.f24534d.setLayoutParams(layoutParams);
            this.f24535e.setVisibility(8);
            findViewById(R.id.description_tooltip).setVisibility(8);
        }
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.f24533c = linearLayoutManager;
        this.f24531a.al(linearLayoutManager);
        this.f24531a.ak(new ak(this));
        al alVar = new al(this, getContext());
        this.f24531a.am(new am(this, alVar));
        this.f24531a.aF(new an(this, alVar));
        this.f24532b = new GestureDetector(getContext(), new ao(this));
        this.f24531a.B(new ap(this, alVar));
        this.f24531a.post(new com.google.android.material.textfield.ao(this, 5));
        com.waze.shared_infra.i.h.a("finished init with " + b() + " items");
    }

    public final void g(int i2) {
        this.f24537g = i2;
        this.f24533c.aa(((b() * 10) / 2) + i2);
        this.f24535e.setText(((aq) this.f24539i.get(this.f24537g)).f24523b);
    }

    public final void h() {
        this.f24538h = true;
    }

    public final void j(com.waze.settings.tree.views.h hVar) {
        this.f24540j = hVar;
    }
}
