package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    private SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j2;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m3867copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i2 & 2) != 0) {
            j2 = selectionHandleInfo.position;
        }
        if ((i2 & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((i2 & 8) != 0) {
            z = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m3869copyubNVwUQ(handle, j2, selectionHandleAnchor, z);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m3868component2F1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m3869copyubNVwUQ(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        return new SelectionHandleInfo(handle, j2, selectionHandleAnchor, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m7977equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3870getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m7982hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + SelectionHandleInfo$$ExternalSyntheticBackport0.m(this.visible);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z, o oVar) {
        this(handle, j2, selectionHandleAnchor, z);
    }
}
