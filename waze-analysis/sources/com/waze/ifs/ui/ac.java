package com.waze.ifs.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ac extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    final ImageView f24495a;

    /* renamed from: b, reason: collision with root package name */
    final View f24496b;

    /* renamed from: c, reason: collision with root package name */
    final View f24497c;

    /* renamed from: d, reason: collision with root package name */
    final WazeTextView f24498d;

    /* renamed from: e, reason: collision with root package name */
    final WazeTextView f24499e;

    public ac(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.waze_big_choice_option, this);
        this.f24495a = (ImageView) findViewById(R.id.image);
        this.f24496b = findViewById(R.id.selected_icon);
        this.f24497c = findViewById(R.id.selected_outline);
        this.f24498d = (WazeTextView) findViewById(R.id.title);
        this.f24499e = (WazeTextView) findViewById(R.id.description);
    }

    public final void a() {
        this.f24495a.setVisibility(8);
    }

    public final void b(String str) {
        this.f24499e.setText(str);
    }

    public final void c(int i2) {
        ImageView imageView = this.f24495a;
        if (i2 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
        }
    }

    public final void d(Drawable drawable) {
        ImageView imageView = this.f24495a;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public final void e(String str) {
        this.f24498d.setText(str);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        View view = this.f24496b;
        if (z) {
            view.setVisibility(0);
            this.f24497c.setVisibility(0);
        } else {
            view.setVisibility(8);
            this.f24497c.setVisibility(8);
        }
    }
}
