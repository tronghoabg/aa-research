package androidx.navigationevent.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.navigationevent.NavigationEventDispatcherOwner;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class LocalNavigationEventDispatcherOwner {
    public static final int $stable = 0;
    public static final LocalNavigationEventDispatcherOwner INSTANCE = new LocalNavigationEventDispatcherOwner();
    private static final ProvidableCompositionLocal<NavigationEventDispatcherOwner> LocalNavigationEventDispatcherOwner = CompositionLocalKt.compositionLocalWithHostDefaultOf(LocalNavigationEventDispatcherOwner_androidKt.getNavigationEventDispatcherOwnerHostDefaultKey());

    private LocalNavigationEventDispatcherOwner() {
    }

    public final NavigationEventDispatcherOwner getCurrent(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942026292, i2, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:37)");
        }
        NavigationEventDispatcherOwner navigationEventDispatcherOwner = (NavigationEventDispatcherOwner) composer.consume(LocalNavigationEventDispatcherOwner);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwner;
    }

    public final ProvidedValue<NavigationEventDispatcherOwner> provides(NavigationEventDispatcherOwner navigationEventDispatcherOwner) {
        return LocalNavigationEventDispatcherOwner.provides(navigationEventDispatcherOwner);
    }
}
