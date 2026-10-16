package com.bytedance.sdk.openadsdk.core.cq.oa.lw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m0;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.adsdk.ugeno.yoga.oa.yo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class uef extends FrameLayout {
    private moa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final List<yo> f25527oa;
    private final RecyclerView uef;
    private final C0083uef yo;

    public static class oa extends m0 {
        private final ViewGroup uef;

        public oa(View view) {
            super(view);
            this.uef = (ViewGroup) view;
        }

        public void uef(yo yoVar) {
            View viewDj = yoVar.dj();
            ViewParent parent = viewDj.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewDj);
            }
            this.uef.removeAllViews();
            this.uef.addView(viewDj, new yo.uef(yoVar.km(), yoVar.pu()));
        }
    }

    public uef(Context context) {
        super(context);
        this.f25527oa = new CopyOnWriteArrayList();
        C0083uef c0083uef = new C0083uef();
        this.yo = c0083uef;
        RecyclerView recyclerView = new RecyclerView(context);
        this.uef = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0083uef);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.ivm();
        }
        super.onLayout(z2, i5, i10, i11, i12);
        moa moaVar2 = this.moa;
        if (moaVar2 != null) {
            moaVar2.uef(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.moa;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        } else {
            super.onMeasure(i5, i10);
        }
        moa moaVar2 = this.moa;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void setOrientation(int i5) {
        if (i5 == 1) {
            RecyclerView recyclerView = this.uef;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        } else {
            RecyclerView recyclerView2 = this.uef;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
        if (yoVar == null) {
            return;
        }
        this.f25527oa.add(yoVar);
        C0083uef c0083uef = this.yo;
        if (c0083uef != null) {
            c0083uef.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.oa.lw.uef$uef, reason: collision with other inner class name */
    public class C0083uef extends I {
        private C0083uef() {
        }

        @Override // androidx.recyclerview.widget.I
        public int getItemCount() {
            return uef.this.f25527oa.size();
        }

        @Override // androidx.recyclerview.widget.I
        public int getItemViewType(int i5) {
            return i5;
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public oa onCreateViewHolder(ViewGroup viewGroup, int i5) {
            com.bytedance.adsdk.ugeno.yoga.oa.yo yoVar = new com.bytedance.adsdk.ugeno.yoga.oa.yo(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.oa.yo yoVar2 = (com.bytedance.adsdk.ugeno.oa.yo) uef.this.f25527oa.get(i5);
            yoVar.setLayoutParams(new ViewGroup.LayoutParams(yoVar2.km(), yoVar2.pu()));
            return new oa(yoVar);
        }

        @Override // androidx.recyclerview.widget.I
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(oa oaVar, int i5) {
            oaVar.uef((com.bytedance.adsdk.ugeno.oa.yo) uef.this.f25527oa.get(i5));
        }
    }

    public void uef(moa moaVar) {
        this.moa = moaVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.oa.lw.oa oaVar) {
        ViewGroup.LayoutParams layoutParams = this.uef.getLayoutParams();
        layoutParams.width = oaVar.km();
        layoutParams.height = oaVar.pu();
        this.uef.setLayoutParams(layoutParams);
    }
}
