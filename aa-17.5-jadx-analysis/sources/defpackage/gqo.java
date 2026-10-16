package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class gqo {
    private static final yob p = yob.c("com/android/car/libraries/apphost/media/SharedMediaModelProvider");
    public final geu a;
    public final ggk b;
    public final boolean c;
    public final gqb d;
    public final aiyk e;
    public final aiyk f;
    public final aiyk g;
    public final aiyk h;
    public final aiyk i;
    public final aiyk j;
    public final aiyk k;
    public final aiyk l;
    public final aiyk m;
    public final aiyk n;
    public final usw o;
    private final String q;

    public gqo(geu geuVar) {
        this.a = geuVar;
        ggk ggkVar = (ggk) geuVar.F(ggk.class);
        this.b = ggkVar;
        this.c = ggkVar.f();
        gqb gqbVar = (gqb) geuVar.F(gqb.class);
        this.d = gqbVar;
        usw uswVarD = gqbVar.d();
        this.o = uswVarD;
        String packageName = ((gmh) geuVar.d()).a.getPackageName();
        packageName.getClass();
        this.q = packageName;
        aiyk jycVar = !ggkVar.z(packageName) ? new jyc(dtx.m((eqj) uswVarD.i), dtx.m(eqy.b(((ltn) uswVarD.g).f, new jxa(3))), new gon(this, (afck) null, 2), 5) : new aiyb(new gqn((afck) null, 1, (byte[]) null));
        this.e = jycVar;
        aiyk fmnVar = !ggkVar.z(packageName) ? new fmn(jycVar, 7) : new aiyb(new gqn(null, 0));
        this.f = fmnVar;
        this.g = new jyc(dtx.m((eqj) uswVarD.d), fmnVar, new gra(this, (afck) null, 1), 5);
        this.h = new fuu(dtx.m((eqj) uswVarD.b), this, 5);
        this.i = new fuu(dtx.m((eqj) uswVarD.f), this, 6);
        this.j = new fuu(dtx.m((eqj) uswVarD.c), this, 7);
        this.k = new fuu(aiyr.a(dtx.m((eqj) uswVarD.a)), this, 8);
        this.l = new fuu(aiyr.a(dtx.m(uswVarD.d())), this, 9);
        this.m = new fuu(dtx.m((eqj) uswVarD.i), this, 10);
        this.n = new jyc(dtx.m(uswVarD.c()), dtx.m(uswVarD.a()), new gqx((afck) null, 1, (byte[]) null), 5);
    }

    private static final int b(int i) {
        if (i > 128 || i <= 0) {
            return 128;
        }
        return i;
    }

    public final Object a(CarIcon carIcon) {
        IconCompat icon;
        if (carIcon != null && (icon = carIcon.getIcon()) != null) {
            if (icon.b() != 1 && icon.b() != 5) {
                try {
                    Drawable drawableE = icon.e(this.a);
                    if (drawableE == null) {
                        return null;
                    }
                    if (drawableE instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawableE;
                        if (bitmapDrawable.getBitmap() != null) {
                            Bitmap bitmap = bitmapDrawable.getBitmap();
                            if (!bitmap.isRecycled()) {
                                return bitmap;
                            }
                            ((ynz) p.h().ai(71)).u("Ignored artwork BitmapDrawable because its bitmap is recycled.");
                            return null;
                        }
                    }
                    return dti.e(drawableE, b(drawableE.getIntrinsicWidth()), b(drawableE.getIntrinsicHeight()), 4);
                } catch (Exception e) {
                    ((ynz) ((ynz) p.h()).p(e).ai(70)).y("Failed to resolve artwork bitmap for package %s", this.q);
                    return null;
                } catch (OutOfMemoryError e2) {
                    ((ynz) ((ynz) p.h()).p(e2).ai(69)).y("OOM while resolving artwork bitmap for package %s", this.q);
                    return null;
                }
            }
            Bitmap bitmapD = icon.d();
            if (bitmapD != null && bitmapD.isRecycled()) {
                ((ynz) p.h().ai(68)).u("Ignored artwork CarIcon because its bitmap has been recycled.");
            }
            if (bitmapD != null && !bitmapD.isRecycled()) {
                return bitmapD;
            }
        }
        return null;
    }
}
