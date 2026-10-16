package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public abstract class xcg extends sei implements View.OnClickListener {
    protected ScrollView e;
    ViewGroup f;
    Button g;
    Button h;
    protected boolean i;

    protected abstract ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup, View view);

    protected abstract void d();

    protected void e() {
        this.g.setText(getString(true != this.i ? R.string.frx_more : R.string.frx_continue));
    }

    public void f() {
        if (!isAdded() || this.i || this.e.getScrollY() + this.e.getHeight() < this.e.getChildAt(0).getBottom()) {
            return;
        }
        this.i = true;
        e();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == this.g.getId()) {
            if (this.i) {
                d();
            } else {
                this.e.pageScroll(130);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.frx_scroll_to_accept, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        this.e = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.g = (Button) viewInflate.findViewById(R.id.right_button);
        this.h = (Button) viewInflate.findViewById(R.id.left_button);
        this.f = a(layoutInflater, this.e, viewInflate);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new hx(this, 7, null));
        this.e.addView(this.f);
        this.e.getViewTreeObserver().addOnScrollChangedListener(new xcf(this, 0));
        this.g.setVisibility(0);
        e();
        this.g.setOnClickListener(this);
        return viewInflate;
    }
}
