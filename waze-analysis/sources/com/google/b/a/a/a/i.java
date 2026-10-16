package com.google.b.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum i implements eg {
    NONE(0),
    GROUP_ID(1),
    GMAIL_RULE_KEY(2);


    /* renamed from: d, reason: collision with root package name */
    private static final eh f7007d = new h(0);

    /* renamed from: f, reason: collision with root package name */
    private final int f7009f;

    i(int i2) {
        this.f7009f = i2;
    }

    public static eh a() {
        return f7007d;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7009f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7009f);
    }
}
