package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
final class hzw implements huv {
    private static final String[] a = {"_data"};
    private final Context b;
    private final hzh c;
    private final hzh d;
    private final Uri e;
    private final int f;
    private final int g;
    private final hum h;
    private final Class i;
    private volatile boolean j;
    private volatile huv k;

    public hzw(Context context, hzh hzhVar, hzh hzhVar2, Uri uri, int i, int i2, hum humVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = hzhVar;
        this.d = hzhVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = humVar;
        this.i = cls;
    }

    @Override // defpackage.huv
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.huv
    public final void b() {
        this.j = true;
        huv huvVar = this.k;
        if (huvVar != null) {
            huvVar.b();
        }
    }

    @Override // defpackage.huv
    public final void c() {
        huv huvVar = this.k;
        if (huvVar != null) {
            huvVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [huv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) throws Throwable {
        ncp ncpVarB;
        Throwable th;
        try {
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    ncpVarB = this.d.b(this.e, this.f, this.g, this.h);
                    break;
                }
                Uri requireOriginal = this.e;
                if (hdv.g(requireOriginal)) {
                    for (String str : requireOriginal.getPathSegments()) {
                        if (str != null && str.startsWith("picker")) {
                            ncpVarB = this.d.b(this.e, this.f, this.g, this.h);
                            break;
                        }
                    }
                }
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                ncpVarB = this.d.b(requireOriginal, this.f, this.g, this.h);
            } else {
                hzh hzhVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.bY(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                ncpVarB = hzhVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.bY(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            ?? r1 = ncpVarB != null ? ncpVarB.a : 0;
            if (r1 == 0) {
                huuVar.g(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r1;
            if (this.j) {
                b();
            } else {
                r1.d(hshVar, huuVar);
            }
        } catch (FileNotFoundException e) {
            huuVar.g(e);
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }
}
