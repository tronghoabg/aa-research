package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();

    /* renamed from: a, reason: collision with root package name */
    public final String f33304a;

    /* renamed from: b, reason: collision with root package name */
    public String f33305b;

    public /* synthetic */ r3(int i5, String str, String str2) {
        if (1 != (i5 & 1)) {
            AbstractC1240b0.k(i5, 1, p3.f33292a.getDescriptor());
            throw null;
        }
        this.f33304a = str;
        if ((i5 & 2) == 0) {
            this.f33305b = "";
        } else {
            this.f33305b = str2;
        }
    }

    public static final void a(r3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33304a);
        if (!output.A(serialDesc, 1) && AbstractC3340k.a(self.f33305b, "")) {
            return;
        }
        output.y(serialDesc, 1, self.f33305b);
    }

    public final boolean equals(Object obj) {
        if (obj != null && r3.class.equals(obj.getClass())) {
            r3 r3Var = (r3) obj;
            if (AbstractC3340k.a(this.f33304a, r3Var.f33304a) && AbstractC3340k.a(this.f33305b, r3Var.f33305b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33305b.hashCode() + (this.f33304a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("UnclosedAd(eventId=");
        sbA.append(this.f33304a);
        sbA.append(", sessionId=");
        return AbstractC0279p0.n(sbA, this.f33305b, ')');
    }

    public r3(String eventId, String sessionId) {
        AbstractC3340k.e(eventId, "eventId");
        AbstractC3340k.e(sessionId, "sessionId");
        this.f33304a = eventId;
        this.f33305b = sessionId;
    }

    public final void a(String str) {
        AbstractC3340k.e(str, "<set-?>");
        this.f33305b = str;
    }

    public /* synthetic */ r3(String str) {
        this(str, "");
    }
}
