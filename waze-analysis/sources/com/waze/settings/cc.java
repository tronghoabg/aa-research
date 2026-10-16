package com.waze.settings;

import com.waze.settings.tree.views.WazeSettingsView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cc extends android.support.v7.widget.fe {

    /* renamed from: a, reason: collision with root package name */
    public final WazeSettingsView f36959a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(cd cdVar, WazeSettingsView wazeSettingsView) {
        super(wazeSettingsView);
        Objects.requireNonNull(cdVar);
        this.f36959a = wazeSettingsView;
    }
}
