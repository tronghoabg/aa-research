package androidx.compose.ui.focus;

import h.g.a.l;
import h.g.b.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusProperties$enter$1 extends y implements l<FocusDirection, FocusRequester> {
    public static final FocusProperties$enter$1 INSTANCE = new FocusProperties$enter$1();

    FocusProperties$enter$1() {
        super(1);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return m7883invoke3ESFkO8(focusDirection.m7858unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m7883invoke3ESFkO8(int i2) {
        return FocusRequester.Companion.getDefault();
    }
}
