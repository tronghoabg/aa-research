package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UndoManager<T> {
    private final int capacity;
    private SnapshotStateList<T> redoStack;
    private SnapshotStateList<T> undoStack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UndoManager(List<? extends T> list, List<? extends T> list2, int i2) {
        this.capacity = i2;
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (list2.size() + list.size() > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean getCanRedo$foundation() {
        return !this.redoStack.isEmpty();
    }

    public final boolean getCanUndo$foundation() {
        return !this.undoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T t) {
        this.redoStack.clear();
        while (true) {
            int size = getSize();
            int i2 = this.capacity - 1;
            SnapshotStateList<T> snapshotStateList = this.undoStack;
            if (size <= i2) {
                snapshotStateList.add(t);
                return;
            }
            i.u(snapshotStateList);
        }
    }

    public final T redo() {
        if (!getCanRedo$foundation()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t = (T) i.w(this.redoStack);
        this.undoStack.add(t);
        return t;
    }

    public final T undo() {
        if (!getCanUndo$foundation()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t = (T) i.w(this.undoStack);
        this.redoStack.add(t);
        return t;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> saver) {
            x.i();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public UndoManager<T> restore(Object obj) {
                    x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    Object obj2 = list.get(0);
                    x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj2).intValue();
                    Object obj3 = list.get(1);
                    x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object obj4 = list.get(2);
                    x.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue3 = ((Integer) obj4).intValue();
                    List listB = i.b();
                    int i2 = 3;
                    while (i2 < iIntValue2 + 3) {
                        T tRestore = saver.restore(list.get(i2));
                        x.c(tRestore);
                        listB.add(tRestore);
                        i2++;
                    }
                    List listA = i.a(listB);
                    Saver<T, Object> saver2 = saver;
                    List listB2 = i.b();
                    while (i2 < iIntValue2 + iIntValue3 + 3) {
                        T tRestore2 = saver2.restore(list.get(i2));
                        x.c(tRestore2);
                        listB2.add(tRestore2);
                        i2++;
                    }
                    return new UndoManager<>(listA, i.a(listB2), iIntValue);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
                    Saver<T, Object> saver2;
                    List listB = i.b();
                    listB.add(Integer.valueOf(((UndoManager) undoManager).capacity));
                    listB.add(Integer.valueOf(((UndoManager) undoManager).undoStack.size()));
                    listB.add(Integer.valueOf(((UndoManager) undoManager).redoStack.size()));
                    SnapshotStateList snapshotStateList = ((UndoManager) undoManager).undoStack;
                    int size = snapshotStateList.size();
                    int i2 = 0;
                    while (true) {
                        saver2 = saver;
                        if (i2 >= size) {
                            break;
                        }
                        listB.add(saver2.save(saverScope, snapshotStateList.get(i2)));
                        i2++;
                    }
                    SnapshotStateList snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                    int size2 = snapshotStateList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        listB.add(saver2.save(saverScope, snapshotStateList2.get(i3)));
                    }
                    return i.a(listB);
                }
            };
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ UndoManager(List list, List list2, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? i.h() : list, (i3 & 2) != 0 ? i.h() : list2, (i3 & 4) != 0 ? 100 : i2);
    }
}
