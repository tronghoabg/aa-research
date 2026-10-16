package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dtq {
    static android.app.Notification.MessagingStyle.Message a(android.app.Notification.MessagingStyle.Message message, java.lang.String str, android.net.Uri uri) {
        return a$.ExternalSyntheticApiModelOutline2.m(message, str, uri);
    }

    public static android.graphics.drawable.Icon b(androidx.core.graphics.drawable.IconCompat iconCompat, android.content.Context context) {
        android.graphics.drawable.Icon iconCreateWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return (android.graphics.drawable.Icon) iconCompat.c;
            case defpackage.abnt.b /* 0 */:
            default:
                throw new java.lang.IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) iconCompat.c);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithResource(iconCompat.o(), iconCompat.f);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.c);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                iconCreateWithBitmap = ep$.ExternalSyntheticApiModelOutline1.m((android.graphics.Bitmap) iconCompat.c);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = bgp$.ExternalSyntheticApiModelOutline0.m(iconCompat.f());
                } else {
                    if (context == null) {
                        android.net.Uri uriF = iconCompat.f();
                        java.util.Objects.toString(uriF);
                        throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(java.lang.String.valueOf(uriF)));
                    }
                    android.net.Uri uriF2 = iconCompat.f();
                    java.lang.String scheme = uriF2.getScheme();
                    java.io.InputStream inputStreamOpenInputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF2);
                        } catch (java.lang.Exception e) {
                            java.util.Objects.toString(uriF2);
                            android.util.Log.w("IconCompat", "Unable to load image from URI: ".concat(java.lang.String.valueOf(uriF2)), e);
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new java.io.FileInputStream(new java.io.File((java.lang.String) iconCompat.c));
                        } catch (java.io.FileNotFoundException e2) {
                            java.util.Objects.toString(uriF2);
                            android.util.Log.w("IconCompat", "Unable to load image from path: ".concat(java.lang.String.valueOf(uriF2)), e2);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        android.net.Uri uriF3 = iconCompat.f();
                        java.util.Objects.toString(uriF3);
                        throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: ".concat(java.lang.String.valueOf(uriF3)));
                    }
                    iconCreateWithBitmap = ep$.ExternalSyntheticApiModelOutline1.m(android.graphics.BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        android.content.res.ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = iconCompat.i;
        if (mode != androidx.core.graphics.drawable.IconCompat.a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static androidx.core.graphics.drawable.IconCompat c(android.content.Context context, android.graphics.drawable.Icon icon) {
        int iD = defpackage.dtr.d(icon);
        if (iD == 2) {
            java.lang.String strF = defpackage.dtr.f(icon);
            try {
                return androidx.core.graphics.drawable.IconCompat.n(androidx.core.graphics.drawable.IconCompat.c(context, strF), strF, defpackage.dtr.c(icon));
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (iD == 4) {
            return androidx.core.graphics.drawable.IconCompat.l(defpackage.dtr.e(icon));
        }
        if (iD == 6) {
            return androidx.core.graphics.drawable.IconCompat.j(defpackage.dtr.e(icon));
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
        iconCompat.c = icon;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat d(java.lang.Object obj) {
        defpackage.ebl.q(obj);
        int iD = defpackage.dtr.d(obj);
        if (iD == 2) {
            return androidx.core.graphics.drawable.IconCompat.n(null, defpackage.dtr.f(obj), defpackage.dtr.c(obj));
        }
        if (iD == 4) {
            return androidx.core.graphics.drawable.IconCompat.l(defpackage.dtr.e(obj));
        }
        if (iD == 6) {
            return androidx.core.graphics.drawable.IconCompat.j(defpackage.dtr.e(obj));
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
        iconCompat.c = obj;
        return iconCompat;
    }

    public static eju e(java.lang.Object obj, long j) {
        return (eju) eln.f(obj, j);
    }

    public static final java.util.List f(java.lang.Object obj, long j) {
        eju ejuVarE = e(obj, j);
        if (ejuVarE.c()) {
            return ejuVarE;
        }
        int size = ejuVarE.size();
        eju ejuVarD = ejuVarE.d(size == 0 ? 10 : size + size);
        eln.r(obj, j, ejuVarD);
        return ejuVarD;
    }
}
