package com.waze.search.a;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.R;
import com.waze.app_nav.w;
import com.waze.config.ConfigValues;
import com.waze.navigate.AddressItem;
import com.waze.search.e.n;
import com.waze.search.e.r;
import com.waze.search.stats.s;
import com.waze.search.v2.af;
import com.waze.w.y;
import com.waze.z.a.ad;
import com.waze.z.a.ae;
import com.waze.z.a.be;
import h.ab;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35441a;

    public /* synthetic */ a(int i2) {
        this.f35441a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35441a) {
            case 0:
                d dVar = d.f35473a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE;
                x.e(dVar2, "CONFIG_VALUE_PARKING_SYMBOL_STYLE");
                return new com.waze.search.a.c.b(new c(dVar2, 0));
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                d dVar3 = d.f35473a;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i2 = ar.f48106a;
                com.waze.ar arVar = (com.waze.ar) bVar.a(new m(com.waze.ar.class), null, null);
                com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_EV_HAS_EV_CAR;
                x.e(bVar2, "CONFIG_VALUE_EV_HAS_EV_CAR");
                c cVar = new c(bVar2, 1, (byte[]) null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SearchCategoryGroupsDataSource");
                x.e(eVarD, "create(...)");
                return new y(arVar, cVar, eVarD);
            case 2:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                d dVar4 = d.f35473a;
                x.f(bVar3, "$this$viewModel");
                x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                y yVar = (y) bVar3.a(new m(y.class), null, null);
                w wVar = (w) bVar3.a(new m(w.class), null, null);
                com.waze.search.a.c.a aVar = (com.waze.search.a.c.a) bVar3.a(new m(com.waze.search.a.c.a.class), null, null);
                s sVar = (s) bVar3.a(new m(s.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("CategoryGroupsListViewModel");
                x.e(eVarD2, "create(...)");
                return new com.waze.search.a.c.g(yVar, wVar, aVar, sVar, eVarD2);
            case 3:
                ((Integer) obj).intValue();
                com.waze.search.d.a.a.a aVar2 = (com.waze.search.d.a.a.a) obj2;
                x.f(aVar2, "it");
                return aVar2.d();
            case 4:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i4 = iIntValue & 3;
                int i5 = iIntValue & 1;
                int i6 = com.waze.search.e.b.f35617a;
                if (composer.shouldExecute(i4 != 2, i5)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1296106028, iIntValue, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-1296106028.<anonymous> (SearchDestinationCell.kt:453)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.saved_outline_24px), new com.waze.ui.ac.m(AddressItem.HOME), null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new com.waze.search.e.i(new com.waze.ui.ac.m("Set location once"), true), new com.waze.z.a.m(new com.waze.ui.ac.m("SERVER"), null, null, null, false, 30), null, null, null, 31224), false, null, null, null, null, composer, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i7 = iIntValue2 & 3;
                int i8 = iIntValue2 & 1;
                int i9 = com.waze.search.e.b.f35617a;
                if (composer2.shouldExecute(i7 != 2, i8)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1946758169, iIntValue2, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-1946758169.<anonymous> (SearchDestinationCell.kt:471)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.saved_outline_24px), new com.waze.ui.ac.m("Only me"), null, null, null, null, null, null, null, null, null, null, 32760), false, SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 75.0f, 1, null), null, null, null, composer2, 384, 58);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 6:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i10 = iIntValue3 & 3;
                int i11 = iIntValue3 & 1;
                int i12 = com.waze.search.e.b.f35617a;
                if (composer3.shouldExecute(i10 != 2, i11)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1411197861, iIntValue3, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-1411197861.<anonymous> (SearchDestinationCell.kt:491)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.planned_drive_outline_24px), new com.waze.ui.ac.m(AddressItem.HOME), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("Set location once"), true), null, null, null, null, 32248), false, null, null, null, null, composer3, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 7:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i13 = iIntValue4 & 3;
                int i14 = iIntValue4 & 1;
                int i15 = com.waze.search.e.b.f35617a;
                if (composer4.shouldExecute(i13 != 2, i14)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34928555, iIntValue4, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-34928555.<anonymous> (SearchDestinationCell.kt:508)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(com.waze.design_components.b.d.af.b()), new com.waze.ui.ac.m("General Parking"), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("a very long address in category search can overflow to a second line, but will cutoff on the third")), null, new n(new com.waze.ui.ac.f(com.waze.design_components.b.d.aD.b()), new com.waze.ui.ac.m("3 min")), null, null, 30200), true, null, null, null, null, composer4, 48, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 8:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i16 = iIntValue5 & 3;
                int i17 = iIntValue5 & 1;
                int i18 = com.waze.search.e.b.f35617a;
                if (composer5.shouldExecute(i16 != 2, i17)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-343894897, iIntValue5, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-343894897.<anonymous> (SearchDestinationCell.kt:535)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.ic_calendar_outline), new com.waze.ui.ac.m("مركز هلا"), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("السلام عليكم, 85")), new com.waze.z.a.m(new com.waze.ui.ac.m("طويييييييييييييييييللللللللللللل"), new com.waze.ui.ac.f(R.drawable.help_outline_24px), null, null, false, 28), new com.waze.search.e.m(new com.waze.ui.ac.m("٨٨س ٤٤د")), null, null, 29176), false, null, null, null, null, composer5, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 9:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i19 = iIntValue6 & 3;
                int i20 = iIntValue6 & 1;
                int i21 = com.waze.search.e.b.f35617a;
                if (composer6.shouldExecute(i19 != 2, i20)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(386074742, iIntValue6, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$386074742.<anonymous> (SearchDestinationCell.kt:185)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.search.e.s(new com.waze.ui.ac.f(com.waze.design_components.b.d.aj.c(com.waze.design_components.b.e.f23312a))), new com.waze.ui.ac.m("Cool place"), null, null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("168 Pines st")), null, null, true, null, 56824), false, null, null, null, null, composer6, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 10:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i22 = iIntValue7 & 3;
                int i23 = iIntValue7 & 1;
                int i24 = com.waze.search.e.b.f35617a;
                if (composer7.shouldExecute(i22 != 2, i23)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1764172005, iIntValue7, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-1764172005.<anonymous> (SearchDestinationCell.kt:220)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.h("eee", Integer.valueOf(R.drawable.ic_outline_location_24px)), new com.waze.ui.ac.m("Image resource"), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("168 Pines st")), null, null, r.f35649c, null, 28152), false, null, null, null, null, composer7, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i25 = iIntValue8 & 3;
                int i26 = iIntValue8 & 1;
                int i27 = com.waze.search.e.b.f35617a;
                if (composer8.shouldExecute(i25 != 2, i26)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1800327589, iIntValue8, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-1800327589.<anonymous> (SearchDestinationCell.kt:276)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(com.waze.design_components.b.d.ab.b()), new com.waze.ui.ac.m(AddressItem.HOME), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("168 Pines st")), new com.waze.z.a.m(new com.waze.ui.ac.m("Light traffic"), new com.waze.ui.ac.f(R.drawable.help_outline_24px), com.waze.z.a.n.f46152c, null, false, 24), new com.waze.search.e.m(new com.waze.ui.ac.m("1h 44m")), null, null, 29176), false, null, null, null, null, composer8, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return ab.f48028a;
            case 12:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i28 = iIntValue9 & 3;
                int i29 = iIntValue9 & 1;
                int i30 = com.waze.search.e.b.f35617a;
                if (composer9.shouldExecute(i28 != 2, i29)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-177230526, iIntValue9, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-177230526.<anonymous> (SearchDestinationCell.kt:300)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(com.waze.design_components.b.d.af.b()), new com.waze.ui.ac.m("General Parking"), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("Mountain View, California")), null, new n(new com.waze.ui.ac.f(com.waze.design_components.b.d.aD.b()), new com.waze.ui.ac.m("3 min")), null, null, 30200), false, null, null, null, null, composer9, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return ab.f48028a;
            case 13:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i31 = iIntValue10 & 3;
                int i32 = iIntValue10 & 1;
                int i33 = com.waze.search.e.b.f35617a;
                if (composer10.shouldExecute(i31 != 2, i32)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(269076645, iIntValue10, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$269076645.<anonymous> (SearchDestinationCell.kt:323)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.ic_calendar_outline), new com.waze.ui.ac.m("If title is too long, it will overflow to second line as mentioned in the spec so have fun as it should"), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("168 Pines st, but its very long text so here we goo again")), new com.waze.z.a.m(new com.waze.ui.ac.m("If secondary subtitle is toooooooooooooooooo loooooooooong, it will overflow so long overflow to second line as mentioned in the spec so have fun as it should"), new com.waze.ui.ac.f(R.drawable.help_outline_24px), null, null, false, 28), new com.waze.search.e.m(new com.waze.ui.ac.m("88h 44m")), null, null, 29176), false, null, null, null, null, composer10, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return ab.f48028a;
            case 14:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i34 = iIntValue11 & 3;
                int i35 = iIntValue11 & 1;
                int i36 = com.waze.search.e.b.f35617a;
                if (composer11.shouldExecute(i34 != 2, i35)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-685931471, iIntValue11, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$-685931471.<anonymous> (SearchDestinationCell.kt:436)");
                    }
                    com.waze.search.e.g.c(new com.waze.search.e.p(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new com.waze.ui.ac.f(R.drawable.saved_outline_24px), new com.waze.ui.ac.m(AddressItem.HOME), null, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m("Set location once"), true), null, null, null, null, 32248), false, null, null, null, null, composer11, 0, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return ab.f48028a;
            case 15:
                x.f((com.waze.search.e.p) obj, "<unused var>");
                x.f((ae) obj2, "<unused var>");
                return ab.f48028a;
            case 16:
                x.f((com.waze.search.e.p) obj, "<unused var>");
                x.f((ad) obj2, "<unused var>");
                return ab.f48028a;
            case 17:
                x.f((com.waze.search.e.p) obj, "<unused var>");
                x.f((ae) obj2, "<unused var>");
                return ab.f48028a;
            case 18:
                x.f((com.waze.search.e.p) obj, "<unused var>");
                x.f((ad) obj2, "<unused var>");
                return ab.f48028a;
            case 19:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i37 = iIntValue12 & 3;
                int i38 = iIntValue12 & 1;
                int i39 = com.waze.search.f.a.f35660a;
                if (composer12.shouldExecute(i37 != 2, i38)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(15427825, iIntValue12, -1, "com.waze.search.presentation.ComposableSingletons$SearchEmptyStateScreenKt.lambda$15427825.<anonymous> (SearchEmptyStateScreen.kt:342)");
                    }
                    be.n(new com.waze.ui.ac.f(R.drawable.i_am_a_passenger_warning_sign), new com.waze.ui.ac.j(R.string.DONT_TYPE_WHILE_DRIVING_WARNING_TITLE), composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return ab.f48028a;
            default:
                int i40 = af.f36144a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.search.v2.p();
        }
    }
}
