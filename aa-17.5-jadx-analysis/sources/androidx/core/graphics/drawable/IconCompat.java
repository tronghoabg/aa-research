package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.a;
import defpackage.dsg;
import defpackage.dtj;
import defpackage.dtk;
import defpackage.ebe;

/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

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

    public static Resources c(Context context, String str) throws PackageManager.NameNotFoundException {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public static IconCompat h(Bundle bundle) {
        int i = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", a.bp(i, "Unknown type "));
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat i(Context context, Icon icon) {
        ebe.m(icon);
        return dtj.c(context, icon);
    }

    public static IconCompat j(Uri uri) {
        dsg.x(uri);
        String string = uri.toString();
        dsg.x(string);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.c = string;
        return iconCompat;
    }

    public static IconCompat k(Bitmap bitmap) {
        dsg.x(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static IconCompat l(Uri uri) {
        dsg.x(uri);
        String string = uri.toString();
        dsg.x(string);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.c = string;
        return iconCompat;
    }

    public static IconCompat m(Context context, int i) {
        dsg.x(context);
        return n(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat n(Resources resources, String str, int i) {
        dsg.x(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f = i;
        if (resources != null) {
            try {
                iconCompat.c = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
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
            return dtk.c(this.c);
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        return i == -1 ? dtk.d(this.c) : i;
    }

    public final Bitmap d() {
        int i = this.b;
        if (i == -1) {
            Object obj = this.c;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.c;
        }
        if (i != 5) {
            toString();
            throw new IllegalStateException("called getBitmap() on ".concat(toString()));
        }
        Bitmap bitmap = (Bitmap) this.c;
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        paint.setColor(0);
        float f = iMin;
        float f2 = 0.010416667f * f;
        paint.setShadowLayer(f2, BitmapDescriptorFactory.HUE_RED, 0.020833334f * f, 1023410176);
        float f3 = f * 0.5f;
        float f4 = 0.9166667f * f3;
        canvas.drawCircle(f3, f3, f4, paint);
        paint.setShadowLayer(f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
        canvas.drawCircle(f3, f3, f4, paint);
        paint.clearShadowLayer();
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public final Drawable e(Context context) {
        Object obj;
        if (this.b == 2 && (obj = this.c) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String strO = o();
                    int identifier = c(context, strO).getIdentifier(str4, str3, str5);
                    if (this.f != identifier) {
                        Log.i("IconCompat", a.bM(str, strO, "Id has changed for ", " "));
                        this.f = identifier;
                    }
                }
            }
        }
        return dtj.b(this, context).loadDrawable(context);
    }

    public final Uri f() {
        int i = this.b;
        if (i == -1) {
            return dtk.e(this.c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.c);
        }
        toString();
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        switch (this.b) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.c);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.c);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.c);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.c);
                break;
        }
        bundle.putInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, this.b);
        bundle.putInt("int1", this.f);
        bundle.putInt("int2", this.g);
        bundle.putString("string1", this.k);
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != a) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final String o() {
        int i = this.b;
        if (i == -1) {
            return dtk.f(this.c);
        }
        if (i == 2) {
            String str = this.k;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.c).split(":", -1)[0] : this.k;
        }
        toString();
        throw new IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final void p(int i) {
        this.h = ColorStateList.valueOf(i);
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
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
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
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
