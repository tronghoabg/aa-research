package Va;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class Bb {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f13245a = new Rect();

    public static boolean a(View view, Class cls, String str, List list, List list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if (list != null && !list.isEmpty() && !list.contains(Integer.valueOf(view.getId()))) {
            return false;
        }
        if (list2 == null || !list2.contains(view.getClass().getName())) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    public static Activity b(View view) {
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            View viewFindViewById = view.findViewById(R.id.content);
            if (viewFindViewById != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }

    public static void c(Activity activity, Class cls, int i5, String str, boolean z2, boolean z10, List list, List list2, ArrayList arrayList) {
        if (i5 != -1) {
            View viewFindViewById = activity.findViewById(i5);
            if (cls.isInstance(viewFindViewById)) {
                arrayList.add(viewFindViewById);
                if (z2) {
                    return;
                }
            }
            d(viewFindViewById, cls, str, z2, z10, list, list2, arrayList);
            if (arrayList.size() > 0 && z2) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            View view = viewFindViewById2;
            while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                view = (View) view.getParent();
            }
            d(view, cls, str, z2, z10, list, list2, arrayList);
        }
    }

    public static void d(View view, Class cls, String str, boolean z2, boolean z10, List list, List list2, ArrayList arrayList) {
        ArrayList arrayList2 = arrayList;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i5 = 0;
            while (i5 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i5);
                if (a(childAt, cls, str, list, list2)) {
                    arrayList2.add(childAt);
                    if (z2) {
                        return;
                    }
                    if (z10) {
                        d(childAt, cls, str, z2, z10, list, list2, arrayList2);
                    }
                } else {
                    d(childAt, cls, str, z2, z10, list, list2, arrayList2);
                    if (arrayList != null && arrayList.size() > 0 && z2) {
                        return;
                    }
                }
                i5++;
                arrayList2 = arrayList;
            }
        }
    }
}
