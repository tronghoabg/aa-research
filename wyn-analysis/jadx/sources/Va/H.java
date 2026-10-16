package Va;

import android.accounts.Account;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: j, reason: collision with root package name */
    public static int f13391j = 0;
    public static int k = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f13392a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13393b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13394c;

    /* renamed from: d, reason: collision with root package name */
    public String f13395d;

    /* renamed from: e, reason: collision with root package name */
    public String f13396e;

    /* renamed from: f, reason: collision with root package name */
    public String f13397f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f13398g;

    /* renamed from: h, reason: collision with root package name */
    public Object f13399h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractMap f13400i;

    public H(GoogleSignInOptions googleSignInOptions) {
        this.f13398g = new HashSet();
        this.f13400i = new HashMap();
        AbstractC1732v.i(googleSignInOptions);
        this.f13398g = new HashSet(googleSignInOptions.f26399b);
        this.f13392a = googleSignInOptions.f26402e;
        this.f13393b = googleSignInOptions.f26403f;
        this.f13394c = googleSignInOptions.f26401d;
        this.f13395d = googleSignInOptions.f26404g;
        this.f13399h = googleSignInOptions.f26400c;
        this.f13396e = googleSignInOptions.f26405h;
        this.f13400i = GoogleSignInOptions.X(googleSignInOptions.f26406i);
        this.f13397f = googleSignInOptions.f26407j;
    }

    public GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.f26396p;
        HashSet hashSet = (HashSet) this.f13398g;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f26395o;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.f13394c && (((Account) this.f13399h) == null || !hashSet.isEmpty())) {
            ((HashSet) this.f13398g).add(GoogleSignInOptions.f26394n);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f13399h, this.f13394c, this.f13392a, this.f13393b, this.f13395d, this.f13396e, (HashMap) this.f13400i, this.f13397f);
    }

    public ConcurrentHashMap b() {
        int i5 = (k + 53) % 128;
        f13391j = i5;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13400i;
        k = (i5 + 41) % 128;
        return concurrentHashMap;
    }

    public synchronized String c() {
        int i5 = f13391j;
        String str = this.f13396e;
        int i10 = i5 + 37;
        k = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        int i11 = 82 / 0;
        return str;
    }

    public void d(boolean z2) {
        int i5 = k;
        int i10 = i5 + 65;
        f13391j = i10 % 128;
        int i11 = i10 % 2;
        this.f13392a = z2;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i5 + 105;
        f13391j = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public H(int i5) {
        String str;
        switch (i5) {
            case 1:
                this.f13398g = new HashSet();
                this.f13400i = new HashMap();
                return;
            default:
                this.f13395d = "";
                int i10 = 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i11 = 234 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                int iAlpha = 6 - Color.alpha(0);
                char[] charArray = "\ufff4\u0002\u000e\u0003\ufffe�\u0003".toCharArray();
                synchronized (Ab.f13221x) {
                    try {
                        char[] cArr = new char[i10];
                        Ab.f13219v = 0;
                        while (true) {
                            int i12 = Ab.f13219v;
                            if (i12 < i10) {
                                char c10 = (char) (charArray[i12] + i11);
                                cArr[i12] = c10;
                                cArr[i12] = (char) (c10 - 153);
                                Ab.f13219v = i12 + 1;
                            } else {
                                if (iAlpha > 0) {
                                    Ab.f13220w = iAlpha;
                                    char[] cArr2 = new char[i10];
                                    System.arraycopy(cArr, 0, cArr2, 0, i10);
                                    int i13 = Ab.f13220w;
                                    System.arraycopy(cArr2, 0, cArr, i10 - i13, i13);
                                    int i14 = Ab.f13220w;
                                    System.arraycopy(cArr2, i14, cArr, 0, i10 - i14);
                                }
                                char[] cArr3 = new char[i10];
                                Ab.f13219v = 0;
                                while (true) {
                                    int i15 = Ab.f13219v;
                                    if (i15 < i10) {
                                        cArr3[i15] = cArr[(i10 - i15) - 1];
                                        Ab.f13219v = i15 + 1;
                                    } else {
                                        str = new String(cArr3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f13396e = str.intern();
                this.f13392a = true;
                this.f13397f = "";
                this.f13393b = false;
                this.f13400i = new ConcurrentHashMap();
                this.f13394c = false;
                this.f13398g = "";
                return;
        }
    }
}
