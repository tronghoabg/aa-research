package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* loaded from: classes3.dex */
public final /* synthetic */ class waz implements svm {
    @Override // defpackage.svm
    public final Object a(svz svzVar) {
        int i;
        wax waxVar;
        int i2;
        Configurations configurations = (Configurations) svzVar.e();
        abnp abnpVarN = waw.a.n();
        String str = configurations.a;
        abnpVarN.t();
        waw wawVar = (waw) abnpVarN.b;
        str.getClass();
        int i3 = 1;
        wawVar.b |= 1;
        wawVar.c = str;
        String str2 = configurations.c;
        abnpVarN.t();
        waw wawVar2 = (waw) abnpVarN.b;
        str2.getClass();
        wawVar2.b |= 4;
        wawVar2.e = str2;
        boolean z = configurations.f;
        abnpVarN.t();
        waw wawVar3 = (waw) abnpVarN.b;
        wawVar3.b |= 8;
        wawVar3.h = z;
        long j = configurations.g;
        abnpVarN.t();
        waw wawVar4 = (waw) abnpVarN.b;
        wawVar4.b |= 16;
        wawVar4.i = j;
        byte[] bArr = configurations.b;
        int i4 = 2;
        if (bArr != null) {
            abms abmsVarV = abms.v(bArr);
            abnpVarN.t();
            waw wawVar5 = (waw) abnpVarN.b;
            abmsVarV.getClass();
            wawVar5.b |= 2;
            wawVar5.d = abmsVarV;
        }
        Configuration[] configurationArr = configurations.d;
        int length = configurationArr.length;
        int i5 = 0;
        while (i5 < length) {
            Configuration configuration = configurationArr[i5];
            Flag[] flagArr = configuration.b;
            int length2 = flagArr.length;
            int i6 = 0;
            while (i6 < length2) {
                Flag flag = flagArr[i6];
                int i7 = flag.g;
                if (i7 == i3) {
                    i = i4;
                    int i8 = i3;
                    abnp abnpVarN2 = wax.a.n();
                    String str3 = flag.a;
                    abnpVarN2.t();
                    wax waxVar2 = (wax) abnpVarN2.b;
                    str3.getClass();
                    waxVar2.b |= 1;
                    waxVar2.e = str3;
                    i3 = i8;
                    if (i7 != i3) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j2 = flag.b;
                    abnpVarN2.t();
                    wax waxVar3 = (wax) abnpVarN2.b;
                    waxVar3.c = i3;
                    waxVar3.d = Long.valueOf(j2);
                    waxVar = (wax) abnpVarN2.q();
                } else if (i7 != i4) {
                    if (i7 == 3) {
                        i2 = i3;
                        abnp abnpVarN3 = wax.a.n();
                        String str4 = flag.a;
                        abnpVarN3.t();
                        wax waxVar4 = (wax) abnpVarN3.b;
                        str4.getClass();
                        waxVar4.b |= 1;
                        waxVar4.e = str4;
                        if (i7 != 3) {
                            throw new IllegalArgumentException("Not a double type");
                        }
                        double d = flag.d;
                        abnpVarN3.t();
                        wax waxVar5 = (wax) abnpVarN3.b;
                        waxVar5.c = 3;
                        waxVar5.d = Double.valueOf(d);
                        waxVar = (wax) abnpVarN3.q();
                    } else if (i7 == 4) {
                        i2 = i3;
                        abnp abnpVarN4 = wax.a.n();
                        String str5 = flag.a;
                        abnpVarN4.t();
                        wax waxVar6 = (wax) abnpVarN4.b;
                        str5.getClass();
                        waxVar6.b |= 1;
                        waxVar6.e = str5;
                        if (i7 != 4) {
                            throw new IllegalArgumentException("Not a String type");
                        }
                        String str6 = flag.e;
                        spu.aw(str6);
                        abnpVarN4.t();
                        wax waxVar7 = (wax) abnpVarN4.b;
                        waxVar7.c = 4;
                        waxVar7.d = str6;
                        waxVar = (wax) abnpVarN4.q();
                    } else {
                        if (i7 != 5) {
                            throw new IllegalArgumentException(a.bp(i7, "Unrecognized flag type: "));
                        }
                        abnp abnpVarN5 = wax.a.n();
                        String str7 = flag.a;
                        abnpVarN5.t();
                        i2 = i3;
                        wax waxVar8 = (wax) abnpVarN5.b;
                        str7.getClass();
                        waxVar8.b |= 1;
                        waxVar8.e = str7;
                        if (i7 != 5) {
                            throw new IllegalArgumentException("Not a bytes type");
                        }
                        byte[] bArr2 = flag.f;
                        spu.aw(bArr2);
                        abms abmsVarV2 = abms.v(bArr2);
                        abnpVarN5.t();
                        wax waxVar9 = (wax) abnpVarN5.b;
                        abmsVarV2.getClass();
                        waxVar9.c = 5;
                        waxVar9.d = abmsVarV2;
                        waxVar = (wax) abnpVarN5.q();
                    }
                    i3 = i2;
                    i = 2;
                } else {
                    int i9 = i3;
                    abnp abnpVarN6 = wax.a.n();
                    String str8 = flag.a;
                    abnpVarN6.t();
                    wax waxVar10 = (wax) abnpVarN6.b;
                    str8.getClass();
                    waxVar10.b |= 1;
                    waxVar10.e = str8;
                    i = 2;
                    if (i7 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = flag.c;
                    abnpVarN6.t();
                    wax waxVar11 = (wax) abnpVarN6.b;
                    waxVar11.c = 2;
                    waxVar11.d = Boolean.valueOf(z2);
                    waxVar = (wax) abnpVarN6.q();
                    i3 = i9;
                }
                abnpVarN.t();
                waw wawVar6 = (waw) abnpVarN.b;
                waxVar.getClass();
                aboh abohVar = wawVar6.f;
                if (!abohVar.c()) {
                    wawVar6.f = abnv.I(abohVar);
                }
                wawVar6.f.add(waxVar);
                i6++;
                i4 = i;
            }
            int i10 = i4;
            String[] strArr = configuration.c;
            if (strArr != null) {
                for (String str9 : strArr) {
                    abnpVarN.t();
                    waw wawVar7 = (waw) abnpVarN.b;
                    str9.getClass();
                    aboh abohVar2 = wawVar7.g;
                    if (!abohVar2.c()) {
                        wawVar7.g = abnv.I(abohVar2);
                    }
                    wawVar7.g.add(str9);
                }
            }
            i5++;
            i4 = i10;
        }
        return (waw) abnpVarN.q();
    }
}
