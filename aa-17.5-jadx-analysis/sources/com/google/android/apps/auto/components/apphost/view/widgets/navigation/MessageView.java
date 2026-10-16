package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;
import defpackage.ghw;
import defpackage.hmb;
import defpackage.yph;

/* loaded from: classes2.dex */
public class MessageView extends LinearLayout {
    public ImageView a;
    public CarTextView b;
    public CarTextView c;
    public final hmb d;

    static {
        yph.c("CarApp.H.Tem");
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.d = new hmb(color, false, false, ghw.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.message_image);
        this.b = (CarTextView) findViewById(R.id.message_title);
        this.c = (CarTextView) findViewById(R.id.message_text);
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageView(Context context) {
        this(context, null);
    }
}
