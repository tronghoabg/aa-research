package androidx.compose.foundation.style;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import h.d.a;
import h.d.b;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleAnimations {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private MutableIntObjectMap<Entry> entries = IntObjectMapKt.mutableIntObjectMapOf();

    /* compiled from: WazeSource */
    final class Entry {
        private AnimationSpec<Float> fromSpec;
        private br job;
        private AnimationSpec<Float> toSpec;
        private final Animatable<Float, AnimationVector1D> animation = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        private EntryState state = EntryState.Inserted;
        private boolean animatingIn = true;

        public Entry(AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
            this.toSpec = animationSpec;
            this.fromSpec = animationSpec2;
        }

        public final void animateIn(af afVar) {
            this.animatingIn = true;
            br brVar = this.job;
            if (brVar != null) {
                brVar.s(null);
            }
            this.job = aj.z(afVar, null, null, new StyleAnimations$Entry$animateIn$1(this, null), 3);
        }

        public final void animateOut(af afVar) {
            this.animatingIn = false;
            br brVar = this.job;
            if (brVar != null) {
                brVar.s(null);
            }
            this.job = aj.z(afVar, null, null, new StyleAnimations$Entry$animateOut$1(this, StyleAnimations.this, null), 3);
        }

        public final void close() {
            br brVar = this.job;
            if (brVar != null) {
                brVar.s(null);
            }
            this.job = null;
        }

        public final boolean getAnimatingIn() {
            return this.animatingIn;
        }

        public final Animatable<Float, AnimationVector1D> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<Float> getFromSpec() {
            return this.fromSpec;
        }

        public final br getJob() {
            return this.job;
        }

        public final EntryState getState() {
            return this.state;
        }

        public final AnimationSpec<Float> getToSpec() {
            return this.toSpec;
        }

        public final void interrupted(af afVar) {
            if (this.animatingIn) {
                animateIn(afVar);
            } else {
                animateOut(afVar);
            }
        }

        public final void setAnimatingIn(boolean z) {
            this.animatingIn = z;
        }

        public final void setFromSpec(AnimationSpec<Float> animationSpec) {
            this.fromSpec = animationSpec;
        }

        public final void setJob(br brVar) {
            this.job = brVar;
        }

        public final void setState(EntryState entryState) {
            this.state = entryState;
        }

        public final void setToSpec(AnimationSpec<Float> animationSpec) {
            this.toSpec = animationSpec;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class EntryState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EntryState[] $VALUES;
        public static final EntryState Untouched = new EntryState("Untouched", 0);
        public static final EntryState Unchanged = new EntryState("Unchanged", 1);
        public static final EntryState Changed = new EntryState("Changed", 2);
        public static final EntryState Inserted = new EntryState("Inserted", 3);
        public static final EntryState Removing = new EntryState("Removing", 4);

        private static final /* synthetic */ EntryState[] $values() {
            return new EntryState[]{Untouched, Unchanged, Changed, Inserted, Removing};
        }

        static {
            EntryState[] entryStateArr$values = $values();
            $VALUES = entryStateArr$values;
            $ENTRIES = b.a(entryStateArr$values);
        }

        private EntryState(String str, int i2) {
        }

        public static a<EntryState> getEntries() {
            return $ENTRIES;
        }

        public static EntryState valueOf(String str) {
            return (EntryState) Enum.valueOf(EntryState.class, str);
        }

        public static EntryState[] values() {
            return (EntryState[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryState.values().length];
            try {
                iArr[EntryState.Inserted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryState.Unchanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryState.Changed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryState.Untouched.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cleanupAnimations() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.lock
            monitor-enter(r0)
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r15 = r15.entries     // Catch: java.lang.Throwable -> L65
            r1 = r15
            androidx.collection.IntObjectMap r1 = (androidx.collection.IntObjectMap) r1     // Catch: java.lang.Throwable -> L65
            long[] r1 = r1.metadata     // Catch: java.lang.Throwable -> L65
            int r2 = r1.length     // Catch: java.lang.Throwable -> L65
            int r2 = r2 + (-2)
            if (r2 < 0) goto L63
            r3 = 0
            r4 = r3
        L11:
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L65
            long r7 = ~r5     // Catch: java.lang.Throwable -> L65
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5e
            int r7 = r4 - r2
            r8 = r3
        L24:
            int r9 = ~r7     // Catch: java.lang.Throwable -> L65
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L5c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L58
            int r9 = r4 << 3
            int r9 = r9 + r8
            int[] r11 = r15.keys     // Catch: java.lang.Throwable -> L65
            r11 = r11[r9]     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r11 = r15.values     // Catch: java.lang.Throwable -> L65
            r11 = r11[r9]     // Catch: java.lang.Throwable -> L65
            androidx.compose.foundation.style.StyleAnimations$Entry r11 = (androidx.compose.foundation.style.StyleAnimations.Entry) r11     // Catch: java.lang.Throwable -> L65
            androidx.compose.foundation.style.StyleAnimations$EntryState r12 = r11.getState()     // Catch: java.lang.Throwable -> L65
            androidx.compose.foundation.style.StyleAnimations$EntryState r13 = androidx.compose.foundation.style.StyleAnimations.EntryState.Removing     // Catch: java.lang.Throwable -> L65
            if (r12 != r13) goto L58
            androidx.compose.animation.core.Animatable r11 = r11.getAnimation()     // Catch: java.lang.Throwable -> L65
            boolean r11 = r11.isRunning()     // Catch: java.lang.Throwable -> L65
            if (r11 != 0) goto L58
            r15.removeValueAt(r9)     // Catch: java.lang.Throwable -> L65
        L58:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L24
        L5c:
            if (r9 != r10) goto L63
        L5e:
            if (r4 == r2) goto L63
            int r4 = r4 + 1
            goto L11
        L63:
            monitor-exit(r0)
            return
        L65:
            r15 = move-exception
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.cleanupAnimations():void");
    }

    private final void record(int i2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        synchronized (this.lock) {
            Entry entry = this.entries.get(i2);
            if (entry == null) {
                this.entries.set(i2, new Entry(animationSpec, animationSpec2));
            } else if (x.n(entry.getToSpec(), animationSpec) && x.n(entry.getFromSpec(), animationSpec2)) {
                entry.setState(EntryState.Unchanged);
            } else {
                entry.setFromSpec(animationSpec2);
                entry.setToSpec(animationSpec);
                entry.setState(EntryState.Changed);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r2 = r0.entries     // Catch: java.lang.Throwable -> L59
            androidx.collection.IntObjectMap r2 = (androidx.collection.IntObjectMap) r2     // Catch: java.lang.Throwable -> L59
            int[] r3 = r2.keys     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r4 = r2.values     // Catch: java.lang.Throwable -> L59
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L59
            int r5 = r2.length     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-2)
            if (r5 < 0) goto L52
            r6 = 0
            r7 = r6
        L16:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L59
            long r10 = ~r8     // Catch: java.lang.Throwable -> L59
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            r11 = r6
        L29:
            int r12 = ~r10     // Catch: java.lang.Throwable -> L59
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L47
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]     // Catch: java.lang.Throwable -> L59
            r12 = r4[r12]     // Catch: java.lang.Throwable -> L59
            androidx.compose.foundation.style.StyleAnimations$Entry r12 = (androidx.compose.foundation.style.StyleAnimations.Entry) r12     // Catch: java.lang.Throwable -> L59
            r12.close()     // Catch: java.lang.Throwable -> L59
        L47:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L29
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L16
        L52:
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r0 = r0.entries     // Catch: java.lang.Throwable -> L59
            r0.clear()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)
            return
        L59:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.close():void");
    }

    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.lock) {
            zIsEmpty = this.entries.isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[PHI: r4 r8
  0x005a: PHI (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:6:0x0024, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r8v2 int) = (r8v1 int), (r8v4 int) binds: [B:6:0x0024, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int phaseFlags() {
        /*
            r19 = this;
            r0 = r19
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r0 = r0.entries
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0
            int[] r1 = r0.keys
            java.lang.Object[] r2 = r0.values
            long[] r0 = r0.metadata
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = 0
            r6 = 0
            if (r3 < 0) goto L60
            r7 = r6
            r8 = r7
        L16:
            r9 = r0[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5a
            int r11 = r7 - r3
            r12 = r6
        L29:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L58
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L54
            int r13 = r7 << 3
            int r13 = r13 + r12
            r15 = r1[r13]
            r13 = r2[r13]
            androidx.compose.foundation.style.StyleAnimations$Entry r13 = (androidx.compose.foundation.style.StyleAnimations.Entry) r13
            r13 = 50
            if (r15 >= r13) goto L4f
            r16 = 1
            byte r13 = (byte) r15
            long r15 = r16 << r13
            long r4 = r4 | r15
            goto L54
        L4f:
            int r15 = r15 + (-50)
            r13 = 1
            int r13 = r13 << r15
            r8 = r8 | r13
        L54:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L29
        L58:
            if (r13 != r14) goto L5f
        L5a:
            if (r7 == r3) goto L5f
            int r7 = r7 + 1
            goto L16
        L5f:
            r6 = r8
        L60:
            int r0 = androidx.compose.foundation.style.StylePropertiesKt.objectPhaseFlagsOf(r6)
            int r1 = androidx.compose.foundation.style.StylePropertiesKt.primitivePhaseFlagsOf(r4)
            r0 = r0 | r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.phaseFlags():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void postRecordLocked(androidx.compose.foundation.style.StyleOuterNode r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r0 = r0.entries     // Catch: java.lang.Throwable -> L80
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0     // Catch: java.lang.Throwable -> L80
            int[] r2 = r0.keys     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r3 = r0.values     // Catch: java.lang.Throwable -> L80
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L80
            int r4 = r0.length     // Catch: java.lang.Throwable -> L80
            int r4 = r4 + (-2)
            if (r4 < 0) goto L7e
            r5 = 0
            r6 = r5
        L16:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L80
            long r9 = ~r7     // Catch: java.lang.Throwable -> L80
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L79
            int r9 = r6 - r4
            r10 = r5
        L29:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L80
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L77
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L73
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L80
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L80
            androidx.compose.foundation.style.StyleAnimations$Entry r11 = (androidx.compose.foundation.style.StyleAnimations.Entry) r11     // Catch: java.lang.Throwable -> L80
            androidx.compose.foundation.style.StyleAnimations$EntryState r13 = r11.getState()     // Catch: java.lang.Throwable -> L80
            androidx.compose.foundation.style.StyleAnimations$EntryState r14 = androidx.compose.foundation.style.StyleAnimations.EntryState.Untouched     // Catch: java.lang.Throwable -> L80
            int r13 = r13.ordinal()     // Catch: java.lang.Throwable -> L80
            if (r13 == 0) goto L67
            r14 = 2
            if (r13 == r14) goto L5f
            r14 = 3
            if (r13 == r14) goto L57
            goto L73
        L57:
            kotlinx.coroutines.af r13 = r18.getAnimationScope$foundation()     // Catch: java.lang.Throwable -> L80
            r11.animateIn(r13)     // Catch: java.lang.Throwable -> L80
            goto L73
        L5f:
            kotlinx.coroutines.af r13 = r18.getAnimationScope$foundation()     // Catch: java.lang.Throwable -> L80
            r11.interrupted(r13)     // Catch: java.lang.Throwable -> L80
            goto L73
        L67:
            androidx.compose.foundation.style.StyleAnimations$EntryState r13 = androidx.compose.foundation.style.StyleAnimations.EntryState.Removing     // Catch: java.lang.Throwable -> L80
            r11.setState(r13)     // Catch: java.lang.Throwable -> L80
            kotlinx.coroutines.af r13 = r18.getAnimationScope$foundation()     // Catch: java.lang.Throwable -> L80
            r11.animateOut(r13)     // Catch: java.lang.Throwable -> L80
        L73:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L29
        L77:
            if (r11 != r12) goto L7e
        L79:
            if (r6 == r4) goto L7e
            int r6 = r6 + 1
            goto L16
        L7e:
            monitor-exit(r1)
            return
        L80:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.postRecordLocked(androidx.compose.foundation.style.StyleOuterNode):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preRecordLocked() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            androidx.collection.MutableIntObjectMap<androidx.compose.foundation.style.StyleAnimations$Entry> r0 = r0.entries     // Catch: java.lang.Throwable -> L6a
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0     // Catch: java.lang.Throwable -> L6a
            int[] r2 = r0.keys     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r3 = r0.values     // Catch: java.lang.Throwable -> L6a
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L6a
            int r4 = r0.length     // Catch: java.lang.Throwable -> L6a
            int r4 = r4 + (-2)
            if (r4 < 0) goto L68
            r5 = 0
            r6 = r5
        L16:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L6a
            long r9 = ~r7     // Catch: java.lang.Throwable -> L6a
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L63
            int r9 = r6 - r4
            r10 = r5
        L29:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L6a
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L61
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5d
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L6a
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L6a
            androidx.compose.foundation.style.StyleAnimations$Entry r11 = (androidx.compose.foundation.style.StyleAnimations.Entry) r11     // Catch: java.lang.Throwable -> L6a
            androidx.compose.foundation.style.StyleAnimations$EntryState r13 = r11.getState()     // Catch: java.lang.Throwable -> L6a
            androidx.compose.foundation.style.StyleAnimations$EntryState r14 = androidx.compose.foundation.style.StyleAnimations.EntryState.Untouched     // Catch: java.lang.Throwable -> L6a
            int r13 = r13.ordinal()     // Catch: java.lang.Throwable -> L6a
            r14 = 1
            if (r13 == r14) goto L58
            r14 = 2
            if (r13 == r14) goto L58
            r14 = 3
            if (r13 == r14) goto L58
            goto L5d
        L58:
            androidx.compose.foundation.style.StyleAnimations$EntryState r13 = androidx.compose.foundation.style.StyleAnimations.EntryState.Untouched     // Catch: java.lang.Throwable -> L6a
            r11.setState(r13)     // Catch: java.lang.Throwable -> L6a
        L5d:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L29
        L61:
            if (r11 != r12) goto L68
        L63:
            if (r6 == r4) goto L68
            int r6 = r6 + 1
            goto L16
        L68:
            monitor-exit(r1)
            return
        L6a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.preRecordLocked():void");
    }

    public final void recordAnimations(StyleProperties styleProperties, StyleProperties styleProperties2, IntObjectMap<AnimationSpec<Float>> intObjectMap, IntObjectMap<AnimationSpec<Float>> intObjectMap2, StyleOuterNode styleOuterNode) {
        SpringSpec<Float> defaultSpringSpec;
        SpringSpec<Float> defaultSpringSpec2;
        SpringSpec<Float> defaultSpringSpec3;
        SpringSpec<Float> defaultSpringSpec4;
        synchronized (this.lock) {
            preRecordLocked();
            if (styleProperties != null && styleProperties2 != null) {
                int i2 = styleProperties2.objectsSet;
                long j2 = styleProperties2.primitivesSet;
                if (styleProperties.hasId(51) && styleProperties2.hasId(StylePropertiesKt.BackgroundColorId)) {
                    i2 |= 2;
                    j2 &= -17179869185L;
                }
                if (styleProperties.hasId(50) && styleProperties2.hasId(StylePropertiesKt.BorderColorId)) {
                    i2 |= 1;
                    j2 &= -34359738369L;
                }
                if (styleProperties.hasId(57) && styleProperties2.hasId(StylePropertiesKt.ContentColorId)) {
                    i2 |= 128;
                    j2 &= -137438953473L;
                }
                if (styleProperties.hasId(52) && styleProperties2.hasId(StylePropertiesKt.ForegroundColorId)) {
                    i2 |= 4;
                    j2 &= -68719476737L;
                }
                while (j2 != 0) {
                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                    if (intObjectMap == null || (defaultSpringSpec3 = intObjectMap.get(iNumberOfTrailingZeros)) == null) {
                        defaultSpringSpec3 = ResolvedStyleKt.getDefaultSpringSpec();
                    }
                    if (intObjectMap2 == null || (defaultSpringSpec4 = intObjectMap2.get(iNumberOfTrailingZeros)) == null) {
                        defaultSpringSpec4 = ResolvedStyleKt.getDefaultSpringSpec();
                    }
                    record(iNumberOfTrailingZeros, defaultSpringSpec3, defaultSpringSpec4);
                    j2 ^= 1 << iNumberOfTrailingZeros;
                }
                while (i2 != 0) {
                    int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
                    int i3 = iNumberOfTrailingZeros2 + 50;
                    if (intObjectMap == null || (defaultSpringSpec = intObjectMap.get(i3)) == null) {
                        defaultSpringSpec = ResolvedStyleKt.getDefaultSpringSpec();
                    }
                    if (intObjectMap2 == null || (defaultSpringSpec2 = intObjectMap2.get(i3)) == null) {
                        defaultSpringSpec2 = ResolvedStyleKt.getDefaultSpringSpec();
                    }
                    record(i3, defaultSpringSpec, defaultSpringSpec2);
                    i2 ^= 1 << iNumberOfTrailingZeros2;
                }
            }
            postRecordLocked(styleOuterNode);
        }
    }

    public final float timeOf(int i2) {
        synchronized (this.lock) {
            Entry entry = this.entries.get(i2);
            if (entry == null) {
                return 0.0f;
            }
            return entry.getAnimation().getValue().floatValue();
        }
    }

    public final float timeOf(byte b2) {
        return timeOf((int) b2);
    }
}
