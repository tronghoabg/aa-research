package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.yo.wrv;
import com.bytedance.sdk.openadsdk.yo.zjm;

/* loaded from: classes3.dex */
public class bs extends com.bytedance.sdk.openadsdk.core.ivm.yo implements zjm.oa {
    private boolean ivm;
    private String lw;
    private Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private gzw f25300oa;
    private View uef;
    private final com.bytedance.sdk.openadsdk.yo.zjm xs;
    private uef yo;

    public interface uef {
        void oa(View view);

        void uef(View view);

        void uef(FilterWord filterWord);
    }

    public bs(Context context, gzw gzwVar) {
        this(context.getApplicationContext());
        this.f25300oa = gzwVar;
        this.moa = context;
        moa();
        lw();
    }

    private wrv.uef ivm() {
        return new wrv.uef() { // from class: com.bytedance.sdk.openadsdk.common.bs.2
            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void oa() {
                bs.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void uef() {
                bs.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void yo() {
                bs.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.yo.wrv.uef
            public void uef(int i5, FilterWord filterWord, String str) {
                bs.this.xs.yo(str);
                bs.this.setVisibility(0);
            }
        };
    }

    private void lw() {
        com.bytedance.sdk.openadsdk.yo.zjm zjmVar;
        gzw gzwVar = this.f25300oa;
        if (gzwVar == null || (zjmVar = this.xs) == null) {
            return;
        }
        zjmVar.uef(gzwVar.tkg());
    }

    private void moa() {
        this.xs.uef(this.f25300oa.em());
        this.xs.uef(this);
    }

    public void oa() {
        setVisibility(8);
        this.ivm = false;
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.oa(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.yo.zjm zjmVar = this.xs;
        if (zjmVar != null) {
            zjmVar.uef();
        }
    }

    public void setCallback(uef uefVar) {
        this.yo = uefVar;
    }

    public void setDislikeSource(String str) {
        this.lw = str;
        this.xs.oa(str);
    }

    public void yo() {
        Context context = this.moa;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.yo.wrv wrvVar = new com.bytedance.sdk.openadsdk.yo.wrv(this.moa, this.xs);
            wrvVar.uef(ivm());
            wrvVar.uef(this.f25300oa);
            if (zIsFinishing || wrvVar.isShowing()) {
                return;
            }
            wrvVar.show();
        }
    }

    private void uef(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.bs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bs.this.xs != null) {
                    bs.this.xs.lw();
                } else {
                    bs.this.oa();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.uef = new com.bytedance.sdk.openadsdk.yo.cz(context, this.xs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = af.oa(getContext(), 20.0f);
        layoutParams.rightMargin = af.oa(getContext(), 20.0f);
        this.uef.setLayoutParams(layoutParams);
        this.uef.setClickable(true);
        lw();
    }

    public bs(Context context) {
        this(context, (AttributeSet) null);
    }

    public bs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bs(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.ivm = false;
        this.xs = new com.bytedance.sdk.openadsdk.yo.zjm();
        uef(context, attributeSet);
    }

    public void uef() {
        if (this.uef.getParent() == null) {
            addView(this.uef);
        }
        setVisibility(0);
        this.ivm = true;
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.oa
    public void uef(int i5) {
        if (com.bytedance.sdk.openadsdk.yo.zjm.f26205oa == i5) {
            FilterWord filterWordOa = this.xs.oa();
            if (filterWordOa == null || com.bytedance.sdk.openadsdk.yo.zjm.uef.equals(filterWordOa)) {
                return;
            }
            uef uefVar = this.yo;
            if (uefVar != null) {
                try {
                    uefVar.uef(filterWordOa);
                } catch (Throwable unused) {
                }
            }
            oa();
            return;
        }
        if (com.bytedance.sdk.openadsdk.yo.zjm.yo == i5) {
            oa();
        } else if (com.bytedance.sdk.openadsdk.yo.zjm.lw == i5) {
            yo();
        }
    }
}
