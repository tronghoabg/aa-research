package com.waze.sdk.a;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.a.r;
import android.support.v4.media.a.z;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends android.support.v4.media.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f35178a;

    b(i iVar) {
        Objects.requireNonNull(iVar);
        this.f35178a = iVar;
    }

    @Override // android.support.v4.media.d
    public final void onConnected() {
        i iVar = this.f35178a;
        com.waze.shared_infra.i.h.a("WazeSdk: Connected to media browser service: ".concat(String.valueOf(iVar.f35188b)));
        try {
            iVar.f35191e = new r(iVar.f35187a, iVar.f35190d.a());
            i iVar2 = this.f35178a;
            iVar2.f35192f = iVar2.f35191e.b();
            iVar2.f35191e.d(iVar2.n);
            MediaMetadataCompat mediaMetadataCompatA = iVar2.f35191e.a();
            if (mediaMetadataCompatA != null) {
                iVar2.n.a(mediaMetadataCompatA);
            }
            z zVarC = iVar2.f35191e.c();
            if (zVarC != null) {
                iVar2.n.b(zVarC);
            }
            iVar2.f35190d.e(iVar2.f35190d.b(), iVar2.m);
        } catch (Throwable th) {
            com.waze.shared_infra.i.h.e("WazeSdk: media controller initialization failed", th);
            i iVar3 = this.f35178a;
            iVar3.f35191e = null;
            iVar3.f35192f = null;
        }
    }

    @Override // android.support.v4.media.d
    public final void onConnectionFailed() {
        com.waze.shared_infra.i.h.a("WazeSdk: Cannot connect to media browser service: ".concat(String.valueOf(this.f35178a.f35188b)));
    }

    @Override // android.support.v4.media.d
    public final void onConnectionSuspended() {
        i iVar = this.f35178a;
        iVar.f35191e = null;
        iVar.f35192f = null;
    }
}
