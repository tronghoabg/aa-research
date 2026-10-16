package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class msw implements afeg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ msw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, lpt] */
    /* JADX WARN: Type inference failed for: r0v81, types: [atm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [atm, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        PlaybackStateCompat.CustomAction customAction;
        int i = 8;
        int i2 = 2;
        switch (this.b) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    Object obj3 = this.a;
                    lxw.q(((msk) obj3).a(), ((msx) obj3).b(), null, buxVar, 64, 4);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 1:
                mis misVar = (mis) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue) {
                    String string = ((mjg) obj4).e.getString(R.string.radio_remove_favorite_label);
                    if (TextUtils.isEmpty("aap.radio.action.favorite.remove")) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction("aap.radio.action.favorite.remove", string, R.drawable.gs_favorite_fill1_vd_theme_48, null);
                } else {
                    String string2 = ((mjg) obj4).e.getString(R.string.radio_add_favorite_label);
                    if (TextUtils.isEmpty("aap.radio.action.favorite.add")) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(string2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction("aap.radio.action.favorite.add", string2, R.drawable.gs_favorite_vd_theme_48, null);
                }
                eb ebVar = new eb();
                ebVar.c = 1077L;
                ebVar.b = -1L;
                ebVar.d(misVar.a, -1L, BitmapDescriptorFactory.HUE_RED);
                ebVar.a.add(customAction);
                Integer num = misVar.b;
                String str = misVar.c;
                if (num != null && str != null) {
                    num.intValue();
                    ebVar.b(2, str);
                }
                return ebVar.a();
            case 2:
                boolean z = false;
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = iIntValue2 & 3;
                int i4 = iIntValue2 & 1;
                if (i3 != 2) {
                    z = true;
                }
                if (buxVar2.I(z, i4)) {
                    ksr.a(null, null, false, null, bxc.i(270777899, true, new msw(this.a, 3), buxVar2), buxVar2, 24576, 15);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 3:
                bux buxVar3 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    Object obj5 = this.a;
                    if (lec.a.a().f()) {
                        buxVar3.v(795865503);
                        jur.b(bxc.i(-1137126680, true, new msw(obj5, false ? 1 : 0), buxVar3), buxVar3, 6);
                        buxVar3.o();
                    } else {
                        buxVar3.v(795958007);
                        lxw.q(((msk) obj5).a(), ((msx) obj5).b(), null, buxVar3, 64, 4);
                        buxVar3.o();
                    }
                } else {
                    buxVar3.s();
                }
                return afak.a;
            case 4:
                bux buxVar4 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj6 = this.a;
                    czz.am(kmi.a.b(obj6), bxc.i(237296339, true, new msw(obj6, i2), buxVar4), buxVar4, 48);
                } else {
                    buxVar4.s();
                }
                return afak.a;
            case 5:
                boolean z2 = false;
                bux buxVar5 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i5 = iIntValue5 & 3;
                int i6 = iIntValue5 & 1;
                if (i5 != 2) {
                    z2 = true;
                }
                if (buxVar5.I(z2, i6)) {
                    ksr.a(null, null, false, null, bxc.i(-1338489713, true, new msw(this.a, 7), buxVar5), buxVar5, 24576, 15);
                } else {
                    buxVar5.s();
                }
                return afak.a;
            case 6:
                bux buxVar6 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    Object obj7 = this.a;
                    czz.am(kmi.a.b(obj7), bxc.i(1326138167, true, new msw(obj7, 5), buxVar6), buxVar6, 48);
                } else {
                    buxVar6.s();
                }
                return afak.a;
            case 7:
                boolean z3 = false;
                bux buxVar7 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i7 = iIntValue7 & 3;
                int i8 = iIntValue7 & 1;
                if (i7 != 2) {
                    z3 = true;
                }
                if (buxVar7.I(z3, i8)) {
                    jur.b(bxc.i(-305552143, true, new msw(this.a, i), buxVar7), buxVar7, 6);
                } else {
                    buxVar7.s();
                }
                return afak.a;
            case 8:
                bux buxVar8 = (bux) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    mva.f((muq) ((mui) this.a).a.a(), buxVar8, 8);
                } else {
                    buxVar8.s();
                }
                return afak.a;
            case 9:
                bux buxVar9 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    Object obj8 = this.a;
                    mur murVar = (mur) obj8;
                    aezr aezrVar = murVar.a;
                    mtz mtzVarB = murVar.b();
                    oqc oqcVar = (oqc) aezrVar.a();
                    boolean z4 = !((msk) obj8).a();
                    int i9 = oqc.c;
                    mva.e(mtzVarB, oqcVar, z4, null, buxVar9, 72);
                } else {
                    buxVar9.s();
                }
                return afak.a;
            case 10:
                boolean z5 = false;
                bux buxVar10 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i10 = iIntValue10 & 3;
                int i11 = iIntValue10 & 1;
                if (i10 != 2) {
                    z5 = true;
                }
                if (buxVar10.I(z5, i11)) {
                    ksr.a(null, null, false, null, bxc.i(147694635, true, new msw(this.a, 9), buxVar10), buxVar10, 24576, 15);
                } else {
                    buxVar10.s();
                }
                return afak.a;
            case 11:
                bux buxVar11 = (bux) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (buxVar11.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    Object obj9 = this.a;
                    czz.am(kmi.a.b(obj9), bxc.i(1054578899, true, new msw(obj9, 10), buxVar11), buxVar11, 48);
                } else {
                    buxVar11.s();
                }
                return afak.a;
            case 12:
                boolean z6 = false;
                bux buxVar12 = (bux) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i12 = iIntValue12 & 3;
                int i13 = iIntValue12 & 1;
                if (i12 != 2) {
                    z6 = true;
                }
                if (buxVar12.I(z6, i13)) {
                    ksr.a(null, null, false, null, bxc.i(-2090573839, true, new msw(this.a, 13), buxVar12), buxVar12, 24576, 15);
                } else {
                    buxVar12.s();
                }
                return afak.a;
            case 13:
                bux buxVar13 = (bux) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (buxVar13.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    Object obj10 = this.a;
                    oqc oqcVar2 = (oqc) ((mvb) obj10).a.a();
                    opr oprVarA = opr.a.a();
                    Bundle arguments = ((Fragment) obj10).getArguments();
                    int i14 = arguments != null ? arguments.getInt("column_number", 0) : 0;
                    cfy cfyVarC = awd.c(cfy.e.a(new aix(cjn.i(0), ckq.a)), 1.0f);
                    int i15 = oqc.c;
                    mvk.d(oqcVar2, oprVarA, i14, cfyVarC, null, buxVar13, 3144);
                } else {
                    buxVar13.s();
                }
                return afak.a;
            case 14:
                bux buxVar14 = (bux) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (buxVar14.I((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    Object obj11 = this.a;
                    czz.am(kmi.a.b(obj11), bxc.i(1276854937, true, new msw(obj11, 12), buxVar14), buxVar14, 48);
                } else {
                    buxVar14.s();
                }
                return afak.a;
            case 15:
                bux buxVar15 = (bux) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i16 = iIntValue15 & 3;
                int i17 = iIntValue15 & 1;
                yph yphVar = mvk.a;
                if (buxVar15.I(i16 != 2, i17)) {
                    mvk.c((oqc) this.a, buxVar15, 8);
                } else {
                    buxVar15.s();
                }
                return afak.a;
            case 16:
                bux buxVar16 = (bux) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (buxVar16.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    this.a.invoke(buxVar16, 6);
                } else {
                    buxVar16.s();
                }
                return afak.a;
            case 17:
                bux buxVar17 = (bux) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (buxVar17.I((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    brp.b(String.valueOf(this.a.f((Context) buxVar17.f(daa.b))), null, 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, czz.av(buxVar17).l, buxVar17, 0, 24576, 114686);
                } else {
                    buxVar17.s();
                }
                return afak.a;
            case 18:
                return mjv.i(this.a, (bux) obj, ((Integer) obj2).intValue());
            case 19:
                return mjv.i(this.a, (bux) obj, ((Integer) obj2).intValue());
            default:
                String str2 = (String) obj;
                CharSequence charSequence = (CharSequence) obj2;
                charSequence.getClass();
                if (str2 == null) {
                    return charSequence;
                }
                if (afyh.v(charSequence)) {
                    return str2;
                }
                String string3 = ((ndp) this.a).c.getString(R.string.boardwalk_notification_secondary_text, charSequence, str2);
                string3.getClass();
                return string3;
        }
    }
}
