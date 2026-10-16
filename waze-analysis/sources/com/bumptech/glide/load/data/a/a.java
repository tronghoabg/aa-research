package com.bumptech.glide.load.data.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3455a = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f3456b;

    a(ContentResolver contentResolver) {
        this.f3456b = contentResolver;
    }

    @Override // com.bumptech.glide.load.data.a.d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f3456b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3455a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
