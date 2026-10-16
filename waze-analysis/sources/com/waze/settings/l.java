package com.waze.settings;

import android.view.View;
import com.waze.gas.GasNativeManager;
import com.waze.settings.tree.views.SettingsFreeText;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends android.support.v7.widget.fe {

    /* renamed from: a, reason: collision with root package name */
    private final SettingsFreeText f37440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(View view) {
        super(view);
        h.g.b.x.f(view, "itemView");
        SettingsFreeText settingsFreeText = (SettingsFreeText) view;
        this.f37440a = settingsFreeText;
        settingsFreeText.b(true);
        settingsFreeText.a(true);
    }

    public final void a(String str) throws IOException {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f37440a.d(h.n.o.c(str));
    }
}
