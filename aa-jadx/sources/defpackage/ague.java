package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ague {
    private final java.util.EnumMap<defpackage.agsv, defpackage.agtq> defaultQualifiers;

    public ague(java.util.EnumMap<defpackage.agsv, defpackage.agtq> enumMap) {
        enumMap.getClass();
        this.defaultQualifiers = enumMap;
    }

    public final defpackage.agtq get(defpackage.agsv agsvVar) {
        return this.defaultQualifiers.get(agsvVar);
    }

    public final java.util.EnumMap<defpackage.agsv, defpackage.agtq> getDefaultQualifiers() {
        return this.defaultQualifiers;
    }
}
