package com.waze.sound;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay implements com.waze.h.a.j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39488a;

    public ay(Context context, com.waze.speech.k kVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(kVar, "cueFileMapper");
        this.f39488a = context;
    }

    @Override // com.waze.h.a.j
    public final String a(com.waze.h.a.i iVar) {
        String str;
        h.g.b.x.f(iVar, "cue");
        h.g.b.x.f(iVar, "cue");
        com.waze.h.a.i iVar2 = com.waze.h.a.i.f24315a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            str = "conversational_minimalist_mic_on";
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            str = "conversational_minimalist_mic_off";
        }
        return com.waze.resources.h.e(this.f39488a, str);
    }
}
