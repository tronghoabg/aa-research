package e.a.d;

import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    private final String f47231a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f47232b;

    public jk(String str, Map map) {
        com.google.d.b.an.C(str, "policyName");
        this.f47231a = str;
        com.google.d.b.an.C(map, "rawConfigValue");
        this.f47232b = map;
    }

    public final String a() {
        return this.f47231a;
    }

    public final Map b() {
        return this.f47232b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jk) {
            jk jkVar = (jk) obj;
            if (this.f47231a.equals(jkVar.f47231a) && this.f47232b.equals(jkVar.f47232b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47231a, this.f47232b);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("policyName", this.f47231a);
        zVarH.d("rawConfigValue", this.f47232b);
        return zVarH.toString();
    }
}
