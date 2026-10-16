package com.bytedance.adsdk.ugeno.lw;

import Va.M6;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class moa {
    static final /* synthetic */ boolean yo = true;
    private long[] ivm;
    private boolean[] lw;
    private final com.bytedance.adsdk.ugeno.lw.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    long[] f24730oa;
    int[] uef;

    public static class oa implements Comparable<oa> {

        /* renamed from: oa, reason: collision with root package name */
        int f24731oa;
        int uef;

        private oa() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f24731oa);
            sb2.append(", index=");
            return M6.r(sb2, this.uef, '}');
        }

        @Override // java.lang.Comparable
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compareTo(oa oaVar) {
            int i5 = this.f24731oa;
            int i10 = oaVar.f24731oa;
            return i5 != i10 ? i5 - i10 : this.uef - oaVar.uef;
        }
    }

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        int f24732oa;
        List<yo> uef;

        public void uef() {
            this.uef = null;
            this.f24732oa = 0;
        }
    }

    public moa(com.bytedance.adsdk.ugeno.lw.uef uefVar) {
        this.moa = uefVar;
    }

    private int ivm(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        return z2 ? oaVar.ab() : oaVar.wk();
    }

    private int lw(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        return z2 ? oaVar.dz() : oaVar.cq();
    }

    private int moa(boolean z2) {
        return z2 ? this.moa.getPaddingBottom() : this.moa.getPaddingEnd();
    }

    private int yo(boolean z2) {
        return z2 ? this.moa.getPaddingTop() : this.moa.getPaddingStart();
    }

    public int oa(long j8) {
        return (int) (j8 >> 32);
    }

    public int uef(long j8) {
        return (int) j8;
    }

    public long oa(int i5, int i10) {
        return (i5 & 4294967295L) | (i10 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] uef(View view, int i5, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.moa.getFlexItemCount();
        List<oa> listOa = oa(flexItemCount);
        oa oaVar = new oa();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.lw.oa)) {
            oaVar.f24731oa = 1;
        } else {
            oaVar.f24731oa = ((com.bytedance.adsdk.ugeno.lw.oa) layoutParams).yo();
        }
        if (i5 == -1 || i5 == flexItemCount || i5 >= this.moa.getFlexItemCount()) {
            oaVar.uef = flexItemCount;
        } else {
            oaVar.uef = i5;
            while (i5 < flexItemCount) {
                listOa.get(i5).uef++;
                i5++;
            }
        }
        listOa.add(oaVar);
        return uef(flexItemCount + 1, listOa, sparseIntArray);
    }

    private int moa(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        if (z2) {
            return oaVar.wk();
        }
        return oaVar.ab();
    }

    private List<oa> oa(int i5) {
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) this.moa.uef(i10).getLayoutParams();
            oa oaVar2 = new oa();
            oaVar2.f24731oa = oaVar.yo();
            oaVar2.uef = i10;
            arrayList.add(oaVar2);
        }
        return arrayList;
    }

    private int yo(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        if (z2) {
            return oaVar.cq();
        }
        return oaVar.dz();
    }

    private void yo(int i5) {
        boolean[] zArr = this.lw;
        if (zArr == null) {
            this.lw = new boolean[Math.max(i5, 10)];
        } else if (zArr.length < i5) {
            this.lw = new boolean[Math.max(zArr.length * 2, i5)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean oa(SparseIntArray sparseIntArray) {
        int flexItemCount = this.moa.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return yo;
        }
        for (int i5 = 0; i5 < flexItemCount; i5++) {
            View viewUef = this.moa.uef(i5);
            if (viewUef != null && ((com.bytedance.adsdk.ugeno.lw.oa) viewUef.getLayoutParams()).yo() != sparseIntArray.get(i5)) {
                return yo;
            }
        }
        return false;
    }

    public void oa(uef uefVar, int i5, int i10) {
        uef(uefVar, i10, i5, f.API_PRIORITY_OTHER, 0, -1, (List<yo>) null);
    }

    private int oa(boolean z2) {
        if (z2) {
            return this.moa.getPaddingEnd();
        }
        return this.moa.getPaddingBottom();
    }

    public int[] uef(SparseIntArray sparseIntArray) {
        int flexItemCount = this.moa.getFlexItemCount();
        return uef(flexItemCount, oa(flexItemCount), sparseIntArray);
    }

    private int oa(View view, boolean z2) {
        if (z2) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] uef(int i5, List<oa> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i5];
        int i10 = 0;
        for (oa oaVar : list) {
            int i11 = oaVar.uef;
            iArr[i10] = i11;
            sparseIntArray.append(i11, oaVar.f24731oa);
            i10++;
        }
        return iArr;
    }

    private int oa(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        if (z2) {
            return oaVar.oa();
        }
        return oaVar.uef();
    }

    private void oa(int i5, int i10, yo yoVar, int i11, int i12, boolean z2) {
        float f10;
        float f11;
        int iMax;
        int iXs;
        int i13 = yoVar.lw;
        float f12 = yoVar.dj;
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i11 > i13) {
            return;
        }
        float f14 = (i13 - i11) / f12;
        yoVar.lw = i12 + yoVar.ivm;
        if (!z2) {
            yoVar.xs = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        float f15 = 0.0f;
        while (i14 < yoVar.bcc) {
            int i16 = yoVar.wk + i14;
            View viewOa = this.moa.oa(i16);
            if (viewOa == null || viewOa.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) viewOa.getLayoutParams();
                int flexDirection = this.moa.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewOa.getMeasuredHeight();
                    long[] jArr = this.ivm;
                    if (jArr != null) {
                        measuredHeight = oa(jArr[i16]);
                    }
                    int measuredWidth = viewOa.getMeasuredWidth();
                    long[] jArr2 = this.ivm;
                    if (jArr2 != null) {
                        measuredWidth = uef(jArr2[i16]);
                    }
                    if (!this.lw[i16] && oaVar.lw() > f10) {
                        float fLw = measuredHeight - (oaVar.lw() * f14);
                        if (i14 == yoVar.bcc - 1) {
                            fLw += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fLw);
                        if (iRound < oaVar.bcc()) {
                            iRound = oaVar.bcc();
                            this.lw[i16] = yo;
                            yoVar.dj -= oaVar.lw();
                            z10 = true;
                        } else {
                            float f16 = (fLw - iRound) + f15;
                            double d3 = f16;
                            if (d3 > 1.0d) {
                                iRound++;
                                f16 -= 1.0f;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                f16 += 1.0f;
                            }
                            f15 = f16;
                        }
                        int iUef = uef(i5, oaVar, yoVar.cq);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewOa.measure(iUef, iMakeMeasureSpec);
                        int measuredWidth2 = viewOa.getMeasuredWidth();
                        int measuredHeight2 = viewOa.getMeasuredHeight();
                        uef(i16, iUef, iMakeMeasureSpec, viewOa);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i15, oaVar.wk() + oaVar.cq() + measuredWidth + this.moa.uef(viewOa));
                    yoVar.lw = oaVar.ab() + oaVar.dz() + measuredHeight + yoVar.lw;
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewOa.getMeasuredWidth();
                    long[] jArr3 = this.ivm;
                    if (jArr3 != null) {
                        measuredWidth3 = uef(jArr3[i16]);
                    }
                    int measuredHeight3 = viewOa.getMeasuredHeight();
                    long[] jArr4 = this.ivm;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = oa(jArr4[i16]);
                    }
                    if (!this.lw[i16] && oaVar.lw() > f10) {
                        float fLw2 = measuredWidth3 - (oaVar.lw() * f11);
                        if (i14 == yoVar.bcc - 1) {
                            fLw2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fLw2);
                        if (iRound2 < oaVar.xs()) {
                            iXs = oaVar.xs();
                            this.lw[i16] = yo;
                            yoVar.dj -= oaVar.lw();
                            z10 = true;
                        } else {
                            float f17 = (fLw2 - iRound2) + f15;
                            double d5 = f17;
                            if (d5 > 1.0d) {
                                iXs = iRound2 + 1;
                                f17 -= 1.0f;
                            } else if (d5 < -1.0d) {
                                iXs = iRound2 - 1;
                                f17 += 1.0f;
                            } else {
                                iXs = iRound2;
                            }
                            f15 = f17;
                        }
                        int iOa = oa(i10, oaVar, yoVar.cq);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iXs, 1073741824);
                        viewOa.measure(iMakeMeasureSpec2, iOa);
                        int measuredWidth4 = viewOa.getMeasuredWidth();
                        int measuredHeight4 = viewOa.getMeasuredHeight();
                        uef(i16, iMakeMeasureSpec2, iOa, viewOa);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i15, oaVar.ab() + oaVar.dz() + measuredHeight3 + this.moa.uef(viewOa));
                    yoVar.lw = oaVar.wk() + oaVar.cq() + measuredWidth3 + yoVar.lw;
                    iMax = iMax2;
                }
                yoVar.xs = Math.max(yoVar.xs, iMax);
                i15 = iMax;
            }
            i14++;
            f14 = f11;
            f13 = f10;
        }
        if (!z10 || i13 == yoVar.lw) {
            return;
        }
        oa(i5, i10, yoVar, i11, i12, yo);
    }

    public void uef(uef uefVar, int i5, int i10) {
        uef(uefVar, i5, i10, f.API_PRIORITY_OTHER, 0, -1, (List<yo>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void uef(uef uefVar, int i5, int i10, int i11, int i12, int i13, List<yo> list) {
        int i14;
        uef uefVar2;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iUef;
        int i20;
        int i21;
        yo yoVar;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = i5;
        boolean zUef = this.moa.uef();
        int mode = View.MeasureSpec.getMode(i27);
        int size = View.MeasureSpec.getSize(i27);
        List<yo> arrayList = list == null ? new ArrayList() : list;
        uefVar.uef = arrayList;
        boolean z10 = i13 == -1 ? yo : false;
        int iUef2 = uef(zUef);
        int iOa = oa(zUef);
        int iYo = yo(zUef);
        int iMoa = moa(zUef);
        yo yoVar2 = new yo();
        int i28 = i12;
        yoVar2.wk = i28;
        int i29 = iUef2 + iOa;
        yoVar2.lw = i29;
        int flexItemCount = this.moa.getFlexItemCount();
        boolean z11 = z10;
        yo yoVar3 = yoVar2;
        int i30 = Integer.MIN_VALUE;
        int i31 = 0;
        int iCombineMeasuredStates = 0;
        int i32 = 0;
        while (true) {
            if (i28 >= flexItemCount) {
                i14 = iCombineMeasuredStates;
                uefVar2 = uefVar;
                break;
            }
            View viewOa = this.moa.oa(i28);
            if (viewOa == null) {
                if (uef(i28, flexItemCount, yoVar3)) {
                    uef(arrayList, yoVar3, i28, i31);
                }
                i15 = i29;
                z2 = yo;
            } else {
                z2 = yo;
                i15 = i29;
                if (viewOa.getVisibility() == 8) {
                    yoVar3.cz++;
                    yoVar3.bcc++;
                    if (uef(i28, flexItemCount, yoVar3)) {
                        uef(arrayList, yoVar3, i28, i31);
                    }
                } else {
                    if (viewOa instanceof CompoundButton) {
                        uef((CompoundButton) viewOa);
                    }
                    com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) viewOa.getLayoutParams();
                    int i33 = flexItemCount;
                    if (oaVar.ivm() == 4) {
                        yoVar3.dz.add(Integer.valueOf(i28));
                    }
                    int iUef3 = uef(oaVar, zUef);
                    if (oaVar.wrv() != -1.0f && mode == 1073741824) {
                        iUef3 = Math.round(oaVar.wrv() * size);
                    }
                    if (zUef) {
                        i17 = mode;
                        iUef = this.moa.uef(i27, i15 + yo(oaVar, yo) + moa(oaVar, yo), iUef3);
                        i16 = size;
                        i18 = i31;
                        int iOa2 = this.moa.oa(i10, iYo + iMoa + lw(oaVar, yo) + ivm(oaVar, yo) + i31, oa(oaVar, yo));
                        viewOa.measure(iUef, iOa2);
                        uef(i28, iUef, iOa2, viewOa);
                        i19 = 0;
                    } else {
                        i16 = size;
                        i17 = mode;
                        i18 = i31;
                        i19 = 0;
                        int iUef4 = this.moa.uef(i10, iYo + iMoa + lw(oaVar, false) + ivm(oaVar, false) + i18, oa(oaVar, false));
                        int iOa3 = this.moa.oa(i27, i15 + yo(oaVar, false) + moa(oaVar, false), iUef3);
                        viewOa.measure(iUef4, iOa3);
                        uef(i28, iUef4, iOa3, viewOa);
                        iUef = iOa3;
                    }
                    uef(viewOa, i28);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewOa.getMeasuredState());
                    int i34 = i19;
                    i20 = i28;
                    int i35 = iUef;
                    yo yoVar4 = yoVar3;
                    int i36 = i32;
                    i21 = i18;
                    size = i16;
                    if (uef(viewOa, i17, size, yoVar3.lw, uef(viewOa, zUef) + yo(oaVar, zUef) + moa(oaVar, zUef), oaVar, i20, i36, arrayList.size())) {
                        if (yoVar4.oa() > 0) {
                            uef(arrayList, yoVar4, i20 > 0 ? i20 - 1 : i34, i21);
                            i26 = i21 + yoVar4.xs;
                        } else {
                            i26 = i21;
                        }
                        if (zUef) {
                            if (oaVar.oa() == -1) {
                                com.bytedance.adsdk.ugeno.lw.uef uefVar3 = this.moa;
                                viewOa.measure(i35, uefVar3.oa(i10, oaVar.ab() + oaVar.dz() + uefVar3.getPaddingTop() + this.moa.getPaddingBottom() + i26, oaVar.oa()));
                                uef(viewOa, i20);
                            }
                        } else if (oaVar.uef() == -1) {
                            com.bytedance.adsdk.ugeno.lw.uef uefVar4 = this.moa;
                            viewOa.measure(uefVar4.uef(i10, oaVar.wk() + oaVar.cq() + uefVar4.getPaddingLeft() + this.moa.getPaddingRight() + i26, oaVar.uef()), i35);
                            uef(viewOa, i20);
                        }
                        yo yoVar5 = new yo();
                        yoVar5.bcc = 1;
                        i22 = i15;
                        yoVar5.lw = i22;
                        yoVar5.wk = i20;
                        i21 = i26;
                        i24 = Integer.MIN_VALUE;
                        yoVar = yoVar5;
                        i23 = i34;
                    } else {
                        yoVar = yoVar4;
                        i22 = i15;
                        yoVar.bcc++;
                        i23 = i36 + 1;
                        i24 = i30;
                    }
                    yoVar.bs = (yoVar.bs ? 1 : 0) | (oaVar.moa() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i34);
                    yoVar.sy = (yoVar.sy ? 1 : 0) | (oaVar.lw() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i34);
                    int[] iArr = this.uef;
                    if (iArr != null) {
                        iArr[i20] = arrayList.size();
                    }
                    yoVar.lw = uef(viewOa, zUef) + yo(oaVar, zUef) + moa(oaVar, zUef) + yoVar.lw;
                    yoVar.zjm = oaVar.moa() + yoVar.zjm;
                    yoVar.dj = oaVar.lw() + yoVar.dj;
                    this.moa.uef(viewOa, i20, i23, yoVar);
                    int iMax = Math.max(i24, oa(viewOa, zUef) + lw(oaVar, zUef) + ivm(oaVar, zUef) + this.moa.uef(viewOa));
                    yoVar.xs = Math.max(yoVar.xs, iMax);
                    if (zUef) {
                        if (this.moa.getFlexWrap() != 2) {
                            yoVar.wrv = Math.max(yoVar.wrv, oaVar.dz() + viewOa.getBaseline());
                        } else {
                            yoVar.wrv = Math.max(yoVar.wrv, oaVar.ab() + (viewOa.getMeasuredHeight() - viewOa.getBaseline()));
                        }
                    }
                    i25 = i33;
                    if (uef(i20, i25, yoVar)) {
                        uef(arrayList, yoVar, i20, i21);
                        i21 += yoVar.xs;
                    }
                    if (i13 != -1 && arrayList.size() > 0) {
                        if (((yo) M6.k(1, arrayList)).f24733ab >= i13 && i20 >= i13 && !z11) {
                            i21 = -yoVar.uef();
                            z11 = true;
                        }
                    }
                    if (i21 > i11 && z11) {
                        uefVar2 = uefVar;
                        i14 = iCombineMeasuredStates;
                        break;
                    }
                    i32 = i23;
                    i30 = iMax;
                    flexItemCount = i25;
                    i28 = i20 + 1;
                    i29 = i22;
                    yoVar3 = yoVar;
                    i31 = i21;
                    mode = i17;
                    i27 = i5;
                }
            }
            i20 = i28;
            i17 = mode;
            i25 = flexItemCount;
            i21 = i31;
            i22 = i15;
            yoVar = yoVar3;
            flexItemCount = i25;
            i28 = i20 + 1;
            i29 = i22;
            yoVar3 = yoVar;
            i31 = i21;
            mode = i17;
            i27 = i5;
        }
        uefVar2.f24732oa = i14;
    }

    private int oa(int i5, com.bytedance.adsdk.ugeno.lw.oa oaVar, int i10) {
        com.bytedance.adsdk.ugeno.lw.uef uefVar = this.moa;
        int iOa = uefVar.oa(i5, oaVar.ab() + oaVar.dz() + uefVar.getPaddingTop() + this.moa.getPaddingBottom() + i10, oaVar.oa());
        int size = View.MeasureSpec.getSize(iOa);
        if (size > oaVar.zjm()) {
            return View.MeasureSpec.makeMeasureSpec(oaVar.zjm(), View.MeasureSpec.getMode(iOa));
        }
        return size < oaVar.bcc() ? View.MeasureSpec.makeMeasureSpec(oaVar.bcc(), View.MeasureSpec.getMode(iOa)) : iOa;
    }

    public void oa(int i5, int i10, int i11) {
        int mode;
        int size;
        int flexDirection = this.moa.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i10);
            mode = mode2;
            size = size2;
        }
        List<yo> flexLinesInternal = this.moa.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.moa.getSumOfCrossSize() + i11;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).xs = size - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.moa.getAlignContent();
                if (alignContent == 1) {
                    int i13 = size - sumOfCrossSize;
                    yo yoVar = new yo();
                    yoVar.xs = i13;
                    flexLinesInternal.add(0, yoVar);
                    return;
                }
                if (alignContent == 2) {
                    this.moa.setFlexLines(uef(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i12 < size4) {
                            arrayList.add(flexLinesInternal.get(i12));
                            if (i12 != flexLinesInternal.size() - 1) {
                                yo yoVar2 = new yo();
                                if (i12 == flexLinesInternal.size() - 2) {
                                    yoVar2.xs = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    yoVar2.xs = Math.round(size3);
                                }
                                int i14 = yoVar2.xs;
                                float f11 = (size3 - i14) + f10;
                                if (f11 > 1.0f) {
                                    yoVar2.xs = i14 + 1;
                                    f11 -= 1.0f;
                                } else if (f11 < -1.0f) {
                                    yoVar2.xs = i14 - 1;
                                    f11 += 1.0f;
                                }
                                f10 = f11;
                                arrayList.add(yoVar2);
                            }
                            i12++;
                        }
                        this.moa.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.moa.setFlexLines(uef(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    yo yoVar3 = new yo();
                    yoVar3.xs = size5;
                    for (yo yoVar4 : flexLinesInternal) {
                        arrayList2.add(yoVar3);
                        arrayList2.add(yoVar4);
                        arrayList2.add(yoVar3);
                    }
                    this.moa.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i12 < size7) {
                        yo yoVar5 = flexLinesInternal.get(i12);
                        float f13 = yoVar5.xs + size6;
                        if (i12 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        yoVar5.xs = iRound;
                        i12++;
                    }
                }
            }
        }
    }

    private void uef(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) compoundButton.getLayoutParams();
        int iXs = oaVar.xs();
        int iBcc = oaVar.bcc();
        Drawable drawableUef = com.bytedance.adsdk.ugeno.xs.lw.uef(compoundButton);
        int minimumWidth = drawableUef == null ? 0 : drawableUef.getMinimumWidth();
        int minimumHeight = drawableUef != null ? drawableUef.getMinimumHeight() : 0;
        if (iXs == -1) {
            iXs = minimumWidth;
        }
        oaVar.uef(iXs);
        if (iBcc == -1) {
            iBcc = minimumHeight;
        }
        oaVar.oa(iBcc);
    }

    private void oa(View view, int i5, int i10) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i5 - oaVar.cq()) - oaVar.wk()) - this.moa.uef(view), oaVar.xs()), oaVar.cz());
        long[] jArr = this.ivm;
        if (jArr != null) {
            measuredHeight = oa(jArr[i10]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        uef(i10, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int uef(boolean z2) {
        if (z2) {
            return this.moa.getPaddingStart();
        }
        return this.moa.getPaddingTop();
    }

    private int uef(View view, boolean z2) {
        if (z2) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int uef(com.bytedance.adsdk.ugeno.lw.oa oaVar, boolean z2) {
        if (z2) {
            return oaVar.uef();
        }
        return oaVar.oa();
    }

    private boolean uef(View view, int i5, int i10, int i11, int i12, com.bytedance.adsdk.ugeno.lw.oa oaVar, int i13, int i14, int i15) {
        if (this.moa.getFlexWrap() == 0) {
            return false;
        }
        if (oaVar.dj()) {
            return yo;
        }
        if (i5 == 0) {
            return false;
        }
        int maxLine = this.moa.getMaxLine();
        if (maxLine != -1 && maxLine <= i15 + 1) {
            return false;
        }
        int iUef = this.moa.uef(view, i13, i14);
        if (iUef > 0) {
            i12 += iUef;
        }
        if (i10 < i11 + i12) {
            return yo;
        }
        return false;
    }

    private boolean uef(int i5, int i10, yo yoVar) {
        if (i5 != i10 - 1 || yoVar.oa() == 0) {
            return false;
        }
        return yo;
    }

    private void uef(List<yo> list, yo yoVar, int i5, int i10) {
        yoVar.cq = i10;
        this.moa.uef(yoVar);
        yoVar.f24733ab = i5;
        list.add(yoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.lw.oa r0 = (com.bytedance.adsdk.ugeno.lw.oa) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.xs()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.xs()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.cz()
            if (r1 <= r3) goto L26
            int r1 = r0.cz()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.bcc()
            if (r2 >= r5) goto L32
            int r2 = r0.bcc()
            goto L3e
        L32:
            int r5 = r0.zjm()
            if (r2 <= r5) goto L3d
            int r2 = r0.zjm()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.uef(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.lw.moa.uef(android.view.View, int):void");
    }

    public void uef(int i5, int i10) {
        uef(i5, i10, 0);
    }

    public void uef(int i5, int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i12;
        int i13;
        yo(this.moa.getFlexItemCount());
        if (i11 >= this.moa.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.moa.getFlexDirection();
        int flexDirection2 = this.moa.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
            int largestMainSize = this.moa.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.moa.getPaddingLeft();
            paddingRight = this.moa.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = this.moa.getLargestMainSize();
            }
            paddingLeft = this.moa.getPaddingTop();
            paddingRight = this.moa.getPaddingBottom();
        }
        int i14 = paddingLeft + paddingRight;
        int i15 = size;
        int[] iArr = this.uef;
        int i16 = iArr != null ? iArr[i11] : 0;
        List<yo> flexLinesInternal = this.moa.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i16 < size2) {
            yo yoVar = flexLinesInternal.get(i16);
            int i17 = yoVar.lw;
            if (i17 < i15 && yoVar.bs) {
                i12 = i5;
                i13 = i10;
                uef(i12, i13, yoVar, i15, i14, false);
            } else {
                i12 = i5;
                i13 = i10;
                if (i17 > i15 && yoVar.sy) {
                    oa(i12, i13, yoVar, i15, i14, false);
                }
            }
            i16++;
            i5 = i12;
            i10 = i13;
        }
    }

    private void uef(int i5, int i10, yo yoVar, int i11, int i12, boolean z2) {
        int i13;
        float f10;
        float f11;
        int iMax;
        double d3;
        double d5;
        float f12 = yoVar.zjm;
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i11 < (i13 = yoVar.lw)) {
            return;
        }
        float f14 = (i11 - i13) / f12;
        yoVar.lw = i12 + yoVar.ivm;
        if (!z2) {
            yoVar.xs = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        float f15 = 0.0f;
        while (i14 < yoVar.bcc) {
            int i16 = yoVar.wk + i14;
            View viewOa = this.moa.oa(i16);
            if (viewOa == null || viewOa.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z10 = z10;
            } else {
                com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) viewOa.getLayoutParams();
                int flexDirection = this.moa.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewOa.getMeasuredHeight();
                    long[] jArr = this.ivm;
                    if (jArr != null) {
                        measuredHeight = oa(jArr[i16]);
                    }
                    int measuredWidth = viewOa.getMeasuredWidth();
                    long[] jArr2 = this.ivm;
                    f11 = f14;
                    boolean z11 = z10;
                    if (jArr2 != null) {
                        measuredWidth = uef(jArr2[i16]);
                    }
                    if (this.lw[i16] || oaVar.moa() <= f10) {
                        z10 = z11;
                    } else {
                        float fMoa = (oaVar.moa() * f11) + measuredHeight;
                        if (i14 == yoVar.bcc - 1) {
                            fMoa += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fMoa);
                        if (iRound > oaVar.zjm()) {
                            iRound = oaVar.zjm();
                            this.lw[i16] = yo;
                            yoVar.zjm -= oaVar.moa();
                            z10 = true;
                        } else {
                            float f16 = (fMoa - iRound) + f15;
                            double d10 = f16;
                            if (d10 > 1.0d) {
                                iRound++;
                                d5 = d10 - 1.0d;
                            } else {
                                if (d10 < -1.0d) {
                                    iRound--;
                                    d5 = d10 + 1.0d;
                                }
                                f15 = f16;
                                z10 = z11;
                            }
                            f16 = (float) d5;
                            f15 = f16;
                            z10 = z11;
                        }
                        int iUef = uef(i5, oaVar, yoVar.cq);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewOa.measure(iUef, iMakeMeasureSpec);
                        int measuredWidth2 = viewOa.getMeasuredWidth();
                        int measuredHeight2 = viewOa.getMeasuredHeight();
                        uef(i16, iUef, iMakeMeasureSpec, viewOa);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i15, oaVar.wk() + oaVar.cq() + measuredWidth + this.moa.uef(viewOa));
                    yoVar.lw = oaVar.ab() + oaVar.dz() + measuredHeight + yoVar.lw;
                } else {
                    f11 = f14;
                    boolean z12 = z10;
                    int measuredWidth3 = viewOa.getMeasuredWidth();
                    long[] jArr3 = this.ivm;
                    if (jArr3 != null) {
                        measuredWidth3 = uef(jArr3[i16]);
                    }
                    int measuredHeight3 = viewOa.getMeasuredHeight();
                    long[] jArr4 = this.ivm;
                    if (jArr4 != null) {
                        measuredHeight3 = oa(jArr4[i16]);
                    }
                    if (this.lw[i16] || oaVar.moa() <= f10) {
                        z10 = z12;
                    } else {
                        float fMoa2 = (oaVar.moa() * f11) + measuredWidth3;
                        if (i14 == yoVar.bcc - 1) {
                            fMoa2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fMoa2);
                        if (iRound2 > oaVar.cz()) {
                            iRound2 = oaVar.cz();
                            this.lw[i16] = yo;
                            yoVar.zjm -= oaVar.moa();
                            z10 = true;
                        } else {
                            float f17 = (fMoa2 - iRound2) + f15;
                            double d11 = f17;
                            if (d11 > 1.0d) {
                                iRound2++;
                                d3 = d11 - 1.0d;
                            } else {
                                if (d11 < -1.0d) {
                                    iRound2--;
                                    d3 = d11 + 1.0d;
                                }
                                f15 = f17;
                                z10 = z12;
                            }
                            f17 = (float) d3;
                            f15 = f17;
                            z10 = z12;
                        }
                        int iOa = oa(i10, oaVar, yoVar.cq);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewOa.measure(iMakeMeasureSpec2, iOa);
                        int measuredWidth4 = viewOa.getMeasuredWidth();
                        int measuredHeight4 = viewOa.getMeasuredHeight();
                        uef(i16, iMakeMeasureSpec2, iOa, viewOa);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i15, oaVar.ab() + oaVar.dz() + measuredHeight3 + this.moa.uef(viewOa));
                    yoVar.lw = oaVar.wk() + oaVar.cq() + measuredWidth3 + yoVar.lw;
                    iMax = iMax2;
                }
                yoVar.xs = Math.max(yoVar.xs, iMax);
                i15 = iMax;
            }
            i14++;
            f14 = f11;
            f13 = f10;
        }
        if (!z10 || i13 == yoVar.lw) {
            return;
        }
        uef(i5, i10, yoVar, i11, i12, yo);
    }

    private int uef(int i5, com.bytedance.adsdk.ugeno.lw.oa oaVar, int i10) {
        com.bytedance.adsdk.ugeno.lw.uef uefVar = this.moa;
        int iUef = uefVar.uef(i5, oaVar.wk() + oaVar.cq() + uefVar.getPaddingLeft() + this.moa.getPaddingRight() + i10, oaVar.uef());
        int size = View.MeasureSpec.getSize(iUef);
        if (size > oaVar.cz()) {
            return View.MeasureSpec.makeMeasureSpec(oaVar.cz(), View.MeasureSpec.getMode(iUef));
        }
        return size < oaVar.xs() ? View.MeasureSpec.makeMeasureSpec(oaVar.xs(), View.MeasureSpec.getMode(iUef)) : iUef;
    }

    private List<yo> uef(List<yo> list, int i5, int i10) {
        int i11 = (i5 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        yo yoVar = new yo();
        yoVar.xs = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(yoVar);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(yoVar);
            }
        }
        return arrayList;
    }

    public void uef() {
        uef(0);
    }

    public void uef(int i5) {
        View viewOa;
        if (i5 >= this.moa.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.moa.getFlexDirection();
        if (this.moa.getAlignItems() == 4) {
            int[] iArr = this.uef;
            List<yo> flexLinesInternal = this.moa.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i10 = iArr != null ? iArr[i5] : 0; i10 < size; i10++) {
                yo yoVar = flexLinesInternal.get(i10);
                int i11 = yoVar.bcc;
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = yoVar.wk + i12;
                    if (i12 < this.moa.getFlexItemCount() && (viewOa = this.moa.oa(i13)) != null && viewOa.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) viewOa.getLayoutParams();
                        if (oaVar.ivm() == -1 || oaVar.ivm() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                oa(viewOa, yoVar.xs, i13);
                            } else {
                                uef(viewOa, yoVar.xs, i13);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (yo yoVar2 : this.moa.getFlexLinesInternal()) {
            for (Integer num : yoVar2.dz) {
                View viewOa2 = this.moa.oa(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    oa(viewOa2, yoVar2.xs, num.intValue());
                } else {
                    uef(viewOa2, yoVar2.xs, num.intValue());
                }
            }
        }
    }

    private void uef(View view, int i5, int i10) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i5 - oaVar.dz()) - oaVar.ab()) - this.moa.uef(view), oaVar.bcc()), oaVar.zjm());
        long[] jArr = this.ivm;
        if (jArr != null) {
            measuredWidth = uef(jArr[i10]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        uef(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void uef(View view, yo yoVar, int i5, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) view.getLayoutParams();
        int alignItems = this.moa.getAlignItems();
        if (oaVar.ivm() != -1) {
            alignItems = oaVar.ivm();
        }
        int i13 = yoVar.xs;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.moa.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i5, (i14 - view.getMeasuredHeight()) - oaVar.ab(), i11, i14 - oaVar.ab());
                    return;
                }
                view.layout(i5, oaVar.dz() + view.getMeasuredHeight() + (i10 - i13), i11, oaVar.dz() + view.getMeasuredHeight() + (i12 - i13));
                return;
            }
            if (alignItems == 2) {
                int iDz = ((oaVar.dz() + (i13 - view.getMeasuredHeight())) - oaVar.ab()) / 2;
                if (this.moa.getFlexWrap() != 2) {
                    int i15 = i10 + iDz;
                    view.layout(i5, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - iDz;
                    view.layout(i5, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.moa.getFlexWrap() != 2) {
                    int iMax = Math.max(yoVar.wrv - view.getBaseline(), oaVar.dz());
                    view.layout(i5, i10 + iMax, i11, i12 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (yoVar.wrv - view.getMeasuredHeight()), oaVar.ab());
                    view.layout(i5, i10 - iMax2, i11, i12 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.moa.getFlexWrap() != 2) {
            view.layout(i5, oaVar.dz() + i10, i11, oaVar.dz() + i12);
        } else {
            view.layout(i5, i10 - oaVar.ab(), i11, i12 - oaVar.ab());
        }
    }

    public void uef(View view, yo yoVar, boolean z2, int i5, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.lw.oa oaVar = (com.bytedance.adsdk.ugeno.lw.oa) view.getLayoutParams();
        int alignItems = this.moa.getAlignItems();
        if (oaVar.ivm() != -1) {
            alignItems = oaVar.ivm();
        }
        int i13 = yoVar.xs;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z2) {
                    view.layout(((i5 + i13) - view.getMeasuredWidth()) - oaVar.wk(), i10, ((i11 + i13) - view.getMeasuredWidth()) - oaVar.wk(), i12);
                    return;
                }
                view.layout(oaVar.cq() + view.getMeasuredWidth() + (i5 - i13), i10, oaVar.cq() + view.getMeasuredWidth() + (i11 - i13), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iUef = ((com.bytedance.adsdk.ugeno.xs.ivm.uef(marginLayoutParams) + (i13 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.xs.ivm.oa(marginLayoutParams)) / 2;
                if (!z2) {
                    view.layout(i5 + iUef, i10, i11 + iUef, i12);
                    return;
                } else {
                    view.layout(i5 - iUef, i10, i11 - iUef, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z2) {
            view.layout(oaVar.cq() + i5, i10, oaVar.cq() + i11, i12);
        } else {
            view.layout(i5 - oaVar.wk(), i10, i11 - oaVar.wk(), i12);
        }
    }

    private void uef(int i5, int i10, int i11, View view) {
        long[] jArr = this.f24730oa;
        if (jArr != null) {
            jArr[i5] = oa(i10, i11);
        }
        long[] jArr2 = this.ivm;
        if (jArr2 != null) {
            jArr2[i5] = oa(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
