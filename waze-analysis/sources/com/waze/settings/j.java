package com.waze.settings;

import android.view.View;
import com.waze.settings.tree.views.SettingsTitleText;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends android.support.v7.widget.fe {

    /* renamed from: a, reason: collision with root package name */
    private final SettingsTitleText f37438a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        h.g.b.x.f(view, "itemView");
        this.f37438a = (SettingsTitleText) view;
    }

    public final void a(String str) {
        this.f37438a.a(str);
    }
}
