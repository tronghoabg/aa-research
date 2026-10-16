package com.google.android.libraries.e.b;

import com.google.d.b.an;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private Executor f5882a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.libraries.e.a.f f5883b;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.libraries.e.b.a.a f5885d = com.google.android.libraries.e.b.a.a.f5847a;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f5884c = new HashMap();

    public final k a() {
        return new k(this.f5882a, this.f5883b, this.f5885d, this.f5884c);
    }

    public final void b(y yVar) {
        String strB = yVar.b(c.f5850a);
        HashMap map = this.f5884c;
        an.q(!map.containsKey(strB), "There is already a factory registered for the ID %s", strB);
        map.put(strB, yVar);
    }

    public final void c(Executor executor) {
        this.f5882a = executor;
    }

    public final void d(com.google.android.libraries.e.a.f fVar) {
        this.f5883b = fVar;
    }
}
