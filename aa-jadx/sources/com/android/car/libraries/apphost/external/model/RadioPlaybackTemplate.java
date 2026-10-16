package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u0015Ê\u0001\u0002\b\u0016¨\u0006\u0014"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate$Builder;", "(Lcom/android/car/libraries/apphost/external/model/RadioPlaybackTemplate$Builder;)V", "header", "Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "getHeader", "()Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "playbackComponentName", "Landroid/content/ComponentName;", "getPlaybackComponentName", "()Landroid/content/ComponentName;", "hasInternalAttributionIcon", "", "getHasInternalAttributionIcon", "()Z", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model", "Landroidx/car/app/annotations/KeepFields;", "Landroidx/car/app/annotations/CarProtocol;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@defpackage.rg
public final class RadioPlaybackTemplate implements defpackage.wi {
    private final boolean hasInternalAttributionIcon;
    private final com.android.car.libraries.apphost.external.model.ExtendedHeader header;
    private final android.content.ComponentName playbackComponentName;

    private RadioPlaybackTemplate(defpackage.gkq gkqVar) {
        this.header = (com.android.car.libraries.apphost.external.model.ExtendedHeader) gkqVar.b;
        this.playbackComponentName = (android.content.ComponentName) gkqVar.c;
        this.hasInternalAttributionIcon = gkqVar.a;
    }

    public final boolean getHasInternalAttributionIcon() {
        return this.hasInternalAttributionIcon;
    }

    public final com.android.car.libraries.apphost.external.model.ExtendedHeader getHeader() {
        return this.header;
    }

    public final android.content.ComponentName getPlaybackComponentName() {
        return this.playbackComponentName;
    }

    private RadioPlaybackTemplate() {
        this.header = null;
        this.playbackComponentName = null;
        this.hasInternalAttributionIcon = false;
    }

    public /* synthetic */ RadioPlaybackTemplate(defpackage.gkq gkqVar, defpackage.affu affuVar) {
        this(gkqVar);
    }
}
