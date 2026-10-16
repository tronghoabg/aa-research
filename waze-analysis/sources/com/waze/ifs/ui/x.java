package com.waze.ifs.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f24597a;

    /* renamed from: b, reason: collision with root package name */
    final ProgressAnimation f24598b;

    /* renamed from: c, reason: collision with root package name */
    final ImageView f24599c;

    public x(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.settings_user_image, this);
        this.f24597a = (ImageView) findViewById(R.id.image);
        this.f24599c = (ImageView) findViewById(R.id.action_icon);
        this.f24598b = (ProgressAnimation) findViewById(R.id.loadingSpinner);
    }

    public final void a(Bitmap bitmap) {
        ImageView imageView = this.f24597a;
        imageView.setImageDrawable(new com.waze.sharedui.views.h(imageView.getContext(), bitmap, 5));
        imageView.buildDrawingCache();
        this.f24599c.setImageResource(R.drawable.edit_pic_icon);
    }

    public final void b() {
        ProgressAnimation progressAnimation = this.f24598b;
        progressAnimation.setVisibility(0);
        progressAnimation.a();
        this.f24597a.setAlpha(0.2f);
    }

    public final void c() {
        ProgressAnimation progressAnimation = this.f24598b;
        progressAnimation.setVisibility(8);
        progressAnimation.b();
        this.f24597a.setAlpha(1.0f);
    }
}
