package androidx.camera.core.processing.concurrent;

import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Preconditions;
import com.waze.strings.DisplayStrings;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DualOpenGlRenderer extends OpenGlRenderer {
    private static final String TAG = "DualOpenGlRenderer";
    private CompositionSettings mPrimaryCompositionSettings;
    private CompositionSettings mSecondaryCompositionSettings;
    private int mPrimaryExternalTextureId = -1;
    private int mSecondaryExternalTextureId = -1;
    private final float[] mBorderColorArray = new float[4];

    public DualOpenGlRenderer(CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        this.mPrimaryCompositionSettings = compositionSettings;
        this.mSecondaryCompositionSettings = compositionSettings2;
    }

    private static float[] getTransformMatrix(Size size, Size size2, CompositionSettings compositionSettings) {
        float[] fArrCreate4x4IdentityMatrix = GLUtils.create4x4IdentityMatrix();
        float[] fArrCreate4x4IdentityMatrix2 = GLUtils.create4x4IdentityMatrix();
        float[] fArrCreate4x4IdentityMatrix3 = GLUtils.create4x4IdentityMatrix();
        Matrix.scaleM(fArrCreate4x4IdentityMatrix, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (compositionSettings.getScale().first.floatValue() != 0.0f || compositionSettings.getScale().second.floatValue() != 0.0f) {
            Matrix.translateM(fArrCreate4x4IdentityMatrix2, 0, compositionSettings.getOffset().first.floatValue() / compositionSettings.getScale().first.floatValue(), compositionSettings.getOffset().second.floatValue() / compositionSettings.getScale().second.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrCreate4x4IdentityMatrix3, 0, fArrCreate4x4IdentityMatrix, 0, fArrCreate4x4IdentityMatrix2, 0);
        return fArrCreate4x4IdentityMatrix3;
    }

    private void renderInternal(OutputSurface outputSurface, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, CompositionSettings compositionSettings, int i2, boolean z) {
        useAndConfigureProgramWithTexture(i2);
        GLES20.glViewport(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        GLES20.glScissor(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.updateTransformMatrix(fArr2, fArr, z);
        GLUtils.Program2D program2D = this.mCurrentProgram;
        Preconditions.checkNotNull(program2D);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr2);
        }
        program2D.updateTransformMatrix(getTransformMatrix(new Size((int) (outputSurface.getWidth() * compositionSettings.getScale().first.floatValue()), (int) (outputSurface.getHeight() * compositionSettings.getScale().second.floatValue())), new Size(outputSurface.getWidth(), outputSurface.getHeight()), compositionSettings));
        program2D.updateAlpha(compositionSettings.getAlpha());
        float roundedCornerRatio = compositionSettings.getRoundedCornerRatio();
        float borderWidthRatio = compositionSettings.getBorderWidthRatio();
        float f2 = 1.0f;
        if (roundedCornerRatio > 0.0f || borderWidthRatio > 0.0f) {
            float width = outputSurface.getWidth() * Math.abs(compositionSettings.getScale().first.floatValue());
            float height = outputSurface.getHeight() * Math.abs(compositionSettings.getScale().second.floatValue());
            if (width > 0.0f && height > 0.0f) {
                f2 = width / height;
            }
        }
        program2D.updateCornerRadiusRatio(roundedCornerRatio, f2);
        int borderColor = compositionSettings.getBorderColor();
        this.mBorderColorArray[0] = Color.red(borderColor) / 255.0f;
        this.mBorderColorArray[1] = Color.green(borderColor) / 255.0f;
        this.mBorderColorArray[2] = Color.blue(borderColor) / 255.0f;
        this.mBorderColorArray[3] = Color.alpha(borderColor) / 255.0f;
        program2D.updateBorderWidth(borderWidthRatio, this.mBorderColorArray);
        GLES20.glEnable(DisplayStrings.DS_AAOS_UGC_REPORTS_INCORRECT_JUNCTION);
        GLES20.glBlendFuncSeparate(DisplayStrings.DS_RECALCULATING_ROUTE___, DisplayStrings.DS_REC, 1, DisplayStrings.DS_REC);
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glDisable(DisplayStrings.DS_AAOS_UGC_REPORTS_INCORRECT_JUNCTION);
    }

    public int getTextureName(boolean z) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return z ? this.mPrimaryExternalTextureId : this.mSecondaryExternalTextureId;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public GraphicDeviceInfo init(DynamicRange dynamicRange, Map<GLUtils.InputFormat, ShaderProvider> map) {
        GraphicDeviceInfo graphicDeviceInfoInit = super.init(dynamicRange, map, true);
        this.mPrimaryExternalTextureId = GLUtils.createTexture();
        this.mSecondaryExternalTextureId = GLUtils.createTexture();
        return graphicDeviceInfoInit;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public void release() {
        super.release();
        this.mPrimaryExternalTextureId = -1;
        this.mSecondaryExternalTextureId = -1;
    }

    public void render(long j2, Surface surface, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        DualOpenGlRenderer dualOpenGlRenderer;
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        OutputSurface outputSurface = outSurfaceOrThrow;
        if (surface != this.mCurrentSurface) {
            makeCurrent(outputSurface.getEglSurface());
            this.mCurrentSurface = surface;
        }
        GLES30.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES30.glClear(16384);
        if (this.mPrimaryCompositionSettings.getZOrder() <= this.mSecondaryCompositionSettings.getZOrder()) {
            dualOpenGlRenderer = this;
            dualOpenGlRenderer.renderInternal(outputSurface, surfaceOutput, surfaceTexture, this.mPrimaryCompositionSettings, this.mPrimaryExternalTextureId, true);
            dualOpenGlRenderer.renderInternal(outputSurface, surfaceOutput, surfaceTexture2, dualOpenGlRenderer.mSecondaryCompositionSettings, dualOpenGlRenderer.mSecondaryExternalTextureId, false);
        } else {
            dualOpenGlRenderer = this;
            dualOpenGlRenderer.renderInternal(outputSurface, surfaceOutput, surfaceTexture2, dualOpenGlRenderer.mSecondaryCompositionSettings, dualOpenGlRenderer.mSecondaryExternalTextureId, false);
            dualOpenGlRenderer.renderInternal(outputSurface, surfaceOutput, surfaceTexture, dualOpenGlRenderer.mPrimaryCompositionSettings, dualOpenGlRenderer.mPrimaryExternalTextureId, true);
        }
        EGLExt.eglPresentationTimeANDROID(dualOpenGlRenderer.mEglDisplay, outputSurface.getEglSurface(), j2);
        if (EGL14.eglSwapBuffers(dualOpenGlRenderer.mEglDisplay, outputSurface.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x".concat(String.valueOf(Integer.toHexString(EGL14.eglGetError()))));
        dualOpenGlRenderer.removeOutputSurfaceInternal(surface, false);
    }

    public void updateCompositionSettings(CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        this.mPrimaryCompositionSettings = compositionSettings;
        this.mSecondaryCompositionSettings = compositionSettings2;
    }
}
