package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $isFromHardwareSource;
    final /* synthetic */ KeyCommand $keyCommand;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z, e<? super TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1> eVar) {
        super(2, eVar);
        this.$keyCommand = keyCommand;
        this.this$0 = textFieldDecoratorModifierNode;
        this.$isFromHardwareSource = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(this.$keyCommand, this.this$0, this.$isFromHardwareSource, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r5.this$0.getTextFieldSelectionState().cut(r5) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6.getTextFieldSelectionState().paste(r1, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r5.this$0.getTextFieldSelectionState().copy(false, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L18:
            e.b.c.b(r6)
            goto L64
        L1c:
            e.b.c.b(r6)
            androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
            androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.LEFT_CHAR
            int r6 = r6.ordinal()
            switch(r6) {
                case 17: goto L51;
                case 18: goto L3d;
                case 19: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L64
        L2b:
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r3
            java.lang.Object r5 = r6.cut(r1)
            if (r5 == r0) goto L63
            goto L64
        L3d:
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
            boolean r1 = r5.$isFromHardwareSource
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.label = r2
            java.lang.Object r5 = r6.paste(r1, r3)
            if (r5 != r0) goto L64
            goto L63
        L51:
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r4
            r5 = 0
            java.lang.Object r5 = r6.copy(r5, r1)
            if (r5 != r0) goto L64
        L63:
            return r0
        L64:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
