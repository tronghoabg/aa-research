package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.ue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class uef extends TextSwitcher implements ViewSwitcher.ViewFactory, ue.uef {
    private int bcc;
    private int cq;
    private float cz;
    private int dj;
    private Handler dz;
    private TextView ivm;
    private Context lw;
    private final int moa;

    /* renamed from: oa, reason: collision with root package name */
    private List<String> f24913oa;
    Animation.AnimationListener uef;
    private int wrv;
    private int xs;
    private int yo;
    private int zjm;

    public uef(Context context, int i5, float f10, int i10, int i11) {
        super(context);
        this.f24913oa = new ArrayList();
        this.yo = 0;
        this.moa = 1;
        this.dz = new ue(Looper.getMainLooper(), this);
        this.uef = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.uef.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (uef.this.ivm != null) {
                    uef.this.ivm.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.lw = context;
        this.bcc = i5;
        this.cz = f10;
        this.zjm = i10;
        this.cq = i11;
        yo();
    }

    private void yo() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.ivm = textView;
        textView.setTextColor(this.bcc);
        this.ivm.setTextSize(this.cz);
        this.ivm.setMaxLines(this.zjm);
        this.ivm.setTextAlignment(this.cq);
        return this.ivm;
    }

    public void oa() {
        List<String> list = this.f24913oa;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i5 = this.yo;
        this.yo = i5 + 1;
        this.dj = i5;
        setText(this.f24913oa.get(i5));
        if (this.yo > this.f24913oa.size() - 1) {
            this.yo = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.dz.sendEmptyMessageDelayed(1, this.xs);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.dz.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa(this.f24913oa.get(this.dj), this.cz, false)[0], 1073741824), i5);
        } catch (Exception unused) {
            super.onMeasure(i5, i10);
        }
    }

    public void setAnimationDuration(int i5) {
        this.xs = i5;
    }

    public void setAnimationText(List<String> list) {
        this.f24913oa = list;
    }

    public void setAnimationType(int i5) {
        this.wrv = i5;
    }

    public void setMaxLines(int i5) {
        this.zjm = i5;
    }

    public void setTextColor(int i5) {
        this.bcc = i5;
    }

    public void setTextSize(float f10) {
        this.cz = f10;
    }

    public void uef() {
        int i5 = this.wrv;
        if (i5 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.orq.cz(this.lw, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.orq.cz(this.lw, "tt_text_animation_y_out"));
        } else if (i5 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.orq.cz(this.lw, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.orq.cz(this.lw, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.uef);
            getOutAnimation().setAnimationListener(this.uef);
        }
        this.dz.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what != 1) {
            return;
        }
        oa();
        this.dz.sendEmptyMessageDelayed(1, this.xs);
    }
}
