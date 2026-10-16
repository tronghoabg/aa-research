package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ilx implements java.util.function.Consumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v53, types: [iyr, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.izx izxVar = defpackage.imi.a;
                defpackage.irk irkVar = ((defpackage.iuk) obj).y;
                if (irkVar != null) {
                    java.lang.Object obj2 = this.a;
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.f()).ai((char) 1231)).y("mediaOptions override: %s", obj2);
                    for (int i = 0; i < 3; i++) {
                        defpackage.iqh iqhVar = irkVar.w[i];
                        if (iqhVar != null) {
                            iqhVar.n((com.google.android.gms.car.MediaOptions) obj2);
                        }
                    }
                }
                break;
            case 1:
                this.a.add((com.google.android.gms.car.control.CarControl) obj);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.iph.E;
                ((ipp) obj).b((android.view.Surface) this.a);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                zat zatVar = (zat) obj;
                defpackage.abor aborVar = (defpackage.abor) this.a;
                aborVar.t();
                defpackage.yzy yzyVar = (defpackage.yzy) aborVar.b;
                defpackage.yzy yzyVar2 = defpackage.yzy.a;
                zatVar.getClass();
                yzyVar.g = zatVar;
                yzyVar.b |= 16;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                yzv yzvVar = (yzv) obj;
                defpackage.abor aborVar2 = (defpackage.abor) this.a;
                aborVar2.t();
                defpackage.yxu yxuVar = (defpackage.yxu) aborVar2.b;
                defpackage.yxu yxuVar2 = defpackage.yxu.a;
                yzvVar.getClass();
                yxuVar.F = yzvVar;
                yxuVar.b |= 1073741824;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                yzv yzvVar2 = (yzv) obj;
                defpackage.abor aborVar3 = (defpackage.abor) this.a;
                aborVar3.t();
                defpackage.yxu yxuVar3 = (defpackage.yxu) aborVar3.b;
                defpackage.yxu yxuVar4 = defpackage.yxu.a;
                yzvVar2.getClass();
                yxuVar3.G = yzvVar2;
                yxuVar3.b |= Integer.MIN_VALUE;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                zat zatVar2 = (zat) obj;
                defpackage.abor aborVar4 = (defpackage.abor) this.a;
                aborVar4.t();
                defpackage.yzy yzyVar3 = (defpackage.yzy) aborVar4.b;
                defpackage.yzy yzyVar4 = defpackage.yzy.a;
                zatVar2.getClass();
                yzyVar3.h = zatVar2;
                yzyVar3.b |= 32;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                zat zatVar3 = (zat) obj;
                defpackage.abor aborVar5 = (defpackage.abor) this.a;
                aborVar5.t();
                defpackage.yzy yzyVar5 = (defpackage.yzy) aborVar5.b;
                defpackage.yzy yzyVar6 = defpackage.yzy.a;
                zatVar3.getClass();
                yzyVar5.i = zatVar3;
                yzyVar5.b |= 64;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                zat zatVar4 = (zat) obj;
                defpackage.abor aborVar6 = (defpackage.abor) this.a;
                aborVar6.t();
                defpackage.yzy yzyVar7 = (defpackage.yzy) aborVar6.b;
                defpackage.yzy yzyVar8 = defpackage.yzy.a;
                zatVar4.getClass();
                yzyVar7.j = zatVar4;
                yzyVar7.b |= 128;
                break;
            case 9:
                yzv yzvVar3 = (yzv) obj;
                defpackage.abor aborVar7 = (defpackage.abor) this.a;
                aborVar7.t();
                defpackage.yxu yxuVar5 = (defpackage.yxu) aborVar7.b;
                defpackage.yxu yxuVar6 = defpackage.yxu.a;
                yzvVar3.getClass();
                yxuVar5.z = yzvVar3;
                yxuVar5.b |= 16777216;
                break;
            case 10:
                yzv yzvVar4 = (yzv) obj;
                defpackage.abor aborVar8 = (defpackage.abor) this.a;
                aborVar8.t();
                defpackage.yxu yxuVar7 = (defpackage.yxu) aborVar8.b;
                defpackage.yxu yxuVar8 = defpackage.yxu.a;
                yzvVar4.getClass();
                yxuVar7.A = yzvVar4;
                yxuVar7.b |= 33554432;
                break;
            case 11:
                yzv yzvVar5 = (yzv) obj;
                defpackage.abor aborVar9 = (defpackage.abor) this.a;
                aborVar9.t();
                defpackage.yxu yxuVar9 = (defpackage.yxu) aborVar9.b;
                defpackage.yxu yxuVar10 = defpackage.yxu.a;
                yzvVar5.getClass();
                yxuVar9.B = yzvVar5;
                yxuVar9.b |= 67108864;
                break;
            case 12:
                yzv yzvVar6 = (yzv) obj;
                defpackage.abor aborVar10 = (defpackage.abor) this.a;
                aborVar10.t();
                defpackage.yxu yxuVar11 = (defpackage.yxu) aborVar10.b;
                defpackage.yxu yxuVar12 = defpackage.yxu.a;
                yzvVar6.getClass();
                yxuVar11.C = yzvVar6;
                yxuVar11.b |= 134217728;
                break;
            case 13:
                yzv yzvVar7 = (yzv) obj;
                defpackage.abor aborVar11 = (defpackage.abor) this.a;
                aborVar11.t();
                defpackage.yxu yxuVar13 = (defpackage.yxu) aborVar11.b;
                defpackage.yxu yxuVar14 = defpackage.yxu.a;
                yzvVar7.getClass();
                yxuVar13.D = yzvVar7;
                yxuVar13.b |= 268435456;
                break;
            case 14:
                yzv yzvVar8 = (yzv) obj;
                defpackage.abor aborVar12 = (defpackage.abor) this.a;
                aborVar12.t();
                defpackage.yxu yxuVar15 = (defpackage.yxu) aborVar12.b;
                defpackage.yxu yxuVar16 = defpackage.yxu.a;
                yzvVar8.getClass();
                yxuVar15.E = yzvVar8;
                yxuVar15.b |= 536870912;
                break;
            case 15:
                this.a.b((j$.time.Duration) obj);
                break;
            case 16:
                zat zatVar5 = (zat) obj;
                defpackage.abor aborVar13 = (defpackage.abor) this.a;
                aborVar13.t();
                defpackage.yzy yzyVar9 = (defpackage.yzy) aborVar13.b;
                defpackage.yzy yzyVar10 = defpackage.yzy.a;
                zatVar5.getClass();
                yzyVar9.n = zatVar5;
                yzyVar9.b |= 2048;
                break;
            case 17:
                zat zatVar6 = (zat) obj;
                defpackage.abor aborVar14 = (defpackage.abor) this.a;
                aborVar14.t();
                defpackage.yzy yzyVar11 = (defpackage.yzy) aborVar14.b;
                defpackage.yzy yzyVar12 = defpackage.yzy.a;
                zatVar6.getClass();
                yzyVar11.o = zatVar6;
                yzyVar11.b |= 4096;
                break;
            case 18:
                zat zatVar7 = (zat) obj;
                defpackage.abor aborVar15 = (defpackage.abor) this.a;
                aborVar15.t();
                defpackage.yzy yzyVar13 = (defpackage.yzy) aborVar15.b;
                defpackage.yzy yzyVar14 = defpackage.yzy.a;
                zatVar7.getClass();
                yzyVar13.m = zatVar7;
                yzyVar13.b |= 1024;
                break;
            case 19:
                yzv yzvVar9 = (yzv) obj;
                defpackage.abor aborVar16 = (defpackage.abor) this.a;
                aborVar16.t();
                zan zanVar = aborVar16.b;
                zan zanVar2 = zan.a;
                yzvVar9.getClass();
                zanVar.q = yzvVar9;
                zanVar.b |= 16384;
                break;
            default:
                yzv yzvVar10 = (yzv) obj;
                defpackage.abor aborVar17 = (defpackage.abor) this.a;
                aborVar17.t();
                zan zanVar3 = aborVar17.b;
                zan zanVar4 = zan.a;
                yzvVar10.getClass();
                zanVar3.r = yzvVar10;
                zanVar3.b |= 32768;
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
