package com.waze.ui.minimized_eta_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.waze.R;
import com.waze.design_components.d.b;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.sharedrive.e.ai;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class MinimizedEtaBar extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final f f43057a;

    /* renamed from: b, reason: collision with root package name */
    private final f f43058b;

    /* renamed from: c, reason: collision with root package name */
    private final f f43059c;

    /* renamed from: d, reason: collision with root package name */
    private final f f43060d;

    /* renamed from: e, reason: collision with root package name */
    private final f f43061e;

    /* renamed from: f, reason: collision with root package name */
    private final f f43062f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43063g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43064h;

    /* renamed from: i, reason: collision with root package name */
    private final f f43065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimizedEtaBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.minimized_eta_bar_layout, (ViewGroup) this, true);
        this.f43057a = g.a(new ai(this, 12));
        this.f43058b = g.a(new ai(this, 13));
        this.f43059c = g.a(new ai(this, 14));
        this.f43060d = g.a(new ai(this, 15));
        this.f43061e = g.a(new ai(this, 16));
        this.f43062f = g.a(new ai(this, 17));
        this.f43064h = true;
        f fVarA = g.a(new ai(this, 18));
        this.f43065i = fVarA;
        k().setClipToOutline(true);
        if (this.f43064h) {
            b.e(k(), ((Number) fVarA.getValue()).floatValue());
        } else {
            b.d(k());
        }
    }

    private final ViewGroup k() {
        Object value = this.f43057a.getValue();
        x.e(value, "getValue(...)");
        return (ViewGroup) value;
    }

    private final ViewGroup l() {
        Object value = this.f43058b.getValue();
        x.e(value, "getValue(...)");
        return (ViewGroup) value;
    }

    private final WazeTextView m() {
        Object value = this.f43060d.getValue();
        x.e(value, "getValue(...)");
        return (WazeTextView) value;
    }

    private final WazeTextView n() {
        Object value = this.f43061e.getValue();
        x.e(value, "getValue(...)");
        return (WazeTextView) value;
    }

    private final WazeTextView o() {
        Object value = this.f43062f.getValue();
        x.e(value, "getValue(...)");
        return (WazeTextView) value;
    }

    private final WazeTextView p() {
        Object value = this.f43059c.getValue();
        x.e(value, "getValue(...)");
        return (WazeTextView) value;
    }

    public final String a() {
        CharSequence text = m().getText();
        x.d(text, "null cannot be cast to non-null type kotlin.String");
        return (String) text;
    }

    public final String b() {
        CharSequence text = n().getText();
        x.d(text, "null cannot be cast to non-null type kotlin.String");
        return (String) text;
    }

    public final String c() {
        CharSequence text = p().getText();
        x.d(text, "null cannot be cast to non-null type kotlin.String");
        return (String) text;
    }

    public final void d(String str) {
        x.f(str, "arrivalTime");
        m().setText(str);
    }

    public final void e(String str) {
        x.f(str, "distanceToDestination");
        String str2 = str;
        n().setText(str2);
        o().setText(str2);
    }

    public final void f(boolean z) {
        if (this.f43063g == z) {
            return;
        }
        this.f43063g = z;
        l().setVisibility(true != this.f43063g ? 0 : 8);
        o().setVisibility(true != this.f43063g ? 8 : 0);
    }

    public final void g(String str) {
        x.f(str, "timeToDestination");
        p().setText(str);
    }

    public final void h(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        ViewGroup.LayoutParams layoutParams3 = o().getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i2;
        }
        if (layoutParams4 != null) {
            layoutParams4.gravity = i2;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i3;
        }
        if (layoutParams4 != null) {
            layoutParams4.topMargin = i3;
        }
        l().setLayoutParams(layoutParams2 != null ? layoutParams2 : l().getLayoutParams());
        o().setLayoutParams(layoutParams4 != null ? layoutParams4 : o().getLayoutParams());
    }

    public final void i(int i2) {
        ViewGroup.LayoutParams layoutParams = k().getLayoutParams();
        layoutParams.height = i2;
        k().setLayoutParams(layoutParams);
    }

    public final boolean j() {
        return this.f43063g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinimizedEtaBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MinimizedEtaBar(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ MinimizedEtaBar(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
