package A1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends A6.c {

    /* renamed from: e, reason: collision with root package name */
    public final TextView f245e;

    /* renamed from: f, reason: collision with root package name */
    public final d f246f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f247g = true;

    public f(TextView textView) {
        this.f245e = textView;
        this.f246f = new d(textView);
    }

    @Override // A6.c
    public final boolean E() {
        return this.f247g;
    }

    @Override // A6.c
    public final void K(boolean z2) {
        if (z2) {
            TextView textView = this.f245e;
            textView.setTransformationMethod(O(textView.getTransformationMethod()));
        }
    }

    @Override // A6.c
    public final void L(boolean z2) {
        this.f247g = z2;
        TextView textView = this.f245e;
        textView.setTransformationMethod(O(textView.getTransformationMethod()));
        textView.setFilters(x(textView.getFilters()));
    }

    @Override // A6.c
    public final TransformationMethod O(TransformationMethod transformationMethod) {
        return this.f247g ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f254a : transformationMethod;
    }

    @Override // A6.c
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f247g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof d) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f246f;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }
}
