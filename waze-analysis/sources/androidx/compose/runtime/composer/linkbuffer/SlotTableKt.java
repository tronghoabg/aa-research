package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.ReusableRememberObserverHolder;
import androidx.compose.runtime.ScopeInvalidated;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.e;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int LIVE_EDIT_INVALID_KEY = -3;

    public static final void adoptScopesInGroupToNewParent(SlotTable slotTable, int i2, RecomposeScopeOwner recomposeScopeOwner) {
        int i3;
        int[] groups = slotTable.getAddressSpace().getGroups();
        Object[] slots = slotTable.getAddressSpace().getSlots();
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        if (i2 < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = addressSpace.getGroups();
        int iPop = i2;
        while (true) {
            RecomposeScopeImpl recomposeScopeImplRecomposeScopeOrNullInRegion = recomposeScopeOrNullInRegion(slots, groups[iPop + 5]);
            if (recomposeScopeImplRecomposeScopeOrNullInRegion != null) {
                recomposeScopeImplRecomposeScopeOrNullInRegion.adoptedBy(recomposeScopeOwner);
            }
            if (iPop != i2 && (i3 = groups2[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups2[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public static final SlotTable asLinkBufferSlotTable(SlotStorage slotStorage) {
        SlotTable slotTable = slotStorage instanceof SlotTable ? (SlotTable) slotStorage : null;
        if (slotTable != null) {
            return slotTable;
        }
        ComposerKt.composeRuntimeError("Inconsistent composer");
        throw new e();
    }

    public static final CompositionGroup compositionGroupOf(SlotTable slotTable, int i2) {
        return new SlotTableGroup(slotTable, i2, slotTable.getVersion());
    }

    public static final void deactivateCurrentGroup(SlotTableEditor slotTableEditor, final RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new SlotTableEditor.VisitSlotsInRememberOrderCallback() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
            public final boolean visit(int i2, int i3, Object obj) {
                return SlotTableKt.deactivateCurrentGroup$lambda$0(rememberManager, i2, i3, obj);
            }
        });
    }

    static final boolean deactivateCurrentGroup$lambda$0(RememberManager rememberManager, int i2, int i3, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
            return false;
        }
        if (obj instanceof ReusableRememberObserverHolder) {
            return false;
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
            return true;
        }
        if (!(obj instanceof RecomposeScopeImpl)) {
            return false;
        }
        ((RecomposeScopeImpl) obj).release();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotTableEditor slotTableEditor, Applier<?> applier) {
        int currentGroup = slotTableEditor.getCurrentGroup();
        if (applier != null && slotTableEditor.nodeCountOf(currentGroup) > 0) {
            SlotTableAddressSpace addressSpace = slotTableEditor.getTable().getAddressSpace();
            int parentGroup = slotTableEditor.getParentGroup();
            int[] groups = addressSpace.getGroups();
            int i2 = groups[parentGroup + 2];
            while (true) {
                if (i2 <= 0) {
                    if (i2 == 0) {
                        ComposerKt.composeImmediateRuntimeError(a.a(parentGroup, "Traversing parent of group not in the slot table: "));
                    }
                    i2 = -1;
                } else {
                    if (slotTableEditor.isNode(i2)) {
                        break;
                    }
                    i2 = groups[i2 + 2];
                }
            }
            if (i2 >= 0 && slotTableEditor.isNode(i2)) {
                Object objNode = slotTableEditor.node(i2);
                if (objNode == null) {
                    ComposerKt.composeImmediateRuntimeError("Invalid slot table structure");
                    objNode = ab.f48028a;
                }
                int iNodeIndexOf = nodeIndexOf(currentGroup, slotTableEditor.getTable());
                int iNodeCountOf = slotTableEditor.nodeCountOf(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeIndexOf, iNodeCountOf);
                applier.up();
            }
        }
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableEditor.getTable().getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        MovableContent<Object> content$runtime = movableContentStateReference.getContent$runtime();
        slotTableBuilder.startNewGroup(MovableContentKt.movableContentKey, content$runtime == Composer.Companion.getEmpty() ? 0 : 16777216, content$runtime, null, null);
        slotTableBuilder.addFlags(268435456);
        slotTableBuilder.append(movableContentStateReference.getParameter$runtime());
        slotTableBuilder.moveFrom(slotTableEditor, slotTableEditor.firstChildOf(LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime()).getAddress()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        slotTableBuilder.endGroup();
        SlotTable slotTableBuild = slotTableBuilder.build();
        MovableContentState movableContentState = new MovableContentState(slotTableBuild);
        if (slotTableBuild.getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace2 = slotTableBuild.getAddressSpace();
        int root = slotTableBuild.getRoot();
        if (root >= 0) {
            IntStack intStack = new IntStack();
            int[] groups2 = addressSpace2.getGroups();
            RecomposeScopeOwner recomposeScopeOwner = null;
            while (true) {
                int i3 = slotTableBuild.getGroups()[root + 5];
                if (i3 != -1) {
                    SlotTableAddressSpace addressSpace3 = slotTableBuild.getAddressSpace();
                    int i4 = (i3 & 15) + 1;
                    int i5 = i3 >> 4;
                    if (i4 > 15) {
                        i4 = addressSpace3.getLargeSizes().get(i5);
                    }
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object obj = slotTableBuild.getSlots()[i5 + i6];
                        if (x.n(obj, Composer.Companion.getEmpty())) {
                            break;
                        }
                        if (obj instanceof RecomposeScopeImpl) {
                            RecomposeScopeOwner recomposeScopeOwner2 = recomposeScopeOwner;
                            if (recomposeScopeOwner2 == null) {
                                recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableKt$extractMovableContentAtCurrent$1$owner$1
                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj2) {
                                        InvalidationResult invalidationResultInvalidate;
                                        ControlledComposition controlledComposition2 = controlledComposition;
                                        RecomposeScopeOwner recomposeScopeOwner3 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                                        if (recomposeScopeOwner3 == null || (invalidationResultInvalidate = recomposeScopeOwner3.invalidate(recomposeScopeImpl, obj2)) == null) {
                                            invalidationResultInvalidate = InvalidationResult.IGNORED;
                                        }
                                        if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                                            return invalidationResultInvalidate;
                                        }
                                        MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                        List<k<RecomposeScopeImpl, Object>> invalidations$runtime = movableContentStateReference2.getInvalidations$runtime();
                                        if (obj2 == null) {
                                            obj2 = ScopeInvalidated.INSTANCE;
                                        }
                                        movableContentStateReference2.setInvalidations$runtime(i.ag(invalidations$runtime, new k(recomposeScopeImpl, obj2)));
                                        return InvalidationResult.SCHEDULED;
                                    }

                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                                    }

                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public void recordReadOf(Object obj2) {
                                    }
                                };
                                recomposeScopeOwner2 = recomposeScopeOwner;
                            }
                            ((RecomposeScopeImpl) obj).adoptedBy(recomposeScopeOwner2);
                        }
                    }
                }
                int i7 = groups2[root + 1];
                if (i7 >= 0) {
                    intStack.push(i7);
                }
                root = groups2[root + 3];
                if (root < 0) {
                    if (intStack.tos == 0) {
                        break;
                    }
                    root = intStack.pop();
                }
            }
        }
        return movableContentState;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.tooling.ObjectLocation findLocation(androidx.compose.runtime.composer.linkbuffer.SlotTable r11, h.g.a.l<java.lang.Object, java.lang.Boolean> r12) {
        /*
            androidx.compose.runtime.composer.linkbuffer.SlotTableReader r0 = r11.openReader()
            int r1 = r11.getRoot()     // Catch: java.lang.Throwable -> La8
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r2 = r11.getAddressSpace()     // Catch: java.lang.Throwable -> La8
            r3 = 0
            if (r1 < 0) goto La4
            androidx.compose.runtime.IntStack r4 = new androidx.compose.runtime.IntStack     // Catch: java.lang.Throwable -> La8
            r4.<init>()     // Catch: java.lang.Throwable -> La8
            int[] r2 = r2.getGroups()     // Catch: java.lang.Throwable -> La8
            r5 = r1
        L19:
            boolean r6 = r0.isNode(r5)     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L37
            java.lang.Object r6 = r0.node(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = r12.invoke(r6)     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> La8
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L37
            androidx.compose.runtime.tooling.ObjectLocation r11 = new androidx.compose.runtime.tooling.ObjectLocation     // Catch: java.lang.Throwable -> La8
            r11.<init>(r5, r3)     // Catch: java.lang.Throwable -> La8
            r3 = r11
            goto La4
        L37:
            int[] r6 = androidx.compose.runtime.composer.linkbuffer.SlotTable.access$getGroups(r11)     // Catch: java.lang.Throwable -> La8
            int r7 = r5 + 5
            r6 = r6[r7]     // Catch: java.lang.Throwable -> La8
            r7 = -1
            if (r6 == r7) goto L88
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r7 = r11.getAddressSpace()     // Catch: java.lang.Throwable -> La8
            r8 = r6 & 15
            int r8 = r8 + 1
            int r6 = r6 >> 4
            r9 = 15
            if (r8 <= r9) goto L58
            androidx.collection.MutableIntIntMap r7 = androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace.access$getLargeSizes(r7)     // Catch: java.lang.Throwable -> La8
            int r8 = r7.get(r6)     // Catch: java.lang.Throwable -> La8
        L58:
            r7 = 0
        L59:
            if (r7 >= r8) goto L88
            java.lang.Object[] r9 = androidx.compose.runtime.composer.linkbuffer.SlotTable.access$getSlots(r11)     // Catch: java.lang.Throwable -> La8
            int r10 = r6 + r7
            r9 = r9[r10]     // Catch: java.lang.Throwable -> La8
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion     // Catch: java.lang.Throwable -> La8
            java.lang.Object r10 = r10.getEmpty()     // Catch: java.lang.Throwable -> La8
            boolean r10 = h.g.b.x.n(r9, r10)     // Catch: java.lang.Throwable -> La8
            if (r10 != 0) goto L88
            java.lang.Object r9 = r12.invoke(r9)     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> La8
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto L85
            androidx.compose.runtime.tooling.ObjectLocation r3 = new androidx.compose.runtime.tooling.ObjectLocation     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> La8
            r3.<init>(r5, r11)     // Catch: java.lang.Throwable -> La8
            goto La4
        L85:
            int r7 = r7 + 1
            goto L59
        L88:
            if (r5 == r1) goto L93
            int r6 = r5 + 1
            r6 = r2[r6]     // Catch: java.lang.Throwable -> La8
            if (r6 < 0) goto L93
            r4.push(r6)     // Catch: java.lang.Throwable -> La8
        L93:
            int r5 = r5 + 3
            r5 = r2[r5]     // Catch: java.lang.Throwable -> La8
            if (r5 >= 0) goto L19
            int r5 = r4.tos     // Catch: java.lang.Throwable -> La8
            if (r5 != 0) goto L9e
            goto La4
        L9e:
            int r5 = r4.pop()     // Catch: java.lang.Throwable -> La8
            goto L19
        La4:
            r0.close()
            return r3
        La8:
            r11 = move-exception
            r0.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableKt.findLocation(androidx.compose.runtime.composer.linkbuffer.SlotTable, h.g.a.l):androidx.compose.runtime.tooling.ObjectLocation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flagsNames(int i2) {
        String strConcat = (i2 & 8388608) == 8388608 ? "N" : "";
        if ((i2 & 16777216) == 16777216) {
            strConcat = strConcat.concat("O");
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            strConcat = strConcat + 'A';
        }
        if ((i2 & 67108864) == 67108864) {
            strConcat = strConcat + 'R';
        }
        if ((i2 & 134217728) == 134217728) {
            strConcat = strConcat + 'r';
        }
        if ((i2 & 268435456) == 268435456) {
            strConcat = strConcat + 'C';
        }
        if ((i2 & 536870912) == 536870912) {
            strConcat = strConcat + 'c';
        }
        if ((i2 & 1073741824) == 1073741824) {
            strConcat = strConcat + 'S';
        }
        if ((i2 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            strConcat = strConcat + 's';
        }
        int i3 = 8388607 & i2;
        if (i3 == 0) {
            return strConcat;
        }
        if ((i2 & (-8388608)) != 0) {
            strConcat = strConcat + ' ';
        }
        return strConcat + "CC(" + i3 + ')';
    }

    public static final int nodeIndexOf(int i2, SlotTable slotTable) {
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i3 = 0;
        while (i2 > 0) {
            int i4 = groups[i2 + 2];
            int[] groups2 = addressSpace.getGroups();
            for (int i5 = groups2[i4 + 3]; i5 > 0 && i5 != i2; i5 = groups2[i5 + 1]) {
                int i6 = groups[i5 + 4];
                i3 += (i6 & 8388608) == 8388608 ? 1 : 8388607 & i6;
            }
            if ((groups[i4 + 4] & 8388608) == 8388608) {
                break;
            }
            i2 = i4;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecomposeScopeImpl recomposeScopeOrNullInRegion(Object[] objArr, int i2) {
        if (i2 < 0) {
            return null;
        }
        Object obj = objArr[i2 >> 4];
        if (obj instanceof RecomposeScopeImpl) {
            return (RecomposeScopeImpl) obj;
        }
        return null;
    }

    public static final void removeCurrentGroup(SlotTableEditor slotTableEditor, final RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new SlotTableEditor.VisitSlotsInRememberOrderCallback() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableKt$$ExternalSyntheticLambda1
            @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
            public final boolean visit(int i2, int i3, Object obj) {
                SlotTableKt.removeCurrentGroup$lambda$0(rememberManager, i2, i3, obj);
                return false;
            }
        });
        slotTableEditor.removeGroup(1 == ((false ? 1 : 0) | (1 & 1)));
    }

    static final boolean removeCurrentGroup$lambda$0(RememberManager rememberManager, int i2, int i3, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (!(obj instanceof RecomposeScopeImpl)) {
            return false;
        }
        ((RecomposeScopeImpl) obj).release();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(Object obj, int i2) {
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return str;
        }
        String strAc = o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(String.valueOf(obj), "androidx.", "a."), "compose.", "c."), "runtime.", "r."), "internal.", "ι."), "ui.", "u."), "foundation.", "f."), "Modifier", "μ"), "material.", "m."), "Function", "λ"), "OpaqueKey", "κ"), "MutableState", "σ");
        String strSubstring = strAc.substring(0, Math.min(i2, strAc.length()));
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    private static final long toGroupHandle(int i2) {
        return i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }
}
