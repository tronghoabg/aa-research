package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class mex {
    public static final yob a = yob.c("com/google/android/apps/auto/components/phone/numbers/NumbersModel");
    public final Context b;
    public final afdr c;
    public final String d;
    public final List e;
    private final int f;
    private final tka g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [kzt] */
    public mex(Context context, int i, kqt kqtVar, afdr afdrVar) {
        Bitmap bitmapE;
        this.b = context;
        this.f = i;
        this.c = afdrVar;
        String str = kqtVar.a;
        str.getClass();
        this.d = str;
        this.g = new tka(context, new tjw(1), i, thg.c(16, context));
        yfq yfqVar = kqtVar.b;
        yfqVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        ynp ynpVarListIterator = yfqVar.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            Object next = ynpVarListIterator.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                woy.bo();
            }
            kqz kqzVar = (kqz) next;
            kqzVar.getClass();
            if (afyh.v(kqzVar.a)) {
                ((ynz) a.h().ai(4820)).y("No number for %s", kqzVar);
            } else {
                String str2 = kqzVar.d;
                if (str2 == null) {
                    bitmapE = null;
                } else if (kqzVar.a()) {
                    Drawable drawable = this.b.getDrawable(R.drawable.ic_phone_vector);
                    drawable.getClass();
                    drawable.setTint(this.b.getResources().getColor(R.color.boardwalk_white, null));
                    int i4 = this.f;
                    bitmapE = dti.e(drawable, i4, i4, 4);
                } else {
                    bitmapE = mcd.A().e(this.b.getPackageManager(), str2);
                }
                kztVar = new kzt(kqzVar.a, kqzVar.b, bitmapE != null ? this.g.b(bitmapE) : null, new has(kqzVar, this, i2, 5));
            }
            if (kztVar != null) {
                arrayList.add(kztVar);
            }
            i2 = i3;
        }
        this.e = arrayList;
    }
}
