package kotlinx.b.d.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final v f51162a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f51163b;

    public i(v vVar) {
        h.g.b.x.f(vVar, "writer");
        this.f51162a = vVar;
        this.f51163b = true;
    }

    public void a() {
        this.f51163b = true;
    }

    public void b() {
        this.f51163b = false;
    }

    public void c() {
        this.f51163b = false;
    }

    public void d(byte b2) throws IOException {
        this.f51162a.d(b2);
    }

    public final void e(char c2) throws IOException {
        this.f51162a.c(c2);
    }

    public void f(int i2) throws IOException {
        this.f51162a.d(i2);
    }

    public void g(long j2) throws IOException {
        this.f51162a.d(j2);
    }

    public final void h(String str) throws IOException {
        h.g.b.x.f(str, "v");
        this.f51162a.b(str);
    }

    public void i(short s) throws IOException {
        this.f51162a.d(s);
    }

    public void j(String str) throws IOException {
        h.g.b.x.f(str, "value");
        this.f51162a.e(str);
    }

    protected final void k(boolean z) {
        this.f51163b = z;
    }

    public void l() {
    }

    public void m() {
    }

    public final boolean n() {
        return this.f51163b;
    }
}
