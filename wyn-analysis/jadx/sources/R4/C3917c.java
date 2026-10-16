package r4;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.LinkedList;

/* renamed from: r4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3917c extends AbstractC3915a {

    /* renamed from: n, reason: collision with root package name */
    public final LinkedList f44345n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f44346o;

    public C3917c(String[] strArr) {
        super(strArr);
        this.f44345n = new LinkedList();
        this.f44346o = new Object();
    }

    @Override // r4.InterfaceC3922h
    public final boolean a() {
        return true;
    }

    @Override // r4.InterfaceC3922h
    public final boolean b() {
        return false;
    }

    @Override // r4.InterfaceC3922h
    public final boolean c() {
        return false;
    }

    public final LinkedList j() {
        LinkedList linkedList;
        synchronized (this.f44346o) {
            linkedList = this.f44345n;
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FFmpegSession{sessionId=");
        sb2.append(this.f44329a);
        sb2.append(", createTime=");
        sb2.append(this.f44330b);
        sb2.append(", startTime=");
        sb2.append(this.f44331c);
        sb2.append(", endTime=");
        sb2.append(this.f44332d);
        sb2.append(", arguments=");
        sb2.append(FFmpegKitConfig.a(this.f44333e));
        sb2.append(", logs=");
        sb2.append(g());
        sb2.append(", state=");
        sb2.append(pd.f.r(this.f44337i));
        sb2.append(", returnCode=");
        sb2.append(this.f44338j);
        sb2.append(", failStackTrace='");
        return wg.b.c(sb2, this.k, "'}");
    }
}
