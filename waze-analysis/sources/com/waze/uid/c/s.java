package com.waze.uid.c;

import androidx.compose.ui.layout.Placeable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final int f44413a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f44414b;

    public s(Placeable placeable, int i2) {
        h.g.b.x.f(placeable, "placeable");
        this.f44414b = placeable;
        this.f44413a = i2 - (placeable.getWidth() / 2);
    }

    public final int a() {
        return this.f44413a;
    }

    public final com.waze.uid.f.c b() {
        return (com.waze.uid.f.c) this.f44414b;
    }

    public final int c() {
        return this.f44413a;
    }

    public final Placeable d() {
        return (Placeable) this.f44414b;
    }

    public s(int i2, com.waze.uid.f.c cVar) {
        this.f44413a = i2;
        this.f44414b = cVar;
    }
}
