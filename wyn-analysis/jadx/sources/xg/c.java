package xg;

import a9.C1341a;
import j$.util.concurrent.ConcurrentHashMap;
import od.K;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47899a;

    /* renamed from: b, reason: collision with root package name */
    public final vg.a f47900b;

    public c(int i5) {
        this.f47899a = i5;
        switch (i5) {
            case 1:
                this.f47900b = new K();
                new ConcurrentHashMap();
                new ThreadLocal();
                new a();
                break;
            default:
                this.f47900b = new C1341a();
                new ConcurrentHashMap();
                break;
        }
    }
}
