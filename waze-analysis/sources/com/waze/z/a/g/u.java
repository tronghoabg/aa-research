package com.waze.z.a.g;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.waze.R;
import com.waze.authentication.at;
import com.waze.car_lib.r.cq;
import com.waze.main_screen.p.bf;
import com.waze.sharedrive.g.ag;
import com.waze.sharedrive.g.ah;
import com.waze.sharedui.views.ap;
import com.waze.sharedui.web.aq;
import com.waze.sound.bp;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import h.g.b.x;
import kotlinx.coroutines.e.al;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46102c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f46103d;

    public /* synthetic */ u(bf bfVar, h.g.a.a aVar, BoxWithConstraintsScope boxWithConstraintsScope, int i2) {
        this.f46103d = i2;
        this.f46100a = bfVar;
        this.f46102c = aVar;
        this.f46101b = boxWithConstraintsScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.compose.foundation.layout.BoxWithConstraintsScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v92, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [h.g.a.a] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r1v26, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [androidx.compose.foundation.layout.BoxWithConstraintsScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.z.a.g.aa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v88, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlinx.coroutines.g.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v82, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnnotatedString annotatedStringM;
        switch (this.f46103d) {
            case 0:
                return z.c(this.f46100a, (o) this.f46101b, this.f46102c, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                RowScope rowScope = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h.g.b.x.f(rowScope, "$this$DestinationCardFrame");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true != composer.changed(rowScope) ? 2 : 4;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1879758107, iIntValue, -1, "com.waze.design_components_compose.components.DestinationCard.<anonymous> (DestinationCard.kt:37)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(((com.waze.design_components.b.d) this.f46101b).c(com.waze.design_components.b.e.f23314c), composer, 0), (String) null, rowScope.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), Alignment.Companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 120);
                    SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
                    Modifier modifierAlign = rowScope.align(Modifier.Companion, Alignment.Companion.getCenterVertically());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Object obj4 = this.f46102c;
                    Object obj5 = this.f46100a;
                    Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m4275Text4IGK_g((String) obj4, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.bD, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, obj5 != null ? 1 : 2, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).h(), composer, 48, 48, 55292);
                    if (obj5 != null) {
                        composer.startReplaceGroup(1075641460);
                        TextKt.m4275Text4IGK_g((String) obj5, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.bE, null), com.waze.bz.a.d(composer, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).m(), composer, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55288);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1075944423);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 2:
                com.waze.app_nav.hub.b.e eVar = (com.waze.app_nav.hub.b.e) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                h.g.b.x.f(eVar, "$this$ComposablePopUp");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? composer2.changed(eVar) : composer2.changedInstance(eVar)) ? 2 : 4;
                }
                if (composer2.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1748872756, iIntValue2, -1, "com.waze.dialog.createRoutingPopup.<anonymous>.<anonymous> (RoutingPopupDialog.kt:51)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1926268296, true, new com.waze.ab.c((com.waze.ui.t.b) this.f46101b, eVar, (h.g.a.l) this.f46100a, (h.g.a.l) this.f46102c, 2), composer2, 54), composer2, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 3:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1012843880, iIntValue3, -1, "com.waze.main_screen.google_assistant_button.presentation.GoogleAssistantButton.<anonymous> (GoogleAssistantButton.kt:45)");
                }
                final ?? r1 = this.f46102c;
                Object obj6 = this.f46101b;
                ?? r0 = this.f46100a;
                final String strB = com.waze.ui.r.a.c.c.b(R.string.LOCK_SCREEN_NAVIGATION_GA_CLICK_MESSAGE, composer3, 0);
                Modifier modifierClip = ClipKt.clip(SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(r0, com.waze.ui.r.a.d.c.dd, null), 44.0f), RoundedCornerShapeKt.getCircleShape());
                final boolean z = com.waze.bz.a.f(composer3) != com.waze.ui.r.a.e.b.a.f43359a;
                final Context context = (Context) obj6;
                ImageKt.Image(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(R.drawable.assistant_mic_ic), null, composer3, 0, 6), (String) null, ComposedModifierKt.composed$default(modifierClip, null, new h.g.a.q() { // from class: com.waze.main_screen.j.a.a
                    @Override // h.g.a.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        Modifier modifierJ;
                        Modifier modifier = (Modifier) obj7;
                        Composer composer4 = (Composer) obj8;
                        int iIntValue4 = ((Integer) obj9).intValue();
                        int i2 = iIntValue4 & 14;
                        x.f(modifier, "$this$composed");
                        composer4.startReplaceGroup(651330412);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(651330412, iIntValue4, -1, "com.waze.main_screen.google_assistant_button.presentation.conditionedClickable.<anonymous> (GoogleAssistantButton.kt:70)");
                        }
                        if (z) {
                            h.g.a.a aVar = r1;
                            composer4.startReplaceGroup(-877919749);
                            boolean z2 = com.waze.bz.a.f(composer4) != com.waze.ui.r.a.e.b.a.f43359a;
                            boolean zChanged = composer4.changed(aVar);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new com.waze.beacons.a.a(aVar, 20);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            modifierJ = be.J(modifier, z2, null, (h.g.a.a) objRememberedValue, composer4, i2, 13);
                            composer4.endReplaceGroup();
                        } else {
                            String str = strB;
                            Context context2 = context;
                            composer4.startReplaceGroup(-877820270);
                            boolean z3 = com.waze.bz.a.f(composer4) == com.waze.ui.r.a.e.b.a.f43359a;
                            boolean zChangedInstance = composer4.changedInstance(context2) | composer4.changed(str);
                            Object objRememberedValue2 = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = new com.waze.car_lib.e.d(context2, str, 6, null);
                                composer4.updateRememberedValue(objRememberedValue2);
                            }
                            modifierJ = be.J(modifier, z3, null, (h.g.a.a) objRememberedValue2, composer4, i2 | 48, 12);
                            composer4.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer4.endReplaceGroup();
                        return modifierJ;
                    }
                }, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 4:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001095702, iIntValue4, -1, "com.waze.main_screen.mid_drive.AnimatedCompactEtaBar.<anonymous> (MidDriveScreen.kt:1174)");
                }
                ?? r12 = this.f46101b;
                Object obj7 = this.f46102c;
                bf bfVar = (bf) this.f46100a;
                com.waze.main_screen.p.a.b.a.ab.q(bfVar.h(), true != bfVar.u().x() ? 0 : obj7, r12.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter()), 0, composer4, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 5:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1243433696, iIntValue5, -1, "com.waze.main_screen.mid_drive.PortraitMidDrive.<anonymous>.<anonymous> (MidDriveScreen.kt:517)");
                }
                Object obj8 = this.f46100a;
                Object obj9 = this.f46102c;
                Modifier modifierAlign2 = this.f46101b.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter());
                com.waze.main_screen.af.b.i iVarO = ((bf) obj9).o();
                boolean zChanged = composer5.changed(obj8);
                Object objRememberedValue = composer5.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new at(obj8, 9);
                    composer5.updateRememberedValue(objRememberedValue);
                }
                com.waze.main_screen.af.b.h.a(iVarO, (h.g.a.l) objRememberedValue, modifierAlign2, composer5, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 6:
                Modifier modifier = (Modifier) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                h.g.b.x.f(modifier, "modifier");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true != composer6.changed(modifier) ? 2 : 4;
                }
                if (composer6.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-846706577, iIntValue6, -1, "com.waze.menus.destination.DestinationOptionsBottomSheetContent.<anonymous> (DestinationOptionsBottomSheetContent.kt:42)");
                    }
                    Object obj10 = this.f46100a;
                    Object obj11 = this.f46102c;
                    Object obj12 = this.f46101b;
                    boolean zChanged2 = composer6.changed(obj11) | composer6.changedInstance(obj12) | composer6.changed(obj10);
                    Object objRememberedValue2 = composer6.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        com.waze.ads.c cVar = new com.waze.ads.c(obj11, obj12, obj10, 12, (int[]) null);
                        composer6.updateRememberedValue(cVar);
                        objRememberedValue2 = cVar;
                    }
                    h.g.a.l lVar = (h.g.a.l) objRememberedValue2;
                    h.g.b.x.f(obj12, "genericPlace");
                    h.g.b.x.f(lVar, "handleLink");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1748084080, 0, -1, "com.waze.menus.destination.bottomsheet.bottomSheetAnnotatedFooter (BottomSheetFooter.kt:36)");
                    }
                    com.waze.av.b.n nVar = (com.waze.av.b.n) obj12;
                    if (com.waze.ac.e.A(nVar) || com.waze.ac.e.x(nVar)) {
                        composer6.startReplaceGroup(694591101);
                        annotatedStringM = com.waze.ab.a.l.m(R.string.DESTINATION_MENU_DISCLAIMER_HOME_WORK, h.a.i.d(com.waze.menus.a.a.c.f29660e), lVar, composer6);
                        composer6.endReplaceGroup();
                    } else if (com.waze.ac.e.w(nVar)) {
                        composer6.startReplaceGroup(694839132);
                        annotatedStringM = com.waze.ab.a.l.m(R.string.DESTINATION_MENU_DISCLAIMER_PLANNED, h.a.i.d(com.waze.menus.a.a.c.f29657b), lVar, composer6);
                        composer6.endReplaceGroup();
                    } else if (com.waze.ac.e.v(nVar)) {
                        composer6.startReplaceGroup(695090015);
                        annotatedStringM = com.waze.ab.a.l.m(R.string.DESTINATION_MENU_DISCLAIMER_CALENDAR, h.a.i.d(com.waze.menus.a.a.c.f29656a), lVar, composer6);
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(576618932);
                        annotatedStringM = com.waze.ab.a.l.m(R.string.DESTINATION_MENU_DISCLAIMER_RECENT, h.a.i.d(com.waze.menus.a.a.c.f29660e), lVar, composer6);
                        composer6.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    com.waze.ab.a.l.l(modifier, annotatedStringM, composer6, iIntValue6 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 7:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                h.g.b.x.f((ColumnScope) obj, "$this$ShareDrivePreviewSheet");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1572917534, iIntValue7, -1, "com.waze.sharedrive.ui.CreateSharePreviewSheetContent.<anonymous>.<anonymous> (CreateSharePreviewSheet.kt:136)");
                    }
                    Object obj13 = this.f46100a;
                    Object obj14 = this.f46101b;
                    com.waze.sharedrive.g.k kVar = (com.waze.sharedrive.g.k) this.f46102c;
                    com.waze.sharedrive.g.bf.b(kVar.b(), ComposableLambdaKt.rememberComposableLambda(1297614295, true, new u(kVar, (Context) obj14, (ManagedActivityResultLauncher) obj13, 8), composer7, 54), composer7, 48, 0);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_DISCLAIMER, composer7, 0), com.waze.ui.r.a.d.d.a(PaddingKt.m2758paddingqDBjuR0(Modifier.Companion, 16.0f, 16.0f, 16.0f, 16.0f), com.waze.ui.r.a.d.c.dv, null), com.waze.bz.a.d(composer7, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer7).n(), composer7, 48, 0, 65528);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 8:
                return com.waze.sharedrive.g.bf.v((com.waze.sharedrive.g.k) this.f46102c, (Context) this.f46101b, (ManagedActivityResultLauncher) this.f46100a, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                h.g.b.x.f((ColumnScope) obj, "$this$ShareDrivePreviewSheet");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-329480781, iIntValue8, -1, "com.waze.sharedrive.ui.JoinSharePreviewSheetContent.<anonymous> (JoinSharePreviewSheet.kt:125)");
                    }
                    com.waze.sharedrive.g.t tVar = (com.waze.sharedrive.g.t) this.f46101b;
                    if (tVar.b().a().size() > 1) {
                        composer8.startReplaceGroup(-1561611487);
                        ag.c(tVar.b(), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dD, null), composer8, 48);
                        composer8.endReplaceGroup();
                    } else {
                        Object obj15 = this.f46100a;
                        if (obj15 != null) {
                            composer8.startReplaceGroup(-1561399354);
                            com.waze.sharedrive.g.bf.b((ah) obj15, null, composer8, 0, 2);
                            composer8.endReplaceGroup();
                        } else {
                            composer8.startReplaceGroup(-1561329201);
                            composer8.endReplaceGroup();
                        }
                    }
                    com.waze.z.a.a.h.j(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_LOCATION_SHARE_DISCLAIMER_TITLE, composer8, 0), tVar.d(), this.f46102c, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dC, null), false, com.waze.z.a.a.h.g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_LOCATION_SHARE_DISCLAIMER_DETAILS, composer8, 0)), null, composer8, 199680, 144);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 10:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                h.g.b.x.f(paddingValues, "contentPadding");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= true != composer9.changed(paddingValues) ? 2 : 4;
                }
                if (composer9.shouldExecute((iIntValue9 & 19) != 18, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1744671672, iIntValue9, -1, "com.waze.sharedui.web.WazeWebViewPage.<anonymous> (WazeWebViewPage.kt:71)");
                    }
                    ?? r3 = this.f46102c;
                    Object obj16 = this.f46101b;
                    aq aqVar = (aq) this.f46100a;
                    ap.e(aqVar.b(), PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), paddingValues), (com.waze.sharedui.web.m) obj16, aqVar.d(), aqVar.c(), r3, composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 11:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1450010632, iIntValue10, -1, "com.waze.sound.presentation.VoiceGuidanceSheetContentLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoiceGuidanceSheet.kt:149)");
                    }
                    com.waze.sound.e.h.b(this.f46100a, (bp) this.f46101b, this.f46102c, composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 12:
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                h.g.b.x.f(paddingValues2, "padding");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= true != composer11.changed(paddingValues2) ? 2 : 4;
                }
                if (composer11.shouldExecute((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1002136972, iIntValue11, -1, "com.waze.ui.copilot.CarsSettingsScreen.<anonymous> (CarsSettingsScreen.kt:125)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, paddingValues2);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer11, modifierPadding);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer11.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor2);
                    } else {
                        composer11.useNode();
                    }
                    ?? r6 = this.f46101b;
                    Object obj17 = this.f46100a;
                    ?? r02 = this.f46102c;
                    Updater.m7351setimpl(composer11, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer11, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer11, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer11, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer11, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    r02.invoke(composer11, 0);
                    com.waze.ui.g.m mVar = (com.waze.ui.g.m) obj17;
                    com.waze.ui.g.w.e(mVar.c(), mVar.b(), a.a.q(r6), composer11, 0);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 13:
                return com.waze.ui.x.d.a(this.f46101b, this.f46100a, this.f46102c, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Object obj18 = this.f46101b;
                if (obj18 != kotlinx.coroutines.a.m.t()) {
                    al.k(((kotlinx.coroutines.a.k) this.f46100a).f51293a, obj18, this.f46102c.e());
                }
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ u(com.waze.sharedrive.g.k kVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, int i2) {
        this.f46103d = i2;
        this.f46102c = kVar;
        this.f46101b = context;
        this.f46100a = managedActivityResultLauncher;
    }

    public /* synthetic */ u(h.g.a.p pVar, com.waze.ui.g.m mVar, State state, int i2) {
        this.f46103d = i2;
        this.f46102c = pVar;
        this.f46100a = mVar;
        this.f46101b = state;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i2) {
        this.f46103d = i2;
        this.f46100a = obj;
        this.f46101b = obj2;
        this.f46102c = obj3;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f46103d = i2;
        this.f46101b = obj;
        this.f46100a = obj2;
        this.f46102c = obj3;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i2, char[] cArr) {
        this.f46103d = i2;
        this.f46101b = obj;
        this.f46102c = obj2;
        this.f46100a = obj3;
    }
}
