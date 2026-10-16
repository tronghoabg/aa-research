package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ktd implements defpackage.cld {
    final /* synthetic */ defpackage.kte a;
    private final defpackage.bwx b = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.afhw(0.0f, 1.0f), defpackage.bxv.c);

    public ktd(defpackage.kte kteVar) {
        this.a = kteVar;
    }

    @Override // defpackage.cld
    public final defpackage.cku a(long j, defpackage.dlz dlzVar, defpackage.dlo dloVar) {
        dlzVar.getClass();
        dloVar.getClass();
        defpackage.kte kteVar = this.a;
        kteVar.b = j;
        this.b.b(new defpackage.afhw(0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
        long j2 = kteVar.b;
        defpackage.dlo dloVar2 = kteVar.c;
        dloVar2.getClass();
        defpackage.aeb aebVarA = kteVar.d;
        if (aebVarA == null) {
            aebVarA = defpackage.aec.a(kteVar.h.a.a(j2, dloVar2));
            kteVar.d = aebVarA;
        }
        float fFloatValue = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA.d()).floatValue()), b())).floatValue();
        long j3 = kteVar.b;
        defpackage.dlo dloVar3 = kteVar.c;
        dloVar3.getClass();
        defpackage.aeb aebVarA2 = kteVar.e;
        if (aebVarA2 == null) {
            aebVarA2 = defpackage.aec.a(kteVar.h.b.a(j3, dloVar3));
            kteVar.e = aebVarA2;
        }
        float fFloatValue2 = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA2.d()).floatValue()), b())).floatValue();
        long j4 = kteVar.b;
        defpackage.dlo dloVar4 = kteVar.c;
        dloVar4.getClass();
        defpackage.aeb aebVarA3 = kteVar.f;
        if (aebVarA3 == null) {
            aebVarA3 = defpackage.aec.a(kteVar.h.d.a(j4, dloVar4));
            kteVar.f = aebVarA3;
        }
        float fFloatValue3 = ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA3.d()).floatValue()), b())).floatValue();
        long j5 = kteVar.b;
        defpackage.dlo dloVar5 = kteVar.c;
        dloVar5.getClass();
        defpackage.aeb aebVarA4 = kteVar.g;
        if (aebVarA4 == null) {
            aebVarA4 = defpackage.aec.a(kteVar.h.c.a(j5, dloVar5));
            kteVar.g = aebVarA4;
        }
        return defpackage.bcw.a(fFloatValue, fFloatValue2, ((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(((java.lang.Number) aebVarA4.d()).floatValue()), b())).floatValue(), fFloatValue3).a(j, dlzVar, dloVar);
    }

    public final defpackage.afhw b() {
        return (defpackage.afhw) this.b.a();
    }
}
