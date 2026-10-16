package com.ironsource.adqualitysdk.sdk;

import Va.Ab;
import Va.AbstractC1104pb;
import Va.B;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualityConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f28251a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28252b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28253c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28254d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f28255e;

    /* renamed from: f, reason: collision with root package name */
    public final ISAdQualityLogLevel f28256f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28257g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28258h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f28259i;

    /* renamed from: j, reason: collision with root package name */
    public final ISAdQualityDeviceIdType f28260j;
    public final HashMap k;

    public ISAdQualityConfig(String str, boolean z2, boolean z10, boolean z11, ISAdQualityLogLevel iSAdQualityLogLevel, HashSet hashSet, String str2, boolean z12, boolean z13, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, HashMap map) {
        this.f28251a = str;
        this.f28252b = z2;
        this.f28253c = z10;
        this.f28254d = z11;
        this.f28256f = iSAdQualityLogLevel;
        this.f28255e = hashSet;
        this.f28257g = str2;
        this.f28258h = z12;
        this.f28259i = z13;
        this.f28260j = iSAdQualityDeviceIdType;
        this.k = map;
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f28252b) {
            builder.setUserId(iSAdQualityConfig.f28251a);
        } else if (iSAdQualityConfig2.f28252b) {
            builder.setUserId(iSAdQualityConfig2.f28251a);
        }
        if (iSAdQualityConfig.f28254d) {
            builder.setTestMode(iSAdQualityConfig.f28253c);
        } else if (iSAdQualityConfig2.f28254d) {
            builder.setTestMode(iSAdQualityConfig2.f28253c);
        }
        if (iSAdQualityConfig.f28259i) {
            builder.setCoppa(iSAdQualityConfig.f28258h);
        } else if (iSAdQualityConfig2.f28259i) {
            builder.setCoppa(iSAdQualityConfig2.f28258h);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f28256f;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f28256f;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator it = iSAdQualityConfig.f28255e.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it.next());
        }
        Iterator it2 = iSAdQualityConfig2.f28255e.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it2.next());
        }
        String str = iSAdQualityConfig.f28257g;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f28257g;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f28260j;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f28260j;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.k);
        map.putAll(iSAdQualityConfig.k);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f28255e;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f28258h;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f28260j;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f28257g;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f28256f;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.k;
    }

    @Deprecated
    public String getUserId() {
        return this.f28251a;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f28253c;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f28252b;
    }

    @Deprecated
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f28261a = null;

        /* renamed from: b, reason: collision with root package name */
        public boolean f28262b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f28263c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28264d = false;

        /* renamed from: e, reason: collision with root package name */
        public ISAdQualityLogLevel f28265e = ISAdQualityLogLevel.INFO;

        /* renamed from: f, reason: collision with root package name */
        public final HashSet f28266f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        public String f28267g = null;

        /* renamed from: h, reason: collision with root package name */
        public boolean f28268h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f28269i = false;

        /* renamed from: j, reason: collision with root package name */
        public ISAdQualityDeviceIdType f28270j = ISAdQualityDeviceIdType.NONE;
        public final HashMap k = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f28266f.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f28261a, this.f28262b, this.f28263c, this.f28264d, this.f28265e, this.f28266f, this.f28267g, this.f28268h, this.f28269i, this.f28270j, this.k);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f28266f.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setCoppa(boolean z2) {
            this.f28268h = z2;
            this.f28269i = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f28270j = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (AbstractC1104pb.N(20, str)) {
                this.f28267g = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
            sb2.append(str);
            sb2.append(" ) init source must have length of 1-20");
            Ab.k("ISAdQualityConfig", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f28265e = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) throws JSONException {
            if (jSONObject != null) {
                for (int i5 = 0; i5 < jSONObject.names().length(); i5++) {
                    try {
                        String string = jSONObject.names().getString(i5);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            Ab.k("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z2) {
            this.f28263c = z2;
            this.f28264d = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f28261a = str;
            this.f28262b = true;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    boolean zA = B.a(str);
                    HashMap map = this.k;
                    if (!zA) {
                        if (B.d(map, str)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            Ab.k("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                        if (!B.c(str, str2)) {
                            StringBuilder sb3 = new StringBuilder("setMetaData( ");
                            sb3.append(str);
                            sb3.append(" , ");
                            sb3.append(str2);
                            sb3.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            Ab.k("ISAdQualityConfig", sb3.toString());
                            return this;
                        }
                    }
                    map.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}
