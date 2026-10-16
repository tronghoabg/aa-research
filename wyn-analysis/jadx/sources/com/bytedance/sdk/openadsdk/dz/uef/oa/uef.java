package com.bytedance.sdk.openadsdk.dz.uef.oa;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.lw;
import com.bytedance.sdk.openadsdk.core.ivm.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class uef extends yo {

    /* renamed from: oa, reason: collision with root package name */
    private lw f25898oa;
    private Context uef;
    private InterfaceC0119uef yo;

    /* renamed from: com.bytedance.sdk.openadsdk.dz.uef.oa.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0119uef {
        void oa();

        void uef();
    }

    public uef(Context context) {
        super(context);
        this.uef = context;
        oa();
    }

    public void setOnMenuItemClickListener(InterfaceC0119uef interfaceC0119uef) {
        this.yo = interfaceC0119uef;
    }

    private void oa() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        lw lwVar = new lw(this.uef);
        this.f25898oa = lwVar;
        lwVar.setOrientation(1);
        this.f25898oa.setGravity(80);
        this.f25898oa.setPadding(uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0, uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), uef(34.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(uef(16.0f));
        gradientDrawable.setColor(-1);
        this.f25898oa.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = uef(16.0f);
        this.f25898oa.setLayoutParams(layoutParams);
        lw lwVar2 = new lw(this.uef);
        lwVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, uef(52.0f)));
        lwVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dz.uef.oa.uef.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (uef.this.yo != null) {
                    uef.this.yo.uef();
                }
            }
        });
        Context context = this.uef;
        String string = context.getString(orq.oa(context, "tt_history_delete_all"));
        bcc bccVar = new bcc(this.uef);
        bccVar.setText(string);
        bccVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        bccVar.setTextColor(-65536);
        bccVar.setTextSize(2, 15.0f);
        bccVar.setGravity(17);
        lwVar2.addView(bccVar);
        lwVar2.setGravity(17);
        this.f25898oa.addView(lwVar2);
        lw lwVar3 = new lw(this.uef);
        lwVar3.setLayoutParams(new LinearLayout.LayoutParams(-1, uef(8.0f)));
        lwVar3.setBackgroundColor(Color.argb(8, 22, 24, 35));
        this.f25898oa.addView(lwVar3);
        lw lwVar4 = new lw(this.uef);
        lwVar4.setLayoutParams(new LinearLayout.LayoutParams(-1, uef(52.0f)));
        lwVar4.setGravity(17);
        lwVar4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dz.uef.oa.uef.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (uef.this.yo != null) {
                    uef.this.yo.oa();
                }
            }
        });
        bcc bccVar2 = new bcc(this.uef);
        Context context2 = this.uef;
        bccVar2.setText(context2.getString(orq.oa(context2, "tt_history_cancel")));
        bccVar2.setTextAppearance(R.style.TextAppearance.Material.Medium);
        bccVar2.setTextColor(Color.parseColor("#000000"));
        bccVar2.setTextSize(2, 15.0f);
        bccVar2.setGravity(17);
        lwVar4.addView(bccVar2);
        this.f25898oa.addView(lwVar4);
        addView(this.f25898oa);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.dz.uef.oa.uef.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    Rect rect = new Rect();
                    uef.this.f25898oa.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        uef.this.uef();
                    }
                }
                return true;
            }
        });
    }

    public void uef(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void uef() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private int uef(float f10) {
        return af.oa(this.uef, f10);
    }
}
