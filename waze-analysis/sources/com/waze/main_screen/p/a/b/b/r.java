package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.cg;
import com.waze.navigate.eo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26986a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f26987b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f26988c;

    public r(com.waze.crash.k kVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(kVar, "firebaseLogger");
        h.g.b.x.f(eVar, "logger");
        this.f26986a = kVar;
        this.f26987b = eVar;
        Pattern patternCompile = Pattern.compile("(?<keyword>\\w+(?:_clicked|_shown)) \\{");
        h.g.b.x.e(patternCompile, "compile(...)");
        this.f26988c = patternCompile;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    private final List d(String str) {
        Matcher matcher = ((Pattern) this.f26988c).matcher(str);
        h.g.b.x.e(matcher, "matcher(...)");
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                String strGroup = matcher.group("keyword");
                if (strGroup != null) {
                    arrayList.add(strGroup);
                }
            } catch (IllegalStateException e2) {
                this.f26987b.c("Error: No match found when expected. Check the regex and input string.", e2);
            } catch (IndexOutOfBoundsException e3) {
                this.f26987b.c("Error: Named capturing group is not present in the regex", e3);
            }
        }
        return arrayList;
    }

    private final void e(String str) {
        for (String str2 : d(str)) {
            ((com.waze.crash.k) this.f26986a).e("Component: ".concat(String.valueOf(str2)));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.navigate.cg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.navigate.eo, java.lang.Object] */
    public final t a() {
        return new ab(this.f26986a, this.f26987b, ((com.waze.sharedrive.e.j) this.f26988c).a());
    }

    public final void b(brf brfVar) {
        h.g.b.x.f(brfVar, "stat");
        String string = brfVar.toString();
        h.g.b.x.e(string, "toString(...)");
        e(string);
    }

    public final void c(bri briVar) {
        h.g.b.x.f(briVar, "stat");
        String string = briVar.toString();
        h.g.b.x.e(string, "toString(...)");
        e(string);
    }

    public r(cg cgVar, eo eoVar, com.waze.sharedrive.e.j jVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(eoVar, "navigationStatusProvider");
        h.g.b.x.f(jVar, "shareButtonStateHolderFactory");
        this.f26986a = cgVar;
        this.f26987b = eoVar;
        this.f26988c = jVar;
    }
}
