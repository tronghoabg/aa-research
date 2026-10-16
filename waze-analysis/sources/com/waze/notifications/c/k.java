package com.waze.notifications.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.c.e.w;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Address;
import com.waze.jni.protos.places.Place;
import com.waze.navigate.AddressItem;
import com.waze.navigate.gn;
import com.waze.reports.ed;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.ah;
import com.waze.z.a.ar;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import com.waze.z.a.c.q;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.n.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k {
    static final ab a(Modifier modifier, long j2, h.g.a.a aVar, int i2, Composer composer) {
        p(modifier, j2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab b(Modifier modifier, String str, String str2, Drawable drawable, Integer num, h.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        q(modifier, str, str2, drawable, num, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void c(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        x.f(aVar, "onOpenSettings");
        x.f(aVar2, "onCancel");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1079563551);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1079563551, i3, -1, "com.waze.permission.CalendarPermissionDeniedDialog (CalendarPermissionSettingsDialog.kt:16)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, i3 & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(aVar2, composerStartRestartGroup, (i3 >> 3) & 14);
            String strB = com.waze.ui.r.a.c.c.b(R.string.DENIED_PERMISSION_CALENDAR_DIALOG_TITLE, composerStartRestartGroup, 0);
            int i5 = 7;
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DENIED_PERMISSION_CALENDAR_DIALOG_YES, composerStartRestartGroup, 0), n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DENIED_PERMISSION_CALENDAR_DIALOG_NO, composerStartRestartGroup, 0), ar.d(n.e(null, null, null, 7), com.waze.design_components.button.g.f23359b), false, null, 12));
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changed(stateRememberUpdatedState2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(stateRememberUpdatedState, stateRememberUpdatedState2, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            q.d(strB, com.waze.ui.r.a.c.c.b(R.string.DENIED_PERMISSION_CALENDAR_DIALOG_TEXT, composerStartRestartGroup, 0), aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar2, null, composerStartRestartGroup, (i3 << 9) & 57344, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(aVar, aVar2, i2, 14));
        }
    }

    public static final Position.IntPosition d(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "<this>");
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        builderNewBuilder.setLatitude(cVar.c());
        builderNewBuilder.setLongitude(cVar.d());
        Position.IntPosition intPositionBuild = builderNewBuilder.build();
        x.e(intPositionBuild, "build(...)");
        return intPositionBuild;
    }

    public static final Place e(com.waze.places.f fVar) {
        x.f(fVar, "<this>");
        Place.Builder builderNewBuilder = Place.newBuilder();
        builderNewBuilder.setName(fVar.g());
        com.waze.places.a aVarA = fVar.a();
        if (aVarA != null) {
            x.f(aVarA, "<this>");
            Address.Builder builderNewBuilder2 = Address.newBuilder();
            builderNewBuilder2.setCity(aVarA.a());
            builderNewBuilder2.setCountry(aVarA.b());
            builderNewBuilder2.setHouseNumber(aVarA.c());
            builderNewBuilder2.setZip(aVarA.f());
            builderNewBuilder2.setState(aVarA.d());
            builderNewBuilder2.setStreet(aVarA.e());
            Address addressBuild = builderNewBuilder2.build();
            x.e(addressBuild, "build(...)");
            builderNewBuilder.setAddress(addressBuild);
        }
        builderNewBuilder.setPosition(d(fVar.b()));
        builderNewBuilder.setRoutingContext(fVar.h());
        builderNewBuilder.setVenueId(fVar.i());
        String strC = fVar.c();
        if (strC == null) {
            strC = "";
        }
        builderNewBuilder.setVenueContext(strC);
        String strE = fVar.e();
        builderNewBuilder.setInternalId(strE != null ? strE : "");
        Place placeBuild = builderNewBuilder.build();
        x.e(placeBuild, "build(...)");
        return placeBuild;
    }

    public static final AddressItem f(com.waze.places.f fVar) {
        x.f(fVar, "<this>");
        int iD = fVar.b().d();
        int iC = fVar.b().c();
        String strM = m(fVar);
        com.waze.places.a aVarA = fVar.a();
        String strB = aVarA != null ? aVarA.b() : null;
        com.waze.places.a aVarA2 = fVar.a();
        String strA = aVarA2 != null ? aVarA2.a() : null;
        com.waze.places.a aVarA3 = fVar.a();
        String strE = aVarA3 != null ? aVarA3.e() : null;
        com.waze.places.a aVarA4 = fVar.a();
        AddressItem addressItem = new AddressItem(iD, iC, strM, strB, strA, strE, aVarA4 != null ? aVarA4.c() : null, fVar.i(), fVar.h());
        ed venueData = addressItem.getVenueData();
        if (venueData != null) {
            venueData.W(fVar.g());
        }
        addressItem.setMeetingId(fVar.c());
        addressItem.setIcon(fVar.d());
        return addressItem;
    }

    public static final com.waze.places.a g(Address address) {
        x.f(address, "<this>");
        String houseNumber = address.getHouseNumber();
        x.e(houseNumber, "getHouseNumber(...)");
        String street = address.getStreet();
        x.e(street, "getStreet(...)");
        String city = address.getCity();
        x.e(city, "getCity(...)");
        String country = address.getCountry();
        x.e(country, "getCountry(...)");
        String zip = address.getZip();
        x.e(zip, "getZip(...)");
        String state = address.getState();
        x.e(state, "getState(...)");
        return new com.waze.places.a(houseNumber, street, city, state, country, zip);
    }

    public static final com.waze.places.f h(Place place, String str) {
        x.f(place, "<this>");
        String venueId = place.getVenueId();
        x.e(venueId, "getVenueId(...)");
        String name = place.getName();
        x.e(name, "getName(...)");
        Position.IntPosition position = place.getPosition();
        x.e(position, "getPosition(...)");
        com.waze.shared_infra.h.c cVarI = i(position);
        Address address = place.getAddress();
        x.e(address, "getAddress(...)");
        com.waze.places.a aVarG = g(address);
        String routingContext = place.getRoutingContext();
        x.e(routingContext, "getRoutingContext(...)");
        return new com.waze.places.f(venueId, str, name, cVarI, aVarG, routingContext, place.getVenueContext());
    }

    public static final com.waze.shared_infra.h.c i(Position.IntPosition intPosition) {
        x.f(intPosition, "<this>");
        return new com.waze.shared_infra.h.c(intPosition.getLatitude(), intPosition.getLongitude());
    }

    public static final com.waze.places.f k(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "<this>");
        return new com.waze.places.f("", null, "", cVar, null, "", null);
    }

    public static final com.waze.shared_infra.h.c l(Location location) {
        x.f(location, "<this>");
        return new com.waze.shared_infra.h.c(location.getLatitude(), location.getLongitude());
    }

    public static final String m(com.waze.places.f fVar) {
        x.f(fVar, "<this>");
        String strF = fVar.f();
        return (strF == null || o.G(strF)) ? fVar.g() : fVar.f();
    }

    public static final void o(final com.waze.notifications.b.a aVar, Modifier modifier, com.waze.reports_v2.presentation.k kVar, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        com.waze.reports_v2.presentation.k kVar2;
        final com.waze.reports_v2.presentation.k kVar3;
        Modifier modifier3;
        x.f(aVar, "notificationStateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-624403966);
        int i5 = 2;
        final int i6 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i7 = i3 | 48;
        if ((i2 & 384) == 0) {
            i7 = i3 | 176;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            int i8 = i7 & (-897);
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = Modifier.Companion;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(708214170, 0, -1, "com.waze.notifications.ui.rememberNotificationDraggableState (Notification.kt:95)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.reports_v2.presentation.k(new AnchoredDraggableState(a.f32572a, (DraggableAnchors<a>) AnchoredDraggableKt.DraggableAnchors(new ah(density.mo2127toPx0680j_4(96.0f), i5))));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                com.waze.reports_v2.presentation.k kVar4 = (com.waze.reports_v2.presentation.k) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                kVar3 = kVar4;
                modifier3 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                kVar3 = kVar;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-624403966, i8, -1, "com.waze.notifications.ui.Notification (Notification.kt:120)");
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final af afVar = (af) objRememberedValue2;
            State stateCollectAsState = SnapshotStateKt.collectAsState(aVar.a(), null, composerStartRestartGroup, 0, 1);
            int i9 = i7 & 14;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i9 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (p) new f(aVar, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(aVar, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i9);
            a aVarD = kVar3.d();
            a aVarE = kVar3.e();
            boolean zChanged = composerStartRestartGroup.changed(kVar3);
            boolean z = i9 == 4;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (p) new g(kVar3, aVar, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(aVarD, aVarE, (p) objRememberedValue4, composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(kVar3);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new h.g.a.a() { // from class: com.waze.notifications.c.d
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i10 = i6;
                        com.waze.notifications.b.a aVar2 = aVar;
                        if (i10 != 0) {
                            aj.z(afVar, null, null, new i(kVar3, aVar2, null, 1, null), 3);
                            return ab.f48028a;
                        }
                        aj.z(afVar, null, null, new i(kVar3, aVar2, null, 0), 3);
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue5, composerStartRestartGroup, 0, 1);
            final com.waze.notifications.b.c cVar = ((com.waze.notifications.c) stateCollectAsState.getValue()).f32570g != 0 ? com.waze.notifications.b.c.f32548c : com.waze.notifications.b.c.f32549d;
            Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged2 = composerStartRestartGroup.changed(kVar3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.car_lib.login.b(kVar3, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.absoluteOffset(companion2, (l) objRememberedValue6), kVar3.c(), Orientation.Vertical, false, null, null, null, 60, null);
            String str = ((com.waze.notifications.c) stateCollectAsState.getValue()).f32564a;
            if (str == null) {
                str = "";
            }
            String str2 = ((com.waze.notifications.c) stateCollectAsState.getValue()).f32565b;
            String str3 = str2 != null ? str2 : "";
            Drawable drawable = ((com.waze.notifications.c) stateCollectAsState.getValue()).f32566c;
            int i10 = ((com.waze.notifications.c) stateCollectAsState.getValue()).f32570g;
            Integer numValueOf = i10 != 0 ? Integer.valueOf(i10) : null;
            h.o.c cVar2 = h.o.a.f48264a;
            h.o.a aVarZ = h.o.a.z(h.o.c.i(((com.waze.notifications.c) stateCollectAsState.getValue()).f32567d, h.o.d.f48272c));
            boolean zChanged3 = composerStartRestartGroup.changed(cVar.ordinal()) | composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(kVar3) | z;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new h.g.a.a() { // from class: com.waze.notifications.c.c
                    @Override // h.g.a.a
                    public final Object invoke() {
                        aj.z(afVar, null, null, new h(kVar3, aVar, cVar, null), 3);
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(kVar3);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance2 | z) || objRememberedValue8 == Composer.Companion.getEmpty()) {
                final int i11 = 0;
                objRememberedValue8 = new h.g.a.a() { // from class: com.waze.notifications.c.d
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i102 = i11;
                        com.waze.notifications.b.a aVar22 = aVar;
                        if (i102 != 0) {
                            aj.z(afVar, null, null, new i(kVar3, aVar22, null, 1, null), 3);
                            return ab.f48028a;
                        }
                        aj.z(afVar, null, null, new i(kVar3, aVar22, null, 0), 3);
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            q(modifierAnchoredDraggable$default, str, str3, drawable, numValueOf, aVarZ, aVar2, (h.g.a.a) objRememberedValue8, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            kVar2 = kVar3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            kVar2 = kVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(aVar, modifier2, kVar2, i2, 11));
        }
    }

    private static final void p(final Modifier modifier, final long j2, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        h.g.a.a aVar2;
        Animatable animatable;
        float f2;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(169089313);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            aVar2 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        } else {
            aVar2 = aVar;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(169089313, i3, -1, "com.waze.notifications.ui.NotificationProgressBar (Notification.kt:324)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable2 = (Animatable) objRememberedValue;
            h.o.a aVarZ = h.o.a.z(j2);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(animatable2);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            j jVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance || z) || jVarRememberedValue == Composer.Companion.getEmpty()) {
                animatable = animatable2;
                f2 = 0.0f;
                h.g.a.a aVar3 = aVar2;
                i4 = 0;
                jVarRememberedValue = new j(animatable, j2, aVar3, null);
                composerStartRestartGroup.updateRememberedValue(jVarRememberedValue);
            } else {
                animatable = animatable2;
                f2 = 0.0f;
                i4 = 0;
            }
            EffectsKt.LaunchedEffect(aVarZ, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) jVarRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14);
            ProgressIndicatorKt.m4156LinearProgressIndicator_5eSRE(((Number) animatable.getValue()).floatValue(), SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(modifier, 8.0f), f2, 1, null), com.waze.bz.a.d(composerStartRestartGroup, i4).E(), 0L, 0, composerStartRestartGroup, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.notifications.c.b
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return k.a(modifier, j2, aVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void q(Modifier modifier, String str, String str2, Drawable drawable, Integer num, h.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        int i4;
        Alignment.Vertical vertical;
        BoxScopeInstance boxScopeInstance;
        int i5;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830769288);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(drawable) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(num) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830769288, i3, -1, "com.waze.notifications.ui.Notification (Notification.kt:193)");
            }
            ImageBitmap imageBitmapAsImageBitmap = null;
            if (drawable != null) {
                i4 = i3;
                vertical = null;
                Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
                imageBitmapAsImageBitmap = bitmap$default != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap$default) : null;
            } else {
                i4 = i3;
                vertical = null;
            }
            int i7 = i4 & 3670016;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i7 == 1048576 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new gn(aVar2, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(be.J(modifier, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, i4 & 14, 15), 96.0f), 0.0f, 1, vertical), com.waze.bz.a.d(composerStartRestartGroup, 0).d(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1972backgroundbw27NRU$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i8 = i4 >> 12;
            composerStartRestartGroup.startReplaceGroup(-1018086204);
            p(boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getTopCenter()), aVar.w(), aVar3, composerStartRestartGroup, (i8 & 112) | ((i4 >> 15) & DisplayStrings.DS_TAP_TO_VERIFY));
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getCenter()), vertical, false, 3, vertical), 8.0f, 0.0f, 8.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (imageBitmapAsImageBitmap == null) {
                composerStartRestartGroup.startReplaceGroup(806480996);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(806480997);
                ImageKt.m2038Image5hnEew(imageBitmapAsImageBitmap, null, PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(Modifier.Companion, 64.0f), 64.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composerStartRestartGroup, 25008, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(980890745);
                Composer composer2 = composerStartRestartGroup;
                boxScopeInstance = boxScopeInstance2;
                TextKt.m4275Text4IGK_g(str, (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).g(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).i(), composer2, (i4 >> 3) & 14, 0, 65530);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                boxScopeInstance = boxScopeInstance2;
                composerStartRestartGroup.startReplaceGroup(981040010);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (str2.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(981092090);
                Composer composer3 = composerStartRestartGroup;
                TextKt.m4275Text4IGK_g(str2, (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).g(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).a(), composer3, (i4 >> 6) & 14, 0, 65530);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(981240394);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (num != null) {
                composerStartRestartGroup.startReplaceGroup(807194679);
                i5 = 0;
                IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, i8 & 14), (String) null, PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(Modifier.Companion, 32.0f), 32.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14, null), com.waze.bz.a.d(composerStartRestartGroup, 0).g(), composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = 0;
                composerStartRestartGroup.startReplaceGroup(807426528);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            DividerKt.m4060DivideroMI9zvI(BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(PaddingKt.m2755padding3ABfNKs(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 4.0f), 32.0f), 4.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(2.0f)), com.waze.bz.a.d(composerStartRestartGroup, i5).g(), null, 2, null), 0L, 0.0f, 0.0f, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(modifier, str, str2, drawable, num, aVar, aVar2, aVar3, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset r(com.waze.reports_v2.presentation.k kVar, Density density) {
        x.f(density, "$this$absoluteOffset");
        return IntOffset.m11287boximpl(h.h.a.b(kVar.c().getOffset()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
