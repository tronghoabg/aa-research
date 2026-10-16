package com.google.d.c;

import java.util.AbstractMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bh extends AbstractMap.SimpleImmutableEntry {
    private static final long serialVersionUID = 0;

    private bh(Object obj, Object obj2, bf bfVar) {
        super(obj, obj2);
        com.google.d.b.an.B(bfVar);
    }

    public static bh a(Object obj, Object obj2, bf bfVar) {
        return new bh(obj, obj2, bfVar);
    }
}
