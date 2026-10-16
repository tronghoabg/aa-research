package com.bumptech.glide.load.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3287a = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    private final Context f3288b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f3289c;

    z(Context context, Uri uri) {
        this.f3288b = context;
        this.f3289c = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        Cursor cursorQuery = this.f3288b.getContentResolver().query(this.f3289c, f3287a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            dVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.f3289c)))));
        } else {
            dVar.b(new File(string));
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
