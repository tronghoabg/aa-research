package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public int b;
    public java.lang.Object c;
    public byte[] d;
    public android.os.Parcelable e;
    public int f;
    public int g;
    public android.content.res.ColorStateList h;
    public android.graphics.PorterDuff.Mode i;
    public java.lang.String j;
    public java.lang.String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static android.content.res.Resources c(android.content.Context context, java.lang.String str) {
        if ("android".equals(str)) {
            return android.content.res.Resources.getSystem();
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("IconCompat", java.lang.String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat h(android.os.Bundle bundle) {
        int i = bundle.getInt("type");
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (android.content.res.ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = android.graphics.PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case defpackage.abnt.b /* 0 */:
            default:
                android.util.Log.w("IconCompat", defpackage.a.bo(i, "Unknown type "));
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat i(android.content.Context context, android.graphics.drawable.Icon icon) {
        defpackage.ebl.q(icon);
        return defpackage.dtq.c(context, icon);
    }

    public static androidx.core.graphics.drawable.IconCompat j(android.net.Uri uri) {
        defpackage.ebl.s(uri);
        java.lang.String string = uri.toString();
        defpackage.ebl.s(string);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(6);
        iconCompat.c = string;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat k(android.graphics.Bitmap bitmap) {
        defpackage.ebl.s(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat l(android.net.Uri uri) {
        defpackage.ebl.s(uri);
        java.lang.String string = uri.toString();
        defpackage.ebl.s(string);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
        iconCompat.c = string;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat m(android.content.Context context, int i) {
        defpackage.ebl.s(context);
        return n(context.getResources(), context.getPackageName(), i);
    }

    public static androidx.core.graphics.drawable.IconCompat n(android.content.res.Resources resources, java.lang.String str, int i) {
        defpackage.ebl.s(str);
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f = i;
        if (resources != null) {
            try {
                iconCompat.c = resources.getResourceName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.c = str;
        }
        iconCompat.k = str;
        return iconCompat;
    }

    public final int a() {
        int i = this.b;
        if (i == -1) {
            return defpackage.dtr.c(this.c);
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new java.lang.IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        return i == -1 ? defpackage.dtr.d(this.c) : i;
    }

    public final android.graphics.Bitmap d() {
        int i = this.b;
        if (i == -1) {
            java.lang.Object obj = this.c;
            if (obj instanceof android.graphics.Bitmap) {
                return (android.graphics.Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (android.graphics.Bitmap) this.c;
        }
        if (i != 5) {
            toString();
            throw new java.lang.IllegalStateException("called getBitmap() on ".concat(toString()));
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.c;
        int iMin = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        paint.setColor(0);
        float f = iMin;
        float f2 = 0.010416667f * f;
        paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
        float f3 = f * 0.5f;
        float f4 = 0.9166667f * f3;
        canvas.drawCircle(f3, f3, f4, paint);
        paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
        canvas.drawCircle(f3, f3, f4, paint);
        paint.clearShadowLayer();
        paint.setColor(-16777216);
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public final android.graphics.drawable.Drawable e(android.content.Context context) {
        java.lang.Object obj;
        if (this.b == 2 && (obj = this.c) != null) {
            java.lang.String str = (java.lang.String) obj;
            if (str.contains(":")) {
                java.lang.String str2 = str.split(":", -1)[1];
                java.lang.String str3 = str2.split("/", -1)[0];
                java.lang.String str4 = str2.split("/", -1)[1];
                java.lang.String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    android.util.Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    java.lang.String strO = o();
                    int identifier = c(context, strO).getIdentifier(str4, str3, str5);
                    if (this.f != identifier) {
                        android.util.Log.i("IconCompat", defpackage.a.bL(str, strO, "Id has changed for ", " "));
                        this.f = identifier;
                    }
                }
            }
        }
        return defpackage.dtq.b(this, context).loadDrawable(context);
    }

    public final android.net.Uri f() {
        int i = this.b;
        if (i == -1) {
            return defpackage.dtr.e(this.c);
        }
        if (i == 4 || i == 6) {
            return android.net.Uri.parse((java.lang.String) this.c);
        }
        toString();
        throw new java.lang.IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final android.os.Bundle g() {
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.b) {
            case -1:
                bundle.putParcelable("obj", (android.os.Parcelable) this.c);
                break;
            case defpackage.abnt.b /* 0 */:
            default:
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                bundle.putParcelable("obj", (android.graphics.Bitmap) this.c);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                bundle.putString("obj", (java.lang.String) this.c);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.putByteArray("obj", (byte[]) this.c);
                break;
        }
        bundle.putInt("type", this.b);
        bundle.putInt("int1", this.f);
        bundle.putInt("int2", this.g);
        bundle.putString("string1", this.k);
        android.content.res.ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.i;
        if (mode != a) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final java.lang.String o() {
        int i = this.b;
        if (i == -1) {
            return defpackage.dtr.f(this.c);
        }
        if (i == 2) {
            java.lang.String str = this.k;
            return (str == null || android.text.TextUtils.isEmpty(str)) ? ((java.lang.String) this.c).split(":", -1)[0] : this.k;
        }
        toString();
        throw new java.lang.IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final void p(int i) {
        this.h = android.content.res.ColorStateList.valueOf(i);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.b == -1) {
            return java.lang.String.valueOf(this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.c).getHeight());
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(a())));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
