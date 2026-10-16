package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class kdx extends FrameLayout {
    public kdx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.markerAppearance);
    }

    public abstract hif a();

    public abstract void c(boolean z, boolean z2);

    public abstract void d(geu geuVar, List list, int i, hie hieVar);

    public abstract void e();

    public abstract boolean f();

    public kdx(Context context) {
        this(context, null);
    }

    public kdx(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public kdx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
