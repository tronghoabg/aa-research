package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, e<? super AnonymousClass2> eVar) {
            super(3, eVar);
            this.$interactionSource = mutableInteractionSource;
            this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
            return m3768invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m3768invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$interactionSource, this.$this_defaultDetectTextFieldTapGestures, eVar);
            anonymousClass2.L$0 = pressGestureScope;
            anonymousClass2.J$0 = j2;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j2 = this.J$0;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                if (mutableInteractionSource != null) {
                    TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(pressGestureScope, this.$this_defaultDetectTextFieldTapGestures, j2, mutableInteractionSource, null);
                    this.label = 1;
                    if (aj.d(textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public static final l<ContextMenuScope, ab> contextMenuBuilder(final TextFieldSelectionState textFieldSelectionState, final ContextMenuState contextMenuState, final State<MenuItemsAvailability> state, final p<? super TextFieldSelectionState, ? super TextContextMenuItems, ab> pVar) {
        return new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSelectionStateKt.contextMenuBuilder$lambda$0(state, contextMenuState, pVar, textFieldSelectionState, (ContextMenuScope) obj);
            }
        };
    }

    static final ab contextMenuBuilder$lambda$0(State state, ContextMenuState contextMenuState, p pVar, TextFieldSelectionState textFieldSelectionState, ContextMenuScope contextMenuScope) {
        int iM3361unboximpl = ((MenuItemsAvailability) state.getValue()).m3361unboximpl();
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, pVar, textFieldSelectionState, TextContextMenuItems.Cut, MenuItemsAvailability.m3356getCanCutimpl(iM3361unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, pVar, textFieldSelectionState, TextContextMenuItems.Copy, MenuItemsAvailability.m3355getCanCopyimpl(iM3361unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, pVar, textFieldSelectionState, TextContextMenuItems.Paste, MenuItemsAvailability.m3357getCanPasteimpl(iM3361unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, pVar, textFieldSelectionState, TextContextMenuItems.SelectAll, MenuItemsAvailability.m3358getCanSelectAllimpl(iM3361unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, pVar, textFieldSelectionState, TextContextMenuItems.Autofill, MenuItemsAvailability.m3354getCanAutofillimpl(iM3361unboximpl));
        return ab.f48028a;
    }

    private static final void contextMenuBuilder$lambda$0$textFieldItem(ContextMenuScope contextMenuScope, final ContextMenuState contextMenuState, final p<? super TextFieldSelectionState, ? super TextContextMenuItems, ab> pVar, final TextFieldSelectionState textFieldSelectionState, final TextContextMenuItems textContextMenuItems, boolean z) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt.AnonymousClass1(textContextMenuItems), null, false, null, new h.g.a.a<ab>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$contextMenuBuilder$lambda$0$textFieldItem$$inlined$TextItem$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    pVar.invoke(textFieldSelectionState, textContextMenuItems);
                    ContextMenuStateKt.close(contextMenuState);
                }

                @Override // h.g.a.a
                public /* bridge */ /* synthetic */ ab invoke() {
                    invoke2();
                    return ab.f48028a;
                }
            }, 14, null);
        }
    }

    public static final Object defaultDetectTextFieldTapGestures(final TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final h.g.a.a<ab> aVar, final h.g.a.a<ab> aVar2, e<? super ab> eVar) {
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new AnonymousClass2(mutableInteractionSource, textFieldSelectionState, null), new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0(aVar, textFieldSelectionState, aVar2, (Offset) obj);
            }
        }, eVar);
        return objDetectTapAndPress == a.f48038a ? objDetectTapAndPress : ab.f48028a;
    }

    static final ab defaultDetectTextFieldTapGestures$lambda$0(h.g.a.a aVar, TextFieldSelectionState textFieldSelectionState, h.g.a.a aVar2, Offset offset) {
        aVar.invoke();
        if (textFieldSelectionState.getEnabled() && textFieldSelectionState.isFocused()) {
            if (!textFieldSelectionState.getReadOnly()) {
                aVar2.invoke();
                if (textFieldSelectionState.getTextFieldState$foundation().getVisualText().length() > 0) {
                    textFieldSelectionState.setShowCursorHandle(true);
                }
            }
            textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
            textFieldSelectionState.m3758placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m3692fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.getTextLayoutState$foundation(), textFieldSelectionState.getTextLayoutState$foundation().m3686coercedInVisibleBoundsOfInputTextMKHz9U$foundation(offset.m7990unboximpl())));
        }
        return ab.f48028a;
    }

    public static final Object defaultTextFieldSelectionGestures(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, e<? super ab> eVar) {
        Object objAwaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, eVar);
        return objAwaitSelectionGestures == a.f48038a ? objAwaitSelectionGestures : ab.f48028a;
    }

    public static final h.g.a.a<ab> menuItem(final TextFieldSelectionState textFieldSelectionState, boolean z, final TextToolbarState textToolbarState, final h.g.a.a<ab> aVar) {
        if (z) {
            return new h.g.a.a<ab>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.menuItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    aVar.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }

                @Override // h.g.a.a
                public /* bridge */ /* synthetic */ ab invoke() {
                    invoke2();
                    return ab.f48028a;
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m3767reverse5zctL8(long j2) {
        return TextRangeKt.TextRange(TextRange.m10541getEndimpl(j2), TextRange.m10546getStartimpl(j2));
    }

    private static final void logDebug(h.g.a.a<String> aVar) {
    }
}
