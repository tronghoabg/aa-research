package T0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f11320a;

    /* renamed from: b, reason: collision with root package name */
    public int f11321b;

    /* renamed from: c, reason: collision with root package name */
    public float f11322c;

    /* renamed from: d, reason: collision with root package name */
    public float f11323d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f11350g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 1) {
                this.f11322c = typedArrayObtainStyledAttributes.getFloat(index, this.f11322c);
            } else if (index == 0) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f11320a);
                this.f11320a = i10;
                this.f11320a = m.f11337d[i10];
            } else if (index == 4) {
                this.f11321b = typedArrayObtainStyledAttributes.getInt(index, this.f11321b);
            } else if (index == 3) {
                this.f11323d = typedArrayObtainStyledAttributes.getFloat(index, this.f11323d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
