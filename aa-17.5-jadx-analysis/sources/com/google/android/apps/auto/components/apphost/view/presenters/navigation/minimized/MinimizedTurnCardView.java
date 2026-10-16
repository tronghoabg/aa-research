package com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import defpackage.afeu;
import defpackage.bux;
import defpackage.bwq;
import defpackage.bxc;
import defpackage.bxf;
import defpackage.bxp;
import defpackage.gab;
import defpackage.gey;
import defpackage.gfa;
import defpackage.gup;
import defpackage.guu;
import defpackage.gva;
import defpackage.hju;
import defpackage.jtr;
import defpackage.juy;
import defpackage.kda;
import defpackage.kmd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u00061"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/view/presenters/navigation/minimized/MinimizedTurnCardView;", "Lcom/google/android/apps/auto/components/compose/CarComponentComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/android/car/libraries/apphost/nav/ui/routing/TurnCardUiModel;", "uiModel", "getUiModel", "()Lcom/android/car/libraries/apphost/nav/ui/routing/TurnCardUiModel;", "setUiModel", "(Lcom/android/car/libraries/apphost/nav/ui/routing/TurnCardUiModel;)V", "uiModel$delegate", "Landroidx/compose/runtime/MutableState;", "value", "", "loading", "getLoading", "()Z", "setLoading", "(Z)V", "", "distanceText", "getDistanceText", "()Ljava/lang/String;", "setDistanceText", "(Ljava/lang/String;)V", "Lcom/android/car/libraries/apphost/basewidgets/image/migration/ui/CarIconDelegateUiModel;", "turnSymbol", "getTurnSymbol", "()Lcom/android/car/libraries/apphost/basewidgets/image/migration/ui/CarIconDelegateUiModel;", "setTurnSymbol", "(Lcom/android/car/libraries/apphost/basewidgets/image/migration/ui/CarIconDelegateUiModel;)V", "horizontallyFlipTurnSymbol", "getHorizontallyFlipTurnSymbol", "setHorizontallyFlipTurnSymbol", "Lcom/android/car/libraries/apphost/compose/AnnotatedStringProvider;", "descriptionText", "getDescriptionText", "()Lcom/android/car/libraries/apphost/compose/AnnotatedStringProvider;", "setDescriptionText", "(Lcom/android/car/libraries/apphost/compose/AnnotatedStringProvider;)V", "updateUiModel", "", "ComponentContent", "(Landroidx/compose/runtime/Composer;I)V", "java.com.google.android.apps.auto.components.apphost.view.presenters.navigation.minimized_minimized"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MinimizedTurnCardView extends kmd {
    public final bwq a;
    public boolean b;
    private boolean c;
    private String d;
    private gab e;
    private gfa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MinimizedTurnCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        this.a = new ParcelableSnapshotMutableState(new gva(new guu(null, null, null, 0 == true ? 1 : 0, false, 63), null), bxp.c);
        this.f = gey.b;
    }

    public final void a(gfa gfaVar) {
        this.f = gfaVar;
        o();
    }

    public final void k(String str) {
        this.d = str;
        o();
    }

    @Override // defpackage.kmd
    public final void l(bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1064730215);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            jtr.b(false, false, null, bxc.i(-1060561721, true, new juy(this, 6), buxVarC), buxVarC, 3078, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, i4);
        }
    }

    public final void m(boolean z) {
        this.c = z;
        o();
    }

    public final void n(gab gabVar) {
        this.e = gabVar;
        o();
    }

    public final void o() {
        hju guuVar;
        if (this.c) {
            guuVar = new gup(true);
        } else {
            guuVar = new guu(null, this.e, gey.b(this.d), this.f, this.b, 33);
        }
        this.a.b(new gva(guuVar, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MinimizedTurnCardView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MinimizedTurnCardView(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
