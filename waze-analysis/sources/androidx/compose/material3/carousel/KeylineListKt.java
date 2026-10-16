package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    public static final KeylineList keylineListOf(float f2, float f3, int i2, float f4, l<? super KeylineListScope, ab> lVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        lVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f2, f3, i2, f4);
    }

    /* renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m6176keylineListOfWNYm7Xg(float f2, float f3, int i2, l<? super KeylineListScope, ab> lVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        lVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.m6177createWithAlignmentwaks0t8(f2, f3, i2);
    }

    public static final Keyline lerp(Keyline keyline, Keyline keyline2, float f2) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f2), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f2), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f2), f2 < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f2 < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f2 < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f2));
    }

    public static final KeylineList lerp(KeylineList keylineList, KeylineList keylineList2, float f2) {
        KeylineList keylineList3 = keylineList;
        ArrayList arrayList = new ArrayList(keylineList3.size());
        int size = keylineList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lerp(keylineList3.get(i2), keylineList2.get(i2), f2));
        }
        return new KeylineList(arrayList);
    }
}
