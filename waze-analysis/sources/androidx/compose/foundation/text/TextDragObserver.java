package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionAdjustment;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextDragObserver {
    void onCancel();

    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo3385onDownk4lQ0M(long j2);

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo3386onDragk4lQ0M(long j2);

    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
    void mo3387onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment);

    void onStop();

    void onUp();
}
