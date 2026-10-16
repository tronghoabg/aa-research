package com.waze.z.a.e;

import androidx.compose.ui.hapticfeedback.HapticFeedback;
import com.airbnb.lottie.b.w;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f46016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f46017b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ HapticFeedback f46018c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.b.b f46019d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f46020e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f46021f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ w f46022g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ w f46023h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ w f46024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, HapticFeedback hapticFeedback, com.airbnb.lottie.b.b bVar, w wVar, w wVar2, w wVar3, w wVar4, w wVar5, e eVar) {
        super(2, eVar);
        this.f46017b = cVar;
        this.f46018c = hapticFeedback;
        this.f46019d = bVar;
        this.f46020e = wVar;
        this.f46021f = wVar2;
        this.f46022g = wVar3;
        this.f46023h = wVar4;
        this.f46024i = wVar5;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f46017b, this.f46018c, this.f46019d, this.f46020e, this.f46021f, this.f46022g, this.f46023h, this.f46024i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (android.support.v7.widget.ej.k(r17.f46019d, r6, Integer.MAX_VALUE, true, 1.0f, null, 0.0f, null, r17, 2018) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (android.support.v7.widget.ej.k(r17.f46019d, r5, Integer.MAX_VALUE, true, 1.0f, null, 0.0f, null, r17, 2018) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (android.support.v7.widget.ej.k(r17.f46019d, a.a.G(r2), Integer.MAX_VALUE, true, 0.0f, null, 0.0f, null, r17, com.waze.strings.DisplayStrings.DS_SDK_ON_DISAGREED_POPUP_TITLE) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (android.support.v7.widget.ej.k(r17.f46019d, a.a.G(r2), 1, false, 0.0f, null, 0.0f, null, r17, com.waze.strings.DisplayStrings.DS_AUDIO_PANEL_SHOW_APP_LIST) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
    
        if (android.support.v7.widget.ej.k(r17.f46019d, a.a.G(r2), Integer.MAX_VALUE, false, 0.0f, null, 0.0f, null, r17, com.waze.strings.DisplayStrings.DS_AUDIO_PANEL_SHOW_APP_LIST) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        return r1;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
