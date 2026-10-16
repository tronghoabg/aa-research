package com.waze.sound;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hp extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TtsNativeManager f40170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f40171c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f40172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hp(TtsNativeManager ttsNativeManager, String str, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f40170b = ttsNativeManager;
        this.f40171c = str;
        this.f40172d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new hp(this.f40170b, this.f40171c, this.f40172d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hp) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40169a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            TtsNativeManager ttsNativeManager = this.f40170b;
            String str = this.f40171c;
            this.f40169a = 1;
            obj = ttsNativeManager.voiceFilesProvider.b(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        TtsNativeManager ttsNativeManager2 = this.f40170b;
        boolean z = this.f40172d;
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            com.waze.sharedui.e.e.i(ttsNativeManager2.soundPlayer, (String) it.next(), null, false, z, null, 22);
        }
        return h.ab.f48028a;
    }
}
