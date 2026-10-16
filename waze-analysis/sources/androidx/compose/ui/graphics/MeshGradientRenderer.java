package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MeshGradientRenderer {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.MeshGradientRenderer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void draw$default(MeshGradientRenderer meshGradientRenderer, DrawScope drawScope, int i2, int i3, float[] fArr, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, boolean z, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
            }
            if ((i4 & 16) != 0) {
                fArr2 = null;
            }
            if ((i4 & 32) != 0) {
                fArr3 = null;
            }
            if ((i4 & 64) != 0) {
                fArr4 = null;
            }
            if ((i4 & 128) != 0) {
                fArr5 = null;
            }
            meshGradientRenderer.draw(drawScope, i2, i3, fArr, iArr, fArr2, fArr3, fArr4, fArr5, z & ((i4 & 256) == 0));
        }
    }

    void draw(DrawScope drawScope, int i2, int i3, float[] fArr, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, boolean z);
}
