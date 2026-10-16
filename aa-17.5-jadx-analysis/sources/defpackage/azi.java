package defpackage;

/* loaded from: classes.dex */
public final class azi implements cvf {
    private final aae a;
    private final nfh b;

    public azi(nfh nfhVar) {
        this.b = nfhVar;
        aae aaeVar = aaf.a;
        this.a = new aae(6);
    }

    @Override // defpackage.cvf
    public final void a(cve cveVar) {
        aae aaeVar = this.a;
        aaeVar.e();
        aaj aajVar = cveVar.a;
        Object[] objArr = aajVar.b;
        long[] jArr = aajVar.c;
        int i = aajVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            Object objY = this.b.y(obj);
            int iB = aaeVar.b(objY, 0);
            int i2 = (int) (j & 2147483647L);
            if (iB == 7) {
                cveVar.remove(obj);
            } else {
                aaeVar.g(objY, iB + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.cvf
    public final boolean b(Object obj, Object obj2) {
        nfh nfhVar = this.b;
        return affa.f(nfhVar.y(obj), nfhVar.y(obj2));
    }
}
