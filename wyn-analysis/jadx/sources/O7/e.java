package O7;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.wynauto.wyn.R;
import k1.C3115b;
import l1.C3375e;

/* loaded from: classes4.dex */
public final class e extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8911e;

    public /* synthetic */ e(Object obj, int i5) {
        this.f8910d = i5;
        this.f8911e = obj;
    }

    @Override // k1.C3115b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f8910d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f8911e).f26973d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        int i5;
        Object obj = this.f8911e;
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        switch (this.f8910d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int i10 = MaterialButtonToggleGroup.k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i5 = 0;
                    for (int i11 = 0; i11 < materialButtonToggleGroup.getChildCount(); i11++) {
                        if (materialButtonToggleGroup.getChildAt(i11) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.c(i11)) {
                                i5++;
                            }
                        }
                    }
                    i5 = -1;
                } else {
                    i5 = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i5, 1, false, ((MaterialButton) view).f26855o));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c3375e.f39862a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f26974e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f26973d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c3375e.f39862a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f26984x);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c3375e.f39862a);
                k kVar = (k) obj;
                c3375e.l(kVar.f26925l.getVisibility() == 0 ? kVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
