package com.bytedance.sdk.component.oa.uef;

import com.bytedance.sdk.component.xs.uef;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class dj implements Cloneable {
    public final uef.oa bcc;
    public long ivm;
    public TimeUnit lw;
    public long moa;

    /* renamed from: oa, reason: collision with root package name */
    public long f25057oa;
    public List<bcc> uef;
    public TimeUnit xs;
    public TimeUnit yo;

    public dj(uef uefVar) {
        this.f25057oa = uefVar.yo;
        this.moa = uefVar.lw;
        this.ivm = uefVar.xs;
        List<bcc> list = uefVar.uef;
        this.yo = uefVar.moa;
        this.lw = uefVar.ivm;
        this.xs = uefVar.bcc;
        this.uef = list;
        this.bcc = uefVar.f25058oa;
    }

    public abstract moa oa();

    public abstract oa uef(wrv wrvVar);

    public uef.oa uef() {
        return this.bcc;
    }

    public uef yo() {
        return new uef(this);
    }

    public static final class uef {
        public TimeUnit bcc;
        public TimeUnit ivm;
        public long lw;
        public TimeUnit moa;

        /* renamed from: oa, reason: collision with root package name */
        uef.oa f25058oa;
        public final List<bcc> uef;
        public long xs;
        public long yo;

        public uef() {
            this.uef = new ArrayList();
            this.yo = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.moa = timeUnit;
            this.lw = 10000L;
            this.ivm = timeUnit;
            this.xs = 10000L;
            this.bcc = timeUnit;
        }

        public uef oa(long j8, TimeUnit timeUnit) {
            this.lw = j8;
            this.ivm = timeUnit;
            return this;
        }

        public uef uef(long j8, TimeUnit timeUnit) {
            this.yo = j8;
            this.moa = timeUnit;
            return this;
        }

        public uef yo(long j8, TimeUnit timeUnit) {
            this.xs = j8;
            this.bcc = timeUnit;
            return this;
        }

        public uef uef(bcc bccVar) {
            this.uef.add(bccVar);
            return this;
        }

        public uef uef(uef.oa oaVar) {
            this.f25058oa = oaVar;
            return this;
        }

        public dj uef() {
            return com.bytedance.sdk.component.oa.uef.uef.uef.uef(this);
        }

        public uef(String str) {
            this.uef = new ArrayList();
            this.yo = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.moa = timeUnit;
            this.lw = 10000L;
            this.ivm = timeUnit;
            this.xs = 10000L;
            this.bcc = timeUnit;
        }

        public uef(dj djVar) {
            this.uef = new ArrayList();
            this.yo = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.moa = timeUnit;
            this.lw = 10000L;
            this.ivm = timeUnit;
            this.xs = 10000L;
            this.bcc = timeUnit;
            this.yo = djVar.f25057oa;
            this.moa = djVar.yo;
            this.lw = djVar.moa;
            this.ivm = djVar.lw;
            this.xs = djVar.ivm;
            this.bcc = djVar.xs;
        }
    }
}
