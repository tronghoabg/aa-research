package androidx.compose.runtime.composer.linkbuffer;

import h.a.c;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotMoveManager {
    public static final int $stable = 8;
    private Object[] destination;
    private final Object[] source;
    private int pendingMoveOffset = -1;
    private int pendingMoveStart = -1;
    private int pendingMoveEnd = -1;
    private int highest = -1;

    public SlotMoveManager(Object[] objArr, Object[] objArr2) {
        this.source = objArr;
        this.destination = objArr2;
    }

    private final void flush() {
        int i2 = this.pendingMoveOffset;
        if (i2 >= 0) {
            Object[] objArr = this.source;
            c.at(objArr, this.destination, i2, this.pendingMoveStart, this.pendingMoveEnd);
            if (objArr == this.destination) {
                Object obj = SlotTableAddresSpaceKt.Unallocated;
                int i3 = this.pendingMoveStart;
                int i4 = this.pendingMoveEnd;
                x.f(objArr, "<this>");
                Arrays.fill(objArr, i3, i4, obj);
            }
            int i5 = this.pendingMoveOffset + (this.pendingMoveEnd - this.pendingMoveStart);
            this.pendingMoveOffset = -1;
            this.pendingMoveEnd = -1;
            if (i5 > this.highest) {
                this.highest = i5;
            }
        }
    }

    public final Object[] done() {
        Object[] objArr;
        int length;
        flush();
        int i2 = this.highest;
        if (i2 >= 0 && i2 < (length = (objArr = this.destination).length)) {
            if (length == i2 + 1) {
                objArr[i2] = SlotTableAddresSpaceKt.Unallocated;
            } else {
                Object obj = SlotTableAddresSpaceKt.Unallocated;
                x.f(objArr, "<this>");
                Arrays.fill(objArr, i2, length, obj);
            }
        }
        return this.destination;
    }

    public final Object[] getDestination() {
        return this.destination;
    }

    public final Object[] getSource() {
        return this.source;
    }

    public final void move(int i2, int i3, int i4) {
        Object[] objArr = this.source;
        Object[] objArr2 = this.destination;
        if (objArr == objArr2) {
            if (i3 == i2) {
                return;
            }
            int i5 = (i4 - i3) + i2 + i2;
            if (i5 >= objArr2.length) {
                Object[] objArr3 = this.source;
                Object[] objArrCopyOf = Arrays.copyOf(objArr3, objArr3.length);
                x.e(objArrCopyOf, "copyOf(...)");
                this.destination = objArrCopyOf;
                break;
            }
            for (int i6 = i2; i6 < i5; i6++) {
                if (objArr2[i6] != SlotTableAddresSpaceKt.Unallocated) {
                    Object[] objArr32 = this.source;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr32, objArr32.length);
                    x.e(objArrCopyOf2, "copyOf(...)");
                    this.destination = objArrCopyOf2;
                    break;
                }
            }
        }
        if (this.pendingMoveEnd == i3) {
            this.pendingMoveEnd = i4;
            return;
        }
        flush();
        this.pendingMoveOffset = i2;
        this.pendingMoveStart = i3;
        this.pendingMoveEnd = i4;
    }

    public final void setDestination(Object[] objArr) {
        this.destination = objArr;
    }
}
