package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class klc implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ klc(int i) {
        this.b = i;
        this.a = "Car property controls";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [bys, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object objValueOf;
        androidx.core.graphics.drawable.IconCompat iconCompatM;
        int i = 9;
        int i2 = 6;
        z = false;
        boolean z = false;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                tkn tknVar = (tkn) obj;
                defpackage.bve bveVar = (defpackage.bve) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                int i3 = klg.a;
                tknVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true == ((iIntValue & 8) == 0 ? bveVar.C(tknVar) : bveVar.E(tknVar)) ? 4 : 2;
                }
                if (bveVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                    klg.v(tknVar, (java.util.List) this.a, bveVar, iIntValue & 14);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case 1:
                tjt tjtVar = (tjt) obj;
                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                int i4 = klg.a;
                tjtVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? bveVar2.C(tjtVar) : bveVar2.E(tjtVar)) ? 4 : 2;
                }
                if (bveVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    java.lang.Object obj4 = this.a;
                    boolean z2 = ((kjo) obj4).b;
                    java.lang.String str = true != z2 ? "Action is disabled" : "Press here to take action";
                    boolean zE = bveVar2.E(obj4);
                    java.lang.Object objG = bveVar2.g();
                    if (zE || objG == defpackage.bvd.a) {
                        objG = new kjt(obj4, 5);
                        bveVar2.x(objG);
                    }
                    int i5 = iIntValue2 & 14;
                    sub.l(tjtVar, str, sub.h((defpackage.afer) objG), false, z2, (defpackage.affh) null, bveVar2, i5, 90);
                    klg.q(tjtVar, (kjr) obj4, bveVar2, i5);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                tkn tknVar2 = (tkn) obj;
                defpackage.bve bveVar3 = (defpackage.bve) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                int i6 = klg.a;
                tknVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == ((iIntValue3 & 8) == 0 ? bveVar3.C(tknVar2) : bveVar3.E(tknVar2)) ? 4 : 2;
                }
                if (bveVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    klg.m(tknVar2, (kkf) this.a, bveVar3, iIntValue3 & 14);
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                java.lang.Object obj5 = this.a;
                int i7 = klg.a;
                ((tjl) obj).getClass();
                bveVar4.v(-798596700);
                defpackage.afar afarVar = tiu.a;
                tjt tjtVarZ = sub.z((java.lang.String) obj5, sub.A(), bveVar4, 4);
                bveVar4.o();
                return tjtVarZ;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar5 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                java.lang.Object obj6 = this.a;
                int i8 = klg.a;
                ((tjl) obj).getClass();
                bveVar5.v(-912853302);
                java.lang.String strB = klg.b((kkf) obj6);
                defpackage.afar afarVar2 = tiu.a;
                tjt tjtVarZ2 = sub.z(strB, sub.A(), bveVar5, 4);
                bveVar5.o();
                return tjtVarZ2;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar6 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                java.lang.Object obj7 = this.a;
                int i9 = klg.a;
                ((tjl) obj).getClass();
                bveVar6.v(87050569);
                java.lang.String strB2 = klg.b((kkf) obj7);
                defpackage.afar afarVar3 = tiu.a;
                tjt tjtVarZ3 = sub.z(strB2, sub.A(), bveVar6, 4);
                bveVar6.o();
                return tjtVarZ3;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                tjt tjtVar2 = (tjt) obj;
                defpackage.bve bveVar7 = (defpackage.bve) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                int i10 = klg.a;
                tjtVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true == ((iIntValue4 & 8) == 0 ? bveVar7.C(tjtVar2) : bveVar7.E(tjtVar2)) ? 4 : 2;
                }
                if (bveVar7.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    for (kjq kjqVar : this.a) {
                        sub.p(tjtVar2, klg.b(kjqVar.a), defpackage.dai.as(-1274468229, true, new hkb(kjqVar, 20), bveVar7), bveVar7, (iIntValue4 & 14) | 384);
                    }
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar8 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                java.lang.Object obj8 = this.a;
                int i11 = klg.a;
                ((tjl) obj).getClass();
                bveVar8.v(-372055628);
                tjt tjtVarZ4 = sub.z((java.lang.String) obj8, (tiv) null, bveVar8, 6);
                bveVar8.o();
                return tjtVarZ4;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar9 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                java.lang.Object obj9 = this.a;
                int i12 = klg.a;
                ((tjl) obj).getClass();
                bveVar9.v(1997647139);
                defpackage.afar afarVar4 = tiu.a;
                tjt tjtVarZ5 = sub.z((java.lang.String) obj9, sub.A(), bveVar9, 4);
                bveVar9.o();
                return tjtVarZ5;
            case 9:
                tjt tjtVar3 = (tjt) obj;
                defpackage.bve bveVar10 = (defpackage.bve) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                int i13 = klg.a;
                tjtVar3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == ((iIntValue5 & 8) == 0 ? bveVar10.C(tjtVar3) : bveVar10.E(tjtVar3)) ? 4 : 2;
                }
                if (bveVar10.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    for (kkf kkfVar : this.a) {
                        sub.p(tjtVar3, klg.b(kkfVar), defpackage.dai.as(-992159188, true, new hkb(kkfVar, 8), bveVar10), bveVar10, (iIntValue5 & 14) | 384);
                    }
                } else {
                    bveVar10.s();
                }
                return defpackage.afbk.a;
            case 10:
                tkn tknVar3 = (tkn) obj;
                defpackage.bve bveVar11 = (defpackage.bve) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                int i14 = klg.a;
                tknVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true == ((iIntValue6 & 8) == 0 ? bveVar11.C(tknVar3) : bveVar11.E(tknVar3)) ? 4 : 2;
                }
                if (bveVar11.I((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    klg.f(tknVar3, (klh) this.a, bveVar11, (iIntValue6 & 14) | 64);
                } else {
                    bveVar11.s();
                }
                return defpackage.afbk.a;
            case 11:
                tkn tknVar4 = (tkn) obj;
                defpackage.bve bveVar12 = (defpackage.bve) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                int i15 = klg.a;
                tknVar4.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true == ((iIntValue7 & 8) == 0 ? bveVar12.C(tknVar4) : bveVar12.E(tknVar4)) ? 4 : 2;
                }
                if (bveVar12.I((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    klg.u(tknVar4, (klh) this.a, bveVar12, (iIntValue7 & 14) | 560);
                } else {
                    bveVar12.s();
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.cgf cgfVar = (defpackage.cgf) obj;
                defpackage.bve bveVar13 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                int i16 = defpackage.kms.a;
                cgfVar.getClass();
                bveVar13.v(-88233003);
                java.lang.Object objG2 = bveVar13.g();
                java.lang.Object obj10 = defpackage.bvd.a;
                if (objG2 == obj10) {
                    objG2 = new defpackage.cit();
                    bveVar13.x(objG2);
                }
                java.lang.Object obj11 = this.a;
                defpackage.cit citVar = (defpackage.cit) objG2;
                defpackage.khb khbVar = (defpackage.khb) bveVar13.f(defpackage.kms.c);
                boolean zE2 = bveVar13.E(khbVar) | bveVar13.C(obj11);
                java.lang.Object objG3 = bveVar13.g();
                if (zE2 || objG3 == obj10) {
                    objG3 = new defpackage.ipk(khbVar, citVar, obj11, i2);
                    bveVar13.x(objG3);
                }
                defpackage.bvx.c(citVar, (defpackage.affc) objG3, bveVar13);
                defpackage.cgf cgfVarQ = defpackage.bzd.q(cgfVar, citVar);
                bveVar13.o();
                return cgfVarQ;
            case 13:
                defpackage.awd awdVar = (defpackage.awd) obj;
                defpackage.bve bveVar14 = (defpackage.bve) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                awdVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= true == bveVar14.C(awdVar) ? 4 : 2;
                }
                if (bveVar14.I((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    this.a.invoke(awdVar, bveVar14, java.lang.Integer.valueOf(iIntValue8 & 14));
                } else {
                    bveVar14.s();
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.bve bveVar15 = (defpackage.bve) obj2;
                int iIntValue9 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.atx) obj).getClass();
                if (bveVar15.I((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    defpackage.cgc cgcVar = defpackage.cgf.e;
                    defpackage.cgf cgfVarH = defpackage.asq.H(cgcVar, 8.0f);
                    defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVar15, 48);
                    int iF = defpackage.a.f(bveVar15.b());
                    defpackage.cdd cddVarN = bveVar15.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar15, cgfVarH);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar15.M();
                    bveVar15.w();
                    if (bveVar15.G()) {
                        bveVar15.j(aferVar);
                    } else {
                        bveVar15.y();
                    }
                    java.lang.Object obj12 = this.a;
                    defpackage.byw.c(bveVar15, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVar15, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar15, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVar15, defpackage.cwl.g);
                    defpackage.byw.c(bveVar15, cgfVarN, defpackage.cwl.c);
                    kvc kvcVar = (kvc) obj12;
                    defpackage.ca.bb(defpackage.lgo.f((com.google.android.apps.auto.components.graphics.icon.GhIcon) ((defpackage.bys) kvcVar.g.invoke(bveVar15.f(defpackage.daj.b), bveVar15, 0)).a(), 0.0f, bveVar15, 3), null, defpackage.awj.i(cgcVar, 32.0f), null, null, 0.0f, null, bveVar15, 440, 120);
                    java.lang.String strName = kvcVar.name();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i17 = 0; i17 < strName.length(); i17++) {
                        char cCharAt = strName.charAt(i17);
                        if (sb.length() <= 0 || !java.lang.Character.isUpperCase(cCharAt)) {
                            objValueOf = java.lang.Character.valueOf(cCharAt);
                        } else {
                            java.lang.String strValueOf = java.lang.String.valueOf(cCharAt);
                            strValueOf.getClass();
                            java.lang.String lowerCase = strValueOf.toLowerCase(java.util.Locale.ROOT);
                            lowerCase.getClass();
                            objValueOf = " ".concat(lowerCase);
                        }
                        sb.append(objValueOf);
                    }
                    defpackage.brv.b(sb.toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar15, 0, 0, 262142);
                    bveVar15.n();
                } else {
                    bveVar15.s();
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.atr atrVar = (defpackage.atr) obj;
                defpackage.bve bveVar16 = (defpackage.bve) obj2;
                int iIntValue10 = ((java.lang.Integer) obj3).intValue();
                atrVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= true == bveVar16.C(atrVar) ? 4 : 2;
                }
                if (bveVar16.I((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    this.a.invoke(atrVar, bveVar16, java.lang.Integer.valueOf(iIntValue10 & 14));
                } else {
                    bveVar16.s();
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.afau afauVar = (defpackage.afau) obj;
                ltx ltxVar = (ltx) obj2;
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj3;
                afauVar.getClass();
                java.lang.Object obj13 = this.a;
                if (ltxVar == null) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) afauVar.a;
                    if (bitmap != null) {
                        android.content.Context context = ((lll) obj13).b;
                        android.graphics.Bitmap bitmapB = defpackage.onn.b(bitmap);
                        bitmapB.getClass();
                        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapB.getWidth(), bitmapB.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight());
                        float fA = tec.a(12, context);
                        canvas.drawARGB(0, 0, 0, 0);
                        paint.setColor(-16777216);
                        canvas.drawRoundRect(new android.graphics.RectF(rect), fA, fA, paint);
                        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmapB, rect, rect, paint);
                        iconCompatM = androidx.core.graphics.drawable.IconCompat.k(bitmapCreateBitmap);
                    } else {
                        iconCompatM = null;
                    }
                } else {
                    iconCompatM = androidx.core.graphics.drawable.IconCompat.m(((lll) obj13).b, ltxVar.b);
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                if (iconCompatM != null) {
                    lll.c(spannableStringBuilder, new androidx.car.app.model.CarIcon(new defpackage.to(iconCompatM)));
                    spannableStringBuilder.append((java.lang.CharSequence) "  ");
                }
                if (charSequence != null) {
                    spannableStringBuilder.append(charSequence);
                }
                android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
                if (afzh.v(spannedString)) {
                    return null;
                }
                return spannedString;
            case 17:
                defpackage.cgf cgfVar2 = (defpackage.cgf) obj;
                defpackage.bve bveVar17 = (defpackage.bve) obj2;
                int iIntValue11 = ((java.lang.Integer) obj3).intValue();
                cgfVar2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= true == bveVar17.C(cgfVar2) ? 4 : 2;
                }
                if (bveVar17.I((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    defpackage.ca.bb(defpackage.lgo.f((com.google.android.apps.auto.components.graphics.icon.GhIcon) this.a, 0.0f, bveVar17, 3), null, cgfVar2, null, null, 0.0f, null, bveVar17, ((iIntValue11 << 6) & 896) | 56, 120);
                } else {
                    bveVar17.s();
                }
                return defpackage.afbk.a;
            case 18:
                return defpackage.tna.aF(this.a, (defpackage.acb) obj, (defpackage.bve) obj2, ((java.lang.Integer) obj3).intValue());
            case 19:
                defpackage.cgf cgfVar3 = (defpackage.cgf) obj;
                defpackage.bve bveVar18 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                defpackage.yqm yqmVar = defpackage.myx.a;
                cgfVar3.getClass();
                bveVar18.v(-281168230);
                java.lang.Object objG4 = bveVar18.g();
                java.lang.Object obj14 = defpackage.bvd.a;
                if (objG4 == obj14) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bveVar18.x(parcelableSnapshotMutableState);
                    objG4 = parcelableSnapshotMutableState;
                }
                defpackage.bwx bwxVar = (defpackage.bwx) objG4;
                java.lang.Object objG5 = bveVar18.g();
                if (objG5 == obj14) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bveVar18.x(parcelableSnapshotMutableState2);
                    objG5 = parcelableSnapshotMutableState2;
                }
                defpackage.bwx bwxVar2 = (defpackage.bwx) objG5;
                defpackage.bvm bvmVar = defpackage.daj.a;
                defpackage.eqg eqgVar = (defpackage.eqg) bveVar18.f(defpackage.esf.a);
                boolean zE3 = bveVar18.E(eqgVar);
                java.lang.Object objG6 = bveVar18.g();
                if (zE3 || objG6 == obj14) {
                    objG6 = new defpackage.lyi(eqgVar, bwxVar2, i);
                    bveVar18.x(objG6);
                }
                defpackage.bvx.c(eqgVar, (defpackage.affc) objG6, bveVar18);
                if (((java.lang.Boolean) bwxVar.a()).booleanValue() && ((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                    z = true;
                }
                java.lang.Object obj15 = this.a;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                boolean zD = bveVar18.D(z) | bveVar18.C(obj15);
                java.lang.Object objG7 = bveVar18.g();
                if (zD || objG7 == obj14) {
                    objG7 = new defpackage.glo(z, obj15, i2);
                    bveVar18.x(objG7);
                }
                defpackage.bvx.c(boolValueOf, (defpackage.affc) objG7, bveVar18);
                defpackage.dlo dloVar = (defpackage.dlo) bveVar18.f(defpackage.dbl.d);
                boolean zC = bveVar18.C(dloVar) | bveVar18.z(64.0f);
                java.lang.Object objG8 = bveVar18.g();
                if (zC || objG8 == obj14) {
                    objG8 = new defpackage.lyi(dloVar, bwxVar, 10);
                    bveVar18.x(objG8);
                }
                defpackage.cgf cgfVarE = defpackage.ty.e(cgfVar3, (defpackage.affc) objG8);
                bveVar18.o();
                return cgfVarE;
            default:
                uxy uxyVar = (uxy) obj;
                defpackage.bve bveVar19 = (defpackage.bve) obj2;
                int iIntValue12 = ((java.lang.Integer) obj3).intValue();
                defpackage.yqm yqmVar2 = defpackage.myx.a;
                uxyVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true == bveVar19.C(uxyVar) ? 4 : 2;
                }
                if (bveVar19.I((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    ?? r0 = this.a;
                    uxyVar.c(defpackage.vm.e(defpackage.myx.a(r0) == null ? 2132084421 : 2132084420, bveVar19), (defpackage.cgf) null, defpackage.myx.a(r0) != null, bveVar19, (iIntValue12 << 9) & 7168, 2);
                } else {
                    bveVar19.s();
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ klc(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
