package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.bubble.CheckableImageButton;

/* loaded from: classes2.dex */
public final class fuc extends dzp {
    final /* synthetic */ CheckableImageButton a;

    public fuc(CheckableImageButton checkableImageButton) {
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
        edgVar.p(true);
        edgVar.q(this.a.a);
    }
}
