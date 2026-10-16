package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.v4;
import com.applovin.impl.y4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f23225s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23226t;

    public static class a extends a.C0023a {

        /* renamed from: r, reason: collision with root package name */
        private String f23227r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f23228s;

        public a(k kVar) {
            super(kVar);
            this.f23177h = ((Integer) kVar.a(y4.f23645M2)).intValue();
            this.f23178i = ((Integer) kVar.a(y4.f23637L2)).intValue();
            this.f23179j = ((Integer) kVar.a(y4.f23730X2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f23172c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i5) {
            this.f23179j = i5;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f23171b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f23170a = str;
            return this;
        }

        public a h(boolean z2) {
            this.f23228s = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z2) {
            this.f23184p = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f23173d = map;
            return this;
        }

        public a e(String str) {
            this.f23227r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i5) {
            this.f23178i = i5;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z2) {
            this.f23182n = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f23174e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i5) {
            this.f23177h = i5;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f23175f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f23176g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(v4.a aVar) {
            this.f23185q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0023a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f23225s = aVar.f23227r;
        this.f23226t = aVar.f23228s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f23225s;
    }

    public boolean t() {
        return this.f23225s != null;
    }

    public boolean u() {
        return this.f23226t;
    }
}
