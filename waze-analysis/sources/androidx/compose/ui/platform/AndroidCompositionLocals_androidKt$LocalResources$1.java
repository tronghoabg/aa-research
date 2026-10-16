package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$LocalResources$1 extends y implements l<CompositionLocalAccessorScope, Resources> {
    public static final AndroidCompositionLocals_androidKt$LocalResources$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalResources$1();

    AndroidCompositionLocals_androidKt$LocalResources$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final Resources invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        return ((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
    }
}
