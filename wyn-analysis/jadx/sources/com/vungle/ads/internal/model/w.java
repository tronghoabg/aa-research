package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.F;
import ff.AbstractC2641B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class w extends Xf.w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f33352a = new w();

    public w() {
        super(AbstractC2641B.a(new C1241c(Wf.q0.f15625a, 0)));
    }

    @Override // Xf.w
    public final kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b element) {
        AbstractC3340k.e(element, "element");
        F f10 = Xf.j.f16280a;
        kotlinx.serialization.json.c cVar = element instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) element : null;
        if (cVar == null) {
            Xf.j.c("JsonObject", element);
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : cVar.f39780a.entrySet()) {
            if (!AbstractC3340k.a((String) entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }
}
