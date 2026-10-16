package androidx.compose.runtime;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HostDefaultProviderKt {
    private static final ProvidableCompositionLocal<HostDefaultProvider> LocalHostDefaultProvider = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.runtime.HostDefaultProviderKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return HostDefaultProviderKt.LocalHostDefaultProvider$lambda$0();
        }
    }, 1, null);

    static final HostDefaultProvider LocalHostDefaultProvider$lambda$0() {
        throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
    }

    public static final ProvidableCompositionLocal<HostDefaultProvider> getLocalHostDefaultProvider() {
        return LocalHostDefaultProvider;
    }
}
