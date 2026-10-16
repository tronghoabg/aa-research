package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;

/* loaded from: classes2.dex */
public final class wj {
    public static final wj a = new wj(new ghx((byte[]) null));
    public static final wj b;
    public static final wj c;
    public static final wj d;
    public static final wj e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final wh k;

    static {
        ghx ghxVar = new ghx((byte[]) null);
        ghxVar.d = 0;
        ghxVar.e = false;
        ghxVar.c = 1;
        ghxVar.a = true;
        ghxVar.b = false;
        b = new wj(ghxVar);
        ghx ghxVar2 = new ghx((byte[]) null);
        ghxVar2.d = 2;
        ghxVar2.e = true;
        ghxVar2.c = 2;
        ghxVar2.b = true;
        ghxVar2.a = false;
        c = new wj(ghxVar2);
        ghx ghxVar3 = new ghx((byte[]) null);
        ghxVar3.d = 0;
        ghxVar3.e = true;
        ghxVar3.c = 2;
        ghxVar3.b = true;
        ghxVar3.a = true;
        wj wjVar = new wj(ghxVar3);
        d = wjVar;
        ghx ghxVar4 = new ghx(wjVar);
        ghxVar4.b = true;
        e = new wj(ghxVar4);
    }

    public wj(ghx ghxVar) {
        this.j = ghxVar.a;
        this.f = ghxVar.c;
        this.g = ghxVar.d;
        this.i = ghxVar.b;
        this.h = ghxVar.e;
        this.k = (wh) ghxVar.f;
    }

    public final void a(Row row) {
        if (!this.j && row.getOnClickDelegate() != null) {
            throw new IllegalArgumentException("A click listener is not allowed on the row");
        }
        if (!this.i && row.getToggle() != null) {
            throw new IllegalArgumentException("A toggle is not allowed on the row");
        }
        CarIcon image = row.getImage();
        if (image != null) {
            if (!this.h) {
                throw new IllegalArgumentException("An image is not allowed on the row");
            }
            this.k.a(image);
        }
        int size = row.getTexts().size();
        int i = this.f;
        if (size > i) {
            throw new IllegalArgumentException(a.bp(i, "The number of lines of texts for the row exceeded the supported max of "));
        }
    }
}
