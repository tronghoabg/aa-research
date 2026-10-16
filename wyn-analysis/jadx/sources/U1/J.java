package U1;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f11951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f11952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2.g f11953d;

    public /* synthetic */ J(M m10, Pair pair, h2.g gVar, int i5) {
        this.f11950a = i5;
        this.f11951b = m10;
        this.f11952c = pair;
        this.f11953d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11950a) {
            case 0:
                V1.d dVar = (V1.d) this.f11951b.f11967b.f3480j;
                Pair pair = this.f11952c;
                int iIntValue = ((Integer) pair.first).intValue();
                k2.H h10 = (k2.H) pair.second;
                h10.getClass();
                dVar.B(iIntValue, h10, this.f11953d);
                break;
            default:
                V1.d dVar2 = (V1.d) this.f11951b.f11967b.f3480j;
                Pair pair2 = this.f11952c;
                dVar2.q(((Integer) pair2.first).intValue(), (k2.H) pair2.second, this.f11953d);
                break;
        }
    }
}
