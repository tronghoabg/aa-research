package com.android.car.libraries.apphost.external.model;

import android.content.ComponentName;
import defpackage.afeu;
import defpackage.gkj;
import defpackage.rb;
import defpackage.wb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate$Builder;", "(Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate$Builder;)V", "header", "Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "getHeader", "()Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "playbackComponentName", "Landroid/content/ComponentName;", "getPlaybackComponentName", "()Landroid/content/ComponentName;", "hasInternalAttributionIcon", "", "getHasInternalAttributionIcon", "()Z", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class RadioPlaybackTemplate implements wb {
    private final boolean hasInternalAttributionIcon;
    private final ExtendedHeader header;
    private final ComponentName playbackComponentName;

    private RadioPlaybackTemplate(gkj gkjVar) {
        this.header = (ExtendedHeader) gkjVar.b;
        this.playbackComponentName = (ComponentName) gkjVar.c;
        this.hasInternalAttributionIcon = gkjVar.a;
    }

    public final boolean getHasInternalAttributionIcon() {
        return this.hasInternalAttributionIcon;
    }

    public final ExtendedHeader getHeader() {
        return this.header;
    }

    public final ComponentName getPlaybackComponentName() {
        return this.playbackComponentName;
    }

    private RadioPlaybackTemplate() {
        this.header = null;
        this.playbackComponentName = null;
        this.hasInternalAttributionIcon = false;
    }

    public /* synthetic */ RadioPlaybackTemplate(gkj gkjVar, afeu afeuVar) {
        this(gkjVar);
    }
}
