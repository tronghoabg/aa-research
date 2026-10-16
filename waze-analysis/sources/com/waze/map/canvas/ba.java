package com.waze.map.canvas;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ba implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f28577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28578b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28579c;

    public /* synthetic */ ba(bb bbVar, String str, int i2) {
        this.f28579c = i2;
        this.f28577a = bbVar;
        this.f28578b = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f28579c;
        String str = this.f28578b;
        bb bbVar = this.f28577a;
        if (i2 == 0) {
            return bb.startSwapping$lambda$0(bbVar, str);
        }
        bb.restoreToMainCanvas$lambda$0(bbVar, str);
        return null;
    }
}
