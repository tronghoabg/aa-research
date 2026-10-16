package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.b.ad;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.s;
import com.bumptech.glide.p;
import com.google.android.gms.common.api.internal.be;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3188a = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    private final Context f3189b;

    /* renamed from: c, reason: collision with root package name */
    private final ad f3190c;

    /* renamed from: d, reason: collision with root package name */
    private final ad f3191d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f3192e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3193f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3194g;

    /* renamed from: h, reason: collision with root package name */
    private final s f3195h;

    /* renamed from: i, reason: collision with root package name */
    private final Class f3196i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f3197j;

    /* renamed from: k, reason: collision with root package name */
    private volatile com.bumptech.glide.load.data.e f3198k;

    e(Context context, ad adVar, ad adVar2, Uri uri, int i2, int i3, s sVar, Class cls) {
        this.f3189b = context.getApplicationContext();
        this.f3190c = adVar;
        this.f3191d = adVar2;
        this.f3192e = uri;
        this.f3193f = i2;
        this.f3194g = i3;
        this.f3195h = sVar;
        this.f3196i = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3196i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
        this.f3197j = true;
        com.bumptech.glide.load.data.e eVar = this.f3198k;
        if (eVar != null) {
            eVar.bk();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        com.bumptech.glide.load.data.e eVar = this.f3198k;
        if (eVar != null) {
            eVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bumptech.glide.load.data.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final void f(p pVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        be beVarB;
        Throwable th;
        try {
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    beVarB = this.f3191d.b(this.f3192e, this.f3193f, this.f3194g, this.f3195h);
                    break;
                }
                Uri requireOriginal = this.f3192e;
                if (n.m(requireOriginal)) {
                    for (String str : requireOriginal.getPathSegments()) {
                        if (str != null && str.startsWith("picker")) {
                            beVarB = this.f3191d.b(this.f3192e, this.f3193f, this.f3194g, this.f3195h);
                            break;
                        }
                    }
                }
                if (this.f3189b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                beVarB = this.f3191d.b(requireOriginal, this.f3193f, this.f3194g, this.f3195h);
            } else {
                ad adVar = this.f3190c;
                Uri uri = this.f3192e;
                try {
                    Cursor cursorQuery = this.f3189b.getContentResolver().query(uri, f3188a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + String.valueOf(uri));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                beVarB = adVar.b(file, this.f3193f, this.f3194g, this.f3195h);
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
                    throw new FileNotFoundException("Failed to media store entry for: " + String.valueOf(uri));
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            ?? r3 = beVarB != null ? beVarB.f4791b : 0;
            if (r3 == 0) {
                dVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.f3192e)));
                return;
            }
            this.f3198k = r3;
            if (this.f3197j) {
                bk();
            } else {
                r3.f(pVar, dVar);
            }
        } catch (FileNotFoundException e2) {
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
