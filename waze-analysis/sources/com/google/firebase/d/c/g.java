package com.google.firebase.d.c;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9846a;

    public /* synthetic */ g(int i2) {
        this.f9846a = i2;
    }

    @Override // com.google.firebase.d.b
    public final void a(Object obj, Object obj2) {
        int i2 = this.f9846a;
        if (i2 == 0) {
            h.f((Map.Entry) obj, (com.google.firebase.d.g) obj2);
        } else {
            if (i2 != 1) {
                throw new com.google.firebase.d.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            }
            int i3 = com.google.firebase.d.b.d.f9823a;
            throw new com.google.firebase.d.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
