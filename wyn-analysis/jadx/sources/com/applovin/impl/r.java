package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class r extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f22633a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f22634b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f22635c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f22636d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f22633a = viewGroup;
        this.f22634b = size;
        this.f22635c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f22636d.removeView(this.f22633a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f22635c, this.f22634b.getWidth()), AppLovinSdkUtils.dpToPx(this.f22635c, this.f22634b.getHeight()));
        layoutParams.addRule(13);
        this.f22633a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f22635c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f22635c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f22635c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i5 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.K0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f20796b;

            {
                this.f20796b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f20796b.a(view);
                        break;
                    default:
                        this.f20796b.b(view);
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f22635c);
        this.f22636d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f22636d.setBackgroundColor(Integer.MIN_VALUE);
        this.f22636d.addView(imageButton);
        this.f22636d.addView(this.f22633a);
        final int i10 = 1;
        this.f22636d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.K0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f20796b;

            {
                this.f20796b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f20796b.a(view);
                        break;
                    default:
                        this.f20796b.b(view);
                        break;
                }
            }
        });
        setContentView(this.f22636d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
