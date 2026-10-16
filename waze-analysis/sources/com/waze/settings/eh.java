package com.waze.settings;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class eh implements com.waze.settings.tree.c.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f37177a;

    public /* synthetic */ eh(int i2) {
        this.f37177a = i2;
    }

    @Override // com.waze.settings.tree.c.c
    public final boolean a() {
        return this.f37177a != 0 ? gr.w() && !ConfigValues.CONFIG_VALUE_PERSONALIZATION_SETTINGS_ENABLED.b().booleanValue() : gr.w();
    }
}
