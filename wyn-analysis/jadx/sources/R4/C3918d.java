package r4;

import com.arthenica.ffmpegkit.FFmpegKitConfig;

/* renamed from: r4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3918d extends AbstractC3915a {
    @Override // r4.InterfaceC3922h
    public final boolean a() {
        return false;
    }

    @Override // r4.InterfaceC3922h
    public final boolean b() {
        return true;
    }

    @Override // r4.InterfaceC3922h
    public final boolean c() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FFprobeSession{sessionId=");
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
