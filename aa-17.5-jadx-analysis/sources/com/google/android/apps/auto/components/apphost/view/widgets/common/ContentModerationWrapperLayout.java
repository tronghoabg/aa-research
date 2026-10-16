package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.signin.SignInTemplate;
import com.google.android.projection.gearhead.R;
import defpackage.geu;
import defpackage.gev;
import defpackage.ggk;
import defpackage.ghl;
import defpackage.gjv;
import defpackage.gmh;
import defpackage.kbs;
import defpackage.kea;
import defpackage.leh;
import defpackage.mkn;
import defpackage.yph;

/* loaded from: classes2.dex */
public class ContentModerationWrapperLayout extends FrameLayout {
    public static final yph a = yph.c("GH.ContModWrapper");
    public View b;
    public boolean c;
    public geu d;
    public ghl e;
    public int f;
    private gjv g;

    public ContentModerationWrapperLayout(Context context) {
        super(context);
    }

    public final void a(geu geuVar, TemplateWrapper templateWrapper) {
        String string;
        this.d = geuVar;
        Class<?> cls = templateWrapper.getTemplate().getClass();
        boolean zK = ((ggk) geuVar.F(ggk.class)).K();
        leh.a();
        int i = 1;
        if (!((gmh) geuVar.d()).a.equals(mkn.v)) {
            if (SignInTemplate.class.equals(cls) || LongMessageTemplate.class.equals(cls)) {
                i = zK ? 4 : 2;
            } else if (zK) {
                i = 3;
            }
        }
        this.f = i;
        ghl ghlVar = (ghl) geuVar.l(ghl.class);
        ghlVar.getClass();
        this.e = ghlVar;
        gjv gjvVarB = geuVar.B();
        this.g = gjvVarB;
        gjvVarB.b(this, 6, new kbs(this, 20));
        this.g.b(this, 14, new kbs(this, 20));
        TextView textView = (TextView) this.b.findViewById(R.id.driving_message_text);
        Class<?> cls2 = templateWrapper.getTemplate().getClass();
        if (SignInTemplate.class.equals(cls2)) {
            geuVar.u();
            string = geuVar.getString(R.string.sign_in_driving_state_message);
        } else if (LongMessageTemplate.class.equals(cls2)) {
            geuVar.u();
            string = geuVar.getString(R.string.driving_state_message);
        } else {
            geuVar.u();
            string = geuVar.getString(R.string.text_task_overflow_state_message_text);
        }
        textView.setText(string);
        b();
    }

    public final void b() {
        gev.c(new kea(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        gjv gjvVar = this.g;
        if (gjvVar != null) {
            gjvVar.c(this, 6);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = LayoutInflater.from(getContext()).inflate(R.layout.driving_message_view, this).findViewById(R.id.driving_message_view);
    }

    public ContentModerationWrapperLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentModerationWrapperLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContentModerationWrapperLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
