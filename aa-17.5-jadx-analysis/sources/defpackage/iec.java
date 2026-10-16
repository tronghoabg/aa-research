package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* loaded from: classes2.dex */
public class iec implements Cloneable {
    private int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Resources.Theme r;
    public boolean s;
    public boolean u;
    private Drawable v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float b = 1.0f;
    public hwf c = hwf.d;
    public hsh d = hsh.c;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public hui l = ifi.b;
    public boolean n = true;
    public hum o = new hum();
    public Map p = new ifm();
    public Class q = Object.class;
    public boolean t = true;

    private final iec a(iaw iawVar, huq huqVar, boolean z) {
        iec iecVarQ = z ? Q(iawVar, huqVar) : F(iawVar, huqVar);
        iecVarQ.t = true;
        return iecVarQ;
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    public iec A() {
        return a(iaw.b, new ibe(), true);
    }

    public iec B(hty htyVar) {
        return L(iaz.a, htyVar).L(ics.a, htyVar);
    }

    public iec C() {
        return F(iaw.d, new iai());
    }

    public iec D() {
        return a(iaw.c, new iaj(), false);
    }

    public iec E() {
        return a(iaw.b, new ibe(), false);
    }

    final iec F(iaw iawVar, huq huqVar) {
        if (this.s) {
            return o().F(iawVar, huqVar);
        }
        x(iawVar);
        return P(huqVar, false);
    }

    public iec G(int i, int i2) {
        if (this.s) {
            return o().G(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        W();
        return this;
    }

    public iec H(int i) {
        if (this.s) {
            return o().H(i);
        }
        this.h = i;
        int i2 = this.a | 128;
        this.g = null;
        this.a = i2 & (-65);
        W();
        return this;
    }

    public iec I(Drawable drawable) {
        if (this.s) {
            return o().I(drawable);
        }
        this.g = drawable;
        int i = this.a | 64;
        this.h = 0;
        this.a = i & (-129);
        W();
        return this;
    }

    public iec J(hsh hshVar) {
        if (this.s) {
            return o().J(hshVar);
        }
        this.d = hshVar;
        this.a |= 8;
        W();
        return this;
    }

    final iec K(hul hulVar) {
        if (this.s) {
            return o().K(hulVar);
        }
        this.o.b.remove(hulVar);
        W();
        return this;
    }

    public iec L(hul hulVar, Object obj) {
        if (this.s) {
            return o().L(hulVar, obj);
        }
        a.al(hulVar, "Argument must not be null");
        this.o.d(hulVar, obj);
        W();
        return this;
    }

    public iec M(hui huiVar) {
        if (this.s) {
            return o().M(huiVar);
        }
        this.l = huiVar;
        this.a |= 1024;
        W();
        return this;
    }

    public iec N(Resources.Theme theme) {
        if (this.s) {
            return o().N(theme);
        }
        this.r = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | 32768;
            return L(ici.a, theme);
        }
        this.a = (-32769) & i;
        return K(ici.a);
    }

    public iec O(huq huqVar) {
        return P(huqVar, true);
    }

    public final iec P(huq huqVar, boolean z) {
        if (this.s) {
            return o().P(huqVar, z);
        }
        ibc ibcVar = new ibc(huqVar, z);
        R(Bitmap.class, huqVar, z);
        R(Drawable.class, ibcVar, z);
        R(BitmapDrawable.class, ibcVar, z);
        R(icm.class, new icp(huqVar), z);
        W();
        return this;
    }

    final iec Q(iaw iawVar, huq huqVar) {
        if (this.s) {
            return o().Q(iawVar, huqVar);
        }
        x(iawVar);
        return O(huqVar);
    }

    final iec R(Class cls, huq huqVar, boolean z) {
        if (this.s) {
            return o().R(cls, huqVar, z);
        }
        this.p.put(cls, huqVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.t = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        W();
        return this;
    }

    public final boolean S(iec iecVar) {
        if (Float.compare(iecVar.b, this.b) != 0 || this.f != iecVar.f) {
            return false;
        }
        Drawable drawable = this.e;
        Drawable drawable2 = iecVar.e;
        char[] cArr = ify.a;
        if (!a.ao(drawable, drawable2) || this.h != iecVar.h || !a.ao(this.g, iecVar.g)) {
            return false;
        }
        int i = iecVar.w;
        Drawable drawable3 = iecVar.v;
        if (!a.ao(null, null) || this.i != iecVar.i || this.j != iecVar.j || this.k != iecVar.k || this.m != iecVar.m || this.n != iecVar.n) {
            return false;
        }
        boolean z = iecVar.y;
        boolean z2 = iecVar.z;
        return this.c.equals(iecVar.c) && this.d == iecVar.d && this.o.equals(iecVar.o) && this.p.equals(iecVar.p) && this.q.equals(iecVar.q) && a.ao(this.l, iecVar.l) && a.ao(this.r, iecVar.r);
    }

    public final boolean T(int i) {
        return b(this.a, i);
    }

    public final boolean U() {
        return ify.j(this.k, this.j);
    }

    public iec V() {
        if (this.s) {
            return o().V();
        }
        this.u = true;
        this.a |= 1048576;
        W();
        return this;
    }

    protected final void W() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public iec X() {
        if (this.s) {
            return o().X();
        }
        this.i = false;
        this.a |= 256;
        W();
        return this;
    }

    public void Y() {
        this.x = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof iec) {
            return S((iec) obj);
        }
        return false;
    }

    public int hashCode() {
        float f = this.b;
        char[] cArr = ify.a;
        return ify.c(this.r, ify.c(this.l, ify.c(this.q, ify.c(this.p, ify.c(this.o, ify.c(this.d, ify.c(this.c, ((((((((((ify.c(null, ify.c(this.g, (ify.c(this.e, ((Float.floatToIntBits(f) + 527) * 31) + this.f) * 31) + this.h) * 31) * 31) + (this.i ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 961)))))));
    }

    public iec n(iec iecVar) {
        if (this.s) {
            return o().n(iecVar);
        }
        int i = iecVar.a;
        if (b(i, 2)) {
            this.b = iecVar.b;
        }
        if (b(i, 262144)) {
            boolean z = iecVar.y;
            this.y = false;
        }
        if (b(i, 1048576)) {
            this.u = iecVar.u;
        }
        if (b(i, 4)) {
            this.c = iecVar.c;
        }
        if (b(i, 8)) {
            this.d = iecVar.d;
        }
        if (b(i, 16)) {
            this.e = iecVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (b(iecVar.a, 32)) {
            this.f = iecVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (b(iecVar.a, 64)) {
            this.g = iecVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (b(iecVar.a, 128)) {
            this.h = iecVar.h;
            this.g = null;
            this.a &= -65;
        }
        int i2 = iecVar.a;
        if (b(i2, 256)) {
            this.i = iecVar.i;
        }
        if (b(i2, sk.AUDIO_CONTENT_BUFFER_SIZE)) {
            this.k = iecVar.k;
            this.j = iecVar.j;
        }
        if (b(i2, 1024)) {
            this.l = iecVar.l;
        }
        if (b(i2, 4096)) {
            this.q = iecVar.q;
        }
        if (b(i2, 8192)) {
            Drawable drawable = iecVar.v;
            this.v = null;
            this.w = 0;
            this.a &= -16385;
        }
        if (b(iecVar.a, 16384)) {
            int i3 = iecVar.w;
            this.w = 0;
            this.v = null;
            this.a &= -8193;
        }
        int i4 = iecVar.a;
        if (b(i4, 32768)) {
            this.r = iecVar.r;
        }
        if (b(i4, 65536)) {
            this.n = iecVar.n;
        }
        if (b(i4, 131072)) {
            this.m = iecVar.m;
        }
        if (b(i4, 2048)) {
            this.p.putAll(iecVar.p);
            this.t = iecVar.t;
        }
        if (b(iecVar.a, 524288)) {
            boolean z2 = iecVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.p.clear();
            int i5 = this.a;
            this.m = false;
            this.a = i5 & (-133121);
            this.t = true;
        }
        this.a |= iecVar.a;
        this.o.c(iecVar.o);
        W();
        return this;
    }

    @Override // 
    public iec o() {
        try {
            iec iecVar = (iec) super.clone();
            hum humVar = new hum();
            iecVar.o = humVar;
            humVar.c(this.o);
            ifm ifmVar = new ifm();
            iecVar.p = ifmVar;
            ifmVar.putAll(this.p);
            iecVar.x = false;
            iecVar.s = false;
            return iecVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public iec t() {
        if (this.x && !this.s) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.s = true;
        Y();
        return this;
    }

    public iec u() {
        return Q(iaw.c, new iak());
    }

    public iec v(Class cls) {
        if (this.s) {
            return o().v(cls);
        }
        this.q = cls;
        this.a |= 4096;
        W();
        return this;
    }

    public iec w(hwf hwfVar) {
        if (this.s) {
            return o().w(hwfVar);
        }
        this.c = hwfVar;
        this.a |= 4;
        W();
        return this;
    }

    public iec x(iaw iawVar) {
        hul hulVar = iaw.g;
        a.al(iawVar, "Argument must not be null");
        return L(hulVar, iawVar);
    }

    public iec y(int i) {
        if (this.s) {
            return o().y(i);
        }
        this.f = i;
        int i2 = this.a | 32;
        this.e = null;
        this.a = i2 & (-17);
        W();
        return this;
    }

    public iec z(Drawable drawable) {
        if (this.s) {
            return o().z(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.f = 0;
        this.a = i & (-33);
        W();
        return this;
    }
}
