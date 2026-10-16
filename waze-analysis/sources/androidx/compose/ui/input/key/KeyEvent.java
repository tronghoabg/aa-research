package androidx.compose.ui.input.key;

import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m9418boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9420equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && x.n(keyEvent, ((KeyEvent) obj).m9424unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9421equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return x.n(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9422hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9423toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m9420equalsimpl(this.nativeKeyEvent, obj);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m9422hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m9423toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m9424unboximpl() {
        return this.nativeKeyEvent;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m9419constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }
}
