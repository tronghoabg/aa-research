package com.google.v;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class de {

    /* renamed from: a, reason: collision with root package name */
    static final de f12840a = new de(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f12841b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile de f12842c = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f12843e = 1;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12844d;

    de() {
        this.f12844d = new HashMap();
    }

    public static de a() {
        return f12840a;
    }

    public static de b() {
        de deVar = f12842c;
        if (deVar != null) {
            return deVar;
        }
        synchronized (de.class) {
            de deVar2 = f12842c;
            if (deVar2 != null) {
                return deVar2;
            }
            de deVarB = dk.b(de.class);
            f12842c = deVarB;
            return deVarB;
        }
    }

    public static de c() {
        return new de();
    }

    static void f() {
    }

    public ds d(fi fiVar, int i2) {
        return (ds) this.f12844d.get(new dd(fiVar, i2));
    }

    public final void e(ds dsVar) {
        this.f12844d.put(new dd(dsVar.f12875a, dsVar.z()), dsVar);
    }

    de(byte[] bArr) {
        this.f12844d = Collections.EMPTY_MAP;
    }
}
