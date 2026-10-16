package Wa;

import Ef.H;
import Ef.S;
import G5.RunnableC0534o;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4271h;
import uc.InterfaceC4283t;

/* loaded from: classes4.dex */
public final class b implements InterfaceC4283t {

    /* renamed from: j, reason: collision with root package name */
    public static final int f15420j = (e.class.hashCode() + 43) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    public static final int k = (e.class.hashCode() + 83) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f15421a;

    /* renamed from: b, reason: collision with root package name */
    public h f15422b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15423c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15424d;

    /* renamed from: e, reason: collision with root package name */
    public String f15425e;

    /* renamed from: f, reason: collision with root package name */
    public int f15426f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f15427g;

    /* renamed from: h, reason: collision with root package name */
    public C4271h f15428h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f15429i;

    public b(Activity activity) {
        AbstractC3340k.e(activity, "activity");
        this.f15421a = activity;
        this.f15422b = null;
    }

    public final void a(boolean z2) {
        if (this.f15428h == null || AbstractC3340k.a(this.f15425e, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0534o(2, this, z2));
    }

    public final void b(String str, String str2) {
        a(false);
        h hVar = this.f15422b;
        if (hVar != null) {
            hVar.b(str, str2, null);
        }
        this.f15422b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Wa.h] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.io.Serializable r12) {
        /*
            r11 = this;
            r0 = 0
            r11.a(r0)
            Wa.h r1 = r11.f15422b
            if (r1 == 0) goto L93
            r2 = 0
            if (r12 == 0) goto L14
            boolean r3 = r12 instanceof java.lang.String
            if (r3 == 0) goto L11
            r3 = r12
            goto L12
        L11:
            r3 = r2
        L12:
            if (r3 != 0) goto L8e
        L14:
            boolean r3 = r12 instanceof java.util.ArrayList
            if (r3 == 0) goto L1b
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            goto L1c
        L1b:
            r12 = r2
        L1c:
            if (r12 == 0) goto L8d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        L27:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r12.next()
            boolean r5 = r4 instanceof Wa.a
            if (r5 == 0) goto L38
            Wa.a r4 = (Wa.a) r4
            goto L39
        L38:
            r4 = r2
        L39:
            if (r4 == 0) goto L86
            ef.k r5 = new ef.k
            java.lang.String r6 = "path"
            java.lang.String r7 = r4.f15415a
            r5.<init>(r6, r7)
            ef.k r6 = new ef.k
            java.lang.String r7 = "name"
            java.lang.String r8 = r4.f15416b
            r6.<init>(r7, r8)
            ef.k r7 = new ef.k
            long r8 = r4.f15418d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "size"
            r7.<init>(r9, r8)
            ef.k r8 = new ef.k
            java.lang.String r9 = "bytes"
            byte[] r10 = r4.f15419e
            r8.<init>(r9, r10)
            ef.k r9 = new ef.k
            android.net.Uri r4 = r4.f15417c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r10 = "identifier"
            r9.<init>(r10, r4)
            r4 = 5
            ef.k[] r4 = new ef.C2527k[r4]
            r4[r0] = r5
            r5 = 1
            r4[r5] = r6
            r5 = 2
            r4[r5] = r7
            r5 = 3
            r4[r5] = r8
            r5 = 4
            r4[r5] = r9
            java.util.HashMap r4 = ff.AbstractC2640A.Q(r4)
            goto L87
        L86:
            r4 = r2
        L87:
            if (r4 == 0) goto L27
            r3.add(r4)
            goto L27
        L8d:
            r3 = r2
        L8e:
            r1.a(r3)
            r11.f15422b = r2
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wa.b.c(java.io.Serializable):void");
    }

    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) throws IOException {
        int i11 = k;
        Activity activity = this.f15421a;
        if (i5 == i11) {
            if (i10 == -1) {
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    a(true);
                    try {
                        byte[] bArr = this.f15429i;
                        AbstractC3340k.e(activity, "context");
                        OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(data);
                        if (outputStreamOpenOutputStream != null) {
                            if (bArr != null) {
                                try {
                                    outputStreamOpenOutputStream.write(bArr);
                                } finally {
                                }
                            }
                            outputStreamOpenOutputStream.close();
                        }
                        c(data.getPath());
                        return true;
                    } catch (IOException e7) {
                        Log.e("FilePickerDelegate", "Error while saving file", e7);
                        b("Error while saving file", e7.getMessage());
                    }
                }
                return false;
            }
            if (i10 == 0) {
                c(null);
                return false;
            }
        } else {
            if (i5 != f15420j) {
                b("unknown_activity", "Unknown activity error, please file an issue.");
                return false;
            }
            if (i10 == -1) {
                a(true);
                int i12 = this.f15426f;
                boolean z2 = this.f15424d;
                String str = this.f15425e;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                AbstractC3340k.e(activity, "activity");
                Lf.e eVar = S.f3698a;
                H.D(H.c(Lf.d.f7120b), null, new f(intent, this, activity, i12, z2, str2, null), 3);
                return true;
            }
            if (i10 == 0) {
                c(null);
                return true;
            }
        }
        return false;
    }
}
