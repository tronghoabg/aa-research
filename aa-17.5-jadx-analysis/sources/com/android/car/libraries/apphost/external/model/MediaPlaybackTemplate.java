package com.android.car.libraries.apphost.external.model;

import android.content.ComponentName;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import defpackage.gkc;
import defpackage.gkd;
import defpackage.rb;
import defpackage.wb;

@rb
/* loaded from: classes2.dex */
public class MediaPlaybackTemplate implements wb {
    private final ActionStrip actionStrip;
    private final boolean hasInternalAttributionIcon;
    private final Header header;
    private final ComponentName playbackComponentName;

    private MediaPlaybackTemplate(gkc gkcVar) {
        Object obj = gkcVar.b;
        this.actionStrip = null;
        this.header = (Header) gkcVar.c;
        this.playbackComponentName = (ComponentName) gkcVar.d;
        this.hasInternalAttributionIcon = gkcVar.a;
    }

    public ActionStrip getActionStrip() {
        return this.actionStrip;
    }

    public Header getHeader() {
        return this.header;
    }

    public ComponentName getPlaybackComponentName() {
        return this.playbackComponentName;
    }

    public boolean hasInternalAttributionIcon() {
        return this.hasInternalAttributionIcon;
    }

    public /* synthetic */ MediaPlaybackTemplate(gkc gkcVar, gkd gkdVar) {
        this(gkcVar);
    }

    private MediaPlaybackTemplate() {
        this.actionStrip = null;
        this.header = null;
        this.playbackComponentName = null;
        this.hasInternalAttributionIcon = false;
    }
}
