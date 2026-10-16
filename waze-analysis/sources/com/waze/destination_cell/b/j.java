package com.waze.destination_cell.b;

import android.graphics.Bitmap;
import com.waze.navigate.AddressItem;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f23509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f23510b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23511c;

    j(c cVar, AddressItem addressItem, int i2) {
        this.f23511c = i2;
        this.f23510b = addressItem;
        Objects.requireNonNull(cVar);
        this.f23509a = cVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        if (this.f23511c != 0) {
            if (obj == this.f23510b) {
                ((c) this.f23509a).f23556b.h(bitmap);
            }
        } else if (obj == this.f23509a) {
            ((k) this.f23510b).f23556b.h(bitmap);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.destination_cell.a.a, java.lang.Object] */
    @Override // com.waze.utils.h
    public final void b() {
        if (this.f23511c != 0) {
            return;
        }
        com.waze.shared_infra.i.h.a("SavedDestinationCellPresenter: Failed to load the cell icon with image url: ".concat(String.valueOf(this.f23509a.f())));
        ((k) this.f23510b).f23556b.i(null);
    }

    j(k kVar, com.waze.destination_cell.a.a aVar, int i2) {
        this.f23511c = i2;
        this.f23509a = aVar;
        Objects.requireNonNull(kVar);
        this.f23510b = kVar;
    }
}
