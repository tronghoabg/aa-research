package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Collection;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(final a<? extends Set<MediaType>> aVar, final p<? super ClipEntry, ? super ClipMetadata, Boolean> pVar, final l<? super DragAndDropEvent, ab> lVar, final l<? super DragAndDropEvent, ab> lVar2, final l<? super DragAndDropEvent, ab> lVar3, final l<? super Offset, ab> lVar4, final l<? super DragAndDropEvent, ab> lVar5, final l<? super DragAndDropEvent, ab> lVar6, final l<? super DragAndDropEvent, ab> lVar7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$lambda$0(aVar, (DragAndDropEvent) obj));
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                l<DragAndDropEvent, ab> lVar8 = lVar5;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                lVar.invoke(dragAndDropEvent);
                return pVar.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                l<DragAndDropEvent, ab> lVar8 = lVar7;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                l<DragAndDropEvent, ab> lVar8 = lVar3;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                l<DragAndDropEvent, ab> lVar8 = lVar6;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                l<Offset, ab> lVar8 = lVar4;
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                if (lVar8 != null) {
                    float x = androidDragEvent.getX();
                    float y = androidDragEvent.getY();
                    lVar8.invoke(Offset.m7969boximpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                l<DragAndDropEvent, ab> lVar8 = lVar2;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(a aVar, p pVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar2 = null;
        }
        if ((i2 & 16) != 0) {
            lVar3 = null;
        }
        if ((i2 & 32) != 0) {
            lVar4 = null;
        }
        if ((i2 & 64) != 0) {
            lVar5 = null;
        }
        if ((i2 & 128) != 0) {
            lVar6 = null;
        }
        if ((i2 & 256) != 0) {
            lVar7 = null;
        }
        return textFieldDragAndDropNode(aVar, pVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    static final boolean textFieldDragAndDropNode$lambda$0(a aVar, DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
        Iterable<MediaType> iterable = (Iterable) aVar.invoke();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (MediaType mediaType : iterable) {
            if (x.n(mediaType, MediaType.Companion.getAll()) || (clipDescription != null && clipDescription.hasMimeType(mediaType.getRepresentation()))) {
                return true;
            }
        }
        return false;
    }
}
