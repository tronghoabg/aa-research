package com.bytedance.adsdk.ugeno.lw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bytedance.adsdk.ugeno.lw.moa;
import com.bytedance.adsdk.ugeno.xs.xs;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lw extends ViewGroup implements com.bytedance.adsdk.ugeno.lw.uef {

    /* renamed from: ab, reason: collision with root package name */
    private List<yo> f24727ab;
    private Drawable bcc;
    private com.bytedance.adsdk.ugeno.moa bs;
    private int[] cq;
    private int cz;
    private int dj;
    private SparseIntArray dz;
    private int ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24728oa;
    private moa.uef sy;
    private int uef;
    private moa wk;
    private int wrv;
    private Drawable xs;
    private int yo;
    private int zjm;

    public static class uef extends ViewGroup.MarginLayoutParams implements oa {
        public static final Parcelable.Creator<uef> CREATOR = new Parcelable.Creator<uef>() { // from class: com.bytedance.adsdk.ugeno.lw.lw.uef.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public uef createFromParcel(Parcel parcel) {
                return new uef(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public uef[] newArray(int i5) {
                return new uef[i5];
            }
        };
        private int bcc;
        private int cz;
        private int ivm;
        private float lw;
        private int moa;

        /* renamed from: oa, reason: collision with root package name */
        private float f24729oa;
        private int uef;
        private int xs;
        private float yo;
        private boolean zjm;

        public uef(uef uefVar) {
            super((ViewGroup.MarginLayoutParams) uefVar);
            this.uef = 1;
            this.f24729oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.moa = -1;
            this.lw = -1.0f;
            this.ivm = -1;
            this.xs = -1;
            this.bcc = 16777215;
            this.cz = 16777215;
            this.uef = uefVar.uef;
            this.f24729oa = uefVar.f24729oa;
            this.yo = uefVar.yo;
            this.moa = uefVar.moa;
            this.lw = uefVar.lw;
            this.ivm = uefVar.ivm;
            this.xs = uefVar.xs;
            this.bcc = uefVar.bcc;
            this.cz = uefVar.cz;
            this.zjm = uefVar.zjm;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int ab() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int bcc() {
            return this.xs;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int cq() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int cz() {
            return this.bcc;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public boolean dj() {
            return this.zjm;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int dz() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int ivm() {
            return this.moa;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public float lw() {
            return this.yo;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public float moa() {
            return this.f24729oa;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int oa() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int uef() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int wk() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.uef);
            parcel.writeFloat(this.f24729oa);
            parcel.writeFloat(this.yo);
            parcel.writeInt(this.moa);
            parcel.writeFloat(this.lw);
            parcel.writeInt(this.ivm);
            parcel.writeInt(this.xs);
            parcel.writeInt(this.bcc);
            parcel.writeInt(this.cz);
            parcel.writeByte(this.zjm ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public float wrv() {
            return this.lw;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int xs() {
            return this.ivm;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int yo() {
            return this.uef;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public int zjm() {
            return this.cz;
        }

        public void moa(int i5) {
            this.moa = i5;
        }

        public void oa(float f10) {
            this.yo = f10;
        }

        public void uef(float f10) {
            this.f24729oa = f10;
        }

        public void yo(int i5) {
            this.uef = i5;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public void oa(int i5) {
            this.xs = i5;
        }

        @Override // com.bytedance.adsdk.ugeno.lw.oa
        public void uef(int i5) {
            this.ivm = i5;
        }

        public void yo(float f10) {
            this.lw = f10;
        }

        public uef(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.uef = 1;
            this.f24729oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.moa = -1;
            this.lw = -1.0f;
            this.ivm = -1;
            this.xs = -1;
            this.bcc = 16777215;
            this.cz = 16777215;
        }

        public uef(int i5, int i10) {
            super(new ViewGroup.LayoutParams(i5, i10));
            this.uef = 1;
            this.f24729oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.moa = -1;
            this.lw = -1.0f;
            this.ivm = -1;
            this.xs = -1;
            this.bcc = 16777215;
            this.cz = 16777215;
        }

        public uef(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.uef = 1;
            this.f24729oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.moa = -1;
            this.lw = -1.0f;
            this.ivm = -1;
            this.xs = -1;
            this.bcc = 16777215;
            this.cz = 16777215;
        }

        public uef(Parcel parcel) {
            super(0, 0);
            this.uef = 1;
            this.f24729oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.moa = -1;
            this.lw = -1.0f;
            this.ivm = -1;
            this.xs = -1;
            this.bcc = 16777215;
            this.cz = 16777215;
            this.uef = parcel.readInt();
            this.f24729oa = parcel.readFloat();
            this.yo = parcel.readFloat();
            this.moa = parcel.readInt();
            this.lw = parcel.readFloat();
            this.ivm = parcel.readInt();
            this.xs = parcel.readInt();
            this.bcc = parcel.readInt();
            this.cz = parcel.readInt();
            this.zjm = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public lw(Context context) {
        super(context, null);
        this.ivm = -1;
        this.wk = new moa(this);
        this.f24727ab = new ArrayList();
        this.sy = new moa.uef();
    }

    private boolean ivm(int i5) {
        if (i5 >= 0 && i5 < this.f24727ab.size()) {
            for (int i10 = i5 + 1; i10 < this.f24727ab.size(); i10++) {
                if (this.f24727ab.get(i10).oa() > 0) {
                    return false;
                }
            }
            if (uef()) {
                return (this.cz & 4) != 0;
            }
            if ((this.zjm & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean lw(int i5, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View viewYo = yo(i5 - i11);
            if (viewYo != null && viewYo.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean moa(int i5, int i10) {
        return lw(i5, i10) ? uef() ? (this.zjm & 1) != 0 : (this.cz & 1) != 0 : uef() ? (this.zjm & 2) != 0 : (this.cz & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (this.dz == null) {
            this.dz = new SparseIntArray(getChildCount());
        }
        this.cq = this.wk.uef(view, i5, layoutParams, this.dz);
        super.addView(view, i5, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof uef;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof uef ? new uef((uef) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new uef((ViewGroup.MarginLayoutParams) layoutParams) : new uef(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getAlignContent() {
        return this.lw;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getAlignItems() {
        return this.moa;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.xs;
    }

    public Drawable getDividerDrawableVertical() {
        return this.bcc;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getFlexDirection() {
        return this.uef;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<yo> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f24727ab.size());
        for (yo yoVar : this.f24727ab) {
            if (yoVar.oa() != 0) {
                arrayList.add(yoVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public List<yo> getFlexLinesInternal() {
        return this.f24727ab;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getFlexWrap() {
        return this.f24728oa;
    }

    public int getJustifyContent() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getLargestMainSize() {
        Iterator<yo> it = this.f24727ab.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().lw);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getMaxLine() {
        return this.ivm;
    }

    public int getShowDividerHorizontal() {
        return this.cz;
    }

    public int getShowDividerVertical() {
        return this.zjm;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int getSumOfCrossSize() {
        int size = this.f24727ab.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yo yoVar = this.f24727ab.get(i10);
            if (moa(i10)) {
                i5 += uef() ? this.dj : this.wrv;
            }
            if (ivm(i10)) {
                i5 += uef() ? this.dj : this.wrv;
            }
            i5 += yoVar.xs;
        }
        return i5;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public View oa(int i5) {
        return yo(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.moa moaVar = this.bs;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.moa moaVar = this.bs;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.bcc == null && this.xs == null) {
            return;
        }
        if (this.cz == 0 && this.zjm == 0) {
            return;
        }
        int iUef = xs.uef(this);
        int i5 = this.uef;
        if (i5 == 0) {
            uef(canvas, iUef == 1, this.f24728oa == 2);
            return;
        }
        if (i5 == 1) {
            uef(canvas, iUef != 1, this.f24728oa == 2);
            return;
        }
        if (i5 == 2) {
            boolean z2 = iUef == 1;
            if (this.f24728oa == 2) {
                z2 = !z2;
            }
            oa(canvas, z2, false);
            return;
        }
        if (i5 != 3) {
            return;
        }
        boolean z10 = iUef == 1;
        if (this.f24728oa == 2) {
            z10 = !z10;
        }
        oa(canvas, z10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        boolean z10;
        lw lwVar;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        lw lwVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        com.bytedance.adsdk.ugeno.moa moaVar = this.bs;
        if (moaVar != null) {
            moaVar.ivm();
        }
        int iUef = xs.uef(this);
        int i21 = this.uef;
        if (i21 == 0) {
            if (iUef == 1) {
                z10 = true;
                lwVar = this;
                i13 = i5;
                i16 = i10;
                i15 = i12;
                i14 = i11;
            } else {
                z10 = false;
                lwVar = this;
                i13 = i5;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            lwVar.uef(z10, i13, i16, i14, i15);
        } else if (i21 == 1) {
            if (iUef != 1) {
                z11 = true;
                lwVar2 = this;
                i17 = i5;
                i20 = i10;
                i19 = i12;
                i18 = i11;
            } else {
                z11 = false;
                lwVar2 = this;
                i17 = i5;
                i18 = i11;
                i19 = i12;
                i20 = i10;
            }
            lwVar2.uef(z11, i17, i20, i18, i19);
        } else if (i21 == 2) {
            z12 = iUef == 1;
            if (this.f24728oa == 2) {
                z12 = !z12;
            }
            uef(z12, false, i5, i10, i11, i12);
        } else {
            if (i21 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.uef);
            }
            z12 = iUef == 1;
            if (this.f24728oa == 2) {
                z12 = !z12;
            }
            uef(z12, true, i5, i10, i11, i12);
        }
        com.bytedance.adsdk.ugeno.moa moaVar2 = this.bs;
        if (moaVar2 != null) {
            moaVar2.uef(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        com.bytedance.adsdk.ugeno.moa moaVar = this.bs;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            uef(iArrUef[0], iArrUef[1]);
        } else {
            uef(i5, i10);
        }
        com.bytedance.adsdk.ugeno.moa moaVar2 = this.bs;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        com.bytedance.adsdk.ugeno.moa moaVar = this.bs;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void setAlignContent(int i5) {
        if (this.lw != i5) {
            this.lw = i5;
            requestLayout();
        }
    }

    public void setAlignItems(int i5) {
        if (this.moa != i5) {
            this.moa = i5;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.xs) {
            return;
        }
        this.xs = drawable;
        if (drawable != null) {
            this.dj = drawable.getIntrinsicHeight();
        } else {
            this.dj = 0;
        }
        oa();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.bcc) {
            return;
        }
        this.bcc = drawable;
        if (drawable != null) {
            this.wrv = drawable.getIntrinsicWidth();
        } else {
            this.wrv = 0;
        }
        oa();
        requestLayout();
    }

    public void setFlexDirection(int i5) {
        if (this.uef != i5) {
            this.uef = i5;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public void setFlexLines(List<yo> list) {
        this.f24727ab = list;
    }

    public void setFlexWrap(int i5) {
        if (this.f24728oa != i5) {
            this.f24728oa = i5;
            requestLayout();
        }
    }

    public void setJustifyContent(int i5) {
        if (this.yo != i5) {
            this.yo = i5;
            requestLayout();
        }
    }

    public void setMaxLine(int i5) {
        if (this.ivm != i5) {
            this.ivm = i5;
            requestLayout();
        }
    }

    public void setShowDivider(int i5) {
        setShowDividerVertical(i5);
        setShowDividerHorizontal(i5);
    }

    public void setShowDividerHorizontal(int i5) {
        if (i5 != this.cz) {
            this.cz = i5;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i5) {
        if (i5 != this.zjm) {
            this.zjm = i5;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int uef(View view) {
        return 0;
    }

    public View yo(int i5) {
        if (i5 < 0) {
            return null;
        }
        int[] iArr = this.cq;
        if (i5 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i5]);
    }

    private void oa(int i5, int i10) {
        this.f24727ab.clear();
        this.sy.uef();
        this.wk.uef(this.sy, i5, i10);
        this.f24727ab = this.sy.uef;
        this.wk.uef(i5, i10);
        if (this.moa == 3) {
            for (yo yoVar : this.f24727ab) {
                int iMax = Integer.MIN_VALUE;
                for (int i11 = 0; i11 < yoVar.bcc; i11++) {
                    View viewYo = yo(yoVar.wk + i11);
                    if (viewYo != null && viewYo.getVisibility() != 8) {
                        uef uefVar = (uef) viewYo.getLayoutParams();
                        iMax = this.f24728oa != 2 ? Math.max(iMax, viewYo.getMeasuredHeight() + Math.max(yoVar.wrv - viewYo.getBaseline(), ((ViewGroup.MarginLayoutParams) uefVar).topMargin) + ((ViewGroup.MarginLayoutParams) uefVar).bottomMargin) : Math.max(iMax, viewYo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) uefVar).topMargin + Math.max(viewYo.getBaseline() + (yoVar.wrv - viewYo.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) uefVar).bottomMargin));
                    }
                }
                yoVar.xs = iMax;
            }
        }
        this.wk.oa(i5, i10, getPaddingBottom() + getPaddingTop());
        this.wk.uef();
        uef(this.uef, i5, i10, this.sy.f24732oa);
    }

    private void uef(int i5, int i10) {
        if (this.dz == null) {
            this.dz = new SparseIntArray(getChildCount());
        }
        if (this.wk.oa(this.dz)) {
            this.cq = this.wk.uef(this.dz);
        }
        int i11 = this.uef;
        if (i11 == 0 || i11 == 1) {
            oa(i5, i10);
        } else if (i11 == 2 || i11 == 3) {
            yo(i5, i10);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.uef);
        }
    }

    private boolean lw(int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f24727ab.get(i10).oa() > 0) {
                return false;
            }
        }
        return true;
    }

    private void yo(int i5, int i10) {
        this.f24727ab.clear();
        this.sy.uef();
        this.wk.oa(this.sy, i5, i10);
        this.f24727ab = this.sy.uef;
        this.wk.uef(i5, i10);
        this.wk.oa(i5, i10, getPaddingRight() + getPaddingLeft());
        this.wk.uef();
        uef(this.uef, i5, i10, this.sy.f24732oa);
    }

    private boolean moa(int i5) {
        if (i5 >= 0 && i5 < this.f24727ab.size()) {
            if (lw(i5)) {
                return uef() ? (this.cz & 1) != 0 : (this.zjm & 1) != 0;
            }
            if (uef()) {
                return (this.cz & 2) != 0;
            }
            if ((this.zjm & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public View uef(int i5) {
        return getChildAt(i5);
    }

    private void uef(int i5, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i5 == 0 || i5 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i5 != 2 && i5 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i5)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void oa(Canvas canvas, boolean z2, boolean z10) {
        int i5;
        int i10;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f24727ab.size();
        for (int i11 = 0; i11 < size; i11++) {
            yo yoVar = this.f24727ab.get(i11);
            for (int i12 = 0; i12 < yoVar.bcc; i12++) {
                int i13 = yoVar.wk + i12;
                View viewYo = yo(i13);
                if (viewYo != null && viewYo.getVisibility() != 8) {
                    uef uefVar = (uef) viewYo.getLayoutParams();
                    if (moa(i13, i12)) {
                        if (z10) {
                            top = viewYo.getBottom() + ((ViewGroup.MarginLayoutParams) uefVar).bottomMargin;
                        } else {
                            top = (viewYo.getTop() - ((ViewGroup.MarginLayoutParams) uefVar).topMargin) - this.dj;
                        }
                        oa(canvas, yoVar.uef, top, yoVar.xs);
                    }
                    if (i12 == yoVar.bcc - 1 && (this.cz & 4) > 0) {
                        if (z10) {
                            bottom = (viewYo.getTop() - ((ViewGroup.MarginLayoutParams) uefVar).topMargin) - this.dj;
                        } else {
                            bottom = viewYo.getBottom() + ((ViewGroup.MarginLayoutParams) uefVar).bottomMargin;
                        }
                        oa(canvas, yoVar.uef, bottom, yoVar.xs);
                    }
                }
            }
            if (moa(i11)) {
                if (z2) {
                    i10 = yoVar.yo;
                } else {
                    i10 = yoVar.uef - this.wrv;
                }
                uef(canvas, i10, paddingTop, iMax);
            }
            if (ivm(i11) && (this.zjm & 4) > 0) {
                if (z2) {
                    i5 = yoVar.uef - this.wrv;
                } else {
                    i5 = yoVar.yo;
                }
                uef(canvas, i5, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public boolean uef() {
        int i5 = this.uef;
        return i5 == 0 || i5 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.lw.uef(boolean, int, int, int, int):void");
    }

    private void oa(Canvas canvas, int i5, int i10, int i11) {
        Drawable drawable = this.xs;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i5, i10, i11 + i5, this.dj + i10);
        this.xs.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int oa(int i5, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i5, i10, i11);
    }

    private void oa() {
        if (this.xs == null && this.bcc == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.lw.uef(boolean, boolean, int, int, int, int):void");
    }

    private void uef(Canvas canvas, boolean z2, boolean z10) {
        int i5;
        int i10;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f24727ab.size();
        for (int i11 = 0; i11 < size; i11++) {
            yo yoVar = this.f24727ab.get(i11);
            for (int i12 = 0; i12 < yoVar.bcc; i12++) {
                int i13 = yoVar.wk + i12;
                View viewYo = yo(i13);
                if (viewYo != null && viewYo.getVisibility() != 8) {
                    uef uefVar = (uef) viewYo.getLayoutParams();
                    if (moa(i13, i12)) {
                        if (z2) {
                            left = viewYo.getRight() + ((ViewGroup.MarginLayoutParams) uefVar).rightMargin;
                        } else {
                            left = (viewYo.getLeft() - ((ViewGroup.MarginLayoutParams) uefVar).leftMargin) - this.wrv;
                        }
                        uef(canvas, left, yoVar.f24734oa, yoVar.xs);
                    }
                    if (i12 == yoVar.bcc - 1 && (this.zjm & 4) > 0) {
                        if (z2) {
                            right = (viewYo.getLeft() - ((ViewGroup.MarginLayoutParams) uefVar).leftMargin) - this.wrv;
                        } else {
                            right = viewYo.getRight() + ((ViewGroup.MarginLayoutParams) uefVar).rightMargin;
                        }
                        uef(canvas, right, yoVar.f24734oa, yoVar.xs);
                    }
                }
            }
            if (moa(i11)) {
                if (z10) {
                    i10 = yoVar.moa;
                } else {
                    i10 = yoVar.f24734oa - this.dj;
                }
                oa(canvas, paddingLeft, i10, iMax);
            }
            if (ivm(i11) && (this.cz & 4) > 0) {
                if (z10) {
                    i5 = yoVar.f24734oa - this.dj;
                } else {
                    i5 = yoVar.moa;
                }
                oa(canvas, paddingLeft, i5, iMax);
            }
        }
    }

    private void uef(Canvas canvas, int i5, int i10, int i11) {
        Drawable drawable = this.bcc;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i5, i10, this.wrv + i5, i11 + i10);
        this.bcc.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int uef(View view, int i5, int i10) {
        int i11;
        int i12;
        if (uef()) {
            i11 = moa(i5, i10) ? this.wrv : 0;
            if ((this.zjm & 4) <= 0) {
                return i11;
            }
            i12 = this.wrv;
        } else {
            i11 = moa(i5, i10) ? this.dj : 0;
            if ((this.cz & 4) <= 0) {
                return i11;
            }
            i12 = this.dj;
        }
        return i11 + i12;
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public void uef(yo yoVar) {
        if (uef()) {
            if ((this.zjm & 4) > 0) {
                int i5 = yoVar.lw;
                int i10 = this.wrv;
                yoVar.lw = i5 + i10;
                yoVar.ivm += i10;
                return;
            }
            return;
        }
        if ((this.cz & 4) > 0) {
            int i11 = yoVar.lw;
            int i12 = this.dj;
            yoVar.lw = i11 + i12;
            yoVar.ivm += i12;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public int uef(int i5, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i5, i10, i11);
    }

    @Override // com.bytedance.adsdk.ugeno.lw.uef
    public void uef(View view, int i5, int i10, yo yoVar) {
        if (moa(i5, i10)) {
            if (uef()) {
                int i11 = yoVar.lw;
                int i12 = this.wrv;
                yoVar.lw = i11 + i12;
                yoVar.ivm += i12;
                return;
            }
            int i13 = yoVar.lw;
            int i14 = this.dj;
            yoVar.lw = i13 + i14;
            yoVar.ivm += i14;
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.bs = yoVar;
    }
}
