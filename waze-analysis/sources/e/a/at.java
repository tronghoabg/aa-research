package e.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public final String f46284a;

    /* renamed from: b, reason: collision with root package name */
    public final as f46285b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46286c;

    /* renamed from: d, reason: collision with root package name */
    public final be f46287d;

    /* renamed from: e, reason: collision with root package name */
    public final be f46288e;

    /* synthetic */ at(String str, as asVar, long j2, be beVar) {
        this.f46284a = str;
        com.google.d.b.an.C(asVar, "severity");
        this.f46285b = asVar;
        this.f46286c = j2;
        this.f46287d = null;
        this.f46288e = beVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof at) {
            at atVar = (at) obj;
            if (Objects.equals(this.f46284a, atVar.f46284a) && Objects.equals(this.f46285b, atVar.f46285b) && this.f46286c == atVar.f46286c) {
                be beVar = atVar.f46287d;
                if (Objects.equals(null, null) && Objects.equals(this.f46288e, atVar.f46288e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46284a, this.f46285b, Long.valueOf(this.f46286c), null, this.f46288e);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("description", this.f46284a);
        zVarH.d("severity", this.f46285b);
        zVarH.c("timestampNanos", this.f46286c);
        zVarH.d("channelRef", null);
        zVarH.d("subchannelRef", this.f46288e);
        return zVarH.toString();
    }
}
