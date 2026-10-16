package T0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f11310j;

    /* renamed from: a, reason: collision with root package name */
    public int f11311a;

    /* renamed from: b, reason: collision with root package name */
    public int f11312b;

    /* renamed from: c, reason: collision with root package name */
    public int f11313c;

    /* renamed from: d, reason: collision with root package name */
    public float f11314d;

    /* renamed from: e, reason: collision with root package name */
    public float f11315e;

    /* renamed from: f, reason: collision with root package name */
    public float f11316f;

    /* renamed from: g, reason: collision with root package name */
    public int f11317g;

    /* renamed from: h, reason: collision with root package name */
    public String f11318h;

    /* renamed from: i, reason: collision with root package name */
    public int f11319i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11310j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f11349f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            switch (f11310j.get(index)) {
                case 1:
                    this.f11315e = typedArrayObtainStyledAttributes.getFloat(index, this.f11315e);
                    break;
                case 2:
                    this.f11313c = typedArrayObtainStyledAttributes.getInt(index, this.f11313c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = P0.a.f8984a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f11311a = m.f(typedArrayObtainStyledAttributes, index, this.f11311a);
                    break;
                case 6:
                    this.f11312b = typedArrayObtainStyledAttributes.getInteger(index, this.f11312b);
                    break;
                case 7:
                    this.f11314d = typedArrayObtainStyledAttributes.getFloat(index, this.f11314d);
                    break;
                case 8:
                    this.f11317g = typedArrayObtainStyledAttributes.getInteger(index, this.f11317g);
                    break;
                case 9:
                    this.f11316f = typedArrayObtainStyledAttributes.getFloat(index, this.f11316f);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f11319i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f11318h = string;
                        if (string.indexOf("/") > 0) {
                            this.f11319i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f11319i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
