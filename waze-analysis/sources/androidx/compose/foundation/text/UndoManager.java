package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    public /* synthetic */ UndoManager(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 100000 : i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeLastUndo() {
        /*
            r2 = this;
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.undoStack
            r0 = 0
            if (r2 == 0) goto La
            androidx.compose.foundation.text.UndoManager$Entry r1 = r2.getNext()
            goto Lb
        La:
            r1 = r0
        Lb:
            if (r1 == 0) goto L27
        Ld:
            if (r2 == 0) goto L1a
            androidx.compose.foundation.text.UndoManager$Entry r1 = r2.getNext()
            if (r1 == 0) goto L1a
            androidx.compose.foundation.text.UndoManager$Entry r1 = r1.getNext()
            goto L1b
        L1a:
            r1 = r0
        L1b:
            if (r1 == 0) goto L22
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto Ld
        L22:
            if (r2 == 0) goto L27
            r2.setNext(r0)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = UndoManager_jvmAndAndroidKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j2);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(TextFieldValue textFieldValue) {
        TextFieldValue value;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (x.n(textFieldValue, entry != null ? entry.getValue() : null)) {
            return;
        }
        String text = textFieldValue.getText();
        Entry entry2 = this.undoStack;
        boolean zN = x.n(text, (entry2 == null || (value = entry2.getValue()) == null) ? null : value.getText());
        Entry entry3 = this.undoStack;
        if (zN) {
            if (entry3 != null) {
                entry3.setValue(textFieldValue);
                return;
            }
            return;
        }
        this.undoStack = new Entry(entry3, textFieldValue);
        this.redoStack = null;
        int length = this.storedCharacters + textFieldValue.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().getText().length();
        return entry.getValue();
    }

    public final void snapshotIfNeeded(TextFieldValue textFieldValue, long j2) {
        if (!this.forceNextSnapshot) {
            Long l2 = this.lastSnapshot;
            if (j2 <= (l2 != null ? l2.longValue() : 0L) + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j2);
        makeSnapshot(textFieldValue);
    }

    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    /* compiled from: WazeSource */
    final class Entry {
        private Entry next;
        private TextFieldValue value;

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : entry, textFieldValue);
        }

        public final Entry getNext() {
            return this.next;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setValue(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }
    }

    public UndoManager(int i2) {
        this.maxStoredCharacters = i2;
    }

    public UndoManager() {
        this(0, 1, null);
    }
}
