package com.waze.reports;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz {

    /* renamed from: a, reason: collision with root package name */
    final com.waze.ifs.ui.a f33747a;

    /* renamed from: b, reason: collision with root package name */
    final View f33748b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33749c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageButton f33750d;

    /* renamed from: e, reason: collision with root package name */
    private final ProgressAnimation f33751e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f33752f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewPager f33753g;

    /* renamed from: h, reason: collision with root package name */
    private cm f33754h = null;

    /* renamed from: i, reason: collision with root package name */
    private cl f33755i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f33756j;

    /* renamed from: k, reason: collision with root package name */
    private PagerAdapter f33757k;

    public bz(com.waze.ifs.ui.a aVar, View view, View.OnClickListener onClickListener) throws Resources.NotFoundException {
        this.f33747a = aVar;
        this.f33748b = view;
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        int i2 = aVar.getResources().getDisplayMetrics().widthPixels;
        this.f33749c = i2;
        TextView textView = (TextView) view.findViewById(R.id.placeTakePhotoAtLeastText);
        this.f33752f = textView;
        textView.setText(aVarA.c(R.string.ADD_A_PHOTO, new Object[0]));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.placeTakePhoto);
        this.f33750d = imageButton;
        imageButton.setOnClickListener(onClickListener);
        this.f33751e = (ProgressAnimation) view.findViewById(R.id.placeTakePhotoProgress);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.placePhotoPager);
        this.f33753g = viewPager;
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        layoutParams.height = (((i2 * 6) / 10) * 3) / 4;
        viewPager.setLayoutParams(layoutParams);
        viewPager.setPageTransformer(true, new by(this));
        viewPager.setOffscreenPageLimit(2);
    }

    public static cm e(View view, ArrayList arrayList, int i2, cl clVar) {
        Bundle bundle = new Bundle();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        bundle.putInt(TtmlNode.LEFT, iArr[0]);
        bundle.putInt("top", iArr[1]);
        bundle.putInt("width", view.getWidth());
        bundle.putInt("height", view.getHeight());
        cm cmVar = new cm(view.getContext(), arrayList, i2, bundle);
        cmVar.o(clVar);
        cmVar.setCanceledOnTouchOutside(true);
        cmVar.show();
        return cmVar;
    }

    private final void k() throws Resources.NotFoundException {
        bv bvVar = new bv(this, new bs(this, 0));
        this.f33757k = bvVar;
        ViewPager viewPager = this.f33753g;
        viewPager.setAdapter(bvVar);
        viewPager.setCurrentItem(this.f33757k.getCount() - 1);
        viewPager.postDelayed(new as(this, 2), 10L);
        ImageButton imageButton = this.f33750d;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageButton.getLayoutParams();
        if (this.f33756j.isEmpty()) {
            layoutParams.addRule(3, 0);
            layoutParams.addRule(15);
            layoutParams.topMargin = 0;
        } else {
            layoutParams.addRule(15, 0);
            layoutParams.addRule(3, R.id.placePhotoPager);
            layoutParams.topMargin = (int) (this.f33747a.getResources().getDisplayMetrics().density * (-3.0f));
        }
        imageButton.setLayoutParams(layoutParams);
        this.f33752f.setVisibility(true != this.f33756j.isEmpty() ? 8 : 0);
    }

    public final void h(boolean z) {
        ProgressAnimation progressAnimation = this.f33751e;
        if (z) {
            progressAnimation.setVisibility(0);
            progressAnimation.a();
            this.f33750d.setAlpha(0.5f);
        } else {
            progressAnimation.b();
            progressAnimation.setVisibility(8);
            this.f33750d.setAlpha(1.0f);
        }
    }

    public final void i(ArrayList arrayList, cl clVar) {
        this.f33755i = clVar;
        this.f33756j = arrayList;
        k();
    }

    public final void j(ArrayList arrayList) {
        ArrayList arrayList2 = this.f33756j;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        this.f33756j = arrayList;
        if (this.f33757k == null || size == 0 || arrayList.size() <= 0) {
            k();
        } else {
            this.f33757k.notifyDataSetChanged();
        }
        if (this.f33754h != null) {
            int size2 = this.f33756j.size();
            cm cmVar = this.f33754h;
            if (size2 > 0) {
                cmVar.q(this.f33756j);
            } else {
                cmVar.dismiss();
                this.f33754h = null;
            }
        }
    }
}
