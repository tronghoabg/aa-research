package R7;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import l1.C3373c;
import l1.C3375e;
import t1.AbstractC4073b;

/* loaded from: classes4.dex */
public final class d extends AbstractC4073b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f10375q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f10375q = chip;
    }

    @Override // t1.AbstractC4073b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f26869w;
        Chip chip = this.f10375q;
        if (!chip.c() || (fVar = chip.f26872e) == null || !fVar.f10392K || chip.f26875h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // t1.AbstractC4073b
    public final void o(int i5, C3375e c3375e) {
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        if (i5 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f26869w);
            return;
        }
        Chip chip = this.f10375q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c3375e.b(C3373c.f39848e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
