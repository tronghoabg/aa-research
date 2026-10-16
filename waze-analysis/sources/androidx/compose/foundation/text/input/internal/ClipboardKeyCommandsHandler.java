package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import h.ab;
import h.g.a;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {
    private final p<KeyCommand, Boolean, ab> handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(p pVar) {
        this.handler = pVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m3515boximpl(p pVar) {
        return new ClipboardKeyCommandsHandler(pVar);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3517equalsimpl(p<? super KeyCommand, ? super Boolean, ? extends ab> pVar, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && x.n(pVar, ((ClipboardKeyCommandsHandler) obj).m3521unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3518equalsimpl0(p<? super KeyCommand, ? super Boolean, ? extends ab> pVar, p<? super KeyCommand, ? super Boolean, ? extends ab> pVar2) {
        return x.n(pVar, pVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3519hashCodeimpl(p<? super KeyCommand, ? super Boolean, ? extends ab> pVar) {
        return pVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3520toStringimpl(p<? super KeyCommand, ? super Boolean, ? extends ab> pVar) {
        return "ClipboardKeyCommandsHandler(handler=" + pVar + ')';
    }

    public boolean equals(Object obj) {
        return m3517equalsimpl(this.handler, obj);
    }

    public final p<KeyCommand, Boolean, ab> getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m3519hashCodeimpl(this.handler);
    }

    public String toString() {
        return m3520toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ p m3521unboximpl() {
        return this.handler;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static p<? super KeyCommand, ? super Boolean, ? extends ab> m3516constructorimpl(p<? super KeyCommand, ? super Boolean, ab> pVar) {
        return pVar;
    }
}
