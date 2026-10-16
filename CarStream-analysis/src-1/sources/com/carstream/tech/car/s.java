package com.carstream.tech.car;

import defpackage.dd;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t c;

    public s(t tVar, String str, boolean z) {
        this.c = tVar;
        this.a = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.c;
        dd ddVar = tVar.a.currentApp;
        if (ddVar == null || !"web".equals(ddVar.a)) {
            return;
        }
        tVar.a.moOnhapTrang(this.a, this.b);
    }
}
