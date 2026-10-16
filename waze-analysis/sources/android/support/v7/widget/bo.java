package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bo {

    /* renamed from: a, reason: collision with root package name */
    private int f1161a = 0;

    /* renamed from: b, reason: collision with root package name */
    private float f1162b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f1163c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f1164d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1165e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private boolean f1166f = false;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f1167g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f1168h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    bo(TextView textView) {
        this.f1167g = textView;
        this.f1168h = textView.getContext();
    }

    private final boolean g() {
        return !(this.f1167g instanceof ah);
    }

    private static final int[] h(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0) {
                    Integer numValueOf = Integer.valueOf(i2);
                    if (Collections.binarySearch(arrayList, numValueOf) < 0) {
                        arrayList.add(numValueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    final int a() {
        return Math.round(this.f1164d);
    }

    final int b() {
        return Math.round(this.f1163c);
    }

    final int c() {
        return Math.round(this.f1162b);
    }

    final int d() {
        return this.f1161a;
    }

    final void e(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int resourceId;
        int[] iArr = android.support.v7.a.a.f487i;
        Context context = this.f1168h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f1167g;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.f1161a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr2[i3] = typedArrayObtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                int[] iArrH = h(iArr2);
                this.f1165e = iArrH;
                boolean z = iArrH.length > 0;
                this.f1166f = z;
                if (z) {
                    this.f1161a = 1;
                    this.f1163c = iArrH[0];
                    this.f1164d = iArrH[r9 - 1];
                    this.f1162b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!g()) {
            this.f1161a = 0;
            return;
        }
        if (this.f1161a == 1) {
            boolean z2 = this.f1166f;
            if (!z2) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                this.f1161a = 1;
                this.f1163c = dimension2;
                this.f1164d = dimension3;
                this.f1162b = dimension;
                this.f1166f = false;
                z2 = false;
            }
            if (g()) {
                if (!z2 || this.f1165e.length == 0) {
                    int iFloor = ((int) Math.floor((this.f1164d - this.f1163c) / this.f1162b)) + 1;
                    int[] iArr3 = new int[iFloor];
                    for (int i4 = 0; i4 < iFloor; i4++) {
                        iArr3[i4] = Math.round(this.f1163c + (i4 * this.f1162b));
                    }
                    this.f1165e = h(iArr3);
                }
            }
        }
    }

    final int[] f() {
        return this.f1165e;
    }
}
