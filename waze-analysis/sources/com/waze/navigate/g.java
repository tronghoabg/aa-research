package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31401a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31402b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f31402b = i2;
        this.f31401a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f31402b) {
            case 0:
                ((h) this.f31401a).y();
                return h.ab.f48028a;
            case 1:
                ((h) this.f31401a).y();
                return h.ab.f48028a;
            case 2:
                return k.c((k) this.f31401a, (AddressItem[]) obj);
            case 3:
                Integer num = (Integer) obj;
                if (num != null) {
                    com.waze.menus.h.f29724a = num.intValue();
                }
                k kVar = (k) this.f31401a;
                kVar.f31470b.getTopTenFavorites(new g(kVar, 2));
                return h.ab.f48028a;
            case 4:
                return DriveToNativeManager.lambda$navigateAnalytics$0((AddressItem) this.f31401a, (AddressItem[]) obj);
            case 5:
                return NavigationStartPointNativeManager.setNavigationStartPoint$lambda$0(this.f31401a, (h.ab) obj);
            case 6:
                return NavigationStartPointNativeManager.setNavigationStartPoint$lambda$1(this.f31401a, (h.ab) obj);
            case 7:
                return NavigationStartPointNativeManager.clearNavigationStartPoint$lambda$0(this.f31401a, (h.ab) obj);
            default:
                return ParkedHereNativeManager.removeParking$lambda$0((ParkedHereNativeManager) this.f31401a, (h.ab) obj);
        }
    }
}
