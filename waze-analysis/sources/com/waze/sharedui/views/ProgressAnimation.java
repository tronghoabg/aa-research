package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ProgressAnimation extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private Animation f39151a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f39152b;

    public ProgressAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39067e);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f39152b.setImageResource(resourceId);
        }
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        if (color != 0) {
            if (resourceId == 0) {
                this.f39152b.setImageResource(R.drawable.prealoder);
            }
            this.f39152b.setColorFilter(color);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            ((ImageView) findViewById(R.id.progressWazer)).setImageResource(resourceId2);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            findViewById(R.id.progressWazer).setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void c(Context context) {
        LayoutInflater.from(context).inflate(R.layout.progress, (ViewGroup) this, true);
        this.f39152b = (ImageView) findViewById(R.id.progressCircle);
        this.f39151a = isInEditMode() ? null : AnimationUtils.loadAnimation(getContext(), R.anim.rotate_infinite);
    }

    public final void a() {
        findViewById(R.id.progressCircle).startAnimation(this.f39151a);
    }

    public final void b() {
        this.f39151a.cancel();
    }

    @Override // android.view.View
    public final void setRotation(float f2) {
        ImageView imageView = this.f39152b;
        if (imageView != null) {
            imageView.setRotation(f2);
        }
    }

    public ProgressAnimation(Context context) {
        super(context);
        c(context);
    }
}
