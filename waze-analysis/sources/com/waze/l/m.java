package com.waze.l;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Row;
import androidx.car.app.model.signin.QRCodeSignInMethod;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.car_lib.p.at;
import com.waze.car_lib.p.au;
import com.waze.car_lib.p.av;
import com.waze.car_lib.p.aw;
import com.waze.car_lib.p.ax;
import com.waze.car_lib.p.ay;
import com.waze.car_lib.p.az;
import com.waze.car_lib.p.ba;
import com.waze.car_lib.p.bb;
import com.waze.car_lib.p.be;
import com.waze.car_lib.p.bf;
import com.waze.car_lib.p.bg;
import com.waze.car_lib.p.bh;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.screens.cp;
import com.waze.o.ad;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class m {
    public /* synthetic */ m(byte[] bArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.waze.l.v r22, boolean r23, h.g.a.a r24, h.g.a.l r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.l.m.d(com.waze.l.v, boolean, h.g.a.a, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static ab e(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        n(z, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab f(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        o(z, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab g(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        p(z, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static String k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("//");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ SignInTemplate l(bh bhVar) {
        cp cpVar = new cp(14);
        cp cpVar2 = new cp(15);
        x.f(bhVar, "state");
        x.f(cpVar, "onFirstActionClicked");
        x.f(cpVar2, "onSecondActionClicked");
        SignInTemplate.Builder builder = new SignInTemplate.Builder(new QRCodeSignInMethod(bhVar.a()));
        builder.setTitle(bhVar.c());
        String strB = bhVar.b();
        if (strB != null) {
            builder.setInstructions(strB);
        }
        builder.setHeaderAction(Action.BACK);
        SignInTemplate signInTemplateBuild = builder.build();
        x.e(signInTemplateBuild, "build(...)");
        return signInTemplateBuild;
    }

    public static MapTemplate m(CarContext carContext, com.waze.shared_infra.o.a aVar, com.waze.car_lib.m.c cVar, h.g.a.l lVar) {
        String strD;
        String strC;
        String strC2;
        int iD;
        String strC3;
        SpannableString spannableStringR;
        SpannableStringBuilder spannableStringBuilder;
        String strD2;
        String strC4;
        x.f(carContext, "carContext");
        x.f(aVar, "stringProvider");
        x.f(cVar, "state");
        x.f(lVar, "callback");
        if (x.n(cVar, bg.f20622a)) {
            return dh.y();
        }
        if (!(cVar instanceof bf)) {
            throw new h.i();
        }
        bf bfVar = (bf) cVar;
        CarContext carContext2 = carContext;
        int color = ContextCompat.getColor(carContext2, R.color.always_white);
        MapTemplate.Builder builder = new MapTemplate.Builder();
        Header.Builder builder2 = new Header.Builder();
        builder2.setTitle(" ");
        Action.Builder builder3 = new Action.Builder();
        CarIcon.Builder builder4 = new CarIcon.Builder(IconCompat.createWithResource(carContext2, com.waze.design_components.b.d.n.b()));
        builder4.setTint(CarColor.createCustom(color, color));
        builder3.setIcon(builder4.build());
        builder3.setOnClickListener(new com.waze.car_lib.screens.b.a(lVar, 10));
        builder2.addEndHeaderAction(builder3.build());
        builder.setHeader(builder2.build());
        Pane.Builder builder5 = new Pane.Builder();
        Row.Builder builder6 = new Row.Builder();
        be beVarA = bfVar.a();
        boolean zH = bfVar.h();
        bb bbVarB = beVarA.b();
        bb bbVar = bb.f20609a;
        int iOrdinal = bbVarB.ordinal();
        if (iOrdinal == 0) {
            ad adVarB = beVarA.c().b();
            if (x.n(adVarB, av.f20599a)) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_NEW_DRIVE_HOME, new Object[0]);
            } else if (x.n(adVarB, ax.f20601a)) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_NEW_DRIVE_WORK, new Object[0]);
            } else if (adVarB instanceof aw) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_NEW_DRIVE_DESTINATION_PS, ((aw) beVarA.c().b()).a());
            } else {
                if (adVarB != null) {
                    throw new h.i();
                }
                at atVarA = beVarA.c().a();
                String strA = beVarA.e() instanceof ay ? ((ay) beVarA.e()).a() : (atVarA.a() == null || atVarA.a().a().length() <= 0) ? (atVarA.b() == null || (((strD = atVarA.d()) == null || strD.length() == 0) && ((strC = atVarA.c()) == null || strC.length() == 0))) ? atVarA.b() : r(atVarA, zH) : atVarA.a().a();
                strC2 = strA == null ? aVar.c(R.string.STATE_STATE_PREDICTION_CARD_TITLE_NEW_DRIVE_UNKNOWN_DESTINATION, new Object[0]) : aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_NEW_DRIVE_DESTINATION_PS, strA);
            }
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            ad adVarB2 = beVarA.c().b();
            if (x.n(adVarB2, av.f20599a)) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_RESUME_DRIVE_HOME, new Object[0]);
            } else if (x.n(adVarB2, ax.f20601a)) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_RESUME_DRIVE_WORK, new Object[0]);
            } else if (adVarB2 instanceof aw) {
                strC2 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_RESUME_DRIVE_DESTINATION_PS, ((aw) beVarA.c().b()).a());
            } else {
                if (adVarB2 != null) {
                    throw new h.i();
                }
                at atVarA2 = beVarA.c().a();
                String strA2 = beVarA.e() instanceof ay ? ((ay) beVarA.e()).a() : (atVarA2.a() == null || atVarA2.a().a().length() <= 0) ? (atVarA2.b() == null || (((strD2 = atVarA2.d()) == null || strD2.length() == 0) && ((strC4 = atVarA2.c()) == null || strC4.length() == 0))) ? atVarA2.b() : r(atVarA2, zH) : atVarA2.a().a();
                strC2 = strA2 == null ? aVar.c(R.string.STATE_STATE_PREDICTION_CARD_TITLE_RESUME_DRIVE_UNKNOWN_DESTINATION, new Object[0]) : aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_TITLE_RESUME_DRIVE_DESTINATION_PS, strA2);
            }
        }
        builder6.setTitle(strC2);
        if (bfVar.a().a() != null) {
            au auVarA = bfVar.a().a();
            long jL = h.o.a.l(auVarA.a());
            long jN = h.o.a.n(h.o.a.q(auVarA.a(), h.o.c.j(h.o.a.l(auVarA.a()), h.o.d.f48275f)));
            String strC5 = jL > 0 ? jN == 0 ? aVar.c(R.string.START_STATE_PREDICTION_DURATION_PD_HOURS, Long.valueOf(jL)) : aVar.c(R.string.START_STATE_PREDICTION_DURATION_PD_HOURS_PD_MINS, Long.valueOf(jL), Long.valueOf(jN)) : aVar.c(R.string.START_STATE_PREDICTION_DURATION_PD_MINS, Long.valueOf(jN));
            if (auVarA.c()) {
                String strC6 = aVar.c(R.string.START_STATE_PREDICTION_CARD_INCAR_HEAVY_TRAFFIC, new Object[0]);
                CarColor carColor = CarColor.RED;
                x.e(carColor, "RED");
                spannableStringR = dh.r(strC6, carColor);
            } else {
                spannableStringR = null;
            }
            SpannableString spannableString = spannableStringR;
            if (spannableString == null || spannableString.length() == 0) {
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strC5).append((CharSequence) " • ").append((CharSequence) auVarA.b());
                x.c(spannableStringBuilderAppend);
                spannableStringBuilder = spannableStringBuilderAppend;
            } else {
                SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder().append((CharSequence) strC5).append((CharSequence) " • ").append((CharSequence) auVarA.b()).append((CharSequence) " • ").append((CharSequence) spannableString);
                x.c(spannableStringBuilderAppend2);
                spannableStringBuilder = spannableStringBuilderAppend2;
            }
            builder6.addText(spannableStringBuilder);
        }
        be beVarA2 = bfVar.a();
        com.waze.car_lib.m.c cVarE = beVarA2.e();
        if ((cVarE instanceof ay) || x.n(cVarE, ba.f20608a)) {
            iD = com.waze.design_components.b.d.ab.d();
        } else {
            if (!x.n(cVarE, az.f20603a)) {
                throw new h.i();
            }
            ad adVarB3 = beVarA2.c().b();
            if (x.n(adVarB3, av.f20599a)) {
                iD = com.waze.design_components.b.d.f23304e.d();
            } else if (x.n(adVarB3, ax.f20601a)) {
                iD = com.waze.design_components.b.d.f23309j.d();
            } else if (adVarB3 instanceof aw) {
                iD = com.waze.design_components.b.d.M.d();
            } else {
                if (adVarB3 != null) {
                    throw new h.i();
                }
                iD = com.waze.design_components.b.d.I.d();
            }
        }
        builder6.setImage(new CarIcon.Builder(IconCompat.createWithResource(carContext2, iD)).build());
        builder5.addRow(builder6.build());
        Action.Builder builder7 = new Action.Builder();
        int iOrdinal2 = bfVar.a().b().ordinal();
        if (iOrdinal2 == 0) {
            strC3 = aVar.c(R.string.START_STATE_PREDICTION_CARD_AA_BUTTON_TEXT_NEW_DRIVE, new Object[0]);
        } else {
            if (iOrdinal2 != 1) {
                throw new h.i();
            }
            strC3 = aVar.c(R.string.START_STATE_PREDICTION_CARD_AA_BUTTON_TEXT_RESUME_DRIVE, new Object[0]);
        }
        builder7.setTitle(strC3);
        builder7.setFlags(1);
        if (bfVar.g() != null) {
            builder7.setFlags(4);
        }
        builder7.setBackgroundColor(CarColor.BLUE);
        builder7.setOnClickListener(new com.waze.car_lib.screens.b.a(lVar, 11));
        builder5.addAction(builder7.build());
        builder.setPane(builder5.build());
        MapTemplate mapTemplateBuild = builder.build();
        x.e(mapTemplateBuild, "build(...)");
        return mapTemplateBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-105526075);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            aVar4 = aVar3;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        } else {
            aVar4 = aVar3;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-105526075, i3, -1, "com.waze.bluetooth.BluetoothPermissionsRationaleDialog (BluetoothPermissionDialog.kt:233)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.BEACONS_BLUETOOTH_PERMISSIONS_RATIONALE_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(R.drawable.tier_3_bluetooth_tunnel), ContentScale.Companion.getFillWidth(), null, 28);
            com.waze.z.a.c.a aVar5 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_BLUETOOTH_PERMISSIONS_RATIONALE_BUTTON1, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_BLUETOOTH_PERMISSIONS_RATIONALE_BUTTON2, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            com.waze.z.a.c.f fVar = new com.waze.z.a.c.f(com.waze.ui.r.a.c.c.b(R.string.BEACONS_BLUETOOTH_PERMISSIONS_RATIONALE_OPTOUT, composerStartRestartGroup, 0), z, lVar);
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new g(aVar, aVar2, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i6 = s.f25119a;
            com.waze.z.a.c.q.e(strB, aVar5, (com.waze.z.a.c.g) objRememberedValue, aVar4, null, hVar, fVar, s.c(), composerStartRestartGroup, ((i3 >> 3) & 7168) | 12582912, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(z, lVar, aVar, aVar2, aVar3, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1044165126);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            aVar4 = aVar3;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        } else {
            aVar4 = aVar3;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1044165126, i3, -1, "com.waze.bluetooth.GoToSettingsDialog (BluetoothPermissionDialog.kt:339)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(R.drawable.tier_3_bluetooth_tunnel), ContentScale.Companion.getFillWidth(), null, 28);
            com.waze.z.a.c.a aVar5 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON1, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            com.waze.z.a.c.f fVar = new com.waze.z.a.c.f(com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_OPTOUT, composerStartRestartGroup, 0), z, lVar);
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new g(aVar, aVar2, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.a aVar6 = aVar5;
            int i5 = s.f25119a;
            com.waze.z.a.c.q.e(strB, aVar6, (com.waze.z.a.c.g) objRememberedValue, aVar4, null, hVar, fVar, s.a(), composerStartRestartGroup, ((i3 >> 3) & 7168) | 12582912, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(z, lVar, aVar, aVar2, aVar3, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-59876603);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            aVar4 = aVar3;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        } else {
            aVar4 = aVar3;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59876603, i3, -1, "com.waze.bluetooth.TurnOnBluetoothRationaleDialog (BluetoothPermissionDialog.kt:286)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(R.drawable.tier_3_bluetooth_tunnel), ContentScale.Companion.getFillWidth(), null, 28);
            com.waze.z.a.c.a aVar5 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_BUTTON1, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_BUTTON2, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            boolean z2 = false;
            com.waze.z.a.c.f fVar = new com.waze.z.a.c.f(com.waze.ui.r.a.c.c.b(R.string.BEACONS_TURN_ON_BLUETOOTH_OPTOUT, composerStartRestartGroup, 0), z, lVar);
            boolean z3 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z3 | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new g(aVar, aVar2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = s.f25119a;
            com.waze.z.a.c.q.e(strB, aVar5, (com.waze.z.a.c.g) objRememberedValue, aVar4, null, hVar, fVar, s.b(), composerStartRestartGroup, ((i3 >> 3) & 7168) | 12582912, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(z, lVar, aVar, aVar2, aVar3, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ab q(h.g.a.a aVar, h.g.a.a aVar2, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar) {
        x.f(cVar, "actions");
        x.f(dVar, "cta");
        if (x.n(dVar, ((com.waze.z.a.c.a) cVar).a())) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
        return ab.f48028a;
    }

    private static String r(at atVar, boolean z) {
        String strC;
        String strD = atVar.d();
        if (strD == null || strD.length() == 0 || (strC = atVar.c()) == null || strC.length() == 0) {
            return atVar.d();
        }
        if (z) {
            return atVar.d() + " " + atVar.c();
        }
        return atVar.c() + " " + atVar.d();
    }

    private m() {
        throw null;
    }
}
