package U1;

import N1.C0765n;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* renamed from: U1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840j extends N1.E {

    /* renamed from: c, reason: collision with root package name */
    public final int f12083c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12084d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12085e;

    /* renamed from: f, reason: collision with root package name */
    public final C0765n f12086f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12087g;

    /* renamed from: h, reason: collision with root package name */
    public final k2.H f12088h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12089i;

    static {
        N0.a.k(1001, BackupConstant.SCENE_BACKUP_RENDER_FAIL, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, 1004, WebSocketProtocol.CLOSE_NO_STATUS_CODE);
        Q1.x.E(1006);
    }

    public C0840j(int i5, Exception exc, int i10) {
        this(i5, exc, i10, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840j(String str, Throwable th, int i5, int i10, String str2, int i11, C0765n c0765n, int i12, k2.H h10, long j8, boolean z2) {
        super(i5, j8, th, str);
        Bundle bundle = Bundle.EMPTY;
        Q1.k.c(!z2 || i10 == 1);
        Q1.k.c(th != null || i10 == 3);
        this.f12083c = i10;
        this.f12084d = str2;
        this.f12085e = i11;
        this.f12086f = c0765n;
        this.f12087g = i12;
        this.f12088h = h10;
        this.f12089i = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0840j(int i5, Exception exc, int i10, String str, int i11, C0765n c0765n, int i12, boolean z2) {
        String str2;
        int i13;
        C0765n c0765n2;
        String string;
        String str3;
        if (i5 == 0) {
            str2 = str;
            i13 = i11;
            c0765n2 = c0765n;
            string = "Source error";
        } else if (i5 != 1) {
            if (i5 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i13 = i11;
            c0765n2 = c0765n;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            c0765n2 = c0765n;
            sb2.append(c0765n2);
            sb2.append(", format_supported=");
            int i14 = Q1.x.f9724a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : N0.a.f(string, ": null"), exc, i10, i5, str2, i13, c0765n2, i12, null, SystemClock.elapsedRealtime(), z2);
    }
}
