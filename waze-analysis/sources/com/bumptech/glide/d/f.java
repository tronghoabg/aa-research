package com.bumptech.glide.d;

import com.bumptech.glide.load.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f2812a = new ArrayList();

    public f(byte[] bArr) {
    }

    public final synchronized v a(Class cls) {
        List list = this.f2812a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) list.get(i2);
            if (eVar.a(cls)) {
                return eVar.f2810a;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, v vVar) {
        this.f2812a.add(new e(cls, vVar));
    }

    public final synchronized com.bumptech.glide.load.b c(Class cls) {
        for (a aVar : this.f2812a) {
            if (aVar.a(cls)) {
                return aVar.f2800a;
            }
        }
        return null;
    }

    public final synchronized void d(Class cls, com.bumptech.glide.load.b bVar) {
        this.f2812a.add(new a(cls, bVar));
    }

    public f() {
    }
}
