package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(Size.Companion.m8057getUnspecifiedNHjbRc()), null, 2, null);
    private final State<Shader> shaderState = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ShaderBrushSpan.shaderState$lambda$0(this.f$0);
        }
    });

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f2) {
        this.shaderBrush = shaderBrush;
        this.alpha = f2;
    }

    static final Shader shaderState$lambda$0(ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m10871getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m8051isEmptyimpl(shaderBrushSpan.m10871getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.mo8197createShaderuvyYCjk(shaderBrushSpan.m10871getSizeNHjbRc());
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m10871getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m8054unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m10872setSizeuvyYCjk(long j2) {
        this.size$delegate.setValue(Size.m8037boximpl(j2));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
