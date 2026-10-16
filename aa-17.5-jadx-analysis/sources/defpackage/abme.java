package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class abme implements abpc {
    private static final abnj a = abnj.a;

    private static final void m(abow abowVar) throws abon {
        if (abowVar != null && !abowVar.v()) {
            throw new abpu().a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abow, java.lang.Object] */
    @Override // defpackage.abpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abow i(InputStream inputStream, abnj abnjVar) throws abon {
        abmw abmwVarN = abmw.N(inputStream);
        ?? L = l(abmwVarN, abnjVar);
        abmwVarN.C(0);
        m(L);
        return L;
    }

    @Override // defpackage.abpc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final abow j(byte[] bArr, abnj abnjVar) throws abon {
        return k(bArr, 0, bArr.length, abnjVar);
    }

    @Override // defpackage.abpc
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final abow k(byte[] bArr, int i, int i2, abnj abnjVar) throws abon {
        abow abowVarD = d(bArr, i, i2, abnjVar);
        m(abowVarD);
        return abowVarD;
    }

    public abow d(byte[] bArr, int i, int i2, abnj abnjVar) throws abon {
        throw null;
    }

    @Override // defpackage.abpc
    public final /* bridge */ /* synthetic */ Object e(InputStream inputStream) throws abon {
        return i(inputStream, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abow, java.lang.Object] */
    @Override // defpackage.abpc
    public final /* bridge */ /* synthetic */ Object f(ByteBuffer byteBuffer) throws abon {
        abnj abnjVar = a;
        abmw abmwVarO = abmw.O(byteBuffer);
        ?? L = l(abmwVarO, abnjVar);
        abmwVarO.C(0);
        m(L);
        return L;
    }

    @Override // defpackage.abpc
    public final /* bridge */ /* synthetic */ Object g(byte[] bArr) throws abon {
        return j(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abow, java.lang.Object] */
    @Override // defpackage.abpc
    public final /* bridge */ /* synthetic */ Object h(abmw abmwVar, abnj abnjVar) throws abon {
        ?? L = l(abmwVar, abnjVar);
        m(L);
        return L;
    }
}
