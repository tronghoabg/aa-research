package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class s implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f33138a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33139b;

    public /* synthetic */ s(h.g.a.l lVar, int i2) {
        this.f33139b = i2;
        this.f33138a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f33139b) {
            case 0:
                this.f33138a.invoke((Boolean) obj);
                break;
            case 1:
                this.f33138a.invoke((String) obj);
                break;
            case 2:
                this.f33138a.invoke((Boolean) obj);
                break;
            case 3:
                ab.fetchFavorites$lambda$1(this.f33138a, (byte[]) obj);
                break;
            case 4:
                this.f33138a.invoke((h.ab) obj);
                break;
            case 5:
                this.f33138a.invoke((h.ab) obj);
                break;
            case 6:
                ab.storeRecentPlaceInRecents$lambda$1(this.f33138a, (byte[]) obj);
                break;
            case 7:
                ab.storeFavoritePlace$lambda$1(this.f33138a, (byte[]) obj);
                break;
            case 8:
                this.f33138a.invoke((Boolean) obj);
                break;
            case 9:
                ab.storeFavoritePlaceInRecents$lambda$1(this.f33138a, (byte[]) obj);
                break;
            case 10:
                this.f33138a.invoke((h.ab) obj);
                break;
            case 11:
                ab.fetchFutureEvents$lambda$1(this.f33138a, (byte[]) obj);
                break;
            case 12:
                this.f33138a.invoke((h.ab) obj);
                break;
            default:
                ab.fetchRecents$lambda$1(this.f33138a, (byte[]) obj);
                break;
        }
    }
}
