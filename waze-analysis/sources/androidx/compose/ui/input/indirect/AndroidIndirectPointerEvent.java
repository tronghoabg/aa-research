package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent implements PlatformIndirectPointerEvent {
    public static final int $stable = 8;
    private final List<IndirectPointerInputChange> changes;
    private final MotionEvent nativeEvent;
    private final int primaryDirectionalMotionAxis;
    private final int type;

    private AndroidIndirectPointerEvent(List<IndirectPointerInputChange> list, int i2, int i3, MotionEvent motionEvent) {
        this.changes = list;
        this.type = i2;
        this.primaryDirectionalMotionAxis = i3;
        this.nativeEvent = motionEvent;
        if (getChanges().isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    public List<IndirectPointerInputChange> getChanges() {
        return this.changes;
    }

    public final MotionEvent getNativeEvent$ui() {
        return this.nativeEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public int mo9081getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getType-4ZHQPSE, reason: not valid java name */
    public int mo9082getType4ZHQPSE() {
        return this.type;
    }

    public /* synthetic */ AndroidIndirectPointerEvent(List list, int i2, int i3, MotionEvent motionEvent, o oVar) {
        this(list, i2, i3, motionEvent);
    }
}
