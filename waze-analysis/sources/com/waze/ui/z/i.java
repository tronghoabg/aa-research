package com.waze.ui.z;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f43963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43965c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43966d;

    public /* synthetic */ i(Object obj, Modifier modifier, int i2, int i3) {
        this.f43966d = i3;
        this.f43965c = obj;
        this.f43963a = modifier;
        this.f43964b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f43966d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f43964b;
            Modifier modifier = this.f43963a;
            return as.A((al) this.f43965c, modifier, i3, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f43964b;
            Modifier modifier2 = this.f43963a;
            return as.y((ak) this.f43965c, modifier2, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f43964b;
        Modifier modifier3 = this.f43963a;
        return as.C((ao) this.f43965c, modifier3, i5, (Composer) obj);
    }
}
