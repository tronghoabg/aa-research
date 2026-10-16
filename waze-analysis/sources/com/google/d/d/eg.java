package com.google.d.d;

import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class eg extends ek implements dc {
    eg(dc dcVar, dp dpVar) {
        super(dcVar, dpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.d.d.ek
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a(final Object obj, Collection collection) {
        return fo.G((List) collection, new com.google.d.b.t() { // from class: com.google.d.d.ef
            @Override // com.google.d.b.t
            public final Object apply(Object obj2) {
                return this.f7559a.f7566b.a(obj, obj2);
            }
        });
    }

    @Override // com.google.d.d.ek, com.google.d.d.dw
    public final /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw null;
    }

    @Override // com.google.d.d.ek, com.google.d.d.dw
    public final List g(Object obj) {
        return a(obj, this.f7565a.g(obj));
    }
}
