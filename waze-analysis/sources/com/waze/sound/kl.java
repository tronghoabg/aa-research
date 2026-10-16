package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class kl implements com.waze.hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40381c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f40382d;

    public /* synthetic */ kl(Object obj, String str, boolean z, int i2) {
        this.f40382d = i2;
        this.f40381c = obj;
        this.f40379a = str;
        this.f40380b = z;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f40382d;
        boolean z = this.f40380b;
        if (i2 != 0) {
            hs.onTtsDownloadComplete$lambda$0((hs) this.f40381c, this.f40379a, z);
            return null;
        }
        km.playActual$lambda$0((km) this.f40381c, this.f40379a, z);
        return null;
    }
}
