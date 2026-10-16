package androidx.compose.ui.input.pointer;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RequestDisallowInterceptTouchEvent implements l<Boolean, ab> {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui() {
        return this.pointerInteropFilter;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return ab.f48028a;
    }

    public final void setPointerInteropFilter$ui(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.setDisallowIntercept$ui(z);
        }
    }
}
