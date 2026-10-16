package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class I extends Y {

    /* renamed from: c, reason: collision with root package name */
    public String f510c;

    /* renamed from: d, reason: collision with root package name */
    public String f511d;

    /* renamed from: e, reason: collision with root package name */
    public int f512e;

    /* renamed from: f, reason: collision with root package name */
    public String f513f;

    /* renamed from: g, reason: collision with root package name */
    public long f514g;

    /* renamed from: h, reason: collision with root package name */
    public long f515h;

    /* renamed from: i, reason: collision with root package name */
    public List f516i;

    /* renamed from: j, reason: collision with root package name */
    public String f517j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public String f518l;

    /* renamed from: m, reason: collision with root package name */
    public String f519m;

    /* renamed from: n, reason: collision with root package name */
    public String f520n;

    /* renamed from: o, reason: collision with root package name */
    public long f521o;

    /* renamed from: p, reason: collision with root package name */
    public String f522p;

    @Override // A7.Y
    public final boolean j0() {
        return true;
    }

    public final String k0() {
        h0();
        AbstractC1732v.i(this.f510c);
        return this.f510c;
    }

    public final String l0() {
        c0();
        h0();
        AbstractC1732v.i(this.f518l);
        return this.f518l;
    }

    public final void m0() {
        String str;
        c0();
        if (a0().n0().i(E0.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            b0().r1().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().f611m.c("Analytics Storage consent is not granted");
            str = null;
        }
        zzj().f611m.c("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f520n = str;
        ((C0273n0) this.f421a).f985n.getClass();
        this.f521o = System.currentTimeMillis();
    }
}
