package com.bytedance.adsdk.ugeno.yoga;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

@com.bytedance.adsdk.ugeno.yoga.uef.uef
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends zjm implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.uef.uef
    private float[] arr;
    private Object ivm;
    private oa lw;

    @com.bytedance.adsdk.ugeno.yoga.uef.uef
    private int mLayoutDirection;
    private xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private YogaNodeJNIBase f24784oa;
    protected long uef;
    private boolean xs;
    private List<YogaNodeJNIBase> yo;

    private YogaNodeJNIBase(long j8) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.xs = true;
        if (j8 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.uef = j8;
    }

    @com.bytedance.adsdk.ugeno.yoga.uef.uef
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i5) {
        List<YogaNodeJNIBase> list = this.yo;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i5);
        this.yo.add(i5, yogaNodeJNIBase);
        yogaNodeJNIBase.f24784oa = this;
        return yogaNodeJNIBase.uef;
    }

    @com.bytedance.adsdk.ugeno.yoga.uef.uef
    public final float baseline(float f10, float f11) {
        return this.lw.uef(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void bcc(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void cz(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    /* renamed from: dj, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase oa() {
        return this.f24784oa;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void ivm(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void lw(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.uef, f10);
    }

    @com.bytedance.adsdk.ugeno.yoga.uef.uef
    public final long measure(float f10, int i5, float f11, int i10) {
        if (wrv()) {
            return this.moa.uef(this, f10, bcc.uef(i5), f11, bcc.uef(i10));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase oa(int i5) {
        List<YogaNodeJNIBase> list = this.yo;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i5);
        yogaNodeJNIBaseRemove.f24784oa = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.uef, yogaNodeJNIBaseRemove.uef);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void wrv(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void xs(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase uef(int i5) {
        List<YogaNodeJNIBase> list = this.yo;
        if (list != null) {
            return list.get(i5);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void zjm(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public float bcc() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public float cz() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void dj(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public float ivm() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void lw() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.uef);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public int uef() {
        List<YogaNodeJNIBase> list = this.yo;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean wrv() {
        return this.moa != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public float xs() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public Object zjm() {
        return this.ivm;
    }

    private void oa(zjm zjmVar) {
        zjm();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(zjm zjmVar, int i5) {
        if (zjmVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) zjmVar;
            if (yogaNodeJNIBase.f24784oa == null) {
                if (this.yo == null) {
                    this.yo = new ArrayList(4);
                }
                this.yo.add(i5, yogaNodeJNIBase);
                yogaNodeJNIBase.f24784oa = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.uef, yogaNodeJNIBase.uef, i5);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void oa(uef uefVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.uef, uefVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void yo(uef uefVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.uef, uefVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void oa(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void yo(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void moa(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void oa(moa moaVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.uef, moaVar.uef(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void yo() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.uef);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void moa() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.uef);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void yo(moa moaVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.uef, moaVar.uef(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public int uef(zjm zjmVar) {
        List<YogaNodeJNIBase> list = this.yo;
        if (list == null) {
            return -1;
        }
        return list.indexOf(zjmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(float f10, float f11) {
        oa((zjm) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i5);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.yo;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.oa(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i10 = 0; i10 < yogaNodeJNIBaseArr.length; i10++) {
            jArr[i10] = yogaNodeJNIBaseArr[i10].uef;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.uef, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(yo yoVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.uef, yoVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(lw lwVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.uef, lwVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(ivm ivmVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.uef, ivmVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(uef uefVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.uef, uefVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(cq cqVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.uef, cqVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(dz dzVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.uef, dzVar.uef());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.uef, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(moa moaVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.uef, moaVar.uef(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(xs xsVar) {
        this.moa = xsVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.uef, xsVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(boolean z2) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.uef, z2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.zjm
    public void uef(Object obj) {
        this.ivm = obj;
    }
}
