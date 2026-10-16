package com.waze.settings;

import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gu {
    public static void a() {
        String strB = ConfigValues.CONFIG_VALUE_PRIVACY_DRIVE_HISTORY_URL.b();
        com.waze.web.d dVar = com.waze.web.d.f45485a;
        com.waze.web.c cVar = new com.waze.web.c();
        cVar.c(com.waze.shared_infra.o.b.a().c(R.string.DRIVE_HISTORY_TITLE, new Object[0]));
        cVar.b(strB);
        com.waze.ch.a.a.f.c(com.waze.alerters.a.k.e(), cVar);
    }

    public static final com.waze.settings.tree.c.b b(ConfigManager configManager, com.waze.config.b bVar, boolean z) {
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(bVar, "booleanConfig");
        return new ek(configManager, bVar, z);
    }

    public static final ej c(com.waze.sound.bp bpVar) {
        h.g.b.x.f(bpVar, "mode");
        com.waze.sound.bp bpVar2 = com.waze.sound.bp.f39554a;
        int iOrdinal = bpVar.ordinal();
        if (iOrdinal == 0) {
            return new ej(R.string.VOICE_GUIDANCE_SOUND_ON_TITLE, R.drawable.t3_guidance_mode_sound_on, R.drawable.t1_sound_on_outline_32px, R.drawable.t1_sound_on_outline_32px);
        }
        if (iOrdinal == 1) {
            return new ej(R.string.VOICE_GUIDANCE_BRIEF_TITLE, R.drawable.t3_guidance_mode_brief, R.drawable.t1_sound_brief_outline_32px, R.drawable.t1_sound_brief_outline_32px);
        }
        if (iOrdinal == 2) {
            return new ej(R.string.VOICE_GUIDANCE_SMART_TITLE, R.drawable.t2_guidance_mode_smart_mute, R.drawable.t1_sound_smart_mute_outline_32px, R.drawable.t1_sound_smart_mute_outline_32px);
        }
        if (iOrdinal == 3) {
            return new ej(R.string.VOICE_GUIDANCE_ALERTS_TITLE, R.drawable.t3_guidance_mode_alerts, R.drawable.t1_sound_alerts_outline_32px, R.drawable.t1_sound_alerts_outline_32px);
        }
        if (iOrdinal == 4) {
            return new ej(R.string.VOICE_GUIDANCE_SOUND_OFF_TITLE, R.drawable.t3_guidance_mode_sound_off, R.drawable.t1_sound_off_outline_32px, R.drawable.t1_sound_off_outline_32px);
        }
        throw new h.i();
    }

    public static final com.waze.settings.tree.c.h d(ConfigManager configManager, com.waze.config.d dVar) {
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(dVar, "stringConfig");
        return new el(configManager, dVar, 0);
    }

    public static final boolean e(com.waze.main_screen.c.a aVar, boolean z, h.g.a.a aVar2) {
        h.g.b.x.f(aVar2, "showToast");
        if (aVar == null || !z || !aVar.g()) {
            return true;
        }
        aVar2.invoke();
        return false;
    }

    public static final com.waze.ui.ac.n g(com.waze.settings.e.a.d dVar) {
        h.g.b.x.f(dVar, "<this>");
        com.waze.ui.ac.j jVar = null;
        com.waze.settings.e.a.c cVar = dVar instanceof com.waze.settings.e.a.c ? (com.waze.settings.e.a.c) dVar : null;
        if (cVar != null) {
            if (cVar.a() != com.waze.settings.e.a.b.f37127h) {
                cVar = null;
            }
            if (cVar != null) {
                jVar = new com.waze.ui.ac.j(R.string.HNC_PERMIT_DESCRIPTION_MX_HNC_OTHER);
            }
        }
        return jVar;
    }

    public static final com.waze.ui.ac.n h(com.waze.settings.e.a.d dVar) {
        int i2;
        h.g.b.x.f(dVar, "<this>");
        if (dVar instanceof com.waze.settings.e.a.a) {
            return new com.waze.ui.ac.m(((com.waze.settings.e.a.a) dVar).a());
        }
        if (!(dVar instanceof com.waze.settings.e.a.c)) {
            throw new h.i();
        }
        switch (((com.waze.settings.e.a.c) dVar).a().ordinal()) {
            case 0:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_EXEMPT;
                break;
            case 1:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_00;
                break;
            case 2:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_0;
                break;
            case 3:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_1;
                break;
            case 4:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_2;
                break;
            case 5:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_TOURIST;
                break;
            case 6:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_FOREIGN;
                break;
            case 7:
                i2 = R.string.HNC_PERMIT_TITLE_MX_HNC_OTHER;
                break;
            default:
                throw new h.i();
        }
        return new com.waze.ui.ac.j(i2);
    }

    public static final boolean i(String str, List list) {
        h.g.b.x.f(str, "licensePlateSuffix");
        h.g.b.x.f(list, "selectedPermitIds");
        String str2 = (String) h.a.i.Y(list);
        if (str2 == null) {
            return false;
        }
        if (str.length() == 2) {
            String str3 = str;
            for (int i2 = 0; i2 < str3.length(); i2++) {
                if (Character.isDigit(str3.charAt(i2))) {
                }
            }
            return true;
        }
        return h.g.b.x.n(str2, com.waze.settings.e.a.b.f37127h.a()) && str.length() == 0;
    }
}
