package Z3;

import cg.InterfaceC1620i;
import cg.u;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: a, reason: collision with root package name */
    public final A6.c f16982a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16983b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1620i f16984c;

    public m(InterfaceC1620i interfaceC1620i, File file, A6.c cVar) {
        this.f16982a = cVar;
        this.f16984c = interfaceC1620i;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    @Override // Z3.k
    public final A6.c a() {
        return this.f16982a;
    }

    @Override // Z3.k
    public final synchronized InterfaceC1620i b() {
        InterfaceC1620i interfaceC1620i;
        try {
            if (this.f16983b) {
                throw new IllegalStateException("closed");
            }
            interfaceC1620i = this.f16984c;
            if (interfaceC1620i == null) {
                u uVar = cg.m.f19913a;
                AbstractC3340k.b(null);
                uVar.i(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1620i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16983b = true;
        InterfaceC1620i interfaceC1620i = this.f16984c;
        if (interfaceC1620i != null) {
            k4.e.a(interfaceC1620i);
        }
    }
}
