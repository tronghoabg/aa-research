package com.google.android.apps.auto.components.apphost.basewidgets.action.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.car.app.model.Action;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import defpackage.afak;
import defpackage.afeg;
import defpackage.afeu;
import defpackage.awd;
import defpackage.bux;
import defpackage.bvv;
import defpackage.bwq;
import defpackage.bxc;
import defpackage.bxf;
import defpackage.bxp;
import defpackage.ca;
import defpackage.cfy;
import defpackage.fvr;
import defpackage.fvv;
import defpackage.fwe;
import defpackage.fwf;
import defpackage.fwh;
import defpackage.fwi;
import defpackage.fwl;
import defpackage.geu;
import defpackage.gsl;
import defpackage.hls;
import defpackage.ie;
import defpackage.jtr;
import defpackage.jtt;
import defpackage.jux;
import defpackage.kda;
import defpackage.kmd;
import defpackage.krz;
import defpackage.kso;
import defpackage.ksp;
import defpackage.ksr;
import defpackage.leh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 AB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006B"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/basewidgets/action/ui/MaterialActionButtonView;", "Lcom/google/android/apps/auto/components/compose/CarComponentComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonUiModel;", "uiModel", "getUiModel", "()Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonUiModel;", "setUiModel", "(Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonUiModel;)V", "uiModel$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier$delegate", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonSize;", "actionButtonSize", "getActionButtonSize", "()Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonSize;", "setActionButtonSize", "(Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonSize;)V", "actionButtonSize$delegate", "useCoolwalkPalette", "", "Lcom/google/android/apps/auto/components/coolwalk/CoolwalkColors$VersionedPalette;", "customPalette", "getCustomPalette", "()Lcom/google/android/apps/auto/components/coolwalk/CoolwalkColors$VersionedPalette;", "setCustomPalette", "(Lcom/google/android/apps/auto/components/coolwalk/CoolwalkColors$VersionedPalette;)V", "customPalette$delegate", "setAction", "", "templateContext", "Lcom/android/car/libraries/apphost/common/TemplateContext;", "action", "Landroidx/car/app/model/Action;", "buttonType", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonStyle;", "buttonSize", "params", "Lcom/android/car/libraries/apphost/view/common/ActionButtonParams;", "buttonColors", "Lcom/android/car/libraries/apphost/basewidgets/action/ui/ActionButtonColors;", "shouldHideTitle", "fillMaxWidth", "actionInternal", "Lcom/android/car/libraries/apphost/basewidgets/action/model/ActionInternal;", "ComponentContent", "(Landroidx/compose/runtime/Composer;I)V", "ButtonTheme", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "setModifierToFillMaxWidth", "Companion", "java.com.google.android.apps.auto.components.apphost.basewidgets.action.ui_ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialActionButtonView extends kmd {
    public final bwq a;
    public final bwq b;
    private final bwq c;
    private boolean d;
    private final bwq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialActionButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        bxp bxpVar = bxp.c;
        this.c = new ParcelableSnapshotMutableState(null, bxpVar);
        this.a = new ParcelableSnapshotMutableState(awd.n(cfy.e, Float.NaN, 200.0f), bxpVar);
        this.b = new ParcelableSnapshotMutableState(fwf.b, bxpVar);
        this.e = new ParcelableSnapshotMutableState(null, bxpVar);
    }

    public static /* synthetic */ void p(MaterialActionButtonView materialActionButtonView, geu geuVar, Action action, fwh fwhVar, fwf fwfVar, hls hlsVar, int i) {
        if ((i & 8) != 0) {
            fwfVar = fwf.b;
        }
        fwf fwfVar2 = fwfVar;
        if ((i & 16) != 0) {
            hlsVar = new hls(false, false, false);
        }
        materialActionButtonView.o(geuVar, action, fwhVar, fwfVar2, hlsVar, null, false);
    }

    public final fwi a() {
        return (fwi) this.c.a();
    }

    public final void k(afeg afegVar, bux buxVar, int i) {
        int i2;
        afeg afegVar2;
        kso ksoVarD;
        afak afakVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1850937873);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(this) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            krz krzVar = (krz) this.e.a();
            if (krzVar == null) {
                buxVarC.v(-1794859440);
                ((bvv) buxVarC).Y(false);
                afakVar = null;
                afegVar2 = afegVar;
            } else {
                buxVarC.v(-1794859439);
                if (leh.a.a().b()) {
                    buxVarC.v(1266211858);
                    boolean zBl = ca.bl(buxVarC);
                    ((bvv) buxVarC).Y(false);
                    if (!zBl) {
                        ksoVarD = ksp.d(krzVar);
                    }
                    ksr.a(ksoVarD, null, false, null, afegVar, buxVarC, (i2 << 12) & 57344, 14);
                    afegVar2 = afegVar;
                    buxVarC = buxVarC;
                    ((bvv) buxVarC).Y(false);
                    afakVar = afak.a;
                } else {
                    buxVarC.v(597822989);
                    ((bvv) buxVarC).Y(false);
                }
                ksoVarD = ksp.c(krzVar);
                ksr.a(ksoVarD, null, false, null, afegVar, buxVarC, (i2 << 12) & 57344, 14);
                afegVar2 = afegVar;
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
                afakVar = afak.a;
            }
            if (afakVar == null) {
                buxVarC.v(634848106);
                jtr.b(this.d, false, null, afegVar2, buxVarC, (i2 << 9) & 7168, 6);
            } else {
                buxVarC.v(634837597);
            }
            ((bvv) buxVarC).Y(false);
        } else {
            afegVar2 = afegVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(this, afegVar2, i, i4);
        }
    }

    @Override // defpackage.kmd
    public final void l(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1901215457);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            k(bxc.i(1289670675, true, new gsl(this, 20), buxVarC), buxVarC, ((i2 << 3) & 112) | 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, i4);
        }
    }

    public final void m(krz krzVar) {
        this.e.b(krzVar);
    }

    public final void n(geu geuVar, Action action, fwh fwhVar, fwf fwfVar, hls hlsVar) {
        geuVar.getClass();
        action.getClass();
        p(this, geuVar, action, fwhVar, fwfVar, hlsVar, 192);
    }

    public final void o(geu geuVar, Action action, fwh fwhVar, fwf fwfVar, hls hlsVar, fwe fweVar, boolean z) {
        geuVar.getClass();
        action.getClass();
        fwhVar.getClass();
        fwfVar.getClass();
        hlsVar.getClass();
        byte[] bArr = null;
        fvv fvvVarB = fvr.b(action, geuVar, null);
        int i = jux.a;
        this.d = jux.a(geuVar);
        this.b.b(fwfVar);
        this.c.b(fwl.f(fvvVarB, geuVar, fwhVar, fweVar, hlsVar, false, 0, false, 224));
        fwi fwiVarA = a();
        if (fwiVarA != null) {
            if (!fwiVarA.d()) {
                setFocusable(false);
                setClickable(false);
                setOnClickListener(null);
                return;
            }
            setOnClickListener(new ie(fwiVarA, 7, bArr));
        }
        this.a.b(z ? awd.r(cfy.e) : fvvVarB.g != null ? (fvvVarB.c == 1 && fvvVarB.e == null) ? awd.n(cfy.e, Float.NaN, 380.0f) : awd.n(cfy.e, Float.NaN, 420.0f) : awd.n(cfy.e, Float.NaN, 200.0f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaterialActionButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MaterialActionButtonView(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
