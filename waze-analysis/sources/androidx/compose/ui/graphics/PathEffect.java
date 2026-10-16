package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PathEffect {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            return companion.dashPathEffect(fArr, f2);
        }

        public final PathEffect chainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        public final PathEffect cornerPathEffect(float f2) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f2);
        }

        public final PathEffect dashPathEffect(float[] fArr, float f2) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f2);
        }

        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final PathEffect m8546stampedPathEffect7aD1DOk(Path path, float f2, float f3, int i2) {
            return AndroidPathEffect_androidKt.m8121actualStampedPathEffect7aD1DOk(path, f2, f3, i2);
        }
    }
}
