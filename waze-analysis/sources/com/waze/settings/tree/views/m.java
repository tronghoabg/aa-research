package com.waze.settings.tree.views;

import com.waze.settings.de;
import java.util.TimerTask;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.settings.tree.d.r f37628a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f37629b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f37630c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f37631d;

    m(com.waze.settings.tree.d.r rVar, de deVar, int i2, int i3) {
        this.f37628a = rVar;
        this.f37629b = deVar;
        this.f37630c = i2;
        this.f37631d = i3;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        com.waze.settings.tree.d.r rVar = this.f37628a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37630c);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37631d);
        com.waze.search.v2.o.i(rVar, this.f37629b, string, sb2.toString());
    }
}
