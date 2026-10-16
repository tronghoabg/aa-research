package com.google.d.m.a;

import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final String f8028a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Logger f8029b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.v f8030c = new com.waze.car_lib.b.v((char[]) null);

    bl(Class cls) {
        this.f8028a = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f8029b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f8030c) {
            Logger logger2 = this.f8029b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f8028a);
            this.f8029b = logger3;
            return logger3;
        }
    }
}
