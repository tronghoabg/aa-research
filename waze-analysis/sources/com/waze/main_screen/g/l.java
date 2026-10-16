package com.waze.main_screen.g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f26412a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26413b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeTextView f26414c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f26415d;

    /* renamed from: e, reason: collision with root package name */
    private final View f26416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i2, int i3) {
        super(context);
        x.f(context, "context");
        this.f26412a = i2;
        this.f26413b = i3;
        LayoutInflater.from(context).inflate(R.layout.pill_view_with_icon_and_text, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.pillViewLabel);
        x.e(viewFindViewById, "findViewById(...)");
        WazeTextView wazeTextView = (WazeTextView) viewFindViewById;
        this.f26414c = wazeTextView;
        View viewFindViewById2 = findViewById(R.id.pillViewContainer);
        x.e(viewFindViewById2, "findViewById(...)");
        this.f26416e = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.icon);
        x.e(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f26415d = imageView;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, i2));
        wazeTextView.setTextColor(ContextCompat.getColor(context, R.color.on_primary));
        Drawable background = viewFindViewById2.getBackground();
        x.d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(ContextCompat.getColor(context, i3));
    }

    public final void a(String str) {
        if (str == null) {
            this.f26414c.setVisibility(8);
            return;
        }
        WazeTextView wazeTextView = this.f26414c;
        wazeTextView.setVisibility(0);
        wazeTextView.setText(str);
    }
}
