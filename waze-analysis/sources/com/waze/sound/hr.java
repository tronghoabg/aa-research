package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class hr implements com.waze.hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40177a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40178b;

    public /* synthetic */ hr(Object obj, int i2) {
        this.f40178b = i2;
        this.f40177a = obj;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f40178b;
        if (i2 == 0) {
            return hs.getSelectedTtsVoice$lambda$0((hs) this.f40177a);
        }
        if (i2 == 1) {
            hs.onCacheReady$lambda$0((hs) this.f40177a);
            return null;
        }
        if (i2 == 2) {
            kg.clearInstructionSegmentToPlayAndThen$lambda$0((kg) this.f40177a);
            return null;
        }
        Object obj = this.f40177a;
        if (i2 != 3) {
            kg.unsetTts$lambda$0((kg) obj);
            return null;
        }
        kg.initNativeLayer$lambda$0((kg) obj);
        return null;
    }
}
