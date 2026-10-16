package com.bumptech.glide.load.b;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f3254a;

    /* renamed from: b, reason: collision with root package name */
    private Object f3255b;

    i(String str) {
        this.f3254a = str;
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
        try {
            ((InputStream) this.f3255b).close();
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        try {
            String str = this.f3254a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.f3255b = byteArrayInputStream;
            dVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e2) {
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
