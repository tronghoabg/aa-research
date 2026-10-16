package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.gms.car.display.CarRegionGroup;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class vzs implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vzs(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return this.c != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.c == 0) {
            return new vzu((ContentResolver) this.a, (Uri) this.b);
        }
        CarRegionGroup carRegionGroup = (CarRegionGroup) obj;
        for (CarRegionGroup carRegionGroup2 : ((nso) this.a).j.x()) {
            if (carRegionGroup2.a == carRegionGroup.a) {
                carRegionGroup = carRegionGroup2;
            }
        }
        ((ype) nso.a.l().ai(5399)).M("Adding %s to group %s", this.b, carRegionGroup);
        return carRegionGroup;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.c != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
