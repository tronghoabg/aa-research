package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import com.google.android.gms.car.display.CarRegionGroup;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class imb implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ imb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = imc.b;
            return ((CarRegionGroup) obj).b.equals(this.a);
        }
        if (i == 1) {
            int i3 = imc.b;
            return ((CarRegionGroup) obj).b.equals(this.a);
        }
        if (i == 2) {
            int i4 = ine.g;
            return ((String) obj).equalsIgnoreCase(((ComponentName) this.a).getPackageName());
        }
        if (i != 3) {
            return ((yfg) this.a).contains((tfx) obj);
        }
        yph yphVar = iya.a;
        return !((ygr) this.a).contains(((ResolveInfo) obj).activityInfo.packageName);
    }
}
