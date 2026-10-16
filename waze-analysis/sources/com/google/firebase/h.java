package com.google.firebase;

import com.google.android.gms.common.api.internal.av;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        av.l(str, "Detail message must not be empty");
    }

    @Deprecated
    protected h() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th) {
        super(str, th);
        av.l(str, "Detail message must not be empty");
    }
}
