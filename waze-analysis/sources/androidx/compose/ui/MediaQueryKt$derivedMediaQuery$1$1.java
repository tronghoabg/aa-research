package androidx.compose.ui;

import androidx.compose.runtime.State;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MediaQueryKt$derivedMediaQuery$1$1 extends y implements a {
    final /* synthetic */ State<l> $currentQuery$delegate;
    final /* synthetic */ UiMediaScope $mediaScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MediaQueryKt$derivedMediaQuery$1$1(UiMediaScope uiMediaScope, State<? extends l> state) {
        super(0);
        this.$mediaScope = uiMediaScope;
        this.$currentQuery$delegate = state;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        return MediaQueryKt.derivedMediaQuery$lambda$0(this.$currentQuery$delegate).invoke(this.$mediaScope);
    }
}
