package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FocusOrderModifierKt {
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, l<? super FocusOrder, ab> lVar) {
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new AnonymousClass2(new FocusOrderToProperties(lVar)));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<FocusProperties, ab> {
        final /* synthetic */ FocusOrderToProperties $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FocusOrderToProperties focusOrderToProperties) {
            super(1);
            this.$scope = focusOrderToProperties;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            this.$scope.apply(focusProperties);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<FocusProperties, ab> {
        final /* synthetic */ FocusOrderToProperties $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FocusOrderToProperties focusOrderToProperties) {
            super(1);
            this.$scope = focusOrderToProperties;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            this.$scope.apply(focusProperties);
        }
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    public static final Modifier focusOrder(Modifier modifier, l<? super FocusOrder, ab> lVar) {
        return FocusPropertiesKt.focusProperties(modifier, new AnonymousClass1(new FocusOrderToProperties(lVar)));
    }
}
