package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ButtonGroupScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ButtonGroupScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void clickableItem$default(ButtonGroupScope buttonGroupScope, a aVar, String str, p pVar, float f2, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickableItem");
            }
            if ((i2 & 4) != 0) {
                pVar = null;
            }
            p pVar2 = pVar;
            if ((i2 & 8) != 0) {
                f2 = Float.NaN;
            }
            buttonGroupScope.clickableItem(aVar, str, pVar2, f2, (!((i2 & 16) == 0)) | z);
        }

        public static /* synthetic */ void toggleableItem$default(ButtonGroupScope buttonGroupScope, boolean z, String str, l lVar, p pVar, float f2, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleableItem");
            }
            if ((i2 & 8) != 0) {
                pVar = null;
            }
            p pVar2 = pVar;
            if ((i2 & 16) != 0) {
                f2 = Float.NaN;
            }
            buttonGroupScope.toggleableItem(z, str, lVar, pVar2, f2, (!((i2 & 32) == 0)) | z2);
        }

        public static /* synthetic */ Modifier weight$default(ButtonGroupScope buttonGroupScope, Modifier modifier, float f2, boolean z, int i2, Object obj) {
            if (obj == null) {
                return buttonGroupScope.weight(modifier, f2, z | (!((i2 & 2) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
    }

    Modifier align(Modifier modifier, Alignment.Vertical vertical);

    Modifier animateWidth(Modifier modifier, InteractionSource interactionSource);

    void clickableItem(a<ab> aVar, String str, p<? super Composer, ? super Integer, ab> pVar, float f2, boolean z);

    void customItem(p<? super Composer, ? super Integer, ab> pVar, q<? super ButtonGroupMenuState, ? super Composer, ? super Integer, ab> qVar);

    void toggleableItem(boolean z, String str, l<? super Boolean, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, float f2, boolean z2);

    Modifier weight(Modifier modifier, float f2);

    /* synthetic */ Modifier weight(Modifier modifier, float f2, boolean z);
}
