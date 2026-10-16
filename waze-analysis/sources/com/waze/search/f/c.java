package com.waze.search.f;

import com.waze.bw.c.d.bd;
import com.waze.google_assistant.ax;
import com.waze.main_screen.ab;
import com.waze.search.h.bx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements ax {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35674a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35675b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f35675b = i2;
        this.f35674a = obj;
    }

    @Override // com.waze.google_assistant.ax
    public final void a(String str) {
        if (this.f35675b == 0) {
            ((bx) this.f35674a).H(str);
        } else {
            ((ab) this.f35674a).m(new bd(str));
        }
    }
}
