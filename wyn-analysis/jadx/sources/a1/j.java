package A1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import y1.C4526g;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f254a;

    public j(TransformationMethod transformationMethod) {
        this.f254a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f254a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C4526g.a().b() != 1) {
            return charSequence;
        }
        C4526g c4526gA = C4526g.a();
        c4526gA.getClass();
        return c4526gA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i5, Rect rect) {
        TransformationMethod transformationMethod = this.f254a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i5, rect);
        }
    }
}
