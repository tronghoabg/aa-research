package h8;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C3623d;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f36224a = {R.attr.theme, com.wynauto.wyn.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f36225b = {com.wynauto.wyn.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i5, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36225b, i5, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C3623d) && ((C3623d) context).f41183a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C3623d c3623d = new C3623d(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f36224a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c3623d.getTheme().applyStyle(resourceId2, true);
        }
        return c3623d;
    }
}
