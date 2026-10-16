package s5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t extends AbstractC4000F {

    /* renamed from: a, reason: collision with root package name */
    public final long f45033a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f45034b;

    /* renamed from: c, reason: collision with root package name */
    public final p f45035c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45036d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f45037e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45038f;

    /* renamed from: g, reason: collision with root package name */
    public final long f45039g;

    /* renamed from: h, reason: collision with root package name */
    public final w f45040h;

    /* renamed from: i, reason: collision with root package name */
    public final q f45041i;

    public t(long j8, Integer num, p pVar, long j10, byte[] bArr, String str, long j11, w wVar, q qVar) {
        this.f45033a = j8;
        this.f45034b = num;
        this.f45035c = pVar;
        this.f45036d = j10;
        this.f45037e = bArr;
        this.f45038f = str;
        this.f45039g = j11;
        this.f45040h = wVar;
        this.f45041i = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4000F)) {
            return false;
        }
        AbstractC4000F abstractC4000F = (AbstractC4000F) obj;
        t tVar = (t) abstractC4000F;
        if (this.f45033a != tVar.f45033a) {
            return false;
        }
        Integer num = this.f45034b;
        if (num == null) {
            if (tVar.f45034b != null) {
                return false;
            }
        } else if (!num.equals(tVar.f45034b)) {
            return false;
        }
        p pVar = this.f45035c;
        if (pVar == null) {
            if (tVar.f45035c != null) {
                return false;
            }
        } else if (!pVar.equals(tVar.f45035c)) {
            return false;
        }
        if (this.f45036d != tVar.f45036d) {
            return false;
        }
        if (!Arrays.equals(this.f45037e, abstractC4000F instanceof t ? ((t) abstractC4000F).f45037e : tVar.f45037e)) {
            return false;
        }
        String str = tVar.f45038f;
        String str2 = this.f45038f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f45039g != tVar.f45039g) {
            return false;
        }
        w wVar = tVar.f45040h;
        w wVar2 = this.f45040h;
        if (wVar2 == null) {
            if (wVar != null) {
                return false;
            }
        } else if (!wVar2.equals(wVar)) {
            return false;
        }
        q qVar = tVar.f45041i;
        q qVar2 = this.f45041i;
        return qVar2 == null ? qVar == null : qVar2.equals(qVar);
    }

    public final int hashCode() {
        long j8 = this.f45033a;
        int i5 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f45034b;
        int iHashCode = (i5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f45035c;
        int iHashCode2 = (iHashCode ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        long j10 = this.f45036d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f45037e)) * 1000003;
        String str = this.f45038f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f45039g;
        int i10 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        w wVar = this.f45040h;
        int iHashCode5 = (i10 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f45041i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f45033a + ", eventCode=" + this.f45034b + ", complianceData=" + this.f45035c + ", eventUptimeMs=" + this.f45036d + ", sourceExtension=" + Arrays.toString(this.f45037e) + ", sourceExtensionJsonProto3=" + this.f45038f + ", timezoneOffsetSeconds=" + this.f45039g + ", networkConnectionInfo=" + this.f45040h + ", experimentIds=" + this.f45041i + "}";
    }
}
