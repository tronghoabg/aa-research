package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes3.dex */
public class tkb extends tju {
    private final Context b;
    private final Integer c;

    public tkb(Context context, tjy tjyVar, Integer num) {
        super(tjyVar);
        this.b = context;
        this.c = num;
    }

    @Override // defpackage.tjy
    public final IconCompat b(Object obj) {
        Bitmap bitmapE;
        IconCompat iconCompatB = this.a.b(obj);
        Drawable drawableE = iconCompatB.e(this.b);
        if (drawableE == null) {
            Objects.toString(obj);
            throw new IllegalStateException("Could not load drawable for ".concat(String.valueOf(obj)));
        }
        Drawable drawableE2 = e(drawableE);
        if (iconCompatB.b() == 2) {
            Integer num = this.c;
            bitmapE = dti.d(drawableE2, num.intValue(), num.intValue());
        } else {
            bitmapE = dti.e(drawableE2, 0, 0, 7);
        }
        while (true) {
            Integer num2 = this.c;
            if (bitmapE.getWidth() == num2.intValue()) {
                return IconCompat.k(bitmapE);
            }
            int iMax = Math.max(bitmapE.getWidth() / 2, num2.intValue());
            bitmapE = Bitmap.createScaledBitmap(bitmapE, iMax, iMax, true);
            bitmapE.getClass();
        }
    }

    protected Drawable e(Drawable drawable) {
        return drawable;
    }
}
