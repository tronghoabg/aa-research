package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class iup implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ iup(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) throws PackageManager.NameNotFoundException {
        switch (this.a) {
            case 0:
                int i = iuq.a;
                return ((iuu) obj).k == xjc.DISPLAY_TYPE_MAIN;
            case 1:
                return Objects.nonNull((ServiceInfo) obj);
            case 2:
                yph yphVar = iya.a;
                return ((ixz) obj).b != qpi.i;
            case 3:
                ComponentName componentName = (ComponentName) obj;
                yfq yfqVar = map.a;
                try {
                    mki.a.c.getPackageManager().getPackageInfo(componentName.getPackageName(), 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                    return false;
                }
            case 4:
                return nso.e.contains(((Map.Entry) obj).getValue());
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                yph yphVar2 = nso.a;
                return lal.a.a().b() || !nso.f.contains(entry.getValue());
            case 6:
                return nxr.a.contains(((nuh) obj).c.x);
            case 7:
                return ((nuh) obj).f();
            case 8:
                return Objects.nonNull(obj);
            default:
                return true;
        }
    }
}
