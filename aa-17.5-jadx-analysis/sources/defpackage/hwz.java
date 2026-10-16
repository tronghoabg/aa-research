package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class hwz implements hui {
    private static final ifu b = new ifu(50);
    private final hui c;
    private final hui d;
    private final int e;
    private final int f;
    private final Class g;
    private final hum h;
    private final huq i;
    private final hxl j;

    public hwz(hxl hxlVar, hui huiVar, hui huiVar2, int i, int i2, huq huqVar, Class cls, hum humVar) {
        this.j = hxlVar;
        this.c = huiVar;
        this.d = huiVar2;
        this.e = i;
        this.f = i2;
        this.i = huqVar;
        this.g = cls;
        this.h = humVar;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        hxl hxlVar = this.j;
        byte[] bArr = (byte[]) hxlVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        huq huqVar = this.i;
        if (huqVar != null) {
            huqVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        ifu ifuVar = b;
        byte[] bytes = (byte[]) ifuVar.f(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            ifuVar.g(cls, bytes);
        }
        messageDigest.update(bytes);
        hxlVar.c(bArr);
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof hwz) {
            hwz hwzVar = (hwz) obj;
            if (this.f == hwzVar.f && this.e == hwzVar.e) {
                huq huqVar = this.i;
                huq huqVar2 = hwzVar.i;
                char[] cArr = ify.a;
                if (a.ao(huqVar, huqVar2) && this.g.equals(hwzVar.g) && this.c.equals(hwzVar.c) && this.d.equals(hwzVar.d) && this.h.equals(hwzVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        huq huqVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + this.e) * 31) + this.f;
        if (huqVar != null) {
            iHashCode2 = (iHashCode2 * 31) + huqVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        hum humVar = this.h;
        huq huqVar = this.i;
        Class cls = this.g;
        hui huiVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(huiVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(huqVar) + "', options=" + String.valueOf(humVar) + "}";
    }
}
