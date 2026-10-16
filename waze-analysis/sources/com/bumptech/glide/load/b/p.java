package com.bumptech.glide.load.b;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final File f3267a;

    /* renamed from: b, reason: collision with root package name */
    private final q f3268b;

    /* renamed from: c, reason: collision with root package name */
    private Object f3269c;

    p(File file, q qVar) {
        this.f3267a = file;
        this.f3268b = qVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3268b.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        Object obj = this.f3269c;
        if (obj != null) {
            try {
                this.f3268b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objB = this.f3268b.b(this.f3267a);
            this.f3269c = objB;
            dVar.b(objB);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e2);
            }
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
