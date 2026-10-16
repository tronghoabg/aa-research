package com.vungle.ads.internal.model;

import ff.AbstractC2641B;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public enum n2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);


    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f33266b;

    /* renamed from: a, reason: collision with root package name */
    public final int f33268a;

    static {
        n2[] n2VarArrValues = values();
        int iD = AbstractC2641B.D(n2VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD < 16 ? 16 : iD);
        for (n2 n2Var : n2VarArrValues) {
            linkedHashMap.put(Integer.valueOf(n2Var.f33268a), n2Var);
        }
        f33266b = linkedHashMap;
    }

    n2(int i5) {
        this.f33268a = i5;
    }
}
