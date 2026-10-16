package androidx.window.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowStrictModeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String str) {
        super(str);
        x.f(str, "message");
    }
}
