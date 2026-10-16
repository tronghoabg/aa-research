package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.C1658q0;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class m6 extends j5 implements C1658q0.e {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f21931g;

    /* renamed from: h, reason: collision with root package name */
    private final C1658q0.e f21932h;

    /* renamed from: i, reason: collision with root package name */
    private e6.b f21933i;

    /* renamed from: j, reason: collision with root package name */
    private y4 f21934j;
    private y4 k;

    /* renamed from: l, reason: collision with root package name */
    protected C1658q0.b f21935l;

    public m6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i5, String str2, Object obj);

    public abstract void a(String str, Object obj, int i5);

    @Override // java.lang.Runnable
    public void run() {
        C1658q0 c1658q0W = b().w();
        if (!b().F0() && !b().C0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f21931g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f21931g.f()) || this.f21931g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Task has an invalid or null request endpoint.");
            }
            a(this.f21931g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f21931g.h())) {
                this.f21931g.b(this.f21931g.b() != null ? "POST" : "GET");
            }
            c1658q0W.a(this.f21931g, this.f21935l, this.f21932h);
        }
    }

    public class a implements C1658q0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f21936a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f21936a = kVar;
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, Object obj, int i5) {
            m6.this.f21931g.a(0);
            m6.this.a(str, obj, i5);
        }

        @Override // com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, Object obj) {
            long millis;
            boolean z2 = false;
            boolean z10 = i5 < 200 || i5 >= 500;
            boolean z11 = i5 == 429;
            boolean z12 = i5 != -1009 || m6.this.f21931g.q();
            boolean z13 = (i5 == -900 || i5 == -1000) ? false : true;
            if (z12 && z13 && (z10 || z11 || m6.this.f21931g.p())) {
                String strA = m6.this.f21931g.a();
                if (m6.this.f21931g.j() <= 0) {
                    if (strA != null && strA.equals(m6.this.f21931g.f())) {
                        m6 m6Var = m6.this;
                        m6Var.a(m6Var.k);
                    } else {
                        m6 m6Var2 = m6.this;
                        m6Var2.a(m6Var2.f21934j);
                    }
                    m6 m6Var3 = m6.this;
                    m6Var3.a(m6Var3.f21931g.f(), i5, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = m6.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    m6 m6Var4 = m6.this;
                    com.applovin.impl.sdk.o oVar2 = m6Var4.f21768c;
                    String str3 = m6Var4.f21767b;
                    StringBuilder sbL = pd.f.l(i5, "Unable to send request due to server failure (code ", "). ");
                    sbL.append(m6.this.f21931g.j());
                    sbL.append(" attempts left, retrying in ");
                    sbL.append(TimeUnit.MILLISECONDS.toSeconds(m6.this.f21931g.k()));
                    sbL.append(" seconds...");
                    oVar2.k(str3, sbL.toString());
                }
                int iJ = m6.this.f21931g.j() - 1;
                m6.this.f21931g.a(iJ);
                if (iJ == 0) {
                    m6 m6Var5 = m6.this;
                    m6Var5.a(m6Var5.f21934j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar3 = m6.this.f21768c;
                        if (com.applovin.impl.sdk.o.a()) {
                            m6 m6Var6 = m6.this;
                            m6Var6.f21768c.d(m6Var6.f21767b, "Switching to backup endpoint ".concat(strA));
                        }
                        m6.this.f21931g.a(strA);
                        z2 = true;
                    }
                }
                if (((Boolean) this.f21936a.a(y4.f23842l3)).booleanValue() && z2) {
                    millis = 0;
                } else {
                    millis = m6.this.f21931g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, m6.this.f21931g.c())) : m6.this.f21931g.k();
                }
                e6 e6VarR0 = this.f21936a.r0();
                m6 m6Var7 = m6.this;
                e6VarR0.a(m6Var7, m6Var7.f21933i, millis);
                return;
            }
            m6 m6Var8 = m6.this;
            m6Var8.a(m6Var8.f21931g.f(), i5, str2, obj);
        }
    }

    public m6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z2) {
        super("TaskRepeatRequest", kVar, z2);
        this.f21933i = e6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f21931g = aVar;
        this.f21935l = new C1658q0.b();
        this.f21932h = new a(kVar);
    }

    public void b(y4 y4Var) {
        this.k = y4Var;
    }

    public void c(y4 y4Var) {
        this.f21934j = y4Var;
    }

    public void a(e6.b bVar) {
        this.f21933i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y4 y4Var) {
        if (y4Var != null) {
            b().p0().a(y4Var, y4Var.a());
        }
    }
}
