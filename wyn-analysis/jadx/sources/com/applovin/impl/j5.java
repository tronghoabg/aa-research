package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class j5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21766a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f21767b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21768c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21769d;

    /* renamed from: e, reason: collision with root package name */
    private String f21770e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21771f;

    public j5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f21766a;
    }

    public String c() {
        return this.f21767b;
    }

    public boolean d() {
        return this.f21771f;
    }

    public j5(String str, com.applovin.impl.sdk.k kVar, boolean z2) {
        this(str, kVar, z2, null);
    }

    public Context a() {
        return this.f21769d;
    }

    public ScheduledFuture b(Thread thread, long j8) {
        if (j8 <= 0) {
            return null;
        }
        return this.f21766a.r0().b(new s6(this.f21766a, "timeout:" + this.f21767b, new W(this, thread, j8, 0)), e6.b.TIMEOUT, j8);
    }

    public j5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f21770e = str;
    }

    public j5(String str, com.applovin.impl.sdk.k kVar, boolean z2, String str2) {
        this.f21767b = str;
        this.f21766a = kVar;
        this.f21768c = kVar.O();
        this.f21769d = com.applovin.impl.sdk.k.o();
        this.f21771f = z2;
        this.f21770e = str2;
    }

    public void a(boolean z2) {
        this.f21771f = z2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f21767b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f21770e));
        this.f21766a.D().d(d2.f21301X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j8) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MediationMetaData.KEY_NAME, thread.getState().name());
        if (StringUtils.isValidString(this.f21770e)) {
            mapHashMap.put("details", this.f21770e);
        }
        this.f21766a.D().a(d2.f21303Y0, this.f21767b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.k(this.f21767b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j8) + " seconds");
        }
    }
}
