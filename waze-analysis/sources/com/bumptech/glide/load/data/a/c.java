package com.bumptech.glide.load.data.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f3459a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3460b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f3461c;

    c(Uri uri, e eVar) {
        this.f3459a = uri;
        this.f3460b = eVar;
    }

    public static c b(Context context, Uri uri) {
        return h(context, uri, new a(context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return h(context, uri, new b(context.getContentResolver()));
    }

    private static c h(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.b(context).d().e(), dVar, com.bumptech.glide.c.b(context).l(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() throws IOException {
        InputStream inputStream = this.f3461c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(p pVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVar = this.f3460b;
            Uri uri = this.f3459a;
            InputStream inputStreamB = eVar.b(uri);
            int iA = inputStreamB != null ? eVar.a(uri) : -1;
            if (iA != -1) {
                inputStreamB = new k(inputStreamB, iA);
            }
            this.f3461c = inputStreamB;
            dVar.b(inputStreamB);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
