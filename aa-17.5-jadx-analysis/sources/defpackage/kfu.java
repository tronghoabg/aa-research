package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.util.TypedValue;
import androidx.car.app.model.Alert;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class kfu {
    public boolean a = false;
    public boolean b = false;

    private final Bitmap b(InputStream inputStream, kfw kfwVar) throws Throwable {
        kfz kfzVar;
        Bitmap bitmapD;
        BitmapFactory.Options options = null;
        try {
            kfzVar = new kfz(inputStream);
            try {
                kfzVar.a = Alert.DURATION_SHOW_INDEFINITELY;
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                try {
                    options2.inJustDecodeBounds = true;
                    options2.inTempStorage = kfy.a.b();
                    kfzVar.mark(Alert.DURATION_SHOW_INDEFINITELY);
                    BitmapFactory.decodeStream(kfzVar, null, options2);
                    float f = options2.outHeight / kfwVar.d;
                    float f2 = options2.outWidth / kfwVar.c;
                    if (f >= f2) {
                        f = f2;
                    }
                    options2.inJustDecodeBounds = false;
                    if (f >= 4.0f) {
                        options2.inSampleSize = ((int) f) / 2;
                    }
                    kfzVar.reset();
                    kfzVar.a = 0;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(kfzVar, null, options2);
                    if (bitmapDecodeStream == null || this.b) {
                        kfy.a.a(options2.inTempStorage);
                        kfzVar.close();
                        return null;
                    }
                    if (kfwVar.c < bitmapDecodeStream.getWidth() || kfwVar.d < bitmapDecodeStream.getHeight()) {
                        bitmapD = kfl.d(bitmapDecodeStream, kfwVar.c, kfwVar.d);
                        this.a = true;
                    } else {
                        bitmapD = bitmapDecodeStream;
                    }
                    if (bitmapD != bitmapDecodeStream) {
                        bitmapDecodeStream.recycle();
                    }
                    kfy.a.a(options2.inTempStorage);
                    kfzVar.close();
                    return bitmapD;
                } catch (Throwable th) {
                    th = th;
                    options = options2;
                    if (options != null) {
                        kfy.a.a(options.inTempStorage);
                    }
                    if (kfzVar != null) {
                        kfzVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            kfzVar = null;
        }
    }

    private final Bitmap c(Context context, Intent.ShortcutIconResource shortcutIconResource, kfw kfwVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, IOException {
        Object objOpenRawResource;
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
            if (resourcesForApplication == null) {
                objOpenRawResource = null;
            } else {
                resourcesForApplication.updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
                int identifier = resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null);
                if (identifier == 0) {
                    Log.e("GH.BitmapSyncWorker", "Couldn't get resource " + shortcutIconResource.resourceName + " in resources of " + shortcutIconResource.packageName);
                    objOpenRawResource = null;
                } else {
                    TypedValue typedValue = new TypedValue();
                    resourcesForApplication.getValue(identifier, typedValue, true);
                    objOpenRawResource = (!(typedValue.type == 3 && typedValue.string.toString().endsWith(".xml")) && (typedValue.type < 28 || typedValue.type > 31)) ? resourcesForApplication.openRawResource(identifier, typedValue) : resourcesForApplication.getDrawable(identifier);
                }
            }
            if (objOpenRawResource instanceof InputStream) {
                return b((InputStream) objOpenRawResource, kfwVar);
            }
            if (!(objOpenRawResource instanceof Drawable)) {
                Log.w("GH.BitmapSyncWorker", a.bY(objOpenRawResource, "getBitmapFromResource failed, unrecognized resource: "));
                return null;
            }
            Drawable drawable = (Drawable) objOpenRawResource;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = kfwVar.c;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = kfwVar.d;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GH.BitmapSyncWorker", "Could not load package: " + shortcutIconResource.packageName + "! NameNotFound");
            return null;
        } catch (Resources.NotFoundException unused2) {
            Log.w("GH.BitmapSyncWorker", "Could not load resource: " + shortcutIconResource.resourceName + "! NotFound");
            return null;
        }
    }

    public final Bitmap a(kfw kfwVar) throws Throwable {
        Intent.ShortcutIconResource shortcutIconResource;
        HttpURLConnection httpURLConnection;
        try {
            Intent.ShortcutIconResource shortcutIconResource2 = kfwVar.a;
            if (shortcutIconResource2 != null) {
                return c(kfwVar.e, shortcutIconResource2, kfwVar);
            }
            Uri uri = kfwVar.b;
            if (uri == null) {
                Log.e("GH.BitmapSyncWorker", "Error loading bitmap - no source!");
                return null;
            }
            if (!mlq.K(uri) && !mlq.M(kfwVar.b)) {
                if (!mlq.N(kfwVar.b)) {
                    if (!mlq.L(kfwVar.b)) {
                        Log.e("GH.BitmapSyncWorker", a.bY(kfwVar.b, "Error loading bitmap - unknown resource URI! "));
                        return null;
                    }
                    InputStream inputStreamOpenInputStream = kfwVar.e.getContentResolver().openInputStream(kfwVar.b);
                    if (inputStreamOpenInputStream != null) {
                        return b(inputStreamOpenInputStream, kfwVar);
                    }
                    Log.w("GH.BitmapSyncWorker", "Content provider returned a null InputStream when trying to open resource.");
                    return null;
                }
                try {
                    httpURLConnection = (HttpURLConnection) new URL(kfwVar.b.toString()).openConnection();
                    try {
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream == null) {
                            Log.w("GH.BitmapSyncWorker", "null input stream");
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return null;
                        }
                        Bitmap bitmapB = b(new BufferedInputStream(inputStream), kfwVar);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return bitmapB;
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                }
            }
            Context context = kfwVar.e;
            Uri uri2 = kfwVar.b;
            if (mlq.K(uri2)) {
                shortcutIconResource = new Intent.ShortcutIconResource();
                shortcutIconResource.packageName = (String) new ntn(uri2.getAuthority()).i("");
                shortcutIconResource.resourceName = uri2.toString().substring(19).replaceFirst("/", ":");
            } else {
                if (!mlq.M(uri2)) {
                    throw new IllegalArgumentException("Invalid resource URI. ".concat(String.valueOf(String.valueOf(uri2))));
                }
                shortcutIconResource = new Intent.ShortcutIconResource();
                shortcutIconResource.packageName = (String) new ntn(uri2.getAuthority()).i("");
                shortcutIconResource.resourceName = uri2.toString().substring(shortcutIconResource.packageName.length() + 26).replaceFirst("/", ":");
            }
            return c(context, shortcutIconResource, kfwVar);
        } catch (IOException e) {
            Log.e("GH.BitmapSyncWorker", "Error loading url ".concat(String.valueOf(String.valueOf(kfwVar.b))), e);
            return null;
        } catch (RuntimeException e2) {
            Log.e("GH.BitmapSyncWorker", "Critical Error loading url ".concat(String.valueOf(String.valueOf(kfwVar.b))), e2);
            return null;
        }
    }
}
