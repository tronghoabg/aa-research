package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import java.util.List;
import x6.InterfaceC4482m;
import x6.InterfaceC4486q;
import x6.t;

/* loaded from: classes3.dex */
public abstract class NativeAd {
    public abstract void destroy();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract c getIcon();

    public abstract List getImages();

    public abstract InterfaceC4482m getMediaContent();

    public abstract t getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract void recordEvent(Bundle bundle);

    public abstract void setOnPaidEventListener(InterfaceC4486q interfaceC4486q);

    public abstract Object zza();
}
