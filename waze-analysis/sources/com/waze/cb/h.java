package com.waze.cb;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22090e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f22091f;

    public /* synthetic */ h(k kVar, String str, String str2, String str3, int i2, int i3) {
        this.f22091f = i3;
        this.f22090e = kVar;
        this.f22088c = str;
        this.f22086a = str2;
        this.f22089d = str3;
        this.f22087b = i2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.foundation.layout.Arrangement$Vertical, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f22091f != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f22087b;
            ?? r4 = this.f22090e;
            ?? r3 = this.f22089d;
            ?? r2 = this.f22088c;
            return i.f(this.f22086a, r2, r3, r4, i2, (Composer) obj);
        }
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f22087b;
        Object obj3 = this.f22089d;
        return i.h((k) this.f22090e, (String) this.f22088c, this.f22086a, (String) obj3, i3, composer);
    }

    public /* synthetic */ h(String str, com.waze.ui.ac.i iVar, h.g.a.p pVar, Arrangement.Vertical vertical, int i2, int i3) {
        this.f22091f = i3;
        this.f22086a = str;
        this.f22088c = iVar;
        this.f22089d = pVar;
        this.f22090e = vertical;
        this.f22087b = i2;
    }
}
