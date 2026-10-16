package A8;

import B8.d;
import C6.l;
import L8.e;
import L8.t;
import java.util.concurrent.Executor;
import s8.g;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f1241d;

    public /* synthetic */ a(t tVar, t tVar2, t tVar3, int i5) {
        this.f1238a = i5;
        this.f1239b = tVar;
        this.f1240c = tVar2;
        this.f1241d = tVar3;
    }

    @Override // L8.e
    public final Object o(l lVar) {
        switch (this.f1238a) {
            case 0:
                return new d((g) lVar.a(g.class), lVar.c(b.class), (Executor) lVar.b(this.f1239b), (Executor) lVar.b(this.f1240c), (Executor) lVar.b(this.f1241d));
            default:
                return new I8.b((g) lVar.a(g.class), (Executor) lVar.b(this.f1239b), (Executor) lVar.b(this.f1240c), (Executor) lVar.b(this.f1241d));
        }
    }
}
