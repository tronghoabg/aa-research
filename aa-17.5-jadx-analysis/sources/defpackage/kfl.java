package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kfl {
    public static void a() {
    }

    public static Bitmap b(Drawable drawable, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap c(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i != -1) {
            while (bitmap.getWidth() >= i + i && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) {
                bitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true);
            }
        } else {
            i = -1;
        }
        if (Log.isLoggable("GH.BitmapUtils", 4)) {
            Log.i("GH.BitmapUtils", String.format("Resized from %dx%d to %dx%d for requested width: %d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i)));
        }
        return bitmap;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || (bitmap.getHeight() == i2 && bitmap.getWidth() == i)) {
            return bitmap;
        }
        float height = bitmap.getHeight() > i2 ? i2 / bitmap.getHeight() : 1.0f;
        float width = bitmap.getWidth() > i ? i / bitmap.getWidth() : 1.0f;
        if (height <= width) {
            height = width;
        }
        int iCeil = (int) Math.ceil(bitmap.getWidth() * height);
        int iCeil2 = (int) Math.ceil(bitmap.getHeight() * height);
        Bitmap bitmapCreateScaledBitmap = height < 0.5f ? Bitmap.createScaledBitmap(bitmap, iCeil + iCeil, iCeil2 + iCeil2, true) : bitmap;
        if (height == 1.0f) {
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iCeil, iCeil2, true);
        if (bitmapCreateScaledBitmap == bitmap) {
            return bitmapCreateScaledBitmap2;
        }
        bitmapCreateScaledBitmap.recycle();
        return bitmapCreateScaledBitmap2;
    }

    public static Bitmap e(Bitmap bitmap, Path path, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ryg] */
    public static yfq f(Context context, ScheduledExecutorService scheduledExecutorService, xxh xxhVar) {
        woy.aa(xxhVar.f(), "resetHandler must be present");
        knt kntVar = new knt(context, scheduledExecutorService, xxhVar.b());
        int i = yfq.d;
        Object[] objArr = {kntVar};
        yrm.B(objArr, 1);
        return new yls(objArr, 1);
    }

    public static kna g() {
        return (kna) mki.a.i(kna.class);
    }

    public static kwv h() {
        return (kwv) mki.a.i(kwv.class);
    }

    public static final int i() {
        if (l()) {
            return R.style.ThemeOverlay_Gearhead_Coolwalk_FontFamily_Samsung;
        }
        if (ldz.a.a().b()) {
            return R.style.ThemeOverlay_Gearhead_Coolwalk_FontFamily_Cielo;
        }
        leh.a.a();
        return R.style.ThemeOverlay_Gearhead_Coolwalk_FontFamily_Default;
    }

    public static final pi j(Context context) {
        context.getClass();
        return new pi(context, i());
    }

    public static final void k(Resources.Theme theme) {
        theme.getClass();
        theme.applyStyle(i(), true);
    }

    public static final boolean l() {
        acvb acvbVar = acvb.a;
        if (!acvbVar.gu().e()) {
            return false;
        }
        aboh abohVar = acvbVar.gu().a().b;
        String str = Build.MANUFACTURER;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return abohVar.contains(lowerCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.afeg r34, defpackage.cfy r35, float r36, long r37, long r39, defpackage.ckv r41, long r42, final defpackage.afeg r44, defpackage.bux r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfl.m(afeg, cfy, float, long, long, ckv, long, afeg, bux, int, int):void");
    }

    public static final ajh n(ase aseVar, bux buxVar, int i) {
        krr krrVar;
        aseVar.getClass();
        if (((Boolean) asl.i(aseVar, buxVar, i & 14).a()).booleanValue()) {
            buxVar.v(-798674067);
            krrVar = krr.a;
        } else {
            buxVar.v(-798672979);
            krrVar = krr.m;
        }
        kso ksoVar = ksp.a;
        long jB = ksp.b(kfn.i(buxVar), krrVar);
        ((bvv) buxVar).Y(false);
        return new ajh(2.0f, new ckx(jB));
    }
}
