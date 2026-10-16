package com.waze.main_screen.g;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f26382a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f26383b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26384c;

    /* renamed from: d, reason: collision with root package name */
    private String f26385d;

    public e(Context context, byte[] bArr) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.bottom_pill_view, (ViewGroup) this, true);
        this.f26382a = findViewById(R.id.pillViewContainer);
        this.f26383b = (TextView) findViewById(R.id.pillViewLabel);
    }

    private final void f() {
        String str;
        if (!this.f26384c || (str = this.f26385d) == null || str.trim().length() <= 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public final void a() {
        this.f26383b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public final void b(int i2, int i3) {
        this.f26383b.setTextColor(i2);
        setBackgroundColor(i3);
    }

    public final void c(int i2) {
        this.f26383b.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
    }

    public final void d(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f26385d = str;
        this.f26383b.setText(str);
        f();
    }

    public final void e() {
        this.f26384c = true;
        f();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        ((GradientDrawable) this.f26382a.getBackground()).setColor(i2);
    }

    public e(Context context) {
        this(context, null);
        setBackgroundColor(getResources().getColor(R.color.primary));
        c(R.drawable.ridecard_driveto_button_arrow);
        setOnClickListener(new com.waze.inbox.e(8));
    }
}
