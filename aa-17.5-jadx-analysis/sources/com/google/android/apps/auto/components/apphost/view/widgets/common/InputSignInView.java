package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.projection.gearhead.R;
import defpackage.eqa;
import defpackage.gkt;
import defpackage.gku;
import defpackage.gly;
import defpackage.gms;
import defpackage.yph;

/* loaded from: classes2.dex */
public class InputSignInView extends LinearLayout implements gkt {
    public static final /* synthetic */ int j = 0;
    public final Handler a;
    public CarRestrictedEditText b;
    public TextView c;
    public CharSequence d;
    public CharSequence e;
    public eqa f;
    public gku g;
    public Drawable h;
    public TextWatcher i;
    private final int k;

    static {
        yph.c("CarApp.H.Tem");
    }

    public InputSignInView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Handler(Looper.getMainLooper(), new gly(this, 7));
        this.d = "";
        this.e = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateSignInMethodViewMaxWidth});
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        this.b.setEnabled(z);
        b(z);
    }

    public final void b(boolean z) {
        this.b.setHint(z ? this.d : this.e);
    }

    @Override // android.view.View, defpackage.gkt
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.b.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (CarRestrictedEditText) findViewById(R.id.input_sign_in_box);
        this.c = (TextView) findViewById(R.id.input_sign_in_error_message);
        this.h = this.b.getBackground();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.k;
        int size = View.MeasureSpec.getSize(i);
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Handler handler = this.a;
            if (handler.hasMessages(2)) {
                return;
            }
            handler.removeMessages(1);
            handler.sendMessageDelayed(handler.obtainMessage(1), 50L);
        }
    }

    @Override // defpackage.gkt
    public final void fs(gms gmsVar) {
    }

    public InputSignInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputSignInView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public InputSignInView(Context context) {
        this(context, null);
    }
}
