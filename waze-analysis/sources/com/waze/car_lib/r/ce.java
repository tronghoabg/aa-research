package com.waze.car_lib.r;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ce {

    /* renamed from: a, reason: collision with root package name */
    private final int f21187a;

    /* renamed from: b, reason: collision with root package name */
    private final SpannableStringBuilder f21188b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21189c;

    /* renamed from: d, reason: collision with root package name */
    private final Bitmap f21190d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f21191e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection f21192f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f21193g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.n.aq f21194h;

    public ce(int i2, com.waze.n.aq aqVar, SpannableStringBuilder spannableStringBuilder, String str, Bitmap bitmap, Integer num, Collection collection, Long l2) {
        h.g.b.x.f(spannableStringBuilder, "instructionSpan");
        h.g.b.x.f(collection, "exitSigns");
        this.f21187a = i2;
        this.f21194h = aqVar;
        this.f21188b = spannableStringBuilder;
        this.f21189c = str;
        this.f21190d = bitmap;
        this.f21191e = num;
        this.f21192f = collection;
        this.f21193g = l2;
    }

    public final int a() {
        return this.f21187a;
    }

    public final Bitmap b() {
        return this.f21190d;
    }

    public final SpannableStringBuilder c() {
        return this.f21188b;
    }

    public final Integer d() {
        return this.f21191e;
    }

    public final Long e() {
        return this.f21193g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        return this.f21187a == ceVar.f21187a && h.g.b.x.n(this.f21194h, ceVar.f21194h) && h.g.b.x.n(this.f21188b, ceVar.f21188b) && h.g.b.x.n(this.f21189c, ceVar.f21189c) && h.g.b.x.n(this.f21190d, ceVar.f21190d) && h.g.b.x.n(this.f21191e, ceVar.f21191e) && h.g.b.x.n(this.f21192f, ceVar.f21192f) && h.g.b.x.n(this.f21193g, ceVar.f21193g);
    }

    public final String f() {
        return this.f21189c;
    }

    public final Collection g() {
        return this.f21192f;
    }

    public final com.waze.n.aq h() {
        return this.f21194h;
    }

    public final int hashCode() {
        com.waze.n.aq aqVar = this.f21194h;
        int iHashCode = (((this.f21187a * 31) + (aqVar == null ? 0 : aqVar.hashCode())) * 31) + this.f21188b.hashCode();
        String str = this.f21189c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.f21190d;
        int iHashCode3 = (iHashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Integer num = this.f21191e;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.f21192f.hashCode()) * 31;
        Long l2 = this.f21193g;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "InstructionState(maneuver=" + this.f21187a + ", instruction=" + this.f21194h + ", instructionSpan=" + ((Object) this.f21188b) + ", roadName=" + this.f21189c + ", lanesBitmap=" + this.f21190d + ", roundaboutExitNumber=" + this.f21191e + ", exitSigns=" + this.f21192f + ", etaSeconds=" + this.f21193g + ")";
    }
}
