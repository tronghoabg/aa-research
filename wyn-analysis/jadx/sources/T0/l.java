package T0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f11324n;

    /* renamed from: a, reason: collision with root package name */
    public float f11325a;

    /* renamed from: b, reason: collision with root package name */
    public float f11326b;

    /* renamed from: c, reason: collision with root package name */
    public float f11327c;

    /* renamed from: d, reason: collision with root package name */
    public float f11328d;

    /* renamed from: e, reason: collision with root package name */
    public float f11329e;

    /* renamed from: f, reason: collision with root package name */
    public float f11330f;

    /* renamed from: g, reason: collision with root package name */
    public float f11331g;

    /* renamed from: h, reason: collision with root package name */
    public int f11332h;

    /* renamed from: i, reason: collision with root package name */
    public float f11333i;

    /* renamed from: j, reason: collision with root package name */
    public float f11334j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11335l;

    /* renamed from: m, reason: collision with root package name */
    public float f11336m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11324n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f11352i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            switch (f11324n.get(index)) {
                case 1:
                    this.f11325a = typedArrayObtainStyledAttributes.getFloat(index, this.f11325a);
                    break;
                case 2:
                    this.f11326b = typedArrayObtainStyledAttributes.getFloat(index, this.f11326b);
                    break;
                case 3:
                    this.f11327c = typedArrayObtainStyledAttributes.getFloat(index, this.f11327c);
                    break;
                case 4:
                    this.f11328d = typedArrayObtainStyledAttributes.getFloat(index, this.f11328d);
                    break;
                case 5:
                    this.f11329e = typedArrayObtainStyledAttributes.getFloat(index, this.f11329e);
                    break;
                case 6:
                    this.f11330f = typedArrayObtainStyledAttributes.getDimension(index, this.f11330f);
                    break;
                case 7:
                    this.f11331g = typedArrayObtainStyledAttributes.getDimension(index, this.f11331g);
                    break;
                case 8:
                    this.f11333i = typedArrayObtainStyledAttributes.getDimension(index, this.f11333i);
                    break;
                case 9:
                    this.f11334j = typedArrayObtainStyledAttributes.getDimension(index, this.f11334j);
                    break;
                case 10:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.f11335l = true;
                    this.f11336m = typedArrayObtainStyledAttributes.getDimension(index, this.f11336m);
                    break;
                case 12:
                    this.f11332h = m.f(typedArrayObtainStyledAttributes, index, this.f11332h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
