package com.waze.uid;

import android.content.Context;
import android.content.Intent;
import com.waze.navigate.AutocompleteSearchActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v implements com.waze.uid.d.h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.ah f44794a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44795b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44796c;

    public v(com.waze.av.b.ah ahVar) {
        h.g.b.x.f(ahVar, "placesRepository");
        this.f44794a = ahVar;
    }

    @Override // com.waze.uid.d.h
    public final Intent a(Context context) {
        h.g.b.x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) AutocompleteSearchActivity.class);
        intent.putExtra("SearchMode", 3);
        intent.putExtra("IsEditMode", this.f44796c);
        return intent;
    }

    @Override // com.waze.uid.d.h
    public final Intent b(Context context) {
        h.g.b.x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) AutocompleteSearchActivity.class);
        intent.putExtra("SearchMode", 4);
        intent.putExtra("IsEditMode", this.f44795b);
        return intent;
    }

    @Override // com.waze.uid.d.h
    public final kotlinx.coroutines.b.k c() {
        return new u(this.f44794a.d(), this);
    }
}
