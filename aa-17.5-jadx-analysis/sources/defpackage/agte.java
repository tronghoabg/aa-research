package defpackage;

import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class agte {
    private final EnumMap<agrv, agsq> defaultQualifiers;

    public agte(EnumMap<agrv, agsq> enumMap) {
        enumMap.getClass();
        this.defaultQualifiers = enumMap;
    }

    public final agsq get(agrv agrvVar) {
        return this.defaultQualifiers.get(agrvVar);
    }

    public final EnumMap<agrv, agsq> getDefaultQualifiers() {
        return this.defaultQualifiers;
    }
}
