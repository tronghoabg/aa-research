package androidx.navigationevent.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventTransitionState;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventHandlerKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBackHandler(final androidx.navigationevent.compose.NavigationEventState<? extends androidx.navigationevent.NavigationEventInfo> r16, boolean r17, h.g.a.a<h.ab> r18, final h.g.a.a<h.ab> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigationevent.compose.NavigationEventHandlerKt.NavigationBackHandler(androidx.navigationevent.compose.NavigationEventState, boolean, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab NavigationBackHandler$lambda$3(NavigationEventState navigationEventState, boolean z, a aVar, a aVar2, int i2, int i3, Composer composer, int i4) {
        NavigationBackHandler(navigationEventState, z, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationEventHandler(final androidx.navigationevent.compose.NavigationEventState<? extends androidx.navigationevent.NavigationEventInfo> r21, boolean r22, h.g.a.a<h.ab> r23, h.g.a.a<h.ab> r24, boolean r25, h.g.a.a<h.ab> r26, h.g.a.a<h.ab> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigationevent.compose.NavigationEventHandlerKt.NavigationEventHandler(androidx.navigationevent.compose.NavigationEventState, boolean, h.g.a.a, h.g.a.a, boolean, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab NavigationEventHandler$lambda$5$0(NavigationEventState navigationEventState, NavigationEventTransitionState navigationEventTransitionState) {
        navigationEventState.setTransitionState$navigationevent_compose(navigationEventTransitionState);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab NavigationEventHandler$lambda$6$0(ComposeNavigationEventHandler composeNavigationEventHandler, boolean z, a aVar, a aVar2, boolean z2, a aVar3, a aVar4, NavigationEventState navigationEventState) {
        composeNavigationEventHandler.setForwardEnabled(z);
        composeNavigationEventHandler.setCurrentOnForwardCancelled(aVar);
        composeNavigationEventHandler.setCurrentOnForwardCompleted(aVar2);
        composeNavigationEventHandler.setBackEnabled(z2);
        composeNavigationEventHandler.setCurrentOnBackCancelled(aVar3);
        composeNavigationEventHandler.setCurrentOnBackCompleted(aVar4);
        composeNavigationEventHandler.setInfo(navigationEventState.getCurrentInfo(), navigationEventState.getBackInfo(), navigationEventState.getForwardInfo());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult NavigationEventHandler$lambda$7$0(final NavigationEventState navigationEventState, final ComposeNavigationEventHandler composeNavigationEventHandler, NavigationEventDispatcher navigationEventDispatcher, DisposableEffectScope disposableEffectScope) {
        if (navigationEventState.getSourceHandler$navigationevent_compose() == null) {
            ComposeNavigationEventHandler composeNavigationEventHandler2 = composeNavigationEventHandler;
            navigationEventState.setSourceHandler$navigationevent_compose(composeNavigationEventHandler2);
            NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, composeNavigationEventHandler2, 0, 2, null);
            return new DisposableEffectResult() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$NavigationEventHandler$lambda$7$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    composeNavigationEventHandler.remove();
                    navigationEventState.setSourceHandler$navigationevent_compose(null);
                }
            };
        }
        throw new IllegalArgumentException("NavigationEventState '" + navigationEventState + "' is already registered with a NavigationEventHandler '" + composeNavigationEventHandler + "'.");
    }

    static final ab NavigationEventHandler$lambda$8(NavigationEventState navigationEventState, boolean z, a aVar, a aVar2, boolean z2, a aVar3, a aVar4, int i2, int i3, Composer composer, int i4) {
        NavigationEventHandler(navigationEventState, z, aVar, aVar2, z2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationForwardHandler(final androidx.navigationevent.compose.NavigationEventState<? extends androidx.navigationevent.NavigationEventInfo> r16, boolean r17, h.g.a.a<h.ab> r18, final h.g.a.a<h.ab> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigationevent.compose.NavigationEventHandlerKt.NavigationForwardHandler(androidx.navigationevent.compose.NavigationEventState, boolean, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab NavigationForwardHandler$lambda$3(NavigationEventState navigationEventState, boolean z, a aVar, a aVar2, int i2, int i3, Composer composer, int i4) {
        NavigationForwardHandler(navigationEventState, z, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }
}
