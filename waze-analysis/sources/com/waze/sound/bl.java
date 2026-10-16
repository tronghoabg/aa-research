package com.waze.sound;

import androidx.camera.video.AudioStats;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39543a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39544b;

    public bl(com.waze.shared_infra.i.e eVar, em emVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(emVar, "soundConfig");
        this.f39544b = eVar;
        this.f39543a = emVar;
    }

    public static final long c(String str) {
        h.g.b.x.f(str, "phrase");
        String str2 = str;
        int i2 = 0;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt = str2.charAt(i3);
            if (cCharAt == ' ' || cCharAt == '_') {
                i2++;
            }
        }
        int length = ((str.length() - i2) / 2) + i2;
        int i4 = gk.f40093a;
        return h.o.a.t(gk.a(), length);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.sound.em, java.lang.Object] */
    private final int d(String str, double d2) {
        double dM = h.o.a.m(c(str)) * (d2 / 3600.0d);
        if (!this.f39543a.getFinishByDistanceFullWeightEnabled()) {
            dM *= 0.5d;
        }
        return h.h.a.a(dM);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.sound.a.c, java.lang.Object] */
    public final String a(boolean z) {
        Object next;
        com.waze.sound.a.b bVarC = this.f39543a.c();
        String name = null;
        if (bVarC == null) {
            return null;
        }
        if (z) {
            return bVarC.a().i();
        }
        String strB = bVarC.b();
        if (strB != null) {
            Iterator it = ((Iterable) ((bj) this.f39544b).b().d()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((CustomPromptSet) next).getUUID(), strB)) {
                    break;
                }
            }
            CustomPromptSet customPromptSet = (CustomPromptSet) next;
            if (customPromptSet != null) {
                name = customPromptSet.getName();
            }
        }
        return name == null ? bVarC.a().i() : name;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final h.k.j b(String str, int i2, double d2, o oVar) {
        int i3;
        h.g.b.x.f(str, "phrase");
        h.g.b.x.f(oVar, "announcementTiming");
        int iD = d(str, d2);
        o oVar2 = o.f40411a;
        int iOrdinal = oVar.ordinal();
        if (iOrdinal == 0) {
            i3 = i2 + 30;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            i3 = iD + i2;
        }
        int i4 = i2 - 30;
        if (d2 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return new h.k.j(i4, i3);
        }
        this.f39544b.b(d2 + " is negative! Returning default range");
        return new h.k.j(i4, i2 + 30);
    }

    public bl(com.waze.sound.a.c cVar, bj bjVar) {
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(bjVar, "customPromptsRepository");
        this.f39543a = cVar;
        this.f39544b = bjVar;
    }
}
