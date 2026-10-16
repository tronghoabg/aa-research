package com.google.android.apps.auto.components.coolwalk.compose.viewcompat;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007Ê\u0001\f\bE\u0012\b\bF\u0012\u0004\b\u0003\u0010\u0000¨\u0006D"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton;", "Lcom/google/android/apps/auto/components/compose/CarComponentComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/jvm/JvmOverloads;", "onClickListener", "Landroid/view/View$OnClickListener;", "<set-?>", "Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;", "type", "getType", "()Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;", "setType", "(Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;)V", "type$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;", "size", "getSize", "()Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;", "setSize", "(Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;)V", "size$delegate", "", "label", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "label$delegate", "", "drawableResourceId", "getDrawableResourceId", "()I", "setDrawableResourceId", "(I)V", "drawableResourceId$delegate", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "getContainerColor-0d7_KjU", "()J", "setContainerColor-8_81llA", "(J)V", "containerColor$delegate", "contentColor", "getContentColor-0d7_KjU", "setContentColor-8_81llA", "contentColor$delegate", "Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;", "colorScheme", "getColorScheme", "()Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;", "setColorScheme", "(Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;)V", "colorScheme$delegate", "setOnClickListener", "", "listener", "ComponentContent", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "ButtonType", "ButtonContent", "java.com.google.android.apps.auto.components.coolwalk.compose.viewcompat_viewcompat", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, defpackage.eie.LONG_FIELD_NUMBER, defpackage.abnt.b}, xi = 48)
public final class CarButton extends defpackage.kmk {
    public android.view.View.OnClickListener a;
    public final defpackage.bwx b;
    public final defpackage.bwx c;
    public final defpackage.bwx d;
    public final defpackage.bwx e;
    public final defpackage.bwx f;
    public final defpackage.byj g;
    private final defpackage.bwx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        defpackage.kwh kwhVar = defpackage.kwh.Tonal;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(kwhVar, bxvVar);
        defpackage.ktf ktfVar = defpackage.ktf.c;
        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(ktfVar, bxvVar);
        this.c = parcelableSnapshotMutableState;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        androidx.compose.runtime.ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.g = parcelableSnapshotMutableIntState;
        float[] fArr = defpackage.clr.a;
        defpackage.cmd cmdVar = defpackage.clr.u;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ckd(defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, cmdVar)), bxvVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ckd(defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, cmdVar)), bxvVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.kwi.a, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            typedArrayObtainStyledAttributes.getClass();
            defpackage.dmh.C(typedArrayObtainStyledAttributes, 3);
            int i = typedArrayObtainStyledAttributes.getInt(3, 0);
            if (i == 0) {
                kwhVar = defpackage.kwh.Icon;
            } else if (i == 1) {
                kwhVar = defpackage.kwh.Outlined;
            } else if (i != 2) {
                if (i == 3) {
                    kwhVar = defpackage.kwh.Filled;
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid button type: "));
                    }
                    kwhVar = defpackage.kwh.Colored;
                }
            }
            k(kwhVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            typedArrayObtainStyledAttributes.getClass();
            defpackage.dmh.C(typedArrayObtainStyledAttributes, 2);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i2 == 0) {
                ktfVar = defpackage.ktf.a;
            } else if (i2 == 1) {
                ktfVar = defpackage.ktf.b;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bo(i2, "Invalid button size: "));
                }
                ktfVar = defpackage.ktf.d;
            }
            parcelableSnapshotMutableState.b(ktfVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getClass();
            defpackage.dmh.C(typedArrayObtainStyledAttributes, 0);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(0);
            if (string == null) {
                throw new java.lang.IllegalStateException("Attribute value could not be coerced to String.");
            }
            a(string);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getClass();
            defpackage.dmh.C(typedArrayObtainStyledAttributes, 1);
            parcelableSnapshotMutableIntState.h(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(java.lang.String str) {
        this.d.b(str);
    }

    public final void k(defpackage.kwh kwhVar) {
        this.b.b(kwhVar);
    }

    @Override // defpackage.kmk
    public final void l(defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-226758203);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.ksw kswVarI = (defpackage.ksw) this.h.a();
            if (kswVarI == null) {
                bveVarC.v(1128701776);
                kswVarI = defpackage.kfp.i(bveVarC);
            } else {
                bveVarC.v(1128700877);
            }
            ((defpackage.bwc) bveVarC).Y(false);
            defpackage.ksz.a(kswVarI, null, false, null, defpackage.dai.as(459989789, true, new defpackage.cvi(this, 14), bveVarC), bveVarC, 24576, 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(this, i, 7);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.a = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarButton(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ CarButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, defpackage.affu affuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
