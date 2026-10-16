package com.waze.settings.tree.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.sdk.au;
import com.waze.settings.de;
import com.waze.settings.ds;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final ds f37483a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.c.a f37484b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f37485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ds dsVar, com.waze.main_screen.c.a aVar, h.g.a.l lVar) {
        super("music_controls", "MUSIC_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.MUSIC_SETTINGS)), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.setting_icon_music_control)), (List) null, 48);
        h.g.b.x.f(dsVar, "viewModel");
        h.g.b.x.f(lVar, "showButtonPackToast");
        this.f37483a = dsVar;
        this.f37484b = aVar;
        this.f37485c = lVar;
    }

    public static final boolean E(Context context) {
        h.g.b.x.f(context, "context");
        return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store")).resolveActivity(context.getPackageManager()) != null;
    }

    private final com.waze.settings.tree.f F() {
        return new com.waze.settings.tree.d.s("enable_audio_apps", R.string.AUDIO_SDK_SETTINGS_ENABLE_AUDIO_APPS, "ENABLE_AUDIO_APPS", new l(this));
    }

    public static final /* synthetic */ void f(n nVar, com.waze.settings.c cVar) {
        if (h.g.b.x.n(cVar, com.waze.settings.a.f36697a)) {
            nVar.B(h.a.i.i(nVar.F(), new com.waze.settings.tree.d.l("audio_sdk_disabled_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.AUDIO_SDK_SETTINGS_SDK_DISABLED_DESCRIPTION)))));
            return;
        }
        if (!(cVar instanceof com.waze.settings.b)) {
            throw new h.i();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.F());
        arrayList.add(new com.waze.settings.tree.d.s("notify_now_playing", R.string.AUDIO_SDK_SETTINGS_NOTIFY_NOW_PLAYING, "ENABLE_ALERT_WHILE_MUSIC_PLAYING", new u(nVar, 1)));
        arrayList.add(new com.waze.settings.tree.d.l("notify_now_playing_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.AUDIO_SDK_SETTINGS_NOTIFY_NOW_PLAYING_DESCRIPTION))));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (au auVar : ((com.waze.settings.b) cVar).a()) {
            if (auVar.f()) {
                arrayList2.add(new i(auVar, "audio_app_".concat(String.valueOf(auVar.f35258a)), com.waze.ui.ad.b.d(auVar.f35259b), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.audio_generic_music_icon)), new com.waze.car_lib.o.j(auVar, 4)));
            } else {
                arrayList3.add(new k(auVar, "audio_app_".concat(String.valueOf(auVar.f35258a)), com.waze.ui.ad.b.d(auVar.f35259b), com.waze.nightmode.e.s(Integer.valueOf(R.drawable.audio_generic_music_icon)), new com.waze.car_lib.o.j(auVar, 5)));
            }
        }
        ArrayList arrayList4 = arrayList2;
        if (h.a.i.aw(arrayList4)) {
            arrayList.add(new com.waze.settings.tree.d.m("installed_apps", com.waze.ui.ad.b.c(Integer.valueOf(R.string.AUDIO_SDK_SETTINGS_CONNECTED_APPS)), h.a.i.ao(arrayList4)));
        }
        ArrayList arrayList5 = arrayList3;
        if (h.a.i.aw(arrayList5)) {
            arrayList.add(new com.waze.settings.tree.d.m("other_apps", com.waze.ui.ad.b.c(Integer.valueOf(true != h.a.i.aw(arrayList4) ? R.string.AUDIO_SDK_SETTINGS_ALL_APPS : R.string.AUDIO_SDK_SETTINGS_DISCONNECTED_APPS)), h.a.i.ao(arrayList5)));
        }
        nVar.B(arrayList);
    }

    public final ds d() {
        return this.f37483a;
    }

    @Override // com.waze.settings.tree.g
    public final void h(de deVar) {
        h.g.b.x.f(deVar, "page");
        super.h(deVar);
        ai.m(ai.K(ai.y(new r(this.f37483a.A(), 1)), new s(this, (h.c.e) null, 1)), LifecycleOwnerKt.getLifecycleScope(deVar.h()));
    }
}
