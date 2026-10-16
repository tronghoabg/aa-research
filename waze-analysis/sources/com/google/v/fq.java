package com.google.v;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fq {

    /* renamed from: a, reason: collision with root package name */
    private static final fq f12972a = new fq();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f12973b = new ConcurrentHashMap();

    private fq() {
        dl.a();
    }

    static fq a() {
        return f12972a;
    }

    private <T extends du> ft<T> d(Class<T> cls) {
        ft<T> ftVarM;
        int i2 = fu.f12982a;
        du.class.isAssignableFrom(cls);
        if (!du.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            fg fgVar = (fg) du.getDefaultInstance(cls.asSubclass(du.class)).buildMessageInfo();
            if (fgVar.b()) {
                ftVarM = fm.c(fu.m(), df.a(), fgVar.a());
            } else {
                ftVarM = fl.m(fgVar, fu.m(), fgVar.c() + (-1) != 1 ? df.a() : null);
            }
            ft<T> ftVar = (ft) this.f12973b.putIfAbsent(cls, ftVarM);
            return ftVar != null ? ftVar : ftVarM;
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    final ft b(du duVar) {
        return c(duVar.getClass());
    }

    final ft c(Class cls) {
        Object obj = this.f12973b.get(cls);
        return obj == null ? d(cls) : (ft) obj;
    }
}
