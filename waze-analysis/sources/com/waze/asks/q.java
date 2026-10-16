package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f15631a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15633c;

    public q(String str, String str2, String str3) {
        h.g.b.x.f(str, "entityId");
        h.g.b.x.f(str2, "questionKey");
        h.g.b.x.f(str3, "answerKey");
        this.f15631a = str;
        this.f15632b = str2;
        this.f15633c = str3;
    }

    public final String a() {
        return this.f15633c;
    }

    public final String b() {
        return this.f15631a;
    }

    public final String c() {
        return this.f15632b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(this.f15631a, qVar.f15631a) && h.g.b.x.n(this.f15632b, qVar.f15632b) && h.g.b.x.n(this.f15633c, qVar.f15633c);
    }

    public final int hashCode() {
        return (((this.f15631a.hashCode() * 31) + this.f15632b.hashCode()) * 31) + this.f15633c.hashCode();
    }

    public final String toString() {
        return "AnswerQuestionRequest(entityId=" + this.f15631a + ", questionKey=" + this.f15632b + ", answerKey=" + this.f15633c + ")";
    }
}
