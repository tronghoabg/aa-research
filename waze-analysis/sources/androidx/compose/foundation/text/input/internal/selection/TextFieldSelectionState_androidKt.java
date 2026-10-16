package androidx.compose.foundation.text.input.internal.selection;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextRange;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final Modifier addBasicTextFieldTextContextMenuComponents(Modifier modifier, final TextFieldSelectionState textFieldSelectionState, final af afVar) {
        return TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new p() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0(textFieldSelectionState, afVar, (TextContextMenuBuilderScope) obj, (Context) obj2);
            }
        });
    }

    static final ab addBasicTextFieldTextContextMenuComponents$lambda$0(final TextFieldSelectionState textFieldSelectionState, final af afVar, TextContextMenuBuilderScope textContextMenuBuilderScope, final Context context) {
        PlatformSelectionBehaviors_androidKt.m3863addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, textFieldSelectionState.getEditable$foundation(), textFieldSelectionState.getTextFieldState$foundation().getVisualText().getText(), TextRange.m10534boximpl(textFieldSelectionState.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE()), textFieldSelectionState.getPlatformSelectionBehaviors$foundation(), new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2(textFieldSelectionState, afVar, context, (TextContextMenuBuilderScope) obj);
            }
        });
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addBasicTextFieldTextContextMenuComponents$lambda$0$2(final TextFieldSelectionState textFieldSelectionState, af afVar, Context context, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, afVar, context, textFieldSelectionState, TextContextMenuItems.Cut, textFieldSelectionState.canShowCutMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, afVar, context, textFieldSelectionState, TextContextMenuItems.Copy, textFieldSelectionState.canShowCopyMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, afVar, context, textFieldSelectionState, TextContextMenuItems.Paste, textFieldSelectionState.canShowPasteMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, textFieldSelectionState, TextContextMenuItems.SelectAll, textFieldSelectionState.canShowSelectAllMenuItem(), TextToolbarState.Selection, new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(textFieldSelectionState));
            }
        }, new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(textFieldSelectionState);
            }
        });
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, textFieldSelectionState, TextContextMenuItems.Autofill, textFieldSelectionState.canShowAutofillMenuItem(), null, null, new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(textFieldSelectionState);
            }
        }, 48, null);
        textContextMenuBuilderScope.separator();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(TextFieldSelectionState textFieldSelectionState) {
        return !textFieldSelectionState.getTextToolbarShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.selectAll();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.autofill();
        return ab.f48028a;
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, final TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, final TextToolbarState textToolbarState, final a<Boolean> aVar, final a<ab> aVar2) {
        ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, z, new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(aVar2, aVar, textFieldSelectionState, textToolbarState, (TextContextMenuSession) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(a aVar, a aVar2, TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState, TextContextMenuSession textContextMenuSession) {
        aVar.invoke();
        if (aVar2 == null || ((Boolean) aVar2.invoke()).booleanValue()) {
            textContextMenuSession.close();
        }
        textFieldSelectionState.updateTextToolbarState(textToolbarState);
        return ab.f48028a;
    }

    static /* synthetic */ void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, TextToolbarState textToolbarState, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            textToolbarState = TextToolbarState.None;
        }
        TextToolbarState textToolbarState2 = textToolbarState;
        if ((i2 & 32) != 0) {
            aVar = null;
        }
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, textFieldSelectionState, textContextMenuItems, z, textToolbarState2, aVar, aVar2);
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(TextContextMenuBuilderScope textContextMenuBuilderScope, final af afVar, Context context, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, final l<? super e<? super ab>, ? extends Object> lVar) {
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, textFieldSelectionState, textContextMenuItems, z, null, null, new a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(afVar, lVar);
            }
        }, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(af afVar, l lVar) {
        aj.z(afVar, null, ag.f51345d, new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(lVar, null), 1);
        return ab.f48028a;
    }

    public static final Object detectTextFieldTapGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, a<ab> aVar, a<ab> aVar2, e<? super ab> eVar) {
        Object objDefaultDetectTextFieldTapGestures = TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures(textFieldSelectionState, pointerInputScope, mutableInteractionSource, aVar, aVar2, eVar);
        return objDefaultDetectTextFieldTapGestures == h.c.a.a.f48038a ? objDefaultDetectTextFieldTapGestures : ab.f48028a;
    }

    public static final Object textFieldSelectionGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, e<? super ab> eVar) {
        Object objDefaultTextFieldSelectionGestures = TextFieldSelectionStateKt.defaultTextFieldSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, eVar);
        return objDefaultTextFieldSelectionGestures == h.c.a.a.f48038a ? objDefaultTextFieldSelectionGestures : ab.f48028a;
    }
}
