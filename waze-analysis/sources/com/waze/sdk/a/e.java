package com.waze.sdk.a;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.a.z;
import com.waze.sdk.bd;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends android.support.v4.media.a.h {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f35181d;

    e(i iVar) {
        Objects.requireNonNull(iVar);
        this.f35181d = iVar;
    }

    @Override // android.support.v4.media.a.h
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return;
        }
        i iVar = this.f35181d;
        iVar.f35193g = mediaMetadataCompat;
        bd.d().M(iVar.f35188b, iVar.f35193g);
    }

    @Override // android.support.v4.media.a.h
    public final void b(z zVar) {
        if (zVar == null) {
            return;
        }
        i iVar = this.f35181d;
        iVar.f35194h = iVar.x(zVar);
        bd.d().N(iVar.f35188b, iVar.f35194h);
    }
}
