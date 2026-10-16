package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f20512a;

    /* renamed from: b, reason: collision with root package name */
    private Charset f20513b;

    /* renamed from: c, reason: collision with root package name */
    private a f20514c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f20513b = null;
        this.f20512a = messageDigest;
        this.f20514c = aVar;
        if (messageDigest != null) {
            this.f20513b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i5, int i10) {
        super.write(cArr, i5, i10);
        MessageDigest messageDigest = this.f20512a;
        if (messageDigest != null) {
            messageDigest.update(this.f20513b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i5) {
        super.write(i5);
        MessageDigest messageDigest = this.f20512a;
        if (messageDigest != null) {
            messageDigest.update((byte) i5);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i5, int i10) {
        super.write(str, i5, i10);
        if (this.f20512a != null) {
            a aVar = this.f20514c;
            if (aVar == null || aVar.a(str)) {
                this.f20512a.update(this.f20513b.encode(CharBuffer.wrap(str, i5, i10 + i5)).array());
            }
        }
    }
}
