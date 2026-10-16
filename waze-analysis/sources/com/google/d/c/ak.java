package com.google.d.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends SoftReference implements as {

    /* renamed from: a, reason: collision with root package name */
    final be f7298a;

    ak(ReferenceQueue referenceQueue, Object obj, be beVar) {
        super(obj, referenceQueue);
        this.f7298a = beVar;
    }

    @Override // com.google.d.c.as
    public final int a() {
        return 1;
    }

    @Override // com.google.d.c.as
    public final as b(ReferenceQueue referenceQueue, Object obj, be beVar) {
        return new ak(referenceQueue, obj, beVar);
    }

    @Override // com.google.d.c.as
    public final be c() {
        return this.f7298a;
    }

    @Override // com.google.d.c.as
    public final Object d() {
        return get();
    }

    @Override // com.google.d.c.as
    public final void e(Object obj) {
    }

    @Override // com.google.d.c.as
    public final boolean f() {
        return true;
    }

    @Override // com.google.d.c.as
    public final boolean g() {
        return false;
    }
}
