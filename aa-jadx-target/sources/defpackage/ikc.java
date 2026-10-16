package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ikc implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ikc(int i) {
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
        int i = 5;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.ike.A((com.google.android.gms.car.control.CarProperty) obj);
            case 1:
                return java.lang.Integer.valueOf(((java.lang.CharSequence) obj).length());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return com.google.android.gms.car.control.CarAreaId.a((xhk) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((xhi) obj).a());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i2 = ((xjj) obj).f;
                defpackage.yqm yqmVar = defpackage.ikn.a;
                return java.lang.Integer.valueOf(i2);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(((xnm) obj).d);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                xnn xnnVar = (xnn) obj;
                defpackage.yqm yqmVar2 = defpackage.ikz.a;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(new defpackage.abph(xnnVar.d, xnn.a)).map(new defpackage.ikc(i));
                int i3 = defpackage.ygw.d;
                return new com.google.android.gms.car.RadioConfiguration.RadioBandGroup((java.util.List) map.collect(defpackage.yds.a), xnnVar.e, (xnnVar.c & 2) != 0 ? xnnVar.f : null, xnnVar.g);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar3 = defpackage.ild.a;
                return new defpackage.yfd(10);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.content.Intent intent = defpackage.ioh.a;
                return ((android.content.pm.ResolveInfo) obj).activityInfo;
            case 9:
                defpackage.yqm yqmVar4 = ipw.a;
                return new wtg((defpackage.jmp) obj);
            case 10:
                com.google.android.gms.car.display.integratedoverlay.OverlayParameters overlayParameters = (com.google.android.gms.car.display.integratedoverlay.OverlayParameters) obj;
                defpackage.abor aborVarN = xmx.a.n();
                int i4 = overlayParameters.a;
                aborVarN.t();
                xmx xmxVar = aborVarN.b;
                xmxVar.b |= 1;
                xmxVar.c = i4;
                defpackage.abor aborVarN2 = xmw.a.n();
                android.graphics.Rect rect = overlayParameters.b;
                int i5 = rect.left;
                aborVarN2.t();
                xmw xmwVar = aborVarN2.b;
                xmwVar.b |= 1;
                xmwVar.c = i5;
                int i6 = rect.top;
                aborVarN2.t();
                xmw xmwVar2 = aborVarN2.b;
                xmwVar2.b |= 2;
                xmwVar2.d = i6;
                int i7 = rect.right;
                aborVarN2.t();
                xmw xmwVar3 = aborVarN2.b;
                xmwVar3.b |= 4;
                xmwVar3.e = i7;
                int i8 = rect.bottom;
                aborVarN2.t();
                xmw xmwVar4 = aborVarN2.b;
                xmwVar4.b |= 8;
                xmwVar4.f = i8;
                aborVarN.t();
                xmx xmxVar2 = aborVarN.b;
                xmw xmwVarQ = aborVarN2.q();
                xmwVarQ.getClass();
                xmxVar2.d = xmwVarQ;
                xmxVar2.b |= 2;
                defpackage.abor aborVarN3 = xmy.a.n();
                float f = overlayParameters.c;
                aborVarN3.t();
                xmy xmyVar = aborVarN3.b;
                xmyVar.b = 1 | xmyVar.b;
                xmyVar.c = f;
                xmy xmyVarQ = aborVarN3.q();
                aborVarN.t();
                xmx xmxVar3 = aborVarN.b;
                xmyVarQ.getClass();
                xmxVar3.e = xmyVarQ;
                xmxVar3.b |= 4;
                return aborVarN.q();
            case 11:
                defpackage.xid xidVarB = defpackage.xid.b(((xib) obj).b);
                return xidVarB == null ? defpackage.xid.ACTION_UNKNOWN : xidVarB;
            case 12:
                return android.content.ComponentName.unflattenFromString((java.lang.String) obj);
            case 13:
                iwu iwuVar = (iwu) obj;
                int i9 = iwuVar.b;
                defpackage.yqm yqmVar5 = iwv.a;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i9);
                int i10 = iwuVar.a;
                return java.lang.String.format(java.util.Locale.US, "%d,%d-%d,%d=%d", numValueOf, java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i9 + iwuVar.d), java.lang.Integer.valueOf(i10 + iwuVar.c), java.lang.Integer.valueOf(iwuVar.e));
            case 14:
                return defpackage.iyh.s((android.content.pm.ResolveInfo) obj);
            case 15:
                defpackage.jfz jfzVarA = defpackage.jfz.a((java.lang.String) obj);
                jfzVarA.getClass();
                return jfzVarA;
            case 16:
                java.lang.String str = (java.lang.String) obj;
                defpackage.yqm yqmVar6 = defpackage.jle.a;
                return str;
            case 17:
                java.lang.String str2 = (java.lang.String) obj;
                str2.getClass();
                return android.content.ComponentName.unflattenFromString(str2);
            case 18:
                java.lang.String str3 = (java.lang.String) obj;
                defpackage.yqm yqmVar7 = jsg.a;
                return str3;
            case 19:
                return ((defpackage.mqj) obj).a();
            default:
                defpackage.yqm yqmVar8 = defpackage.jva.a;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.PHONE);
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
