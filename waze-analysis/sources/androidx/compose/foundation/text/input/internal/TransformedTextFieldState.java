package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;
    private final MutableState selectionWedgeAffinity$delegate;
    private final TextFieldState textFieldState;

    /* compiled from: WazeSource */
    final class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i2 & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        public final TextFieldCharSequence component1() {
            return this.text;
        }

        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return x.n(this.text, transformedText.text) && x.n(this.offsetMapping, transformedText.offsetMapping);
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, final CodepointTransformation codepointTransformation, final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return TransformedTextFieldState.outputTransformedText$lambda$0$0(this.f$0, outputTransformation);
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return TransformedTextFieldState.codepointTransformedText$lambda$0$0(this.f$0, codepointTransformation);
            }
        }) : null;
        this.selectionWedgeAffinity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText codepointTransformedText$lambda$0$0(TransformedTextFieldState transformedTextFieldState, CodepointTransformation codepointTransformation) {
        TextFieldCharSequence value$foundation;
        TransformedText value;
        Companion companion = Companion;
        State<TransformedText> state = transformedTextFieldState.outputTransformedText;
        if (state == null || (value = state.getValue()) == null || (value$foundation = value.getText()) == null) {
            value$foundation = transformedTextFieldState.textFieldState.getValue$foundation();
        }
        return companion.calculateTransformedText(value$foundation, codepointTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
    }

    static final void collectImeNotifications$lambda$0(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
        TextFieldCharSequence text;
        TransformedText transformedTextCalculateTransformedText = Companion.calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
        if (transformedTextCalculateTransformedText != null && (text = transformedTextCalculateTransformedText.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z, l lVar, int i2, Object obj) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        lVar.invoke(mainBuffer$foundation);
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, 1 == ((z ? 1 : 0) | (i2 & 1)), textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m3705mapFromTransformedxdX6G0(long j2, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m3719mapFromTransformedxdX6G0(j2, offsetMappingCalculator);
    }

    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m3706mapToTransformedXGyztTk(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m3720mapToTransformedXGyztTk(j2, offsetMappingCalculator, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText outputTransformedText$lambda$0$0(TransformedTextFieldState transformedTextFieldState, OutputTransformation outputTransformation) {
        return Companion.calculateTransformedText(transformedTextFieldState.textFieldState.getValue$foundation(), outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, ((i2 & 2) == 0) & z, textFieldEditUndoBehavior, (!((i2 & 8) == 0)) | z2, ((i2 & 16) == 0) & z3);
    }

    /* renamed from: replaceText-Le-punE$default, reason: not valid java name */
    public static /* synthetic */ void m3707replaceTextLepunE$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.m3714replaceTextLepunE(charSequence, j2, textFieldEditUndoBehavior, (!((i2 & 8) == 0)) | z, ((i2 & 16) == 0) & z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation().getChangeCount() <= 0 || !TextRange.m10540getCollapsedimpl(textFieldBuffer.m3476getSelectiond9O1mEE())) {
            return;
        }
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m10541getEndimpl(mainBuffer$foundation.m3476getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m10543getMaximpl(mainBuffer$foundation.m3476getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImeNotifications(final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r5, h.c.e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r4 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r4
            e.b.c.b(r6)
            goto L72
        L33:
            e.b.c.b(r6)
            androidx.compose.foundation.text.input.OutputTransformation r6 = r4.outputTransformation
            if (r6 == 0) goto L40
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda0 r6 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda0
            r6.<init>()
            r5 = r6
        L40:
            r0.L$0 = r5
            r0.label = r3
            h.c.e r0 = (h.c.e) r0
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l
            h.c.e r2 = h.c.a.h.d(r0)
            r6.<init>(r2, r3)
            r6.u()
            r2 = r6
            kotlinx.coroutines.k r2 = (kotlinx.coroutines.k) r2
            androidx.compose.foundation.text.input.TextFieldState r3 = access$getTextFieldState$p(r4)
            r3.addNotifyImeListener$foundation(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r3 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r3.<init>()
            h.g.a.l r3 = (h.g.a.l) r3
            r2.c(r3)
            java.lang.Object r4 = r6.j()
            if (r4 != r1) goto L6f
            h.d.b.c(r0)
        L6f:
            if (r4 != r1) goto L72
            return r1
        L72:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, h.c.e):java.lang.Object");
    }

    public final void deleteSelectedText(boolean z) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBuffer.replace$foundation$default(mainBuffer$foundation, TextRange.m10544getMinimpl(mainBuffer$foundation.m3476getSelectiond9O1mEE()), TextRange.m10543getMaximpl(mainBuffer$foundation.m3476getSelectiond9O1mEE()), "", 0, 0, z, 24, null);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m10544getMinimpl(mainBuffer$foundation.m3476getSelectiond9O1mEE()), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void editUntransformedTextAsUser(boolean z, l<? super TextFieldBuffer, ab> lVar) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        lVar.invoke(mainBuffer$foundation);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (x.n(this.textFieldState, transformedTextFieldState.textFieldState) && x.n(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return x.n(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    /* renamed from: getUntransformedComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m3708getUntransformedCompositionMzsxiRA() {
        return this.textFieldState.m3485getCompositionMzsxiRA();
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation();
    }

    public final boolean getUserCommit() {
        return this.textFieldState.getUserCommit$foundation();
    }

    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public int hashCode() {
        int iHashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int iHashCode2 = (iHashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return iHashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    /* renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m3709highlightCharsIn7RAjNK8(int i2, long j2) {
        long jM3711mapFromTransformedGEjPoXI = m3711mapFromTransformedGEjPoXI(j2);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        textFieldState.getMainBuffer$foundation().m3477setHighlightK7f2yys$foundation(i2, TextRange.m10546getStartimpl(jM3711mapFromTransformedGEjPoXI), TextRange.m10541getEndimpl(jM3711mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final boolean isTransformed() {
        return (this.outputTransformation == null && this.codepointTransformation == null) ? false : true;
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m3710mapFromTransformedjx7JFs(int i2) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM3646mapFromDestjx7JFs = offsetMapping != null ? offsetMapping.m3646mapFromDestjx7JFs(i2) : TextRangeKt.TextRange(i2);
        return offsetMapping2 != null ? Companion.m3719mapFromTransformedxdX6G0(jM3646mapFromDestjx7JFs, offsetMapping2) : jM3646mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m3711mapFromTransformedGEjPoXI(long j2) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            j2 = Companion.m3719mapFromTransformedxdX6G0(j2, offsetMapping);
        }
        return offsetMapping2 != null ? Companion.m3719mapFromTransformedxdX6G0(j2, offsetMapping2) : j2;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m3712mapToTransformedjx7JFs(int i2) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM3647mapFromSourcejx7JFs = offsetMapping2 != null ? offsetMapping2.m3647mapFromSourcejx7JFs(i2) : TextRangeKt.TextRange(i2);
        return offsetMapping != null ? Companion.m3720mapToTransformedXGyztTk(jM3647mapFromSourcejx7JFs, offsetMapping, getSelectionWedgeAffinity()) : jM3647mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m3713mapToTransformedGEjPoXI(long j2) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            j2 = Companion.m3721mapToTransformedXGyztTk$default(Companion, j2, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? Companion.m3720mapToTransformedXGyztTk(j2, offsetMapping, getSelectionWedgeAffinity()) : j2;
    }

    public final void placeCursorBeforeCharAt(int i2) {
        m3715selectCharsIn5zctL8(TextRangeKt.TextRange(i2));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.delete(mainBuffer$foundation, 0, mainBuffer$foundation.getLength());
        mainBuffer$foundation.append(charSequence.toString());
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void replaceSelectedText(CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, boolean z3) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        if (z) {
            mainBuffer$foundation.commitComposition$foundation();
        }
        long jM3476getSelectiond9O1mEE = mainBuffer$foundation.m3476getSelectiond9O1mEE();
        TextFieldBuffer.replace$foundation$default(mainBuffer$foundation, TextRange.m10544getMinimpl(jM3476getSelectiond9O1mEE), TextRange.m10543getMaximpl(jM3476getSelectiond9O1mEE), charSequence, 0, 0, z3, 24, null);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m10544getMinimpl(jM3476getSelectiond9O1mEE) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* renamed from: replaceText-Le-punE, reason: not valid java name */
    public final void m3714replaceTextLepunE(CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z, boolean z2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        long jM3711mapFromTransformedGEjPoXI = m3711mapFromTransformedGEjPoXI(j2);
        TextFieldBuffer.replace$foundation$default(mainBuffer$foundation, TextRange.m10544getMinimpl(jM3711mapFromTransformedGEjPoXI), TextRange.m10543getMaximpl(jM3711mapFromTransformedGEjPoXI), charSequence, 0, 0, z2, 24, null);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m10544getMinimpl(jM3711mapFromTransformedGEjPoXI) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, 0, mainBuffer$foundation.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m3715selectCharsIn5zctL8(long j2) {
        m3716selectUntransformedCharsIn5zctL8(m3711mapFromTransformedGEjPoXI(j2));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m3716selectUntransformedCharsIn5zctL8(long j2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer$foundation(), TextRange.m10546getStartimpl(j2), TextRange.m10541getEndimpl(j2));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity);
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void update(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    /* compiled from: WazeSource */
    final class Companion {

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            List<AnnotatedString.Range<AnnotatedString.Annotation>> list;
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, 0 == true ? 1 : 0, null, offsetMappingCalculator, 6, null);
            textFieldBuffer.setCanCallAddStyle$foundation(true);
            outputTransformation.transformOutput(textFieldBuffer);
            textFieldBuffer.setCanCallAddStyle$foundation(false);
            List<AnnotatedString.Range<AnnotatedString.Annotation>> outputTransformationAnnotations$foundation = textFieldBuffer.getOutputTransformationAnnotations$foundation();
            if (textFieldBuffer.getChanges().getChangeCount() == 0 && ((list = outputTransformationAnnotations$foundation) == null || list.isEmpty())) {
                return null;
            }
            long jM3720mapToTransformedXGyztTk = m3720mapToTransformedXGyztTk(textFieldCharSequence.m3484getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM3483getCompositionMzsxiRA = textFieldCharSequence.m3483getCompositionMzsxiRA();
            return new TransformedText(TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, jM3720mapToTransformedXGyztTk, textRangeM3483getCompositionMzsxiRA != null ? TextRange.m10534boximpl(TransformedTextFieldState.Companion.m3720mapToTransformedXGyztTk(textRangeM3483getCompositionMzsxiRA.m10550unboximpl(), offsetMappingCalculator, selectionWedgeAffinity)) : null, null, outputTransformationAnnotations$foundation, 4, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m3719mapFromTransformedxdX6G0(long j2, OffsetMappingCalculator offsetMappingCalculator) {
            boolean zM10540getCollapsedimpl = TextRange.m10540getCollapsedimpl(j2);
            long jM3646mapFromDestjx7JFs = offsetMappingCalculator.m3646mapFromDestjx7JFs(TextRange.m10546getStartimpl(j2));
            long jM3646mapFromDestjx7JFs2 = zM10540getCollapsedimpl ? jM3646mapFromDestjx7JFs : offsetMappingCalculator.m3646mapFromDestjx7JFs(TextRange.m10541getEndimpl(j2));
            int iMin = Math.min(TextRange.m10544getMinimpl(jM3646mapFromDestjx7JFs), TextRange.m10544getMinimpl(jM3646mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m10543getMaximpl(jM3646mapFromDestjx7JFs), TextRange.m10543getMaximpl(jM3646mapFromDestjx7JFs2));
            return TextRange.m10545getReversedimpl(j2) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m3720mapToTransformedXGyztTk(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long jTextRange;
            boolean zM10540getCollapsedimpl = TextRange.m10540getCollapsedimpl(j2);
            long jM3647mapFromSourcejx7JFs = offsetMappingCalculator.m3647mapFromSourcejx7JFs(TextRange.m10546getStartimpl(j2));
            long jM3647mapFromSourcejx7JFs2 = zM10540getCollapsedimpl ? jM3647mapFromSourcejx7JFs : offsetMappingCalculator.m3647mapFromSourcejx7JFs(TextRange.m10541getEndimpl(j2));
            WedgeAffinity endAffinity = null;
            WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (TextRange.m10540getCollapsedimpl(j2)) {
                endAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                endAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.m10540getCollapsedimpl(jM3647mapFromSourcejx7JFs)) {
                int iOrdinal = startAffinity.ordinal();
                if (iOrdinal == 0) {
                    jM3647mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m10546getStartimpl(jM3647mapFromSourcejx7JFs));
                } else {
                    if (iOrdinal != 1) {
                        throw new i();
                    }
                    jM3647mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m10541getEndimpl(jM3647mapFromSourcejx7JFs));
                }
            }
            if (endAffinity != null && !TextRange.m10540getCollapsedimpl(jM3647mapFromSourcejx7JFs2)) {
                int iOrdinal2 = endAffinity.ordinal();
                if (iOrdinal2 == 0) {
                    jTextRange = TextRangeKt.TextRange(TextRange.m10546getStartimpl(jM3647mapFromSourcejx7JFs2));
                } else {
                    if (iOrdinal2 != 1) {
                        throw new i();
                    }
                    jTextRange = TextRangeKt.TextRange(TextRange.m10541getEndimpl(jM3647mapFromSourcejx7JFs2));
                }
                jM3647mapFromSourcejx7JFs2 = jTextRange;
            }
            int iMin = Math.min(TextRange.m10544getMinimpl(jM3647mapFromSourcejx7JFs), TextRange.m10544getMinimpl(jM3647mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m10543getMaximpl(jM3647mapFromSourcejx7JFs), TextRange.m10543getMaximpl(jM3647mapFromSourcejx7JFs2));
            return TextRange.m10545getReversedimpl(j2) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        static /* synthetic */ long m3721mapToTransformedXGyztTk$default(Companion companion, long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m3720mapToTransformedXGyztTk(j2, offsetMappingCalculator, selectionWedgeAffinity);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeM10534boximpl = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long jM3720mapToTransformedXGyztTk = m3720mapToTransformedXGyztTk(textFieldCharSequence.m3484getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM3483getCompositionMzsxiRA = textFieldCharSequence.m3483getCompositionMzsxiRA();
            if (textRangeM3483getCompositionMzsxiRA != null) {
                textRangeM10534boximpl = TextRange.m10534boximpl(TransformedTextFieldState.Companion.m3720mapToTransformedXGyztTk(textRangeM3483getCompositionMzsxiRA.m10550unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, jM3720mapToTransformedXGyztTk, textRangeM10534boximpl, null, null, null, null, 120, null), offsetMappingCalculator);
        }
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i2, o oVar) {
        this(textFieldState, (i2 & 2) != 0 ? null : inputTransformation, (i2 & 4) != 0 ? null : codepointTransformation, (i2 & 8) != 0 ? null : outputTransformation);
    }
}
