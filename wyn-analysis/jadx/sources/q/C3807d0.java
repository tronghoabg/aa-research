package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: q.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3807d0 extends C3805c0 {
    @Override // q.C3805c0, q.AbstractC3809e0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // q.AbstractC3809e0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
