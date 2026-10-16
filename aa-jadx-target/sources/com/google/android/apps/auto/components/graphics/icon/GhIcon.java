package com.google.android.apps.auto.components.graphics.icon;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class GhIcon implements android.os.Parcelable {
    public final int b;
    public int c;
    public android.content.res.ColorStateList d;
    public android.graphics.PorterDuff.Mode e;
    public java.lang.String f;
    private java.lang.Object g;
    private int h;
    static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public static final android.os.Parcelable.Creator<com.google.android.apps.auto.components.graphics.icon.GhIcon> CREATOR = new defpackage.ea(6);

    public GhIcon(android.os.Parcel parcel) {
        android.graphics.PorterDuff.Mode mode;
        this(parcel.readInt());
        switch (this.b) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                this.g = android.graphics.Bitmap.CREATOR.createFromParcel(parcel);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.String string = parcel.readString();
                int i = parcel.readInt();
                this.f = string;
                this.h = i;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i2 = parcel.readInt();
                byte[] bArr = new byte[i2];
                parcel.readByteArray(bArr);
                this.h = i2;
                this.g = bArr;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.f = parcel.readString();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 10:
                android.os.Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
                parcelable.getClass();
                this.g = parcelable;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            default:
                throw new java.lang.RuntimeException("invalid " + getClass().getSimpleName() + " type in parcel: " + this.b);
        }
        if (parcel.readInt() == 1) {
            this.d = (android.content.res.ColorStateList) android.content.res.ColorStateList.CREATOR.createFromParcel(parcel);
        }
        switch (parcel.readInt()) {
            case 1:
                mode = android.graphics.PorterDuff.Mode.SRC;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                mode = android.graphics.PorterDuff.Mode.DST;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                mode = android.graphics.PorterDuff.Mode.SRC_OVER;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                mode = android.graphics.PorterDuff.Mode.DST_OVER;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                mode = android.graphics.PorterDuff.Mode.SRC_IN;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                mode = android.graphics.PorterDuff.Mode.DST_IN;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                mode = android.graphics.PorterDuff.Mode.SRC_OUT;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                mode = android.graphics.PorterDuff.Mode.DST_OUT;
                break;
            case 9:
                mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
                break;
            case 10:
                mode = android.graphics.PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = android.graphics.PorterDuff.Mode.XOR;
                break;
            case 12:
                mode = android.graphics.PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = android.graphics.PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = android.graphics.PorterDuff.Mode.OVERLAY;
                break;
            case 16:
                mode = android.graphics.PorterDuff.Mode.DARKEN;
                break;
            case 17:
                mode = android.graphics.PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = android.graphics.PorterDuff.Mode.CLEAR;
                break;
        }
        this.e = mode;
    }

    private final byte[] A() {
        byte[] bArr;
        if (this.b != 3) {
            throw new java.lang.IllegalStateException("called getDataBytes() on ".concat(toString()));
        }
        synchronized (this) {
            bArr = (byte[]) this.g;
        }
        return bArr;
    }

    private final void B() {
        if (this.b != 3) {
            throw new java.lang.IllegalStateException("called getDataOffset() on ".concat(toString()));
        }
        synchronized (this) {
        }
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon j(android.content.ComponentName componentName) {
        if (componentName == null) {
            throw new java.lang.IllegalArgumentException("ComponentName must not be null");
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(6);
        ghIcon.g = componentName;
        return ghIcon;
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon k(android.graphics.drawable.Icon icon) {
        if (icon == null) {
            throw new java.lang.IllegalArgumentException("Icon must not be null");
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(9);
        ghIcon.g = icon;
        return ghIcon;
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon l(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.IllegalArgumentException("Bitmap must not be null.");
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(1);
        ghIcon.g = bitmap;
        return ghIcon;
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon m(androidx.car.app.model.CarIcon carIcon, android.content.ComponentName componentName) {
        int type = carIcon.getType();
        if (type != 1) {
            return type != 5 ? new com.google.android.apps.auto.components.graphics.icon.GhIcon(8) : j(componentName);
        }
        androidx.core.graphics.drawable.IconCompat icon = carIcon.getIcon();
        return icon == null ? new com.google.android.apps.auto.components.graphics.icon.GhIcon(8) : o(icon);
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon n(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.IllegalArgumentException("Bitmap must not be null.");
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(7);
        ghIcon.g = bitmap;
        return ghIcon;
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon o(androidx.core.graphics.drawable.IconCompat iconCompat) {
        int length;
        int iB = iconCompat.b();
        if (iB == 2) {
            return r(iconCompat.o(), iconCompat.a());
        }
        if (iB != 3) {
            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(10);
            ghIcon.g = iconCompat;
            return ghIcon;
        }
        byte[] bArr = iconCompat.d;
        if (bArr == null || (length = bArr.length) <= 0) {
            return new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2 = new com.google.android.apps.auto.components.graphics.icon.GhIcon(3);
        ghIcon2.g = bArr;
        ghIcon2.h = length;
        return ghIcon2;
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon p(android.content.Context context, int i) {
        return r(context.getPackageName(), i);
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon q(android.content.res.Resources resources, int i) {
        if (resources != null) {
            return r(resources.getResourcePackageName(i), i);
        }
        throw new java.lang.IllegalArgumentException("Resource must not be null.");
    }

    public static com.google.android.apps.auto.components.graphics.icon.GhIcon r(java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Resource package name must not be null.");
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = new com.google.android.apps.auto.components.graphics.icon.GhIcon(2);
        ghIcon.h = i;
        ghIcon.f = str;
        return ghIcon;
    }

    private final int w() {
        int i;
        if (this.b != 3) {
            throw new java.lang.IllegalStateException("called getDataLength() on ".concat(toString()));
        }
        synchronized (this) {
            i = this.h;
        }
        return i;
    }

    private final android.content.res.Resources x() {
        if (this.b == 2) {
            return (android.content.res.Resources) this.g;
        }
        throw new java.lang.IllegalStateException("called getResources() on ".concat(toString()));
    }

    private final androidx.core.graphics.drawable.IconCompat y() {
        if (this.b == 10) {
            return (androidx.core.graphics.drawable.IconCompat) this.g;
        }
        throw new java.lang.IllegalStateException("called getIconCompat() on ".concat(toString()));
    }

    private final java.lang.String z() {
        if (this.b != 4) {
            throw new java.lang.IllegalStateException("called getUriString() on ".concat(toString()));
        }
        java.lang.String str = this.f;
        str.getClass();
        return str;
    }

    public final int a() {
        if (this.b == 2) {
            return this.h;
        }
        throw new java.lang.IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        int iHashCode = 0;
        int iHash = j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(i), this.d, java.lang.Integer.valueOf(this.c), this.e}) * 31;
        switch (i) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                iHashCode = e().hashCode();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                iHashCode = j$.util.Objects.hash(new java.lang.Object[]{s(), java.lang.Integer.valueOf(a())});
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(w());
                B();
                iHashCode = j$.util.Objects.hash(new java.lang.Object[]{numValueOf, 0, java.lang.Integer.valueOf(java.util.Arrays.hashCode(A()))});
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                iHashCode = z().hashCode();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                iHashCode = c().hashCode();
                break;
            case 9:
                iHashCode = g().hashCode();
                break;
            case 10:
                iHashCode = y().hashCode();
                break;
        }
        return iHash + iHashCode;
    }

    public final android.content.ComponentName c() {
        if (this.b == 6) {
            return (android.content.ComponentName) this.g;
        }
        throw new java.lang.IllegalStateException("called getAppIconComponentName() on ".concat(toString()));
    }

    public final android.content.res.ColorStateList d(android.content.Context context) {
        android.content.res.ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            return colorStateList;
        }
        int i = this.c;
        if (i != -1) {
            return defpackage.duw.d(context, i);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = this.b;
        return (i == 1 || i == 5 || i == 7 || i == 3) ? 1 : 0;
    }

    public final android.graphics.Bitmap e() {
        int i = this.b;
        if (i == 1 || i == 5 || i == 7) {
            return (android.graphics.Bitmap) this.g;
        }
        throw new java.lang.IllegalStateException("called getBitmap() on ".concat(toString()));
    }

    public final android.graphics.drawable.Drawable f(android.content.Context context, int i) {
        android.graphics.Bitmap bitmapB;
        java.io.InputStream inputStreamOpenInputStream;
        int i2 = this.b;
        android.graphics.drawable.Drawable bitmapDrawable = null;
        switch (i2) {
            case 1:
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), e());
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (x() != null) {
                    bitmapDrawable = x().getDrawableForDensity(a(), context.getResources().getDisplayMetrics().densityDpi, context.getTheme());
                } else {
                    java.lang.String strS = s();
                    if (android.text.TextUtils.isEmpty(strS)) {
                        strS = context.getPackageName();
                    }
                    if (!"android".equals(strS)) {
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        try {
                            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strS, 8192);
                            if (android.os.Build.VERSION.SDK_INT >= 31) {
                                this.g = a$.ExternalSyntheticApiModelOutline0.m(packageManager, applicationInfo, context.getResources().getConfiguration());
                            } else {
                                android.content.res.Resources resourcesForApplication = packageManager.getResourcesForApplication(strS);
                                resourcesForApplication.updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
                                this.g = resourcesForApplication;
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                            android.util.Log.e("GH.GhIcon", java.lang.String.format("Unable to find pkg=%s for icon %s", strS, this), e);
                        }
                    } else {
                        this.g = android.content.res.Resources.getSystem();
                    }
                    try {
                        bitmapDrawable = x().getDrawableForDensity(a(), context.getResources().getDisplayMetrics().densityDpi, context.getTheme());
                    } catch (java.lang.RuntimeException e2) {
                        android.util.Log.e("GH.GhIcon", java.lang.String.format("Unable to load resource 0x%08x from pkg=%s", java.lang.Integer.valueOf(a()), s()), e2);
                    }
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.res.Resources resources = context.getResources();
                byte[] bArrA = A();
                B();
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, android.graphics.BitmapFactory.decodeByteArray(bArrA, 0, w()));
                if (i > 1 && bitmapDrawable.getIntrinsicWidth() > 0 && bitmapDrawable.getIntrinsicHeight() > 0 && (bitmapB = defpackage.kfn.b(bitmapDrawable, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight())) != null) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), defpackage.kfn.c(bitmapB, i));
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.net.Uri uriH = h();
                java.lang.String scheme = uriH.getScheme();
                if ("content".equals(scheme) || "file".equals(scheme)) {
                    try {
                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriH);
                    } catch (java.lang.Exception e3) {
                        android.util.Log.w("GH.GhIcon", "Unable to load image from URI: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriH))), e3);
                        inputStreamOpenInputStream = null;
                    }
                } else {
                    try {
                        inputStreamOpenInputStream = new java.io.FileInputStream(z());
                    } catch (java.io.FileNotFoundException e4) {
                        android.util.Log.w("GH.GhIcon", "Unable to load image from path: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriH))), e4);
                        inputStreamOpenInputStream = null;
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), defpackage.kfn.c(android.graphics.BitmapFactory.decodeStream(inputStreamOpenInputStream), i));
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                bitmapDrawable = new android.graphics.drawable.AdaptiveIconDrawable(null, new android.graphics.drawable.BitmapDrawable(context.getResources(), e()));
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), defpackage.lfy.e(context).c(context, c(), i));
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                bitmapDrawable = new lgf(context.getResources(), e());
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                bitmapDrawable = new android.graphics.drawable.ColorDrawable(0);
                break;
            case 9:
                bitmapDrawable = g().loadDrawable(context);
                break;
            case 10:
                bitmapDrawable = y().e(context);
                break;
            default:
                throw new java.lang.IllegalArgumentException("Unknown iconType: " + i2);
        }
        if (bitmapDrawable != null && (this.c != -1 || this.d != null || this.e != a)) {
            bitmapDrawable.mutate();
            bitmapDrawable.setTintList(this.c != -1 ? context.getResources().getColorStateList(this.c) : this.d);
            bitmapDrawable.setTintMode(this.e);
        }
        return bitmapDrawable;
    }

    public final android.graphics.drawable.Icon g() {
        if (this.b == 9) {
            return (android.graphics.drawable.Icon) this.g;
        }
        throw new java.lang.IllegalStateException("called getPlatformIcon() on ".concat(toString()));
    }

    public final android.net.Uri h() {
        return android.net.Uri.parse(z());
    }

    public final androidx.car.app.model.CarIcon i(android.content.Context context, int i) {
        switch (this.b) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.k(e())));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.m(context.createPackageContext(s(), 0), a())));
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalStateException("Invalid package for resource", e);
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return androidx.car.app.model.CarIcon.ERROR;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.l(h())));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.k(defpackage.lfy.e(context).c(context, c(), i))));
            case 9:
                return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.i(context, g())));
            case 10:
                return new androidx.car.app.model.CarIcon(new defpackage.to(y()));
        }
    }

    public final java.lang.String s() {
        if (this.b != 2) {
            throw new java.lang.IllegalStateException("called getResPackage() on ".concat(toString()));
        }
        java.lang.String str = this.f;
        str.getClass();
        return str;
    }

    public final boolean t() {
        return (this.c == -1 && this.d == null && this.e == a) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        int i = this.b;
        switch (i) {
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
                str = "APP_ICON";
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "CIRCLE_BITMAP";
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                str = "EMPTY";
                break;
            case 9:
                str = "PLATFORM_ICON";
                break;
            case 10:
                str = "ICON_COMPAT";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (i) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                sb.append(" size=");
                sb.append(e().getWidth());
                sb.append("x");
                sb.append(e().getHeight());
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(s());
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(a())));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(w());
                B();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                sb.append(" uri=");
                sb.append(z());
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" componentName=");
                sb.append(c());
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                sb.append(" icon=");
                sb.append(g());
                break;
            case 10:
                sb.append(" iconCompat=");
                sb.append(y());
                break;
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unknown iconType: "));
        }
        if (this.d != null) {
            sb.append(" tint=");
            sb.append(this.d);
        }
        if (this.e != a) {
            sb.append(" mode=");
            sb.append(this.e);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0 A[RETURN] */
    public final boolean u(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon) {
        int i;
        if (ghIcon == this) {
            return true;
        }
        if (ghIcon == null || (i = this.b) != ghIcon.b || !j$.util.Objects.equals(this.d, ghIcon.d) || this.c != ghIcon.c || this.e != ghIcon.e) {
            return false;
        }
        switch (i) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                if (e() == ghIcon.e()) {
                    return true;
                }
                return false;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (a() == ghIcon.a() && j$.util.Objects.equals(s(), ghIcon.s())) {
                    return true;
                }
                return false;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (w() == ghIcon.w()) {
                    B();
                    ghIcon.B();
                    if (java.util.Arrays.equals(A(), ghIcon.A())) {
                        return true;
                    }
                }
                return false;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return j$.util.Objects.equals(z(), ghIcon.z());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.util.Objects.equals(c(), ghIcon.c());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return true;
            case 9:
                return j$.util.Objects.equals(g(), ghIcon.g);
            case 10:
                return j$.util.Objects.equals(y(), ghIcon.g);
            default:
                return false;
        }
    }

    public final void v() {
        this.d = android.content.res.ColorStateList.valueOf(-16777216);
        this.c = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.b;
        parcel.writeInt(i2);
        int i3 = 0;
        switch (i2) {
            case 1:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                e().writeToParcel(parcel, i);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                parcel.writeString(s());
                parcel.writeInt(a());
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                parcel.writeInt(w());
                byte[] bArrA = A();
                B();
                B();
                parcel.writeByteArray(java.util.Arrays.copyOfRange(bArrA, 0, w()));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                parcel.writeString(z());
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.writeParcelable(c(), 0);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                parcel.writeParcelable(g(), 0);
                break;
            case 10:
                parcel.writeParcelable(y().e, 0);
                break;
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i2, "Unknown type: "));
        }
        android.content.res.ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorStateList.writeToParcel(parcel, i);
        }
        switch (lgh.a[this.e.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i3 = 2;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 3;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i3 = 4;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i3 = 5;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i3 = 6;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i3 = 7;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                i3 = 8;
                break;
            case 9:
                i3 = 9;
                break;
            case 10:
                i3 = 10;
                break;
            case 11:
                i3 = 11;
                break;
            case 12:
                i3 = 16;
                break;
            case 13:
                i3 = 17;
                break;
            case 14:
                i3 = 13;
                break;
            case 15:
                i3 = 14;
                break;
            case 16:
                i3 = 12;
                break;
            case 17:
                i3 = 15;
                break;
        }
        parcel.writeInt(i3);
    }

    public GhIcon(int i) {
        this.c = -1;
        this.e = a;
        this.b = i;
    }
}
