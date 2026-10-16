package com.waze.z.a.c;

import androidx.compose.ui.layout.ContentScale;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f45838a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentScale f45839b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45840c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f45841d;

    /* renamed from: e, reason: collision with root package name */
    private final i f45842e;

    public /* synthetic */ h(com.waze.ui.ac.i iVar, ContentScale contentScale, i iVar2, int i2) {
        contentScale = (i2 & 2) != 0 ? ContentScale.Companion.getNone() : contentScale;
        iVar2 = (i2 & 16) != 0 ? i.f45843a : iVar2;
        x.f(iVar, "imageSource");
        x.f(contentScale, "contentScale");
        x.f(iVar2, "imageType");
        this.f45838a = iVar;
        this.f45839b = contentScale;
        this.f45840c = null;
        this.f45841d = false;
        this.f45842e = iVar2;
    }

    public final ContentScale a() {
        return this.f45839b;
    }

    public final i b() {
        return this.f45842e;
    }

    public final com.waze.ui.ac.i c() {
        return this.f45838a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!x.n(this.f45838a, hVar.f45838a) || !x.n(this.f45839b, hVar.f45839b)) {
            return false;
        }
        String str = hVar.f45840c;
        if (!x.n(null, null)) {
            return false;
        }
        boolean z = hVar.f45841d;
        return this.f45842e == hVar.f45842e;
    }

    public final int hashCode() {
        return (((((this.f45838a.hashCode() * 31) + this.f45839b.hashCode()) * 961) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER) * 31) + this.f45842e.hashCode();
    }

    public final String toString() {
        return "WazeDialogImageData(imageSource=" + this.f45838a + ", contentScale=" + this.f45839b + ", imageContentDescription=null, cropCircle=false, imageType=" + this.f45842e + ")";
    }
}
