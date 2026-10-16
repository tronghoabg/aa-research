package cf;

import E4.n;
import He.j;
import Le.d;
import Ze.e;
import Ze.f;

/* renamed from: cf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1607a implements Je.b, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f19843a;

    /* renamed from: b, reason: collision with root package name */
    public final C1608b f19844b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19845c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19846d;

    /* renamed from: e, reason: collision with root package name */
    public n f19847e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19848f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f19849g;

    /* renamed from: h, reason: collision with root package name */
    public long f19850h;

    public C1607a(j jVar, C1608b c1608b) {
        this.f19843a = jVar;
        this.f19844b = c1608b;
    }

    public final void a() {
        n nVar;
        Object obj;
        while (!this.f19849g) {
            synchronized (this) {
                try {
                    nVar = this.f19847e;
                    if (nVar == null) {
                        this.f19846d = false;
                        return;
                    }
                    this.f19847e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Object[] objArr = (Object[]) nVar.f2939c; objArr != null; objArr = objArr[4]) {
                for (int i5 = 0; i5 < 4 && (obj = objArr[i5]) != null; i5++) {
                    if (test(obj)) {
                        break;
                    }
                }
            }
        }
    }

    public final void b(long j8, Object obj) {
        if (this.f19849g) {
            return;
        }
        if (!this.f19848f) {
            synchronized (this) {
                try {
                    if (this.f19849g) {
                        return;
                    }
                    if (this.f19850h == j8) {
                        return;
                    }
                    if (this.f19846d) {
                        n nVar = this.f19847e;
                        if (nVar == null) {
                            nVar = new n(9, (char) 0);
                            this.f19847e = nVar;
                        }
                        int i5 = nVar.f2938b;
                        if (i5 == 4) {
                            Object[] objArr = new Object[5];
                            ((Object[]) nVar.f2940d)[4] = objArr;
                            nVar.f2940d = objArr;
                            i5 = 0;
                        }
                        ((Object[]) nVar.f2940d)[i5] = obj;
                        nVar.f2938b = i5 + 1;
                        return;
                    }
                    this.f19845c = true;
                    this.f19848f = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f19849g) {
            return;
        }
        this.f19849g = true;
        this.f19844b.e(this);
    }

    @Override // Le.d
    public final boolean test(Object obj) {
        if (this.f19849g) {
            return true;
        }
        j jVar = this.f19843a;
        if (obj == f.f17087a) {
            jVar.onComplete();
            return true;
        }
        if (obj instanceof e) {
            jVar.onError(((e) obj).f17086a);
            return true;
        }
        jVar.b(obj);
        return false;
    }
}
