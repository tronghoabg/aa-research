package A1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import y1.C4526g;

/* loaded from: classes.dex */
public final class g extends A6.c {

    /* renamed from: e, reason: collision with root package name */
    public final f f248e;

    public g(TextView textView) {
        this.f248e = new f(textView);
    }

    @Override // A6.c
    public final boolean E() {
        return this.f248e.f247g;
    }

    @Override // A6.c
    public final void K(boolean z2) {
        if (C4526g.f47922j != null) {
            this.f248e.K(z2);
        }
    }

    @Override // A6.c
    public final void L(boolean z2) {
        boolean z10 = C4526g.f47922j != null;
        f fVar = this.f248e;
        if (z10) {
            fVar.L(z2);
        } else {
            fVar.f247g = z2;
        }
    }

    @Override // A6.c
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        return !(C4526g.f47922j != null) ? transformationMethod : this.f248e.O(transformationMethod);
    }

    @Override // A6.c
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(C4526g.f47922j != null) ? inputFilterArr : this.f248e.x(inputFilterArr);
    }
}
