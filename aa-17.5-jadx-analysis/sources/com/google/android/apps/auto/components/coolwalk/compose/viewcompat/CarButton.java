package com.google.android.apps.auto.components.coolwalk.compose.viewcompat;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.a;
import defpackage.afeu;
import defpackage.ati;
import defpackage.bux;
import defpackage.bvv;
import defpackage.bwq;
import defpackage.bxc;
import defpackage.bxf;
import defpackage.bxp;
import defpackage.byd;
import defpackage.cjn;
import defpackage.cjv;
import defpackage.clj;
import defpackage.clv;
import defpackage.cuz;
import defpackage.dlz;
import defpackage.kfn;
import defpackage.kmd;
import defpackage.kso;
import defpackage.ksr;
import defpackage.ksy;
import defpackage.kwb;
import defpackage.kwc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006B"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton;", "Lcom/google/android/apps/auto/components/compose/CarComponentComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onClickListener", "Landroid/view/View$OnClickListener;", "<set-?>", "Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "getType", "()Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;", "setType", "(Lcom/google/android/apps/auto/components/coolwalk/compose/viewcompat/CarButton$ButtonType;)V", "type$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;", "size", "getSize", "()Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;", "setSize", "(Lcom/google/android/apps/auto/components/coolwalk/compose/button/ButtonSize;)V", "size$delegate", "", "label", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "label$delegate", "", "drawableResourceId", "getDrawableResourceId", "()I", "setDrawableResourceId", "(I)V", "drawableResourceId$delegate", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "getContainerColor-0d7_KjU", "()J", "setContainerColor-8_81llA", "(J)V", "containerColor$delegate", "contentColor", "getContentColor-0d7_KjU", "setContentColor-8_81llA", "contentColor$delegate", "Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;", "colorScheme", "getColorScheme", "()Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;", "setColorScheme", "(Lcom/google/android/apps/auto/components/coolwalk/compose/CoolwalkColorScheme;)V", "colorScheme$delegate", "setOnClickListener", "", "listener", "ComponentContent", "(Landroidx/compose/runtime/Composer;I)V", "ButtonType", "ButtonContent", "java.com.google.android.apps.auto.components.coolwalk.compose.viewcompat_viewcompat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarButton extends kmd {
    public View.OnClickListener a;
    public final bwq b;
    public final bwq c;
    public final bwq d;
    public final bwq e;
    public final bwq f;
    public final byd g;
    private final bwq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        kwb kwbVar = kwb.c;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(kwbVar, bxpVar);
        ksy ksyVar = ksy.c;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(ksyVar, bxpVar);
        this.c = parcelableSnapshotMutableState;
        this.d = new ParcelableSnapshotMutableState(null, bxpVar);
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(0);
        this.g = parcelableSnapshotMutableIntState;
        float[] fArr = clj.a;
        clv clvVar = clj.u;
        this.e = new ParcelableSnapshotMutableState(new cjv(cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clvVar)), bxpVar);
        this.f = new ParcelableSnapshotMutableState(new cjv(cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clvVar)), bxpVar);
        this.h = new ParcelableSnapshotMutableState(null, bxpVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kwc.a, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            typedArrayObtainStyledAttributes.getClass();
            dlz.C(typedArrayObtainStyledAttributes, 3);
            int i = typedArrayObtainStyledAttributes.getInt(3, 0);
            if (i == 0) {
                kwbVar = kwb.a;
            } else if (i == 1) {
                kwbVar = kwb.b;
            } else if (i != 2) {
                if (i == 3) {
                    kwbVar = kwb.d;
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(a.bp(i, "Invalid button type: "));
                    }
                    kwbVar = kwb.e;
                }
            }
            k(kwbVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            typedArrayObtainStyledAttributes.getClass();
            dlz.C(typedArrayObtainStyledAttributes, 2);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i2 == 0) {
                ksyVar = ksy.a;
            } else if (i2 == 1) {
                ksyVar = ksy.b;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException(a.bp(i2, "Invalid button size: "));
                }
                ksyVar = ksy.d;
            }
            parcelableSnapshotMutableState.b(ksyVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getClass();
            dlz.C(typedArrayObtainStyledAttributes, 0);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string == null) {
                throw new IllegalStateException("Attribute value could not be coerced to String.");
            }
            a(string);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getClass();
            dlz.C(typedArrayObtainStyledAttributes, 1);
            parcelableSnapshotMutableIntState.h(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(String str) {
        this.d.b(str);
    }

    public final void k(kwb kwbVar) {
        this.b.b(kwbVar);
    }

    @Override // defpackage.kmd
    public final void l(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-226758203);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            kso ksoVarI = (kso) this.h.a();
            if (ksoVarI == null) {
                buxVarC.v(1128701776);
                ksoVarI = kfn.i(buxVarC);
            } else {
                buxVarC.v(1128700877);
            }
            ((bvv) buxVarC).Y(false);
            ksr.a(ksoVarI, null, false, null, bxc.i(459989789, true, new cuz(this, 14), buxVarC), buxVarC, 24576, 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(this, i, 7);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.a = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarButton(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ CarButton(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
