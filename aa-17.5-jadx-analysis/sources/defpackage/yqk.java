package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class yqk {
    private static final yqk a = new yqe();

    public static yqk g(ypt yptVar, ypt yptVar2) {
        int iB = yptVar2.b();
        return iB == 0 ? a : iB <= 28 ? new yqi(yptVar, yptVar2) : new yqj(yptVar, yptVar2);
    }

    public abstract int a();

    public abstract Object b(yos yosVar);

    public abstract Set c();

    public abstract void d(yqa yqaVar, Object obj);
}
