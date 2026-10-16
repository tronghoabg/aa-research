package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScrimKt {
    public static /* synthetic */ boolean $r8$lambda$21PHLui4DCFSmdn0IyPnDsuKBfA(a aVar) {
        Scrim_yrwZFoE$lambda$3$0$0(aVar);
        return true;
    }

    /* renamed from: $r8$lambda$qOF8PXBSEljI1xDOE-gGcqIUQ1w, reason: not valid java name */
    public static /* synthetic */ float m5429$r8$lambda$qOF8PXBSEljI1xDOEgGcqIUQ1w() {
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* renamed from: Scrim-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5430ScrimyrwZFoE(final java.lang.String r20, androidx.compose.ui.Modifier r21, h.g.a.a<h.ab> r22, h.g.a.a<java.lang.Float> r23, long r24, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScrimKt.m5430ScrimyrwZFoE(java.lang.String, androidx.compose.ui.Modifier, h.g.a.a, h.g.a.a, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float Scrim_yrwZFoE$lambda$1$0() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_yrwZFoE$lambda$3$0(String str, final a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        }
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                ScrimKt.$r8$lambda$21PHLui4DCFSmdn0IyPnDsuKBfA(aVar);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean Scrim_yrwZFoE$lambda$3$0$0(a aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_yrwZFoE$lambda$4$0(long j2, a aVar, DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, n.g(((Number) aVar.invoke()).floatValue(), 0.0f, 1.0f), null, null, 0, 118, null);
        return ab.f48028a;
    }

    static final ab Scrim_yrwZFoE$lambda$5(String str, Modifier modifier, a aVar, a aVar2, long j2, int i2, int i3, Composer composer, int i4) {
        m5430ScrimyrwZFoE(str, modifier, aVar, aVar2, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }
}
