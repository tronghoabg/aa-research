package com.waze.shared_infra.coordinators;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a extends Exception {
    private a(String str, List<? extends o<?, ?, ?>> list) {
        super(str + " : " + list);
    }

    public /* synthetic */ a(String str, List list, h.g.b.o oVar) {
        this(str, list);
    }
}
