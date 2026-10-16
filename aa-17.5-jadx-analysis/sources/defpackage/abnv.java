package defpackage;

import androidx.car.app.model.Alert;
import defpackage.abnp;
import defpackage.abnv;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public abstract class abnv<MessageT extends abnv<MessageT, BuilderT>, BuilderT extends abnp<MessageT, BuilderT>> extends abmd<MessageT, BuilderT> {
    private static final ConcurrentMap a = new ConcurrentHashMap();
    public static final /* synthetic */ int am = 0;
    private int b = -1;
    protected abpw al = abpw.a;

    public static abnv A(abnv abnvVar, ByteBuffer byteBuffer, abnj abnjVar) throws abon {
        abnv abnvVarC = C(abnvVar, abmw.O(byteBuffer), abnjVar);
        U(abnvVarC);
        U(abnvVarC);
        return abnvVarC;
    }

    public static abnv B(abnv abnvVar, byte[] bArr, abnj abnjVar) throws abon {
        abnv abnvVarD = D(abnvVar, bArr, 0, bArr.length, abnjVar);
        U(abnvVarD);
        return abnvVarD;
    }

    public static abnv C(abnv abnvVar, abmw abmwVar, abnj abnjVar) throws abon {
        abnv abnvVarU = abnvVar.u();
        try {
            abpl abplVarA = abpe.a.a(abnvVarU);
            Object abmxVar = abmwVar.k;
            if (abmxVar == null) {
                abmxVar = new abmx(abmwVar);
            }
            abplVarA.i(abnvVarU, (abmx) abmxVar, abnjVar);
            abplVarA.g(abnvVarU);
            return abnvVarU;
        } catch (abon e) {
            if (e.a) {
                throw new abon(e);
            }
            throw e;
        } catch (abpu e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof abon) {
                throw ((abon) e3.getCause());
            }
            throw new abon(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof abon) {
                throw ((abon) e4.getCause());
            }
            throw e4;
        }
    }

    public static abnv D(abnv abnvVar, byte[] bArr, int i, int i2, abnj abnjVar) throws abon {
        if (i2 == 0) {
            return abnvVar;
        }
        abnv abnvVarU = abnvVar.u();
        try {
            abpl abplVarA = abpe.a.a(abnvVarU);
            abplVarA.j(abnvVarU, bArr, i, i + i2, new abmg(abnjVar));
            abplVarA.g(abnvVarU);
            return abnvVarU;
        } catch (abon e) {
            if (e.a) {
                throw new abon(e);
            }
            throw e;
        } catch (abpu e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof abon) {
                throw ((abon) e3.getCause());
            }
            throw new abon(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static abny E(abny abnyVar) {
        int size = abnyVar.size();
        return abnyVar.f(size + size);
    }

    public static aboc F(aboc abocVar) {
        int size = abocVar.size();
        return abocVar.d(size + size);
    }

    public static abod G(abod abodVar) {
        int size = abodVar.size();
        return abodVar.d(size + size);
    }

    public static abog H(abog abogVar) {
        int size = abogVar.size();
        return abogVar.d(size + size);
    }

    public static aboh I(aboh abohVar) {
        int size = abohVar.size();
        return abohVar.d(size + size);
    }

    public static <T extends abnv<T, ?>> abpc<T> L(Class<T> cls) throws ClassNotFoundException {
        ConcurrentMap concurrentMap = a;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            r(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            throw new IllegalStateException("Default instance cannot be null.");
        }
        if (obj instanceof abpc) {
            return (abpc) obj;
        }
        abnq abnqVar = new abnq((abnv) obj);
        return concurrentMap.replace(cls, obj, abnqVar) ? abnqVar : (abpc) concurrentMap.get(cls);
    }

    protected static void P(Class cls, abnv abnvVar) {
        abnvVar.O();
        a.put(cls, abnvVar);
    }

    public static final boolean S(abnv abnvVar, boolean z) {
        Object objA = abnvVar.a(1, null);
        if (objA == null) {
            return true;
        }
        if (objA instanceof Byte) {
            byte bByteValue = ((Byte) objA).byteValue();
            if (bByteValue == 1) {
                return true;
            }
            if (bByteValue == 0) {
                return false;
            }
        }
        boolean zL = abpe.a.a(abnvVar).l(abnvVar);
        if (z) {
            abnvVar.a(2, true == zL ? abnvVar : null);
        }
        return zL;
    }

    public static void U(abnv abnvVar) throws abon {
        if (abnvVar != null && !S(abnvVar, true)) {
            throw new abpu().a();
        }
    }

    public static abnh V(abow abowVar, abow abowVar2, int i, abqd abqdVar) {
        return new abnh(abowVar, abpf.b, abowVar2, new abnu(null, i, abqdVar, true));
    }

    public static abnh W(abow abowVar, Object obj, abow abowVar2, aboa aboaVar, int i, abqd abqdVar) {
        return new abnh(abowVar, obj, abowVar2, new abnu(aboaVar, i, abqdVar, false));
    }

    private final int b(abpl abplVar) {
        return abplVar == null ? abpe.a.a(this).a(this) : abplVar.a(this);
    }

    static <T extends abnv> T r(Class<T> cls) throws ClassNotFoundException {
        ConcurrentMap concurrentMap = a;
        Object objS = concurrentMap.get(cls);
        if (objS == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                objS = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (objS == null) {
            objS = ((abnv) abqb.e(cls)).s();
            if (objS == null) {
                throw new IllegalStateException();
            }
            concurrentMap.put(cls, objS);
        }
        if (objS instanceof abnv) {
            return (T) objS;
        }
        int i = abnq.b;
        return (T) ((abnq) objS).a;
    }

    public static abnv w(abnv abnvVar, ByteBuffer byteBuffer) throws abon {
        abnv abnvVarC = C(abnvVar, abmw.O(byteBuffer), abnj.a);
        U(abnvVarC);
        U(abnvVarC);
        return abnvVarC;
    }

    public static abnv x(abnv abnvVar, byte[] bArr) throws abon {
        abnv abnvVarD = D(abnvVar, bArr, 0, bArr.length, abnj.a);
        U(abnvVarD);
        return abnvVarD;
    }

    public static abnv y(abnv abnvVar, abms abmsVar, abnj abnjVar) throws abon {
        abmw abmwVarG = abmsVar.g();
        abnv abnvVarC = C(abnvVar, abmwVarG, abnjVar);
        abmwVarG.C(0);
        U(abnvVarC);
        return abnvVarC;
    }

    public static abnv z(abnv abnvVar, InputStream inputStream, abnj abnjVar) throws abon {
        int i = abmw.l;
        abnv abnvVarC = C(abnvVar, new abmv(inputStream), abnjVar);
        U(abnvVarC);
        return abnvVarC;
    }

    @Override // defpackage.abow
    public final abpc M() {
        return (abpc) a(7, null);
    }

    protected final void N() {
        abpe.a.a(this).g(this);
        O();
    }

    final void O() {
        this.b &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    final void Q(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.bp(i, "serialized size must be non-negative, was "));
        }
        this.b = i | (this.b & Integer.MIN_VALUE);
    }

    @Override // defpackage.abow
    public final void R(abnd abndVar) throws IOException {
        abpl abplVarA = abpe.a.a(this);
        Object ldsVar = abndVar.a;
        if (ldsVar == null) {
            ldsVar = new lds(abndVar);
        }
        abplVarA.m(this, (lds) ldsVar);
    }

    public final boolean T() {
        return this.b < 0;
    }

    protected abstract Object a(int i, Object obj);

    @Override // defpackage.abmd
    public final int e(abpl abplVar) {
        if (T()) {
            int iB = b(abplVar);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(a.bp(iB, "serialized size must be non-negative, was "));
        }
        if (l() != Integer.MAX_VALUE) {
            return l();
        }
        int iB2 = b(abplVar);
        Q(iB2);
        return iB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return abpe.a.a(this).k(this, (abnv) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (T()) {
            return k();
        }
        int i = this.ak;
        if (i != 0) {
            return i;
        }
        int iK = k();
        this.ak = iK;
        return iK;
    }

    final int k() {
        return abpe.a.a(this).b(this);
    }

    final int l() {
        return this.b & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.abow
    public final int m() {
        return e(null);
    }

    public final abnp n() {
        return (abnp) a(5, null);
    }

    public final abnp o(abnv abnvVar) {
        abnp abnpVarN = n();
        abnpVarN.w(abnvVar);
        return abnpVarN;
    }

    @Override // defpackage.abow
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final abnp J() {
        return (abnp) a(5, null);
    }

    @Override // defpackage.abow
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final abnp K() {
        abnp abnpVar = (abnp) a(5, null);
        abnpVar.w(this);
        return abnpVar;
    }

    @Override // defpackage.abox
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final abnv s() {
        return (abnv) a(6, null);
    }

    public final String toString() {
        String string = super.toString();
        int i = aboy.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        aboy.b(this, sb, 0);
        return sb.toString();
    }

    final abnv u() {
        return (abnv) a(4, null);
    }

    @Override // defpackage.abox
    public final boolean v() {
        return S(this, true);
    }
}
