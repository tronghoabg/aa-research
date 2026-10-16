package androidx.compose.ui.adaptive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.core.content.ContextCompat;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MediaQuery_androidKt$obtainUiMediaScope$4$1 extends y implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UiMediaScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$4$1(Context context, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$context = context;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1] */
    @Override // h.g.a.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final ?? r0 = new BroadcastReceiver() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                uiMediaScopeImpl.setDocked(MediaQuery_androidKt.isDocked(intent));
            }
        };
        this.$scope.setDocked(MediaQuery_androidKt.isDocked(ContextCompat.registerReceiver(this.$context, (BroadcastReceiver) r0, intentFilter, 2)));
        final Context context = this.$context;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                context.unregisterReceiver(r0);
            }
        };
    }
}
