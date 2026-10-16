package com.waze.ui.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f42006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f42006a = str;
    }

    public final String a() {
        return this.f42006a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f42006a, ((ai) obj).f42006a);
    }

    public final int hashCode() {
        return this.f42006a.hashCode();
    }

    public final String toString() {
        return "PassNeeded(name=" + this.f42006a + ")";
    }
}
