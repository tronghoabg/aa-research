package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsp implements defpackage.cld {
    final /* synthetic */ java.lang.Object a;
    private final defpackage.bwx b = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.afhw(0.0f, 1.0f), defpackage.bxv.c);
    private final /* synthetic */ int c;

    public bsp(defpackage.kte kteVar, int i) {
        this.c = i;
        this.a = kteVar;
    }

    @Override // defpackage.cld
    public final defpackage.cku a(long j, defpackage.dlz dlzVar, defpackage.dlo dloVar) {
        int i = this.c;
        java.lang.Object obj = this.a;
        if (i == 0) {
            defpackage.kte kteVar = (defpackage.kte) obj;
            kteVar.b = j;
            this.b.b(new defpackage.afhw(0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
            long j2 = kteVar.b;
            defpackage.dlo dloVar2 = kteVar.c;
            defpackage.aeb aebVarA = kteVar.d;
            if (aebVarA == null) {
                aebVarA = defpackage.aec.a(kteVar.h.a.a(j2, dloVar2));
                kteVar.d = aebVarA;
            }
            float fFloatValue = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA.d()).floatValue()), b())).floatValue();
            long j3 = kteVar.b;
            defpackage.dlo dloVar3 = kteVar.c;
            defpackage.aeb aebVarA2 = kteVar.e;
            if (aebVarA2 == null) {
                aebVarA2 = defpackage.aec.a(kteVar.h.b.a(j3, dloVar3));
                kteVar.e = aebVarA2;
            }
            float fFloatValue2 = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA2.d()).floatValue()), b())).floatValue();
            long j4 = kteVar.b;
            defpackage.dlo dloVar4 = kteVar.c;
            defpackage.aeb aebVarA3 = kteVar.f;
            if (aebVarA3 == null) {
                aebVarA3 = defpackage.aec.a(kteVar.h.d.a(j4, dloVar4));
                kteVar.f = aebVarA3;
            }
            float fFloatValue3 = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA3.d()).floatValue()), b())).floatValue();
            long j5 = kteVar.b;
            defpackage.dlo dloVar5 = kteVar.c;
            defpackage.aeb aebVarA4 = kteVar.g;
            if (aebVarA4 == null) {
                aebVarA4 = defpackage.aec.a(kteVar.h.c.a(j5, dloVar5));
                kteVar.g = aebVarA4;
            }
            return defpackage.bcw.a(fFloatValue, fFloatValue2, ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA4.d()).floatValue()), b())).floatValue(), fFloatValue3).a(j, dlzVar, dloVar);
        }
        defpackage.kte kteVar2 = (defpackage.kte) obj;
        kteVar2.b = j;
        this.b.b(new defpackage.afhw(0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
        defpackage.bcr bcrVar = kteVar2.h;
        long j6 = kteVar2.b;
        defpackage.dlo dloVar6 = kteVar2.c;
        defpackage.aeb aebVarA5 = kteVar2.d;
        if (aebVarA5 == null) {
            aebVarA5 = defpackage.aec.a(bcrVar.a.a(j6, dloVar6));
            kteVar2.d = aebVarA5;
        }
        defpackage.bcv bcvVar = new defpackage.bcv(((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA5.d()).floatValue()), b())).floatValue());
        long j7 = kteVar2.b;
        defpackage.dlo dloVar7 = kteVar2.c;
        defpackage.aeb aebVarA6 = kteVar2.e;
        if (aebVarA6 == null) {
            aebVarA6 = defpackage.aec.a(bcrVar.b.a(j7, dloVar7));
            kteVar2.e = aebVarA6;
        }
        defpackage.bcv bcvVar2 = new defpackage.bcv(((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA6.d()).floatValue()), b())).floatValue());
        long j8 = kteVar2.b;
        defpackage.dlo dloVar8 = kteVar2.c;
        defpackage.aeb aebVarA7 = kteVar2.f;
        if (aebVarA7 == null) {
            aebVarA7 = defpackage.aec.a(bcrVar.d.a(j8, dloVar8));
            kteVar2.f = aebVarA7;
        }
        defpackage.bcv bcvVar3 = new defpackage.bcv(((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA7.d()).floatValue()), b())).floatValue());
        long j9 = kteVar2.b;
        defpackage.dlo dloVar9 = kteVar2.c;
        defpackage.aeb aebVarA8 = kteVar2.g;
        if (aebVarA8 == null) {
            aebVarA8 = defpackage.aec.a(bcrVar.c.a(j9, dloVar9));
            kteVar2.g = aebVarA8;
        }
        return new defpackage.bcr(bcvVar, bcvVar2, new defpackage.bcv(((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA8.d()).floatValue()), b())).floatValue()), bcvVar3).a(j, dlzVar, dloVar);
    }

    public final defpackage.afhw b() {
        int i = this.c;
        defpackage.bwx bwxVar = this.b;
        return i != 0 ? (defpackage.afhw) bwxVar.a() : (defpackage.afhw) bwxVar.a();
    }

    public bsp(defpackage.kte kteVar, int i, byte[] bArr) {
        this.c = i;
        this.a = kteVar;
    }
}
