package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntRect;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt {
    private static final int PopupPropertiesBaseFlags = 262144;
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);
    private static final ProvidableCompositionLocal<Boolean> LocalIsInPopupLayout = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalIsInPopupLayout$1.INSTANCE, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Popup(androidx.compose.ui.window.PopupPositionProvider r29, h.g.a.a<h.ab> r30, androidx.compose.ui.window.PopupProperties r31, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, h.g.a.a, androidx.compose.ui.window.PopupProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, ab> Popup$lambda$0(State<? extends p<? super Composer, ? super Integer, ab>> state) {
        return (p) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11420PopupK5zGePQ(androidx.compose.ui.Alignment r26, long r27, h.g.a.a<h.ab> r29, androidx.compose.ui.window.PopupProperties r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m11420PopupK5zGePQ(androidx.compose.ui.Alignment, long, h.g.a.a, androidx.compose.ui.window.PopupProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void PopupTestTag(String str, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1357513789);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357513789, i3, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:547)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), pVar, composerStartRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C03991(str, pVar, i2));
        }
    }

    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        AndroidPopup_androidKt$SimpleStack$1$1 androidPopup_androidKt$SimpleStack$1$1RememberedValue = composer.rememberedValue();
        if (androidPopup_androidKt$SimpleStack$1$1RememberedValue == Composer.Companion.getEmpty()) {
            androidPopup_androidKt$SimpleStack$1$1RememberedValue = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
            composer.updateRememberedValue(androidPopup_androidKt$SimpleStack$1$1RememberedValue);
        }
        int i3 = i2 >> 3;
        int i4 = i2 << 3;
        MeasurePolicy measurePolicy = (MeasurePolicy) androidPopup_androidKt$SimpleStack$1$1RememberedValue;
        int iM = AndroidPopup_androidKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Updater.m7351setimpl(composer, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        pVar.invoke(composer, Integer.valueOf((((((((i3 & 14) | 384) | (i4 & 112)) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6) >> 6) & 14));
        composer.endNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.SecureOn;
        int i2 = true != z ? 262152 : 262144;
        if (secureFlagPolicy == secureFlagPolicy2) {
            i2 |= 8192;
        }
        return !z2 ? i2 | 512 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(PopupProperties popupProperties, boolean z) {
        return (popupProperties.getInheritSecurePolicy$ui() && z) ? popupProperties.getFlags$ui() | 8192 : (!popupProperties.getInheritSecurePolicy$ui() || z) ? popupProperties.getFlags$ui() : popupProperties.getFlags$ui() & (-8193);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalIsInPopupLayout() {
        return LocalIsInPopupLayout;
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final boolean isPopupLayout(View view, String str) {
        if (view instanceof PopupLayout) {
            return str == null || x.n(str, ((PopupLayout) view).getTestTag());
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1, reason: invalid class name and case insensitive filesystem */
    final class C03991 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03991(String str, p<? super Composer, ? super Integer, ab> pVar, int i2) {
            super(2);
            this.$tag = str;
            this.$content = pVar;
            this.$$changed = i2;
        }

        public final void invoke(Composer composer, int i2) {
            AndroidPopup_androidKt.PopupTestTag(this.$tag, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9, reason: invalid class name */
    final class AnonymousClass9 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ a<ab> $onDismissRequest;
        final /* synthetic */ PopupPositionProvider $popupPositionProvider;
        final /* synthetic */ PopupProperties $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(PopupPositionProvider popupPositionProvider, a<ab> aVar, PopupProperties popupProperties, p<? super Composer, ? super Integer, ab> pVar, int i2, int i3) {
            super(2);
            this.$popupPositionProvider = popupPositionProvider;
            this.$onDismissRequest = aVar;
            this.$properties = popupProperties;
            this.$content = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AndroidPopup_androidKt.Popup(this.$popupPositionProvider, this.$onDismissRequest, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ long $offset;
        final /* synthetic */ a<ab> $onDismissRequest;
        final /* synthetic */ PopupProperties $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Alignment alignment, long j2, a<ab> aVar, PopupProperties popupProperties, p<? super Composer, ? super Integer, ab> pVar, int i2, int i3) {
            super(2);
            this.$alignment = alignment;
            this.$offset = j2;
            this.$onDismissRequest = aVar;
            this.$properties = popupProperties;
            this.$content = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AndroidPopup_androidKt.m11420PopupK5zGePQ(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }
}
