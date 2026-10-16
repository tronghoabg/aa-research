package com.google.android.apps.auto.components.system.facetbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.a;
import defpackage.afeu;
import defpackage.bux;
import defpackage.bvv;
import defpackage.bwq;
import defpackage.bxc;
import defpackage.bxf;
import defpackage.bxp;
import defpackage.dlz;
import defpackage.kda;
import defpackage.kmd;
import defpackage.kso;
import defpackage.ksp;
import defpackage.ksr;
import defpackage.leh;
import defpackage.nit;
import defpackage.njg;
import defpackage.njy;
import defpackage.njz;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton;", "Lcom/google/android/apps/auto/components/compose/CarComponentComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonType;", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "getType", "()Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonType;", "setType", "(Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonType;)V", "type$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonOrientation;", "orientation", "getOrientation", "()Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonOrientation;", "setOrientation", "(Lcom/google/android/apps/auto/components/system/facetbar/ResizeButton$ResizeButtonOrientation;)V", "orientation$delegate", "gm3Enabled", "", "ComponentContent", "", "(Landroidx/compose/runtime/Composer;I)V", "ResizeButtonType", "ResizeButtonOrientation", "java.com.google.android.apps.auto.components.system.facetbar_facetbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResizeButton extends kmd {
    public final boolean a;
    private final bwq b;
    private final bwq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResizeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        njz njzVar = njz.a;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(njzVar, bxpVar);
        njy njyVar = njy.a;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(njyVar, bxpVar);
        this.c = parcelableSnapshotMutableState;
        leh.a.a();
        this.a = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nit.a, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int iB = dlz.B(typedArrayObtainStyledAttributes, 1);
            if (iB == 0) {
                njzVar = njz.b;
            } else if (iB == 1) {
                njzVar = njz.c;
            } else if (iB != 2) {
                throw new IllegalArgumentException(a.bp(iB, "Invalid button type: "));
            }
            m(njzVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int iB2 = dlz.B(typedArrayObtainStyledAttributes, 0);
            if (iB2 == 0) {
                njyVar = njy.b;
            } else if (iB2 != 1) {
                throw new IllegalArgumentException(a.bp(iB2, "Invalid button orientation: "));
            }
            parcelableSnapshotMutableState.b(njyVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final njy a() {
        return (njy) this.c.a();
    }

    public final njz k() {
        return (njz) this.b.a();
    }

    @Override // defpackage.kmd
    public final void l(bux buxVar, int i) {
        int i2;
        kso ksoVarF;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-951845545);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            if (this.a) {
                buxVarC.v(104468108);
                ksoVarF = ksp.h(buxVarC);
            } else {
                buxVarC.v(104468968);
                ksoVarF = ksp.f(buxVarC);
            }
            ((bvv) buxVarC).Y(false);
            ksr.a(ksoVarF, null, false, null, bxc.i(1161351343, true, new njg(this, 3), buxVarC), buxVarC, 24576, 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, 16);
        }
    }

    public final void m(njz njzVar) {
        this.b.b(njzVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResizeButton(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ ResizeButton(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
