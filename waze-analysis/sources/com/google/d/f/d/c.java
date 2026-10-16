package com.google.d.f.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f7831a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.f.b.c f7832b;

    protected c(com.google.d.f.b.c cVar, int i2) {
        if (cVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i2 >= 0) {
            this.f7831a = i2;
            this.f7832b = cVar;
        } else {
            throw new IllegalArgumentException("invalid index: " + i2);
        }
    }

    protected abstract void b(com.google.d.f.b.a aVar, Object obj);

    public final int c() {
        return this.f7831a;
    }

    protected final com.google.d.f.b.c d() {
        return this.f7832b;
    }

    public final void e(com.google.d.f.b.a aVar, Object[] objArr) {
        int i2 = this.f7831a;
        if (i2 >= objArr.length) {
            aVar.e();
            return;
        }
        Object obj = objArr[i2];
        if (obj != null) {
            b(aVar, obj);
        } else {
            aVar.f();
        }
    }
}
