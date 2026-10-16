package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final y f31511a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f31512b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31513c;

    /* renamed from: d, reason: collision with root package name */
    public final List f31514d;

    /* renamed from: e, reason: collision with root package name */
    public final C2083a f31515e;

    /* renamed from: f, reason: collision with root package name */
    public final List f31516f;

    public u(y yVar, Long l10, List mediaFiles, List trackingList, C2083a c2083a, List icons) {
        AbstractC3340k.e(mediaFiles, "mediaFiles");
        AbstractC3340k.e(trackingList, "trackingList");
        AbstractC3340k.e(icons, "icons");
        this.f31511a = yVar;
        this.f31512b = l10;
        this.f31513c = mediaFiles;
        this.f31514d = trackingList;
        this.f31515e = c2083a;
        this.f31516f = icons;
    }
}
