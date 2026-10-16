package com.waze;

import com.waze.jni.protos.LoadAutoCompleteVenueRequest;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ie implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu f24452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24454c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f24455d;

    public /* synthetic */ ie(iu iuVar, Object obj, Object obj2, int i2) {
        this.f24455d = i2;
        this.f24452a = iuVar;
        this.f24453b = obj;
        this.f24454c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24455d;
        ?? r1 = this.f24454c;
        if (i2 != 0) {
            iu.fetchAutocompleteVenue$lambda$0(this.f24452a, (LoadAutoCompleteVenueRequest) this.f24453b, r1);
            return null;
        }
        iu.venueDeleteImage$lambda$0(this.f24452a, (String) this.f24453b, (String) r1);
        return null;
    }
}
