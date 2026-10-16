package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import com.google.android.gms.car.display.CarDisplay;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class jxe implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ jxe(int i) {
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
                int i = jxg.a;
                return new mqc((ComponentName) obj, mpz.d);
            case 1:
                return (String) obj;
            case 2:
                ComponentName componentName = (ComponentName) obj;
                int i2 = jyh.a;
                return new mqc(componentName, mcd.A().r(mki.a.c, componentName.getPackageName()) ? mpz.c : mpz.a);
            case 3:
                return ((mqc) obj).a();
            case 4:
                return Integer.valueOf(((CharSequence) obj).length());
            case 5:
                return ((mqc) obj).a;
            case 6:
                return ((mqb) obj).a;
            case 7:
                return ((mqc) obj).a;
            case 8:
                return ((mqc) obj).a;
            case 9:
                return ((mqc) obj).a;
            case 10:
                return ((mqc) obj).a();
            case 11:
                return new mqc((ComponentName) obj);
            case 12:
                int i3 = jzb.a;
                return new mqc((ComponentName) obj, mpz.b);
            case 13:
                return new mqc((ComponentName) obj);
            case 14:
                int i4 = jzd.b;
                return new mqc((ComponentName) obj, mpz.b);
            case 15:
                yph yphVar = kad.a;
                ServiceInfo serviceInfo = ((ResolveInfo) obj).serviceInfo;
                return new ComponentName(serviceInfo.packageName, serviceInfo.name);
            case 16:
                yph yphVar2 = MaterialRowView.a;
                sw swVar = new sw((Action) obj);
                swVar.a = false;
                return swVar.a();
            case 17:
                yph yphVar3 = RowView.a;
                sw swVar2 = new sw((Action) obj);
                swVar2.a = false;
                return swVar2.a();
            case 18:
                return ((mqc) obj).a().getPackageName();
            case 19:
                return ((llu) obj).i();
            default:
                yph yphVar4 = BugreportRequester.a;
                return ((CarDisplay) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
