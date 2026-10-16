package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import h.ab;
import h.g.a.a;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    private ExposedDropdownMenuBoxScope() {
    }

    static final ab ExposedDropdownMenu$lambda$0(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, a aVar, Modifier modifier, ScrollState scrollState, q qVar, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuBoxScope.ExposedDropdownMenu(z, aVar, modifier, scrollState, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ExposedDropdownMenu_kbRbctU$lambda$0(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, a aVar, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        exposedDropdownMenuBoxScope.m4812ExposedDropdownMenukbRbctU(z, aVar, modifier, scrollState, z2, z3, shape, j2, f2, f3, borderStroke, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenu_vNxi1II$lambda$1$0(MutableState mutableState) {
        ab abVar = ab.f48028a;
        mutableState.setValue(abVar);
        return abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenu_vNxi1II$lambda$4$0(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m8658boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return ab.f48028a;
    }

    static final ab ExposedDropdownMenu_vNxi1II$lambda$5(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2063119149, i2, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
            }
            MenuKt.m5228DropdownMenuContentQj0Zi0g(exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z), mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, qVar, composer, (MutableTransitionState.$stable << 3) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ExposedDropdownMenu_vNxi1II$lambda$6(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, a aVar, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, int i2, int i3, int i4, Composer composer, int i5) {
        exposedDropdownMenuBoxScope.m4813ExposedDropdownMenuvNxi1II(z, aVar, modifier, scrollState, z2, shape, j2, f2, f3, borderStroke, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i2, Object obj) {
        if (obj == null) {
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    /* renamed from: menuAnchor-2Hz36ac$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4811menuAnchor2Hz36ac$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z, int i2, Object obj) {
        if (obj == null) {
            return exposedDropdownMenuBoxScope.mo4815menuAnchor2Hz36ac(modifier, str, z | (!((i2 & 2) == 0)));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-2Hz36ac");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void ExposedDropdownMenu(final boolean r27, final h.g.a.a r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.ScrollState r30, final h.g.a.q r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4812ExposedDropdownMenukbRbctU(final boolean r36, final h.g.a.a<h.ab> r37, androidx.compose.ui.Modifier r38, androidx.compose.foundation.ScrollState r39, boolean r40, boolean r41, androidx.compose.ui.graphics.Shape r42, long r43, float r45, float r46, androidx.compose.foundation.BorderStroke r47, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m4812ExposedDropdownMenukbRbctU(boolean, h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4813ExposedDropdownMenuvNxi1II(final boolean r40, final h.g.a.a<h.ab> r41, androidx.compose.ui.Modifier r42, androidx.compose.foundation.ScrollState r43, boolean r44, androidx.compose.ui.graphics.Shape r45, long r46, float r48, float r49, androidx.compose.foundation.BorderStroke r50, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m4813ExposedDropdownMenuvNxi1II(boolean, h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    public abstract boolean getAlwaysFocusable$material3();

    /* renamed from: getAnchorType-oYjWRB4$material3, reason: not valid java name */
    public abstract String mo4814getAnchorTypeoYjWRB4$material3();

    public final Modifier menuAnchor(Modifier modifier) {
        return m4811menuAnchor2Hz36ac$default(this, modifier, ExposedDropdownMenuAnchorType.Companion.m4809getPrimaryNotEditableoYjWRB4(), false, 2, null);
    }

    /* renamed from: menuAnchor-2Hz36ac, reason: not valid java name */
    public abstract Modifier mo4815menuAnchor2Hz36ac(Modifier modifier, String str, boolean z);

    public /* synthetic */ ExposedDropdownMenuBoxScope(o oVar) {
        this();
    }
}
