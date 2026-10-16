package androidx.navigationevent.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.navigationevent.NavigationEventInfo;
import h.a.i;
import h.ab;
import h.g.a.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RememberNavigationEventStateKt {
    public static final <T extends NavigationEventInfo> NavigationEventState<T> rememberNavigationEventState(final T t, final List<? extends T> list, final List<? extends T> list2, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            list = i.h();
        }
        if ((i3 & 4) != 0) {
            list2 = i.h();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(116613162, i2, -1, "androidx.navigationevent.compose.rememberNavigationEventState (RememberNavigationEventState.kt:44)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new NavigationEventState(t, list, list2);
            composer.updateRememberedValue(objRememberedValue);
        }
        final NavigationEventState<T> navigationEventState = (NavigationEventState) objRememberedValue;
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changedInstance(t)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = composer.changedInstance(list) | z | composer.changedInstance(list2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.navigationevent.compose.RememberNavigationEventStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return RememberNavigationEventStateKt.rememberNavigationEventState$lambda$1$0(navigationEventState, t, list, list2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.SideEffect((a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberNavigationEventState$lambda$1$0(NavigationEventState navigationEventState, NavigationEventInfo navigationEventInfo, List list, List list2) {
        navigationEventState.setCurrentInfo$navigationevent_compose(navigationEventInfo);
        navigationEventState.setBackInfo$navigationevent_compose(list);
        navigationEventState.setForwardInfo$navigationevent_compose(list2);
        return ab.f48028a;
    }
}
