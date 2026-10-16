package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aiss {
    public static final aiss a;
    public static final aiss b;
    public static final aiss c;
    public static final aiss d;
    public static final aiss e;
    public static final aiss f;
    public static final aiss g;
    private static final /* synthetic */ aiss[] i;
    public final TimeUnit h;

    static {
        aiss aissVar = new aiss("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = aissVar;
        aiss aissVar2 = new aiss("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = aissVar2;
        aiss aissVar3 = new aiss("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = aissVar3;
        aiss aissVar4 = new aiss("SECONDS", 3, TimeUnit.SECONDS);
        d = aissVar4;
        aiss aissVar5 = new aiss("MINUTES", 4, TimeUnit.MINUTES);
        e = aissVar5;
        aiss aissVar6 = new aiss("HOURS", 5, TimeUnit.HOURS);
        f = aissVar6;
        aiss aissVar7 = new aiss("DAYS", 6, TimeUnit.DAYS);
        g = aissVar7;
        aiss[] aissVarArr = {aissVar, aissVar2, aissVar3, aissVar4, aissVar5, aissVar6, aissVar7};
        i = aissVarArr;
        affa.p(aissVarArr);
    }

    private aiss(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static aiss valueOf(String str) {
        return (aiss) Enum.valueOf(aiss.class, str);
    }

    public static aiss[] values() {
        return (aiss[]) i.clone();
    }
}
