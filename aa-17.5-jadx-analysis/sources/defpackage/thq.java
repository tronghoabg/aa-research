package defpackage;

import android.content.Context;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.MessageTemplate;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class thq {
    public static final thq a = new thq();

    public static final CarIcon a(IconCompat iconCompat, afec afecVar) {
        tj tjVar = new tj(iconCompat);
        afecVar.invoke(tjVar);
        return new CarIcon(tjVar);
    }

    public static final MessageTemplate b(CharSequence charSequence, afec afecVar) {
        um umVar = new um(charSequence);
        afecVar.invoke(umVar);
        return umVar.a();
    }

    public static final CarIcon d(Context context, int i, afec afecVar) {
        return a(IconCompat.m(context, i), afecVar);
    }
}
