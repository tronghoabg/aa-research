package com.google.e.a.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.d.b.v;
import com.google.e.a.g;
import com.google.e.a.n;
import h.g.b.x;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f8393a;

    /* renamed from: b, reason: collision with root package name */
    private String f8394b;

    /* renamed from: c, reason: collision with root package name */
    private String f8395c;

    /* renamed from: d, reason: collision with root package name */
    private Object f8396d;

    /* renamed from: e, reason: collision with root package name */
    private Object f8397e;

    /* renamed from: f, reason: collision with root package name */
    private Object f8398f;

    /* renamed from: g, reason: collision with root package name */
    private Object f8399g;

    public a() {
        this.f8396d = null;
        this.f8393a = null;
        this.f8394b = null;
        this.f8395c = null;
        this.f8397e = null;
        this.f8398f = null;
    }

    static /* bridge */ /* synthetic */ Context a(a aVar) {
        return (Context) aVar.f8396d;
    }

    static /* bridge */ /* synthetic */ g p(a aVar) {
        return (g) aVar.f8399g;
    }

    private final com.google.e.a.a q() throws KeyStoreException {
        int i2 = b.f8400a;
        f fVar = new f();
        try {
            boolean zC = f.c(this.f8395c);
            try {
                return fVar.a(this.f8395c);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!zC) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f8395c), e2);
                }
                Log.w(b.f8402c, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e3) {
            Log.w(b.f8402c, "cannot use Android Keystore, it'll be disabled", e3);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.e.a.a, java.lang.Object] */
    private final g r(byte[] bArr) {
        try {
            this.f8397e = new f().a(this.f8395c);
            try {
                return g.c(n.j(com.google.android.libraries.phenotype.client.a.d(bArr), this.f8397e, new byte[0]));
            } catch (IOException | GeneralSecurityException e2) {
                try {
                    return s(bArr);
                } catch (IOException unused) {
                    throw e2;
                }
            }
        } catch (GeneralSecurityException | ProviderException e3) {
            try {
                g gVarS = s(bArr);
                Log.w(b.f8402c, "cannot use Android Keystore, it'll be disabled", e3);
                return gVarS;
            } catch (IOException unused2) {
                throw e3;
            }
        }
    }

    private static final g s(byte[] bArr) {
        return g.c(com.google.e.a.e.b(com.google.android.libraries.phenotype.client.a.d(bArr)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.e.a.a, java.lang.Object] */
    public final synchronized b b() {
        b bVar;
        if (this.f8393a == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        synchronized (b.f8401b) {
            Object obj = this.f8396d;
            String str = this.f8393a;
            String str2 = this.f8394b;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = ((Context) obj).getApplicationContext();
            SharedPreferences defaultSharedPreferences = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            byte[] bArrC = null;
            try {
                String string = defaultSharedPreferences.getString(str, null);
                if (string != null) {
                    bArrC = com.google.e.a.f.a.e.c(string);
                }
                String str3 = this.f8395c;
                if (bArrC == null) {
                    if (str3 != null) {
                        this.f8397e = q();
                    }
                    Object obj2 = this.f8398f;
                    if (obj2 == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    n nVarG = n.g((g) obj2);
                    v vVar = new v((Context) this.f8396d, this.f8393a, this.f8394b);
                    ?? r3 = this.f8397e;
                    try {
                        if (r3 != 0) {
                            nVarG.k(vVar, r3, new byte[0]);
                        } else {
                            com.google.e.a.e.c(nVarG, vVar);
                        }
                        this.f8399g = g.c(nVarG);
                    } catch (IOException e2) {
                        throw new GeneralSecurityException(e2);
                    }
                } else if (str3 != null) {
                    this.f8399g = r(bArrC);
                } else {
                    this.f8399g = s(bArrC);
                }
                bVar = new b(this);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }
        return bVar;
    }

    public final void e(g gVar) {
        this.f8398f = gVar;
    }

    public final void f(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.f8395c = str;
    }

    public final void g(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        if (str == null) {
            throw new IllegalArgumentException("need a keyset name");
        }
        this.f8396d = context;
        this.f8393a = str;
        this.f8394b = str2;
    }

    public final com.google.android.libraries.c.a.d h() {
        String str = this.f8393a;
        String str2 = this.f8395c;
        Object obj = this.f8397e;
        Object obj2 = this.f8398f;
        Object obj3 = this.f8399g;
        return new com.google.android.libraries.c.a.d(str, str2, (String) obj, (String) obj2, (String) obj3, (Uri) this.f8396d, this.f8394b);
    }

    public final void i(String str) {
        this.f8397e = str;
    }

    public final void j(String str) {
        this.f8398f = str;
    }

    public final void k(String str) {
        this.f8399g = str;
    }

    public final void l(String str) {
        x.f(str, TtmlNode.ATTR_ID);
        this.f8393a = str;
    }

    public final void m(String str) {
        x.f(str, "idToken");
        this.f8395c = str;
    }

    public final void n(String str) {
        this.f8394b = str;
    }

    public final void o(Uri uri) {
        this.f8396d = uri;
    }

    public a(byte[] bArr) {
        this.f8393a = "";
        this.f8395c = "";
    }
}
