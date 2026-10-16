package com.waze.ui.alerter;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.settings.g.a.b;
import com.waze.shared_infra.q.h;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class Alerter extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final f f41937a;

    /* renamed from: b, reason: collision with root package name */
    private final f f41938b;

    /* renamed from: c, reason: collision with root package name */
    private final f f41939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Alerter(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.alerter_layout, (ViewGroup) this, true);
        f fVarA = g.a(new b(this, 19));
        this.f41937a = fVarA;
        this.f41938b = g.a(new h(this, 14));
        g.a(new h(this, 15));
        g.a(new b(this, 20));
        g.a(new h(this, 1));
        this.f41939c = g.a(new h(this, 2));
        g.a(new h(this, 3));
        g.a(new h(this, 4));
        g.a(new h(this, 5));
        g.a(new h(this, 6));
        g.a(new h(this, 7));
        g.a(new h(this, 8));
        a aVar = a.f41940a;
        g.a(new h(this, 9));
        g.a(new h(this, 10));
        g.a(new h(this, 11));
        g.a(new h(this, 12));
        g.a(new h(this, 13));
        b().setClipToOutline(true);
        com.waze.design_components.d.b.d(b());
        Object value = fVarA.getValue();
        x.e(value, "getValue(...)");
        ((ViewGroup) value).setPadding(0, 0, 0, 0);
        b().setElevation(0.0f);
        a();
    }

    private final ViewGroup b() {
        Object value = this.f41938b.getValue();
        x.e(value, "getValue(...)");
        return (ViewGroup) value;
    }

    public final void a() {
        Object value = this.f41939c.getValue();
        x.e(value, "getValue(...)");
        ((LinearLayout) value).setOrientation(getResources().getConfiguration().orientation == 2 ? 0 : 1);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Alerter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Alerter(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ Alerter(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
