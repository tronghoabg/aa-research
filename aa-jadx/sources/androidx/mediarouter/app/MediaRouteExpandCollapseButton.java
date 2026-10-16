package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes2.dex */
public class MediaRouteExpandCollapseButton extends defpackage.jf {
    public final android.graphics.drawable.AnimatedVectorDrawable a;
    public final android.graphics.drawable.AnimatedVectorDrawable b;
    public final java.lang.String c;
    public final java.lang.String d;
    public boolean e;
    public android.view.View.OnClickListener f;

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    public MediaRouteExpandCollapseButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.util.TypedValue typedValue;
        int color;
        super(context, attributeSet, i);
        android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) context.getDrawable(com.google.android.projection.gearhead.R.drawable.mr_group_expand);
        this.a = animatedVectorDrawable;
        android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable2 = (android.graphics.drawable.AnimatedVectorDrawable) context.getDrawable(com.google.android.projection.gearhead.R.drawable.mr_group_collapse);
        this.b = animatedVectorDrawable2;
        if (i != 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{com.google.android.projection.gearhead.R.attr.colorPrimary});
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color == 0) {
                typedValue = new android.util.TypedValue();
                context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.colorPrimary, typedValue, true);
                if (typedValue.resourceId != 0) {
                    color = context.getResources().getColor(typedValue.resourceId);
                } else {
                    color = typedValue.data;
                }
            }
        } else {
            typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.colorPrimary, typedValue, true);
            if (typedValue.resourceId != 0) {
                color = context.getResources().getColor(typedValue.resourceId);
            } else {
                color = typedValue.data;
            }
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(defpackage.dvk.a(-1, color) < 3.0d ? -570425344 : -1, android.graphics.PorterDuff.Mode.SRC_IN);
        animatedVectorDrawable.setColorFilter(porterDuffColorFilter);
        animatedVectorDrawable2.setColorFilter(porterDuffColorFilter);
        java.lang.String string = context.getString(com.google.android.projection.gearhead.R.string.mr_controller_expand_group);
        this.c = string;
        this.d = context.getString(com.google.android.projection.gearhead.R.string.mr_controller_collapse_group);
        setImageDrawable(animatedVectorDrawable);
        setContentDescription(string);
        super.setOnClickListener(new android.view.View.OnClickListener() { // from class: euc
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                androidx.mediarouter.app.MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
                boolean z = mediaRouteExpandCollapseButton.e;
                mediaRouteExpandCollapseButton.e = !z;
                if (z) {
                    android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable3 = mediaRouteExpandCollapseButton.b;
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable3);
                    animatedVectorDrawable3.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.c);
                } else {
                    android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable4 = mediaRouteExpandCollapseButton.a;
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable4);
                    animatedVectorDrawable4.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
                }
                android.view.View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(android.content.Context context) {
        this(context, null);
    }
}
