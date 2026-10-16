package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class koo implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ koo(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v48, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = 6;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                pby pbyVar = (pby) obj;
                defpackage.yqm yqmVar = defpackage.kou.a;
                int i2 = pbyVar.c;
                if (i2 == 11) {
                    defpackage.pbp pbpVarB = defpackage.pbp.b((i2 == 11 ? (pbt) pbyVar.d : pbt.a).d);
                    if (pbpVarB == null) {
                        pbpVarB = defpackage.pbp.CALL_SITE_UNSET;
                    }
                    if (pbpVarB.equals(this.a)) {
                        return true;
                    }
                }
                return false;
            case 1:
                defpackage.yqm yqmVar2 = defpackage.kou.a;
                return kor.b((pby) obj).equals(this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                pby pbyVar2 = (pby) obj;
                int i3 = pbyVar2.e;
                java.lang.Object obj2 = this.a;
                return i3 == 9 ? ((defpackage.kou) obj2).l(pbyVar2) : ((defpackage.kou) obj2).c.contains(kor.b(pbyVar2));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.kou.a;
                return kor.b((pby) obj).equals(this.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.kou.a;
                return kor.b((pby) obj) == this.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                kqo kqoVar = (kqo) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                kqoVar.getClass();
                return stream.anyMatch(new defpackage.koo(kqoVar, i));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((kqo) this.a).n((kqo) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                kqo kqoVar2 = (kqo) obj;
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                kqoVar2.getClass();
                return stream2.noneMatch(new defpackage.koo(kqoVar2, i));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return !((kqo) this.a).n((kqo) obj);
            case 9:
                return ((android.os.UserManager) ((defpackage.htw) this.a).a).isManagedProfile(((android.os.UserHandle) obj).getIdentifier());
            case 10:
                return ((android.bluetooth.BluetoothDevice) obj).getAddress().equals(((kyc) this.a).a);
            case 11:
                return ((defpackage.ygw) this.a).contains((android.bluetooth.BluetoothDevice) obj);
            case 12:
                return ((java.lang.String) this.a).equals((java.lang.String) obj);
            case 13:
                java.lang.Object obj3 = this.a;
                defpackage.yqm yqmVar5 = defpackage.kzl.a;
                return j$.util.Objects.equals(((android.content.ComponentName) obj).getPackageName(), obj3);
            case 14:
                return ((android.content.ComponentName) this.a).equals((android.content.ComponentName) obj);
            case 15:
                defpackage.yqm yqmVar6 = laf.a;
                return ((defpackage.mqj) obj).a().equals(this.a);
            case 16:
                ?? r4 = this.a;
                defpackage.ljv ljvVar = defpackage.ljw.a;
                return ((java.lang.Boolean) r4.invoke(obj)).booleanValue();
            case 17:
                return ((android.content.ComponentName) this.a).equals((android.content.ComponentName) obj);
            case 18:
                ?? r5 = this.a;
                int i4 = defpackage.loo.a;
                return android.text.TextUtils.equals(((android.content.ComponentName) obj).getPackageName(), r5);
            case 19:
                return ((android.content.ComponentName) this.a).equals((android.content.ComponentName) obj);
            default:
                defpackage.yqm yqmVar7 = defpackage.lpg.a;
                return ((defpackage.mqj) obj).a().equals(((lph) this.a).a);
        }
    }
}
