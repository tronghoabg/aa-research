package com.google.firebase.crashlytics.a.c;

import com.google.firebase.crashlytics.a.e.bh;
import com.google.firebase.crashlytics.a.e.ck;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements au {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9166a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9167b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9168c;

    d(String str, String str2, byte[] bArr) {
        this.f9167b = str;
        this.f9168c = str2;
        this.f9166a = bArr;
    }

    private final boolean d() {
        byte[] bArr = this.f9166a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.a.c.au
    public final bh a() throws IOException {
        byte[] byteArray;
        if (d()) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(this.f9166a);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        if (byteArray == null) {
            return null;
        }
        ck ckVar = new ck();
        ckVar.e(byteArray);
        ckVar.f(this.f9167b);
        return ckVar.d();
    }

    @Override // com.google.firebase.crashlytics.a.c.au
    public final InputStream b() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f9166a);
    }

    @Override // com.google.firebase.crashlytics.a.c.au
    public final String c() {
        return this.f9168c;
    }
}
