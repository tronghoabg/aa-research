package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.format.DateUtils;
import androidx.car.app.model.CarIcon;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class kkw implements afeh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kkw(int i) {
        this.b = i;
        this.a = "Car property controls";
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objValueOf;
        IconCompat iconCompatM;
        int i = 9;
        int i2 = 6;
        z = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                bux buxVar = (bux) obj2;
                ((Integer) obj3).intValue();
                Object obj4 = this.a;
                int i3 = kkz.a;
                ((tio) obj).getClass();
                buxVar.v(-912853302);
                String strB = kkz.b((kjz) obj4);
                aezr aezrVar = thw.a;
                tiw tiwVarV = std.v(strB, std.w(), buxVar, 4);
                buxVar.o();
                return tiwVarV;
            case 1:
                bux buxVar2 = (bux) obj2;
                ((Integer) obj3).intValue();
                Object obj5 = this.a;
                int i4 = kkz.a;
                ((tio) obj).getClass();
                buxVar2.v(-798596700);
                aezr aezrVar2 = thw.a;
                tiw tiwVarV2 = std.v((String) obj5, std.w(), buxVar2, 4);
                buxVar2.o();
                return tiwVarV2;
            case 2:
                bux buxVar3 = (bux) obj2;
                ((Integer) obj3).intValue();
                Object obj6 = this.a;
                int i5 = kkz.a;
                ((tio) obj).getClass();
                buxVar3.v(87050569);
                String strB2 = kkz.b((kjz) obj6);
                aezr aezrVar3 = thw.a;
                tiw tiwVarV3 = std.v(strB2, std.w(), buxVar3, 4);
                buxVar3.o();
                return tiwVarV3;
            case 3:
                tiw tiwVar = (tiw) obj;
                bux buxVar4 = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i6 = kkz.a;
                tiwVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true != ((iIntValue & 8) == 0 ? buxVar4.C(tiwVar) : buxVar4.E(tiwVar)) ? 2 : 4;
                }
                if (buxVar4.I((iIntValue & 19) != 18, iIntValue & 1)) {
                    for (kjk kjkVar : this.a) {
                        std.l(tiwVar, kkz.b(kjkVar.a), bxc.i(-1274468229, true, new jjb(kjkVar, 17), buxVar4), buxVar4, (iIntValue & 14) | 384);
                    }
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 4:
                bux buxVar5 = (bux) obj2;
                ((Integer) obj3).intValue();
                Object obj7 = this.a;
                int i7 = kkz.a;
                ((tio) obj).getClass();
                buxVar5.v(-372055628);
                tiw tiwVarV4 = std.v((String) obj7, null, buxVar5, 6);
                buxVar5.o();
                return tiwVarV4;
            case 5:
                bux buxVar6 = (bux) obj2;
                ((Integer) obj3).intValue();
                Object obj8 = this.a;
                int i8 = kkz.a;
                ((tio) obj).getClass();
                buxVar6.v(1997647139);
                aezr aezrVar4 = thw.a;
                tiw tiwVarV5 = std.v((String) obj8, std.w(), buxVar6, 4);
                buxVar6.o();
                return tiwVarV5;
            case 6:
                tiw tiwVar2 = (tiw) obj;
                bux buxVar7 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i9 = kkz.a;
                tiwVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? buxVar7.C(tiwVar2) : buxVar7.E(tiwVar2)) ? 2 : 4;
                }
                if (buxVar7.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    for (kjz kjzVar : this.a) {
                        std.l(tiwVar2, kkz.b(kjzVar), bxc.i(-992159188, true, new jjb(kjzVar, 5), buxVar7), buxVar7, (iIntValue2 & 14) | 384);
                    }
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 7:
                tjq tjqVar = (tjq) obj;
                bux buxVar8 = (bux) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i10 = kkz.a;
                tjqVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true != ((iIntValue3 & 8) == 0 ? buxVar8.C(tjqVar) : buxVar8.E(tjqVar)) ? 2 : 4;
                }
                if (buxVar8.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    kkz.f(tjqVar, (kla) this.a, buxVar8, (iIntValue3 & 14) | 64);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 8:
                tjq tjqVar2 = (tjq) obj;
                bux buxVar9 = (bux) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i11 = kkz.a;
                tjqVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true != ((iIntValue4 & 8) == 0 ? buxVar9.C(tjqVar2) : buxVar9.E(tjqVar2)) ? 2 : 4;
                }
                if (buxVar9.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    kkz.u(tjqVar2, (kla) this.a, buxVar9, (iIntValue4 & 14) | 560);
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 9:
                cfy cfyVar = (cfy) obj;
                bux buxVar10 = (bux) obj2;
                ((Integer) obj3).intValue();
                cfyVar.getClass();
                buxVar10.v(-88233003);
                Object objG = buxVar10.g();
                Object obj9 = buw.a;
                if (objG == obj9) {
                    objG = new cil();
                    buxVar10.x(objG);
                }
                Object obj10 = this.a;
                cil cilVar = (cil) objG;
                kwp kwpVar = (kwp) buxVar10.f(kml.c);
                boolean zE = buxVar10.E(kwpVar) | buxVar10.C(obj10);
                Object objG2 = buxVar10.g();
                if (zE || objG2 == obj9) {
                    objG2 = new hgf(kwpVar, cilVar, obj10, 7);
                    buxVar10.x(objG2);
                }
                bvq.c(cilVar, (afec) objG2, buxVar10);
                cfy cfyVarJ = bxc.j(cfyVar, cilVar);
                buxVar10.o();
                return cfyVarJ;
            case 10:
                avx avxVar = (avx) obj;
                bux buxVar11 = (bux) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                avxVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true != buxVar11.C(avxVar) ? 2 : 4;
                }
                if (buxVar11.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    this.a.invoke(avxVar, buxVar11, Integer.valueOf(iIntValue5 & 14));
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 11:
                bux buxVar12 = (bux) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ats) obj).getClass();
                if (buxVar12.I((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    cfv cfvVar = cfy.e;
                    cfy cfyVarH = asl.H(cfvVar, 8.0f);
                    ctp ctpVarA = atp.a(atd.c, cfl.k, buxVar12, 48);
                    int iG = a.g(buxVar12.b());
                    ccx ccxVarN = buxVar12.N();
                    cfy cfyVarJ2 = bzi.j(buxVar12, cfyVarH);
                    afdr afdrVar = cwb.a;
                    buxVar12.M();
                    buxVar12.w();
                    if (buxVar12.G()) {
                        buxVar12.j(afdrVar);
                    } else {
                        buxVar12.y();
                    }
                    Object obj11 = this.a;
                    byq.c(buxVar12, ctpVarA, cwb.e);
                    byq.c(buxVar12, ccxVarN, cwb.d);
                    byq.c(buxVar12, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar12, cwb.g);
                    byq.c(buxVar12, cfyVarJ2, cwb.c);
                    kuw kuwVar = (kuw) obj11;
                    ca.bb(lgi.f((GhIcon) ((bym) kuwVar.g.invoke(buxVar12.f(daa.b), buxVar12, 0)).a(), BitmapDescriptorFactory.HUE_RED, buxVar12, 3), null, awd.i(cfvVar, 32.0f), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar12, 440, 120);
                    String strName = kuwVar.name();
                    StringBuilder sb = new StringBuilder();
                    for (int i12 = 0; i12 < strName.length(); i12++) {
                        char cCharAt = strName.charAt(i12);
                        if (sb.length() <= 0 || !Character.isUpperCase(cCharAt)) {
                            objValueOf = Character.valueOf(cCharAt);
                        } else {
                            String strValueOf = String.valueOf(cCharAt);
                            strValueOf.getClass();
                            String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            objValueOf = " ".concat(lowerCase);
                        }
                        sb.append(objValueOf);
                    }
                    brp.b(sb.toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar12, 0, 0, 262142);
                    buxVar12.n();
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 12:
                atm atmVar = (atm) obj;
                bux buxVar13 = (bux) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                atmVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true != buxVar13.C(atmVar) ? 2 : 4;
                }
                if (buxVar13.I((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    this.a.invoke(atmVar, buxVar13, Integer.valueOf(iIntValue7 & 14));
                } else {
                    buxVar13.s();
                }
                return afak.a;
            case 13:
                aezu aezuVar = (aezu) obj;
                ltr ltrVar = (ltr) obj2;
                CharSequence charSequence = (CharSequence) obj3;
                aezuVar.getClass();
                Object obj12 = this.a;
                if (ltrVar == null) {
                    Bitmap bitmap = (Bitmap) aezuVar.a;
                    if (bitmap != null) {
                        Context context = ((llg) obj12).b;
                        Bitmap bitmapB = omu.b(bitmap);
                        bitmapB.getClass();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapB.getWidth(), bitmapB.getHeight(), Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint();
                        Rect rect = new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight());
                        float fA = tdf.a(12, context);
                        canvas.drawARGB(0, 0, 0, 0);
                        paint.setColor(-16777216);
                        canvas.drawRoundRect(new RectF(rect), fA, fA, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmapB, rect, rect, paint);
                        iconCompatM = IconCompat.k(bitmapCreateBitmap);
                    } else {
                        iconCompatM = null;
                    }
                } else {
                    iconCompatM = IconCompat.m(((llg) obj12).b, ltrVar.b);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (iconCompatM != null) {
                    llg.c(spannableStringBuilder, new CarIcon(new tj(iconCompatM)));
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                if (charSequence != null) {
                    spannableStringBuilder.append(charSequence);
                }
                SpannedString spannedString = new SpannedString(spannableStringBuilder);
                if (afyh.v(spannedString)) {
                    return null;
                }
                return spannedString;
            case 14:
                cfy cfyVar2 = (cfy) obj;
                bux buxVar14 = (bux) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                cfyVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= true == buxVar14.C(cfyVar2) ? 4 : 2;
                }
                if (buxVar14.I((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    ca.bb(lgi.f((GhIcon) this.a, BitmapDescriptorFactory.HUE_RED, buxVar14, 3), null, cfyVar2, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVar14, ((iIntValue8 << 6) & 896) | 56, 120);
                } else {
                    buxVar14.s();
                }
                return afak.a;
            case 15:
                return roc.av(this.a, (abu) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 16:
                cfy cfyVar3 = (cfy) obj;
                bux buxVar15 = (bux) obj2;
                ((Integer) obj3).intValue();
                yph yphVar = myi.a;
                cfyVar3.getClass();
                buxVar15.v(-281168230);
                Object objG3 = buxVar15.g();
                Object obj13 = buw.a;
                if (objG3 == obj13) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                    buxVar15.x(parcelableSnapshotMutableState);
                    objG3 = parcelableSnapshotMutableState;
                }
                bwq bwqVar = (bwq) objG3;
                Object objG4 = buxVar15.g();
                if (objG4 == obj13) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                    buxVar15.x(parcelableSnapshotMutableState2);
                    objG4 = parcelableSnapshotMutableState2;
                }
                bwq bwqVar2 = (bwq) objG4;
                eqa eqaVar = (eqa) buxVar15.f(erz.a);
                boolean zE2 = buxVar15.E(eqaVar);
                Object objG5 = buxVar15.g();
                if (zE2 || objG5 == obj13) {
                    objG5 = new lyb(eqaVar, bwqVar2, 8);
                    buxVar15.x(objG5);
                }
                bvq.c(eqaVar, (afec) objG5, buxVar15);
                if (((Boolean) bwqVar.a()).booleanValue() && ((Boolean) bwqVar2.a()).booleanValue()) {
                    z = true;
                }
                Object obj14 = this.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zD = buxVar15.D(z) | buxVar15.C(obj14);
                Object objG6 = buxVar15.g();
                if (zD || objG6 == obj13) {
                    objG6 = new glh(z, obj14, i2);
                    buxVar15.x(objG6);
                }
                bvq.c(boolValueOf, (afec) objG6, buxVar15);
                dlg dlgVar = (dlg) buxVar15.f(dbc.d);
                boolean zC = buxVar15.C(dlgVar) | buxVar15.z(64.0f);
                Object objG7 = buxVar15.g();
                if (zC || objG7 == obj13) {
                    objG7 = new lyb(dlgVar, bwqVar, i);
                    buxVar15.x(objG7);
                }
                cfy cfyVarF = tt.f(cfyVar3, (afec) objG7);
                buxVar15.o();
                return cfyVarF;
            case 17:
                uxc uxcVar = (uxc) obj;
                bux buxVar16 = (bux) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                yph yphVar2 = myi.a;
                uxcVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= true == buxVar16.C(uxcVar) ? 4 : 2;
                }
                if (buxVar16.I((iIntValue9 & 19) != 18, iIntValue9 & 1)) {
                    ?? r0 = this.a;
                    uxcVar.c(vq.e(myi.a(r0) == null ? R.string.media_player_no_app : R.string.media_player_invalid_session_subtitle, buxVar16), null, myi.a(r0) != null, buxVar16, (iIntValue9 << 9) & 7168, 2);
                } else {
                    buxVar16.s();
                }
                return afak.a;
            case 18:
                bux buxVar17 = (bux) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                aezr aezrVar5 = ndj.a;
                ((atm) obj).getClass();
                if (buxVar17.I((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    ?? r02 = this.a;
                    cfv cfvVar2 = cfy.e;
                    r02.invoke(awd.c(cfvVar2, 1.0f), buxVar17, 6);
                    atk.c(awd.c(cfvVar2, 1.0f).a(new aix(-7410063877007736832L, ckq.a)), buxVar17, 6);
                } else {
                    buxVar17.s();
                }
                return afak.a;
            case 19:
                cfy cfyVar4 = (cfy) obj;
                bux buxVar18 = (bux) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                aezr aezrVar6 = ndj.a;
                cfyVar4.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= true == buxVar18.C(cfyVar4) ? 4 : 2;
                }
                if (buxVar18.I((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    Bitmap bitmapA = ndj.a(this.a);
                    if (bitmapA == null) {
                        buxVar18.v(-200649876);
                        buxVar18.o();
                    } else {
                        buxVar18.v(-200649875);
                        ca.bc(new cjj(bitmapA), cfyVar4, csh.a, buxVar18, ((iIntValue11 << 6) & 896) | 24624, 232);
                        buxVar18.o();
                    }
                } else {
                    buxVar18.s();
                }
                return afak.a;
            default:
                nua nuaVar = (nua) obj;
                long jLongValue = ((Long) obj2).longValue();
                nuaVar.getClass();
                ((afak) obj3).getClass();
                int iOrdinal = nuaVar.ordinal();
                if (iOrdinal == 0) {
                    return null;
                }
                if (iOrdinal == 1) {
                    Object obj15 = this.a;
                    oni.b();
                    String strA = oni.a(((ndp) obj15).c, jLongValue);
                    strA.getClass();
                    return strA;
                }
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                oni.b();
                oit.a();
                long epochMilli = Instant.now().toEpochMilli() - jLongValue;
                if (epochMilli < 0) {
                    epochMilli = 0;
                }
                return DateUtils.formatElapsedTime(epochMilli / 1000);
        }
    }

    public /* synthetic */ kkw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
