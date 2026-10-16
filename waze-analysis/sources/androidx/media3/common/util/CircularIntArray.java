package androidx.media3.common.util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CircularIntArray {
    private int capacityBitmask = 7;
    private int[] elements = new int[8];
    private int head;
    private int tail;

    private void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i2 = this.head;
        int i3 = length - i2;
        int i4 = length + length;
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.elements, 0, iArr2, i3, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i4 - 1;
    }

    public void addLast(int i2) {
        int[] iArr = this.elements;
        int i3 = this.tail;
        iArr[i3] = i2;
        int i4 = this.capacityBitmask & (i3 + 1);
        this.tail = i4;
        if (i4 == this.head) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.tail = this.head;
    }

    public boolean isEmpty() {
        return this.head == this.tail;
    }

    public int popFirst() {
        int i2 = this.head;
        if (i2 == this.tail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.elements[i2];
        this.head = (i2 + 1) & this.capacityBitmask;
        return i3;
    }
}
