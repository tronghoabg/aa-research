package okhttp3.internal.d;

import h.g.b.x;
import okhttp3.aj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final aj f56075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56077c;

    public j(aj ajVar, int i2, String str) {
        x.f(ajVar, "protocol");
        x.f(str, "message");
        this.f56075a = ajVar;
        this.f56076b = i2;
        this.f56077c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f56075a == aj.f55873a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f56076b);
        sb.append(' ');
        sb.append(this.f56077c);
        return sb.toString();
    }
}
