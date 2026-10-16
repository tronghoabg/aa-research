package defpackage;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.os.PatternMatcher;
import android.util.Range;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.display.UiStyleColorToken;
import com.google.android.gms.car.display.UiStyleToken;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class ric implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ric(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((xgg) obj).a());
            case 1:
                return Integer.valueOf(((xge) obj).a());
            case 2:
                return Integer.valueOf(((xgf) obj).a());
            case 3:
                return Integer.valueOf(((xgc) obj).a());
            case 4:
                return Integer.valueOf(((xgd) obj).a());
            case 5:
                return (CarPropertyConfig) obj;
            case 6:
                UiStyleToken uiStyleToken = (UiStyleToken) obj;
                abnp abnpVarN = xot.a.n();
                String str = uiStyleToken.a;
                abnpVarN.t();
                xot xotVar = (xot) abnpVarN.b;
                str.getClass();
                xotVar.b |= 1;
                xotVar.e = str;
                UiStyleColorToken uiStyleColorToken = uiStyleToken.b;
                if (uiStyleColorToken != null) {
                    abnp abnpVarN2 = xos.a.n();
                    abnpVarN2.t();
                    xos xosVar = (xos) abnpVarN2.b;
                    xosVar.b = 1 | xosVar.b;
                    xosVar.c = uiStyleColorToken.a;
                    abnpVarN.t();
                    xot xotVar2 = (xot) abnpVarN.b;
                    xos xosVar2 = (xos) abnpVarN2.q();
                    xosVar2.getClass();
                    xotVar2.d = xosVar2;
                    xotVar2.c = 2;
                }
                return (xot) abnpVarN.q();
            case 7:
                Context context = (Context) obj;
                int i = sft.e;
                Object systemService = context.getSystemService("usb");
                spu.aw(systemService);
                return rza.f(context, (UsbManager) systemService);
            case 8:
                sjj sjjVar = new sjj((sjk) obj);
                sjjVar.b(true);
                return sjjVar.a();
            case 9:
                return ((sjk) obj).a;
            case 10:
                return ((sjk) obj).b;
            case 11:
                return Stream.CC.ofNullable(((shs) obj).b());
            case 12:
                return new PatternMatcher((String) obj, 2);
            case 13:
                tfy tfyVar = (tfy) tgj.d.get((tfy) obj);
                tfyVar.getClass();
                return tfyVar;
            case 14:
                return (String) ((Map.Entry) obj).getKey();
            case 15:
                int i2 = tgw.a;
                return new ymp((Range) ((Map.Entry) obj).getValue());
            case 16:
                return ((Map.Entry) obj).getValue();
            case 17:
                return (Comparable) ((Map.Entry) obj).getValue();
            case 18:
                return new rjs((byte[]) null);
            case 19:
                ubu ubuVar = (ubu) obj;
                return new ubu(new uwk(ubuVar.a), ubuVar.b, ubuVar.c);
            default:
                return ((qbr) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
