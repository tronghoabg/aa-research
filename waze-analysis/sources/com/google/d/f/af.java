package com.google.d.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class af {

    /* renamed from: c, reason: collision with root package name */
    public static final af f7679c = new ab();

    /* renamed from: d, reason: collision with root package name */
    public static final af f7680d = new ab();

    protected af() {
    }

    static af c(af afVar, af afVar2) {
        af afVar3;
        af afVar4;
        if (afVar != null) {
            if (afVar2 == null || afVar == (afVar3 = f7679c) || afVar2 == (afVar4 = f7680d)) {
                return afVar;
            }
            if (afVar2 != afVar3 && afVar != afVar4) {
                return new ac(afVar, afVar2);
            }
        }
        return afVar2;
    }

    protected abstract void b();
}
