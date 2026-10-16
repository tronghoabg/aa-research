package com.google.android.apps.auto.components.graphics.icon;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.a;
import defpackage.dup;
import defpackage.ea;
import defpackage.lfs;
import defpackage.lgb;
import defpackage.tj;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class GhIcon implements Parcelable {
    public final int b;
    public int c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public String f;
    private Object g;
    private int h;
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public static final Parcelable.Creator<GhIcon> CREATOR = new ea(6);

    public GhIcon(Parcel parcel) {
        PorterDuff.Mode mode;
        this(parcel.readInt());
        switch (this.b) {
            case 1:
            case 5:
            case 7:
                this.g = Bitmap.CREATOR.createFromParcel(parcel);
                break;
            case 2:
                String string = parcel.readString();
                int i = parcel.readInt();
                this.f = string;
                this.h = i;
                break;
            case 3:
                int i2 = parcel.readInt();
                byte[] bArr = new byte[i2];
                parcel.readByteArray(bArr);
                this.h = i2;
                this.g = bArr;
                break;
            case 4:
                this.f = parcel.readString();
                break;
            case 6:
            case 9:
            case 10:
                Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
                parcelable.getClass();
                this.g = parcelable;
                break;
            case 8:
                break;
            default:
                throw new RuntimeException("invalid " + getClass().getSimpleName() + " type in parcel: " + this.b);
        }
        if (parcel.readInt() == 1) {
            this.d = (ColorStateList) ColorStateList.CREATOR.createFromParcel(parcel);
        }
        switch (parcel.readInt()) {
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 10:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.XOR;
                break;
            case 12:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 16:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 17:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = PorterDuff.Mode.CLEAR;
                break;
        }
        this.e = mode;
    }

    private final byte[] A() {
        byte[] bArr;
        if (this.b != 3) {
            throw new IllegalStateException("called getDataBytes() on ".concat(toString()));
        }
        synchronized (this) {
            bArr = (byte[]) this.g;
        }
        return bArr;
    }

    private final void B() {
        if (this.b != 3) {
            throw new IllegalStateException("called getDataOffset() on ".concat(toString()));
        }
        synchronized (this) {
        }
    }

    public static GhIcon j(ComponentName componentName) {
        if (componentName == null) {
            throw new IllegalArgumentException("ComponentName must not be null");
        }
        GhIcon ghIcon = new GhIcon(6);
        ghIcon.g = componentName;
        return ghIcon;
    }

    public static GhIcon k(Icon icon) {
        if (icon == null) {
            throw new IllegalArgumentException("Icon must not be null");
        }
        GhIcon ghIcon = new GhIcon(9);
        ghIcon.g = icon;
        return ghIcon;
    }

    public static GhIcon l(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        GhIcon ghIcon = new GhIcon(1);
        ghIcon.g = bitmap;
        return ghIcon;
    }

    public static GhIcon m(CarIcon carIcon, ComponentName componentName) {
        int type = carIcon.getType();
        if (type != 1) {
            return type != 5 ? new GhIcon(8) : j(componentName);
        }
        IconCompat icon = carIcon.getIcon();
        return icon == null ? new GhIcon(8) : o(icon);
    }

    public static GhIcon n(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        GhIcon ghIcon = new GhIcon(7);
        ghIcon.g = bitmap;
        return ghIcon;
    }

    public static GhIcon o(IconCompat iconCompat) {
        int length;
        int iB = iconCompat.b();
        if (iB == 2) {
            return r(iconCompat.o(), iconCompat.a());
        }
        if (iB != 3) {
            GhIcon ghIcon = new GhIcon(10);
            ghIcon.g = iconCompat;
            return ghIcon;
        }
        byte[] bArr = iconCompat.d;
        if (bArr == null || (length = bArr.length) <= 0) {
            return new GhIcon(8);
        }
        GhIcon ghIcon2 = new GhIcon(3);
        ghIcon2.g = bArr;
        ghIcon2.h = length;
        return ghIcon2;
    }

    public static GhIcon p(Context context, int i) {
        return r(context.getPackageName(), i);
    }

    public static GhIcon q(Resources resources, int i) {
        if (resources != null) {
            return r(resources.getResourcePackageName(i), i);
        }
        throw new IllegalArgumentException("Resource must not be null.");
    }

    public static GhIcon r(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Resource package name must not be null.");
        }
        GhIcon ghIcon = new GhIcon(2);
        ghIcon.h = i;
        ghIcon.f = str;
        return ghIcon;
    }

    private final int w() {
        int i;
        if (this.b != 3) {
            throw new IllegalStateException("called getDataLength() on ".concat(toString()));
        }
        synchronized (this) {
            i = this.h;
        }
        return i;
    }

    private final Resources x() {
        if (this.b == 2) {
            return (Resources) this.g;
        }
        throw new IllegalStateException("called getResources() on ".concat(toString()));
    }

    private final IconCompat y() {
        if (this.b == 10) {
            return (IconCompat) this.g;
        }
        throw new IllegalStateException("called getIconCompat() on ".concat(toString()));
    }

    private final String z() {
        if (this.b != 4) {
            throw new IllegalStateException("called getUriString() on ".concat(toString()));
        }
        String str = this.f;
        str.getClass();
        return str;
    }

    public final int a() {
        if (this.b == 2) {
            return this.h;
        }
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        int iHashCode = 0;
        int iHash = Objects.hash(Integer.valueOf(i), this.d, Integer.valueOf(this.c), this.e) * 31;
        switch (i) {
            case 1:
            case 5:
            case 7:
                iHashCode = e().hashCode();
                break;
            case 2:
                iHashCode = Objects.hash(s(), Integer.valueOf(a()));
                break;
            case 3:
                Integer numValueOf = Integer.valueOf(w());
                B();
                iHashCode = Objects.hash(numValueOf, 0, Integer.valueOf(Arrays.hashCode(A())));
                break;
            case 4:
                iHashCode = z().hashCode();
                break;
            case 6:
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

    public final ComponentName c() {
        if (this.b == 6) {
            return (ComponentName) this.g;
        }
        throw new IllegalStateException("called getAppIconComponentName() on ".concat(toString()));
    }

    public final ColorStateList d(Context context) {
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            return colorStateList;
        }
        int i = this.c;
        if (i != -1) {
            return dup.d(context, i);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = this.b;
        return (i == 1 || i == 5 || i == 7 || i == 3) ? 1 : 0;
    }

    public final Bitmap e() {
        int i = this.b;
        if (i == 1 || i == 5 || i == 7) {
            return (Bitmap) this.g;
        }
        throw new IllegalStateException("called getBitmap() on ".concat(toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.graphics.icon.GhIcon.f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final Icon g() {
        if (this.b == 9) {
            return (Icon) this.g;
        }
        throw new IllegalStateException("called getPlatformIcon() on ".concat(toString()));
    }

    public final Uri h() {
        return Uri.parse(z());
    }

    public final CarIcon i(Context context, int i) {
        switch (this.b) {
            case 1:
            case 5:
            case 7:
                return new CarIcon(new tj(IconCompat.k(e())));
            case 2:
                try {
                    return new CarIcon(new tj(IconCompat.m(context.createPackageContext(s(), 0), a())));
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Invalid package for resource", e);
                }
            case 3:
            case 8:
            default:
                return CarIcon.ERROR;
            case 4:
                return new CarIcon(new tj(IconCompat.l(h())));
            case 6:
                return new CarIcon(new tj(IconCompat.k(lfs.e(context).c(context, c(), i))));
            case 9:
                return new CarIcon(new tj(IconCompat.i(context, g())));
            case 10:
                return new CarIcon(new tj(y()));
        }
    }

    public final String s() {
        if (this.b != 2) {
            throw new IllegalStateException("called getResPackage() on ".concat(toString()));
        }
        String str = this.f;
        str.getClass();
        return str;
    }

    public final boolean t() {
        return (this.c == -1 && this.d == null && this.e == a) ? false : true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Icon(typ=");
        int i = this.b;
        switch (i) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "APP_ICON";
                break;
            case 7:
                str = "CIRCLE_BITMAP";
                break;
            case 8:
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
            case 5:
            case 7:
                sb.append(" size=");
                sb.append(e().getWidth());
                sb.append("x");
                sb.append(e().getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(s());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(w());
                B();
                break;
            case 4:
                sb.append(" uri=");
                sb.append(z());
                break;
            case 6:
                sb.append(" componentName=");
                sb.append(c());
                break;
            case 8:
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
                throw new IllegalArgumentException(a.bp(i, "Unknown iconType: "));
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
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(com.google.android.apps.auto.components.graphics.icon.GhIcon r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 != 0) goto L8
            return r1
        L8:
            int r2 = r5.b
            int r3 = r6.b
            if (r2 == r3) goto Lf
            return r1
        Lf:
            android.content.res.ColorStateList r3 = r5.d
            android.content.res.ColorStateList r4 = r6.d
            boolean r3 = j$.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            int r3 = r5.c
            int r4 = r6.c
            if (r3 == r4) goto L21
            return r1
        L21:
            android.graphics.PorterDuff$Mode r3 = r5.e
            android.graphics.PorterDuff$Mode r4 = r6.e
            if (r3 == r4) goto L28
            return r1
        L28:
            switch(r2) {
                case 1: goto L95;
                case 2: goto L7c;
                case 3: goto L5d;
                case 4: goto L50;
                case 5: goto L95;
                case 6: goto L43;
                case 7: goto L95;
                case 8: goto L42;
                case 9: goto L37;
                case 10: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto La0
        L2c:
            androidx.core.graphics.drawable.IconCompat r5 = r5.y()
            java.lang.Object r6 = r6.g
            boolean r5 = j$.util.Objects.equals(r5, r6)
            return r5
        L37:
            android.graphics.drawable.Icon r5 = r5.g()
            java.lang.Object r6 = r6.g
            boolean r5 = j$.util.Objects.equals(r5, r6)
            return r5
        L42:
            return r0
        L43:
            android.content.ComponentName r5 = r5.c()
            android.content.ComponentName r6 = r6.c()
            boolean r5 = j$.util.Objects.equals(r5, r6)
            return r5
        L50:
            java.lang.String r5 = r5.z()
            java.lang.String r6 = r6.z()
            boolean r5 = j$.util.Objects.equals(r5, r6)
            return r5
        L5d:
            int r2 = r5.w()
            int r3 = r6.w()
            if (r2 != r3) goto La0
            r5.B()
            r6.B()
            byte[] r5 = r5.A()
            byte[] r6 = r6.A()
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 == 0) goto La0
            return r0
        L7c:
            int r2 = r5.a()
            int r3 = r6.a()
            if (r2 != r3) goto La0
            java.lang.String r5 = r5.s()
            java.lang.String r6 = r6.s()
            boolean r5 = j$.util.Objects.equals(r5, r6)
            if (r5 == 0) goto La0
            return r0
        L95:
            android.graphics.Bitmap r5 = r5.e()
            android.graphics.Bitmap r6 = r6.e()
            if (r5 != r6) goto La0
            return r0
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.graphics.icon.GhIcon.u(com.google.android.apps.auto.components.graphics.icon.GhIcon):boolean");
    }

    public final void v() {
        this.d = ColorStateList.valueOf(-16777216);
        this.c = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        parcel.writeInt(i2);
        int i3 = 0;
        switch (i2) {
            case 1:
            case 5:
            case 7:
                e().writeToParcel(parcel, i);
                break;
            case 2:
                parcel.writeString(s());
                parcel.writeInt(a());
                break;
            case 3:
                parcel.writeInt(w());
                byte[] bArrA = A();
                B();
                B();
                parcel.writeByteArray(Arrays.copyOfRange(bArrA, 0, w()));
                break;
            case 4:
                parcel.writeString(z());
                break;
            case 6:
                parcel.writeParcelable(c(), 0);
                break;
            case 8:
                break;
            case 9:
                parcel.writeParcelable(g(), 0);
                break;
            case 10:
                parcel.writeParcelable(y().e, 0);
                break;
            default:
                throw new IllegalArgumentException(a.bp(i2, "Unknown type: "));
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorStateList.writeToParcel(parcel, i);
        }
        switch (lgb.a[this.e.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 2;
                break;
            case 3:
                i3 = 3;
                break;
            case 4:
                i3 = 4;
                break;
            case 5:
                i3 = 5;
                break;
            case 6:
                i3 = 6;
                break;
            case 7:
                i3 = 7;
                break;
            case 8:
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
