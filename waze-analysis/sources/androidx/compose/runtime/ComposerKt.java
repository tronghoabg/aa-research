package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.ac;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    public static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static int composeStackTraceMode = ComposeStackTraceMode.Companion.m7646getNoneMD5MrJc();
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z, a<? extends T> aVar) {
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T tInvoke = aVar.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier<?> applier) {
        SlotTable slotTable;
        List arrayList;
        Anchor anchor;
        long[] jArr;
        int i2;
        Anchor anchor2;
        SlotTable slotTable2;
        long[] jArr2;
        long j2;
        int i3;
        int i4;
        char c2;
        boolean zIsEmpty;
        SlotTable slotTable3;
        long j3;
        int i5;
        SlotTable slotTable4 = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable4.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable4.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object objNode = slotWriter.node(parent);
                int i6 = parent + 1;
                int iGroupSize = parent + slotWriter.groupSize(parent);
                int iNodeCount = 0;
                while (i6 < iGroupSize) {
                    int iGroupSize2 = slotWriter.groupSize(i6) + i6;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iNodeCount += slotWriter.isNode(i6) ? 1 : slotWriter.nodeCount(i6);
                    i6 = iGroupSize2;
                }
                int iNodeCount2 = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeCount, iNodeCount2);
                applier.up();
            }
        }
        Anchor anchor$runtime = movableContentStateReference.getAnchor$runtime();
        if (anchor$runtime.getValid()) {
            x.d(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            CompositionImpl compositionImpl = (CompositionImpl) controlledComposition;
            if (ScopeMap.m7391getSizeimpl(compositionImpl.invalidations) > 0) {
                arrayList = new ArrayList();
                MutableScatterMap mutableScatterMap = compositionImpl.invalidations;
                long[] jArr3 = mutableScatterMap.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr3[i7];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = i7 - length;
                            int i9 = 0;
                            while (true) {
                                i2 = 8 - ((~i8) >>> 31);
                                if (i9 >= i2) {
                                    break;
                                }
                                if ((j4 & 255) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    int i11 = 8;
                                    Object obj = mutableScatterMap.keys[i10];
                                    anchor2 = anchor$runtime;
                                    Object obj2 = mutableScatterMap.values[i10];
                                    jArr2 = jArr3;
                                    x.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                                    if (obj2 instanceof MutableScatterSet) {
                                        x.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                        Object[] objArr = mutableScatterSet.elements;
                                        long[] jArr4 = mutableScatterSet.metadata;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j2 = j4;
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                i3 = i8;
                                                i4 = i9;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    int i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j5 & 255) < 128) {
                                                            j3 = j5;
                                                            int i15 = (i12 << 3) + i14;
                                                            Object obj3 = objArr[i15];
                                                            i5 = i14;
                                                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                                            Anchor anchor3 = recomposeScopeImpl.getAnchor();
                                                            if (anchor3 != null) {
                                                                slotTable3 = slotTable4;
                                                                if (slotWriter.inGroup(GapAnchorKt.asGapAnchor(anchor2), GapAnchorKt.asGapAnchor(anchor3))) {
                                                                    arrayList.add(new k(recomposeScopeImpl, obj3));
                                                                    mutableScatterSet.removeElementAt(i15);
                                                                }
                                                            } else {
                                                                slotTable3 = slotTable4;
                                                            }
                                                        } else {
                                                            slotTable3 = slotTable4;
                                                            j3 = j5;
                                                            i5 = i14;
                                                        }
                                                        j5 = j3 >> i11;
                                                        i14 = i5 + 1;
                                                        slotTable4 = slotTable3;
                                                    }
                                                    slotTable2 = slotTable4;
                                                    if (i13 != i11) {
                                                        break;
                                                    }
                                                } else {
                                                    slotTable2 = slotTable4;
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                                i8 = i3;
                                                i9 = i4;
                                                slotTable4 = slotTable2;
                                                i11 = 8;
                                            }
                                        } else {
                                            slotTable2 = slotTable4;
                                            j2 = j4;
                                            i3 = i8;
                                            i4 = i9;
                                        }
                                        zIsEmpty = mutableScatterSet.isEmpty();
                                    } else {
                                        slotTable2 = slotTable4;
                                        j2 = j4;
                                        i3 = i8;
                                        i4 = i9;
                                        x.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
                                        Anchor anchor4 = recomposeScopeImpl2.getAnchor();
                                        if (anchor4 == null || !slotWriter.inGroup(GapAnchorKt.asGapAnchor(anchor2), GapAnchorKt.asGapAnchor(anchor4))) {
                                            zIsEmpty = false;
                                        } else {
                                            arrayList.add(new k(recomposeScopeImpl2, obj2));
                                            zIsEmpty = true;
                                        }
                                    }
                                    if (zIsEmpty) {
                                        mutableScatterMap.removeValueAt(i10);
                                    }
                                    c2 = '\b';
                                } else {
                                    anchor2 = anchor$runtime;
                                    slotTable2 = slotTable4;
                                    jArr2 = jArr3;
                                    j2 = j4;
                                    i3 = i8;
                                    i4 = i9;
                                    c2 = '\b';
                                }
                                j4 = j2 >> c2;
                                i9 = i4 + 1;
                                anchor$runtime = anchor2;
                                jArr3 = jArr2;
                                i8 = i3;
                                slotTable4 = slotTable2;
                            }
                            anchor = anchor$runtime;
                            slotTable = slotTable4;
                            jArr = jArr3;
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            anchor = anchor$runtime;
                            slotTable = slotTable4;
                            jArr = jArr3;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        anchor$runtime = anchor;
                        jArr3 = jArr;
                        slotTable4 = slotTable;
                    }
                } else {
                    slotTable = slotTable4;
                }
            } else {
                slotTable = slotTable4;
                arrayList = ac.f47967a;
            }
            movableContentStateReference.setInvalidations$runtime(i.af(movableContentStateReference.getInvalidations$runtime(), arrayList));
        } else {
            slotTable = slotTable4;
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter$runtime());
            List<GapAnchor> listMoveTo = slotWriter.moveTo(GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime()), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            SlotTable slotTable5 = slotTable;
            if (!RecomposeScopeImpl.Companion.hasAnchoredRecomposeScopes$runtime(slotTable5, listMoveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl3, Object obj4) {
                    InvalidationResult invalidationResultInvalidate;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResultInvalidate = recomposeScopeOwner2.invalidate(recomposeScopeImpl3, obj4)) == null) {
                        invalidationResultInvalidate = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                        return invalidationResultInvalidate;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.setInvalidations$runtime(i.ag(movableContentStateReference2.getInvalidations$runtime(), new k(recomposeScopeImpl3, obj4)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl3) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj4) {
                }
            };
            slotWriterOpenWriter = slotTable5.openWriter();
            try {
                RecomposeScopeImpl.Companion.adoptAnchoredScopes$runtime(slotWriterOpenWriter, listMoveTo, recomposeScopeOwner);
                slotWriterOpenWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    public static final int getComposeStackTraceMode() {
        return composeStackTraceMode;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getInvocation() {
        return invocation;
    }

    private static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new p() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ComposerKt.removeCurrentGroup$lambda$0(rememberManager, ((Integer) obj).intValue(), obj2);
            }
        });
        slotWriter.removeGroup();
    }

    static final ab removeCurrentGroup$lambda$0(RememberManager rememberManager, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).release();
        }
        return ab.f48028a;
    }

    public static final void runtimeCheck(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError(aVar.invoke());
    }

    /* renamed from: setComposeStackTraceMode-76WK1J0, reason: not valid java name */
    public static final void m7289setComposeStackTraceMode76WK1J0(int i2) {
        composeStackTraceMode = i2;
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i2, String str) {
        composer.sourceInformationMarkerStart(i2, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i2, int i3, int i4, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i2, i3, i4, str);
        }
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, p<? super Integer, ? super Integer, ? extends R> pVar) {
        int slotsSize;
        int iAnchorIndex = -1;
        if (anchor == null || !anchor.getValid()) {
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(GapAnchorKt.asGapAnchor(anchor));
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime(iAnchorIndex);
        }
        pVar.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final void debugRuntimeCheck(boolean z, a<String> aVar) {
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final void debugRuntimeCheck(boolean z) {
    }
}
