package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rix implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rix(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.a) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Integer.valueOf(((xhf) obj).a());
            case 1:
                return ((defpackage.mqj) obj).a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Integer.valueOf(((xhh) obj).a());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((xhg) obj).a());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(((xhd) obj).a());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(((xhe) obj).a());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return (com.google.android.gms.car.control.CarPropertyConfig) obj;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.car.display.UiStyleToken uiStyleToken = (com.google.android.gms.car.display.UiStyleToken) obj;
                defpackage.abor aborVarN = xpu.a.n();
                java.lang.String str = uiStyleToken.a;
                aborVarN.t();
                xpu xpuVar = aborVarN.b;
                str.getClass();
                xpuVar.b |= 1;
                xpuVar.e = str;
                com.google.android.gms.car.display.UiStyleColorToken uiStyleColorToken = uiStyleToken.b;
                if (uiStyleColorToken != null) {
                    defpackage.abor aborVarN2 = xpt.a.n();
                    aborVarN2.t();
                    xpt xptVar = aborVarN2.b;
                    xptVar.b = 1 | xptVar.b;
                    xptVar.c = uiStyleColorToken.a;
                    aborVarN.t();
                    xpu xpuVar2 = aborVarN.b;
                    xpt xptVarQ = aborVarN2.q();
                    xptVarQ.getClass();
                    xpuVar2.d = xptVarQ;
                    xpuVar2.c = 2;
                }
                return aborVarN.q();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.content.Context context = (android.content.Context) obj;
                int i = sgp.e;
                java.lang.Object systemService = context.getSystemService("usb");
                defpackage.sqs.aA(systemService);
                return defpackage.rzw.f(context, (android.hardware.usb.UsbManager) systemService);
            case 9:
                defpackage.ske skeVar = new defpackage.ske((defpackage.skf) obj);
                skeVar.c(true);
                return skeVar.a();
            case 10:
                return j$.util.stream.Stream.-CC.ofNullable(((sin) obj).b());
            case 11:
                return new android.os.PatternMatcher((java.lang.String) obj, 2);
            case 12:
                defpackage.tgu tguVar = (defpackage.tgu) defpackage.thf.d.get((defpackage.tgu) obj);
                tguVar.getClass();
                return tguVar;
            case 13:
                return (java.lang.String) ((java.util.Map.Entry) obj).getKey();
            case 14:
                int i2 = defpackage.ths.a;
                return new defpackage.ynu((android.util.Range) ((java.util.Map.Entry) obj).getValue());
            case 15:
                return ((java.util.Map.Entry) obj).getValue();
            case 16:
                return (java.lang.Comparable) ((java.util.Map.Entry) obj).getValue();
            case 17:
                return new rko();
            case 18:
                ucr ucrVar = (ucr) obj;
                return new ucr(new uxh(ucrVar.a), ucrVar.b, ucrVar.c);
            case 19:
                return ((qcu) ((qcp) obj)).a;
            default:
                return java.lang.Integer.toString(((uwl) obj).a());
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
