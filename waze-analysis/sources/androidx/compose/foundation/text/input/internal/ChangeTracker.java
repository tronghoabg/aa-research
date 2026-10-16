package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    /* compiled from: WazeSource */
    final class Change {
        private boolean isFromHardwareSource;
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i2, int i3, int i4, int i5, boolean z) {
            this.preStart = i2;
            this.preEnd = i3;
            this.originalStart = i4;
            this.originalEnd = i5;
            this.isFromHardwareSource = z;
        }

        public static /* synthetic */ Change copy$default(Change change, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i2 = change.preStart;
            }
            if ((i6 & 2) != 0) {
                i3 = change.preEnd;
            }
            if ((i6 & 4) != 0) {
                i4 = change.originalStart;
            }
            if ((i6 & 8) != 0) {
                i5 = change.originalEnd;
            }
            if ((i6 & 16) != 0) {
                z = change.isFromHardwareSource;
            }
            boolean z2 = z;
            int i7 = i4;
            return change.copy(i2, i3, i7, i5, z2);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        public final boolean component5() {
            return this.isFromHardwareSource;
        }

        public final Change copy(int i2, int i3, int i4, int i5, boolean z) {
            return new Change(i2, i3, i4, i5, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd && this.isFromHardwareSource == change.isFromHardwareSource;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public int hashCode() {
            return (((((((this.preStart * 31) + this.preEnd) * 31) + this.originalStart) * 31) + this.originalEnd) * 31) + ChangeTracker$Change$$ExternalSyntheticBackport0.m(this.isFromHardwareSource);
        }

        public final boolean isFromHardwareSource() {
            return this.isFromHardwareSource;
        }

        public final void setFromHardwareSource(boolean z) {
            this.isFromHardwareSource = z;
        }

        public final void setOriginalEnd(int i2) {
            this.originalEnd = i2;
        }

        public final void setOriginalStart(int i2) {
            this.originalStart = i2;
        }

        public final void setPreEnd(int i2) {
            this.preEnd = i2;
        }

        public final void setPreStart(int i2) {
            this.preStart = i2;
        }

        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ", isFromHardwareSource=" + this.isFromHardwareSource + ')';
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Change change = changeArr[i2];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd(), change.isFromHardwareSource()));
        }
    }

    private final void appendNewChange(Change change, int i2, int i3, int i4, boolean z) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change changeLast = this._changesTemp.last();
            preEnd = changeLast.getPreEnd() - changeLast.getOriginalEnd();
        }
        if (change == null) {
            int i5 = i2 - preEnd;
            change = new Change(i2, i3 + i4, i5, i5 + (i3 - i2), z);
        } else {
            change.setFromHardwareSource(change.isFromHardwareSource() || z);
            if (change.getPreStart() > i2) {
                change.setPreStart(i2);
                change.setOriginalStart(i2);
            }
            if (i3 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i3);
                change.setOriginalEnd(i3 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i4);
        }
        this._changesTemp.add(change);
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo3480getOriginalRangejx7JFs(int i2) {
        Change change = this._changes.content[i2];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo3481getRangejx7JFs(int i2) {
        Change change = this._changes.content[i2];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    public final boolean isFromHardwareSource$foundation(int i2) {
        return this._changes.content[i2].isFromHardwareSource();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Change change = changeArr[i2];
            sb.append("(" + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i2 < getChangeCount() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void trackChange(int r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            if (r11 != r12) goto L6
            if (r13 == 0) goto L5
            goto L6
        L5:
            return
        L6:
            int r2 = java.lang.Math.min(r11, r12)
            int r3 = java.lang.Math.max(r11, r12)
            int r11 = r3 - r2
            r12 = 0
            r0 = 0
            r4 = r12
            r1 = r0
            r0 = r4
        L15:
            int r5 = r13 - r11
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r6 = r10._changes
            int r6 = r6.getSize()
            if (r0 >= r6) goto Lac
            int r6 = r0 + 1
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r7 = r10._changes
            T[] r7 = r7.content
            r0 = r7[r0]
            r7 = r0
            androidx.compose.foundation.text.input.internal.ChangeTracker$Change r7 = (androidx.compose.foundation.text.input.internal.ChangeTracker.Change) r7
            int r0 = r7.getPreStart()
            r8 = 1
            if (r2 > r0) goto L34
            if (r0 > r3) goto L34
            goto L55
        L34:
            int r0 = r7.getPreEnd()
            if (r2 > r0) goto L3c
            if (r0 <= r3) goto L55
        L3c:
            int r0 = r7.getPreStart()
            int r9 = r7.getPreEnd()
            if (r2 > r9) goto L48
            if (r0 <= r2) goto L55
        L48:
            int r0 = r7.getPreStart()
            int r9 = r7.getPreEnd()
            if (r3 > r9) goto L7a
            if (r0 <= r3) goto L55
            goto L7a
        L55:
            if (r1 != 0) goto L59
            r1 = r7
            goto L78
        L59:
            int r0 = r7.getPreEnd()
            r1.setPreEnd(r0)
            int r0 = r7.getOriginalEnd()
            r1.setOriginalEnd(r0)
            boolean r0 = r1.isFromHardwareSource()
            if (r0 != 0) goto L75
            boolean r0 = r7.isFromHardwareSource()
            if (r0 == 0) goto L74
            goto L75
        L74:
            r8 = r12
        L75:
            r1.setFromHardwareSource(r8)
        L78:
            r0 = r6
            goto L15
        L7a:
            int r0 = r7.getPreStart()
            if (r0 <= r3) goto L8f
            if (r4 != 0) goto L8a
            r0 = r10
            r4 = r5
            r5 = r14
            r0.appendNewChange(r1, r2, r3, r4, r5)
            r10 = r4
            goto L8d
        L8a:
            r0 = r10
            r10 = r5
            r5 = r14
        L8d:
            r4 = r8
            goto L92
        L8f:
            r0 = r10
            r10 = r5
            r5 = r14
        L92:
            if (r4 == 0) goto La4
            int r14 = r7.getPreStart()
            int r14 = r14 + r10
            r7.setPreStart(r14)
            int r14 = r7.getPreEnd()
            int r14 = r14 + r10
            r7.setPreEnd(r14)
        La4:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r10 = r0._changesTemp
            r10.add(r7)
            r10 = r0
            r14 = r5
            goto L78
        Lac:
            r0 = r10
            r10 = r5
            r5 = r14
            if (r4 != 0) goto Lb5
            r4 = r10
            r0.appendNewChange(r1, r2, r3, r4, r5)
        Lb5:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r10 = r0._changes
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r11 = r0._changesTemp
            r0._changes = r11
            r0._changesTemp = r10
            r10.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.ChangeTracker.trackChange(int, int, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : changeTracker);
    }
}
