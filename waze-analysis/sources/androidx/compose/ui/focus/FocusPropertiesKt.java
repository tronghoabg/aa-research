package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, l<? super FocusProperties, ab> lVar) {
        return modifier.then(new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(lVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<FocusEnterExitScope, ab> toUsingEnterExitScope(l<? super FocusDirection, FocusRequester> lVar) {
        return new AnonymousClass1(lVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusPropertiesKt$toUsingEnterExitScope$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<FocusEnterExitScope, ab> {
        final /* synthetic */ l<FocusDirection, FocusRequester> $this_toUsingEnterExitScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super FocusDirection, FocusRequester> lVar) {
            super(1);
            this.$this_toUsingEnterExitScope = lVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            FocusRequester focusRequesterInvoke = this.$this_toUsingEnterExitScope.invoke(FocusDirection.m7852boximpl(focusEnterExitScope.mo7851getRequestedFocusDirectiondhqQ8s()));
            if (focusRequesterInvoke == FocusRequester.Companion.getCancel()) {
                focusEnterExitScope.cancelFocusChange();
            } else if (focusRequesterInvoke != FocusRequester.Companion.getDefault()) {
                FocusRequester.m7885requestFocus3ESFkO8$default(focusRequesterInvoke, 0, 1, null);
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(FocusEnterExitScope focusEnterExitScope) {
            invoke2(focusEnterExitScope);
            return ab.f48028a;
        }
    }
}
