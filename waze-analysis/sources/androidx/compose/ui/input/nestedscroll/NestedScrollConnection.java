package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m9444$default$onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j2, long j3, int i2) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }

        /* renamed from: $default$onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m9446$default$onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j2, int i2) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }

        /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m9451onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, long j3, e<? super Velocity> eVar) {
            return Velocity.m11397boximpl(Velocity.Companion.m11417getZero9UxMQ8M());
        }

        /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
        public static /* synthetic */ Object m9452onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, e<? super Velocity> eVar) {
            return Velocity.m11397boximpl(Velocity.Companion.m11417getZero9UxMQ8M());
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m9453onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j2, long j3, e<? super Velocity> eVar) {
            return CC.m9451onPostFlingRZ2iAVY$suspendImpl(nestedScrollConnection, j2, j3, eVar);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m9454onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j2, long j3, int i2) {
            return CC.m9444$default$onPostScrollDzOQY0M(nestedScrollConnection, j2, j3, i2);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m9455onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j2, e<? super Velocity> eVar) {
            return CC.m9452onPreFlingQWom1Mo$suspendImpl(nestedScrollConnection, j2, eVar);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m9456onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j2, int i2) {
            return CC.m9446$default$onPreScrollOzD1aCk(nestedScrollConnection, j2, i2);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY */
    Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2);

    /* renamed from: onPreFling-QWom1Mo */
    Object mo2299onPreFlingQWom1Mo(long j2, e<? super Velocity> eVar);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo2300onPreScrollOzD1aCk(long j2, int i2);
}
