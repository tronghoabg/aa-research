package J4;

import I4.o;
import I4.p;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class f implements C4.e {
    public static final String[] k = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5600a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5601b;

    /* renamed from: c, reason: collision with root package name */
    public final p f5602c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f5603d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5604e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5605f;

    /* renamed from: g, reason: collision with root package name */
    public final B4.g f5606g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f5607h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f5608i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C4.e f5609j;

    public f(Context context, p pVar, p pVar2, Uri uri, int i5, int i10, B4.g gVar, Class cls) {
        this.f5600a = context.getApplicationContext();
        this.f5601b = pVar;
        this.f5602c = pVar2;
        this.f5603d = uri;
        this.f5604e = i5;
        this.f5605f = i10;
        this.f5606g = gVar;
        this.f5607h = cls;
    }

    @Override // C4.e
    public final void a() {
        C4.e eVar = this.f5609j;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // C4.e
    public final Class b() {
        return this.f5607h;
    }

    public final C4.e c() throws Throwable {
        o oVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        B4.g gVar = this.f5606g;
        int i5 = this.f5605f;
        int i10 = this.f5604e;
        Context context = this.f5600a;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f5603d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            oVarB = this.f5601b.b(file, i10, i5, gVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri requireOriginal = this.f5603d;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            oVarB = this.f5602c.b(requireOriginal, i10, i5, gVar);
        }
        if (oVarB != null) {
            return oVarB.f5355c;
        }
        return null;
    }

    @Override // C4.e
    public final void cancel() {
        this.f5608i = true;
        C4.e eVar = this.f5609j;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // C4.e
    public final int d() {
        return 1;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, C4.d dVar2) throws Throwable {
        try {
            C4.e eVarC = c();
            if (eVarC == null) {
                dVar2.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f5603d));
            } else {
                this.f5609j = eVarC;
                if (this.f5608i) {
                    cancel();
                } else {
                    eVarC.e(dVar, dVar2);
                }
            }
        } catch (FileNotFoundException e7) {
            dVar2.c(e7);
        }
    }
}
