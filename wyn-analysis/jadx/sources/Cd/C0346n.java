package Cd;

import Jd.AbstractC0669c;
import Jd.C0672f;

/* renamed from: Cd.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0346n extends Md.b {

    /* renamed from: a, reason: collision with root package name */
    public final C0672f f2139a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2141c;

    public C0346n(C0672f c0672f, Object obj) {
        this.f2141c = obj;
        if (c0672f == null) {
            C0672f c0672f2 = AbstractC0669c.f6047a;
            c0672f = AbstractC0669c.f6047a;
        }
        this.f2139a = c0672f;
        this.f2140b = ((byte[]) obj).length;
    }

    @Override // Md.c
    public final Long a() {
        return Long.valueOf(this.f2140b);
    }

    @Override // Md.c
    public final C0672f b() {
        return this.f2139a;
    }

    @Override // Md.b
    public final byte[] d() {
        return (byte[]) this.f2141c;
    }
}
