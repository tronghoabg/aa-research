package com.waze.install;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f24783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24784b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24785c;

    public /* synthetic */ k(m mVar, String str, int i2) {
        this.f24785c = i2;
        this.f24783a = mVar;
        this.f24784b = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24785c;
        String str = this.f24784b;
        m mVar = this.f24783a;
        if (i2 != 0) {
            m.setLangFromLocale$lambda$0(mVar, str);
            return null;
        }
        m.setCountry$lambda$0(mVar, str);
        return null;
    }
}
