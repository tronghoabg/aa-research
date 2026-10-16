package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, l<? super Matrix, ab> lVar) {
        x.f(shader, "<this>");
        x.f(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
