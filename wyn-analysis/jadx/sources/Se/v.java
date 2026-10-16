package Se;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class v extends AtomicInteger implements Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.h f11108a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.d f11109b;

    /* renamed from: c, reason: collision with root package name */
    public final w[] f11110c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f11111d;

    public v(He.h hVar, int i5, x4.d dVar) {
        super(i5);
        this.f11108a = hVar;
        this.f11109b = dVar;
        w[] wVarArr = new w[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            wVarArr[i10] = new w(this, i10);
        }
        this.f11110c = wVarArr;
        this.f11111d = new Object[i5];
    }

    public final void a(int i5) {
        w[] wVarArr = this.f11110c;
        int length = wVarArr.length;
        for (int i10 = 0; i10 < i5; i10++) {
            w wVar = wVarArr[i10];
            wVar.getClass();
            Me.a.a(wVar);
        }
        while (true) {
            i5++;
            if (i5 >= length) {
                return;
            }
            w wVar2 = wVarArr[i5];
            wVar2.getClass();
            Me.a.a(wVar2);
        }
    }

    @Override // Je.b
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (w wVar : this.f11110c) {
                wVar.getClass();
                Me.a.a(wVar);
            }
        }
    }
}
