package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    /* renamed from: defaultKeyboardActionWithResult-KlQnJC8, reason: not valid java name */
    private final boolean m3321defaultKeyboardActionWithResultKlQnJC8(int i2) {
        SoftwareKeyboardController softwareKeyboardController;
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10733getNexteUduSuo())) {
            getFocusManager().mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
            return true;
        }
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10735getPreviouseUduSuo())) {
            getFocusManager().mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
            return true;
        }
        if (!ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10731getDoneeUduSuo()) || (softwareKeyboardController = this.keyboardController) == null) {
            return false;
        }
        softwareKeyboardController.hide();
        return true;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo3322defaultKeyboardActionKlQnJC8(int i2) {
        m3321defaultKeyboardActionWithResultKlQnJC8(i2);
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        x.j("focusManager");
        return null;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        x.j("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final boolean m3323runActionKlQnJC8(int i2) {
        l<KeyboardActionScope, ab> onSend;
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10731getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10732getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10733getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10735getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10736getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10737getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10730getDefaulteUduSuo()) && !ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10734getNoneeUduSuo())) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend == null) {
            return m3321defaultKeyboardActionWithResultKlQnJC8(i2);
        }
        onSend.invoke(this);
        return true;
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
