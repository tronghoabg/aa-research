package com.waze.car_lib.screens;

import com.waze.R;
import com.waze.car_lib.p.dg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements br {

    /* renamed from: a, reason: collision with root package name */
    private final dg f22020a;

    public l(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f22020a = new dg(aVar.c(R.string.AAOS_REQUEST_RECORD_AUDIO_PERMISSION_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_REQUEST_RECORD_AUDIO_PERMISSION_SCREEN_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.icon_activation_dialoge_in_car), true, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_RECORD_AUDIO_PERMISSION_SCREEN_CONTINUE_BUTTON, new Object[0]), true), null, 32);
    }

    @Override // com.waze.car_lib.screens.br
    public final dg a() {
        return this.f22020a;
    }
}
