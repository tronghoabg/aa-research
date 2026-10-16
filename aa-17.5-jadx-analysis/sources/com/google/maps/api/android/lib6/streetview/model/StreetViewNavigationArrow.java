package com.google.maps.api.android.lib6.streetview.model;

import com.google.android.libraries.maps.model.StreetViewPanoramaLink;
import defpackage.zkt;
import defpackage.zsa;

/* loaded from: classes3.dex */
public class StreetViewNavigationArrow extends StreetViewPanoramaLink {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewNavigationArrow(String str, float f, int i) {
        super(str, f);
        zkt.n(str, "panoId");
        this.a = i;
    }

    @Override // com.google.android.libraries.maps.model.StreetViewPanoramaLink
    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("panoId", this.panoId);
        zsaVarA.d("bearing", this.bearing);
        zsaVarA.e("linkARGB", this.a);
        return zsaVarA.toString();
    }
}
