package U1;

import android.util.Pair;
import f6.C2603p;
import f6.C2608u;
import java.io.IOException;
import k2.C3168z;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOException f11960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11965g;

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z2, int i5) {
        this.f11959a = i5;
        this.f11962d = obj;
        this.f11963e = obj2;
        this.f11964f = obj3;
        this.f11965g = obj4;
        this.f11960b = iOException;
        this.f11961c = z2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [f6.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11959a) {
            case 0:
                V1.d dVar = (V1.d) ((M) this.f11962d).f11967b.f3480j;
                Pair pair = (Pair) this.f11963e;
                dVar.s(((Integer) pair.first).intValue(), (k2.H) pair.second, (C3168z) this.f11964f, (h2.g) this.f11965g, this.f11960b, this.f11961c);
                break;
            default:
                I5.f fVar = (I5.f) this.f11962d;
                int i5 = fVar.f5392a;
                this.f11963e.o(i5, fVar.f5393b, (C2603p) this.f11964f, (C2608u) this.f11965g, this.f11960b, this.f11961c);
                break;
        }
    }
}
