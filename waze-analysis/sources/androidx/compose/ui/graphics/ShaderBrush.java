package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    public static final int $stable = 0;
    private long createdSize;
    private TransformShader internalTransformShader;
    private float[] transform;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    }

    private final TransformShader obtainTransformShader() {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            return transformShader;
        }
        TransformShader transformShader2 = new TransformShader();
        this.internalTransformShader = transformShader2;
        return transformShader2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo8173applyToPq9zytI(long j2, Paint paint, float f2) {
        TransformShader transformShaderObtainTransformShader = this.internalTransformShader;
        if (transformShaderObtainTransformShader == null || !Size.m8045equalsimpl0(this.createdSize, j2)) {
            if (Size.m8051isEmptyimpl(j2)) {
                this.internalTransformShader = null;
                this.createdSize = Size.Companion.m8057getUnspecifiedNHjbRc();
                transformShaderObtainTransformShader = null;
            } else {
                transformShaderObtainTransformShader = obtainTransformShader();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShaderObtainTransformShader.m8672transformQ8lPUPs(fArr);
                }
                transformShaderObtainTransformShader.setShader(mo8197createShaderuvyYCjk(j2));
                this.internalTransformShader = transformShaderObtainTransformShader;
                this.createdSize = j2;
            }
        }
        if (!Color.m8229equalsimpl0(paint.mo8098getColor0d7_KjU(), Color.Companion.m8254getBlack0d7_KjU())) {
            paint.mo8104setColor8_81llA(Color.Companion.m8254getBlack0d7_KjU());
        }
        if (!x.n(paint.getShader(), transformShaderObtainTransformShader != null ? transformShaderObtainTransformShader.getShader() : null)) {
            paint.setShader(transformShaderObtainTransformShader != null ? transformShaderObtainTransformShader.getShader() : null);
        }
        if (paint.getAlpha() == f2) {
            return;
        }
        paint.setAlpha(f2);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo8197createShaderuvyYCjk(long j2);

    /* renamed from: getTransform-3i98HWw, reason: not valid java name */
    public final float[] m8587getTransform3i98HWw() {
        return this.transform;
    }

    /* renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m8588setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            transformShader.m8672transformQ8lPUPs(fArr);
        }
    }
}
