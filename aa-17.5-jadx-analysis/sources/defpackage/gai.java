package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gai {
    private static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/image/model/LazyIconInternalModelKt");

    public static /* synthetic */ gag a(CarIcon carIcon, geu geuVar, ghw ghwVar, ghv ghvVar, CarColor carColor, int i) {
        gag galVar;
        gag gajVar;
        Bitmap bitmapD;
        if ((i & 2) != 0) {
            ghwVar = ghw.a;
        }
        if ((i & 4) != 0) {
            ghvVar = ghv.a;
            ghvVar.getClass();
        }
        if ((i & 8) != 0) {
            carColor = null;
        }
        ghwVar.getClass();
        ghvVar.getClass();
        int i2 = 4;
        int i3 = 1;
        int i4 = 2;
        switch (carIcon.getType()) {
            case 1:
                ghwVar.a(carIcon);
                if (carColor == null) {
                    carColor = ghvVar.a(carIcon.getTint());
                }
                IconCompat icon = carIcon.getIcon();
                if (icon == null) {
                    throw new IllegalStateException("Icon is validated to be non-null, yet returned null");
                }
                if (icon.b() == 1) {
                    if (((ggk) geuVar.F(ggk.class)).E() && (bitmapD = icon.d()) != null && bitmapD.isRecycled()) {
                        ((ynz) a.h().o(ypi.a, "CarApp.H.Converter").ai(17)).u("Can't load icon since its bitmap has been recycled.");
                        geuVar.k().f(((gmh) geuVar.d()).a);
                        gajVar = new gaj("Can't load icon from [" + ((gmh) geuVar.d()).a + "] because its bitmap has been recycled.");
                    } else {
                        Context contextA = geuVar.a();
                        if (contextA == null) {
                            gajVar = new gaj("It seems like package [" + ((gmh) geuVar.d()).a + "] doesn't exist.");
                        } else {
                            Bitmap bitmapD2 = icon.d();
                            if (bitmapD2 != null) {
                                Resources resources = contextA.getResources();
                                resources.getClass();
                                galVar = new gaf(bitmapD2, resources, carColor);
                            } else {
                                gajVar = new gaj("Failed to load icon from [" + ((gmh) geuVar.d()).a + "]. Icon said it was a bitmap, but it wasn't!");
                            }
                        }
                    }
                    galVar = gajVar;
                } else if (icon.b() == 2) {
                    String strO = icon.o();
                    String str = String.format("android.resource://%s/%s", Arrays.copyOf(new Object[]{strO, Integer.valueOf(icon.a())}, 2));
                    str.getClass();
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    strO.getClass();
                    galVar = new gal(uri, carColor, strO.length() != 0 ? fxi.d(geuVar, strO) : 0, strO);
                } else {
                    if (icon.b() != 4) {
                        throw new IllegalStateException("Icon was validated, but it's not a bitmap, resource, or uri.");
                    }
                    Uri uriF = icon.f();
                    String authority = uriF.getAuthority();
                    if (affa.f(uriF.getScheme(), "android.resource") && authority != null && authority.length() != 0) {
                        iD = fxi.d(geuVar, authority);
                    }
                    uriF.getClass();
                    galVar = new gal(uriF, carColor, iD, authority);
                }
                gka.b(galVar, carIcon);
                return galVar;
            case 2:
            default:
                gajVar = new gaj("Unknown CarIcon type [" + carIcon.getType() + "] in CarIcon [" + carIcon + "] from [" + ((gmh) geuVar.d()).a + "]");
                galVar = gajVar;
                gka.b(galVar, carIcon);
                return galVar;
            case 3:
                galVar = b(geuVar, new gah(i3));
                gka.b(galVar, carIcon);
                return galVar;
            case 4:
                galVar = b(geuVar, new ewc(20));
                gka.b(galVar, carIcon);
                return galVar;
            case 5:
                gajVar = new gae(geuVar.d().b());
                galVar = gajVar;
                gka.b(galVar, carIcon);
                return galVar;
            case 6:
                galVar = b(geuVar, new gah(i4));
                gka.b(galVar, carIcon);
                return galVar;
            case 7:
                galVar = b(geuVar, new gah(i2));
                gka.b(galVar, carIcon);
                return galVar;
            case 8:
                galVar = b(geuVar, new gah(iD));
                gka.b(galVar, carIcon);
                return galVar;
            case 9:
                if (!geuVar.d().f() && !geuVar.d().e()) {
                    galVar = b(geuVar, new gah(3));
                    gka.b(galVar, carIcon);
                    return galVar;
                }
                if (carColor == null) {
                    carColor = carIcon.getTint();
                }
                gajVar = new gak(geuVar, carColor);
                galVar = gajVar;
                gka.b(galVar, carIcon);
                return galVar;
        }
    }

    private static final gal b(geu geuVar, afec afecVar) {
        String packageName = geuVar.getPackageName();
        kdg kdgVarU = geuVar.u();
        kdgVarU.getClass();
        String str = String.format("android.resource://%s/%s", Arrays.copyOf(new Object[]{packageName, afecVar.invoke(kdgVarU)}, 2));
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        return new gal(uri, null, 0, null);
    }
}
