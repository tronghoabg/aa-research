package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a extends b implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f49832c;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneId f49833b;

    static {
        System.currentTimeMillis();
        f49832c = new a(ZoneOffset.UTC);
    }

    public a(ZoneId zoneId) {
        this.f49833b = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f49833b.equals(((a) obj).f49833b);
    }

    public final int hashCode() {
        return this.f49833b.hashCode() + 1;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.h.a("SystemClock[", String.valueOf(this.f49833b), "]");
    }
}
