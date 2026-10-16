package e.a.d;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eb {

    /* renamed from: a, reason: collision with root package name */
    private List f46854a;

    /* renamed from: b, reason: collision with root package name */
    private int f46855b;

    /* renamed from: c, reason: collision with root package name */
    private int f46856c;

    public eb(List list) {
        this.f46854a = list;
    }

    public final e.a.c a() {
        return ((e.a.ai) this.f46854a.get(this.f46855b)).a();
    }

    public final SocketAddress b() {
        return (SocketAddress) ((e.a.ai) this.f46854a.get(this.f46855b)).b().get(this.f46856c);
    }

    public final void c() {
        e.a.ai aiVar = (e.a.ai) this.f46854a.get(this.f46855b);
        int i2 = this.f46856c + 1;
        this.f46856c = i2;
        if (i2 >= aiVar.b().size()) {
            this.f46855b++;
            this.f46856c = 0;
        }
    }

    public final void d() {
        this.f46855b = 0;
        this.f46856c = 0;
    }

    public final void e(List list) {
        this.f46854a = list;
        d();
    }

    public final boolean f() {
        return this.f46855b == 0 && this.f46856c == 0;
    }

    public final boolean g() {
        return this.f46855b < this.f46854a.size();
    }

    public final boolean h(SocketAddress socketAddress) {
        for (int i2 = 0; i2 < this.f46854a.size(); i2++) {
            int iIndexOf = ((e.a.ai) this.f46854a.get(i2)).b().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f46855b = i2;
                this.f46856c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
