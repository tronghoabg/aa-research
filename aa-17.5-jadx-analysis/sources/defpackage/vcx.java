package defpackage;

import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vcx extends vgo {
    final /* synthetic */ GoogleMap.OnMapLoadedCallback a;

    public vcx(GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.a = onMapLoadedCallback;
    }

    @Override // defpackage.vgp
    public final void a() {
        this.a.onMapLoaded();
    }
}
