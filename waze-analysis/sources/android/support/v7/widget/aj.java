package android.support.v7.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1062a;

    /* renamed from: b, reason: collision with root package name */
    private final EmojiTextViewHelper f1063b;

    aj(TextView textView) {
        this.f1062a = textView;
        this.f1063b = new EmojiTextViewHelper(textView, false);
    }

    public final TransformationMethod a(TransformationMethod transformationMethod) {
        return this.f1063b.wrapTransformationMethod(transformationMethod);
    }

    final void b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f1062a.getContext().obtainStyledAttributes(attributeSet, android.support.v7.a.a.f487i, i2, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    final void c(boolean z) {
        this.f1063b.setAllCaps(z);
    }

    final void d(boolean z) {
        this.f1063b.setEnabled(z);
    }

    public final boolean e() {
        return this.f1063b.isEnabled();
    }

    final InputFilter[] f(InputFilter[] inputFilterArr) {
        return this.f1063b.getFilters(inputFilterArr);
    }
}
