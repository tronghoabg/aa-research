package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.ReusableRememberObserverHolder;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import h.a.ac;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableEditorKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotTableEditor slotTableEditor, Object obj, int i2) {
        return (slotTableEditor.isClosed() || slotTableEditor.isEmpty()) ? ac.f47967a : SlotTableAddresSpaceKt.buildTrace(slotTableEditor.getTable().getAddressSpace(), i2, obj, new EditorTraceBuilder(slotTableEditor));
    }

    public static /* synthetic */ List buildTrace$default(SlotTableEditor slotTableEditor, Object obj, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = slotTableEditor.getCurrentGroup();
        }
        if (1 == (i3 & 1)) {
            obj = null;
        }
        return buildTrace(slotTableEditor, obj, i2);
    }

    public static final void deactivateGroup(final SlotTableEditor slotTableEditor, final RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new SlotTableEditor.VisitSlotsInRememberOrderCallback() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
            public final boolean visit(int i2, int i3, Object obj) {
                return SlotTableEditorKt.deactivateGroup$lambda$0(slotTableEditor, rememberManager, i2, i3, obj);
            }
        });
    }

    static final boolean deactivateGroup$lambda$0(SlotTableEditor slotTableEditor, RememberManager rememberManager, int i2, int i3, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            slotTableEditor.flagsOf(i2);
            if (i3 != 0) {
                return false;
            }
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

    public static final void removeGroupAndForgetSlots(SlotTableEditor slotTableEditor, final RememberManager rememberManager) {
        slotTableEditor.visitSlotsInRememberOrder(slotTableEditor.getCurrentGroup(), new SlotTableEditor.VisitSlotsInRememberOrderCallback() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt$$ExternalSyntheticLambda1
            @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
            public final boolean visit(int i2, int i3, Object obj) {
                SlotTableEditorKt.removeGroupAndForgetSlots$lambda$0(rememberManager, i2, i3, obj);
                return false;
            }
        });
        slotTableEditor.removeGroup(1 == ((false ? 1 : 0) | (1 & 1)));
    }

    static final boolean removeGroupAndForgetSlots$lambda$0(RememberManager rememberManager, int i2, int i3, Object obj) {
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
}
