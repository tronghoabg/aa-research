package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: q.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3809e0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C3811f0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
