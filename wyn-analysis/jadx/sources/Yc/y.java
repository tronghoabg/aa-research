package yc;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public EnumC4571A f48190a;

    /* renamed from: b, reason: collision with root package name */
    public Long f48191b;

    /* renamed from: c, reason: collision with root package name */
    public Long f48192c;

    /* renamed from: d, reason: collision with root package name */
    public Long f48193d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f48194e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f48190a.equals(yVar.f48190a) && Objects.equals(this.f48191b, yVar.f48191b) && Objects.equals(this.f48192c, yVar.f48192c) && Objects.equals(this.f48193d, yVar.f48193d) && this.f48194e.equals(yVar.f48194e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48190a, this.f48191b, this.f48192c, this.f48193d, this.f48194e);
    }
}
