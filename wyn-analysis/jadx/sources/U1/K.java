package U1;

import android.util.Pair;
import k2.C3168z;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f11955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f11956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3168z f11957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h2.g f11958e;

    public /* synthetic */ K(M m10, Pair pair, C3168z c3168z, h2.g gVar, int i5) {
        this.f11954a = i5;
        this.f11955b = m10;
        this.f11956c = pair;
        this.f11957d = c3168z;
        this.f11958e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11954a) {
            case 0:
                V1.d dVar = (V1.d) this.f11955b.f11967b.f3480j;
                Pair pair = this.f11956c;
                dVar.y(((Integer) pair.first).intValue(), (k2.H) pair.second, this.f11957d, this.f11958e);
                break;
            case 1:
                V1.d dVar2 = (V1.d) this.f11955b.f11967b.f3480j;
                Pair pair2 = this.f11956c;
                dVar2.D(((Integer) pair2.first).intValue(), (k2.H) pair2.second, this.f11957d, this.f11958e);
                break;
            default:
                V1.d dVar3 = (V1.d) this.f11955b.f11967b.f3480j;
                Pair pair3 = this.f11956c;
                dVar3.r(((Integer) pair3.first).intValue(), (k2.H) pair3.second, this.f11957d, this.f11958e);
                break;
        }
    }
}
