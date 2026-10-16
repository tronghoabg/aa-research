package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import h.ab;
import h.g.a.p;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RecordingApplier<N> implements Applier<N> {
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int RECOMPOSE_PENDING = 9;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;
    public static final int UP = 0;
    private N current;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final MutableIntList operations = new MutableIntList(0, 1, null);
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public RecordingApplier(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(p<? super N, Object, ab> pVar, Object obj) {
        this.operations.add(7);
        this.instances.add(pVar);
        this.instances.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.operations.add(1);
        this.instances.add(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, N n) {
        this.operations.add(5);
        this.operations.add(i2);
        this.instances.add(n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i2, N n) {
        this.operations.add(6);
        this.operations.add(i2);
        this.instances.add(n);
    }

    public final void markRecomposePending() {
        this.operations.add(9);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        this.operations.add(3);
        this.operations.add(i2);
        this.operations.add(i3);
        this.operations.add(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> applier, RememberEventDispatcher rememberEventDispatcher) {
        Exception exc;
        int i2;
        MutableIntList mutableIntList = this.operations;
        int i3 = mutableIntList._size;
        int i4 = 0;
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        applier.onBeginChanges();
        int i5 = 0;
        while (true) {
            MutableObjectList<Object> mutableObjectList2 = this.instances;
            if (i4 >= i3) {
                if (i5 != mutableObjectList2.getSize()) {
                    ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
                }
                mutableObjectList2.clear();
                mutableIntList.clear();
                applier.onEndChanges();
                return;
            }
            int i6 = i4 + 1;
            try {
                try {
                    switch (mutableIntList.get(i4)) {
                        case 0:
                            applier.up();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            applier.down(mutableObjectList2.get(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            applier.remove(mutableIntList.get(i6), mutableIntList.get(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                int i10 = i4 + 3;
                                try {
                                    i4 += 4;
                                    applier.move(mutableIntList.get(i6), mutableIntList.get(i9), mutableIntList.get(i10));
                                } catch (Exception e2) {
                                    exc = e2;
                                    i4 = i10;
                                    break;
                                }
                            } catch (Exception e3) {
                                exc = e3;
                                i4 = i9;
                                break;
                            }
                        case 4:
                            applier.clear();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            applier.insertBottomUp(mutableIntList.get(i6), mutableObjectList2.get(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                applier.insertTopDown(mutableIntList.get(i6), mutableObjectList2.get(i5));
                                i5 = i2;
                            } catch (Exception e4) {
                                exc = e4;
                                break;
                            }
                        case 7:
                            int i11 = i5 + 1;
                            Object obj = mutableObjectList2.get(i5);
                            x.d(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            au.h(obj, 2);
                            i5 += 2;
                            applier.apply((p) obj, mutableObjectList2.get(i11));
                            i4 = i6;
                        case 8:
                            Object current = applier.getCurrent();
                            if (current instanceof ComposeNodeLifecycleCallback) {
                                rememberEventDispatcher.dispatchOnDeactivateIfNecessary((ComposeNodeLifecycleCallback) current);
                            }
                            mutableObjectList.add(current);
                            applier.reuse();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Exception e5) {
                    exc = e5;
                    i4 = i6;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
            exc = e4;
            throw new ComposePausableCompositionException(mutableObjectList2, mutableObjectList, mutableIntList, i4 - 1, exc);
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        this.operations.add(2);
        this.operations.add(i2);
        this.operations.add(i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    public void setCurrent(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.add(0);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
    }
}
