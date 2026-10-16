package com.google.android.projection.gearhead.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.lbf;
import defpackage.moi;
import defpackage.ntb;
import defpackage.qfv;
import defpackage.rmm;
import defpackage.xao;
import defpackage.xem;
import defpackage.xen;
import defpackage.xqb;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class CarAppLayout extends FrameLayout {
    public static final yph a = yph.c("GH.CarAppLayout");
    public final ImageView b;
    public final View c;
    public final CarRestrictedEditText d;
    public final xqb e;
    public boolean f;
    boolean g;
    private final ViewGroup h;
    private final View i;
    private final View j;
    private final ImageView k;
    private final ImageView l;
    private final FrameLayout m;
    private final ImageView n;
    private final View o;
    private final moi p;
    private final Handler q;

    public CarAppLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.g = true;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        Future futureB = b(executorServiceNewFixedThreadPool, R.drawable.ic_mic_enabled_white);
        Future futureB2 = b(executorServiceNewFixedThreadPool, 2131232055);
        Future futureB3 = b(executorServiceNewFixedThreadPool, 2131232056);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.car_app_layout, (ViewGroup) this, true);
        this.q = new Handler();
        this.e = new xqb(getContext(), Looper.myLooper(), new xem(this));
        ImageView imageView = (ImageView) findViewById(R.id.car_mic_button);
        this.b = imageView;
        imageView.setImageDrawable((Drawable) c(futureB));
        byte[] bArr = null;
        imageView.setOnClickListener(new xao(this, 19, bArr));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.car_mic_underlay);
        this.h = viewGroup;
        viewGroup.getLayoutTransition().enableTransitionType(4);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_linear_in);
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        Interpolator interpolatorLoadInterpolator3 = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        viewGroup.getLayoutTransition().setInterpolator(2, interpolatorLoadInterpolator);
        viewGroup.getLayoutTransition().setInterpolator(0, interpolatorLoadInterpolator3);
        viewGroup.getLayoutTransition().setInterpolator(3, interpolatorLoadInterpolator2);
        viewGroup.getLayoutTransition().setInterpolator(1, interpolatorLoadInterpolator3);
        viewGroup.getLayoutTransition().setInterpolator(4, interpolatorLoadInterpolator3);
        View viewFindViewById = findViewById(R.id.car_search_box);
        this.i = viewFindViewById;
        this.j = findViewById(R.id.car_search_box_contents);
        ImageView imageView2 = (ImageView) findViewById(R.id.car_search_box_google_logo);
        this.k = imageView2;
        imageView2.setImageDrawable((Drawable) c(futureB2));
        ImageView imageView3 = (ImageView) findViewById(R.id.car_search_box_superg_logo);
        this.l = imageView3;
        imageView3.setImageDrawable((Drawable) c(futureB3));
        ntb ntbVar = new ntb(5);
        CarRestrictedEditText carRestrictedEditText = (CarRestrictedEditText) findViewById(R.id.car_search_box_edit_text);
        this.d = carRestrictedEditText;
        carRestrictedEditText.setOnClickListener(ntbVar);
        View viewFindViewById2 = findViewById(R.id.car_search_box_google_logo_container);
        this.c = viewFindViewById2;
        viewFindViewById2.setOnClickListener(ntbVar);
        carRestrictedEditText.setOnTouchListener(new qfv(6));
        carRestrictedEditText.setOnEditorActionListener(new lbf(this, 4, bArr));
        carRestrictedEditText.addTextChangedListener(new xen());
        this.m = (FrameLayout) findViewById(R.id.car_search_box_end_view);
        ImageView imageView4 = (ImageView) findViewById(R.id.car_drawer_button);
        this.n = imageView4;
        moi moiVar = new moi(context);
        this.p = moiVar;
        imageView4.setImageDrawable(moiVar);
        View viewFindViewById3 = findViewById(R.id.car_drawer_title_container);
        this.o = viewFindViewById3;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_app_layout_search_box_small_width);
        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_menu_button_size));
        layoutParams.setMarginEnd(-layoutParams.width);
        viewFindViewById.setLayoutParams(layoutParams);
        ((View) carRestrictedEditText.getParent()).setVisibility(8);
        viewFindViewById3.setVisibility(0);
        viewGroup.requestLayout();
        executorServiceNewFixedThreadPool.shutdown();
    }

    public static final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("open_cause", 2);
        return bundle;
    }

    private final Future b(ExecutorService executorService, int i) {
        return executorService.submit(new rmm(this, i, 5));
    }

    private static final Object c(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
        arrayList.remove(this.d);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 10165)).y("dispatchGenericMotionEvent: %s", motionEvent);
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i);
            boolean zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
            ((ype) yphVar.l().ai(10166)).N("v=%s handled=%b", childAt, zDispatchGenericMotionEvent);
            if (zDispatchGenericMotionEvent) {
                z = zDispatchGenericMotionEvent;
                break;
            }
            i++;
            z = zDispatchGenericMotionEvent;
        }
        if (z) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.d.hasFocus() && keyEvent.getKeyCode() == 19) {
            return true;
        }
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        ((ype) a.l().ai((char) 10167)).y("dispatchKeyEvent handled=%b", Boolean.valueOf(zDispatchKeyEvent));
        if (!zDispatchKeyEvent) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 1) {
                if (keyCode != 2) {
                    if (keyCode != 21) {
                        if (keyCode == 22) {
                        }
                    }
                }
                if (this.g && keyEvent.getAction() == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("open_cause", 3);
                    bundle.putInt("open_cause_key_code", keyEvent.getKeyCode());
                    try {
                        this.e.b(bundle);
                        return true;
                    } catch (IllegalStateException e) {
                        ((ype) ((ype) ((ype) a.f()).p(e)).ai((char) 10168)).u("failed to open demand space");
                        this.f = true;
                    }
                }
            }
            return true;
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int color = getContext().getColor(R.color.search_box_card);
        int color2 = getContext().getColor(R.color.search_box_text_secondary);
        int color3 = getContext().getColor(R.color.search_box_text_primary);
        this.i.setBackgroundColor(color);
        this.j.setBackgroundColor(color);
        this.k.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        CarRestrictedEditText carRestrictedEditText = this.d;
        carRestrictedEditText.setTextColor(color3);
        carRestrictedEditText.setHintTextColor(color2);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.car_header).bringToFront();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        this.m.removeAllViews();
        return super.onSaveInstanceState();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            this.e.c();
        } else if (i == 8) {
            this.q.removeCallbacksAndMessages(null);
            this.e.a();
            i = 8;
        }
        super.onWindowVisibilityChanged(i);
    }

    public CarAppLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarAppLayout(Context context) {
        this(context, null);
    }
}
