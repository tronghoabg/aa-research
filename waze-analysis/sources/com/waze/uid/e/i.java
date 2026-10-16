package com.waze.uid.e;

import com.waze.uid.b.m;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class i extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f44490a;

    public i(b bVar, h hVar, m mVar) {
        super("InputPasswordOrEmailFlow", bVar, hVar, mVar);
        this.f44490a = new HashMap();
    }

    @Override // com.waze.uid.e.c
    protected final f a() {
        f fVar = (f) this.f44490a.get(b());
        if (fVar == null) {
            return null;
        }
        return fVar;
    }

    protected abstract Object b();

    public final void c(Object obj, f fVar) {
        this.f44490a.put(obj, fVar);
    }
}
