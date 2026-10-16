package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cl implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f36972a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36973b;

    public /* synthetic */ cl(h.g.a.l lVar, int i2) {
        this.f36973b = i2;
        this.f36972a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f36973b) {
            case 0:
                this.f36972a.invoke((Integer) obj);
                break;
            case 1:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 2:
                this.f36972a.invoke((String) obj);
                break;
            case 3:
                cr.getSearchByVoiceData$lambda$1(this.f36972a, (byte[]) obj);
                break;
            case 4:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 5:
                cr.loadGasTypes$lambda$1(this.f36972a, (byte[]) obj);
                break;
            case 6:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 7:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 8:
                this.f36972a.invoke((Boolean) obj);
                break;
            case 9:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 10:
                this.f36972a.invoke((Boolean) obj);
                break;
            case 11:
                this.f36972a.invoke((h.ab) obj);
                break;
            case 12:
                this.f36972a.invoke((Integer) obj);
                break;
            case 13:
                this.f36972a.invoke((Boolean) obj);
                break;
            default:
                cr.getLanguages$lambda$1(this.f36972a, (byte[]) obj);
                break;
        }
    }
}
