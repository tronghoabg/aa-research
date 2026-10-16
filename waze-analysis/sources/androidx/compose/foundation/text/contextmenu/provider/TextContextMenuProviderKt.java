package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuProviderKt {
    private static final ProvidableCompositionLocal<TextContextMenuProvider> LocalTextContextMenuDropdownProvider = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = TextContextMenuProviderKt.f1654a;
            return null;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<TextContextMenuProvider> LocalTextContextMenuToolbarProvider = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = TextContextMenuProviderKt.f1654a;
            return null;
        }
    }, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1654a = 0;

    static final TextContextMenuProvider LocalTextContextMenuDropdownProvider$lambda$0() {
        return null;
    }

    static final TextContextMenuProvider LocalTextContextMenuToolbarProvider$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<TextContextMenuProvider> getLocalTextContextMenuDropdownProvider() {
        return LocalTextContextMenuDropdownProvider;
    }

    public static final ProvidableCompositionLocal<TextContextMenuProvider> getLocalTextContextMenuToolbarProvider() {
        return LocalTextContextMenuToolbarProvider;
    }
}
