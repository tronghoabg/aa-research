package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class esd implements erq {
    private final sx[] a;

    public esd(sx... sxVarArr) {
        sxVarArr.getClass();
        this.a = sxVarArr;
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [afec, java.lang.Object] */
    @Override // defpackage.erq
    public final erm b(Class cls, esc escVar) {
        sx sxVar;
        sx[] sxVarArr = this.a;
        int length = sxVarArr.length;
        afhe afheVarL = affa.l(cls);
        sx[] sxVarArr2 = (sx[]) Arrays.copyOf(sxVarArr, length);
        afheVarL.getClass();
        sxVarArr2.getClass();
        int i = 0;
        while (true) {
            if (i >= sxVarArr2.length) {
                sxVar = null;
                break;
            }
            sxVar = sxVarArr2[i];
            if (affa.f(sxVar.a, afheVarL)) {
                break;
            }
            i++;
        }
        erm ermVar = sxVar != null ? (erm) sxVar.b.invoke(escVar) : null;
        if (ermVar != null) {
            return ermVar;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(afheVarL.getQualifiedName())));
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm c(afhe afheVar, esc escVar) {
        return ebj.g(this, afheVar, escVar);
    }
}
