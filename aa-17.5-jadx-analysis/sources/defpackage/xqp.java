package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xqp {
    public static final bwq a;
    public static final xqp b;
    public static final xqp c;
    public static final xqp d;
    public static final xqp e;
    private static final /* synthetic */ xqp[] g;
    public final int f;

    static {
        xqp xqpVar = new xqp("HIDDEN", 0, 0);
        b = xqpVar;
        xqp xqpVar2 = new xqp("ENTRY", 1, 1);
        c = xqpVar2;
        xqp xqpVar3 = new xqp("LOOP", 2, 2);
        d = xqpVar3;
        xqp xqpVar4 = new xqp("EXIT", 3, 3);
        e = xqpVar4;
        xqp[] xqpVarArr = {xqpVar, xqpVar2, xqpVar3, xqpVar4};
        g = xqpVarArr;
        affa.p(xqpVarArr);
        a = new ParcelableSnapshotMutableState(false, bxp.c);
    }

    private xqp(String str, int i, int i2) {
        this.f = i2;
    }

    public static xqp valueOf(String str) {
        return (xqp) Enum.valueOf(xqp.class, str);
    }

    public static xqp[] values() {
        return (xqp[]) g.clone();
    }
}
