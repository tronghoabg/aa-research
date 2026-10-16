package com.waze.ifs.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class aj extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f24511a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView f24512b;

    /* renamed from: c, reason: collision with root package name */
    private final ag f24513c;

    public aj(Context context) {
        super(context);
        this.f24511a = -1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        setBackgroundColor(0);
        layoutInflaterFrom.inflate(R.layout.waze_horizontal_card_selector_view, this);
        ag agVar = new ag();
        this.f24513c = agVar;
        View viewFindViewById = findViewById(R.id.options);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f24512b = recyclerView;
        recyclerView.al(new LinearLayoutManager(0));
        recyclerView.ak(agVar);
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.ifs.ui.ae
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                aj.d(this.f24501a, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    static final void b(aj ajVar) {
        ajVar.f24512b.ak(ajVar.f24513c);
    }

    static final void d(final aj ajVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11 = i5 - i3;
        if (i11 == 0 || (i10 = i4 - i2) == 0) {
            return;
        }
        if (i10 == i8 - i6 && i11 == i9 - i7) {
            return;
        }
        RecyclerView recyclerView = ajVar.f24512b;
        recyclerView.ak(null);
        recyclerView.post(new Runnable() { // from class: com.waze.ifs.ui.ad
            @Override // java.lang.Runnable
            public final void run() {
                aj.b(this.f24500a);
            }
        });
    }

    public final void a(String str, Drawable drawable, Drawable drawable2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f24513c.a(new ah(str, drawable2, drawable));
    }

    public final void c(int i2) {
        if (this.f24511a != -1) {
            this.f24513c.c();
        }
        this.f24513c.b(i2);
    }

    public final void e(com.waze.settings.tree.views.h hVar) {
        this.f24513c.e(hVar);
    }
}
