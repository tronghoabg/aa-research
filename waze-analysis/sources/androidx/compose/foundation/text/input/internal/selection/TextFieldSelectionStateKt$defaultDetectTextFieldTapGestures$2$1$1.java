package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ PressGestureScope $$this$detectTapAndPress;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ long $offset;
        final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
            this.$offset = j2;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r7.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r0 = r7.L$0
                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                e.b.c.b(r8)
                goto L64
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                java.lang.Object r1 = r7.L$0
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                e.b.c.b(r8)
                goto L46
            L25:
                e.b.c.b(r8)
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r7.$this_defaultDetectTextFieldTapGestures
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = r8.getPressInteraction()
                if (r8 == 0) goto L49
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r7.$this_defaultDetectTextFieldTapGestures
                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                r6.<init>(r8)
                androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                r7.L$0 = r5
                r7.label = r4
                java.lang.Object r8 = r1.emit(r6, r7)
                if (r8 == r0) goto L62
                r1 = r5
            L46:
                r1.setPressInteraction(r2)
            L49:
                long r4 = r7.$offset
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                r8.<init>(r4, r2)
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                r2 = r8
                androidx.compose.foundation.interaction.Interaction r2 = (androidx.compose.foundation.interaction.Interaction) r2
                r4 = r7
                h.c.e r4 = (h.c.e) r4
                r7.L$0 = r8
                r7.label = r3
                java.lang.Object r1 = r1.emit(r2, r4)
                if (r1 != r0) goto L63
            L62:
                return r0
            L63:
                r0 = r8
            L64:
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = r7.$this_defaultDetectTextFieldTapGestures
                r7.setPressInteraction(r0)
                h.ab r7 = h.ab.f48028a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, e<? super TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1> eVar) {
        super(2, eVar);
        this.$$this$detectTapAndPress = pressGestureScope;
        this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
        this.$offset = j2;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(this.$$this$detectTapAndPress, this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, eVar);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.L$0 = obj;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r3.emit(r12, r11) == r0) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            e.b.c.b(r12)
            goto L6f
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L19:
            e.b.c.b(r12)
            goto L43
        L1d:
            e.b.c.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.af r12 = (kotlinx.coroutines.af) r12
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r11.$this_defaultDetectTextFieldTapGestures
            long r7 = r11.$offset
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r11.$interactionSource
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1
            r10 = 0
            r5.<init>(r6, r7, r9, r10)
            h.g.a.p r5 = (h.g.a.p) r5
            r1 = 3
            kotlinx.coroutines.aj.z(r12, r4, r4, r5, r1)
            androidx.compose.foundation.gestures.PressGestureScope r12 = r11.$$this$detectTapAndPress
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.label = r3
            java.lang.Object r12 = r12.tryAwaitRelease(r1)
            if (r12 == r0) goto L77
        L43:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r11.$this_defaultDetectTextFieldTapGestures
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r1.getPressInteraction()
            if (r1 == 0) goto L6f
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r11.$interactionSource
            if (r12 == 0) goto L5d
            androidx.compose.foundation.interaction.PressInteraction$Release r12 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r12.<init>(r1)
            androidx.compose.foundation.interaction.PressInteraction r12 = (androidx.compose.foundation.interaction.PressInteraction) r12
            goto L64
        L5d:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r12 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r12.<init>(r1)
            androidx.compose.foundation.interaction.PressInteraction r12 = (androidx.compose.foundation.interaction.PressInteraction) r12
        L64:
            androidx.compose.foundation.interaction.Interaction r12 = (androidx.compose.foundation.interaction.Interaction) r12
            r11.label = r2
            java.lang.Object r12 = r3.emit(r12, r11)
            if (r12 != r0) goto L6f
            goto L77
        L6f:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r11 = r11.$this_defaultDetectTextFieldTapGestures
            r11.setPressInteraction(r4)
            h.ab r11 = h.ab.f48028a
            return r11
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
