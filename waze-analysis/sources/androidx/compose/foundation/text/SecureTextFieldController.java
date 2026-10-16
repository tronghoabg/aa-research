package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;
    private final a<Character> obfuscationMask;
    private final PasswordInputTransformation passwordInputTransformation;
    private final a<SplitVisibilitySettings> platformAllowsReveal;
    private final a<TextObfuscationMode> textObfuscationMode;
    private final CodepointTransformation codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.SecureTextFieldController$$ExternalSyntheticLambda0
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int transform(int i2, int i3) {
            return SecureTextFieldController.codepointTransformation$lambda$0(this.f$0, i2, i3);
        }
    };
    private final Modifier focusChangeModifier = FocusChangedModifierKt.onFocusChanged(Modifier.Companion, new l() { // from class: androidx.compose.foundation.text.SecureTextFieldController$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SecureTextFieldController.focusChangeModifier$lambda$0(this.f$0, (FocusState) obj);
        }
    });
    private final o<ab> resetTimerSignal = w.c(Integer.MAX_VALUE, null, null, 6);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<ab, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return SecureTextFieldController.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(ab abVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(abVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(1500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            SecureTextFieldController.this.getPasswordInputTransformation().hide();
            return ab.f48028a;
        }
    }

    public SecureTextFieldController(a<Character> aVar, a<TextObfuscationMode> aVar2, a<SplitVisibilitySettings> aVar3) {
        this.obfuscationMask = aVar;
        this.textObfuscationMode = aVar2;
        this.platformAllowsReveal = aVar3;
        this.passwordInputTransformation = new PasswordInputTransformation(new SecureTextFieldController$passwordInputTransformation$1(this), aVar2, aVar3);
    }

    static final int codepointTransformation$lambda$0(SecureTextFieldController secureTextFieldController, int i2, int i3) {
        return i2 == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation() ? i3 : secureTextFieldController.obfuscationMask.invoke().charValue();
    }

    static final ab focusChangeModifier$lambda$0(SecureTextFieldController secureTextFieldController, FocusState focusState) {
        if (!focusState.isFocused()) {
            secureTextFieldController.passwordInputTransformation.hide();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (this.resetTimerSignal.i(ab.f48028a) instanceof s) {
            this.passwordInputTransformation.hide();
        }
    }

    public final CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    public final Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    public final PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    public final a<SplitVisibilitySettings> getPlatformAllowsReveal() {
        return this.platformAllowsReveal;
    }

    public final a<TextObfuscationMode> getTextObfuscationMode() {
        return this.textObfuscationMode;
    }

    public final Object observeHideEvents(e<? super ab> eVar) {
        Object objE = ai.e(ai.v(this.resetTimerSignal), new AnonymousClass2(null), eVar);
        return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
    }
}
