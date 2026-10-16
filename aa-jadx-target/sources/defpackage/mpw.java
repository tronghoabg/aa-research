package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mpw implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mpw(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((android.content.ComponentName) this.a).equals((android.content.ComponentName) obj);
            case 1:
                return ((kqo) this.a).n((kqo) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = mqz.a;
                return ((java.lang.String) obj).equals(this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar2 = defpackage.mrn.a;
                return !this.a.add((java.lang.String) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ?? r3 = this.a;
                defpackage.nke nkeVar = defpackage.nkj.a;
                return ((java.lang.Boolean) r3.invoke(obj)).booleanValue();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((java.lang.Boolean) this.a.invoke(obj)).booleanValue();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.content.ComponentName componentNameAv = defpackage.tna.av((android.content.pm.ResolveInfo) obj);
                if (componentNameAv == null) {
                    return false;
                }
                return ((defpackage.nsn) this.a).g(componentNameAv);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.nsn) this.a).g((android.content.ComponentName) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar3 = defpackage.ofl.a;
                return ((java.lang.String) this.a).equals(((android.bluetooth.BluetoothDevice) obj).getAddress());
            case 9:
                return this.a.contains((java.lang.Integer) obj);
            case 10:
                return j$.util.Objects.equals(((defpackage.ofj) this.a).a.i, ((android.bluetooth.BluetoothDevice) obj).getAddress());
            case 11:
                return ((java.lang.String) this.a).equals((java.lang.String) obj);
            case 12:
                defpackage.yqm yqmVar4 = com.google.android.apps.auto.components.telecom.impl.VoipUtilsImpl.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            case 13:
                defpackage.yqm yqmVar5 = com.google.android.apps.auto.components.telecom.impl.VoipUtilsImpl.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            case 14:
                defpackage.yqm yqmVar6 = defpackage.ofz.a;
                return ((com.google.android.apps.auto.components.telecom.call.CarCall) obj).a == ((ofy) this.a).a.a;
            case 15:
                java.util.Map mapA = ((com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider) this.a).a();
                yyt yytVarB = yyt.b(((olq) obj).d);
                if (yytVarB == null) {
                    yytVarB = yyt.a;
                }
                return mapA.containsKey(yytVarB);
            case 16:
                yyt yytVarB2 = yyt.b(((olq) obj).d);
                if (yytVarB2 == null) {
                    yytVarB2 = yyt.a;
                }
                return ((yyt) this.a).equals(yytVarB2);
            case 17:
                return ((java.util.UUID) this.a).toString().equals(((olq) obj).c);
            case 18:
                return ((olq) obj).c.equals(((java.util.UUID) this.a).toString());
            case 19:
                defpackage.yqm yqmVar7 = defpackage.olx.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            default:
                int i = com.google.android.apps.auto.components.ui.appbar.AppBarImpl.r;
                return !((defpackage.yhx) this.a).contains((android.view.View) obj);
        }
    }
}
