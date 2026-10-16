package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class qgy extends FrameLayout {
    public final PagedListView a;
    public final ProgressBar b;
    public final qgw c;
    public final qgc d;

    public qgy(Context context, qgj qgjVar, qgc qgcVar) throws Resources.NotFoundException {
        super(context);
        this.d = qgcVar;
        setFitsSystemWindows(false);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.adu_search_layout, (ViewGroup) this, true);
        setBackgroundResource(R.color.appdecor_search_background);
        PagedListView pagedListView = (PagedListView) findViewById(R.id.list_view);
        this.a = pagedListView;
        oxh oxhVar = new oxh(getContext(), false);
        pagedListView.k();
        pagedListView.s = oxhVar;
        pagedListView.p(pagedListView.s);
        pagedListView.c(qgjVar);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.adu_plv_enter);
        animationLoadAnimation.setStartOffset(300L);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.adu_plv_exit);
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.adu_plv_fade_out);
        animationLoadAnimation3.setStartOffset(300L);
        this.c = new qgw(pagedListView, animationLoadAnimation, animationLoadAnimation2, animationLoadAnimation3);
        this.b = (ProgressBar) findViewById(R.id.progress);
        onh onhVar = new onh(this, 10);
        setOnClickListener(onhVar);
        setFocusable(false);
        pagedListView.setOnClickListener(onhVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setBackgroundColor(getContext().getColor(R.color.appdecor_search_background));
        this.a.n(0);
    }
}
