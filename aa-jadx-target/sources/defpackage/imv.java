package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class imv implements java.util.function.Consumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ imv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [iyr, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.inh inhVar = (defpackage.inh) this.a;
                defpackage.jdy jdyVar = inhVar.Z.j;
                defpackage.jkn jknVar = (defpackage.jkn) obj;
                if (jdyVar instanceof defpackage.jev) {
                    defpackage.jev jevVar = (defpackage.jev) jdyVar;
                    jevVar.t(jknVar.a);
                    jevVar.s(jknVar.c);
                    if (inhVar.h) {
                        return;
                    }
                    jevVar.u(jknVar.b);
                    return;
                }
                return;
            case 1:
                byte[] byteArray = ((android.os.Bundle) this.a).getByteArray("activity_layout_config");
                if (byteArray == null) {
                    throw new java.lang.IllegalStateException("ProjectionLifecycleService must pass a CarActivityLayoutConfig");
                }
                com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) defpackage.sqs.l(byteArray, com.google.android.gms.car.lifecycle.CarActivityLayoutConfig.CREATOR);
                defpackage.dmh.I(carActivityLayoutConfig);
                defpackage.dmh.J(carActivityLayoutConfig);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.ioe) this.a).a = (android.content.ComponentName) obj;
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.c((j$.time.Duration) obj);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.abor aborVar = (defpackage.abor) this.a;
                aborVar.t();
                defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
                defpackage.yyg yygVar2 = defpackage.yyg.a;
                yygVar.b |= 524288;
                yygVar.t = iIntValue;
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.abor aborVar2 = (defpackage.abor) this.a;
                aborVar2.t();
                defpackage.yyg yygVar3 = (defpackage.yyg) aborVar2.b;
                defpackage.yyg yygVar4 = defpackage.yyg.a;
                yygVar3.b |= 1048576;
                yygVar3.u = zBooleanValue;
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.abor aborVar3 = (defpackage.abor) this.a;
                aborVar3.t();
                defpackage.yyg yygVar5 = (defpackage.yyg) aborVar3.b;
                defpackage.yyg yygVar6 = defpackage.yyg.a;
                yygVar5.b |= 2097152;
                yygVar5.v = iIntValue2;
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = defpackage.oit.a;
                int i2 = ((defpackage.yzk) obj).l;
                defpackage.abor aborVar4 = (defpackage.abor) this.a;
                aborVar4.t();
                defpackage.yyg yygVar7 = (defpackage.yyg) aborVar4.b;
                defpackage.yyg yygVar8 = defpackage.yyg.a;
                yygVar7.b |= 4194304;
                yygVar7.w = i2;
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.oix.a;
                defpackage.zao zaoVarL = defpackage.acmj.l((java.util.UUID) obj);
                defpackage.abor aborVar5 = (defpackage.abor) this.a;
                aborVar5.t();
                defpackage.yyg yygVar9 = (defpackage.yyg) aborVar5.b;
                defpackage.yyg yygVar10 = defpackage.yyg.a;
                zaoVarL.getClass();
                yygVar9.ag = zaoVarL;
                yygVar9.d |= 32;
                return;
            case 9:
                long jLongValue = ((java.lang.Long) obj).longValue();
                defpackage.abor aborVar6 = (defpackage.abor) this.a;
                aborVar6.t();
                defpackage.yza yzaVar = (defpackage.yza) aborVar6.b;
                defpackage.yza yzaVar2 = defpackage.yza.a;
                yzaVar.b |= 1;
                yzaVar.c = jLongValue;
                return;
            default:
                long jLongValue2 = ((java.lang.Long) obj).longValue();
                defpackage.abor aborVar7 = (defpackage.abor) this.a;
                aborVar7.t();
                defpackage.yza yzaVar3 = (defpackage.yza) aborVar7.b;
                defpackage.yza yzaVar4 = defpackage.yza.a;
                yzaVar3.b |= 2;
                yzaVar3.d = jLongValue2;
                return;
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
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
