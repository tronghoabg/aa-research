package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class zuh {
    public static final Uri a = new Uri.Builder().scheme("content").authority("google_maps_sdk_settings").path("content").build();
    private static final String e = "zuh";
    aaia b;
    Context c;
    public boolean d;

    static aaia a(Context context, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        if (!zkt.d) {
            String str = e;
            if (zrn.e(str, 4)) {
                Log.i(str, "Try to get maps settings for Android Auto in non-car build");
            }
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (abon e2) {
            String str2 = e;
            if (zrn.e(str2, 5)) {
                Log.w(str2, "OEM ContentProvider proto is corrupted: ".concat(String.valueOf(e2.getMessage())));
            }
        } catch (FileNotFoundException e3) {
            String str3 = e;
            if (zrn.e(str3, 5)) {
                Log.w(str3, "OEM ContentProvider did not return an InputStream: ".concat(String.valueOf(e3.getMessage())));
            }
        } catch (IOException e4) {
            String str4 = e;
            if (zrn.e(str4, 5)) {
                Log.w(str4, "IOException reading proto file from OEM: ".concat(String.valueOf(e4.getMessage())));
            }
        }
        if (inputStreamOpenInputStream != null) {
            aaia aaiaVar = aaia.a;
            aaia aaiaVar2 = (aaia) abnv.L(aaia.class).e(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return aaiaVar2;
        }
        String str5 = e;
        if (zrn.e(str5, 4)) {
            Log.i(str5, "OEM ContentProvider returned null InputStream");
        }
        return null;
    }

    final boolean b() {
        return c() || (this.c.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public abstract boolean c();

    public abstract boolean d();

    public final boolean e() {
        if (this.d == b()) {
            return false;
        }
        this.d = !this.d;
        return true;
    }

    public abstract boolean f();
}
