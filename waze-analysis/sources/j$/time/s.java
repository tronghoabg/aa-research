package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s extends ZoneId {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50031d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    public final String f50032b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ZoneRules f50033c;

    public s(String str, ZoneRules zoneRules) {
        this.f50032b = str;
        this.f50033c = zoneRules;
    }

    public static s P(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        ZoneRules zoneRulesA = null;
        if (length < 2) {
            f.h("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            return null;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i2 == 0) && ((cCharAt < '0' || cCharAt > '9' || i2 == 0) && ((cCharAt != '~' || i2 == 0) && ((cCharAt != '.' || i2 == 0) && ((cCharAt != '_' || i2 == 0) && ((cCharAt != '+' || i2 == 0) && (cCharAt != '-' || i2 == 0))))))))) {
                f.h("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                return null;
            }
        }
        try {
            zoneRulesA = j$.time.zone.g.a(str);
        } catch (j$.time.zone.e e2) {
            if (z) {
                throw e2;
            }
        }
        return new s(str, zoneRulesA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final void O(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f50032b);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f50032b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f50033c;
        return zoneRules != null ? zoneRules : j$.time.zone.g.a(this.f50032b);
    }
}
