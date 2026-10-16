package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.carstream.tech.car.CarScreen;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class vb {
    public static final tb a = new tb(32, 0.75f, true, 0);
    public static final ExecutorService b = Executors.newFixedThreadPool(2);
    public static final Handler c = new Handler(Looper.getMainLooper());

    public static synchronized Bitmap a(String str) {
        return str == null ? null : (Bitmap) a.get(str);
    }

    public static File b(Context context, String str) {
        File file = new File(context.getFilesDir(), "thumbs");
        file.mkdirs();
        return new File(file, ad.c(Integer.toHexString(str.hashCode()), ".jpg"));
    }

    public static void c(CarScreen carScreen, String str, ub ubVar) {
        if (str.isEmpty()) {
            ubVar.a(null);
            return;
        }
        Bitmap bitmapA = a(str);
        if (bitmapA != null) {
            ubVar.a(bitmapA);
        } else {
            b.execute(new y(carScreen.getApplicationContext(), str, ubVar, 5));
        }
    }
}
