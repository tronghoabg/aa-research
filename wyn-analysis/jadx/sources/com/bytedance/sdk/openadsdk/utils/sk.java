package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class sk {

    public interface oa {
        void oa();

        void uef();

        void uef(View view, boolean z2);

        void uef(boolean z2);
    }

    public class uef implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: oa, reason: collision with root package name */
        final /* synthetic */ ViewGroup f26164oa;
        View uef = null;
        final /* synthetic */ boolean yo;

        public uef(ViewGroup viewGroup, boolean z2) {
            this.f26164oa = viewGroup;
            this.yo = z2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                oa oaVar = (oa) this.f26164oa.getTag(520093765);
                if (this.uef == null) {
                    ViewGroup viewGroup = this.f26164oa;
                    sk.oa(viewGroup, oaVar, (Integer) viewGroup.getTag(520093766), this.yo);
                    return;
                }
                Rect rect = new Rect();
                this.uef.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f26164oa.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (oaVar != null) {
                        oaVar.uef(this.f26164oa, false);
                    }
                    this.f26164oa.setTag(520093763, Boolean.FALSE);
                } else {
                    if (oaVar != null) {
                        oaVar.uef(this.f26164oa, true);
                    }
                    this.f26164oa.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e7) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f26164oa.getTag(520093765), "ViewUtils", e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(View view, oa oaVar, Integer num, boolean z2) {
        if (oaVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        oaVar.uef(view, uef(view, num.intValue(), z2));
    }

    public static void uef(final ViewGroup viewGroup, boolean z2, int i5, final boolean z10, oa oaVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, oaVar);
        viewGroup.setTag(520093766, Integer.valueOf(i5));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final uef uefVar = new uef(viewGroup, z10);
        if (list != null && list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.get(i10).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.sk.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        uefVar.uef = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        uefVar.uef = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(uefVar);
        if (z2) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.sk.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        oa oaVar2 = (oa) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        sk.oa(viewGroup2, oaVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    } catch (Exception e7) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e7);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.sk.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z11) {
                try {
                    oa oaVar2 = (oa) viewGroup.getTag(520093765);
                    if (oaVar2 != null) {
                        oaVar2.uef(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        sk.oa(viewGroup2, oaVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    }
                } catch (Exception e7) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e7);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.sk.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                oa oaVar2 = (oa) viewGroup.getTag(520093765);
                if (oaVar2 != null) {
                    oaVar2.uef();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                oa oaVar2 = (oa) viewGroup.getTag(520093765);
                if (oaVar2 != null) {
                    oaVar2.oa();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean uef(View view, int i5, boolean z2) {
        return com.bytedance.sdk.openadsdk.core.km.uef(view, 20, i5, z2);
    }

    public static ArrayList<View> uef(View view, int i5) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i5 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i5 > 1 && parent != null) {
                arrayList.addAll(uef((View) parent, i5 - 1));
            }
        }
        return arrayList;
    }

    public static View uef(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return uef((View) parent, cls);
    }
}
