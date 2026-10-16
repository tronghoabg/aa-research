package defpackage;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.google.android.projection.gearhead.R;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public abstract class mhe extends ep implements mgu {
    protected ScrollView q;
    public NestedScrollView r;
    public boolean s;
    protected Button t;

    protected abstract void A(ScrollView scrollView);

    public abstract void B();

    protected abstract boolean E();

    public final void F() {
        boolean z = this.r.getScrollY() + this.r.getHeight() >= this.r.getChildAt(0).getBottom();
        if (!E()) {
            this.s = z;
            G();
        } else if (!this.s && z) {
            this.s = true;
            G();
        }
    }

    final void G() {
        this.t.setText(getString(true != this.s ? R.string.scroll_activity_more : R.string.scroll_activity_ok));
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(-1);
        setTheme(R.style.Theme_Gearhead_Material3_Dark_Bottomsheet);
        setContentView(R.layout.preflight_scrolling_phone_gm3);
        ols.c(getWindow(), findViewById(R.id.button_bar_wrapper));
        this.t = (Button) findViewById(R.id.accept_button);
        this.q = (ScrollView) findViewById(R.id.scroll_view);
        findViewById(R.id.scroll_activity_layout).getViewTreeObserver().addOnGlobalLayoutListener(new hx(this, 5, null));
        A(this.q);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nested_scroll_view);
        this.r = nestedScrollView;
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new xcf(this, 1));
        G();
        this.t.setOnClickListener(new kep(this, 20));
        EnumSet enumSetOf = EnumSet.of(mgl.f);
        yph yphVar = mgv.a;
        this.f.c(new mgt(this, new mgs(this, enumSetOf), 0));
    }
}
