package Md;

import Bf.k;
import Jd.C0672f;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7630a;

    /* renamed from: b, reason: collision with root package name */
    public final C0672f f7631b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7632c;

    public d(String text, C0672f contentType) {
        AbstractC3340k.e(text, "text");
        AbstractC3340k.e(contentType, "contentType");
        this.f7630a = text;
        this.f7631b = contentType;
        Charset charsetI = AbstractC3772b.i(contentType);
        this.f7632c = Fe.c.F(text, charsetI == null ? Bf.a.f1670a : charsetI);
    }

    @Override // Md.c
    public final Long a() {
        return Long.valueOf(this.f7632c.length);
    }

    @Override // Md.c
    public final C0672f b() {
        return this.f7631b;
    }

    @Override // Md.b
    public final byte[] d() {
        return this.f7632c;
    }

    public final String toString() {
        return "TextContent[" + this.f7631b + "] \"" + k.T0(30, this.f7630a) + '\"';
    }
}
