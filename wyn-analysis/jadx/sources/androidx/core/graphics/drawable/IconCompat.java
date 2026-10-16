package androidx.core.graphics.drawable;

import Fe.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f18067a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18068b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f18069c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f18070d;

    /* renamed from: e, reason: collision with root package name */
    public int f18071e;

    /* renamed from: f, reason: collision with root package name */
    public int f18072f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f18073g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f18074h;

    /* renamed from: i, reason: collision with root package name */
    public String f18075i;

    /* renamed from: j, reason: collision with root package name */
    public String f18076j;

    public IconCompat() {
        this.f18067a = -1;
        this.f18069c = null;
        this.f18070d = null;
        this.f18071e = 0;
        this.f18072f = 0;
        this.f18073g = null;
        this.f18074h = k;
        this.f18075i = null;
    }

    public static IconCompat c(Bundle bundle) {
        int i5 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i5);
        iconCompat.f18071e = bundle.getInt("int1");
        iconCompat.f18072f = bundle.getInt("int2");
        iconCompat.f18076j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f18073g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f18074h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i5) {
            case -1:
            case 1:
            case 5:
                iconCompat.f18068b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i5);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f18068b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f18068b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat d(Icon icon) {
        icon.getClass();
        int iW = c.w(icon);
        if (iW == 2) {
            return g(null, c.v(icon), c.u(icon));
        }
        if (iW == 4) {
            Uri uriX = c.x(icon);
            uriX.getClass();
            String string = uriX.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f18068b = string;
            return iconCompat;
        }
        if (iW != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f18068b = icon;
            return iconCompat2;
        }
        Uri uriX2 = c.x(icon);
        uriX2.getClass();
        String string2 = uriX2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f18068b = string2;
        return iconCompat3;
    }

    public static Bitmap e(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z2) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat f(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f18068b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Resources resources, String str, int i5) {
        str.getClass();
        if (i5 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f18071e = i5;
        if (resources != null) {
            try {
                iconCompat.f18068b = resources.getResourceName(i5);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f18068b = str;
        }
        iconCompat.f18076j = str;
        return iconCompat;
    }

    public final int h() {
        int i5 = this.f18067a;
        if (i5 == -1) {
            return c.u(this.f18068b);
        }
        if (i5 == 2) {
            return this.f18071e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri i() {
        int i5 = this.f18067a;
        if (i5 == -1) {
            return c.x(this.f18068b);
        }
        if (i5 == 4 || i5 == 6) {
            return Uri.parse((String) this.f18068b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon j(android.content.Context r8) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.j(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f18067a == -1) {
            return String.valueOf(this.f18068b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f18067a) {
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
        sb2.append(str);
        switch (this.f18067a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f18068b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f18068b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f18076j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f18071e);
                if (this.f18072f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f18072f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f18068b);
                break;
        }
        if (this.f18073g != null) {
            sb2.append(" tint=");
            sb2.append(this.f18073g);
        }
        if (this.f18074h != k) {
            sb2.append(" mode=");
            sb2.append(this.f18074h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i5) {
        this.f18069c = null;
        this.f18070d = null;
        this.f18071e = 0;
        this.f18072f = 0;
        this.f18073g = null;
        this.f18074h = k;
        this.f18075i = null;
        this.f18067a = i5;
    }
}
