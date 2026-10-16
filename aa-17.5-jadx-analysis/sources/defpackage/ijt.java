package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.display.integratedoverlay.OverlayParameters;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class ijt implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ijt(int i) {
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
        int i = 5;
        switch (this.a) {
            case 0:
                return ijv.A((CarProperty) obj);
            case 1:
                return Integer.valueOf(((CharSequence) obj).length());
            case 2:
                return CarAreaId.a((xgj) obj);
            case 3:
                return Integer.valueOf(((xgh) obj).a());
            case 4:
                int i2 = ((xii) obj).f;
                yph yphVar = ike.a;
                return Integer.valueOf(i2);
            case 5:
                return Integer.valueOf(((xml) obj).d);
            case 6:
                xmm xmmVar = (xmm) obj;
                yph yphVar2 = ikp.a;
                Stream map = Collection.EL.stream(new abof(xmmVar.d, xmm.a)).map(new ijt(i));
                int i3 = yfq.d;
                return new RadioConfiguration.RadioBandGroup((List) map.collect(ycm.a), xmmVar.e, (xmmVar.c & 2) != 0 ? xmmVar.f : null, xmmVar.g);
            case 7:
                yph yphVar3 = ikt.a;
                return new ydx(10);
            case 8:
                Intent intent = iob.a;
                return ((ResolveInfo) obj).activityInfo;
            case 9:
                yph yphVar4 = ipp.a;
                return new wsj((jmi) obj);
            case 10:
                OverlayParameters overlayParameters = (OverlayParameters) obj;
                abnp abnpVarN = xlw.a.n();
                int i4 = overlayParameters.a;
                abnpVarN.t();
                xlw xlwVar = (xlw) abnpVarN.b;
                xlwVar.b |= 1;
                xlwVar.c = i4;
                abnp abnpVarN2 = xlv.a.n();
                Rect rect = overlayParameters.b;
                int i5 = rect.left;
                abnpVarN2.t();
                xlv xlvVar = (xlv) abnpVarN2.b;
                xlvVar.b |= 1;
                xlvVar.c = i5;
                int i6 = rect.top;
                abnpVarN2.t();
                xlv xlvVar2 = (xlv) abnpVarN2.b;
                xlvVar2.b |= 2;
                xlvVar2.d = i6;
                int i7 = rect.right;
                abnpVarN2.t();
                xlv xlvVar3 = (xlv) abnpVarN2.b;
                xlvVar3.b |= 4;
                xlvVar3.e = i7;
                int i8 = rect.bottom;
                abnpVarN2.t();
                xlv xlvVar4 = (xlv) abnpVarN2.b;
                xlvVar4.b |= 8;
                xlvVar4.f = i8;
                abnpVarN.t();
                xlw xlwVar2 = (xlw) abnpVarN.b;
                xlv xlvVar5 = (xlv) abnpVarN2.q();
                xlvVar5.getClass();
                xlwVar2.d = xlvVar5;
                xlwVar2.b |= 2;
                abnp abnpVarN3 = xlx.a.n();
                float f = overlayParameters.c;
                abnpVarN3.t();
                xlx xlxVar = (xlx) abnpVarN3.b;
                xlxVar.b = 1 | xlxVar.b;
                xlxVar.c = f;
                xlx xlxVar2 = (xlx) abnpVarN3.q();
                abnpVarN.t();
                xlw xlwVar3 = (xlw) abnpVarN.b;
                xlxVar2.getClass();
                xlwVar3.e = xlxVar2;
                xlwVar3.b |= 4;
                return (xlw) abnpVarN.q();
            case 11:
                xhc xhcVarB = xhc.b(((xha) obj).b);
                return xhcVarB == null ? xhc.ACTION_UNKNOWN : xhcVarB;
            case 12:
                return ComponentName.unflattenFromString((String) obj);
            case 13:
                iwm iwmVar = (iwm) obj;
                int i9 = iwmVar.b;
                yph yphVar5 = iwn.a;
                Integer numValueOf = Integer.valueOf(i9);
                int i10 = iwmVar.a;
                return String.format(Locale.US, "%d,%d-%d,%d=%d", numValueOf, Integer.valueOf(i10), Integer.valueOf(i9 + iwmVar.d), Integer.valueOf(i10 + iwmVar.c), Integer.valueOf(iwmVar.e));
            case 14:
                jfr jfrVarA = jfr.a((String) obj);
                jfrVarA.getClass();
                return jfrVarA;
            case 15:
                String str = (String) obj;
                yph yphVar6 = jkw.a;
                return str;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                return ComponentName.unflattenFromString(str2);
            case 17:
                String str3 = (String) obj;
                yph yphVar7 = jsf.a;
                return str3;
            case 18:
                return ((mqc) obj).a();
            case 19:
                yph yphVar8 = juv.a;
                return new mqc((ComponentName) obj, mpz.c);
            default:
                return ((mqc) obj).a();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
