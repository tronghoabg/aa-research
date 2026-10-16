package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Interpolatable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object lerp(java.lang.Object r3, java.lang.Object r4, float r5) {
            /*
                r2 = this;
                boolean r2 = h.g.b.x.n(r3, r4)
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r2 == 0) goto Ld
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L31
                goto L30
            Ld:
                boolean r2 = r3 instanceof androidx.compose.ui.graphics.Interpolatable
                if (r2 == 0) goto L19
                r2 = r3
                androidx.compose.ui.graphics.Interpolatable r2 = (androidx.compose.ui.graphics.Interpolatable) r2
                java.lang.Object r2 = r2.lerp(r4, r5)
                goto L1a
            L19:
                r2 = 0
            L1a:
                if (r2 != 0) goto L2a
                boolean r1 = r4 instanceof androidx.compose.ui.graphics.Interpolatable
                if (r1 == 0) goto L2a
                r2 = r4
                androidx.compose.ui.graphics.Interpolatable r2 = (androidx.compose.ui.graphics.Interpolatable) r2
                r1 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 - r5
                java.lang.Object r2 = r2.lerp(r3, r1)
            L2a:
                if (r2 != 0) goto L32
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L31
            L30:
                return r3
            L31:
                return r4
            L32:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.Interpolatable.Companion.lerp(java.lang.Object, java.lang.Object, float):java.lang.Object");
        }
    }

    Object lerp(Object obj, float f2);
}
