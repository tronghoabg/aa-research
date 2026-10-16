package androidx.compose.ui.input.pointer;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0));
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        return (pointerInputChange == null || (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) == null) ? pointerInputChange != null ? pointerInputChange.getDownChange$ui() : this.downChange : consumedDelegate$ui.getDownChange$ui();
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        return (pointerInputChange == null || (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) == null) ? pointerInputChange != null ? pointerInputChange.getPositionChange$ui() : this.positionChange : consumedDelegate$ui.getPositionChange$ui();
    }

    public final void setDownChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setDownChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui(z);
        }
        this.downChange = z;
    }

    public final void setPositionChange(boolean z) {
        PointerInputChange consumedDelegate$ui;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui = pointerInputChange.getConsumedDelegate$ui()) != null) {
            consumedDelegate$ui.setPositionChange$ui(z);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui(z);
        }
        this.positionChange = z;
    }

    public static /* synthetic */ void getDownChange$annotations() {
    }

    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public ConsumedData(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    public ConsumedData(PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange$ui(), pointerInputChange.getDownChange$ui());
        this.change = pointerInputChange;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z = false;
        this(z, z, 3, null);
    }
}
