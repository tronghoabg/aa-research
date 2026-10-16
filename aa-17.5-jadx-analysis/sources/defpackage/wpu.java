package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
public final class wpu extends dzp {
    final /* synthetic */ CheckableImageButton a;

    public wpu(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.dzp
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        CheckableImageButton checkableImageButton = this.a;
        edgVar.p(checkableImageButton.b);
        edgVar.q(checkableImageButton.a);
    }
}
