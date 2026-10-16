package com.waze.main_screen.g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.waze.R;
import com.waze.ig;
import com.waze.sdk.bk;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f26417a;

    /* renamed from: b, reason: collision with root package name */
    private final View f26418b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f26419c;

    /* renamed from: d, reason: collision with root package name */
    private final View f26420d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f26421e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26422f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.messaging.l f26423g;

    public m(Context context) {
        super(context, null, 0);
        this.f26417a = new ig(this, 9);
        this.f26423g = null;
        LayoutInflater.from(getContext()).inflate(R.layout.transportation_button_view, (ViewGroup) this, true);
        this.f26418b = findViewById(R.id.transportationSdkButtonContainer);
        this.f26419c = (ImageView) findViewById(R.id.transportationSdkButton);
        this.f26420d = findViewById(R.id.transportationSdkTooltipContainer);
        this.f26421e = (TextView) findViewById(R.id.transportationSdkTooltipLabel);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.waze.main_screen.ae.a.d, java.lang.Object] */
    public final void a() {
        this.f26422f = false;
        View view = this.f26420d;
        view.removeCallbacks(this.f26417a);
        view.setPivotX(view.getMeasuredWidth());
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
        com.waze.view.anim.g.d(view).scaleX(0.0f).scaleY(0.0f).setListener(com.waze.view.anim.g.b(view));
        com.google.firebase.messaging.l lVar = this.f26423g;
        if (lVar != null) {
            lVar.f10212a.c();
        }
    }

    public final void b(String str, boolean z) {
        String str2 = String.format(Locale.US, com.waze.design_components.g.b.d(this).c(R.string.TRANSPORTATION_LAYER_TOOLTIP_TITLE, new Object[0]), str);
        if (z) {
            Toast.makeText(getContext(), str2, 1).show();
            return;
        }
        this.f26422f = true;
        View view = this.f26420d;
        view.setVisibility(0);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        com.waze.view.anim.g.d(view).scaleX(1.0f).scaleY(1.0f).setListener(null);
        this.f26421e.setText(str2);
        view.postDelayed(this.f26417a, 5000L);
    }

    public final void c(bk bkVar) {
        if (!bkVar.d()) {
            View view = this.f26418b;
            view.setOnClickListener(null);
            view.setVisibility(8);
        } else {
            this.f26419c.setBackground(bkVar.b());
            View view2 = this.f26418b;
            view2.setOnClickListener(new com.waze.inbox.e(7));
            view2.setVisibility(0);
        }
    }

    public final void d(com.google.firebase.messaging.l lVar) {
        this.f26423g = lVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26422f) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
