package com.google.d.d;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cm extends br {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f7498a;

    cm(cn cnVar) {
        super(cnVar);
        this.f7498a = cnVar.comparator();
    }

    @Override // com.google.d.d.br
    final /* bridge */ /* synthetic */ bq a(int i2) {
        return new cl(this.f7498a);
    }
}
