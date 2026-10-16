package defpackage;

import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.control.CarControl;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class iln implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iln(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v51, types: [iyk, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                izq izqVar = ima.a;
                irb irbVar = ((iuc) obj).y;
                if (irbVar != null) {
                    Object obj2 = this.a;
                    ((ype) ((ype) irb.a.f()).ai((char) 1231)).y("mediaOptions override: %s", obj2);
                    for (int i = 0; i < 3; i++) {
                        iqa iqaVar = irbVar.w[i];
                        if (iqaVar != null) {
                            iqaVar.n((MediaOptions) obj2);
                        }
                    }
                    break;
                }
                break;
            case 1:
                this.a.add((CarControl) obj);
                break;
            case 2:
                yzo yzoVar = (yzo) obj;
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                yyt yytVar = (yyt) abnpVar.b;
                yyt yytVar2 = yyt.a;
                yzoVar.getClass();
                yytVar.g = yzoVar;
                yytVar.b |= 16;
                break;
            case 3:
                yyq yyqVar = (yyq) obj;
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                ywp ywpVar = (ywp) abnpVar2.b;
                ywp ywpVar2 = ywp.a;
                yyqVar.getClass();
                ywpVar.F = yyqVar;
                ywpVar.b |= 1073741824;
                break;
            case 4:
                yyq yyqVar2 = (yyq) obj;
                abnp abnpVar3 = (abnp) this.a;
                abnpVar3.t();
                ywp ywpVar3 = (ywp) abnpVar3.b;
                ywp ywpVar4 = ywp.a;
                yyqVar2.getClass();
                ywpVar3.G = yyqVar2;
                ywpVar3.b |= Integer.MIN_VALUE;
                break;
            case 5:
                yzo yzoVar2 = (yzo) obj;
                abnp abnpVar4 = (abnp) this.a;
                abnpVar4.t();
                yyt yytVar3 = (yyt) abnpVar4.b;
                yyt yytVar4 = yyt.a;
                yzoVar2.getClass();
                yytVar3.h = yzoVar2;
                yytVar3.b |= 32;
                break;
            case 6:
                yzo yzoVar3 = (yzo) obj;
                abnp abnpVar5 = (abnp) this.a;
                abnpVar5.t();
                yyt yytVar5 = (yyt) abnpVar5.b;
                yyt yytVar6 = yyt.a;
                yzoVar3.getClass();
                yytVar5.i = yzoVar3;
                yytVar5.b |= 64;
                break;
            case 7:
                yzo yzoVar4 = (yzo) obj;
                abnp abnpVar6 = (abnp) this.a;
                abnpVar6.t();
                yyt yytVar7 = (yyt) abnpVar6.b;
                yyt yytVar8 = yyt.a;
                yzoVar4.getClass();
                yytVar7.j = yzoVar4;
                yytVar7.b |= 128;
                break;
            case 8:
                yyq yyqVar3 = (yyq) obj;
                abnp abnpVar7 = (abnp) this.a;
                abnpVar7.t();
                ywp ywpVar5 = (ywp) abnpVar7.b;
                ywp ywpVar6 = ywp.a;
                yyqVar3.getClass();
                ywpVar5.z = yyqVar3;
                ywpVar5.b |= 16777216;
                break;
            case 9:
                yyq yyqVar4 = (yyq) obj;
                abnp abnpVar8 = (abnp) this.a;
                abnpVar8.t();
                ywp ywpVar7 = (ywp) abnpVar8.b;
                ywp ywpVar8 = ywp.a;
                yyqVar4.getClass();
                ywpVar7.A = yyqVar4;
                ywpVar7.b |= 33554432;
                break;
            case 10:
                yyq yyqVar5 = (yyq) obj;
                abnp abnpVar9 = (abnp) this.a;
                abnpVar9.t();
                ywp ywpVar9 = (ywp) abnpVar9.b;
                ywp ywpVar10 = ywp.a;
                yyqVar5.getClass();
                ywpVar9.B = yyqVar5;
                ywpVar9.b |= 67108864;
                break;
            case 11:
                yyq yyqVar6 = (yyq) obj;
                abnp abnpVar10 = (abnp) this.a;
                abnpVar10.t();
                ywp ywpVar11 = (ywp) abnpVar10.b;
                ywp ywpVar12 = ywp.a;
                yyqVar6.getClass();
                ywpVar11.C = yyqVar6;
                ywpVar11.b |= 134217728;
                break;
            case 12:
                yyq yyqVar7 = (yyq) obj;
                abnp abnpVar11 = (abnp) this.a;
                abnpVar11.t();
                ywp ywpVar13 = (ywp) abnpVar11.b;
                ywp ywpVar14 = ywp.a;
                yyqVar7.getClass();
                ywpVar13.D = yyqVar7;
                ywpVar13.b |= 268435456;
                break;
            case 13:
                yyq yyqVar8 = (yyq) obj;
                abnp abnpVar12 = (abnp) this.a;
                abnpVar12.t();
                ywp ywpVar15 = (ywp) abnpVar12.b;
                ywp ywpVar16 = ywp.a;
                yyqVar8.getClass();
                ywpVar15.E = yyqVar8;
                ywpVar15.b |= 536870912;
                break;
            case 14:
                this.a.b((Duration) obj);
                break;
            case 15:
                yzo yzoVar5 = (yzo) obj;
                abnp abnpVar13 = (abnp) this.a;
                abnpVar13.t();
                yyt yytVar9 = (yyt) abnpVar13.b;
                yyt yytVar10 = yyt.a;
                yzoVar5.getClass();
                yytVar9.n = yzoVar5;
                yytVar9.b |= 2048;
                break;
            case 16:
                yzo yzoVar6 = (yzo) obj;
                abnp abnpVar14 = (abnp) this.a;
                abnpVar14.t();
                yyt yytVar11 = (yyt) abnpVar14.b;
                yyt yytVar12 = yyt.a;
                yzoVar6.getClass();
                yytVar11.o = yzoVar6;
                yytVar11.b |= 4096;
                break;
            case 17:
                yzo yzoVar7 = (yzo) obj;
                abnp abnpVar15 = (abnp) this.a;
                abnpVar15.t();
                yyt yytVar13 = (yyt) abnpVar15.b;
                yyt yytVar14 = yyt.a;
                yzoVar7.getClass();
                yytVar13.m = yzoVar7;
                yytVar13.b |= 1024;
                break;
            case 18:
                yyq yyqVar9 = (yyq) obj;
                abnp abnpVar16 = (abnp) this.a;
                abnpVar16.t();
                yzi yziVar = (yzi) abnpVar16.b;
                yzi yziVar2 = yzi.a;
                yyqVar9.getClass();
                yziVar.q = yyqVar9;
                yziVar.b |= 16384;
                break;
            case 19:
                yyq yyqVar10 = (yyq) obj;
                abnp abnpVar17 = (abnp) this.a;
                abnpVar17.t();
                yzi yziVar3 = (yzi) abnpVar17.b;
                yzi yziVar4 = yzi.a;
                yyqVar10.getClass();
                yziVar3.r = yyqVar10;
                yziVar3.b |= 32768;
                break;
            default:
                yyq yyqVar11 = (yyq) obj;
                abnp abnpVar18 = (abnp) this.a;
                abnpVar18.t();
                yzi yziVar5 = (yzi) abnpVar18.b;
                yzi yziVar6 = yzi.a;
                yyqVar11.getClass();
                yziVar5.s = yyqVar11;
                yziVar5.b |= 65536;
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
