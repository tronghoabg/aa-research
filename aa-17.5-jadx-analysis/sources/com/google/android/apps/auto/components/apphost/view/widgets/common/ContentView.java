package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.ui.widget.Button;
import com.google.android.projection.gearhead.R;
import defpackage.geu;
import defpackage.guo;
import defpackage.hbz;
import defpackage.hii;
import defpackage.hlb;
import defpackage.hmb;
import defpackage.jmq;
import defpackage.jtu;
import defpackage.kdw;
import defpackage.kea;
import defpackage.kee;
import defpackage.leh;
import defpackage.onk;
import defpackage.onm;
import defpackage.owu;
import defpackage.yph;
import java.util.List;

/* loaded from: classes2.dex */
public class ContentView extends LinearLayout {
    public static final yph a = yph.c("CarApp.H.Tem");
    public ViewGroup b;

    public ContentView(Context context) {
        this(context, null);
    }

    public final View a() {
        if (this.b.getChildCount() > 0) {
            return this.b.getChildAt(0);
        }
        return null;
    }

    public final void b(geu geuVar, hii hiiVar) {
        View viewA = a();
        byte[] bArr = null;
        if (viewA != null && !(viewA instanceof RowListView)) {
            removeView(viewA);
            viewA = null;
        }
        if (viewA == null) {
            leh.a();
            viewA = LayoutInflater.from(getContext()).inflate(R.layout.material_row_list_view_tuned, this.b, false);
            this.b.addView(viewA);
        }
        boolean z = hiiVar.o;
        RowListView rowListView = (RowListView) viewA;
        if (z || hiiVar.l) {
            rowListView.c().j();
        }
        rowListView.i = hiiVar;
        boolean z2 = hiiVar.b;
        Action action = hiiVar.s;
        if (action != null) {
            Button button = new Button(rowListView.getContext(), onm.SECONDARY, onk.MEDIUM);
            button.a(R.drawable.alpha_jump_a_dot_z);
            button.setOnClickListener(new jmq(geuVar, action, 8, bArr));
            RowPagedListView rowPagedListView = rowListView.g;
            rowPagedListView.getClass();
            rowPagedListView.m(button);
        }
        if (rowListView.j != z2) {
            rowListView.j = z2;
            rowListView.h();
            if (rowListView.j) {
                rowListView.g();
                return;
            }
        }
        CarText carText = hiiVar.e;
        rowListView.d.setText((carText == null || carText.isEmpty()) ? rowListView.getContext().getString(R.string.template_list_no_items) : hlb.d(geuVar, carText));
        CarIcon carIcon = hiiVar.f;
        if (RowListView.i(carIcon, z)) {
            hbz.j(geuVar, carIcon, rowListView.f, hmb.a);
        }
        List listH = guo.h(geuVar, hiiVar.i, hiiVar.j);
        hii hiiVar2 = rowListView.i;
        int i = (!hiiVar2.l || hiiVar2.i.isEmpty()) ? rowListView.b : rowListView.a;
        owu owuVarI = rowListView.c().i();
        owuVarI.setPadding(owuVarI.getPaddingLeft(), owuVarI.getPaddingTop(), owuVarI.getPaddingRight(), i);
        rowListView.h = geuVar;
        rowListView.k = hiiVar.g;
        new Handler(Looper.getMainLooper()).postDelayed(new kea(rowListView, 0), 200L);
        if (hiiVar.l || z) {
            jtu.d(rowListView.d(), geuVar);
        } else {
            jtu.e(rowListView.d(), geuVar, hiiVar.r, hiiVar.q);
        }
        kdw kdwVar = rowListView.c;
        kee keeVar = new kee(rowListView, geuVar);
        List list = kdwVar.a;
        int size = list == null ? 0 : list.size();
        kdwVar.a = listH;
        kdwVar.e = geuVar;
        kdwVar.f = keeVar;
        if (size == listH.size()) {
            kdwVar.j(0, listH.size());
        } else {
            kdwVar.g();
        }
        if (!hiiVar.c) {
            rowListView.g();
        } else if (hiiVar.t != null) {
            rowListView.g();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ViewGroup) findViewById(R.id.container);
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
