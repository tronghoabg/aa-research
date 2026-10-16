package com.waze.bj;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements com.a.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.a.a.a.a f16833a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f16834b;

    b(com.a.a.a.a aVar, Context context) {
        this.f16833a = aVar;
        this.f16834b = context;
    }

    @Override // com.a.a.a.c
    public final void a(int i2) {
        if (i2 != 0) {
            c.f16835a.b("Failed to establish connection to the referrer client");
            return;
        }
        try {
            String strH = c.h(this.f16833a.e());
            if (strH != null) {
                String strJ = c.j(Uri.decode(strH));
                if (strJ.startsWith("invite_")) {
                    NativeManager.mInviteId = strJ.substring(7);
                    return;
                }
                if (strJ.contains("open_url_ex")) {
                    return;
                }
                if (!strJ.contains("deeplink_")) {
                    c.k(this.f16834b, strJ, "");
                } else {
                    c.k(this.f16834b, strJ, strJ.substring(strJ.indexOf("deeplink_") + 9));
                }
            }
        } catch (RemoteException e2) {
            c.f16835a.c("Failed to fetch the installation referrer", e2);
        }
    }
}
