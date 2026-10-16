package com.bytedance.adsdk.ugeno.ivm.uef;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ivm.moa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uef extends LinearLayout {
    private boolean bcc;
    private int cz;
    private float dj;
    private int ivm;
    private int lw;
    private List<View> moa;

    /* renamed from: oa, reason: collision with root package name */
    protected int f24723oa;
    protected Context uef;
    private String wrv;
    private int xs;
    protected int yo;
    private float zjm;

    public uef(Context context) {
        super(context);
        this.lw = -65536;
        this.ivm = -16776961;
        this.xs = 5;
        this.f24723oa = 40;
        this.yo = 20;
        this.wrv = "row";
        this.uef = context;
        this.moa = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.dj) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.zjm) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.moa.size();
    }

    public abstract Drawable oa(int i5);

    public void oa() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof oa) {
            this.yo = this.f24723oa;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f24723oa, this.yo);
        if (getOrientation() == 1) {
            int i5 = this.xs;
            layoutParams.topMargin = i5;
            layoutParams.bottomMargin = i5;
        } else {
            int i10 = this.xs;
            layoutParams.leftMargin = i10;
            layoutParams.rightMargin = i10;
        }
        addView(view, layoutParams);
        view.setBackground(oa(this.ivm));
        this.moa.add(view);
    }

    public void setIndicatorDirection(String str) {
        this.wrv = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i5) {
        this.yo = i5;
    }

    public void setIndicatorWidth(int i5) {
        this.f24723oa = i5;
    }

    public void setIndicatorX(float f10) {
        this.zjm = f10;
    }

    public void setIndicatorY(float f10) {
        this.dj = f10;
    }

    public void setLoop(boolean z2) {
        this.bcc = z2;
    }

    public void setSelectedColor(int i5) {
        this.lw = i5;
    }

    public void setUnSelectedColor(int i5) {
        this.ivm = i5;
    }

    public void yo() {
        this.moa.clear();
        removeAllViews();
    }

    public void uef(int i5, int i10) {
        Iterator<View> it = this.moa.iterator();
        while (it.hasNext()) {
            it.next().setBackground(oa(this.ivm));
        }
        if (i5 < 0 || i5 >= this.moa.size()) {
            i5 = 0;
        }
        if (this.moa.size() > 0) {
            this.moa.get(i5).setBackground(oa(this.lw));
            this.cz = i10;
        }
    }

    public void uef() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ivm.uef.uef.1
            @Override // java.lang.Runnable
            public void run() {
                uef.this.moa();
            }
        });
    }

    public void uef(int i5) {
        if (this instanceof oa) {
            this.yo = this.f24723oa;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f24723oa, this.yo);
        if (getOrientation() == 1) {
            int i10 = this.xs;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.xs;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f24723oa, this.yo);
        if (getOrientation() == 1) {
            int i12 = this.xs;
            layoutParams2.topMargin = i12;
            layoutParams2.bottomMargin = i12;
        } else {
            int i13 = this.xs;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i13;
        }
        int iUef = moa.uef(this.bcc, this.cz, this.moa.size());
        int iUef2 = moa.uef(this.bcc, i5, this.moa.size());
        if (this.moa.size() == 0) {
            iUef2 = 0;
        }
        if (!this.moa.isEmpty() && moa.uef(iUef, this.moa) && moa.uef(iUef2, this.moa)) {
            this.moa.get(iUef).setBackground(oa(this.ivm));
            this.moa.get(iUef).setLayoutParams(layoutParams2);
            this.moa.get(iUef2).setBackground(oa(this.lw));
            this.moa.get(iUef2).setLayoutParams(layoutParams);
            this.cz = i5;
        }
    }
}
