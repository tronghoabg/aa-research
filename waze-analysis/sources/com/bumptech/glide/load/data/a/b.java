package com.bumptech.glide.load.data.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3457a = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f3458b;

    b(ContentResolver contentResolver) {
        this.f3458b = contentResolver;
    }

    @Override // com.bumptech.glide.load.data.a.d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f3458b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3457a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
