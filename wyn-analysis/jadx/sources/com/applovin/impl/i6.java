package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f21737g;

    /* renamed from: h, reason: collision with root package name */
    private final a f21738h;

    public static final class a extends t7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f23304b.add(q8Var);
        }
    }

    public static final class b extends i6 {

        /* renamed from: i, reason: collision with root package name */
        private final String f21739i;

        public b(String str, t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(t7Var, appLovinAdLoadListener, kVar);
            this.f21739i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q8 q8VarB = b(this.f21739i);
            if (q8VarB != null) {
                a(q8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to process XML: " + this.f21739i);
            }
            c(this.f21739i);
            a(u7.XML_PARSING);
        }
    }

    public static final class c extends i6 {

        /* renamed from: i, reason: collision with root package name */
        private final JSONObject f21740i;

        public c(t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(t7Var, appLovinAdLoadListener, kVar);
            this.f21740i = t7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f21740i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "No VAST response received.");
                }
                a(u7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f21766a.a(y4.f23677Q4)).intValue()) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21768c.b(this.f21767b, "VAST response is over max length");
                    }
                    a(u7.XML_PARSING);
                    return;
                }
                q8 q8VarB = b(string);
                if (q8VarB != null) {
                    a(q8VarB);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Unable to process XML: ".concat(string));
                }
                c(string);
                a(u7.XML_PARSING);
            }
        }
    }

    public static final class d extends i6 {

        /* renamed from: i, reason: collision with root package name */
        private final q8 f21741i;

        public d(q8 q8Var, t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(t7Var, appLovinAdLoadListener, kVar);
            if (q8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (t7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f21741i = q8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Processing VAST Wrapper response...");
            }
            a(this.f21741i);
        }
    }

    public i6(t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (t7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f21737g = appLovinAdLoadListener;
        this.f21738h = (a) t7Var;
    }

    public static i6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public q8 b(String str) {
        try {
            return r8.a(str, this.f21766a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Failed to process VAST response", th);
            }
            a(u7.XML_PARSING);
            this.f21766a.D().a(this.f21767b, th);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f21766a.a(y4.f23828j5)), 1).iterator();
        while (it.hasNext()) {
            q8 q8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (q8VarB != null) {
                this.f21738h.a(q8VarB);
            }
        }
    }

    public static i6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static i6 a(q8 q8Var, t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(q8Var, t7Var, appLovinAdLoadListener, kVar);
    }

    public void a(q8 q8Var) {
        int iD = this.f21738h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finished parsing XML at depth " + iD);
        }
        this.f21738h.a(q8Var);
        if (b8.b(q8Var)) {
            int iIntValue = ((Integer) this.f21766a.a(y4.f23685R4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.a(this.f21767b, "VAST response is wrapper. Resolving...");
                }
                this.f21766a.r0().a(new q6(this.f21738h, this.f21737g, this.f21766a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(u7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (b8.a(q8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "VAST response is inline. Rendering ad...");
            }
            this.f21766a.r0().a(new l6(this.f21738h, this.f21737g, this.f21766a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "VAST response is an error");
        }
        a(u7.NO_WRAPPER_RESPONSE);
    }

    public void a(u7 u7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Failed to process VAST response due to VAST error code " + u7Var);
        }
        b8.a(this.f21738h, this.f21737g, u7Var, -6, this.f21766a);
    }
}
