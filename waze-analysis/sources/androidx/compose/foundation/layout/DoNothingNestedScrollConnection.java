package androidx.compose.foundation.layout;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DoNothingNestedScrollConnection implements NestedScrollConnection {
    public static final DoNothingNestedScrollConnection INSTANCE = new DoNothingNestedScrollConnection();

    private DoNothingNestedScrollConnection() {
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e eVar) {
        return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public /* synthetic */ long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return NestedScrollConnection.CC.m9444$default$onPostScrollDzOQY0M(this, j2, j3, i2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
        return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        return NestedScrollConnection.CC.m9446$default$onPreScrollOzD1aCk(this, j2, i2);
    }
}
