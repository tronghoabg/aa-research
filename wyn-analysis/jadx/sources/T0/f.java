package T0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f11222a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11223b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11224c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11225d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11226e;

    public f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f11222a = Float.NaN;
        this.f11223b = Float.NaN;
        this.f11224c = Float.NaN;
        this.f11225d = Float.NaN;
        this.f11226e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f11353j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f11226e);
                this.f11226e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f11225d = typedArrayObtainStyledAttributes.getDimension(index, this.f11225d);
            } else if (index == 2) {
                this.f11223b = typedArrayObtainStyledAttributes.getDimension(index, this.f11223b);
            } else if (index == 3) {
                this.f11224c = typedArrayObtainStyledAttributes.getDimension(index, this.f11224c);
            } else if (index == 4) {
                this.f11222a = typedArrayObtainStyledAttributes.getDimension(index, this.f11222a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
