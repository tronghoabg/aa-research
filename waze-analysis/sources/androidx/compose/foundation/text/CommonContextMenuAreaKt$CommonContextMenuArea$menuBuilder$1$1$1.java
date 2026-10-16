package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ TextContextMenuItems $item;
    final /* synthetic */ TextFieldSelectionState $this_contextMenuBuilder;
    int label;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextContextMenuItems.values().length];
            try {
                iArr[TextContextMenuItems.Cut.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextContextMenuItems.Copy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextContextMenuItems.Paste.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextContextMenuItems.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextContextMenuItems.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, e<? super CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1> eVar) {
        super(2, eVar);
        this.$item = textContextMenuItems;
        this.$this_contextMenuBuilder = textFieldSelectionState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(this.$item, this.$this_contextMenuBuilder, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r5.$this_contextMenuBuilder.paste(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r5.$this_contextMenuBuilder.copy(false, r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r5.$this_contextMenuBuilder.cut(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
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
            goto L70
        L1c:
            e.b.c.b(r6)
            androidx.compose.foundation.text.TextContextMenuItems r6 = r5.$item
            androidx.compose.foundation.text.TextContextMenuItems r1 = androidx.compose.foundation.text.TextContextMenuItems.Cut
            int r6 = r6.ordinal()
            if (r6 == 0) goto L62
            r1 = 0
            if (r6 == r4) goto L54
            if (r6 == r3) goto L45
            if (r6 == r2) goto L3f
            r0 = 4
            if (r6 != r0) goto L39
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r5.$this_contextMenuBuilder
            r5.autofill()
            goto L70
        L39:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L3f:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r5.$this_contextMenuBuilder
            r5.selectAll()
            goto L70
        L45:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.label = r2
            r5 = 0
            java.lang.Object r5 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste$default(r6, r1, r3, r4, r5)
            if (r5 != r0) goto L70
            goto L6f
        L54:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
            r2 = r5
            h.c.e r2 = (h.c.e) r2
            r5.label = r3
            java.lang.Object r5 = r6.copy(r1, r2)
            if (r5 != r0) goto L70
            goto L6f
        L62:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r5.$this_contextMenuBuilder
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r4
            java.lang.Object r5 = r6.cut(r1)
            if (r5 != r0) goto L70
        L6f:
            return r0
        L70:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
