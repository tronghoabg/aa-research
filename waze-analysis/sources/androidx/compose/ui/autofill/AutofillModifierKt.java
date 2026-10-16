package androidx.compose.ui.autofill;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutofillModifierKt {
    public static final Modifier contentType(Modifier modifier, ContentType contentType) {
        return SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new AnonymousClass1(contentType));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.autofill.AutofillModifierKt$contentType$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<SemanticsPropertyReceiver, ab> {
        final /* synthetic */ ContentType $contentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentType contentType) {
            super(1);
            this.$contentType = contentType;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, this.$contentType);
        }
    }
}
