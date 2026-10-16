package com.waze.main_screen.c.d;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.waze.R;
import com.waze.sharedrive.d.ar;
import com.waze.strings.DisplayStrings;
import com.waze.tide.s;
import com.waze.ui.af.ap;
import com.waze.ui.f.ad;
import com.waze.ui.f.al;
import com.waze.ui.m.dc;
import com.waze.ui.m.dj;
import com.waze.ui.m.dn;
import com.waze.ui.m.dp;
import com.waze.ui.m.dq;
import com.waze.ui.m.dr;
import com.waze.ui.m.ds;
import com.waze.ui.m.u;
import com.waze.ui.m.v;
import com.waze.ui.m.w;
import com.waze.ui.m.y;
import com.waze.ui.n.g;
import com.waze.z.a.a.h;
import com.waze.z.a.be;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import h.i;
import kotlinx.coroutines.h.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26172a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26173b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f26173b = i2;
        this.f26172a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strStringResource = null;
        switch (this.f26173b) {
            case 0:
                return e.c(this.f26172a, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return e.b(this.f26172a, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x.f((LazyItemScope) obj, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1901097409, iIntValue, -1, "com.waze.ui.location_preview.ImageGalleryLayoutPresent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationPreviewImageGallery.kt:104)");
                    }
                    dc.y(this.f26172a, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 3:
                y yVar = (y) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                x.f(yVar, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != composer2.changed(yVar) ? 2 : 4;
                }
                if (composer2.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-502494023, iIntValue2, -1, "com.waze.ui.location_preview.ImageGalleryLayout.<anonymous> (LocationPreviewImageGallery.kt:59)");
                    }
                    if (x.n(yVar, u.f43038a)) {
                        composer2.startReplaceGroup(-1860416383);
                        be.x(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 32.0f, 16.0f, 0.0f, 8, null), 0.0f, 1, null), 95.0f), composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (yVar instanceof w) {
                        ?? r0 = this.f26172a;
                        composer2.startReplaceGroup(-1860404701);
                        dc.B((w) yVar, r0, composer2, iIntValue2 & 14);
                        composer2.endReplaceGroup();
                    } else {
                        if (!x.n(yVar, v.f43039a)) {
                            composer2.startReplaceGroup(-1860418226);
                            composer2.endReplaceGroup();
                            throw new i();
                        }
                        composer2.startReplaceGroup(-1837885817);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 4:
                RowScope rowScope = (RowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                x.f(rowScope, "$this$WazeHeader");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true != composer3.changed(rowScope) ? 2 : 4;
                }
                if (composer3.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-431698166, iIntValue3, -1, "com.waze.ui.location_preview.LocationPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationPreview.kt:234)");
                    }
                    Object obj4 = this.f26172a;
                    int i2 = iIntValue3;
                    com.waze.design_components.b.d dVar = com.waze.design_components.b.d.n;
                    boolean zChanged = composer3.changed(obj4);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new ar(obj4, 10);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    be.i(rowScope, dVar, (h.g.a.a) objRememberedValue, null, null, 0L, composer3, (i2 & 14) | 48, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(508511685, iIntValue4, -1, "com.waze.ui.location_preview.SilkyVisibilityScreen.<anonymous> (LocationPreview.kt:384)");
                }
                this.f26172a.invoke(composer4, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return ab.f48028a;
            case 6:
                return dc.a((dn) this.f26172a, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i3 = dj.f42972a;
                x.f(obj, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1854064045, iIntValue5, -1, "com.waze.ui.location_preview.ParkingBookingLayout.<anonymous> (LocationPreviewParking.kt:60)");
                }
                if (x.n(obj, dp.f42996a)) {
                    composer5.startReplaceGroup(-655877446);
                    be.x(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 32.0f, 16.0f, 0.0f, 8, null), 0.0f, 1, null), 144.0f), composer5, 0);
                    composer5.endReplaceGroup();
                } else {
                    ?? r02 = this.f26172a;
                    if (x.n(obj, dr.f42998a)) {
                        composer5.startReplaceGroup(-655864834);
                        dj.a(r02, composer5, 0);
                        composer5.endReplaceGroup();
                    } else if (obj instanceof ds) {
                        composer5.startReplaceGroup(-655860964);
                        dj.e((ds) obj, r02, composer5, iIntValue5 & 14);
                        composer5.endReplaceGroup();
                    } else if (x.n(obj, dq.f42997a)) {
                        composer5.startReplaceGroup(1143254323);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(1143262197);
                        composer5.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return ab.f48028a;
            case 8:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                x.f(paddingValues, "it");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true != composer6.changed(paddingValues) ? 2 : 4;
                }
                if (composer6.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1896030934, iIntValue6, -1, "com.waze.ui.login_error.InitialScreen.<anonymous> (LoginError.kt:103)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m2759paddingqDBjuR0$default(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer6, 0).h(), null, 2, null), 0.0f, 0.0f, 0.0f, paddingValues.mo2704calculateBottomPaddingD9Ej5fM(), 7, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), composer6, 54);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer6.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor);
                    } else {
                        composer6.useNode();
                    }
                    Object obj5 = this.f26172a;
                    Updater.m7351setimpl(composer6, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer6, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer6, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer6, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer6, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    boolean z = ((Configuration) composer6.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1;
                    g gVar = (g) obj5;
                    ImageKt.Image(PainterResources_androidKt.painterResource(gVar.b(), composer6, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 18.0f, 0.0f, z ? 18.0f : 5.0f, 4, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, Painter.$stable | 48, 120);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(gVar.d(), composer6, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 0.0f, 60.0f, true == z ? 32.0f : 5.0f, 2, null), com.waze.bz.a.d(composer6, 0).o(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11014getLefte0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer6, 199680, 0, 130512);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(gVar.c(), composer6, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 0.0f, 60.0f, 32.0f, 2, null), com.waze.bz.a.d(composer6, 0).o(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11014getLefte0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer6, 199728, 0, 130512);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 9:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                x.f((ColumnScope) obj, "$this$Header");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(919782095, iIntValue7, -1, "com.waze.ui.qr_login.ErrorScreen.<anonymous> (QrLogin.kt:222)");
                    }
                    ?? r03 = this.f26172a;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.launch_icon_64px, composer7, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 35.0f, 0.0f, 18.0f, 5, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer7, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_ERROR_SUBTITLE, composer7, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 35.0f, 0.0f, 35.0f, 32.0f, 2, null), com.waze.bz.a.d(composer7, 0).o(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer7, 199728, 0, 130512);
                    be.o(r03, SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 12.0f, 2, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_CLOSE_BUTTON, composer7, 0), null, null, null, false, false, composer7, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 10:
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                x.f(paddingValues2, "it");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= true != composer8.changed(paddingValues2) ? 2 : 4;
                }
                if (composer8.shouldExecute((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-703367175, iIntValue8, -1, "com.waze.ui.qr_login.Header.<anonymous> (QrLogin.kt:71)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m1972backgroundbw27NRU$default(PaddingKt.padding(Modifier.Companion, paddingValues2), com.waze.bz.a.d(composer8, 0).h(), null, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer8, 48);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer8.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor2);
                    } else {
                        composer8.useNode();
                    }
                    ?? r04 = this.f26172a;
                    Updater.m7351setimpl(composer8, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer8, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer8, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer8, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer8, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    r04.invoke(ColumnScopeInstance.INSTANCE, composer8, 6);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                ad adVar = (ad) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                x.f(adVar, "it");
                composer9.startReplaceGroup(94931770);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(94931770, iIntValue9, -1, "com.waze.ui.reports.bardinio.bardinioConversationUiProviders.<anonymous> (BardinioComposable.kt:136)");
                }
                Object obj6 = this.f26172a;
                if (obj6 instanceof com.waze.ui.w.b.w) {
                }
                composer9.startReplaceGroup(2023957733);
                composer9.endReplaceGroup();
                composer9.startReplaceGroup(2024003551);
                composer9.endReplaceGroup();
                composer9.startReplaceGroup(1035125833);
                al alVarC = al.c(s.e(adVar, composer9, iIntValue9 & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_IDLE_GENERIC_BUTTON, composer9, 0));
                composer9.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer9.endReplaceGroup();
                return alVarC;
            case 12:
                return com.waze.ui.x.d.c(this.f26172a, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1629988978, iIntValue10, -1, "com.waze.ui.shared_drive.AnimatedRecenterButton.<anonymous>.<anonymous> (LiveShareScreen.kt:277)");
                }
                be.w(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dI, null), this.f26172a, composer10, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return ab.f48028a;
            case 14:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i4 = ap.f41852a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(403588429, iIntValue11, -1, "com.waze.ui.voices.customVoiceSection.<anonymous> (VoiceSettingsScreen.kt:408)");
                    }
                    ?? r05 = this.f26172a;
                    Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43324k, null);
                    String strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_CUSTOM_VOICE_TITLE, composer11, 0);
                    com.waze.z.a.a.a aVar = new com.waze.z.a.a.a(new com.waze.ui.ac.d(R.drawable.t3_voice_microphone), (com.waze.z.a.s) null, 6);
                    int i5 = com.waze.ui.af.b.f41869a;
                    h.h(strB, false, true, modifierA, 0L, r05, aVar, com.waze.ui.af.b.b(), com.waze.ui.af.b.d(), null, composer11, 113249712, 0, DisplayStrings.DS_MAP_POPUP_USER_MESSAGE_BUTTON);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return ab.f48028a;
            case 15:
                return ap.f((com.waze.ui.af.q) this.f26172a, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                RowScope rowScope2 = (RowScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i6 = ap.f41852a;
                x.f(rowScope2, "$this$WazeHeader");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true != composer12.changed(rowScope2) ? 2 : 4;
                }
                if (composer12.shouldExecute((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1899005421, iIntValue12, -1, "com.waze.ui.voices.VoiceSettingsScreen.<anonymous>.<anonymous> (VoiceSettingsScreen.kt:234)");
                    }
                    Object obj7 = this.f26172a;
                    com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.n;
                    boolean zChanged2 = composer12.changed(obj7);
                    Object objRememberedValue2 = composer12.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.speech.l(obj7, 3);
                        composer12.updateRememberedValue(objRememberedValue2);
                    }
                    be.i(rowScope2, dVar2, (h.g.a.a) objRememberedValue2, null, null, 0L, composer12, (iIntValue12 & 14) | 48, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return ab.f48028a;
            case 17:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-156549800, iIntValue13, -1, "com.waze.uid.fragments.CheckPinCodeScreen.<anonymous>.<anonymous> (CheckPinCodeScreen.kt:116)");
                }
                Object obj8 = this.f26172a;
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 8.0f, 0.0f, 0.0f, 13, null);
                if (obj8 == null) {
                    composer13.startReplaceGroup(559503009);
                } else {
                    composer13.startReplaceGroup(559503010);
                    ((Number) obj8).intValue();
                    strStringResource = StringResources_androidKt.stringResource(((Integer) obj8).intValue(), composer13, 0);
                }
                composer13.endReplaceGroup();
                long jA = com.waze.bz.a.d(composer13, 0).a();
                TextStyle textStyleA = com.waze.bz.a.h(composer13).a();
                if (strStringResource == null) {
                    strStringResource = "";
                }
                TextKt.m4275Text4IGK_g(strStringResource, modifierM2759paddingqDBjuR0$default, jA, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, textStyleA, composer13, 48, 0, 65528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return ab.f48028a;
            case 18:
                this.f26172a.invoke((Throwable) obj);
                return ab.f48028a;
            case 19:
                return new com.waze.z.a.g.u(obj3, this.f26172a, (kotlinx.coroutines.g.l) obj, 14, (byte[]) null);
            default:
                ((m) this.f26172a).d();
                return ab.f48028a;
        }
    }
}
