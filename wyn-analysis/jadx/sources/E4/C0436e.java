package E4;

import java.io.File;
import java.util.List;

/* renamed from: E4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436e implements h, C4.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f2868a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2869b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0438g f2870c;

    /* renamed from: d, reason: collision with root package name */
    public int f2871d = -1;

    /* renamed from: e, reason: collision with root package name */
    public B4.d f2872e;

    /* renamed from: f, reason: collision with root package name */
    public List f2873f;

    /* renamed from: g, reason: collision with root package name */
    public int f2874g;

    /* renamed from: h, reason: collision with root package name */
    public volatile I4.o f2875h;

    /* renamed from: i, reason: collision with root package name */
    public File f2876i;

    public C0436e(List list, i iVar, InterfaceC0438g interfaceC0438g) {
        this.f2868a = list;
        this.f2869b = iVar;
        this.f2870c = interfaceC0438g;
    }

    @Override // C4.d
    public final void c(Exception exc) {
        this.f2870c.b(this.f2872e, exc, this.f2875h.f5355c, 3);
    }

    @Override // E4.h
    public final void cancel() {
        I4.o oVar = this.f2875h;
        if (oVar != null) {
            oVar.f5355c.cancel();
        }
    }

    @Override // E4.h
    public final boolean d() {
        while (true) {
            List list = this.f2873f;
            boolean z2 = false;
            if (list != null && this.f2874g < list.size()) {
                this.f2875h = null;
                while (!z2 && this.f2874g < this.f2873f.size()) {
                    List list2 = this.f2873f;
                    int i5 = this.f2874g;
                    this.f2874g = i5 + 1;
                    I4.p pVar = (I4.p) list2.get(i5);
                    File file = this.f2876i;
                    i iVar = this.f2869b;
                    this.f2875h = pVar.b(file, iVar.f2883e, iVar.f2884f, iVar.f2887i);
                    if (this.f2875h != null && this.f2869b.c(this.f2875h.f5355c.b()) != null) {
                        this.f2875h.f5355c.e(this.f2869b.f2892o, this);
                        z2 = true;
                    }
                }
                return z2;
            }
            int i10 = this.f2871d + 1;
            this.f2871d = i10;
            if (i10 >= this.f2868a.size()) {
                return false;
            }
            B4.d dVar = (B4.d) this.f2868a.get(this.f2871d);
            i iVar2 = this.f2869b;
            File fileH = iVar2.f2886h.a().h(new C0437f(dVar, iVar2.f2891n));
            this.f2876i = fileH;
            if (fileH != null) {
                this.f2872e = dVar;
                this.f2873f = this.f2869b.f2881c.f24220b.j(fileH);
                this.f2874g = 0;
            }
        }
    }

    @Override // C4.d
    public final void i(Object obj) {
        this.f2870c.a(this.f2872e, obj, this.f2875h.f5355c, 3, this.f2872e);
    }
}
