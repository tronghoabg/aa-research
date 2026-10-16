package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class fyv extends LinearLayout {
    public /* synthetic */ fyv(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public abstract void a(geu geuVar, CarText carText, Action action, List list);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fyv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fyv(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fyv(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
