package L8;

import android.content.Context;
import l9.InterfaceC3447c;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements O9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7003c;

    public /* synthetic */ h(int i5, Object obj, Object obj2) {
        this.f7001a = i5;
        this.f7002b = obj;
        this.f7003c = obj2;
    }

    @Override // O9.b
    public final Object get() {
        switch (this.f7001a) {
            case 0:
                i iVar = (i) this.f7002b;
                iVar.getClass();
                b bVar = (b) this.f7003c;
                return bVar.f6995f.o(new C6.l(bVar, iVar));
            default:
                s8.g gVar = (s8.g) this.f7002b;
                return new T9.a((Context) this.f7003c, gVar.g(), (InterfaceC3447c) gVar.f45331d.a(InterfaceC3447c.class));
        }
    }
}
