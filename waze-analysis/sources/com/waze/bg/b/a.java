package com.waze.bg.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setAnswerKey(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((b) this.instance).setEntityId(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((b) this.instance).setQuestionKey(str);
    }

    private a() {
        throw null;
    }
}
