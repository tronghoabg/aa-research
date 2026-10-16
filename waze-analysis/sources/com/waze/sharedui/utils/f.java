package com.waze.sharedui.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.location.Location;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.exifinterface.media.ExifInterface;
import com.waze.beacons.p;
import com.waze.config.ConfigValues;
import com.waze.sharedui.web.as;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import l.a.afx;
import l.a.kl;
import l.a.kn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f {
    public f() {
    }

    public static double a(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2) {
        double radians = Math.toRadians(cVar2.a() - cVar.a()) / 2.0d;
        double radians2 = Math.toRadians(cVar2.b() - cVar.b()) / 2.0d;
        double dSin = (Math.sin(radians) * Math.sin(radians)) + (Math.cos(Math.toRadians(cVar.a())) * Math.cos(Math.toRadians(cVar2.a())) * Math.sin(radians2) * Math.sin(radians2));
        double dAtan2 = Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin));
        return (dAtan2 + dAtan2) * 6371000.0d;
    }

    public static float b(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2) {
        float[] fArr = new float[1];
        Location.distanceBetween(cVar.a(), cVar.b(), cVar2.a(), cVar2.b(), fArr);
        return fArr[0];
    }

    public static e c() {
        String strB = ConfigValues.CONFIG_VALUE_GENERAL_UNITS.b();
        return "default".equals(strB) ? d(ConfigValues.CONFIG_VALUE_GENERAL_DEFAULT_UNITS.b()) : d(strB);
    }

    public static e d(String str) {
        return "imperial".equals(str) ? e.f39095b : e.f39094a;
    }

    public static String e(com.waze.shared_infra.o.a aVar, int i2) {
        return f(aVar, i2, false);
    }

    public static String f(com.waze.shared_infra.o.a aVar, int i2, boolean z) {
        c cVar = new c(i2, z);
        return String.format(Locale.getDefault(), "%s %s", cVar.a(), aVar.c(cVar.f39084a.f39092e, new Object[0]));
    }

    public static void g(File file) {
        x.f(file, "<this>");
        try {
            file.delete();
        } catch (IOException e2) {
            com.waze.shared_infra.i.h.l("FileUtils", "Failed to delete file: ".concat(String.valueOf(file.getAbsolutePath())), e2);
        } catch (SecurityException e3) {
            com.waze.shared_infra.i.h.l("FileUtils", "Failed to delete file: ".concat(String.valueOf(file.getAbsolutePath())), e3);
        }
    }

    public static void i(View view) {
        x.f(view, "<this>");
        view.requestFocus();
        if (view.hasWindowFocus()) {
            o(view);
        } else {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new g(view));
        }
    }

    public static void j(Activity activity) {
        x.f(activity, "<this>");
        Activity activity2 = activity;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity2);
        }
        x.f(activity2, "<this>");
        x.f(currentFocus, "view");
        Object systemService = activity2.getSystemService("input_method");
        x.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void k(String str, int i2, int i3) {
        int i4;
        x.f(str, "fileName");
        try {
            String attribute = new ExifInterface(str).getAttribute(ExifInterface.TAG_ORIENTATION);
            if (attribute == null) {
                com.waze.shared_infra.i.h.b("ImageRotator", "No EXIF orientation attribute found for ".concat(str));
                return;
            }
            com.waze.shared_infra.i.h.b("ImageRotator", "EXIF value for " + str + " = " + attribute);
            Integer numF = h.n.o.f(attribute);
            if (numF != null) {
                int iIntValue = numF.intValue();
                if (iIntValue == 3) {
                    i4 = 180;
                } else if (iIntValue == 6) {
                    i4 = 90;
                } else if (iIntValue != 8) {
                    return;
                } else {
                    i4 = DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN;
                }
                Bitmap bitmapDecodeFile = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i5 = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        com.waze.shared_infra.i.h.d("ImageRotator", "Failed to decode bounds for image: " + str);
                    } else {
                        int i6 = options.outHeight;
                        int i7 = options.outWidth;
                        if (i6 > i3 || i7 > i2) {
                            int i8 = i6 / 2;
                            int i9 = i7 / 2;
                            while (i8 / i5 >= i3 && i9 / i5 >= i2) {
                                i5 += i5;
                            }
                        }
                        options.inSampleSize = i5;
                        options.inJustDecodeBounds = false;
                        bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                    }
                } catch (Exception e2) {
                    com.waze.shared_infra.i.h.f("ImageRotator", "Error decoding sampled bitmap ".concat(str), e2);
                }
                Bitmap bitmap = bitmapDecodeFile;
                if (bitmap == null) {
                    com.waze.shared_infra.i.h.k("ImageRotator", "Failed to decode sampled bitmap for ".concat(str));
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(i4);
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    x.c(bitmapCreateBitmap);
                    if (!x.n(bitmap, bitmapCreateBitmap)) {
                        bitmap.recycle();
                    }
                    com.waze.shared_infra.s.h.c(bitmapCreateBitmap, str);
                    bitmapCreateBitmap.recycle();
                } catch (OutOfMemoryError e3) {
                    com.waze.shared_infra.i.h.l("ImageRotator", "OutOfMemoryError when creating rotated bitmap for ".concat(str), e3);
                    bitmap.recycle();
                }
            }
        } catch (IOException e4) {
            com.waze.shared_infra.i.h.l("ImageRotator", "EXIF error for ".concat(str), e4);
        }
    }

    public static kn l(com.waze.stats.l lVar) {
        x.f(lVar, "<this>");
        kl klVarNewBuilder = kn.newBuilder();
        x.f(klVarNewBuilder, "builder");
        String strB = lVar.b();
        x.f(strB, "value");
        klVarNewBuilder.c(strB);
        if (lVar instanceof com.waze.stats.h) {
            klVarNewBuilder.a(((com.waze.stats.h) lVar).a());
        } else {
            if (lVar instanceof com.waze.stats.i) {
                throw null;
            }
            if (lVar instanceof com.waze.stats.j) {
                klVarNewBuilder.b(((com.waze.stats.j) lVar).a());
            } else {
                if (!(lVar instanceof com.waze.stats.k)) {
                    throw new h.i();
                }
                String strA = ((com.waze.stats.k) lVar).a();
                x.f(strA, "value");
                klVarNewBuilder.d(strA);
            }
        }
        kn knVarBuild = klVarNewBuilder.build();
        x.e(knVarBuild, "build(...)");
        return knVarBuild;
    }

    public static afx m(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "<this>");
        as asVarC = e.c.h.c(afx.newBuilder());
        asVarC.v(cVar.a());
        asVarC.w(cVar.b());
        return asVarC.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(com.waze.bw.c.d.da r37, h.g.a.l r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.utils.f.n(com.waze.bw.c.d.da, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(View view) {
        if (view.isFocused()) {
            view.post(new p(view, 13));
        }
    }

    public /* synthetic */ f(byte[] bArr, byte[] bArr2) {
    }
}
