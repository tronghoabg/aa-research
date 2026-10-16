package com.waze.planned_drive;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import com.waze.NativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.settings.SettingsNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ae implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33185a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33186b;

    public /* synthetic */ ae(Object obj, int i2) {
        this.f33186b = i2;
        this.f33185a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v114, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r4v79, types: [java.lang.Object, org.a.d.a.a] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f33186b) {
            case 0:
                return ay.p((ay) this.f33185a);
            case 1:
                return ay.o((ay) this.f33185a);
            case 2:
                ?? r4 = this.f33185a;
                if (r4 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL = ((org.a.d.a.b) r4).l();
                    int i2 = h.g.b.ar.f48106a;
                    return bVarL.a(new h.g.b.m(com.waze.places.g.class), null, null);
                }
                org.a.d.k.b bVarC = r4.getKoin().a().c();
                int i3 = h.g.b.ar.f48106a;
                return bVarC.a(new h.g.b.m(com.waze.places.g.class), null, null);
            case 3:
                ?? r42 = this.f33185a;
                if (r42 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL2 = ((org.a.d.a.b) r42).l();
                    int i4 = h.g.b.ar.f48106a;
                    return bVarL2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                }
                org.a.d.k.b bVarC2 = r42.getKoin().a().c();
                int i5 = h.g.b.ar.f48106a;
                return bVarC2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
            case 4:
                ?? r43 = this.f33185a;
                if (r43 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL3 = ((org.a.d.a.b) r43).l();
                    int i6 = h.g.b.ar.f48106a;
                    return bVarL3.a(new h.g.b.m(SettingsNativeManager.class), null, null);
                }
                org.a.d.k.b bVarC3 = r43.getKoin().a().c();
                int i7 = h.g.b.ar.f48106a;
                return bVarC3.a(new h.g.b.m(SettingsNativeManager.class), null, null);
            case 5:
                ?? r44 = this.f33185a;
                if (r44 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL4 = ((org.a.d.a.b) r44).l();
                    int i8 = h.g.b.ar.f48106a;
                    return bVarL4.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                }
                org.a.d.k.b bVarC4 = r44.getKoin().a().c();
                int i9 = h.g.b.ar.f48106a;
                return bVarC4.a(new h.g.b.m(DriveToNativeManager.class), null, null);
            case 6:
                ?? r45 = this.f33185a;
                if (r45 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL5 = ((org.a.d.a.b) r45).l();
                    int i10 = h.g.b.ar.f48106a;
                    return bVarL5.a(new h.g.b.m(PlannedDriveNativeManager.class), null, null);
                }
                org.a.d.k.b bVarC5 = r45.getKoin().a().c();
                int i11 = h.g.b.ar.f48106a;
                return bVarC5.a(new h.g.b.m(PlannedDriveNativeManager.class), null, null);
            case 7:
                ?? r46 = this.f33185a;
                if (r46 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL6 = ((org.a.d.a.b) r46).l();
                    int i12 = h.g.b.ar.f48106a;
                    return bVarL6.a(new h.g.b.m(NativeManager.class), null, null);
                }
                org.a.d.k.b bVarC6 = r46.getKoin().a().c();
                int i13 = h.g.b.ar.f48106a;
                return bVarC6.a(new h.g.b.m(NativeManager.class), null, null);
            case 8:
                ?? r47 = this.f33185a;
                if (r47 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL7 = ((org.a.d.a.b) r47).l();
                    int i14 = h.g.b.ar.f48106a;
                    return bVarL7.a(new h.g.b.m(com.waze.navigate.j.class), null, null);
                }
                org.a.d.k.b bVarC7 = r47.getKoin().a().c();
                int i15 = h.g.b.ar.f48106a;
                return bVarC7.a(new h.g.b.m(com.waze.navigate.j.class), null, null);
            case 9:
                ?? r48 = this.f33185a;
                if (r48 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL8 = ((org.a.d.a.b) r48).l();
                    int i16 = h.g.b.ar.f48106a;
                    return bVarL8.a(new h.g.b.m(bk.class), null, null);
                }
                org.a.d.k.b bVarC8 = r48.getKoin().a().c();
                int i17 = h.g.b.ar.f48106a;
                return bVarC8.a(new h.g.b.m(bk.class), null, null);
            case 10:
                ?? r49 = this.f33185a;
                if (r49 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL9 = ((org.a.d.a.b) r49).l();
                    int i18 = h.g.b.ar.f48106a;
                    return bVarL9.a(new h.g.b.m(com.waze.navigate.b.g.class), null, null);
                }
                org.a.d.k.b bVarC9 = r49.getKoin().a().c();
                int i19 = h.g.b.ar.f48106a;
                return bVarC9.a(new h.g.b.m(com.waze.navigate.b.g.class), null, null);
            case 11:
                ?? r410 = this.f33185a;
                if (r410 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL10 = ((org.a.d.a.b) r410).l();
                    int i20 = h.g.b.ar.f48106a;
                    return bVarL10.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
                }
                org.a.d.k.b bVarC10 = r410.getKoin().a().c();
                int i21 = h.g.b.ar.f48106a;
                return bVarC10.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
            case 12:
                return Integer.valueOf(((Number) ((State) this.f33185a).getValue()).intValue());
            case 13:
                com.waze.search.k kVar = com.waze.search.k.f35975a;
                return com.waze.ch.a.a.f.g(this.f33185a);
            case 14:
                LazyListState lazyListState = (LazyListState) this.f33185a;
                return Boolean.valueOf(lazyListState.getFirstVisibleItemIndex() >= 0 && lazyListState.getFirstVisibleItemScrollOffset() > 0);
            case 15:
                ((com.waze.search.h.bz) this.f33185a).b();
                return h.ab.f48028a;
            case 16:
                ((com.waze.search.h.bz) this.f33185a).b();
                return h.ab.f48028a;
            case 17:
                ((com.waze.search.h.bz) this.f33185a).b();
                return h.ab.f48028a;
            case 18:
                ((com.waze.search.h.bx) this.f33185a).z();
                return h.ab.f48028a;
            case 19:
                ((com.waze.search.h.bx) this.f33185a).B();
                return h.ab.f48028a;
            default:
                return a.a.k(this.f33185a);
        }
    }

    public ae(org.a.d.a.a aVar, int i2) {
        this.f33186b = i2;
        this.f33185a = aVar;
    }
}
