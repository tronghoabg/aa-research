package androidx.compose.ui.graphics;

import android.graphics.Shader;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositeShaderBrush extends ShaderBrush {
    public static final int $stable = 0;
    private final int blendMode;
    private final ShaderBrush dstBrush;
    private final ShaderBrush srcBrush;

    private CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i2) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo8197createShaderuvyYCjk(long j2) {
        return ShaderKt.m8589CompositeShader7EN7VTw(this.dstBrush.mo8197createShaderuvyYCjk(j2), this.srcBrush.mo8197createShaderuvyYCjk(j2), this.blendMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) obj;
        return x.n(this.dstBrush, compositeShaderBrush.dstBrush) && x.n(this.srcBrush, compositeShaderBrush.srcBrush) && BlendMode.m8137equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8309getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    public final ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    public int hashCode() {
        return (((this.dstBrush.hashCode() * 31) + this.srcBrush.hashCode()) * 31) + this.blendMode;
    }

    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) BlendMode.m8139toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i2, o oVar) {
        this(shaderBrush, shaderBrush2, i2);
    }
}
