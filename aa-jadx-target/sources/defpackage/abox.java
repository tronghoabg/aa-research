package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abox<MessageT extends defpackage.abox<MessageT, BuilderT>, BuilderT extends defpackage.abor<MessageT, BuilderT>> extends defpackage.abng<MessageT, BuilderT> {
    private static final java.util.concurrent.ConcurrentMap a = new j$.util.concurrent.ConcurrentHashMap();
    public static final /* synthetic */ int am = 0;
    private int b = -1;
    protected defpackage.abqy al = defpackage.abqy.a;

    public static defpackage.abox A(defpackage.abox aboxVar, java.nio.ByteBuffer byteBuffer, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abox aboxVarC = C(aboxVar, defpackage.abny.M(byteBuffer), abolVar);
        U(aboxVarC);
        U(aboxVarC);
        return aboxVarC;
    }

    public static defpackage.abox B(defpackage.abox aboxVar, byte[] bArr, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abox aboxVarD = D(aboxVar, bArr, 0, bArr.length, abolVar);
        U(aboxVarD);
        return aboxVarD;
    }

    public static defpackage.abox C(defpackage.abox aboxVar, defpackage.abny abnyVar, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abox aboxVarU = aboxVar.u();
        try {
            defpackage.abqn abqnVarA = defpackage.abqg.a.a(aboxVarU);
            java.lang.Object abnzVar = abnyVar.k;
            if (abnzVar == null) {
                abnzVar = new defpackage.abnz(abnyVar);
            }
            abqnVarA.i(aboxVarU, (defpackage.abnz) abnzVar, abolVar);
            abqnVarA.g(aboxVarU);
            return aboxVarU;
        } catch (defpackage.abpp e) {
            if (e.a) {
                throw new defpackage.abpp(e);
            }
            throw e;
        } catch (defpackage.abqw e2) {
            throw e2.a();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof defpackage.abpp) {
                throw ((defpackage.abpp) e3.getCause());
            }
            throw new defpackage.abpp(e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof defpackage.abpp) {
                throw ((defpackage.abpp) e4.getCause());
            }
            throw e4;
        }
    }

    public static defpackage.abox D(defpackage.abox aboxVar, byte[] bArr, int i, int i2, defpackage.abol abolVar) throws defpackage.abpp {
        if (i2 == 0) {
            return aboxVar;
        }
        defpackage.abox aboxVarU = aboxVar.u();
        try {
            defpackage.abqn abqnVarA = defpackage.abqg.a.a(aboxVarU);
            abqnVarA.j(aboxVarU, bArr, i, i + i2, new defpackage.abnj(abolVar));
            abqnVarA.g(aboxVarU);
            return aboxVarU;
        } catch (defpackage.abpp e) {
            if (e.a) {
                throw new defpackage.abpp(e);
            }
            throw e;
        } catch (defpackage.abqw e2) {
            throw e2.a();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof defpackage.abpp) {
                throw ((defpackage.abpp) e3.getCause());
            }
            throw new defpackage.abpp(e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static abpa E(abpa abpaVar) {
        int size = abpaVar.size();
        return abpaVar.f(size + size);
    }

    public static abpe F(abpe abpeVar) {
        int size = abpeVar.size();
        return abpeVar.f(size + size);
    }

    public static defpackage.abpf G(defpackage.abpf abpfVar) {
        int size = abpfVar.size();
        return abpfVar.d(size + size);
    }

    public static defpackage.abpi H(defpackage.abpi abpiVar) {
        int size = abpiVar.size();
        return abpiVar.d(size + size);
    }

    public static defpackage.abpj I(defpackage.abpj abpjVar) {
        int size = abpjVar.size();
        return abpjVar.d(size + size);
    }

    public static <T extends defpackage.abox<T, ?>> abqe<T> L(java.lang.Class<T> cls) {
        java.util.concurrent.ConcurrentMap concurrentMap = a;
        java.lang.Object obj = concurrentMap.get(cls);
        if (obj == null) {
            r(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            throw new java.lang.IllegalStateException("Default instance cannot be null.");
        }
        if (obj instanceof abqe) {
            return (abqe) obj;
        }
        defpackage.abos abosVar = new defpackage.abos((defpackage.abox) obj);
        return concurrentMap.replace(cls, obj, abosVar) ? abosVar : (abqe) concurrentMap.get(cls);
    }

    protected static void P(java.lang.Class cls, defpackage.abox aboxVar) {
        aboxVar.O();
        a.put(cls, aboxVar);
    }

    public static final boolean S(defpackage.abox aboxVar, boolean z) {
        java.lang.Object objA = aboxVar.a(1, null);
        if (objA == null) {
            return true;
        }
        if (objA instanceof java.lang.Byte) {
            byte bByteValue = ((java.lang.Byte) objA).byteValue();
            if (bByteValue == 1) {
                return true;
            }
            if (bByteValue == 0) {
                return false;
            }
        }
        boolean zL = defpackage.abqg.a.a(aboxVar).l(aboxVar);
        if (z) {
            aboxVar.a(2, true == zL ? aboxVar : null);
        }
        return zL;
    }

    public static void U(defpackage.abox aboxVar) throws defpackage.abpp {
        if (aboxVar != null && !S(aboxVar, true)) {
            throw new defpackage.abqw().a();
        }
    }

    public static defpackage.aboj V(defpackage.abpy abpyVar, defpackage.abpy abpyVar2, int i, defpackage.abrf abrfVar) {
        return new defpackage.aboj(abpyVar, defpackage.abqh.b, abpyVar2, new defpackage.abow(null, i, abrfVar, true));
    }

    public static defpackage.aboj W(defpackage.abpy abpyVar, java.lang.Object obj, defpackage.abpy abpyVar2, defpackage.abpc abpcVar, int i, defpackage.abrf abrfVar) {
        return new defpackage.aboj(abpyVar, obj, abpyVar2, new defpackage.abow(abpcVar, i, abrfVar, false));
    }

    private final int b(defpackage.abqn abqnVar) {
        return abqnVar == null ? defpackage.abqg.a.a(this).a(this) : abqnVar.a(this);
    }

    static <T extends defpackage.abox> T r(java.lang.Class<T> cls) {
        java.util.concurrent.ConcurrentMap concurrentMap = a;
        java.lang.Object objS = concurrentMap.get(cls);
        if (objS == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                objS = concurrentMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (objS == null) {
            objS = ((defpackage.abox) defpackage.abrd.e(cls)).s();
            if (objS == null) {
                throw new java.lang.IllegalStateException();
            }
            concurrentMap.put(cls, objS);
        }
        if (objS instanceof defpackage.abox) {
            return (T) objS;
        }
        int i = defpackage.abos.b;
        return (T) ((defpackage.abos) objS).a;
    }

    public static defpackage.abox w(defpackage.abox aboxVar, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        defpackage.abox aboxVarC = C(aboxVar, defpackage.abny.M(byteBuffer), defpackage.abol.a);
        U(aboxVarC);
        U(aboxVarC);
        return aboxVarC;
    }

    public static defpackage.abox x(defpackage.abox aboxVar, byte[] bArr) throws defpackage.abpp {
        defpackage.abox aboxVarD = D(aboxVar, bArr, 0, bArr.length, defpackage.abol.a);
        U(aboxVarD);
        return aboxVarD;
    }

    public static defpackage.abox y(defpackage.abox aboxVar, defpackage.abnv abnvVar, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abny abnyVarG = abnvVar.g();
        defpackage.abox aboxVarC = C(aboxVar, abnyVarG, abolVar);
        abnyVarG.z(0);
        U(aboxVarC);
        return aboxVarC;
    }

    public static defpackage.abox z(defpackage.abox aboxVar, java.io.InputStream inputStream, defpackage.abol abolVar) throws defpackage.abpp {
        int i = defpackage.abny.l;
        defpackage.abox aboxVarC = C(aboxVar, new defpackage.abnx(inputStream), abolVar);
        U(aboxVarC);
        return aboxVarC;
    }

    @Override // defpackage.abpy
    public final abqe M() {
        return (abqe) a(7, null);
    }

    protected final void N() {
        defpackage.abqg.a.a(this).g(this);
        O();
    }

    final void O() {
        this.b &= Integer.MAX_VALUE;
    }

    final void Q(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bo(i, "serialized size must be non-negative, was "));
        }
        this.b = i | (this.b & Integer.MIN_VALUE);
    }

    @Override // defpackage.abpy
    public final void R(defpackage.abof abofVar) throws java.io.IOException {
        defpackage.abqn abqnVarA = defpackage.abqg.a.a(this);
        java.lang.Object kwvVar = abofVar.a;
        if (kwvVar == null) {
            kwvVar = new defpackage.kwv(abofVar);
        }
        abqnVarA.m(this, (defpackage.kwv) kwvVar);
    }

    public final boolean T() {
        return this.b < 0;
    }

    protected abstract java.lang.Object a(int i, java.lang.Object obj);

    @Override // defpackage.abng
    public final int e(defpackage.abqn abqnVar) {
        if (T()) {
            int iB = b(abqnVar);
            if (iB >= 0) {
                return iB;
            }
            throw new java.lang.IllegalStateException(defpackage.a.bo(iB, "serialized size must be non-negative, was "));
        }
        if (l() != Integer.MAX_VALUE) {
            return l();
        }
        int iB2 = b(abqnVar);
        Q(iB2);
        return iB2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return defpackage.abqg.a.a(this).k(this, (defpackage.abox) obj);
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
        return defpackage.abqg.a.a(this).b(this);
    }

    final int l() {
        return this.b & Integer.MAX_VALUE;
    }

    @Override // defpackage.abpy
    public final int m() {
        return e(null);
    }

    public final defpackage.abor n() {
        return (defpackage.abor) a(5, null);
    }

    public final defpackage.abor o(defpackage.abox aboxVar) {
        defpackage.abor aborVarN = n();
        aborVarN.w(aboxVar);
        return aborVarN;
    }

    @Override // defpackage.abpy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final defpackage.abor J() {
        return (defpackage.abor) a(5, null);
    }

    @Override // defpackage.abpy
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.abor K() {
        defpackage.abor aborVar = (defpackage.abor) a(5, null);
        aborVar.w(this);
        return aborVar;
    }

    @Override // defpackage.abpz
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final defpackage.abox s() {
        return (defpackage.abox) a(6, null);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        int i = defpackage.abqa.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        defpackage.abqa.b(this, sb, 0);
        return sb.toString();
    }

    final defpackage.abox u() {
        return (defpackage.abox) a(4, null);
    }

    @Override // defpackage.abpz
    public final boolean v() {
        return S(this, true);
    }
}
