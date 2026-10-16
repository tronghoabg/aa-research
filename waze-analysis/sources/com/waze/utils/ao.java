package com.waze.utils;

import android.content.Context;
import androidx.core.text.util.LocalePreferences;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.config.dj;
import com.waze.install.InstallNativeManager;
import com.waze.ni;
import h.g.b.ar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends com.waze.shared_infra.o.c {

    /* renamed from: g, reason: collision with root package name */
    private final InstallNativeManager f44851g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f44852h;

    /* renamed from: i, reason: collision with root package name */
    private final String f44853i;

    /* renamed from: j, reason: collision with root package name */
    private final List f44854j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f44855k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(InstallNativeManager installNativeManager, kotlinx.coroutines.af afVar, Context context) {
        super(context);
        h.g.b.x.f(installNativeManager, "installNativeManager");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(context, "context");
        this.f44851g = installNativeManager;
        this.f44852h = afVar;
        this.f44853i = "DISPLAY_STRING_";
        this.f44854j = h.a.i.i("af", "ar", "bg", "ca", "cs", "da", "de", "en", "en-GB", "es", "es-419", "et", "fi", "fr", "gl", "he", "hr", "hu", TtmlNode.ATTR_ID, "it", "ja", "ko", "lv", "lt", AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL, "nl", "no", "pl", "pt-BR", "pt-PT", "ro", "ru", "sk", "sl", "sr", "sv", "tr", "uk", "zh", "zh-TW");
        this.f44855k = h.a.r.k(new h.k("eng", "en"), new h.k("eng_uk", "en_GB"), new h.k("eng_uk", "en-GB"), new h.k("bulgarian", "bg"), new h.k("catalan", "ca"), new h.k("czech", "cs"), new h.k("danish", "da"), new h.k("deutsch", "de"), new h.k("dutch", "nl"), new h.k("espanol", "es"), new h.k("espanol_latam", "es-419"), new h.k("francais", "fr"), new h.k("italiano", "it"), new h.k("latvian", "lv"), new h.k("lithuanian", "lt"), new h.k("hungarian", "hu"), new h.k("norwegian", "no"), new h.k("polski", "pl"), new h.k("portuguese_br", "pt-BR"), new h.k("portuguese_pt", "pt-PT"), new h.k("russian", "ru"), new h.k("swedish", "sv"), new h.k("slovak", "sk"), new h.k("arabic", "ar"), new h.k(LocalePreferences.CalendarType.CHINESE, "zh"), new h.k("chinese_tw", "zh-TW"), new h.k("heb", "he"), new h.k("hindi", "hi"), new h.k("turkish", "tr"), new h.k("romanian", "ro"), new h.k("japanese", "ja"), new h.k("korean", "ko"), new h.k("afrikaans", "af"), new h.k("basque", "eu"), new h.k("galician", "gl"), new h.k("malay", AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL), new h.k("serbian", "sr"), new h.k("serbian(latin)", "sr"), new h.k("finnish", "fi"), new h.k("slovenian", "sl"), new h.k("ukrainian", "uk"), new h.k("croatian", "hr"), new h.k("estonian", "et"), new h.k("indonesian", TtmlNode.ATTR_ID), new h.k("greek", "el"), new h.k("dutch_be", "nl-BE"));
    }

    public static final /* synthetic */ void m(ao aoVar, File file) {
        com.waze.shared_infra.i.h.b("StringsUtils", "Reading cached string file: ".concat(String.valueOf(String.valueOf(file))));
        try {
            aoVar.k(aoVar.i(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)), "cache " + String.valueOf(file));
        } catch (FileNotFoundException e2) {
            com.waze.shared_infra.i.h.k("StringsUtils", "Cached strings file not found, filename: " + String.valueOf(file) + ", error: " + e2.getMessage());
        } catch (IOException e3) {
            com.waze.shared_infra.i.h.k("StringsUtils", "Failed to read the cached strings file: " + String.valueOf(file) + "error: " + e3.getMessage());
        }
    }

    static final void o(ao aoVar) {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_LANG_DEBUG_STRINGS_SHOW_DISPLAY_KEY;
        h.g.b.x.e(bVar, "CONFIG_VALUE_LANG_DEBUG_STRINGS_SHOW_DISPLAY_KEY");
        kotlinx.coroutines.b.k kVarK = kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar), new am(aoVar, null, 1, null));
        kotlinx.coroutines.af afVar = aoVar.f44852h;
        kotlinx.coroutines.b.ai.m(kVarK, afVar);
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_LANG_DEBUG_STRINGS_SHOW_DEFAULT_VALUE;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_LANG_DEBUG_STRINGS_SHOW_DEFAULT_VALUE");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(com.waze.n.ac.o(bVar2), new am(aoVar, null, 0)), afVar);
    }

    static final h.ab p(ao aoVar, String str) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if (h.g.b.x.n(aoVar.f44855k.get(str), aoVar.f44851g.getLocale())) {
            org.a.d.a.a aVar = com.waze.install.x.f24798a;
            if (aVar instanceof org.a.d.a.b) {
                bVarC = ((org.a.d.a.b) aVar).l();
                int i2 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.install.x.class);
            } else {
                bVarC = aVar.getKoin().a().c();
                int i3 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.install.x.class);
            }
            ((com.waze.install.x) bVarC.a(mVar, null, null)).f(new h.g.b.m(com.waze.install.u.class));
        }
        return h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.o.c, com.waze.shared_infra.o.a
    public final String a() {
        String str = this.f37922e;
        if (str == null) {
            return "en";
        }
        String str2 = (String) this.f44855k.get(str);
        if (str2 == null || !this.f44854j.contains(str2)) {
            str2 = null;
        }
        return str2 == null ? "en" : str2;
    }

    @Override // com.waze.shared_infra.o.c, com.waze.shared_infra.o.a
    public final void e() {
        int i2 = dj.f22618a;
        dj djVarC = ni.c();
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_SYSTEM_LANGUAGE;
        h.g.b.x.e(dVar, "CONFIG_VALUE_SYSTEM_LANGUAGE");
        String strB = djVarC.b(dVar);
        dj djVarC2 = ni.c();
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_LANG_OVERRIDE_IDS;
        h.g.b.x.e(dVar2, "CONFIG_VALUE_LANG_OVERRIDE_IDS");
        f(strB, h.a.i.Z(h.n.o.af(djVarC2.b(dVar2), new String[]{","}, 0, 6)));
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.utils.al
            @Override // java.lang.Runnable
            public final void run() {
                ao.o(this.f44846a);
            }
        });
    }

    @Override // com.waze.shared_infra.o.c, com.waze.shared_infra.o.a
    public final void f(final String str, HashSet hashSet) {
        h.g.b.x.f(str, "language");
        h.g.b.x.f(hashSet, "overrideIds");
        if (h.g.b.x.n(str, this.f37922e) && this.f37923f.equals(hashSet)) {
            return;
        }
        this.f37922e = str;
        this.f37923f = hashSet;
        kotlinx.coroutines.aj.z(this.f44852h, av.b(), null, new an(this, null), 2).bY(new h.g.a.l() { // from class: com.waze.utils.ak
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ao.p(this.f44844a, str);
            }
        });
    }

    @Override // com.waze.shared_infra.o.c
    protected final String g() {
        return "res/";
    }

    @Override // com.waze.shared_infra.o.c
    protected final String h(String str, boolean z) {
        h.g.b.x.f(str, "key");
        return (String) (z ? this.f37921d.get(this.f44853i.concat(String.valueOf(str))) : this.f37921d.get(str));
    }

    protected final File l() {
        String parent;
        String strValueOf = String.valueOf(this.f37922e);
        File fileStreamPath = this.f37920c.getFileStreamPath("");
        if (fileStreamPath == null || (parent = fileStreamPath.getParent()) == null) {
            return null;
        }
        return new File(parent.concat("/waze/").concat("lang.".concat(strValueOf)));
    }
}
