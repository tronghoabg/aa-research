package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alv implements defpackage.dob {
    private final defpackage.afer a;

    public alv(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    @Override // defpackage.dob
    public final long a(defpackage.dlx dlxVar, long j, defpackage.dlz dlzVar, long j2) {
        long j3 = ((defpackage.dlw) this.a.invoke()).a;
        return (((long) defpackage.ca.aV(dlxVar.c + defpackage.dlw.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) defpackage.ca.aV(dlxVar.b + defpackage.dlw.a(j3), (int) (j2 >> 32), (int) (j >> 32), dlzVar == defpackage.dlz.a)) << 32);
    }
}
