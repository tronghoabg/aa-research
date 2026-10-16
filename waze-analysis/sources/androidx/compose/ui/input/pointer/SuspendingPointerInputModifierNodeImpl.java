package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.c.j;
import h.d.b;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private p<? super PointerInputScope, ? super e<? super ab>, ? extends Object> _deprecatedPointerInputHandler;
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final Object pointerHandlersLock;
    private br pointerInputJob;

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m11344getZeroYbymL2g();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:6:0x000f, B:13:0x001e, B:14:0x0023, B:15:0x0024, B:18:0x0033, B:19:0x003d, B:21:0x0048), top: B:31:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void dispatchPointerEvent(androidx.compose.ui.input.pointer.PointerEvent r5, androidx.compose.ui.input.pointer.PointerEventPass r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.pointerHandlersLock
            monitor-enter(r0)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r1 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L5f
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r2 = r4.pointerHandlers     // Catch: java.lang.Throwable -> L5f
            int r3 = r1.getSize()     // Catch: java.lang.Throwable -> L5f
            r1.addAll(r3, r2)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Initial     // Catch: java.lang.Throwable -> L58
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L3d
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 != r1) goto L1e
            goto L3d
        L1e:
            h.i r5 = new h.i     // Catch: java.lang.Throwable -> L58
            r5.<init>()     // Catch: java.lang.Throwable -> L58
            throw r5     // Catch: java.lang.Throwable -> L58
        L24:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r0 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L58
            int r1 = r0.getSize()     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            T[] r0 = r0.content     // Catch: java.lang.Throwable -> L58
            int r2 = r0.length     // Catch: java.lang.Throwable -> L58
            if (r1 >= r2) goto L52
        L31:
            if (r1 < 0) goto L52
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r2     // Catch: java.lang.Throwable -> L58
            r2.offerPointerEvent(r5, r6)     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            goto L31
        L3d:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r0 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L58
            T[] r1 = r0.content     // Catch: java.lang.Throwable -> L58
            int r0 = r0.getSize()     // Catch: java.lang.Throwable -> L58
            r2 = 0
        L46:
            if (r2 >= r0) goto L52
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r3 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r3     // Catch: java.lang.Throwable -> L58
            r3.offerPointerEvent(r5, r6)     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + 1
            goto L46
        L52:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r4 = r4.dispatchingPointerHandlers
            r4.clear()
            return
        L58:
            r5 = move-exception
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r4 = r4.dispatchingPointerHandlers
            r4.clear()
            throw r5
        L5f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.dispatchPointerEvent(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:6:0x000f, B:13:0x001e, B:14:0x0023, B:15:0x0024, B:18:0x0033, B:19:0x003b, B:21:0x0046), top: B:31:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void forEachCurrentPointerHandler(androidx.compose.ui.input.pointer.PointerEventPass r5, h.g.a.l<? super androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>, h.ab> r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.pointerHandlersLock
            monitor-enter(r0)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r1 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r2 = r4.pointerHandlers     // Catch: java.lang.Throwable -> L5b
            int r3 = r1.getSize()     // Catch: java.lang.Throwable -> L5b
            r1.addAll(r3, r2)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Initial     // Catch: java.lang.Throwable -> L54
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L3b
            r0 = 1
            if (r5 == r0) goto L24
            r0 = 2
            if (r5 != r0) goto L1e
            goto L3b
        L1e:
            h.i r5 = new h.i     // Catch: java.lang.Throwable -> L54
            r5.<init>()     // Catch: java.lang.Throwable -> L54
            throw r5     // Catch: java.lang.Throwable -> L54
        L24:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r5 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L54
            int r0 = r5.getSize()     // Catch: java.lang.Throwable -> L54
            int r0 = r0 + (-1)
            T[] r5 = r5.content     // Catch: java.lang.Throwable -> L54
            int r1 = r5.length     // Catch: java.lang.Throwable -> L54
            if (r0 >= r1) goto L4e
        L31:
            if (r0 < 0) goto L4e
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L54
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L54
            int r0 = r0 + (-1)
            goto L31
        L3b:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r5 = r4.dispatchingPointerHandlers     // Catch: java.lang.Throwable -> L54
            T[] r0 = r5.content     // Catch: java.lang.Throwable -> L54
            int r5 = r5.getSize()     // Catch: java.lang.Throwable -> L54
            r1 = 0
        L44:
            if (r1 >= r5) goto L4e
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L54
            r6.invoke(r2)     // Catch: java.lang.Throwable -> L54
            int r1 = r1 + 1
            goto L44
        L4e:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r4 = r4.dispatchingPointerHandlers
            r4.clear()
            return
        L54:
            r5 = move-exception
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<?>> r4 = r4.dispatchingPointerHandlers
            r4.clear()
            throw r5
        L5b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.forEachCurrentPointerHandler(androidx.compose.ui.input.pointer.PointerEventPass, h.g.a.l):void");
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(p<? super AwaitPointerEventScope, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        l lVar = new l(h.d(eVar), 1);
        lVar.u();
        l lVar2 = lVar;
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(lVar2);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
            x.f(pVar, "<this>");
            x.f(pointerEventHandlerCoroutine2, "completion");
            new h.c.l(h.d(h.c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine2)), a.f48038a).resumeWith(ab.f48028a);
        }
        lVar2.c(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object objJ = lVar.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo2117getExtendedTouchPaddingNHjbRc() {
        long jMo2128toSizeXkaWNTQ = mo2128toSizeXkaWNTQ(getViewConfiguration().mo9982getMinimumTouchTargetSizeMYxV2XQ());
        long jMo2118getSizeYbymL2g = mo2118getSizeYbymL2g();
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ >> 32)) - ((int) (jMo2118getSizeYbymL2g >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jMo2128toSizeXkaWNTQ & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - ((int) (jMo2118getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public p<PointerInputScope, e<? super ab>, Object> getPointerInputHandler() {
        p pVar = this._deprecatedPointerInputHandler;
        return pVar == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo2118getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    PointerInputChange pointerInputChange = changes2.get(i3);
                    arrayList.add(new PointerInputChange(pointerInputChange.m9605getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m9608getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m9608getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m9611getTypeT8wyACA(), 0L, 0.0f, 0L, 7168, (o) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.boundsSize = j2;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = aj.z(getCoroutineScope(), null, ag.f51345d, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerEvent = null;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        br brVar = this.pointerInputJob;
        if (brVar != null) {
            brVar.s(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(p<? super PointerInputScope, ? super e<? super ab>, ? extends Object> pVar) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = pVar;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
        return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
        return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    public final void update$ui(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z = !x.n(this.key1, obj);
        this.key1 = obj;
        boolean z2 = !x.n(this.key2, obj2);
        this.key2 = obj2;
        boolean z3 = z2 | z;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z3 = true;
        }
        if (objArr2 == null && objArr != null) {
            z3 = true;
        }
        boolean z4 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z3 : true;
        this.keys = objArr;
        if (getPointerInputEventHandler().getClass() != pointerInputEventHandler.getClass() || z4) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, e {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final e<R> completion;
        private k<? super PointerEvent> pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final j context = h.c.k.f48060a;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(e<? super R> eVar) {
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
            this.completion = eVar;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, e<? super PointerEvent> eVar) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = lVar;
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        }

        public final void cancel(Throwable th) {
            k<? super PointerEvent> kVar = this.pointerAwaiter;
            if (kVar != null) {
                kVar.f(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // h.c.e
        public j getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo9478getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo2117getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo9479getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            k<? super PointerEvent> kVar;
            if (pointerEventPass != this.awaitPass || (kVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            kVar.resumeWith(pointerEvent);
        }

        @Override // h.c.e
        public void resumeWith(Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.pointerHandlersLock) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo2120roundToPxR2X_6o(long j2) {
            return this.$$delegate_0.mo2120roundToPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo2121roundToPx0680j_4(float f2) {
            return this.$$delegate_0.mo2121roundToPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo2122toDpGaN1DYA(long j2) {
            return this.$$delegate_0.mo2122toDpGaN1DYA(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo2123toDpu2uoSUM(float f2) {
            return this.$$delegate_0.mo2123toDpu2uoSUM(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo2125toDpSizekrfVVM(long j2) {
            return this.$$delegate_0.mo2125toDpSizekrfVVM(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo2126toPxR2X_6o(long j2) {
            return this.$$delegate_0.mo2126toPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo2127toPx0680j_4(float f2) {
            return this.$$delegate_0.mo2127toPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo2128toSizeXkaWNTQ(long j2) {
            return this.$$delegate_0.mo2128toSizeXkaWNTQ(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo2129toSp0xMU5do(float f2) {
            return this.$$delegate_0.mo2129toSp0xMU5do(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo2130toSpkPz2Gy4(float f2) {
            return this.$$delegate_0.mo2130toSpkPz2Gy4(f2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r8, h.g.a.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super h.c.e<? super T>, ? extends java.lang.Object> r10, h.c.e<? super T> r11) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r11 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r11
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r7, r11)
            L18:
                java.lang.Object r11 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.br r7 = (kotlinx.coroutines.br) r7
                e.b.c.b(r11)     // Catch: java.lang.Throwable -> L2b
                goto L70
            L2b:
                r8 = move-exception
                goto L7d
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                e.b.c.b(r11)
                r4 = 0
                int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r11 > 0) goto L52
                kotlinx.coroutines.k<? super androidx.compose.ui.input.pointer.PointerEvent> r11 = r7.pointerAwaiter
                if (r11 == 0) goto L52
                h.c.e r11 = (h.c.e) r11
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r8)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r2 = e.b.c.a(r2)
                r11.resumeWith(r2)
            L52:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r11 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.af r11 = r11.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r4 = 0
                r2.<init>(r8, r7, r4)
                h.g.a.p r2 = (h.g.a.p) r2
                r8 = 3
                kotlinx.coroutines.br r8 = kotlinx.coroutines.aj.z(r11, r4, r4, r2, r8)
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L79
                r0.label = r3     // Catch: java.lang.Throwable -> L79
                java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L79
                if (r11 == r1) goto L78
                r7 = r8
            L70:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
                r7.s(r8)
                return r11
            L78:
                return r1
            L79:
                r7 = move-exception
                r6 = r8
                r8 = r7
                r7 = r6
            L7d:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                java.util.concurrent.CancellationException r9 = (java.util.concurrent.CancellationException) r9
                r7.s(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, h.g.a.p, h.c.e):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, h.g.a.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super h.c.e<? super T>, ? extends java.lang.Object> r7, h.c.e<? super T> r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.b.c.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                return r8
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                e.b.c.b(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                java.lang.Object r4 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                if (r4 != r1) goto L3b
                return r1
            L3b:
                return r4
            L3c:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, h.g.a.p, h.c.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo2124toDpu2uoSUM(int i2) {
            return this.$$delegate_0.mo2124toDpu2uoSUM(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo2131toSpkPz2Gy4(int i2) {
            return this.$$delegate_0.mo2131toSpkPz2Gy4(i2);
        }
    }

    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : obj, (i2 & 2) != 0 ? null : obj2, (i2 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, p<? super PointerInputScope, ? super e<? super ab>, ? extends Object> pVar) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                return ab.f48028a;
            }
        });
        this._deprecatedPointerInputHandler = pVar;
    }
}
