package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    LongObjectMap<Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j2);

    void notifySelectableChange(long j2);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo3906notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z, SelectionAdjustment selectionAdjustment, boolean z2);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j2, boolean z);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo3907notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
