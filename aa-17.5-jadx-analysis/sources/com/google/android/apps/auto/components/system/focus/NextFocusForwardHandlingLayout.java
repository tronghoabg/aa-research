package com.google.android.apps.auto.components.system.focus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor;
import defpackage.afby;
import defpackage.afeu;
import defpackage.afpt;
import defpackage.woy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/google/android/apps/auto/components/system/focus/NextFocusForwardHandlingLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addFocusables", "", "views", "Ljava/util/ArrayList;", "Landroid/view/View;", "direction", "focusableMode", "processChildren", "", "java.com.google.android.apps.auto.components.system.focus_focus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NextFocusForwardHandlingLayout extends FrameLayout {
    public /* synthetic */ NextFocusForwardHandlingLayout(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static final View a(View view, NextFocusForwardHandlingLayout nextFocusForwardHandlingLayout) {
        View viewFindViewById = nextFocusForwardHandlingLayout.findViewById(view.getNextFocusForwardId());
        if (viewFindViewById != null) {
            ViewParent parent = viewFindViewById.getParent();
            FocusInterceptor focusInterceptor = parent instanceof FocusInterceptor ? (FocusInterceptor) parent : null;
            if (focusInterceptor != null) {
                viewFindViewById = focusInterceptor;
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return (viewFindViewById.isFocusable() && viewFindViewById.getVisibility() == 0) ? viewFindViewById : a(viewFindViewById, nextFocusForwardHandlingLayout);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        Object next;
        arrayList.getClass();
        List listCf = woy.cf(arrayList);
        super.addFocusables(arrayList, i, i2);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.removeAll(woy.cl(listCf));
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, a((View) obj, this));
        }
        afby afbyVar = new afby(8);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                afbyVar.put(key, value);
            }
        }
        Map mapE = afbyVar.e();
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!mapE.values().contains((View) next)) {
                    break;
                }
            }
            View view = (View) next;
            if (view == null) {
                throw new IllegalStateException("Some views are unreachable.");
            }
            while (view != null && arrayList2.contains(view)) {
                arrayList3.add(view);
                arrayList2.remove(view);
                view = (View) mapE.get(view);
            }
        }
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(listCf);
        arrayList.addAll(arrayList2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NextFocusForwardHandlingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextFocusForwardHandlingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NextFocusForwardHandlingLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
