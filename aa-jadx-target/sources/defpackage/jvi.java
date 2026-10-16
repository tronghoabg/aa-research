package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jvi implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ jvi(int i) {
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
                return (java.lang.String) obj;
            case 1:
                return ((defpackage.mqj) obj).a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i = jxk.a;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.MEDIA);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                int i2 = defpackage.jym.a;
                return new defpackage.mqj(componentName, defpackage.mkc.R().r(defpackage.mkp.a.c, componentName.getPackageName()) ? defpackage.mqg.PHONE : defpackage.mqg.OTHER);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.mqj) obj).a();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(((java.lang.CharSequence) obj).length());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.mqj) obj).a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.mqi) obj).a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.mqj) obj).a;
            case 9:
                return ((defpackage.mqj) obj).a;
            case 10:
                return ((defpackage.mqj) obj).a;
            case 11:
                return ((defpackage.mqj) obj).a();
            case 12:
                return new defpackage.mqj((android.content.ComponentName) obj);
            case 13:
                int i3 = defpackage.jzg.a;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.NAVIGATION);
            case 14:
                return new defpackage.mqj((android.content.ComponentName) obj);
            case 15:
                int i4 = jzi.b;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.NAVIGATION);
            case 16:
                defpackage.yqm yqmVar = defpackage.kag.a;
                android.content.pm.ServiceInfo serviceInfo = ((android.content.pm.ResolveInfo) obj).serviceInfo;
                return new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
            case 17:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView.a;
                tb tbVar = new tb((androidx.car.app.model.Action) obj);
                tbVar.a = false;
                return tbVar.a();
            case 18:
                defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.apphost.view.widgets.common.RowView.a;
                tb tbVar2 = new tb((androidx.car.app.model.Action) obj);
                tbVar2.a = false;
                return tbVar2.a();
            case 19:
                return ((defpackage.mqj) obj).a().getPackageName();
            default:
                return ((defpackage.lma) obj).i();
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
