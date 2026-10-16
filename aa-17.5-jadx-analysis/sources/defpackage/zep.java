package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zep implements zeq {
    public static final zep a;
    private static final /* synthetic */ zep[] b;

    static {
        zep zepVar = new zep();
        a = zepVar;
        b = new zep[]{zepVar};
    }

    private zep() {
    }

    public static zep valueOf(String str) {
        return (zep) Enum.valueOf(zep.class, str);
    }

    public static zep[] values() {
        return (zep[]) b.clone();
    }

    @Override // defpackage.zeq
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
