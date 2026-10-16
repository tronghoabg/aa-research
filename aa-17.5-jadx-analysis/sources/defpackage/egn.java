package defpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
final class egn extends afde implements afec {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ egh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egn(egh eghVar, Object obj, afck afckVar) {
        super(1, afckVar);
        this.e = eghVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        afcr afcrVar = afcr.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    woy.dF(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        affa.n(r1, th);
                        throw th3;
                    }
                }
            } else {
                woy.dF(obj);
                egh eghVar = this.e;
                FileOutputStream fileOutputStream = new FileOutputStream(eghVar.a);
                Object obj3 = this.d;
                try {
                    eha ehaVar = eghVar.b;
                    ehm ehmVar = new ehm(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    if (ehaVar.c(obj3, ehmVar) == afcrVar) {
                        return afcrVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            affa.n(r1, null);
            return afak.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw dsu.f(this.e.a.getParent(), e);
            }
            throw e;
        }
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new egn(this.e, this.d, (afck) obj).hT(afak.a);
    }
}
