package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class q implements e {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f3487a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f3488b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f3489c;

    /* renamed from: d, reason: collision with root package name */
    private Object f3490d;

    q(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f3489c = contentResolver;
        this.f3488b = uri;
        this.f3487a = z;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        Object obj = this.f3490d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected final AssetFileDescriptor e(Uri uri) {
        return (this.f3487a && com.bumptech.glide.load.n.m(uri) && com.bumptech.glide.load.n.l()) ? com.bumptech.glide.load.n.j(uri, this.f3489c) : this.f3489c.openAssetFileDescriptor(uri, "r");
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, d dVar) {
        try {
            Object objB = b(this.f3488b, this.f3489c);
            this.f3490d = objB;
            dVar.b(objB);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
