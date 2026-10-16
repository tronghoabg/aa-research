package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iux implements java.util.function.Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ iux(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                int i = defpackage.iuy.a;
                return ((defpackage.ivc) obj).k == defpackage.xkd.DISPLAY_TYPE_MAIN;
            case 1:
                return j$.util.Objects.nonNull((android.content.pm.ServiceInfo) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.ygw ygwVar = defpackage.maw.a;
                try {
                    defpackage.mkp.a.c.getPackageManager().getPackageInfo(componentName.getPackageName(), 0);
                    return true;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return false;
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.ntb.e.contains(((java.util.Map.Entry) obj).getValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                defpackage.yqm yqmVar = defpackage.ntb.a;
                return defpackage.laq.a.a().b() || !defpackage.ntb.f.contains(entry.getValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.nyh.a.contains(((nuv) obj).c.x);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((nuv) obj).f();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.util.Objects.nonNull(obj);
            default:
                return true;
        }
    }
}
