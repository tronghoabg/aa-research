package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC1650m0;
import com.applovin.impl.C1623a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final GradientDrawable f22134a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f22135b;

    /* renamed from: c, reason: collision with root package name */
    private final C1623a f22136c;

    /* renamed from: d, reason: collision with root package name */
    private b f22137d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdFormat f22138e;

    /* renamed from: f, reason: collision with root package name */
    private a f22139f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? AbstractC1650m0.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? AbstractC1650m0.a(R.color.applovin_sdk_brand_color, getContext()) : AbstractC1650m0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f22136c.a();
        } else {
            setEnabled(true);
            this.f22136c.b();
        }
        this.f22135b.setText(b(bVar));
        this.f22134a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f22137d;
    }

    public MaxAdFormat getFormat() {
        return this.f22138e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f22139f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f22137d != bVar) {
            c(bVar);
        }
        this.f22137d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f22138e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f22139f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f22134a = gradientDrawable;
        Button button = new Button(getContext());
        this.f22135b = button;
        C1623a c1623a = new C1623a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f22136c = c1623a;
        b bVar = b.LOAD;
        this.f22137d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        c1623a.setColor(-1);
        addView(c1623a, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f22135b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{AbstractC1650m0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
