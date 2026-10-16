package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hwp implements hui {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final hui g;
    private final Map h;
    private final hum i;
    private int j;

    public hwp(Object obj, hui huiVar, int i, int i2, Map map, Class cls, Class cls2, hum humVar) {
        a.al(obj, "Argument must not be null");
        this.b = obj;
        a.al(huiVar, "Signature must not be null");
        this.g = huiVar;
        this.c = i;
        this.d = i2;
        a.al(map, "Argument must not be null");
        this.h = map;
        a.al(cls, "Resource class must not be null");
        this.e = cls;
        a.al(cls2, "Transcode class must not be null");
        this.f = cls2;
        a.al(humVar, "Argument must not be null");
        this.i = humVar;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof hwp) {
            hwp hwpVar = (hwp) obj;
            if (this.b.equals(hwpVar.b) && this.g.equals(hwpVar.g) && this.d == hwpVar.d && this.c == hwpVar.c && this.h.equals(hwpVar.h) && this.e.equals(hwpVar.e) && this.f.equals(hwpVar.f) && this.i.equals(hwpVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        hum humVar = this.i;
        Map map = this.h;
        hui huiVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + huiVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + humVar.toString() + "}";
    }
}
