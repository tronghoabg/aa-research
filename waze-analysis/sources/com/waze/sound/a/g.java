package com.waze.sound.a;

import com.waze.config.ConfigValues;
import com.waze.copilot.data.ag;
import com.waze.sound.VoicesNativeManager;
import com.waze.sound.hz;
import com.waze.sound.iv;
import h.g.b.x;
import h.n.o;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final hz f39383a;

    /* renamed from: b, reason: collision with root package name */
    private final VoicesNativeManager f39384b;

    /* renamed from: c, reason: collision with root package name */
    private final iv f39385c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39386d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f39387e;

    public g(hz hzVar, VoicesNativeManager voicesNativeManager, iv ivVar, d dVar, e eVar, com.waze.shared_infra.i.e eVar2) {
        x.f(hzVar, "voiceAssetProtoCache");
        x.f(voicesNativeManager, "voicesNativeManager");
        x.f(ivVar, "voiceFilesProvider");
        x.f(dVar, "config");
        x.f(eVar, "legacyConfig");
        x.f(eVar2, "logger");
        this.f39383a = hzVar;
        this.f39384b = voicesNativeManager;
        this.f39385c = ivVar;
        this.f39386d = eVar2;
        this.f39387e = ck.b(null);
    }

    @Override // com.waze.sound.a.a
    public final String a() {
        return d.a();
    }

    @Override // com.waze.sound.a.a
    public final String b() {
        return d.b();
    }

    @Override // com.waze.sound.a.c
    public final b c() {
        return (b) this.f39387e.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.waze.copilot.data.ag r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.a.g.d(com.waze.copilot.data.ag, h.c.e):java.lang.Object");
    }

    @Override // com.waze.sound.a.c
    public final k e() {
        return ai.S(this.f39387e);
    }

    @Override // com.waze.sound.a.c
    public final void f() {
        String str;
        String strB = d.b();
        if (strB == null || strB.length() == 0) {
            com.waze.shared_infra.i.e eVar = this.f39386d;
            eVar.a("Migrating configs.");
            String strB2 = ConfigValues.CONFIG_VALUE_TTS_VOICE_ID.b();
            String strB3 = ConfigValues.CONFIG_VALUE_PROMPTS_PROMPT_NAME.b();
            String strB4 = ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_TYPE.b();
            x.e(strB4, "getValue(...)");
            if (!x.n(strB4, "Full") || (str = strB2) == null || str.length() == 0) {
                String str2 = strB3;
                if (str2 == null || str2.length() == 0) {
                    eVar.a("No valid voice to migrate.");
                } else {
                    eVar.a("Current voice is a Prompt voice, migrating to new config.");
                    d.c(strB3);
                }
            } else {
                eVar.a("Current voice is a TTS voice, migrating to new config.");
                d.c(strB2);
            }
        } else {
            this.f39386d.a("Config migration was already done.");
        }
        String strB5 = d.b();
        String str3 = strB5;
        if (str3 == null || str3.length() == 0) {
            this.f39387e.e(null);
            return;
        }
        ag agVarA = this.f39383a.a();
        if (agVarA == null) {
            this.f39386d.g("No cached voice found.");
            this.f39387e.e(null);
        } else if (x.n(agVarA.f(), strB5)) {
            this.f39384b.setVoiceAsset(agVarA);
            this.f39387e.e(new b(agVarA, d.a()));
        } else {
            this.f39386d.g("Cached voice doesn't match selected voice id.");
            this.f39387e.e(null);
        }
    }

    @Override // com.waze.sound.a.c
    public final void g(String str) {
        bn bnVar;
        Object objD;
        b bVar;
        ConfigValues.CONFIG_VALUE_CUSTOM_PROMPTS_SELECTED_UUID.d(str == null ? "" : str);
        do {
            bnVar = this.f39387e;
            objD = bnVar.d();
            bVar = (b) objD;
        } while (!bnVar.f(objD, bVar != null ? b.c(bVar, null, str, 1) : null));
    }

    @Override // com.waze.sound.a.c
    public final boolean h() {
        b bVar = (b) this.f39387e.d();
        String strB = bVar != null ? bVar.b() : null;
        return (strB == null || o.G(strB)) ? false : true;
    }
}
