package com.waze.navigate;

/* compiled from: WazeSource */
/* renamed from: com.waze.navigate.do, reason: invalid class name */
/* loaded from: classes6.dex */
public final /* synthetic */ class Cdo implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f31250a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31251b;

    public /* synthetic */ Cdo(h.g.a.l lVar, int i2) {
        this.f31251b = i2;
        this.f31250a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f31251b) {
            case 0:
                this.f31250a.invoke((String) obj);
                break;
            case 1:
                da.getRouteArea$lambda$1(this.f31250a, (byte[]) obj);
                break;
            case 2:
                this.f31250a.invoke((Integer) obj);
                break;
            case 3:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 4:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 5:
                ds.getNavigationLanes$lambda$1(this.f31250a, (byte[]) obj);
                break;
            case 6:
                this.f31250a.invoke((Integer) obj);
                break;
            case 7:
                ds.getNavigationItems$lambda$1(this.f31250a, (byte[]) obj);
                break;
            case 8:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 9:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 10:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 11:
                this.f31250a.invoke((h.ab) obj);
                break;
            case 12:
                this.f31250a.invoke((h.ab) obj);
                break;
            default:
                this.f31250a.invoke((h.ab) obj);
                break;
        }
    }
}
