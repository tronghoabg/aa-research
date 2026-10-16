package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class abnh implements defpackage.abqe {
    private static final defpackage.abol a = defpackage.abol.a;

    private static final void m(defpackage.abpy abpyVar) throws defpackage.abpp {
        if (abpyVar != null && !abpyVar.v()) {
            throw new defpackage.abqw().a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abpy, java.lang.Object] */
    @Override // defpackage.abqe
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.abpy i(java.io.InputStream inputStream, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abny abnyVarL = defpackage.abny.L(inputStream);
        ?? L = l(abnyVarL, abolVar);
        abnyVarL.z(0);
        m(L);
        return L;
    }

    @Override // defpackage.abqe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.abpy j(byte[] bArr, defpackage.abol abolVar) throws defpackage.abpp {
        return k(bArr, 0, bArr.length, abolVar);
    }

    @Override // defpackage.abqe
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.abpy k(byte[] bArr, int i, int i2, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abpy abpyVarD = d(bArr, i, i2, abolVar);
        m(abpyVarD);
        return abpyVarD;
    }

    public defpackage.abpy d(byte[] bArr, int i, int i2, defpackage.abol abolVar) throws defpackage.abpp {
        throw null;
    }

    @Override // defpackage.abqe
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.io.InputStream inputStream) throws defpackage.abpp {
        return i(inputStream, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abpy, java.lang.Object] */
    @Override // defpackage.abqe
    public final /* bridge */ /* synthetic */ java.lang.Object f(java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        defpackage.abol abolVar = a;
        defpackage.abny abnyVarM = defpackage.abny.M(byteBuffer);
        ?? L = l(abnyVarM, abolVar);
        abnyVarM.z(0);
        m(L);
        return L;
    }

    @Override // defpackage.abqe
    public final /* bridge */ /* synthetic */ java.lang.Object g(byte[] bArr) throws defpackage.abpp {
        return j(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abpy, java.lang.Object] */
    @Override // defpackage.abqe
    public final /* bridge */ /* synthetic */ java.lang.Object h(defpackage.abny abnyVar, defpackage.abol abolVar) throws defpackage.abpp {
        ?? L = l(abnyVar, abolVar);
        m(L);
        return L;
    }
}
