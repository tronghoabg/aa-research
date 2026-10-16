package com.google.b.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f7003a;

    h(int i2) {
        this.f7003a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (this.f7003a != 0) {
            if (i2 == 1) {
                return g.INTERNAL;
            }
            if (i2 == 2) {
                return g.EXTERNAL;
            }
            if (i2 != 3) {
                return null;
            }
            return g.NO_OP;
        }
        if (i2 == 0) {
            return i.NONE;
        }
        if (i2 == 1) {
            return i.GROUP_ID;
        }
        if (i2 != 2) {
            return null;
        }
        return i.GMAIL_RULE_KEY;
    }
}
