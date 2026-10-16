package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zti extends ztq {
    private final ztq a;
    private final float b;

    public zti(ztq ztqVar, float f) {
        ysi.T(f >= BitmapDescriptorFactory.HUE_RED && f < 360.0f, String.format("Invalid hue [%s] outside range [0.0,360.0)", Float.valueOf(f)));
        zkt.n(ztqVar, "baseBitmapDescriptorImpl");
        this.a = ztqVar;
        this.b = f;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmapP;
        Bitmap bitmapCopy;
        Bitmap bitmapA = this.a.a(gjtVar);
        boolean zS = addm.a.gu().s();
        float f = this.b;
        if (!zS || Build.VERSION.SDK_INT < 33) {
            bitmapP = ysi.P(bitmapA, f);
        } else {
            int width = bitmapA.getWidth();
            int height = bitmapA.getHeight();
            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, 1, 1, 768L);
            RenderNode renderNode = new RenderNode("ColorizeEffect");
            HardwareRenderer hardwareRenderer = new HardwareRenderer();
            hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
            hardwareRenderer.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, width, height);
            RuntimeShader runtimeShader = new RuntimeShader("uniform shader input_shader;\nuniform float targetHue;\nvec3 rgb2hsv(vec3 c) {\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));\n    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\nvec3 hsv2rgb(vec3 c) {\n    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);\n    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);\n    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);\n}\nvec4 main(vec2 fragCoord) {\n    vec4 color = sample(input_shader, fragCoord);\n    if (color.a > 0.0) {\n        vec3 rgb = color.rgb;\n        if (color.a < 1.0) {\n            rgb /= color.a;\n        }\n        vec3 hsv = rgb2hsv(rgb);\n        hsv.x = targetHue / 360.0;\n        vec3 newRgb = hsv2rgb(hsv);\n        newRgb *= color.a;\n        return vec4(newRgb, color.a);\n    }\n    return color;\n}\n");
            runtimeShader.setInputShader("input_shader", new BitmapShader(bitmapA, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            runtimeShader.setFloatUniform("targetHue", f);
            Paint paint = new Paint();
            paint.setShader(runtimeShader);
            renderNode.beginRecording().drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, paint);
            renderNode.endRecording();
            hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
            if (imageAcquireNextImage == null) {
                renderNode.discardDisplayList();
                hardwareRenderer.destroy();
                imageReaderNewInstance.close();
                bitmapP = ysi.P(bitmapA, f);
            } else {
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                if (hardwareBuffer == null) {
                    imageAcquireNextImage.close();
                    renderNode.discardDisplayList();
                    hardwareRenderer.destroy();
                    imageReaderNewInstance.close();
                    bitmapP = ysi.P(bitmapA, f);
                } else {
                    Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    if (bitmapWrapHardwareBuffer != null) {
                        try {
                            bitmapCopy = bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                        } finally {
                            bitmapWrapHardwareBuffer.recycle();
                        }
                    } else {
                        bitmapCopy = null;
                    }
                    hardwareBuffer.close();
                    imageAcquireNextImage.close();
                    imageReaderNewInstance.close();
                    renderNode.discardDisplayList();
                    hardwareRenderer.destroy();
                    bitmapP = bitmapCopy == null ? ysi.P(bitmapA, f) : bitmapCopy;
                }
            }
        }
        if (bitmapP != null) {
            return bitmapP;
        }
        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zti)) {
            return false;
        }
        zti ztiVar = (zti) obj;
        return a.C(this.a, ztiVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ztiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("baseBitmapDescriptorImpl", this.a);
        zsaVarA.d("hue", this.b);
        return zsaVarA.toString();
    }
}
