package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import i.AbstractC2820a;

/* renamed from: q.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3835s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f43893a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.l f43894b;

    public C3835s(TextView textView) {
        this.f43893a = textView;
        this.f43894b = new S3.l(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((A6.c) this.f43894b.f10967a).x(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i5) {
        TypedArray typedArrayObtainStyledAttributes = this.f43893a.getContext().obtainStyledAttributes(attributeSet, AbstractC2820a.f36446i, i5, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z2) {
        ((A6.c) this.f43894b.f10967a).K(z2);
    }

    public final void d(boolean z2) {
        ((A6.c) this.f43894b.f10967a).L(z2);
    }
}
