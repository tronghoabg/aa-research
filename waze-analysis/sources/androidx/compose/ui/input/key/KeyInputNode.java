package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {
    private l<? super KeyEvent, Boolean> onEvent;
    private l<? super KeyEvent, Boolean> onPreEvent;

    public KeyInputNode(l<? super KeyEvent, Boolean> lVar, l<? super KeyEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    public final l<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final l<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo1939onKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        l<? super KeyEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m9418boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo1941onPreKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        l<? super KeyEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m9418boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(l<? super KeyEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(l<? super KeyEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
