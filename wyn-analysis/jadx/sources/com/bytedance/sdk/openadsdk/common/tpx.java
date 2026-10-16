package com.bytedance.sdk.openadsdk.common;

import Lb.g;
import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class tpx extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private LinearLayout f25318oa;
    private Context uef;
    private uef yo;

    public interface uef {
        void ivm();

        void lw();

        void moa();

        void oa();

        void uef();

        void yo();
    }

    public tpx(Context context, boolean z2) {
        super(context);
        this.uef = context;
        this.moa = z2;
        oa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bcc(View view) {
        uef();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ivm(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lw(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.yo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void moa(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.moa();
        }
    }

    private void oa() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new g(this, 1));
        LinearLayout linearLayout = new LinearLayout(this.uef);
        this.f25318oa = linearLayout;
        linearLayout.setOrientation(1);
        this.f25318oa.setGravity(80);
        this.f25318oa.setPadding(uef(16.0f), 0, uef(16.0f), uef(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(uef(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.f25318oa.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = uef(16.0f);
        this.f25318oa.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this.uef);
        yoVar.setPadding(uef(6.0f), 0, uef(6.0f), 0);
        yoVar.setLayoutParams(new LinearLayout.LayoutParams(-1, uef(44.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this.uef);
        Context context = this.uef;
        bccVar.setText(context.getString(com.bytedance.sdk.component.utils.orq.oa(context, "tt_more_title")));
        bccVar.setTextColor(Color.parseColor("#000000"));
        bccVar.setTextSize(2, 17.0f);
        bccVar.setGravity(17);
        bccVar.setTypeface(Typeface.defaultFromStyle(1));
        yoVar.addView(bccVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.uef);
        imageView.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_titlebar_close_drawable"));
        imageView.setPadding(uef(10.0f), uef(10.0f), uef(10.0f), uef(10.0f));
        final int i5 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tpx f25297b;

            {
                this.f25297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f25297b.bcc(view);
                        break;
                    case 1:
                        this.f25297b.xs(view);
                        break;
                    case 2:
                        this.f25297b.ivm(view);
                        break;
                    case 3:
                        this.f25297b.lw(view);
                        break;
                    case 4:
                        this.f25297b.moa(view);
                        break;
                    case 5:
                        this.f25297b.yo(view);
                        break;
                    default:
                        this.f25297b.oa(view);
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(uef(44.0f), uef(44.0f));
        layoutParams2.gravity = 8388629;
        yoVar.addView(imageView, layoutParams2);
        this.f25318oa.addView(yoVar);
        boolean zUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_iab_history", true);
        if (!this.moa && zUef) {
            com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef = uef(8);
            Context context2 = this.uef;
            final int i10 = 1;
            uef(lwVarUef, context2.getString(com.bytedance.sdk.component.utils.orq.oa(context2, "tt_more_history")), "tt_more_history_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tpx f25297b;

                {
                    this.f25297b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f25297b.bcc(view);
                            break;
                        case 1:
                            this.f25297b.xs(view);
                            break;
                        case 2:
                            this.f25297b.ivm(view);
                            break;
                        case 3:
                            this.f25297b.lw(view);
                            break;
                        case 4:
                            this.f25297b.moa(view);
                            break;
                        case 5:
                            this.f25297b.yo(view);
                            break;
                        default:
                            this.f25297b.oa(view);
                            break;
                    }
                }
            });
            this.f25318oa.addView(lwVarUef);
        }
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef2 = uef(8);
        Context context3 = this.uef;
        final int i11 = 2;
        uef(lwVarUef2, context3.getString(com.bytedance.sdk.component.utils.orq.oa(context3, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tpx f25297b;

            {
                this.f25297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f25297b.bcc(view);
                        break;
                    case 1:
                        this.f25297b.xs(view);
                        break;
                    case 2:
                        this.f25297b.ivm(view);
                        break;
                    case 3:
                        this.f25297b.lw(view);
                        break;
                    case 4:
                        this.f25297b.moa(view);
                        break;
                    case 5:
                        this.f25297b.yo(view);
                        break;
                    default:
                        this.f25297b.oa(view);
                        break;
                }
            }
        });
        Context context4 = this.uef;
        final int i12 = 3;
        uef(lwVarUef2, context4.getString(com.bytedance.sdk.component.utils.orq.oa(context4, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tpx f25297b;

            {
                this.f25297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f25297b.bcc(view);
                        break;
                    case 1:
                        this.f25297b.xs(view);
                        break;
                    case 2:
                        this.f25297b.ivm(view);
                        break;
                    case 3:
                        this.f25297b.lw(view);
                        break;
                    case 4:
                        this.f25297b.moa(view);
                        break;
                    case 5:
                        this.f25297b.yo(view);
                        break;
                    default:
                        this.f25297b.oa(view);
                        break;
                }
            }
        });
        Context context5 = this.uef;
        final int i13 = 4;
        uef(lwVarUef2, context5.getString(com.bytedance.sdk.component.utils.orq.oa(context5, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tpx f25297b;

            {
                this.f25297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f25297b.bcc(view);
                        break;
                    case 1:
                        this.f25297b.xs(view);
                        break;
                    case 2:
                        this.f25297b.ivm(view);
                        break;
                    case 3:
                        this.f25297b.lw(view);
                        break;
                    case 4:
                        this.f25297b.moa(view);
                        break;
                    case 5:
                        this.f25297b.yo(view);
                        break;
                    default:
                        this.f25297b.oa(view);
                        break;
                }
            }
        });
        this.f25318oa.addView(lwVarUef2);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVarUef3 = uef(8);
        if (!this.moa) {
            Context context6 = this.uef;
            final int i14 = 5;
            uef(lwVarUef3, context6.getString(com.bytedance.sdk.component.utils.orq.oa(context6, "tt_privacy")), "tt_more_privacy_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tpx f25297b;

                {
                    this.f25297b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.f25297b.bcc(view);
                            break;
                        case 1:
                            this.f25297b.xs(view);
                            break;
                        case 2:
                            this.f25297b.ivm(view);
                            break;
                        case 3:
                            this.f25297b.lw(view);
                            break;
                        case 4:
                            this.f25297b.moa(view);
                            break;
                        case 5:
                            this.f25297b.yo(view);
                            break;
                        default:
                            this.f25297b.oa(view);
                            break;
                    }
                }
            });
        }
        Context context7 = this.uef;
        final int i15 = 6;
        uef(lwVarUef3, context7.getString(com.bytedance.sdk.component.utils.orq.oa(context7, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener(this) { // from class: com.bytedance.sdk.openadsdk.common.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tpx f25297b;

            {
                this.f25297b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f25297b.bcc(view);
                        break;
                    case 1:
                        this.f25297b.xs(view);
                        break;
                    case 2:
                        this.f25297b.ivm(view);
                        break;
                    case 3:
                        this.f25297b.lw(view);
                        break;
                    case 4:
                        this.f25297b.moa(view);
                        break;
                    case 5:
                        this.f25297b.yo(view);
                        break;
                    default:
                        this.f25297b.oa(view);
                        break;
                }
            }
        });
        this.f25318oa.addView(lwVarUef3);
        addView(this.f25318oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean uef(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.f25318oa.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                uef();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xs(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yo(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.ivm();
        }
    }

    public void setOnMenuItemClickListener(uef uefVar) {
        this.yo = uefVar;
    }

    private void uef(com.bytedance.sdk.openadsdk.core.ivm.lw lwVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar2 = new com.bytedance.sdk.openadsdk.core.ivm.lw(this.uef);
        lwVar2.setOrientation(0);
        lwVar2.setGravity(16);
        lwVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.uef);
        imageView.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(uef(20.0f), uef(20.0f));
        layoutParams.setMargins(uef(16.0f), uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), uef(16.0f), uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        lwVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this.uef);
        bccVar.setText(str);
        bccVar.setTextColor(Color.parseColor("#000000"));
        bccVar.setTextSize(2, 16.0f);
        bccVar.setGravity(8388627);
        bccVar.setTypeface(Typeface.defaultFromStyle(0));
        lwVar2.addView(bccVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, uef(52.0f));
        if (lwVar.getChildCount() > 0) {
            View view = new View(this.uef);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            lwVar.addView(view, new LinearLayout.LayoutParams(-1, uef(1.0f)));
        }
        lwVar.addView(lwVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.ivm.lw uef(int i5) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this.uef);
        lwVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(uef(i5));
        gradientDrawable.setColor(-1);
        lwVar.setBackgroundDrawable(gradientDrawable);
        lwVar.setPadding(uef(8.0f), uef(8.0f), uef(8.0f), uef(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = uef(8.0f);
        lwVar.setLayoutParams(layoutParams);
        return lwVar;
    }

    public void uef(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oa(View view) {
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.lw();
        }
    }
}
